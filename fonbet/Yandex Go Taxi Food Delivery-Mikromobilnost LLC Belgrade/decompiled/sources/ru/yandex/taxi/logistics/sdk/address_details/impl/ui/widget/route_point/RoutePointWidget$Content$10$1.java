package ru.yandex.taxi.logistics.sdk.address_details.impl.ui.widget.route_point;

import defpackage.ds0;
import defpackage.ps0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.logistics.sdk.address_details.impl.ui.e;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class RoutePointWidget$Content$10$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        e eVar = (e) this.receiver;
        String str = ((ps0) eVar.B.a.getValue()).g;
        ds0 ds0Var = eVar.w;
        ds0Var.getClass();
        boolean z = intValue == 0;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("type", z ? "source" : "destination");
        if (!z) {
            mapBuilder.put("point_b_index", Integer.valueOf(intValue));
        }
        ds0Var.c("Comment.Tapped", str, mapBuilder.j());
        return zy11.a;
    }
}
