package defpackage;

import com.yandex.mapkit.map.Map;

/* loaded from: classes12.dex */
public final class uxr implements Map.CameraCallback {
    public final /* synthetic */ kol0 a;

    public uxr(kol0 kol0Var) {
        this.a = kol0Var;
    }

    @Override // com.yandex.mapkit.map.Map.CameraCallback
    public final void onMoveFinished(boolean z) {
        this.a.resumeWith(zy11.a);
    }
}
