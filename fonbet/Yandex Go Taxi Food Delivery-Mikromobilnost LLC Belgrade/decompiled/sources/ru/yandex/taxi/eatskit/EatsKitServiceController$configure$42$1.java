package ru.yandex.taxi.eatskit;

import defpackage.ck7;
import defpackage.cvu0;
import defpackage.ebt;
import defpackage.gcn;
import defpackage.gw00;
import defpackage.hbt;
import defpackage.odn;
import defpackage.tcc;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.eatskit.dto.GrantResult;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class EatsKitServiceController$configure$42$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        gcn gcnVar = (gcn) obj2;
        odn odnVar = (odn) this.receiver;
        odnVar.getClass();
        Iterable iterable = ((ebt) obj).a;
        if (iterable == null) {
            iterable = EmptyList.a;
        }
        Iterable iterable2 = iterable;
        int d = gw00.d(tcc.n(iterable2, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Object obj3 : iterable2) {
            String str = (String) obj3;
            if (!cvu0.x(str, "android.permission.", false)) {
                str = "android.permission.".concat(str);
            }
            linkedHashMap.put(obj3, ((com.yandex.go.permission.b) odnVar.b).b(str) ? GrantResult.GRANTED : odnVar.a(str));
        }
        gcnVar.a(new ck7(new hbt(linkedHashMap), null));
        return zy11.a;
    }
}
