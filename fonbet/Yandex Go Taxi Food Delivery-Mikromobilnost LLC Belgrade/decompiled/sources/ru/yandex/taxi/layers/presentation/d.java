package ru.yandex.taxi.layers.presentation;

import com.yandex.mapkit.map.CameraPosition;
import defpackage.ah00;
import defpackage.gh00;
import defpackage.lm00;
import defpackage.tls;
import defpackage.zy11;
import ru.yandex.taxi.map_common.map.process.MapComputationsProcessor$ExecuteOn;

/* loaded from: classes9.dex */
public final /* synthetic */ class d implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ d(f fVar, int i) {
        this.a = i;
        this.b = fVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        f fVar = this.b;
        switch (i) {
            case 0:
                fVar.F.a(MapComputationsProcessor$ExecuteOn.WORKER, new MapObjectsOverlay$availabilityListener$1$1(fVar, (lm00) obj, null));
                break;
            default:
                CameraPosition cameraPosition = fVar.Z;
                fVar.Z = null;
                if (cameraPosition != null && !cameraPosition.equals(((gh00) ((ah00) fVar.b)).e.c)) {
                    fVar.F.a(MapComputationsProcessor$ExecuteOn.WORKER, new MapObjectsOverlay$onCameraChange$1(fVar, cameraPosition, null));
                }
                break;
        }
        return zy11.a;
    }
}
