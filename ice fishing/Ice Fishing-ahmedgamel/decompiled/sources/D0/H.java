package D0;

import com.google.android.gms.internal.ads.AbstractC2772Sd;
import com.google.android.gms.internal.ads.C3029cO;
import com.google.android.gms.internal.ads.C3889sO;
import com.google.android.gms.internal.ads.C3918t;
import com.google.android.gms.internal.ads.DP;
import com.google.android.gms.internal.ads.IQ;
import com.google.android.gms.internal.ads.InterfaceC3328i0;
import com.google.android.gms.internal.ads.InterfaceC3757q;
import com.google.android.gms.internal.ads.Is;
import com.google.android.gms.internal.ads.RP;
import java.util.Objects;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public int f535a;

    /* renamed from: b, reason: collision with root package name */
    public int f536b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f537c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f538d;

    /* renamed from: e, reason: collision with root package name */
    public Object f539e;

    /* renamed from: f, reason: collision with root package name */
    public Object f540f;

    public static boolean l(RP rp) {
        return rp.f27206A != 0;
    }

    public static final void n(RP rp) {
        int i = rp.f27206A;
        if (i == 2) {
            AbstractC2772Sd.H(i == 2);
            rp.f27206A = 1;
            rp.e();
        }
    }

    public void A(long j6, long j9) {
        RP rp = (RP) this.f539e;
        if (l(rp)) {
            rp.H(j6, j9);
        }
        RP rp2 = (RP) this.f540f;
        if (rp2 == null || rp2.f27206A == 0) {
            return;
        }
        rp2.H(j6, j9);
    }

    public boolean B(C3029cO c3029cO) {
        RP m4 = m(c3029cO);
        return m4 == null || m4.r0() || m4.I() || m4.J();
    }

    public void C() {
        int i;
        RP rp = (RP) this.f539e;
        int i6 = rp.f27206A;
        if (i6 == 1 && this.f536b != 4) {
            AbstractC2772Sd.H(i6 == 1);
            rp.f27206A = 2;
            rp.d();
            return;
        }
        RP rp2 = (RP) this.f540f;
        if (rp2 == null || (i = rp2.f27206A) != 1 || this.f536b == 3) {
            return;
        }
        AbstractC2772Sd.H(i == 1);
        rp2.f27206A = 2;
        rp2.d();
    }

    public void a() {
        int i = this.f536b;
        if (i != 3 && i != 4) {
            if (i == 2) {
                this.f536b = 0;
                return;
            }
            return;
        }
        boolean z3 = i == 4;
        RP rp = (RP) this.f539e;
        RP rp2 = (RP) this.f540f;
        if (z3) {
            rp2.getClass();
            rp2.b(17, rp);
        } else {
            rp2.getClass();
            rp.b(17, rp2);
        }
        this.f536b = this.f536b != 4 ? 1 : 0;
    }

    public void b() {
        if (!l((RP) this.f539e)) {
            j(true);
        }
        RP rp = (RP) this.f540f;
        if (rp == null || rp.f27206A != 0) {
            return;
        }
        j(false);
    }

    public int c(C3029cO c3029cO, C3918t c3918t, Is is) {
        int k9 = k((RP) this.f539e, c3029cO, c3918t, is);
        return k9 == 1 ? k((RP) this.f540f, c3029cO, c3918t, is) : k9;
    }

    public void d() {
        RP rp = (RP) this.f539e;
        AbstractC2772Sd.H(rp.f27206A == 0);
        rp.k();
        this.f537c = false;
        RP rp2 = (RP) this.f540f;
        if (rp2 != null) {
            AbstractC2772Sd.H(rp2.f27206A == 0);
            rp2.k();
            this.f538d = false;
        }
    }

    public void e(Object obj) {
        RP rp = (RP) this.f539e;
        if (rp.f27272u != 2) {
            return;
        }
        int i = this.f536b;
        if (i != 4 && i != 1) {
            rp.b(1, obj);
            return;
        }
        RP rp2 = (RP) this.f540f;
        rp2.getClass();
        rp2.b(1, obj);
    }

    public void f(InterfaceC3328i0 interfaceC3328i0) {
        RP rp = (RP) this.f539e;
        if (rp.f27272u != 2) {
            return;
        }
        rp.b(7, interfaceC3328i0);
        RP rp2 = (RP) this.f540f;
        if (rp2 != null) {
            rp2.b(7, interfaceC3328i0);
        }
    }

    public boolean g() {
        int i = this.f536b;
        if (i == 0 || i == 2 || i == 4) {
            return l((RP) this.f539e);
        }
        RP rp = (RP) this.f540f;
        rp.getClass();
        return rp.f27206A != 0;
    }

    public boolean h(C3029cO c3029cO, RP rp) {
        if (rp == null) {
            return true;
        }
        IQ[] iqArr = c3029cO.f29475c;
        int i = this.f535a;
        IQ iq = iqArr[i];
        IQ iq2 = rp.f27208B;
        if (iq2 == null) {
            return true;
        }
        if (iq2 == iq && (iq == null || rp.r0())) {
            return true;
        }
        C3029cO c3029cO2 = c3029cO.f29484m;
        return c3029cO2 != null && c3029cO2.f29475c[i] == rp.f27208B;
    }

    public void i(RP rp, Is is) {
        AbstractC2772Sd.H(((RP) this.f539e) == rp || ((RP) this.f540f) == rp);
        if (l(rp)) {
            if (rp == ((RP) is.f25611x)) {
                is.f25612y = null;
                is.f25611x = null;
                is.f25607n = true;
            }
            n(rp);
            AbstractC2772Sd.H(rp.f27206A == 1);
            S0.l lVar = rp.f27274v;
            lVar.f2797u = null;
            lVar.f2798v = null;
            rp.f27206A = 0;
            rp.f27208B = null;
            rp.f27210C = null;
            rp.f27217G = false;
            rp.f();
            rp.J = null;
            rp.f27224K = com.anythink.basead.exoplayer.b.f6382b;
        }
    }

    public void j(boolean z3) {
        if (z3) {
            if (this.f537c) {
                RP rp = (RP) this.f539e;
                AbstractC2772Sd.H(rp.f27206A == 0);
                S0.l lVar = rp.f27274v;
                lVar.f2797u = null;
                lVar.f2798v = null;
                rp.i();
                this.f537c = false;
                return;
            }
            return;
        }
        if (this.f538d) {
            RP rp2 = (RP) this.f540f;
            rp2.getClass();
            AbstractC2772Sd.H(rp2.f27206A == 0);
            S0.l lVar2 = rp2.f27274v;
            lVar2.f2797u = null;
            lVar2.f2798v = null;
            rp2.i();
            this.f538d = false;
        }
    }

    public int k(RP rp, C3029cO c3029cO, C3918t c3918t, Is is) {
        int i;
        if (rp != null && rp.f27206A != 0) {
            RP rp2 = (RP) this.f539e;
            boolean z3 = rp != rp2;
            if (rp == rp2 && ((i = this.f536b) == 2 || i == 4)) {
                return 1;
            }
            if (rp == ((RP) this.f540f) && this.f536b == 3) {
                return 1;
            }
            IQ iq = rp.f27208B;
            IQ[] iqArr = c3029cO.f29475c;
            int i6 = this.f535a;
            IQ iq2 = iqArr[i6];
            boolean c9 = c3918t.c(i6);
            if (!c9 || iq != iq2) {
                if (!rp.f27217G) {
                    InterfaceC3757q interfaceC3757q = ((InterfaceC3757q[]) c3918t.f34179v)[i6];
                    int d2 = interfaceC3757q != null ? interfaceC3757q.d() : 0;
                    DP[] dpArr = new DP[d2];
                    for (int i9 = 0; i9 < d2; i9++) {
                        interfaceC3757q.getClass();
                        dpArr[i9] = interfaceC3757q.x(i9);
                    }
                    IQ iq3 = iqArr[i6];
                    iq3.getClass();
                    rp.p0(dpArr, iq3, c3029cO.a(), c3029cO.f29487p, c3029cO.f29479g.f29760a);
                    return 3;
                }
                if (!rp.J()) {
                    return 0;
                }
                i(rp, is);
                if (!c9 || q()) {
                    j(!z3);
                    return 1;
                }
            }
        }
        return 1;
    }

    public RP m(C3029cO c3029cO) {
        if (c3029cO != null) {
            IQ iq = c3029cO.f29475c[this.f535a];
            if (iq != null) {
                RP rp = (RP) this.f539e;
                if (rp.f27208B == iq) {
                    return rp;
                }
                RP rp2 = (RP) this.f540f;
                if (rp2 != null && rp2.f27208B == iq) {
                    return rp2;
                }
            }
        }
        return null;
    }

    public boolean o() {
        return ((RP) this.f540f) != null;
    }

    public void p() {
        int i;
        AbstractC2772Sd.H(!q());
        if (l((RP) this.f539e)) {
            i = 3;
        } else {
            i = 2;
            RP rp = (RP) this.f540f;
            if (rp != null && rp.f27206A != 0) {
                i = 4;
            }
        }
        this.f536b = i;
    }

    public boolean q() {
        int i = this.f536b;
        return i == 2 || i == 4 || i == 3;
    }

    public int r() {
        boolean l9 = l((RP) this.f539e);
        int i = 0;
        RP rp = (RP) this.f540f;
        if (rp != null && rp.f27206A != 0) {
            i = 1;
        }
        return (l9 ? 1 : 0) + i;
    }

    public boolean s(C3029cO c3029cO) {
        RP m4 = m(c3029cO);
        m4.getClass();
        return m4.r0();
    }

    public void t(C3029cO c3029cO) {
        RP m4 = m(c3029cO);
        m4.getClass();
        m4.f27217G = true;
    }

    public void u(C3918t c3918t, C3918t c3918t2) {
        int i;
        int i6 = this.f535a;
        boolean c9 = c3918t.c(i6);
        boolean c10 = c3918t2.c(i6);
        RP rp = (RP) this.f539e;
        RP rp2 = (RP) this.f540f;
        if (rp2 == null || (i = this.f536b) == 3 || (i == 0 && l(rp))) {
            rp2 = rp;
        }
        if (!c9 || rp2.f27217G) {
            return;
        }
        int i9 = rp.f27272u;
        C3889sO c3889sO = ((C3889sO[]) c3918t.f34178u)[i6];
        C3889sO c3889sO2 = ((C3889sO[]) c3918t2.f34178u)[i6];
        if (c10 && Objects.equals(c3889sO2, c3889sO) && !q()) {
            return;
        }
        rp2.f27217G = true;
    }

    public void v() {
        int i;
        RP rp = (RP) this.f539e;
        if (l(rp) && (i = this.f536b) != 4 && i != 2) {
            rp.f27217G = true;
        }
        RP rp2 = (RP) this.f540f;
        if (rp2 == null || rp2.f27206A == 0 || this.f536b == 3) {
            return;
        }
        rp2.f27217G = true;
    }

    public void w() {
        RP rp = (RP) this.f539e;
        if (l(rp)) {
            rp.s();
            return;
        }
        RP rp2 = (RP) this.f540f;
        if (rp2 == null || rp2.f27206A == 0) {
            return;
        }
        rp2.s();
    }

    public boolean x() {
        RP rp = (RP) this.f539e;
        boolean J = l(rp) ? rp.J() : true;
        RP rp2 = (RP) this.f540f;
        return (rp2 == null || rp2.f27206A == 0) ? J : J & rp2.J();
    }

    public boolean y(C3029cO c3029cO) {
        int i = this.f536b;
        return ((i == 2 || i == 4) && m(c3029cO) == ((RP) this.f539e)) || (this.f536b == 3 && m(c3029cO) == ((RP) this.f540f));
    }

    public boolean z(C3029cO c3029cO) {
        return h(c3029cO, (RP) this.f539e) && h(c3029cO, (RP) this.f540f);
    }
}
