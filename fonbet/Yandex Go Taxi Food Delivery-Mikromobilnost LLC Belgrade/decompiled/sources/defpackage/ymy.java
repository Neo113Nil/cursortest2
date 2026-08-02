package defpackage;

import com.yandex.mapkit.map.Map;

/* loaded from: classes5.dex */
public final class ymy implements Map.CameraCallback {
    public tls a;

    @Override // com.yandex.mapkit.map.Map.CameraCallback
    public final void onMoveFinished(boolean z) {
        this.a.invoke(Boolean.valueOf(z));
    }
}
