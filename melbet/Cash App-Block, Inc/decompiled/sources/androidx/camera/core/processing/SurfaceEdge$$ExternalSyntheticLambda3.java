package androidx.camera.core.processing;

import com.braze.ui.contentcards.adapters.ContentCardAdapter;

/* loaded from: classes3.dex */
public final /* synthetic */ class SurfaceEdge$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ SurfaceEdge$$ExternalSyntheticLambda3(int i, int i2, ContentCardAdapter contentCardAdapter) {
        this.f$1 = i;
        this.f$2 = i2;
        this.f$0 = contentCardAdapter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        int i2 = this.f$2;
        int i3 = this.f$1;
        switch (i) {
            case 0:
                SurfaceEdge surfaceEdge = (SurfaceEdge) obj;
                boolean z2 = true;
                if (surfaceEdge.mRotationDegrees != i3) {
                    surfaceEdge.mRotationDegrees = i3;
                    z = true;
                } else {
                    z = false;
                }
                if (surfaceEdge.mTargetRotation != i2) {
                    surfaceEdge.mTargetRotation = i2;
                } else {
                    z2 = z;
                }
                if (z2) {
                    surfaceEdge.notifyTransformationInfoUpdate();
                    break;
                }
                break;
            default:
                ContentCardAdapter.markOnScreenCardsAsRead$lambda$2(i3, i2, (ContentCardAdapter) obj);
                break;
        }
    }

    public /* synthetic */ SurfaceEdge$$ExternalSyntheticLambda3(SurfaceEdge surfaceEdge, int i, int i2) {
        this.f$0 = surfaceEdge;
        this.f$1 = i;
        this.f$2 = i2;
    }
}
