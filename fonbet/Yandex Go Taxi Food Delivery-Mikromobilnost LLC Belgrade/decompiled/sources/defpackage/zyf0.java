package defpackage;

import com.yandex.mapkit.map.Map;

/* loaded from: classes5.dex */
public final class zyf0 implements Map.CameraCallback {
    public final /* synthetic */ j18 a;

    public zyf0(j18 j18Var) {
        this.a = j18Var;
    }

    @Override // com.yandex.mapkit.map.Map.CameraCallback
    public final void onMoveFinished(boolean z) {
        this.a.resumeWith(zy11.a);
    }
}
