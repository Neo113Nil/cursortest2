package androidx.camera.video.internal.audio;

import androidx.camera.video.internal.audio.AudioStream;
import androidx.camera.video.internal.audio.AudioStreamImpl;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import bo.app.a$$ExternalSyntheticBUOutline0;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class BufferedAudioStream$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BufferedAudioStream f$0;

    public /* synthetic */ BufferedAudioStream$$ExternalSyntheticLambda0(BufferedAudioStream bufferedAudioStream, int i) {
        this.$r8$classId = i;
        this.f$0 = bufferedAudioStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        BufferedAudioStream bufferedAudioStream = this.f$0;
        switch (i) {
            case 0:
                bufferedAudioStream.mIsCollectingAudioData.set(false);
                AudioStreamImpl audioStreamImpl = bufferedAudioStream.mAudioStream;
                audioStreamImpl.checkNotReleasedOrThrow();
                if (audioStreamImpl.mIsStarted.getAndSet(false)) {
                    audioStreamImpl.mAudioRecord.stop();
                    if (audioStreamImpl.mAudioRecord.getRecordingState() != 1) {
                        StringUtilsKt.w("AudioStreamImpl", "Failed to stop AudioRecord with state: " + audioStreamImpl.mAudioRecord.getRecordingState());
                    }
                    if (DeviceQuirks.sQuirks.get(AudioTimestampFramePositionIncorrectQuirk.class) != null) {
                        audioStreamImpl.mAudioRecord.release();
                        audioStreamImpl.mAudioRecord = AudioStreamImpl.createAudioRecord(audioStreamImpl.mBufferSize, audioStreamImpl.mSettings, null);
                    }
                }
                bufferedAudioStream.mAudioDataQueue.clear();
                synchronized (bufferedAudioStream.mLock) {
                    bufferedAudioStream.mAudioDataNotFullyRead = null;
                }
                return;
            case 1:
                try {
                    bufferedAudioStream.mAudioStream.start();
                    if (bufferedAudioStream.mIsCollectingAudioData.getAndSet(true)) {
                        return;
                    }
                    bufferedAudioStream.collectAudioData();
                    return;
                } catch (AudioStream.AudioStreamException e) {
                    a$$ExternalSyntheticBUOutline0.m((Throwable) e);
                    return;
                }
            case 2:
                bufferedAudioStream.collectAudioData();
                return;
            default:
                bufferedAudioStream.mIsCollectingAudioData.set(false);
                AudioStreamImpl audioStreamImpl2 = bufferedAudioStream.mAudioStream;
                if (!audioStreamImpl2.mIsReleased.getAndSet(true)) {
                    AudioStreamImpl.AudioRecordingApi29Callback audioRecordingApi29Callback = audioStreamImpl2.mAudioRecordingCallback;
                    if (audioRecordingApi29Callback != null) {
                        audioStreamImpl2.mAudioRecord.unregisterAudioRecordingCallback(audioRecordingApi29Callback);
                    }
                    audioStreamImpl2.mAudioRecord.release();
                }
                bufferedAudioStream.mAudioDataQueue.clear();
                synchronized (bufferedAudioStream.mLock) {
                    bufferedAudioStream.mAudioDataNotFullyRead = null;
                }
                return;
        }
    }
}
