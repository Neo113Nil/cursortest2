package defpackage;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes4.dex */
public final class qvk {
    public final Object a;
    public Object b;
    public Object c;
    public final Object d;
    public volatile Object e;

    public qvk() {
        this.c = hld.i;
        this.e = my7.b;
        this.a = (z5l) sk3.I(z5l.class);
        this.d = new xdh((oq7) sk3.I(oq7.class));
    }

    public static boolean c(mwk mwkVar) {
        return !((Boolean) dag.p(mwkVar, e88.g)).booleanValue();
    }

    public void a(h88 h88Var) {
        this.c = h88Var;
        xdh xdhVar = (xdh) this.d;
        e0l e0lVar = new e0l(this);
        oq7 oq7Var = (oq7) xdhVar.a;
        Object obj = (r2f) xdhVar.d;
        if (obj == null) {
            obj = ox6.B(zsd.Q(zsd.b0(new kvh((xdr) xdhVar.c, 29)), zsd.b0(new a1l(oq7Var.b.f, 0)), oq7Var.a.c, new kdd(4, 2, (Continuation) null)), (tf6) xdhVar.b, new fmi(22, e0lVar));
        }
        xdhVar.d = obj;
    }

    public void b() {
        this.c = hld.i;
        r2f r2fVar = (r2f) ((xdh) this.d).d;
        if (r2fVar != null) {
            r2fVar.g(null);
        }
    }

    public void d(n7q n7qVar, long j) {
        n7qVar.getClass();
        if (c(n7qVar.b())) {
            return;
        }
        suk sukVar = (suk) this.a;
        msa msaVar = nsa.b;
        long N = yd5.N(j, ssa.MILLISECONDS);
        tvk tvkVar = ((yuk) sukVar).g;
        svk svkVar = tvkVar.r;
        if (svkVar == svk.a) {
            return;
        }
        if (svkVar == svk.c) {
            tvkVar.m = Boolean.TRUE;
        }
        ssg.a(4, tvkVar.b, "paused at ".concat(nsa.t(N)), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(g4q g4qVar, n7q n7qVar, long j, boolean z) {
        boolean z2;
        mvk mvkVar;
        Iterator it = ((List) this.b).iterator();
        while (it.hasNext()) {
            ((nqj) it.next()).a(n7qVar);
        }
        if (c(n7qVar.b())) {
            return;
        }
        boolean booleanValue = ((Boolean) wdg.A(n7qVar, l48.g)).booleanValue();
        if (g4qVar == null || !booleanValue) {
            this.e = null;
        } else if (!Intrinsics.d((g4q) this.e, g4qVar)) {
            this.e = g4qVar;
            z2 = true;
            ime imeVar = (ime) this.d;
            imeVar.getClass();
            mvkVar = (mvk) dag.p(n7qVar.b(), new nvk(imeVar, n7qVar, j, z, z2));
            if (mvkVar == null) {
                yuk yukVar = (yuk) ((suk) this.a);
                yukVar.a(null, tss.InProgress, false, "");
                tvk tvkVar = yukVar.g;
                tvkVar.getClass();
                String str = tvkVar.b;
                if (tvkVar.r != svk.a) {
                    dfi.r("Play prepared without play end", str);
                }
                String str2 = mvkVar.y;
                if (Intrinsics.d(str2, CommonUrlParts.Values.FALSE_INTEGER)) {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = mvkVar.g;
                }
                v3w.l("preparing next play for ", str2, 4, str, null);
                tvkVar.h();
                tvkVar.r = svk.b;
                tvkVar.e = mvkVar;
                tvkVar.i = tvkVar.b(mvkVar.d);
                msa msaVar = nsa.b;
                ewk d = tvkVar.d();
                if (d != null) {
                    d.d = mvkVar.n == null ? new dwk(mvkVar, tvkVar.i) : null;
                }
                tvkVar.i(mvkVar, lvk.Begin);
                ruk a = yukVar.g.a();
                if (a != null) {
                    yukVar.c(a);
                    return;
                }
                return;
            }
            return;
        }
        z2 = false;
        ime imeVar2 = (ime) this.d;
        imeVar2.getClass();
        mvkVar = (mvk) dag.p(n7qVar.b(), new nvk(imeVar2, n7qVar, j, z, z2));
        if (mvkVar == null) {
        }
    }

    public void f(n7q n7qVar, long j, long j2) {
        dwk dwkVar;
        n7qVar.getClass();
        if (c(n7qVar.b())) {
            return;
        }
        yuk yukVar = (yuk) ((suk) this.a);
        tvk tvkVar = yukVar.g;
        svk svkVar = tvkVar.r;
        nsa nsaVar = null;
        if (svkVar != svk.a) {
            if (svkVar == svk.c) {
                tvkVar.l = Boolean.TRUE;
            }
            ssg.a(4, tvkVar.b, hrg.r("seeked from ", nsa.t(j), " to ", nsa.t(j2)), null);
            long b = tvkVar.b(j);
            long b2 = tvkVar.b(j2);
            ewk d = tvkVar.d();
            if (d != null && (dwkVar = d.d) != null) {
                dwkVar.b(b, b2);
            }
            nsaVar = new nsa(tvkVar.f(nsa.n(b, tvkVar.i), b2));
        }
        if (nsaVar == null || nsa.c(nsaVar.a, yukVar.i) <= 0) {
            return;
        }
        ruk a = tvkVar.a();
        tvkVar.k = yd5.M(0, ssa.MILLISECONDS);
        if (a != null) {
            yukVar.c(a);
        }
    }

    public void g(n7q n7qVar) {
        ruk a;
        long j;
        n7qVar.getClass();
        Iterator it = ((List) this.b).iterator();
        while (it.hasNext()) {
            ((nqj) it.next()).a(n7qVar);
        }
        if (c(n7qVar.b())) {
            return;
        }
        yuk yukVar = (yuk) ((suk) this.a);
        tvk tvkVar = yukVar.g;
        String str = tvkVar.b;
        svk svkVar = tvkVar.r;
        svk svkVar2 = svk.c;
        ruk rukVar = null;
        if (svkVar != svkVar2) {
            if (svkVar != svk.b) {
                dfi.r("Play started without prepare", str);
            }
            mvk mvkVar = tvkVar.e;
            if (mvkVar != null) {
                String str2 = mvkVar.y;
                String str3 = !Intrinsics.d(str2, CommonUrlParts.Values.FALSE_INTEGER) ? str2 : null;
                if (str3 == null) {
                    str3 = mvkVar.g;
                }
                v3w.l("starting play for ", str3, 4, str, null);
                String str4 = !Intrinsics.d(str2, CommonUrlParts.Values.FALSE_INTEGER) ? str2 : null;
                String str5 = mvkVar.x;
                tvkVar.e = new mvk(str4, !Intrinsics.d(str5, CommonUrlParts.Values.FALSE_INTEGER) ? str5 : null, mvkVar.a, mvkVar.b, mvkVar.c, tvkVar.i, mvkVar.e, mvkVar.f, mvkVar.g, mvkVar.h, mvkVar.i, mvkVar.j, mvkVar.k, mvkVar.l, mvkVar.m, mvkVar.n, mvkVar.o, mvkVar.p, mvkVar.q, mvkVar.r, mvkVar.s, mvkVar.t, mvkVar.u, mvkVar.v, mvkVar.w);
                tvkVar.r = svkVar2;
                msa msaVar = nsa.b;
                Date date = new Date(System.currentTimeMillis());
                gbk[] gbkVarArr = gbk.a;
                tvkVar.n = new bgs("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ", null, 6).a(date);
                Boolean bool = Boolean.FALSE;
                tvkVar.l = bool;
                tvkVar.m = bool;
                ewk d = tvkVar.d();
                if (d != null) {
                    long j2 = tvkVar.i;
                    dwk dwkVar = d.d;
                    if (dwkVar != null) {
                        nsa nsaVar = dwkVar.a.e;
                        dwkVar.b = j2;
                        dwkVar.h = j2;
                        dwkVar.c.append(dfi.e(nsa.f(j2), "s:", ";"));
                        dwkVar.g = null;
                        if (nsa.c(j2, yd5.M(0, ssa.MILLISECONDS)) < 0) {
                            dwkVar.a("r:startLessZero;");
                        } else {
                            if (nsaVar != null) {
                                j = nsaVar.a;
                            } else {
                                nsa.b.getClass();
                                j = nsa.c;
                            }
                            if (nsa.c(j2, j) > 0) {
                                dwkVar.a("r:startGreaterDuration:" + (nsaVar != null ? Long.valueOf(nsa.f(nsaVar.a)) : null) + ";");
                            }
                        }
                    }
                }
                rukVar = tvkVar.i(mvkVar, lvk.Begin);
            }
        }
        if (rukVar == null || (a = tvkVar.a()) == null) {
            return;
        }
        yukVar.c(a);
    }

    public void h(n7q n7qVar, long j, boolean z, mpl mplVar) {
        String str;
        long N;
        tss tssVar;
        n7qVar.getClass();
        mplVar.getClass();
        mwk b = n7qVar.b();
        if (c(b)) {
            return;
        }
        if (((Boolean) ((tuk) this.c).a.a.invoke()).booleanValue() || !((Boolean) o8g.i(n7qVar.g().getId(), new wvo(25))).booleanValue()) {
            str = "plain";
        } else {
            if (j < 100) {
                j = 100;
            }
            str = "coerced";
        }
        mqs a = b.a();
        if (!z || a == null) {
            msa msaVar = nsa.b;
            N = yd5.N(j, ssa.MILLISECONDS);
        } else {
            msa msaVar2 = nsa.b;
            N = yd5.N(a.e, ssa.MILLISECONDS);
            str = "duration";
        }
        suk sukVar = (suk) this.a;
        if (mplVar.equals(ipl.a)) {
            tssVar = tss.Skip;
        } else if (mplVar.equals(bpl.a)) {
            tssVar = tss.BackSkip;
        } else if (mplVar.equals(jpl.a)) {
            tssVar = tss.OtherSelected;
        } else if (mplVar.equals(fpl.a)) {
            tssVar = tss.Like;
        } else if (mplVar.equals(cpl.a)) {
            tssVar = tss.Dislike;
        } else if (mplVar.equals(dpl.a)) {
            tssVar = tss.Finish;
        } else if (mplVar.equals(epl.a)) {
            tssVar = tss.Error;
        } else if (mplVar.equals(gpl.a)) {
            tssVar = tss.Skip;
        } else if (mplVar.equals(hpl.a)) {
            tssVar = tss.OtherSelected;
        } else if (mplVar.equals(kpl.a)) {
            tssVar = tss.InProgress;
        } else if (mplVar.equals(apl.a)) {
            tssVar = tss.OtherSelected;
        } else if (mplVar.equals(yol.a)) {
            tssVar = tss.InProgress;
        } else {
            if (!mplVar.equals(zol.a)) {
                b6e.s();
                return;
            }
            tssVar = tss.Finish;
        }
        ((yuk) sukVar).a(new nsa(N), tssVar, ((Boolean) o8g.i(n7qVar.g().getId(), new wvo(25))).booleanValue() || ((Boolean) o8g.i(n7qVar.g().getId(), new e3s(25))).booleanValue(), str);
    }

    public void i(v8n v8nVar) {
        ryk rykVar = uyk.a;
        this.e = new my7(v8nVar);
        xdh xdhVar = (xdh) this.d;
        xdhVar.getClass();
        v8nVar.getClass();
        xdr xdrVar = (xdr) xdhVar.c;
        xdrVar.getClass();
        xdrVar.m(null, v8nVar);
        v8n v8nVar2 = ((my7) this.e).a;
        if (v8nVar2 == null) {
            Assertions.fail();
            return;
        }
        yk3 d = ((z5l) this.a).d(v8nVar2, true, rykVar);
        jd jdVar = (jd) this.b;
        uvg uvgVar = new uvg(23, this);
        if (jdVar != null) {
            d.m(jdVar, uvgVar);
        } else {
            d.k(uvgVar);
        }
    }

    public qvk(suk sukVar, dn9 dn9Var, List list, tuk tukVar) {
        this.a = sukVar;
        this.b = list;
        this.c = tukVar;
        this.d = new ime(dn9Var);
    }
}
