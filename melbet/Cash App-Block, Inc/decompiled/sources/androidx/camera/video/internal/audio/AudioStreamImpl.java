package androidx.camera.video.internal.audio;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.os.Build;
import androidx.camera.core.impl.utils.executor.SequentialExecutor;
import androidx.camera.video.Recorder;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.core.view.DisplayCompat;
import androidx.room.TransactorKt;
import com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda10;
import com.squareup.cash.moneybot.genie.TextViewKt;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okio.Path$$ExternalSyntheticBUOutline0;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class AudioStreamImpl implements AudioStream {
    public AudioRecord mAudioRecord;
    public AudioRecordingApi29Callback mAudioRecordingCallback;
    public Recorder.AnonymousClass2 mAudioStreamCallback;
    public final int mBufferSize;
    public final int mBytesPerFrame;
    public SequentialExecutor mCallbackExecutor;
    public final AutoValue_AudioSettings mSettings;
    public long mTotalFramesRead;
    public final AtomicBoolean mIsReleased = new AtomicBoolean(false);
    public final AtomicBoolean mIsStarted = new AtomicBoolean(false);
    public final AtomicReference mNotifiedSilenceState = new AtomicReference(null);
    public boolean mShouldFallbackToSystemTime = false;

    public final class AudioRecordingApi29Callback extends AudioManager.AudioRecordingCallback {
        public AudioRecordingApi29Callback() {
        }

        @Override // android.media.AudioManager.AudioRecordingCallback
        public final void onRecordingConfigChanged(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AudioRecordingConfiguration audioRecordingConfiguration = (AudioRecordingConfiguration) it.next();
                int clientAudioSessionId = audioRecordingConfiguration.getClientAudioSessionId();
                AudioStreamImpl audioStreamImpl = AudioStreamImpl.this;
                if (clientAudioSessionId == audioStreamImpl.mAudioRecord.getAudioSessionId()) {
                    audioStreamImpl.notifySilenced(audioRecordingConfiguration.isClientSilenced());
                    return;
                }
            }
        }
    }

    public AudioStreamImpl(AutoValue_AudioSettings autoValue_AudioSettings, Context context) {
        int i = autoValue_AudioSettings.captureSampleRate;
        int i2 = autoValue_AudioSettings.channelCount;
        int i3 = autoValue_AudioSettings.audioFormat;
        if (i > 0 && i2 > 0) {
            if (AudioRecord.getMinBufferSize(i, i2 == 1 ? 16 : 12, i3) > 0) {
                try {
                    new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2 == 1 ? 16 : 12).setEncoding(i3).build();
                    this.mSettings = autoValue_AudioSettings;
                    this.mBytesPerFrame = autoValue_AudioSettings.getBytesPerFrame();
                    int minBufferSize = AudioRecord.getMinBufferSize(i, i2 == 1 ? 16 : 12, i3);
                    TransactorKt.checkState(null, minBufferSize > 0);
                    int i4 = minBufferSize * 2;
                    this.mBufferSize = i4;
                    AudioRecord createAudioRecord = createAudioRecord(i4, autoValue_AudioSettings, context);
                    this.mAudioRecord = createAudioRecord;
                    if (createAudioRecord.getState() == 1) {
                        return;
                    }
                    createAudioRecord.release();
                    throw new AudioStream.AudioStreamException("Unable to initialize AudioRecord");
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public static AudioRecord createAudioRecord(int i, AutoValue_AudioSettings autoValue_AudioSettings, Context context) {
        AudioFormat build = new AudioFormat.Builder().setSampleRate(autoValue_AudioSettings.captureSampleRate).setChannelMask(autoValue_AudioSettings.channelCount == 1 ? 16 : 12).setEncoding(autoValue_AudioSettings.audioFormat).build();
        AudioRecord.Builder builder = new AudioRecord.Builder();
        if (Build.VERSION.SDK_INT >= 31 && context != null) {
            DisplayCompat.setContext(builder, context);
        }
        builder.setAudioSource(autoValue_AudioSettings.audioSource);
        builder.setAudioFormat(build);
        builder.setBufferSizeInBytes(i);
        try {
            return builder.build();
        } catch (UnsupportedOperationException e) {
            Path$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    public final void checkNotReleasedOrThrow() {
        TransactorKt.checkState("AudioStream has been released.", !this.mIsReleased.get());
    }

    public final void notifySilenced(boolean z) {
        SequentialExecutor sequentialExecutor = this.mCallbackExecutor;
        Recorder.AnonymousClass2 anonymousClass2 = this.mAudioStreamCallback;
        if (sequentialExecutor == null || anonymousClass2 == null || Objects.equals(this.mNotifiedSilenceState.getAndSet(Boolean.valueOf(z)), Boolean.valueOf(z))) {
            return;
        }
        sequentialExecutor.execute(new LottieCompositionFactory$$ExternalSyntheticLambda10(anonymousClass2, z, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    @Override // androidx.camera.video.internal.audio.AudioStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AutoValue_AudioStream_PacketInfo read(ByteBuffer byteBuffer) {
        checkNotReleasedOrThrow();
        TransactorKt.checkState("AudioStream has not been started.", this.mIsStarted.get());
        int read = this.mAudioRecord.read(byteBuffer, this.mBufferSize);
        if (read > 0) {
            byteBuffer.limit(read);
            if (!this.mShouldFallbackToSystemTime) {
                AudioTimestamp audioTimestamp = new AudioTimestamp();
                if (this.mAudioRecord.getTimestamp(audioTimestamp, 0) == 0) {
                    int i = this.mSettings.captureSampleRate;
                    long j = this.mTotalFramesRead;
                    TransactorKt.checkArgument("sampleRate must be greater than 0.", ((long) i) > 0);
                    TransactorKt.checkArgument("framePosition must be no less than 0.", j >= 0);
                    long frameCountToDurationNs = audioTimestamp.nanoTime + TextViewKt.frameCountToDurationNs(i, j - audioTimestamp.framePosition);
                    r1 = frameCountToDurationNs >= 0 ? frameCountToDurationNs : 0L;
                    if (Math.abs(r1 - System.nanoTime()) > 500000000) {
                        this.mShouldFallbackToSystemTime = true;
                    }
                    if (r1 == -1) {
                        r1 = System.nanoTime();
                    }
                    this.mTotalFramesRead = TextViewKt.sizeToFrameCount(this.mBytesPerFrame, read) + this.mTotalFramesRead;
                } else {
                    StringUtilsKt.w("AudioStreamImpl", "Unable to get audio timestamp");
                }
            }
            r1 = -1;
            if (r1 == -1) {
            }
            this.mTotalFramesRead = TextViewKt.sizeToFrameCount(this.mBytesPerFrame, read) + this.mTotalFramesRead;
        }
        return new AutoValue_AudioStream_PacketInfo(read, r1);
    }

    public final void start() {
        checkNotReleasedOrThrow();
        AtomicBoolean atomicBoolean = this.mIsStarted;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        if (DeviceQuirks.sQuirks.get(AudioTimestampFramePositionIncorrectQuirk.class) != null) {
            AudioRecord audioRecord = this.mAudioRecord;
            if (audioRecord.getState() != 1) {
                audioRecord.release();
                throw new AudioStream.AudioStreamException("Unable to initialize AudioRecord");
            }
        }
        this.mAudioRecord.startRecording();
        if (this.mAudioRecord.getRecordingState() != 3) {
            atomicBoolean.set(false);
            throw new AudioStream.AudioStreamException("Unable to start AudioRecord with state: " + this.mAudioRecord.getRecordingState());
        }
        this.mTotalFramesRead = 0L;
        this.mShouldFallbackToSystemTime = false;
        this.mNotifiedSilenceState.set(null);
        AudioRecordingConfiguration activeRecordingConfiguration = this.mAudioRecord.getActiveRecordingConfiguration();
        notifySilenced(activeRecordingConfiguration != null && activeRecordingConfiguration.isClientSilenced());
    }
}
