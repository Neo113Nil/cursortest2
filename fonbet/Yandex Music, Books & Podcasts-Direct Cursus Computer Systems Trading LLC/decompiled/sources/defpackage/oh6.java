package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public final class oh6 implements wmm, rnq, ayd {
    public final s63 a;
    public final ch6 b;
    public final g06 c;
    public final lnq d;
    public final at5 e;
    public final jzi f;
    public final gg6 g;
    public volatile boolean i;
    public rar j;
    public kzp k;
    public rar m;
    public rar n;
    public rar o;
    public rar p;
    public xzi q;
    public final String h = oh6.class.getSimpleName();
    public final xdr l = ydr.a(Boolean.TRUE);
    public final xdr r = ydr.a(null);
    public final xdr s = ydr.a(new ih6());
    public final xdr t = ydr.a(Boolean.FALSE);
    public final xdr u = ydr.a(new zcj(""));
    public final x0q v = y0q.b(0, 1, oi3.b, 1);

    public oh6(s63 s63Var, ch6 ch6Var, g06 g06Var, lnq lnqVar, at5 at5Var, jzi jziVar) {
        this.a = s63Var;
        this.b = ch6Var;
        this.c = g06Var;
        this.d = lnqVar;
        this.e = at5Var;
        this.f = jziVar;
        this.g = (gg6) s63Var.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0076, code lost:
    
        if (r1 == r3) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(oh6 oh6Var, cg6 cg6Var) {
        nh6 nh6Var;
        int i;
        rj6 rj6Var;
        qh6 qh6Var;
        o3j o3jVar;
        c8l c8lVar;
        c8l c8lVar2;
        rj6 rj6Var2;
        String str;
        u9b u9bVar;
        u9b u9bVar2;
        u9b u9bVar3;
        u9b u9bVar4;
        x63 x63Var;
        d70 d70Var;
        d70 d70Var2;
        d70 d70Var3;
        if (cg6Var instanceof nh6) {
            nh6Var = (nh6) cg6Var;
            int i2 = nh6Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nh6Var.m = i2 - Integer.MIN_VALUE;
                Object obj = nh6Var.k;
                nm6 nm6Var = nm6.a;
                i = nh6Var.m;
                d70 d70Var4 = null;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!(oh6Var.s.getValue() instanceof kh6)) {
                        xdr xdrVar = oh6Var.s;
                        Object jh6Var = !((Boolean) oh6Var.l.getValue()).booleanValue() ? new jh6() : new ih6();
                        xdrVar.getClass();
                        xdrVar.m(null, jh6Var);
                    }
                    ch6 ch6Var = oh6Var.b;
                    gg6 gg6Var = oh6Var.g;
                    boolean z = oh6Var.i;
                    nh6Var.m = 1;
                    obj = ch6Var.b(gg6Var, z, nh6Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        rj6Var2 = nh6Var.j;
                        qgg.h0(obj);
                        g06 g06Var = oh6Var.c;
                        wg6 wg6Var = (wg6) ((qj6) rj6Var2).a;
                        wg6Var.getClass();
                        x63Var = wg6Var.c;
                        n3j n3jVar = wg6Var.b;
                        if (x63Var != null) {
                            d70Var = null;
                        } else if (x63Var instanceof v63) {
                            lt ltVar = ((v63) x63Var).a;
                            d70Var = new d70(ltVar.a, c70.a, ltVar.c, 1, "");
                        } else {
                            if (!(x63Var instanceof w63)) {
                                b6e.s();
                                return null;
                            }
                            eul eulVar = ((w63) x63Var).a;
                            d70Var = new d70(eulVar.f, c70.d, eulVar.c, 1, "");
                        }
                        g06Var.d = d70Var;
                        ph6 ph6Var = wg6Var.a;
                        if (d70Var == null) {
                            if (ph6Var != null) {
                                String str2 = ph6Var.a;
                                d70Var3 = new d70(str2, c70.f, str2, 2, "");
                            } else {
                                d70Var3 = null;
                            }
                            g06Var.b = d70Var3;
                            if (n3jVar != null) {
                                String str3 = n3jVar.a;
                                d70Var4 = new d70(str3, c70.f, str3, 3, "");
                            }
                            g06Var.c = d70Var4;
                        } else {
                            if (ph6Var != null) {
                                String str4 = ph6Var.a;
                                d70Var2 = new d70(str4, c70.f, str4, 1, "");
                            } else {
                                d70Var2 = null;
                            }
                            g06Var.b = d70Var2;
                            if (n3jVar != null) {
                                String str5 = n3jVar.a;
                                d70Var4 = new d70(str5, c70.f, str5, 2, "");
                            }
                            g06Var.c = d70Var4;
                        }
                        q43.c((q43) g06Var.a, 3);
                        return new d73(oh6Var.g);
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    gg6 gg6Var2 = oh6Var.g;
                    ((pj6) rj6Var).a();
                    return new c73(gg6Var2);
                }
                qj6 qj6Var = (qj6) rj6Var;
                x63 x63Var2 = ((wg6) qj6Var.a).c;
                xzi xziVar = oh6Var.q;
                if (xziVar != null) {
                    ((zri) xziVar.a).a(ksw.O(x63Var2 != null ? u2x.Q(x63Var2) : th6.a));
                }
                ph6 ph6Var2 = ((wg6) qj6Var.a).a;
                if (ph6Var2 != null) {
                    o8q o8qVar = (o8q) oh6Var.f.a;
                    ArrayList arrayList = new ArrayList();
                    Integer num = ph6Var2.b;
                    List list = ph6Var2.d;
                    if (num != null) {
                        if (num.intValue() <= 0) {
                            num = null;
                        }
                        if (num != null) {
                            int intValue = num.intValue();
                            arrayList.add(o8qVar.a.b(R.plurals.plural_n_books, intValue, Arrays.copyOf(new Object[]{Integer.valueOf(intValue)}, 1)));
                        }
                    }
                    Integer num2 = ph6Var2.c;
                    if (num2 != null) {
                        if (num2.intValue() <= 0) {
                            num2 = null;
                        }
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            arrayList.add(o8qVar.a.b(R.plurals.plural_n_podcasts, intValue2, Arrays.copyOf(new Object[]{Integer.valueOf(intValue2)}, 1)));
                        }
                    }
                    String str6 = ph6Var2.a;
                    List w0 = CollectionsKt.w0(arrayList);
                    if (w0.isEmpty()) {
                        w0 = null;
                    }
                    qh6Var = new qh6(str6, w0, (list == null || (u9bVar4 = (u9b) CollectionsKt.firstOrNull(list)) == null) ? null : bcx.I(u9bVar4, wct.s()), (list == null || (u9bVar3 = (u9b) CollectionsKt.S(list, 1)) == null) ? null : bcx.I(u9bVar3, wct.s()));
                } else {
                    qh6Var = null;
                }
                n3j n3jVar2 = ((wg6) qj6Var.a).b;
                if (n3jVar2 != null) {
                    jzi jziVar = oh6Var.f;
                    Integer num3 = n3jVar2.b;
                    List list2 = n3jVar2.c;
                    if (num3 != null) {
                        if (num3.intValue() <= 0) {
                            num3 = null;
                        }
                        if (num3 != null) {
                            int intValue3 = num3.intValue();
                            str = ((o8q) jziVar.a).a.b(R.plurals.plural_n_podcast_tracks, intValue3, Arrays.copyOf(new Object[]{Integer.valueOf(intValue3)}, 1));
                            o3jVar = new o3j(n3jVar2.a, str, (list2 != null || (u9bVar2 = (u9b) CollectionsKt.firstOrNull(list2)) == null) ? null : bcx.I(u9bVar2, wct.s()), (list2 != null || (u9bVar = (u9b) CollectionsKt.S(list2, 1)) == null) ? null : bcx.I(u9bVar, wct.s()));
                        }
                    }
                    str = null;
                    o3jVar = new o3j(n3jVar2.a, str, (list2 != null || (u9bVar2 = (u9b) CollectionsKt.firstOrNull(list2)) == null) ? null : bcx.I(u9bVar2, wct.s()), (list2 != null || (u9bVar = (u9b) CollectionsKt.S(list2, 1)) == null) ? null : bcx.I(u9bVar, wct.s()));
                } else {
                    o3jVar = null;
                }
                xdr xdrVar2 = oh6Var.s;
                xh6 xh6Var = (xh6) oh6Var.r.getValue();
                if (xh6Var == null || (c8lVar = o(xh6Var)) == null) {
                    if (x63Var2 != null) {
                        if (x63Var2 instanceof v63) {
                            lt ltVar2 = ((v63) x63Var2).a;
                            String str7 = ltVar2.c;
                            u9b u9bVar5 = ltVar2.e;
                            c8lVar2 = new c8l(u9bVar5 != null ? u9bVar5.e(wct.s(), WebPath$Storage.AVATARS) : null, str7);
                        } else {
                            if (!(x63Var2 instanceof w63)) {
                                b6e.s();
                                return null;
                            }
                            mqs mqsVar = ((w63) x63Var2).b;
                            c8lVar2 = new c8l(mqsVar.x0.a.getPathForSize(wct.s()), mqsVar.c);
                        }
                        c8lVar = c8lVar2;
                    } else {
                        c8lVar = null;
                    }
                }
                if (((Boolean) oh6Var.l.getValue()).booleanValue()) {
                    c8lVar = null;
                }
                kh6 kh6Var = new kh6(qh6Var, o3jVar, c8lVar);
                xdrVar2.getClass();
                xdrVar2.m(null, kh6Var);
                boolean z2 = x63Var2 == null;
                nh6Var.j = qj6Var;
                nh6Var.m = 2;
                Object a = oh6Var.d.a.a(oh6Var.g, z2, nh6Var);
                if (a != nm6Var) {
                    a = Unit.a;
                }
                if (a != nm6Var) {
                    rj6Var2 = rj6Var;
                    g06 g06Var2 = oh6Var.c;
                    wg6 wg6Var2 = (wg6) ((qj6) rj6Var2).a;
                    wg6Var2.getClass();
                    x63Var = wg6Var2.c;
                    n3j n3jVar3 = wg6Var2.b;
                    if (x63Var != null) {
                    }
                    g06Var2.d = d70Var;
                    ph6 ph6Var3 = wg6Var2.a;
                    if (d70Var == null) {
                    }
                    q43.c((q43) g06Var2.a, 3);
                    return new d73(oh6Var.g);
                }
                return nm6Var;
            }
        }
        nh6Var = new nh6(oh6Var, cg6Var);
        Object obj2 = nh6Var.k;
        nm6 nm6Var2 = nm6.a;
        i = nh6Var.m;
        d70 d70Var42 = null;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }

    public static c8l o(xh6 xh6Var) {
        mqs mqsVar;
        if (xh6Var instanceof sh6) {
            sh6 sh6Var = (sh6) xh6Var;
            oq oqVar = sh6Var.a;
            return new c8l(oqVar.o.getPathForSize(wct.s()), (!u2x.J(oqVar) || (mqsVar = sh6Var.b) == null) ? oqVar.b : mqsVar.c);
        }
        if (Intrinsics.d(xh6Var, th6.a)) {
            return null;
        }
        if (xh6Var instanceof uh6) {
            mqs mqsVar2 = ((uh6) xh6Var).b;
            return new c8l(mqsVar2.x0.a.getPathForSize(wct.s()), mqsVar2.c);
        }
        if (xh6Var instanceof vh6) {
            mqs mqsVar3 = ((vh6) xh6Var).b;
            return new c8l(mqsVar3.p.getPathForSize(wct.s()), mqsVar3.d.d);
        }
        if (xh6Var instanceof wh6) {
            mqs mqsVar4 = ((wh6) xh6Var).a;
            return new c8l(mqsVar4.x0.a.getPathForSize(wct.t()), mqsVar4.c);
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.g;
    }

    @Override // defpackage.ayd
    public final void b(boolean z) {
        v3w.n(z, this.l, null);
        Object ih6Var = z ? new ih6() : new jh6();
        xdr xdrVar = this.s;
        xdrVar.getClass();
        xdrVar.m(null, ih6Var);
    }

    @Override // defpackage.wmm
    public final void cancel() {
        ssg.a(3, this.h, hrg.q("Block cancel[", this.g.a.a, "]"), null);
        rar rarVar = this.j;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.j = null;
        n();
    }

    @Override // defpackage.wmm
    public final void h() {
        ssg.a(3, this.h, vz1.p("Block reset[", this.g.a.a, "]: ready=", this.s.getValue() instanceof kh6), null);
        cancel();
        this.i = true;
    }

    @Override // defpackage.wmm
    public final void k(kzp kzpVar) {
        this.k = kzpVar;
    }

    @Override // defpackage.wmm
    public final void l(mm6 mm6Var) {
        rar rarVar;
        rar rarVar2;
        rar rarVar3;
        if (this.q == null) {
            this.q = (xzi) this.e.invoke(mm6Var);
        }
        n();
        xzi xziVar = this.q;
        Continuation continuation = null;
        if (xziVar != null) {
            pjc fsVar = new fs(9, new z78(new bca(((zri) xziVar.a).f, 18), 2));
            if (!(fsVar instanceof cu3)) {
                fsVar = new eu3(fsVar);
            }
            rarVar = ox6.B((cu3) fsVar, mm6Var, new mh6(this, 0));
        } else {
            rarVar = null;
        }
        this.m = rarVar;
        xzi xziVar2 = this.q;
        int i = 3;
        if (xziVar2 != null) {
            zri zriVar = (zri) xziVar2.a;
            pjc emVar = new em(new u21(10, zriVar.f, zriVar.b.a.c, new t81(i, 12, continuation)), 5);
            if (!(emVar instanceof cu3)) {
                emVar = new eu3(emVar);
            }
            rarVar2 = ox6.B((cu3) emVar, mm6Var, new mh6(this, 1));
        } else {
            rarVar2 = null;
        }
        this.n = rarVar2;
        xzi xziVar3 = this.q;
        if (xziVar3 != null) {
            zri zriVar2 = (zri) xziVar3.a;
            pjc M0 = zsd.M0(new em(new u21(10, zriVar2.f, zriVar2.b.a.c, new t81(i, 12, continuation)), 5), new yri(continuation, zriVar2, 0));
            if (!(M0 instanceof cu3)) {
                M0 = new eu3(M0);
            }
            rarVar3 = ox6.B((cu3) M0, mm6Var, new mh6(this, 2));
        } else {
            rarVar3 = null;
        }
        this.o = rarVar3;
        xzi xziVar4 = this.q;
        this.p = xziVar4 != null ? ox6.B(new kvh((j0q) ((zri) xziVar4.a).a.f, 7), mm6Var, new mh6(this, 3)) : null;
        rar rarVar4 = this.j;
        if (rarVar4 == null || !rarVar4.b()) {
            if (this.i || !(this.s.getValue() instanceof kh6)) {
                String str = this.h;
                String str2 = this.g.a.a;
                boolean z = this.i;
                boolean z2 = this.s.getValue() instanceof kh6;
                StringBuilder h = v3w.h("Block load[", str2, "]: force=", " ready=", z);
                h.append(z2);
                ssg.a(3, str, h.toString(), null);
                rar rarVar5 = this.j;
                if (rarVar5 != null) {
                    rarVar5.g(null);
                }
                this.j = x97.y(mm6Var, dm6.b, null, new ja4(this, continuation, 19), 2);
            }
        }
    }

    public final void n() {
        rar rarVar = this.m;
        if (rarVar != null) {
            rarVar.g(null);
        }
        rar rarVar2 = this.n;
        if (rarVar2 != null) {
            rarVar2.g(null);
        }
        rar rarVar3 = this.o;
        if (rarVar3 != null) {
            rarVar3.g(null);
        }
        rar rarVar4 = this.p;
        if (rarVar4 != null) {
            rarVar4.g(null);
        }
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
    }
}
