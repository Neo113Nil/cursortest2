package androidx.camera.core.imagecapture;

/* loaded from: classes3.dex */
public final /* synthetic */ class TakePictureManagerImpl$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TakePictureManagerImpl f$0;

    public /* synthetic */ TakePictureManagerImpl$$ExternalSyntheticLambda0(TakePictureManagerImpl takePictureManagerImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = takePictureManagerImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        TakePictureManagerImpl takePictureManagerImpl = this.f$0;
        switch (i) {
            case 0:
                takePictureManagerImpl.mCapturingRequest = null;
                takePictureManagerImpl.issueNextRequest();
                break;
            default:
                takePictureManagerImpl.issueNextRequest();
                break;
        }
    }
}
