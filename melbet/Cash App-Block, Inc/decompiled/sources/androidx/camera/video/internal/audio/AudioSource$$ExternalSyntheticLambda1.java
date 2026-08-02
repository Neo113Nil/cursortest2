package androidx.camera.video.internal.audio;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final /* synthetic */ class AudioSource$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AudioSource f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ AudioSource$$ExternalSyntheticLambda1(AudioSource audioSource, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = audioSource;
        this.f$1 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        int i2 = 1;
        boolean z = this.f$1;
        AudioSource audioSource = this.f$0;
        switch (i) {
            case 0:
                int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(audioSource.mState);
                if (ordinal == 0) {
                    audioSource.mNotifiedSilenceState.set(null);
                    audioSource.mNotifiedSuspendState.set(false);
                    audioSource.setState(2);
                    audioSource.mExecutor.execute(new AudioSource$$ExternalSyntheticLambda1(audioSource, z, i2));
                    audioSource.updateSendingAudio();
                    break;
                } else if (ordinal == 2) {
                    a$$ExternalSyntheticBUOutline0.m$1((Object) "AudioSource is released");
                    break;
                }
                break;
            default:
                int ordinal2 = CameraSelector$$ExternalSyntheticOutline0.ordinal(audioSource.mState);
                if (ordinal2 != 0 && ordinal2 != 1) {
                    if (ordinal2 == 2) {
                        a$$ExternalSyntheticBUOutline0.m$1((Object) "AudioSource is released");
                        break;
                    }
                } else if (audioSource.mMuted != z) {
                    audioSource.mMuted = z;
                    if (audioSource.mState == 2) {
                        audioSource.notifySilenced();
                        break;
                    }
                }
                break;
        }
    }
}
