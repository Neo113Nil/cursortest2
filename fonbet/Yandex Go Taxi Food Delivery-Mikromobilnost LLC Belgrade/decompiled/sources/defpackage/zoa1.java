package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.analytics.ApplicationAnalytics$OrderAddressActionV4;
import com.yandex.go.analytics.ApplicationAnalytics$OrderAddressMethodV4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes5.dex */
public abstract class zoa1 {
    public static final void a(final CharSequence charSequence, final f530 f530Var, final float f, final boolean z, long j, long j2, long j3, final tls tlsVar, fid fidVar, final int i) {
        final long j4;
        final long j5;
        bts btsVar;
        final long j6;
        long g;
        long f2;
        long n;
        Pair pair;
        long j7;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(848135787);
        int i2 = i | (btsVar2.e(charSequence) ? 4 : 2) | (btsVar2.k(f530Var) ? 32 : 16) | (btsVar2.b(f) ? 256 : 128) | (btsVar2.a(z) ? 2048 : 1024) | 598016 | (btsVar2.e(tlsVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC);
        if (btsVar2.V(i2 & 1, (4793491 & i2) != 4793490)) {
            btsVar2.a0();
            if ((i & 1) == 0 || btsVar2.C()) {
                a7u0 a7u0Var = gl51.a;
                g = ((el51) btsVar2.m(a7u0Var)).g();
                f2 = ((el51) btsVar2.m(a7u0Var)).f();
                n = ((el51) btsVar2.m(a7u0Var)).n();
            } else {
                btsVar2.Y();
                g = j;
                f2 = j2;
                n = j3;
            }
            btsVar2.u();
            f530 n2 = ljs0.n(r5a1.w(m4m0.b(ymb1.l(f530Var, cyk0.c(100.0f)), z ? g : f2, qke.q), z, false, new awk0(1), tlsVar, 10), f, 32.0f);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d2 = b.d(btsVar2, n2);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, d);
            qje.W(btsVar2, d.e, o);
            wls wlsVar = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar);
            }
            qje.W(btsVar2, d.d, d2);
            if (z) {
                btsVar2.e0(1284680390);
                pair = new Pair(mt71.m(wzg0.ic_checkmark, 0, btsVar2), null);
                btsVar2.t(false);
            } else {
                btsVar2.e0(1284682727);
                btsVar2.t(false);
                pair = new Pair(null, charSequence);
            }
            pa90 pa90Var = (pa90) pair.getFirst();
            CharSequence charSequence2 = (CharSequence) pair.getSecond();
            if (pa90Var == null) {
                btsVar2.e0(1170520440);
                btsVar2.t(false);
                j7 = n;
            } else {
                btsVar2.e0(1170520441);
                q4v.b(pa90Var, null, ljs0.m(c530.a, 20.0f), n, btsVar2, 432, 0);
                j7 = n;
                btsVar2.t(false);
            }
            if (charSequence2 == null) {
                btsVar2.e0(1170745593);
                btsVar2.t(false);
            } else {
                btsVar2.e0(1170745594);
                zgb1.a(charSequence2, null, 0, false, null, null, false, null, btsVar2, 0, 254);
                btsVar2 = btsVar2;
                btsVar2.t(false);
            }
            btsVar2.t(true);
            btsVar = btsVar2;
            j4 = g;
            j5 = f2;
            j6 = j7;
        } else {
            btsVar2.Y();
            j4 = j;
            j5 = j2;
            btsVar = btsVar2;
            j6 = j3;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(charSequence, f530Var, f, z, j4, j5, j6, tlsVar, i) { // from class: d3k0
                public final /* synthetic */ tls A;
                public final /* synthetic */ CharSequence a;
                public final /* synthetic */ f530 b;
                public final /* synthetic */ float c;
                public final /* synthetic */ boolean w;
                public final /* synthetic */ long x;
                public final /* synthetic */ long y;
                public final /* synthetic */ long z;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(1);
                    zoa1.a(this.a, this.b, this.c, this.w, this.x, this.y, this.z, this.A, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final ApplicationAnalytics$OrderAddressActionV4 b(String str) {
        Object obj;
        Iterator<E> it = ApplicationAnalytics$OrderAddressActionV4.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((ApplicationAnalytics$OrderAddressActionV4) obj).getEventValue(), str)) {
                break;
            }
        }
        return (ApplicationAnalytics$OrderAddressActionV4) obj;
    }

    public static final ApplicationAnalytics$OrderAddressMethodV4 c(String str) {
        Object obj;
        Iterator<E> it = ApplicationAnalytics$OrderAddressMethodV4.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((ApplicationAnalytics$OrderAddressMethodV4) obj).getEventValue(), str)) {
                break;
            }
        }
        return (ApplicationAnalytics$OrderAddressMethodV4) obj;
    }

    public static kfr d(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        b6w m = y6i0.m(y6i0.n(0, arrayList.size()), 1);
        int i2 = m.a;
        int i3 = m.b;
        int i4 = m.c;
        if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
            while (true) {
                for (Map.Entry entry : ((jfr) arrayList.get(i2)).d.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) linkedHashMap.get(str);
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(Integer.valueOf(i2));
                    linkedHashMap.put(str, list);
                }
                if (i2 == i3) {
                    break;
                }
                i2 += i4;
            }
        }
        List L0 = a.L0(a.M0(linkedHashMap.values()));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : L0) {
            if (((List) obj).size() > 1) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3 = lu91.a((List) it.next(), arrayList3);
        }
        nj51 nj51Var = new nj51(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            int i5 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            if (!nj51Var.a.contains(Integer.valueOf(i))) {
                arrayList4.add(obj2);
            }
            i = i5;
        }
        ArrayList arrayList5 = new ArrayList(arrayList4);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            jfr jfrVar = (jfr) it2.next();
            for (Map.Entry entry2 : jfrVar.d.entrySet()) {
                Object value = entry2.getValue();
                linkedHashMap2.put((String) entry2.getKey(), new lfr(jfrVar.b, jfrVar.c, (y3x) value));
            }
        }
        return new kfr(linkedHashMap2);
    }

    public static void e(int i) {
        boolean z = true;
        if (i != 100 && i != 102 && i != 104) {
            if (i == 105) {
                i = 105;
            } else {
                z = false;
            }
        }
        cvw.f(z, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i));
    }

    public static String f(int i) {
        if (i == 100) {
            return "HIGH_ACCURACY";
        }
        if (i == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i == 104) {
            return "LOW_POWER";
        }
        if (i == 105) {
            return "PASSIVE";
        }
        w511.q();
        return null;
    }
}
