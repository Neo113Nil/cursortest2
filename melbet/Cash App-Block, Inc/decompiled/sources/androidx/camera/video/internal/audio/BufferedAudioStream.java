package androidx.camera.video.internal.audio;

import androidx.camera.core.impl.utils.executor.SequentialExecutor;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda14;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.room.TransactorKt;
import com.google.android.gms.measurement.internal.zzjv;
import com.squareup.cash.moneybot.genie.TextViewKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class BufferedAudioStream implements AudioStream {
    public AudioData mAudioDataNotFullyRead;
    public final AudioStreamImpl mAudioStream;
    public int mBufferSize;
    public final int mBytesPerFrame;
    public final AtomicBoolean mIsCollectingAudioData;
    public final Object mLock;
    public final SequentialExecutor mProducerExecutor;
    public final int mQueueMaxSize;
    public final int mSampleRate;
    public final AtomicBoolean mIsStarted = new AtomicBoolean(false);
    public final AtomicBoolean mIsReleased = new AtomicBoolean(false);
    public final LinkedBlockingQueue mAudioDataQueue = new LinkedBlockingQueue();

    public final class AudioData {
        public final ByteBuffer mByteBuffer;
        public final int mBytesPerFrame;
        public final int mSampleRate;
        public long mTimestampNs;

        public AudioData(ByteBuffer byteBuffer, AutoValue_AudioStream_PacketInfo autoValue_AudioStream_PacketInfo, int i, int i2) {
            byteBuffer.rewind();
            int limit = byteBuffer.limit() - byteBuffer.position();
            if (limit != autoValue_AudioStream_PacketInfo.sizeInBytes) {
                StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(limit, "Byte buffer size is not match with packet info: ", " != ");
                m2m.append(autoValue_AudioStream_PacketInfo.sizeInBytes);
                throw new IllegalStateException(m2m.toString());
            }
            this.mBytesPerFrame = i;
            this.mSampleRate = i2;
            this.mByteBuffer = byteBuffer;
            this.mTimestampNs = autoValue_AudioStream_PacketInfo.timestampNs;
        }
    }

    public BufferedAudioStream(AudioStreamImpl audioStreamImpl, AutoValue_AudioSettings autoValue_AudioSettings) {
        zzjv zzjvVar;
        if (zzjv.sExecutor != null) {
            zzjvVar = zzjv.sExecutor;
        } else {
            synchronized (zzjv.class) {
                try {
                    if (zzjv.sExecutor == null) {
                        zzjv.sExecutor = new zzjv();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzjvVar = zzjv.sExecutor;
        }
        this.mProducerExecutor = new SequentialExecutor(zzjvVar);
        this.mLock = new Object();
        this.mAudioDataNotFullyRead = null;
        this.mIsCollectingAudioData = new AtomicBoolean(false);
        this.mAudioStream = audioStreamImpl;
        int bytesPerFrame = autoValue_AudioSettings.getBytesPerFrame();
        this.mBytesPerFrame = bytesPerFrame;
        int i = autoValue_AudioSettings.captureSampleRate;
        this.mSampleRate = i;
        TransactorKt.checkArgument("mBytesPerFrame must be greater than 0.", ((long) bytesPerFrame) > 0);
        TransactorKt.checkArgument("mSampleRate must be greater than 0.", ((long) i) > 0);
        this.mQueueMaxSize = 500;
        this.mBufferSize = bytesPerFrame * 1024;
    }

    public final void checkNotReleasedOrThrow$1() {
        TransactorKt.checkState("AudioStream has been released.", !this.mIsReleased.get());
    }

    public final void collectAudioData() {
        AtomicBoolean atomicBoolean = this.mIsCollectingAudioData;
        if (atomicBoolean.get()) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.mBufferSize);
            AudioData audioData = new AudioData(allocateDirect, this.mAudioStream.read(allocateDirect), this.mBytesPerFrame, this.mSampleRate);
            LinkedBlockingQueue linkedBlockingQueue = this.mAudioDataQueue;
            if (!linkedBlockingQueue.offer(audioData)) {
                StringUtilsKt.w("BufferedAudioStream", "Failed to offer audio data to queue.");
            }
            while (linkedBlockingQueue.size() > this.mQueueMaxSize) {
                linkedBlockingQueue.poll();
                StringUtilsKt.w("BufferedAudioStream", "Drop audio data due to full of queue.");
            }
            if (atomicBoolean.get()) {
                this.mProducerExecutor.execute(new BufferedAudioStream$$ExternalSyntheticLambda0(this, 2));
            }
        }
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final AutoValue_AudioStream_PacketInfo read(ByteBuffer byteBuffer) {
        AudioData audioData;
        int remaining;
        checkNotReleasedOrThrow$1();
        TransactorKt.checkState("AudioStream has not been started.", this.mIsStarted.get());
        this.mProducerExecutor.execute(new Recorder$$ExternalSyntheticLambda14(this, byteBuffer.remaining(), 4));
        synchronized (this.mLock) {
            audioData = this.mAudioDataNotFullyRead;
            this.mAudioDataNotFullyRead = null;
        }
        if (audioData == null) {
            while (this.mIsStarted.get() && !this.mIsReleased.get()) {
                try {
                    audioData = (AudioData) this.mAudioDataQueue.poll(100L, TimeUnit.MILLISECONDS);
                    if (audioData != null) {
                        break;
                    }
                } catch (InterruptedException e) {
                    StringUtilsKt.w("BufferedAudioStream", "Interruption while waiting for audio data", e);
                    return new AutoValue_AudioStream_PacketInfo(0, 0L);
                }
            }
        }
        if (audioData == null) {
            return new AutoValue_AudioStream_PacketInfo(0, 0L);
        }
        long j = audioData.mTimestampNs;
        ByteBuffer byteBuffer2 = audioData.mByteBuffer;
        int position = byteBuffer2.position();
        int position2 = byteBuffer.position();
        if (byteBuffer2.remaining() > byteBuffer.remaining()) {
            remaining = byteBuffer.remaining();
            audioData.mTimestampNs += TextViewKt.frameCountToDurationNs(audioData.mSampleRate, TextViewKt.sizeToFrameCount(audioData.mBytesPerFrame, remaining));
            ByteBuffer duplicate = byteBuffer2.duplicate();
            duplicate.position(position).limit(position + remaining);
            byteBuffer.put(duplicate).limit(position2 + remaining).position(position2);
        } else {
            remaining = byteBuffer2.remaining();
            byteBuffer.put(byteBuffer2).limit(position2 + remaining).position(position2);
        }
        byteBuffer2.position(position + remaining);
        AutoValue_AudioStream_PacketInfo autoValue_AudioStream_PacketInfo = new AutoValue_AudioStream_PacketInfo(remaining, j);
        if (audioData.mByteBuffer.remaining() <= 0) {
            return autoValue_AudioStream_PacketInfo;
        }
        synchronized (this.mLock) {
            this.mAudioDataNotFullyRead = audioData;
        }
        return autoValue_AudioStream_PacketInfo;
    }

    public final void start() {
        checkNotReleasedOrThrow$1();
        AtomicBoolean atomicBoolean = this.mIsStarted;
        int i = 1;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new BufferedAudioStream$$ExternalSyntheticLambda0(this, i), null);
        this.mProducerExecutor.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e) {
            atomicBoolean.set(false);
            throw new AudioStream.AudioStreamException(e);
        }
    }
}
