package ru.yandex.taxi.layers.presentation;

import com.yandex.mapkit.map.CameraPosition;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.map_common.map.process.MapComputationsProcessor$ExecuteOn;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class MapObjectsOverlay$throttle$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        f fVar = (f) this.receiver;
        fVar.F.a(MapComputationsProcessor$ExecuteOn.WORKER, new MapObjectsOverlay$onCameraChange$1(fVar, (CameraPosition) obj, null));
        return zy11.a;
    }
}
