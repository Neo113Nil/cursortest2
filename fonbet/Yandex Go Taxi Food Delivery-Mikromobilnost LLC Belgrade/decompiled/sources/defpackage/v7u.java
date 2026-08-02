package defpackage;

import com.yandex.go.experiments.zoneinfo.ZoneAnticrisisRequestHeadersExperiment;
import com.yandex.go.taxi.order.provider.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.sequences.b;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes9.dex */
public final class v7u implements p8w {
    public final n20 a;
    public final y7u b;
    public final hem c;
    public final t1b0 d;

    public v7u(n20 n20Var, y7u y7uVar, hem hemVar, rqo rqoVar) {
        this.a = n20Var;
        this.b = y7uVar;
        this.c = hemVar;
        this.d = ((jbh) rqoVar).e(ZoneAnticrisisRequestHeadersExperiment.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.ArrayList] */
    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        ?? r7;
        d5j0 d5j0Var;
        List list;
        String str;
        ZoneAnticrisisRequestHeadersExperiment zoneAnticrisisRequestHeadersExperiment = (ZoneAnticrisisRequestHeadersExperiment) this.d.c();
        boolean z = false;
        boolean z2 = zoneAnticrisisRequestHeadersExperiment.b && zoneAnticrisisRequestHeadersExperiment.d;
        y7u y7uVar = this.b;
        y7uVar.getClass();
        String m = b.m(b.g(new yw01(y7u.b, new d8(29, y7uVar)), new p0u(1)), ",", null, 62);
        StringBuilder sb = new StringBuilder();
        List l = ((a) this.a).l();
        HashMap hashMap = new HashMap();
        Iterator it = l.iterator();
        while (it.hasNext()) {
            String driveState = ((o2y0) it.next()).b().h.getB().toString();
            Integer num = (Integer) hashMap.get(driveState);
            hashMap.put(driveState, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            if (sb.length() > 0) {
                sb.append(HexString.CHAR_COMMA);
            }
            sb.append("taxi=");
            sb.append(str2);
            sb.append('@');
            sb.append(intValue);
        }
        jnt jntVar = (jnt) ((r0) this.c.a.b()).getValue();
        if (jntVar == null || (list = jntVar.a) == null) {
            r7 = EmptyList.a;
        } else {
            List list2 = list;
            r7 = new ArrayList(tcc.n(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                switch (gem.a[((fnt) it2.next()).h().ordinal()]) {
                    case 1:
                        str = "reservation_free";
                        break;
                    case 2:
                        str = "reservation_paid";
                        break;
                    case 3:
                        str = "acceptance_free";
                        break;
                    case 4:
                        str = "acceptance_paid";
                        break;
                    case 5:
                        str = "unrecognized";
                        break;
                    case 6:
                        str = "parking";
                        break;
                    case 7:
                        str = "riding";
                        break;
                    default:
                        w511.b();
                        return null;
                }
                r7.add(str);
            }
        }
        for (String str3 : (Iterable) r7) {
            if (sb.length() > 0) {
                sb.append(HexString.CHAR_COMMA);
            }
            sb.append("drive=");
            sb.append(str3);
            sb.append('@');
            sb.append(1);
        }
        if (m.length() > 0) {
            if (sb.length() > 0) {
                sb.append(HexString.CHAR_COMMA);
            }
            sb.append(m);
        }
        String sb2 = sb.toString();
        if (sb2.length() == 0) {
            sb2 = "none";
        }
        if (z2) {
            t4j0 b = ((zci0) m8wVar).e.b();
            if (!((a) this.a).r() && !this.c.a.c()) {
                y7u y7uVar2 = this.b;
                y7uVar2.getClass();
                Iterator it3 = y7u.c.iterator();
                while (it3.hasNext()) {
                    if (y7uVar2.a.f((String) it3.next())) {
                    }
                }
                b.c.a("X-YaTaxi-Has-Ongoing-Orders", String.valueOf(z));
                b.c.a("X-YaTaxi-Ongoing-Orders-Statuses", sb2);
                d5j0Var = new d5j0(b);
            }
            z = true;
            b.c.a("X-YaTaxi-Has-Ongoing-Orders", String.valueOf(z));
            b.c.a("X-YaTaxi-Ongoing-Orders-Statuses", sb2);
            d5j0Var = new d5j0(b);
        } else {
            d5j0Var = ((zci0) m8wVar).e;
        }
        return ((zci0) m8wVar).b(d5j0Var);
    }
}
