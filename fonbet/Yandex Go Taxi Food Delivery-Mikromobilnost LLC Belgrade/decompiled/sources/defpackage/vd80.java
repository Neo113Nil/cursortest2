package defpackage;

import com.yandex.mapkit.map.Map;

/* loaded from: classes14.dex */
public final class vd80 implements Map.CameraCallback {
    public final /* synthetic */ kol0 a;

    public vd80(kol0 kol0Var) {
        this.a = kol0Var;
    }

    @Override // com.yandex.mapkit.map.Map.CameraCallback
    public final void onMoveFinished(boolean z) {
        this.a.resumeWith(Boolean.valueOf(z));
    }
}
