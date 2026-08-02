package androidx.camera.core.processing;

import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;

/* loaded from: classes3.dex */
public final /* synthetic */ class SurfaceEdge$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SurfaceEdge f$0;

    public /* synthetic */ SurfaceEdge$$ExternalSyntheticLambda1(SurfaceEdge surfaceEdge, int i) {
        this.$r8$classId = i;
        this.f$0 = surfaceEdge;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        SurfaceEdge surfaceEdge = this.f$0;
        switch (i) {
            case 0:
                zzabp.mainThreadExecutor().execute(new SurfaceEdge$$ExternalSyntheticLambda1(surfaceEdge, 1));
                break;
            default:
                if (!surfaceEdge.mIsClosed) {
                    surfaceEdge.invalidate();
                    break;
                }
                break;
        }
    }
}
