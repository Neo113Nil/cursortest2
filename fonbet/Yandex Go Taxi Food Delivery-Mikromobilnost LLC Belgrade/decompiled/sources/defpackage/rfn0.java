package defpackage;

import com.yandex.mapkit.map.Map;

/* loaded from: classes6.dex */
public final class rfn0 implements Map.CameraCallback {
    public final /* synthetic */ j18 a;

    public rfn0(j18 j18Var) {
        this.a = j18Var;
    }

    @Override // com.yandex.mapkit.map.Map.CameraCallback
    public final void onMoveFinished(boolean z) {
        j18 j18Var = this.a;
        if (j18Var.t() instanceof mf60) {
            j18Var.resumeWith(zy11.a);
        }
    }
}
