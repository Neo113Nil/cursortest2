package D0;

import com.google.android.gms.internal.ads.AbstractC2792Sd;
import com.google.android.gms.internal.ads.C3052cO;
import com.google.android.gms.internal.ads.C3912sO;
import com.google.android.gms.internal.ads.C3941t;
import com.google.android.gms.internal.ads.DP;
import com.google.android.gms.internal.ads.InterfaceC3351i0;
import com.google.android.gms.internal.ads.InterfaceC3780q;
import com.google.android.gms.internal.ads.Is;
import com.google.android.gms.internal.ads.LQ;
import com.google.android.gms.internal.ads.SP;
import java.util.Objects;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public int f430a;

    /* renamed from: b, reason: collision with root package name */
    public int f431b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f432c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f433d;

    /* renamed from: e, reason: collision with root package name */
    public Object f434e;

    /* renamed from: f, reason: collision with root package name */
    public Object f435f;

    public static boolean l(SP sp) {
        return sp.f28196A != 0;
    }

    public static final void n(SP sp) {
        int i = sp.f28196A;
        if (i == 2) {
            AbstractC2792Sd.H(i == 2);
            sp.f28196A = 1;
            sp.e();
        }
    }

    public void A(long j6, long j9) {
        SP sp = (SP) this.f434e;
        if (l(sp)) {
            sp.H(j6, j9);
        }
        SP sp2 = (SP) this.f435f;
        if (sp2 == null || sp2.f28196A == 0) {
            return;
        }
        sp2.H(j6, j9);
    }

    public boolean B(C3052cO c3052cO) {
        SP m9 = m(c3052cO);
        return m9 == null || m9.r0() || m9.I() || m9.J();
    }

    public void C() {
        int i;
        SP sp = (SP) this.f434e;
        int i4 = sp.f28196A;
        if (i4 == 1 && this.f431b != 4) {
            AbstractC2792Sd.H(i4 == 1);
            sp.f28196A = 2;
            sp.d();
            return;
        }
        SP sp2 = (SP) this.f435f;
        if (sp2 == null || (i = sp2.f28196A) != 1 || this.f431b == 3) {
            return;
        }
        AbstractC2792Sd.H(i == 1);
        sp2.f28196A = 2;
        sp2.d();
    }

    public void a() {
        int i = this.f431b;
        if (i != 3 && i != 4) {
            if (i == 2) {
                this.f431b = 0;
                return;
            }
            return;
        }
        boolean z6 = i == 4;
        SP sp = (SP) this.f434e;
        SP sp2 = (SP) this.f435f;
        if (z6) {
            sp2.getClass();
            sp2.b(17, sp);
        } else {
            sp2.getClass();
            sp.b(17, sp2);
        }
        this.f431b = this.f431b != 4 ? 1 : 0;
    }

    public void b() {
        if (!l((SP) this.f434e)) {
            j(true);
        }
        SP sp = (SP) this.f435f;
        if (sp == null || sp.f28196A != 0) {
            return;
        }
        j(false);
    }

    public int c(C3052cO c3052cO, C3941t c3941t, Is is) {
        int k9 = k((SP) this.f434e, c3052cO, c3941t, is);
        return k9 == 1 ? k((SP) this.f435f, c3052cO, c3941t, is) : k9;
    }

    public void d() {
        SP sp = (SP) this.f434e;
        AbstractC2792Sd.H(sp.f28196A == 0);
        sp.k();
        this.f432c = false;
        SP sp2 = (SP) this.f435f;
        if (sp2 != null) {
            AbstractC2792Sd.H(sp2.f28196A == 0);
            sp2.k();
            this.f433d = false;
        }
    }

    public void e(Object obj) {
        SP sp = (SP) this.f434e;
        if (sp.f28261u != 2) {
            return;
        }
        int i = this.f431b;
        if (i != 4 && i != 1) {
            sp.b(1, obj);
            return;
        }
        SP sp2 = (SP) this.f435f;
        sp2.getClass();
        sp2.b(1, obj);
    }

    public void f(InterfaceC3351i0 interfaceC3351i0) {
        SP sp = (SP) this.f434e;
        if (sp.f28261u != 2) {
            return;
        }
        sp.b(7, interfaceC3351i0);
        SP sp2 = (SP) this.f435f;
        if (sp2 != null) {
            sp2.b(7, interfaceC3351i0);
        }
    }

    public boolean g() {
        int i = this.f431b;
        if (i == 0 || i == 2 || i == 4) {
            return l((SP) this.f434e);
        }
        SP sp = (SP) this.f435f;
        sp.getClass();
        return sp.f28196A != 0;
    }

    public boolean h(C3052cO c3052cO, SP sp) {
        if (sp == null) {
            return true;
        }
        LQ[] lqArr = c3052cO.f30258c;
        int i = this.f430a;
        LQ lq = lqArr[i];
        LQ lq2 = sp.f28198B;
        if (lq2 == null) {
            return true;
        }
        if (lq2 == lq && (lq == null || sp.r0())) {
            return true;
        }
        C3052cO c3052cO2 = c3052cO.f30267m;
        return c3052cO2 != null && c3052cO2.f30258c[i] == sp.f28198B;
    }

    public void i(SP sp, Is is) {
        AbstractC2792Sd.H(((SP) this.f434e) == sp || ((SP) this.f435f) == sp);
        if (l(sp)) {
            if (sp == ((SP) is.f26364x)) {
                is.f26365y = null;
                is.f26364x = null;
                is.f26360n = true;
            }
            n(sp);
            AbstractC2792Sd.H(sp.f28196A == 1);
            S0.l lVar = sp.f28263v;
            lVar.f2926u = null;
            lVar.f2927v = null;
            sp.f28196A = 0;
            sp.f28198B = null;
            sp.f28200C = null;
            sp.f28207G = false;
            sp.f();
            sp.J = null;
            sp.f28214K = com.anythink.basead.exoplayer.b.f7168b;
        }
    }

    public void j(boolean z6) {
        if (z6) {
            if (this.f432c) {
                SP sp = (SP) this.f434e;
                AbstractC2792Sd.H(sp.f28196A == 0);
                S0.l lVar = sp.f28263v;
                lVar.f2926u = null;
                lVar.f2927v = null;
                sp.i();
                this.f432c = false;
                return;
            }
            return;
        }
        if (this.f433d) {
            SP sp2 = (SP) this.f435f;
            sp2.getClass();
            AbstractC2792Sd.H(sp2.f28196A == 0);
            S0.l lVar2 = sp2.f28263v;
            lVar2.f2926u = null;
            lVar2.f2927v = null;
            sp2.i();
            this.f433d = false;
        }
    }

    public int k(SP sp, C3052cO c3052cO, C3941t c3941t, Is is) {
        int i;
        if (sp != null && sp.f28196A != 0) {
            SP sp2 = (SP) this.f434e;
            boolean z6 = sp != sp2;
            if (sp == sp2 && ((i = this.f431b) == 2 || i == 4)) {
                return 1;
            }
            if (sp == ((SP) this.f435f) && this.f431b == 3) {
                return 1;
            }
            LQ lq = sp.f28198B;
            LQ[] lqArr = c3052cO.f30258c;
            int i4 = this.f430a;
            LQ lq2 = lqArr[i4];
            boolean c9 = c3941t.c(i4);
            if (!c9 || lq != lq2) {
                if (!sp.f28207G) {
                    InterfaceC3780q interfaceC3780q = ((InterfaceC3780q[]) c3941t.f34965v)[i4];
                    int d9 = interfaceC3780q != null ? interfaceC3780q.d() : 0;
                    DP[] dpArr = new DP[d9];
                    for (int i6 = 0; i6 < d9; i6++) {
                        interfaceC3780q.getClass();
                        dpArr[i6] = interfaceC3780q.x(i6);
                    }
                    LQ lq3 = lqArr[i4];
                    lq3.getClass();
                    sp.p0(dpArr, lq3, c3052cO.a(), c3052cO.f30270p, c3052cO.f30262g.f30532a);
                    return 3;
                }
                if (!sp.J()) {
                    return 0;
                }
                i(sp, is);
                if (!c9 || q()) {
                    j(!z6);
                    return 1;
                }
            }
        }
        return 1;
    }

    public SP m(C3052cO c3052cO) {
        if (c3052cO != null) {
            LQ lq = c3052cO.f30258c[this.f430a];
            if (lq != null) {
                SP sp = (SP) this.f434e;
                if (sp.f28198B == lq) {
                    return sp;
                }
                SP sp2 = (SP) this.f435f;
                if (sp2 != null && sp2.f28198B == lq) {
                    return sp2;
                }
            }
        }
        return null;
    }

    public boolean o() {
        return ((SP) this.f435f) != null;
    }

    public void p() {
        int i;
        AbstractC2792Sd.H(!q());
        if (l((SP) this.f434e)) {
            i = 3;
        } else {
            i = 2;
            SP sp = (SP) this.f435f;
            if (sp != null && sp.f28196A != 0) {
                i = 4;
            }
        }
        this.f431b = i;
    }

    public boolean q() {
        int i = this.f431b;
        return i == 2 || i == 4 || i == 3;
    }

    public int r() {
        boolean l9 = l((SP) this.f434e);
        int i = 0;
        SP sp = (SP) this.f435f;
        if (sp != null && sp.f28196A != 0) {
            i = 1;
        }
        return (l9 ? 1 : 0) + i;
    }

    public boolean s(C3052cO c3052cO) {
        SP m9 = m(c3052cO);
        m9.getClass();
        return m9.r0();
    }

    public void t(C3052cO c3052cO) {
        SP m9 = m(c3052cO);
        m9.getClass();
        m9.f28207G = true;
    }

    public void u(C3941t c3941t, C3941t c3941t2) {
        int i;
        int i4 = this.f430a;
        boolean c9 = c3941t.c(i4);
        boolean c10 = c3941t2.c(i4);
        SP sp = (SP) this.f434e;
        SP sp2 = (SP) this.f435f;
        if (sp2 == null || (i = this.f431b) == 3 || (i == 0 && l(sp))) {
            sp2 = sp;
        }
        if (!c9 || sp2.f28207G) {
            return;
        }
        int i6 = sp.f28261u;
        C3912sO c3912sO = ((C3912sO[]) c3941t.f34964u)[i4];
        C3912sO c3912sO2 = ((C3912sO[]) c3941t2.f34964u)[i4];
        if (c10 && Objects.equals(c3912sO2, c3912sO) && !q()) {
            return;
        }
        sp2.f28207G = true;
    }

    public void v() {
        int i;
        SP sp = (SP) this.f434e;
        if (l(sp) && (i = this.f431b) != 4 && i != 2) {
            sp.f28207G = true;
        }
        SP sp2 = (SP) this.f435f;
        if (sp2 == null || sp2.f28196A == 0 || this.f431b == 3) {
            return;
        }
        sp2.f28207G = true;
    }

    public void w() {
        SP sp = (SP) this.f434e;
        if (l(sp)) {
            sp.s();
            return;
        }
        SP sp2 = (SP) this.f435f;
        if (sp2 == null || sp2.f28196A == 0) {
            return;
        }
        sp2.s();
    }

    public boolean x() {
        SP sp = (SP) this.f434e;
        boolean J = l(sp) ? sp.J() : true;
        SP sp2 = (SP) this.f435f;
        return (sp2 == null || sp2.f28196A == 0) ? J : J & sp2.J();
    }

    public boolean y(C3052cO c3052cO) {
        int i = this.f431b;
        return ((i == 2 || i == 4) && m(c3052cO) == ((SP) this.f434e)) || (this.f431b == 3 && m(c3052cO) == ((SP) this.f435f));
    }

    public boolean z(C3052cO c3052cO) {
        return h(c3052cO, (SP) this.f434e) && h(c3052cO, (SP) this.f435f);
    }
}
