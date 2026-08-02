package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes3.dex */
public final class mj1 extends bfu {
    public static final /* synthetic */ s9f[] I;
    public final j0q A;
    public final j0q B;
    public final jyr C;
    public u51 D;
    public c01 E;
    public final z6n F;
    public final z6n G;
    public wh1 H;
    public final bk1 k;
    public final arf l;
    public final arf m;
    public final arf n;
    public final arf o;
    public final arf p;
    public final arf q;
    public final arf r;
    public final xdr s;
    public final fkn t;
    public final xdr u;
    public final fkn v;
    public final jyr w;
    public final fkn x;
    public final j0q y;
    public final xdr z;

    static {
        opi opiVar = new opi(mj1.class, "job", "getJob()Lkotlinx/coroutines/Job;", 0);
        ern.a.getClass();
        I = new s9f[]{opiVar, new opi(mj1.class, "headerJob", "getHeaderJob()Lkotlinx/coroutines/Job;", 0)};
    }

    public mj1(u51 u51Var, qi1 qi1Var, kxi kxiVar, String str, bk1 bk1Var, e00 e00Var) {
        jyr b = e00Var.b(hag.I(z91.class), true);
        jyr b2 = e00Var.b(hag.I(ja1.class), true);
        jyr b3 = e00Var.b(hag.I(z66.class), true);
        jyr b4 = e00Var.b(hag.I(gj1.class), true);
        jyr b5 = e00Var.b(hag.I(ab1.class), true);
        jyr b6 = e00Var.b(hag.I(z3g.class), true);
        jyr b7 = e00Var.b(hag.I(a68.class), true);
        u51Var.getClass();
        qi1Var.getClass();
        kxiVar.getClass();
        e00Var.getClass();
        this.k = bk1Var;
        this.l = b;
        this.m = b2;
        this.n = b3;
        this.o = b4;
        this.p = b5;
        this.q = b6;
        this.r = b7;
        xdr a = ydr.a(bj1.a);
        this.s = a;
        this.t = new fkn(a);
        this.u = bk1Var.l;
        this.v = lg3.u0(new ez(zsd.b0(((z3g) b6.getValue()).a()), 10), ot0.F(this), new tzf(0, false));
        jyr b8 = btf.b(new hb(25, e00Var, this));
        this.w = b8;
        pjc d = ((yzk) b8.getValue()).d();
        cq4 F = ot0.F(this);
        Boolean bool = Boolean.FALSE;
        this.x = lg3.u0(d, F, bool);
        this.y = ((yzk) b8.getValue()).c();
        this.z = ydr.a(bool);
        this.A = new j0q();
        this.B = new j0q();
        this.C = btf.b(new hb(26, kxiVar, e00Var));
        this.D = u51Var;
        this.E = G(null);
        this.F = new z6n(7);
        this.G = new z6n(7);
        boolean f = ((z66) b3.getValue()).f();
        this.H = (qi1Var == qi1.a && f) ? wh1.a : (qi1Var == qi1.b && f) ? wh1.c : wh1.b;
        H(this, str, 2);
        ox6.B(zsd.b0(zsd.d0(((z66) b3.getValue()).c(), 1)), ot0.F(this), new ri(14, this));
    }

    public static void H(mj1 mj1Var, String str, int i) {
        Continuation continuation = null;
        String str2 = (i & 1) != 0 ? null : str;
        boolean z = (i & 2) == 0;
        int ordinal = mj1Var.H.ordinal();
        s9f[] s9fVarArr = I;
        if (ordinal == 0) {
            mj1Var.G.setValue(mj1Var, s9fVarArr[1], x97.y(ot0.F(mj1Var), null, null, new kj1(mj1Var, z, continuation, 0), 3));
            mj1Var.k.G(mj1Var.H, str2, z);
        } else if (ordinal == 1 || ordinal == 2) {
            mj1Var.F.setValue(mj1Var, s9fVarArr[0], x97.y(ot0.F(mj1Var), null, null, new cg1(mj1Var, z, str2, continuation, 1), 3));
        } else {
            b6e.s();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e9, code lost:
    
        if (r13 == r2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0111, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010f, code lost:
    
        if (r13 == r2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x006f, code lost:
    
        if (r13 == r2) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(mj1 mj1Var, boolean z, cg6 cg6Var) {
        jj1 jj1Var;
        int i;
        rj6 rj6Var;
        ka1 ka1Var;
        List list;
        arf arfVar = mj1Var.m;
        if (cg6Var instanceof jj1) {
            jj1Var = (jj1) cg6Var;
            int i2 = jj1Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jj1Var.m = i2 - Integer.MIN_VALUE;
                Object obj = jj1Var.k;
                nm6 nm6Var = nm6.a;
                i = jj1Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    u51 u51Var = mj1Var.D;
                    u51Var.getClass();
                    if (!xv7.C(u51Var.a)) {
                        return new zi1(false);
                    }
                    z91 z91Var = (z91) mj1Var.l.getValue();
                    String str = mj1Var.D.a;
                    wh1 wh1Var = mj1Var.H;
                    jj1Var.j = z;
                    jj1Var.m = 1;
                    obj = z91Var.a(str, wh1Var, z, jj1Var);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            ka1Var = (ka1) obj;
                            return new cj1(ka1Var);
                        }
                        if (i == 3) {
                            qgg.h0(obj);
                            return new aj1((ka1) obj);
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = jj1Var.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                ka1Var = null;
                if (rj6Var instanceof qj6) {
                    if (rj6Var instanceof pj6) {
                        ssg.a(3, "ArtistScreenViewModel", "Header Load Error", null);
                        return new zi1(mj1Var.H == wh1.b);
                    }
                    b6e.s();
                    return null;
                }
                s91 s91Var = (s91) ((qj6) rj6Var).a;
                r51 r51Var = s91Var.i;
                u51 u51Var2 = s91Var.a;
                mj1Var.D = u51Var2;
                if (r51Var != null) {
                    return new dj1(r51Var.a);
                }
                a68 a68Var = (a68) mj1Var.r.getValue();
                a68Var.getClass();
                gd6 gd6Var = u51Var2.e;
                if (((gd6Var == null || (list = gd6Var.a) == null) ? null : lxe.p(list, gs5.f)) != null) {
                    long b = a68Var.a.b();
                    Object obj2 = a68Var.c.get(u51Var2.a);
                    if (obj2 == null) {
                        obj2 = 0L;
                    }
                    if (b - ((Number) obj2).longValue() > 900000) {
                        if (gd6Var == null || gd6Var.c) {
                            mj1Var.J(s91Var);
                            ja1 ja1Var = (ja1) arfVar.getValue();
                            jj1Var.j = z;
                            jj1Var.m = 2;
                            obj = ja1Var.a(s91Var, jj1Var);
                        }
                        return new cj1(ka1Var);
                    }
                }
                if (gd6Var != null && !gd6Var.c) {
                    return ej1.a;
                }
                mj1Var.J(s91Var);
                ja1 ja1Var2 = (ja1) arfVar.getValue();
                jj1Var.j = z;
                jj1Var.m = 3;
                obj = ja1Var2.a(s91Var, jj1Var);
            }
        }
        jj1Var = new jj1(mj1Var, cg6Var);
        Object obj3 = jj1Var.k;
        nm6 nm6Var2 = nm6.a;
        i = jj1Var.m;
        if (i != 0) {
        }
        rj6Var = (rj6) obj3;
        ka1Var = null;
        if (rj6Var instanceof qj6) {
        }
    }

    public final c01 G(s91 s91Var) {
        List list;
        String str;
        u51 u51Var = s91Var != null ? s91Var.a : this.D;
        String str2 = u51Var.a;
        String str3 = u51Var.b;
        CoverPath M = kg5.M(u51Var.c, WebPath$Storage.AVATARS);
        jzb jzbVar = u51Var.f;
        if (jzbVar == null || (list = t75.c(jzbVar.a)) == null) {
            list = c5b.a;
        }
        return new c01(str2, str3, false, false, (s91Var == null || (str = s91Var.h) == null) ? null : new b01(str), s91Var != null ? s91Var.d : 0, null, M, null, list, null, s91Var != null && s91Var.f, 23452);
    }

    public final void J(s91 s91Var) {
        this.E = G(s91Var);
        ((z3g) this.q.getValue()).b(this.E);
        if (this.H == wh1.a) {
            yzk yzkVar = (yzk) this.w.getValue();
            u51 P = ghh.P(this.E);
            w90 w90Var = new w90(this, s91Var, null, 3);
            yzkVar.getClass();
            xdr xdrVar = yzkVar.e;
            azk azkVar = new azk(P, null, w90Var, t3q.b(yzkVar.b));
            xdrVar.getClass();
            xdrVar.m(null, azkVar);
        }
        q43.c(((o11) this.C.getValue()).a(), 1);
    }
}
