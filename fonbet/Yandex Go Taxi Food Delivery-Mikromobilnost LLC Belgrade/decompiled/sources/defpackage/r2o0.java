package defpackage;

import com.yandex.mapkit.map.Map;

/* loaded from: classes13.dex */
public final class r2o0 implements Map.CameraCallback {
    public final /* synthetic */ j18 a;

    public r2o0(j18 j18Var) {
        this.a = j18Var;
    }

    @Override // com.yandex.mapkit.map.Map.CameraCallback
    public final void onMoveFinished(boolean z) {
        if (z) {
            j18 j18Var = this.a;
            if (j18Var.t() instanceof mf60) {
                j18Var.resumeWith(zy11.a);
            }
        }
    }
}
