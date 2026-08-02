package defpackage;

import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.map.CameraPosition;
import java.util.List;
import java.util.function.Function;
import ru.yandex.taxi.map.utils.a;

/* loaded from: classes9.dex */
public final class wt00 {
    public final ah00 a;

    public wt00(ah00 ah00Var) {
        this.a = ah00Var;
    }

    public final void a(zzs zzsVar, zzs zzsVar2, List list) {
        if (zzsVar == null || zzsVar2 == null) {
            return;
        }
        BoundingBox e = a.e(0, kotlin.collections.a.m0(list, scc.g(cwa1.d(zzsVar), cwa1.d(zzsVar2))));
        double d = (srb1.d(zzsVar, zzsVar2) * (-0.006d)) + 17.87d;
        if (d > 16.0d) {
            d = 16.0d;
        }
        final float f = (float) d;
        ((gh00) this.a).B(e, null, 800.0f, new Function() { // from class: vt00
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                CameraPosition cameraPosition = (CameraPosition) obj;
                return new CameraPosition(cameraPosition.getTarget(), Math.max(f, cameraPosition.getZoom()), cameraPosition.getAzimuth(), cameraPosition.getTilt());
            }
        });
    }
}
