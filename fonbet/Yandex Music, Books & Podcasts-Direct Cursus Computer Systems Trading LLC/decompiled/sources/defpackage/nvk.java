package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class nvk implements w2q {
    public final n7q a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final /* synthetic */ ime e;

    public nvk(ime imeVar, n7q n7qVar, long j, boolean z, boolean z2) {
        this.e = imeVar;
        this.a = n7qVar;
        this.b = j;
        this.c = z;
        this.d = z2;
    }

    public final String a() {
        u3q g = this.a.g();
        g.getClass();
        return (String) ocg.k(g, new aaw(23));
    }

    @Override // defpackage.w2q
    public final Object c(foc focVar) {
        focVar.getClass();
        throw null;
    }

    @Override // defpackage.w2q
    public final Object g(faq faqVar) {
        faqVar.getClass();
        dfi.r("This should not happen. Ynison is not tracking", (String) this.e.b);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01cc  */
    @Override // defpackage.w2q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(jzs jzsVar) {
        izs izsVar;
        String str;
        long j;
        String str2;
        String X;
        jzsVar.getClass();
        n7q n7qVar = this.a;
        a0q C = rvf.C(n7qVar.b());
        String str3 = C != null ? (String) o8g.i(C, new klx(23)) : null;
        if (str3 == null) {
            a0q id = n7qVar.g().getId();
            id.getClass();
            str3 = (String) o8g.i(id, new klx(23));
        }
        mqs mqsVar = jzsVar.a;
        izs izsVar2 = jzsVar.g;
        v80 v80Var = jzsVar.b;
        String a = a();
        ime imeVar = this.e;
        boolean d = ((qqs) ((dn9) imeVar.c).b).d(n7qVar.g(), n7qVar.b());
        boolean z = jzsVar.h;
        String str4 = jzsVar.d;
        Boolean bool = jzsVar.e;
        Boolean bool2 = jzsVar.f;
        Boolean valueOf = Boolean.valueOf(swf.R(izsVar2));
        if (d) {
            msa msaVar = nsa.b;
            izsVar = izsVar2;
            j = mqsVar.X;
            str = null;
        } else {
            izsVar = izsVar2;
            str = null;
            msa msaVar2 = nsa.b;
            j = mqsVar.e;
        }
        long N = yd5.N(j, ssa.MILLISECONDS);
        Boolean bool3 = (Boolean) wdg.A(n7qVar, (ovk) imeVar.d);
        bool3.getClass();
        izs izsVar3 = izsVar;
        jvk jvkVar = new jvk(this.b);
        jvkVar.c = str3;
        String str5 = mqsVar.b;
        if (str5 == null) {
            str5 = mqsVar.a;
        }
        jvkVar.a = str5;
        jvkVar.b = mqsVar.d.a;
        jvkVar.g = new nsa(N);
        izsVar3.getClass();
        hzs hzsVar = hzs.a;
        if (izsVar3.equals(hzsVar)) {
            str2 = str;
        } else {
            if (!(izsVar3 instanceof e6v)) {
                b6e.s();
                return str;
            }
            e6v e6vVar = (e6v) izsVar3;
            if (e6vVar instanceof b6v) {
                r3q r3qVar = ((b6v) e6vVar).a;
                if (r3qVar instanceof j3q) {
                    str2 = "album";
                } else if (r3qVar instanceof l3q) {
                    str2 = "artist";
                } else if (r3qVar instanceof p3q) {
                    str2 = "playlist";
                } else {
                    if (!(r3qVar instanceof m3q)) {
                        b6e.s();
                        return str;
                    }
                    tyt tytVar = ((m3q) r3qVar).b;
                    if ((tytVar instanceof qyt) || Intrinsics.d(tytVar, dyt.a)) {
                        str2 = "search";
                    } else {
                        if (!Intrinsics.d(tytVar, cyt.a) && !Intrinsics.d(tytVar, eyt.a) && !Intrinsics.d(tytVar, syt.a) && !Intrinsics.d(tytVar, ryt.a)) {
                            b6e.s();
                            return str;
                        }
                        str2 = "other";
                    }
                }
            } else {
                if (!(e6vVar instanceof d6v)) {
                    b6e.s();
                    return str;
                }
                str2 = "radio";
            }
        }
        if (str2 == null) {
            str2 = (String) wdg.A(n7qVar, new wvo(18));
        }
        jvkVar.h = str2;
        if (!izsVar3.equals(hzsVar)) {
            if (!(izsVar3 instanceof e6v)) {
                b6e.s();
                return str;
            }
            e6v e6vVar2 = (e6v) izsVar3;
            if (e6vVar2 instanceof b6v) {
                r3q r3qVar2 = ((b6v) e6vVar2).a;
                if (r3qVar2 instanceof j3q) {
                    X = ((j3q) r3qVar2).a.a;
                } else if (r3qVar2 instanceof l3q) {
                    X = ((l3q) r3qVar2).a.a;
                } else if (r3qVar2 instanceof p3q) {
                    X = hag.q(((p3q) r3qVar2).a);
                } else if (!(r3qVar2 instanceof m3q)) {
                    b6e.s();
                    return str;
                }
            } else {
                if (!(e6vVar2 instanceof d6v)) {
                    b6e.s();
                    return str;
                }
                xnu id2 = ((d6v) e6vVar2).a.getId();
                if (id2 instanceof tnu) {
                    X = CollectionsKt.X(o8g.R(((tnu) id2).a), StringUtils.COMMA, null, null, null, 62);
                } else {
                    if (!(id2 instanceof unu)) {
                        b6e.s();
                        return str;
                    }
                    X = CollectionsKt.X(o8g.R(((unu) id2).a), StringUtils.COMMA, null, null, null, 62);
                }
            }
            if (X == null) {
                X = (String) o8g.i(n7qVar.g().getId(), new b3i(25));
            }
            jvkVar.i = X;
            jvkVar.e = v80Var.a;
            jvkVar.j = a;
            jvkVar.k = (String) wdg.A(n7qVar, new euk());
            imeVar.X(jvkVar);
            jvkVar.o = Boolean.valueOf(this.c);
            jvkVar.q = Boolean.valueOf(z);
            jvkVar.r = v80Var.b;
            jvkVar.s = v80Var.c;
            jvkVar.u = str4;
            jvkVar.v = bool;
            jvkVar.w = bool2;
            jvkVar.x = valueOf;
            jvkVar.t = Boolean.valueOf(this.d);
            jvkVar.y = bool3;
            jvkVar.d = (Boolean) ((s8i) ((dn9) imeVar.c).d).invoke(mqsVar);
            return jvkVar.a();
        }
        X = str;
        if (X == null) {
        }
        jvkVar.i = X;
        jvkVar.e = v80Var.a;
        jvkVar.j = a;
        jvkVar.k = (String) wdg.A(n7qVar, new euk());
        imeVar.X(jvkVar);
        jvkVar.o = Boolean.valueOf(this.c);
        jvkVar.q = Boolean.valueOf(z);
        jvkVar.r = v80Var.b;
        jvkVar.s = v80Var.c;
        jvkVar.u = str4;
        jvkVar.v = bool;
        jvkVar.w = bool2;
        jvkVar.x = valueOf;
        jvkVar.t = Boolean.valueOf(this.d);
        jvkVar.y = bool3;
        jvkVar.d = (Boolean) ((s8i) ((dn9) imeVar.c).d).invoke(mqsVar);
        return jvkVar.a();
    }

    @Override // defpackage.w2q
    public final Object i(m1q m1qVar) {
        m1qVar.getClass();
        dfi.r("This should not happen. Glagol is not tracking", (String) this.e.b);
        return null;
    }

    @Override // defpackage.w2q
    public final Object j(i5u i5uVar) {
        i5uVar.getClass();
        dfi.r("This should not happen. Video clip is not tracking", (String) this.e.b);
        return null;
    }

    @Override // defpackage.w2q
    public final Object k(k4d k4dVar) {
        k4dVar.getClass();
        e5d e5dVar = k4dVar.a;
        String a = a();
        gxc gxcVar = k4dVar.b.b;
        ime imeVar = this.e;
        imeVar.getClass();
        msa msaVar = nsa.b;
        jvk jvkVar = new jvk(yd5.M(0, ssa.MILLISECONDS));
        jvkVar.h = "generative";
        jvkVar.p = e5dVar.a;
        jvkVar.e = "generative";
        jvkVar.d = Boolean.FALSE;
        jvkVar.j = a;
        jvkVar.r = gxcVar;
        imeVar.X(jvkVar);
        return jvkVar.a();
    }
}
