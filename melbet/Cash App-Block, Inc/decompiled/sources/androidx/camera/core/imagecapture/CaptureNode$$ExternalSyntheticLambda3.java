package androidx.camera.core.imagecapture;

import net.oneformapp.ProfileStore_;

/* loaded from: classes3.dex */
public final /* synthetic */ class CaptureNode$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ProfileStore_ f$0;

    public /* synthetic */ CaptureNode$$ExternalSyntheticLambda3(ProfileStore_ profileStore_, int i) {
        this.$r8$classId = i;
        this.f$0 = profileStore_;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        ProfileStore_ profileStore_ = this.f$0;
        switch (i) {
            case 0:
                profileStore_.safeClose();
                break;
            case 1:
                profileStore_.safeClose();
                break;
            case 2:
                profileStore_.safeClose();
                break;
            case 3:
                if (profileStore_ != null) {
                    profileStore_.safeClose();
                    break;
                }
                break;
            default:
                if (profileStore_ != null) {
                    profileStore_.safeClose();
                    break;
                }
                break;
        }
    }
}
