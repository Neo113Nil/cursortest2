package defpackage;

import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;
import yads.bo2;
import yads.c10;
import yads.kz1;
import yads.s12;

/* loaded from: classes7.dex */
public final class t681 extends va81 implements hk61 {
    public final se71 N;
    public final z4m0 O;
    public final v881 P;
    public final uio0 Q;

    public t681(Context context, se71 se71Var, z4m0 z4m0Var, v881 v881Var, hq71 hq71Var, nr41 nr41Var) {
        super(context, hq71Var, nr41Var);
        this.N = se71Var;
        this.O = z4m0Var;
        this.P = v881Var;
        fe81 fe81Var = hq71Var.a.c;
        bo2 bo2Var = se71Var.a;
        uio0 uio0Var = new uio0(fe81Var, bo2Var.b, this.i, this.j, new cr71(se71Var));
        this.Q = uio0Var;
        b(uio0Var);
    }

    @Override // defpackage.hk61
    public final z681 a(xg81 xg81Var) {
        try {
            this.Q.f = s12.c;
            d(xg81Var.c, this.P, new aj31(23, xg81Var));
            return a481.a;
        } catch (kz1 e) {
            qc71.a("Ad binding failed: %s", e.b);
            return new l081(e.c, e);
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = "Ad binding failed with unexpected exception";
            }
            qc71.a("Ad binding failed with unexpected error: %s", message);
            return new l081(null, th);
        }
    }

    @Override // defpackage.hk61
    public final String c() {
        return this.K;
    }

    @Override // defpackage.hk61
    public final xn61 e() {
        return this.N.j;
    }

    @Override // defpackage.hk61
    public final String g() {
        return ((se71) this.O.b).d;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01da  */
    @Override // defpackage.hk61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m081 getAdAssets() {
        wt81 wt81Var;
        ez61 ez61Var;
        c10 c10Var;
        List list;
        z4m0 z4m0Var = this.O;
        fp71 fp71Var = (fp71) z4m0Var.z;
        se71 se71Var = (se71) z4m0Var.b;
        fp71Var.getClass();
        v881 v881Var = (v881) fp71Var.a;
        uh71 uh71Var = (uh71) fp71Var.b;
        List<uy71> list2 = se71Var.b;
        int d = gw00.d(tcc.n(list2, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (uy71 uy71Var : list2) {
            Pair pair = new Pair(uy71Var.a, uy71Var.c);
            linkedHashMap.put(pair.c(), pair.f());
        }
        Object obj = linkedHashMap.get("media");
        Float f = null;
        d171 d171Var = obj instanceof d171 ? (d171) obj : null;
        Object obj2 = linkedHashMap.get("favicon");
        cu81 cu81Var = obj2 instanceof cu81 ? (cu81) obj2 : null;
        Object obj3 = linkedHashMap.get("icon");
        cu81 cu81Var2 = obj3 instanceof cu81 ? (cu81) obj3 : null;
        Object obj4 = linkedHashMap.get("close_button");
        zj81 zj81Var = obj4 instanceof zj81 ? (zj81) obj4 : null;
        Object obj5 = linkedHashMap.get("age");
        String str = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = linkedHashMap.get("body");
        String str2 = obj6 instanceof String ? (String) obj6 : null;
        Object obj7 = linkedHashMap.get("call_to_action");
        String str3 = obj7 instanceof String ? (String) obj7 : null;
        Object obj8 = linkedHashMap.get("domain");
        String str4 = obj8 instanceof String ? (String) obj8 : null;
        Object obj9 = linkedHashMap.get("price");
        String str5 = obj9 instanceof String ? (String) obj9 : null;
        Object obj10 = linkedHashMap.get("rating");
        String str6 = obj10 instanceof String ? (String) obj10 : null;
        Object obj11 = linkedHashMap.get("review_count");
        String str7 = obj11 instanceof String ? (String) obj11 : null;
        Object obj12 = linkedHashMap.get("sponsored");
        String str8 = obj12 instanceof String ? (String) obj12 : null;
        Object obj13 = linkedHashMap.get("title");
        String str9 = obj13 instanceof String ? (String) obj13 : null;
        Object obj14 = linkedHashMap.get("warning");
        ig61 ig61Var = obj14 instanceof ig61 ? (ig61) obj14 : obj14 instanceof String ? new ig61((String) obj14) : null;
        boolean z = linkedHashMap.get("feedback") != null;
        e781 a = uh71Var.a((d171Var == null || (list = d171Var.c) == null) ? null : (cu81) a.R(list), v881Var);
        e781 a2 = uh71Var.a(cu81Var, v881Var);
        e781 a3 = uh71Var.a(cu81Var2, v881Var);
        ((jw81) fp71Var.c).getClass();
        if (d171Var != null) {
            il81 il81Var = d171Var.b;
            List list3 = d171Var.c;
            lg71 lg71Var = d171Var.a;
            if (il81Var != null) {
                int i = ((i581) a.P(il81Var.a)).d.c;
                wt81Var = new wt81(i != 0 ? r0.b / i : 1.7777778f, true);
            } else if (list3 != null && list3.size() > 1) {
                wt81Var = new wt81((float) bl71.a(list3), false);
            } else if (lg71Var != null) {
                wt81Var = new wt81(lg71Var.b, false);
            }
            ((qn81) fp71Var.x).getClass();
            if (zj81Var == null) {
                int ordinal = zj81Var.a.ordinal();
                if (ordinal == 0) {
                    c10Var = c10.b;
                } else {
                    if (ordinal != 1) {
                        w511.b();
                        return null;
                    }
                    c10Var = c10.c;
                }
                ez61Var = new ez61(c10Var, zj81Var.b);
            } else {
                ez61Var = null;
            }
            ((iu71) fp71Var.w).getClass();
            if (str6 != null) {
                try {
                    f = Float.valueOf(Float.parseFloat(str6));
                } catch (NumberFormatException unused) {
                    String.format("Could not parse rating value. Rating value is %s", Arrays.copyOf(new Object[]{str6}, 1));
                }
            }
            return new m081(wt81Var, a2, a3, a, ez61Var, str, str2, str3, str4, str5, f, str7, str8, str9, ig61Var, z);
        }
        wt81Var = null;
        ((qn81) fp71Var.x).getClass();
        if (zj81Var == null) {
        }
        ((iu71) fp71Var.w).getClass();
        if (str6 != null) {
        }
        return new m081(wt81Var, a2, a3, a, ez61Var, str, str2, str3, str4, str5, f, str7, str8, str9, ig61Var, z);
    }

    @Override // defpackage.va81, defpackage.hk61
    public final void h() {
        z4m0 z4m0Var = this.O;
        List singletonList = Collections.singletonList((se71) z4m0Var.b);
        ((v571) z4m0Var.y).getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = singletonList.iterator();
        while (it.hasNext()) {
            ycc.r(v571.a(((se71) it.next()).b), linkedHashSet);
        }
        ((vb71) z4m0Var.x).a(linkedHashSet, new lm71(13, z4m0Var));
    }

    @Override // defpackage.hk61
    public final void i(xg81 xg81Var, t171 t171Var) {
        e(xg81Var.c, this.P, new aj31(23, xg81Var), t171Var);
    }

    @Override // defpackage.hk61
    public final String a() {
        return ((se71) this.O.b).e;
    }
}
