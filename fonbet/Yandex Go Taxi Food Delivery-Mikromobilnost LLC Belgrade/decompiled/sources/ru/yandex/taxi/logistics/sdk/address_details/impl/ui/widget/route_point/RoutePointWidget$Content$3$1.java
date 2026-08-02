package ru.yandex.taxi.logistics.sdk.address_details.impl.ui.widget.route_point;

import defpackage.dms;
import defpackage.ds0;
import defpackage.dyq;
import defpackage.f4l0;
import defpackage.hyq;
import defpackage.ita1;
import defpackage.ps0;
import defpackage.qv0;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.logistics.sdk.address_details.impl.ui.e;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class RoutePointWidget$Content$3$1 extends FunctionReferenceImpl implements dms {
    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        qv0 qv0Var;
        int intValue = ((Number) obj).intValue();
        String str = (String) obj2;
        hyq hyqVar = (hyq) obj3;
        String str2 = (String) obj4;
        String str3 = (String) obj5;
        e eVar = (e) this.receiver;
        f4l0 f4l0Var = eVar.c;
        if (str2 != null) {
            eVar.b.B.invoke(str2, str);
        } else {
            f4l0Var.c(hyqVar, str, intValue);
            if (!(hyqVar instanceof dyq) && (qv0Var = (qv0) kotlin.collections.a.S(intValue, f4l0Var.getRoute().a)) != null) {
                ds0 ds0Var = eVar.w;
                if (str3 == null) {
                    str3 = ((ps0) eVar.B.a.getValue()).g;
                }
                ds0Var.getClass();
                if (str3 != null) {
                    boolean z = intValue == 0;
                    String concat = str3.concat(".AddressChanged");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.putAll(ita1.e(qv0Var));
                    linkedHashMap.put("type", z ? "source" : "destination");
                    if (!z) {
                        linkedHashMap.put("point_b_index", Integer.valueOf(intValue));
                    }
                    ds0Var.a.a.o(concat, null, linkedHashMap);
                }
            }
        }
        return zy11.a;
    }
}
