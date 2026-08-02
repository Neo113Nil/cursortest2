package defpackage;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.s;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.yandex.div.core.expression.variables.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class tms implements ams, ese, ae60, ht90, qef0, pa01, vm11, e1d, ga91 {
    public final /* synthetic */ int a;
    public static final /* synthetic */ tms b = new tms(15);
    public static final /* synthetic */ tms c = new tms(16);
    public static final /* synthetic */ tms w = new tms(17);
    public static final /* synthetic */ tms x = new tms(18);
    public static final /* synthetic */ tms y = new tms(19);
    public static final /* synthetic */ tms z = new tms(20);
    public static final /* synthetic */ tms A = new tms(21);
    public static final /* synthetic */ tms B = new tms(22);
    public static final /* synthetic */ tms C = new tms(23);
    public static final /* synthetic */ tms D = new tms(24);
    public static final /* synthetic */ tms E = new tms(25);
    public static final /* synthetic */ tms F = new tms(26);
    public static final /* synthetic */ tms G = new tms(27);
    public static final /* synthetic */ tms H = new tms(28);
    public static final /* synthetic */ tms I = new tms(29);

    public tms(lhw0 lhw0Var, a aVar) {
        this.a = 10;
    }

    @Override // defpackage.ae60
    public boolean a(e530 e530Var) {
        return false;
    }

    @Override // defpackage.ae60
    public int b() {
        return 8;
    }

    @Override // defpackage.qef0
    public void c(int i, Object obj) {
    }

    @Override // defpackage.ams
    public Object d(jje jjeVar, inj injVar) {
        switch (this.a) {
            case 0:
                if (injVar.c != 2) {
                    throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"copy\" requires 2 argument but "));
                }
                Object[] objArr = injVar.a;
                Object obj = objArr[0];
                Object obj2 = objArr[1];
                System.nanoTime();
                if (!(obj instanceof List)) {
                    throw oyr.y(obj, "Path should be list but actual value is ");
                }
                r5x q = eja1.q((List) obj);
                if (!(obj2 instanceof List)) {
                    throw oyr.y(obj2, "Path should be list but actual value is ");
                }
                r5x q2 = eja1.q((List) obj2);
                j5x J = bb1.J(jjeVar.c, q);
                d6x d6xVar = jjeVar.c;
                if (J != null) {
                    jjeVar.c = jason.statham.tools.a.c(jjeVar.c, q2, J, sb2.z(q2, bb1.K(d6xVar, q)));
                } else {
                    jjeVar.c = jason.statham.tools.a.g(d6xVar, q2);
                }
                System.nanoTime();
                return seu.E;
            default:
                if (injVar.c != 3) {
                    throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"store\" requires 3 argument but "));
                }
                Object[] objArr2 = injVar.a;
                Object obj3 = objArr2[0];
                Object obj4 = objArr2[1];
                Object obj5 = objArr2[2];
                System.nanoTime();
                if (!(obj3 instanceof List)) {
                    throw oyr.y(obj3, "Path should be list but actual value is ");
                }
                r5x q3 = eja1.q((List) obj3);
                j5x M = jx81.M(obj4);
                if ((M instanceof m5x) && ((m5x) M).a.isEmpty()) {
                    jjeVar.c = jason.statham.tools.a.g(jjeVar.c, q3);
                } else {
                    Map map = (Map) obj5;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        linkedHashMap.put(entry.getKey(), sb2.P(entry.getValue()));
                    }
                    jjeVar.c = jason.statham.tools.a.d(jjeVar.c, q3, M, new s6x(linkedHashMap));
                }
                System.nanoTime();
                return seu.E;
        }
    }

    @Override // defpackage.ae60
    public void e(LayoutNode layoutNode, long j, cnu cnuVar, int i, boolean z2) {
        t300 t300Var = layoutNode.a0;
        s sVar = (s) t300Var.e;
        tls tlsVar = s.j0;
        ((s) t300Var.e).g1(s.p0, sVar.Y0(j), cnuVar, 1, z2);
    }

    @Override // defpackage.ae60
    public boolean f(cnu cnuVar, LayoutNode layoutNode) {
        return false;
    }

    @Override // defpackage.ht90
    public String g() {
        return "PAY";
    }

    @Override // defpackage.ht90
    public String getName() {
        return "COMMON";
    }

    @Override // defpackage.ae60
    public boolean h(e530 e530Var) {
        return cvw.Q(q5z.a(qje.P(e530Var), false));
    }

    @Override // defpackage.ae60
    public boolean i(LayoutNode layoutNode) {
        cnq0 u = layoutNode.u();
        boolean z2 = false;
        if (u != null && u.w) {
            z2 = true;
        }
        return !z2;
    }

    public k2d0 j(pt50 pt50Var) {
        List list = pt50Var.b;
        String str = pt50Var.c;
        String str2 = pt50Var.d;
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((mt50) it.next()).a));
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ycc.r(((mt50) it2.next()).c, hashSet);
        }
        return new k2d0(str, str2, arrayList, hashSet);
    }

    @Override // defpackage.e1d
    public /* synthetic */ Object k(yuf0 yuf0Var) {
        c32 lambda$getComponents$0;
        lambda$getComponents$0 = AnalyticsConnectorRegistrar.lambda$getComponents$0(yuf0Var);
        return lambda$getComponents$0;
    }

    @Override // defpackage.vm11
    public /* bridge */ /* synthetic */ Object q() {
        return 0L;
    }

    @Override // defpackage.vm11
    public boolean t(Object obj) {
        return obj instanceof Long;
    }

    @Override // defpackage.ga91
    public Object zza() {
        switch (this.a) {
            case 16:
                List list = nw91.a;
                hcb1.b.get().getClass();
                Long l = (Long) qcb1.b.b();
                l.getClass();
                return l;
            case 17:
                List list2 = nw91.a;
                ((ecb1) pbb1.b.a.get()).getClass();
                Boolean bool = (Boolean) ecb1.a.b();
                bool.getClass();
                return bool;
            case 18:
                List list3 = nw91.a;
                hcb1.b.get().getClass();
                return (String) qcb1.u0.b();
            case 19:
                List list4 = nw91.a;
                hcb1.b.get().getClass();
                Long l2 = (Long) qcb1.U.b();
                l2.getClass();
                return l2;
            case 20:
                List list5 = nw91.a;
                hcb1.b.get().getClass();
                Long l3 = (Long) qcb1.S.b();
                l3.getClass();
                return l3;
            case 21:
                List list6 = nw91.a;
                hcb1.b.get().getClass();
                Long l4 = (Long) qcb1.v0.b();
                l4.getClass();
                return l4;
            case 22:
                List list7 = nw91.a;
                hcb1.b.get().getClass();
                Long l5 = (Long) qcb1.V.b();
                l5.getClass();
                return l5;
            case 23:
                List list8 = nw91.a;
                hcb1.b.get().getClass();
                Long l6 = (Long) qcb1.p0.b();
                l6.getClass();
                return l6;
            case 24:
                List list9 = nw91.a;
                uhb1.b.get().getClass();
                Boolean bool2 = (Boolean) bib1.a.b();
                bool2.getClass();
                return bool2;
            case 25:
                List list10 = nw91.a;
                uhb1.b.get().getClass();
                Double d = (Double) bib1.c.b();
                d.getClass();
                return d;
            case 26:
                List list11 = nw91.a;
                hcb1.b.get().getClass();
                Long l7 = (Long) qcb1.e0.b();
                l7.getClass();
                return l7;
            case 27:
                List list12 = nw91.a;
                hcb1.b.get().getClass();
                return (String) qcb1.a0.b();
            case 28:
                List list13 = nw91.a;
                hcb1.b.get().getClass();
                return Integer.valueOf((int) ((Long) qcb1.r0.b()).longValue());
            default:
                List list14 = nw91.a;
                hcb1.b.get().getClass();
                Boolean bool3 = (Boolean) qcb1.c.b();
                bool3.getClass();
                return bool3;
        }
    }

    public /* synthetic */ tms(int i) {
        this.a = i;
    }
}
