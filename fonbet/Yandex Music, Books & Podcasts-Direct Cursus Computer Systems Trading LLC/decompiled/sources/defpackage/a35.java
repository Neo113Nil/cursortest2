package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class a35 extends aur implements ryc {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a35(Object obj, Continuation continuation, int i) {
        super(4, continuation);
        this.j = i;
        this.n = obj;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.j) {
            case 0:
                a35 a35Var = new a35((d35) this.n, (Continuation) obj4, 0);
                a35Var.k = (List) obj;
                a35Var.l = (List) obj2;
                a35Var.m = (cwl) obj3;
                return a35Var.invokeSuspend(Unit.a);
            case 1:
                a35 a35Var2 = new a35((vru) this.n, (Continuation) obj4, 1);
                a35Var2.k = obj;
                a35Var2.l = obj2;
                a35Var2.m = obj3;
                return a35Var2.invokeSuspend(Unit.a);
            case 2:
                a35 a35Var3 = new a35((nx5) this.n, (Continuation) obj4, 2);
                a35Var3.k = (jfg) obj;
                a35Var3.l = (rx5) obj2;
                a35Var3.m = (String) obj3;
                return a35Var3.invokeSuspend(Unit.a);
            case 3:
                a35 a35Var4 = new a35((z66) this.n, (Continuation) obj4, 3);
                a35Var4.k = (zzi) obj;
                a35Var4.l = (u0j) obj2;
                a35Var4.m = (x66) obj3;
                return a35Var4.invokeSuspend(Unit.a);
            case 4:
                a35 a35Var5 = new a35((wia) this.n, (Continuation) obj4, 4);
                a35Var5.k = (List) obj;
                a35Var5.l = (List) obj2;
                a35Var5.m = (List) obj3;
                return a35Var5.invokeSuspend(Unit.a);
            case 5:
                a35 a35Var6 = new a35((cka) this.n, (Continuation) obj4, 5);
                a35Var6.k = (rr3) obj;
                a35Var6.l = (dr3) obj2;
                a35Var6.m = (xja) obj3;
                return a35Var6.invokeSuspend(Unit.a);
            case 6:
                a35 a35Var7 = new a35((pmf) this.n, (Continuation) obj4, 6);
                a35Var7.k = (x7q) obj;
                a35Var7.l = (e6l) obj2;
                a35Var7.m = (cwu) obj3;
                return a35Var7.invokeSuspend(Unit.a);
            case 7:
                a35 a35Var8 = new a35((grl) this.n, (Continuation) obj4, 7);
                a35Var8.k = (y7q) obj;
                a35Var8.l = (hql) obj2;
                a35Var8.m = (evo) obj3;
                return a35Var8.invokeSuspend(Unit.a);
            case 8:
                a35 a35Var9 = new a35((rpq) this.n, (Continuation) obj4, 8);
                a35Var9.k = (wub) obj;
                a35Var9.l = (le5) obj2;
                a35Var9.m = (x66) obj3;
                return a35Var9.invokeSuspend(Unit.a);
            default:
                a35 a35Var10 = new a35((dnu) this.n, (Continuation) obj4, 9);
                a35Var10.k = (n7q) obj;
                a35Var10.l = (String) obj2;
                a35Var10.m = (x66) obj3;
                return a35Var10.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05d2 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v2, types: [int] */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        s0m s0mVar;
        s0m s0mVar2;
        Pair pair;
        List h;
        u3q g;
        p4q p4qVar;
        l7q l7qVar;
        o56 o56Var;
        int i = this.j;
        char c = 2;
        Object obj3 = this.n;
        vbc vbcVar = null;
        switch (i) {
            case 0:
                d35 d35Var = (d35) obj3;
                imp impVar = d35Var.m;
                List list = (List) this.k;
                List list2 = (List) this.l;
                cwl cwlVar = (cwl) this.m;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((vbc) obj2).b()) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                vbc vbcVar2 = (vbc) obj2;
                if (vbcVar2 != null) {
                    impVar.getClass();
                    s0mVar = imp.U(vbcVar2);
                } else {
                    s0mVar = s0m.b;
                }
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ?? next = it2.next();
                        if (((vbc) next).b()) {
                            vbcVar = next;
                        }
                    }
                }
                vbc vbcVar3 = vbcVar;
                if (vbcVar3 != null) {
                    impVar.getClass();
                    s0mVar2 = imp.U(vbcVar3);
                } else {
                    s0mVar2 = s0m.c;
                }
                return new cwl(d35.a(d35Var, cwlVar.a, s0mVar), d35.a(d35Var, cwlVar.b, s0mVar2));
            case 1:
                Object obj4 = this.k;
                Object obj5 = this.l;
                Object obj6 = this.m;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return ((vru) obj3).invoke(obj4, obj5, obj6);
            case 2:
                boolean z = false;
                jfg jfgVar = (jfg) this.k;
                rx5 rx5Var = (rx5) this.l;
                String str = (String) this.m;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                if (jfgVar instanceof hfg) {
                    return fx5.a;
                }
                if (jfgVar instanceof gfg) {
                    return ex5.a;
                }
                if (!(jfgVar instanceof ifg)) {
                    b6e.s();
                    return null;
                }
                ofc ofcVar = ((nx5) obj3).m;
                ArrayList<ov5> arrayList = ((ifg) jfgVar).a;
                ofcVar.getClass();
                rx5Var.getClass();
                str.getClass();
                ox5 ox5Var = rx5Var instanceof ox5 ? (ox5) rx5Var : null;
                Long valueOf = ox5Var != null ? Long.valueOf(ox5Var.a.a) : null;
                boolean z2 = rx5Var instanceof px5;
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                for (ov5 ov5Var : arrayList) {
                    arrayList2.add(new jx5(ov5Var, valueOf != null && ov5Var.a == valueOf.longValue()));
                }
                if (str.length() != 0) {
                    String lowerCase = StringsKt.t0(str).toString().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        jx5 jx5Var = (jx5) it3.next();
                        String lowerCase2 = jx5Var.a.b.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        boolean z3 = z;
                        boolean v = c.v(lowerCase2, lowerCase, z3);
                        ?? r11 = z3;
                        if (!v) {
                            List g2 = new Regex("[\\s\\-]+").g(z3 ? 1 : 0, lowerCase2);
                            if (!(g2 instanceof Collection) || !g2.isEmpty()) {
                                Iterator it4 = g2.iterator();
                                while (it4.hasNext()) {
                                    if (c.v((String) it4.next(), lowerCase, false)) {
                                        r11 = 1;
                                    }
                                }
                            }
                            if (StringsKt.M(lowerCase2, lowerCase, false)) {
                                r11 = 2;
                            } else {
                                pair = null;
                                if (pair == null) {
                                    arrayList3.add(pair);
                                }
                                z = false;
                            }
                        }
                        pair = new Pair(jx5Var, Integer.valueOf((int) r11));
                        if (pair == null) {
                        }
                        z = false;
                    }
                    List o0 = CollectionsKt.o0(arrayList3, gl5.a(new uo5(25), new uo5(26)));
                    arrayList2 = new ArrayList(v75.o(o0, 10));
                    Iterator it5 = o0.iterator();
                    while (it5.hasNext()) {
                        arrayList2.add((jx5) ((Pair) it5.next()).a);
                    }
                }
                if (str.length() == 0) {
                    arrayList2 = CollectionsKt.g0(t75.c(new ix5(z2)), arrayList2);
                }
                return arrayList2.isEmpty() ? hx5.a : new gx5(arrayList2);
            case 3:
                zzi zziVar = (zzi) this.k;
                u0j u0jVar = (u0j) this.l;
                x66 x66Var = (x66) this.m;
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                return x66Var == null ? z66.b(zziVar, u0jVar) : x66Var;
            case 4:
                List list3 = (List) this.k;
                List list4 = (List) this.l;
                List list5 = (List) this.m;
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                wia wiaVar = (wia) obj3;
                List list6 = list3;
                ArrayList arrayList4 = new ArrayList(v75.o(list6, 10));
                Iterator it6 = list6.iterator();
                while (it6.hasNext()) {
                    arrayList4.add(wia.c(wiaVar, (jja) it6.next()));
                }
                List<gga> list7 = list4;
                ArrayList arrayList5 = new ArrayList(v75.o(list7, 10));
                for (gga ggaVar : list7) {
                    wiaVar.getClass();
                    cvl cvlVar = ggaVar.a;
                    arrayList5.add(new hia(cvlVar.b, op7.c(cvlVar), qo6.e, null, ggaVar.b));
                    c = c;
                    r6 = r6;
                }
                char c2 = c;
                boolean z4 = r6;
                List list8 = list5;
                ArrayList arrayList6 = new ArrayList(v75.o(list8, 10));
                Iterator it7 = list8.iterator();
                while (it7.hasNext()) {
                    arrayList6.add(wia.b(wiaVar, (kca) it7.next()));
                }
                List[] listArr = new List[3];
                listArr[z4 ? 1 : 0] = arrayList4;
                listArr[1] = arrayList5;
                listArr[c2] = arrayList6;
                return wia.a(wiaVar, listArr);
            case 5:
                cka ckaVar = (cka) obj3;
                xdr xdrVar = ckaVar.h;
                rr3 rr3Var = (rr3) this.k;
                dr3 dr3Var = (dr3) this.l;
                xja xjaVar = (xja) this.m;
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                List list9 = dr3Var.a;
                jyr jyrVar = dr3Var.b;
                if (list9.isEmpty()) {
                    xdrVar.l(c5b.a);
                    return vja.a;
                }
                if (((List) ((Pair) jyrVar.getValue()).a).isEmpty() || ((List) ((Pair) jyrVar.getValue()).b).isEmpty()) {
                    rr3Var = null;
                }
                int i2 = rr3Var == null ? -1 : bka.a[rr3Var.ordinal()];
                if (i2 != -1) {
                    if (i2 == 1) {
                        list9 = (List) ((Pair) jyrVar.getValue()).a;
                    } else if (i2 == 2) {
                        list9 = (List) ((Pair) jyrVar.getValue()).b;
                    } else if (i2 != 3) {
                        b6e.s();
                        return null;
                    }
                }
                List list10 = list9;
                ArrayList arrayList7 = new ArrayList(v75.o(list10, 10));
                Iterator it8 = list10.iterator();
                while (it8.hasNext()) {
                    arrayList7.add(((jja) it8.next()).a);
                }
                xdrVar.getClass();
                xdrVar.m(null, arrayList7);
                int i3 = xjaVar.b;
                long j = xjaVar.a;
                o8q o8qVar = ckaVar.d;
                o8qVar.getClass();
                skr skrVar = o8qVar.a;
                if (rr3Var == null) {
                    h = c5b.a;
                } else {
                    String c3 = skrVar.c(R.string.downloads_filter_own);
                    rr3 rr3Var2 = rr3.a;
                    sr3 sr3Var = new sr3(c3, rr3Var2, rr3Var == rr3Var2);
                    String c4 = skrVar.c(R.string.downloads_filter_auto_cache);
                    rr3 rr3Var3 = rr3.b;
                    sr3 sr3Var2 = new sr3(c4, rr3Var3, rr3Var == rr3Var3);
                    String c5 = skrVar.c(R.string.downloads_filter_all);
                    rr3 rr3Var4 = rr3.c;
                    h = u75.h(sr3Var, sr3Var2, new sr3(c5, rr3Var4, rr3Var == rr3Var4));
                }
                List list11 = h;
                List<jja> q0 = CollectionsKt.q0(list10, 12);
                ArrayList arrayList8 = new ArrayList(v75.o(q0, 10));
                for (jja jjaVar : q0) {
                    arrayList8.add(new ko6(oo6.a.a(jjaVar.a), jjaVar.a));
                }
                return new tja(i3, j, list11, arrayList8);
            case 6:
                x7q x7qVar = (x7q) this.k;
                e6l e6lVar = (e6l) this.l;
                Object obj7 = (cwu) this.m;
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                pmf pmfVar = (pmf) obj3;
                d6l x = p6g.x(e6lVar);
                n7q n7qVar = x != null ? x.a : null;
                s9p s9pVar = (x7qVar == null || (l7qVar = x7qVar.b) == null) ? null : (s9p) ldg.k(l7qVar, y9w.g);
                xku l0 = (n7qVar == null || (g = n7qVar.g()) == null || (p4qVar = (p4q) ocg.k(g, klx.j)) == null) ? xku.b : hdg.l0(p4qVar);
                hwu hwuVar = hwu.a;
                if (s9pVar != null) {
                    iwu iwuVar = new iwu(s9pVar, l0);
                    boolean z5 = x7qVar.c;
                    l7q l7qVar2 = x7qVar.b;
                    l7qVar2.getClass();
                    obj7 = new zvu(iwuVar, z5, (String) ldg.k(l7qVar2, fs7.e));
                } else {
                    uvu uvuVar = n7qVar != null ? (uvu) wdg.A(n7qVar, new jzk(7)) : null;
                    if (uvuVar != null) {
                        String str2 = uvuVar.b;
                        boolean C = p6g.C(e6lVar);
                        s9p s9pVar2 = uvuVar.a;
                        obj7 = C ? new ewu(new iwu(s9pVar2, l0), str2) : new dwu(new iwu(s9pVar2, l0), str2);
                    } else if (obj7 == null) {
                        obj7 = hwuVar;
                    }
                }
                if (obj7 instanceof kwu) {
                    xdr xdrVar2 = pmfVar.a;
                    kwu kwuVar = (kwu) obj7;
                    cwu cwuVar = new cwu(kwuVar.a(), kwuVar.getName());
                    xdrVar2.getClass();
                    xdrVar2.m(null, cwuVar);
                } else if (!obj7.equals(hwuVar) && !(obj7 instanceof zvu)) {
                    b6e.s();
                    return null;
                }
                return obj7;
            case 7:
                y7q y7qVar = (y7q) this.k;
                hql hqlVar = (hql) this.l;
                evo evoVar = (evo) this.m;
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                if (y7qVar instanceof u7q) {
                    int i4 = hqlVar != null ? pql.a[hqlVar.ordinal()] : -1;
                    if (i4 != 1) {
                        return i4 != 2 ? new eve(true) : new eve(true);
                    }
                    if (((grl) obj3).G() instanceof i5u) {
                        return new eve(true);
                    }
                    return new fve(evoVar == evo.a);
                }
                if (Intrinsics.d(y7qVar, v7q.a)) {
                    return gve.a;
                }
                if (Intrinsics.d(y7qVar, w7q.a)) {
                    return new eve(false);
                }
                if (y7qVar instanceof x7q) {
                    return new eve(false);
                }
                b6e.s();
                return null;
            case 8:
                wub wubVar = (wub) this.k;
                le5 le5Var = (le5) this.l;
                x66 x66Var2 = (x66) this.m;
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                mwk b = le5Var.b.b();
                b.getClass();
                e3s e3sVar = e3s.h;
                nxk nxkVar = (nxk) dag.p(b, e3sVar);
                wub wubVar2 = ((rpq) obj3).d;
                if (wubVar2 != null) {
                    wubVar = wubVar2;
                }
                nxk nxkVar2 = (nxk) dag.p(b, e3sVar);
                x66Var2.getClass();
                boolean z6 = x66Var2.a;
                if (z6) {
                    o56Var = o56.a;
                } else {
                    if (z6) {
                        b6e.s();
                        return null;
                    }
                    o56Var = o56.b;
                }
                snq snqVar = wubVar.b;
                snq snqVar2 = wubVar.a;
                nxkVar2.getClass();
                if (!nxkVar2.equals(kxk.a)) {
                    if (nxkVar2.equals(fxk.a)) {
                        int ordinal = o56Var.ordinal();
                        if (ordinal == 0) {
                            snqVar = wubVar.c;
                        } else if (ordinal != 1) {
                            b6e.s();
                            return null;
                        }
                    } else if (nxkVar2.equals(ixk.a) || nxkVar2.equals(hxk.a)) {
                        int ordinal2 = o56Var.ordinal();
                        if (ordinal2 == 0) {
                            snqVar = wubVar.d;
                        } else if (ordinal2 != 1) {
                            b6e.s();
                            return null;
                        }
                    } else if (nxkVar2.equals(gxk.a)) {
                        int ordinal3 = o56Var.ordinal();
                        if (ordinal3 == 0) {
                            snqVar = wubVar.e;
                        } else if (ordinal3 != 1) {
                            b6e.s();
                            return null;
                        }
                    } else {
                        if (!nxkVar2.equals(dxk.a) && !nxkVar2.equals(jxk.a) && !nxkVar2.equals(exk.a) && !nxkVar2.equals(lxk.a) && !nxkVar2.equals(mxk.a)) {
                            b6e.s();
                            return null;
                        }
                        snqVar = wubVar.f;
                    }
                    dnl dnlVar = new dnl(snqVar, nxkVar, b);
                    ne5 ne5Var = le5Var.c;
                    String str3 = snqVar.a;
                    ajl ajlVar = ajl.d;
                    zil zilVar = ne5Var.a;
                    ime imeVar = ne5Var.b;
                    ajl ajlVar2 = new ajl(zilVar, str3);
                    ajlVar2.c = imeVar;
                    return new knl(dnlVar, ajlVar2);
                }
                snqVar = snqVar2;
                dnl dnlVar2 = new dnl(snqVar, nxkVar, b);
                ne5 ne5Var2 = le5Var.c;
                String str32 = snqVar.a;
                ajl ajlVar3 = ajl.d;
                zil zilVar2 = ne5Var2.a;
                ime imeVar2 = ne5Var2.b;
                ajl ajlVar22 = new ajl(zilVar2, str32);
                ajlVar22.c = imeVar2;
                return new knl(dnlVar2, ajlVar22);
            default:
                dnu dnuVar = (dnu) obj3;
                drf drfVar = dnuVar.a;
                xdr xdrVar3 = dnuVar.e;
                n7q n7qVar2 = (n7q) this.k;
                String str4 = (String) this.l;
                x66 x66Var3 = (x66) this.m;
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                mwk b2 = n7qVar2 != null ? n7qVar2.b() : null;
                mqs a = b2 != null ? b2.a() : null;
                if (!x66Var3.a || a == null || a4g.D(gys.NonMusicHolder, a) || a.C()) {
                    xdrVar3.getClass();
                    xdrVar3.m(null, smu.a);
                    return new b73(drfVar);
                }
                rr5 d = a.d();
                String str5 = a.c;
                String I = neg.I(str4);
                Integer R = pd.R(a.f().a);
                umu umuVar = new umu(d, str5, I, R != null ? new d85(c3x.f(R.intValue())) : null, b2);
                xdrVar3.getClass();
                xdrVar3.m(null, umuVar);
                return new d73(drfVar);
        }
    }
}
