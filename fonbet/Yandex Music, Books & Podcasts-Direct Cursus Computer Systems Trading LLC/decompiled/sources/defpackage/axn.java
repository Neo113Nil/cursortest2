package defpackage;

import android.graphics.Canvas;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class axn implements tzj {
    public final AndroidComposeView a;
    public Function2 b;
    public Function0 c;
    public boolean d;
    public boolean f;
    public boolean g;
    public gh0 h;
    public final f18 l;
    public int m;
    public final eyj e = new eyj();
    public final dzd i = new dzd(zwn.s);
    public final pu3 j = new pu3();
    public long k = a7t.b;

    public axn(AndroidComposeView androidComposeView, Function2 function2, Function0 function0) {
        this.a = androidComposeView;
        this.b = function2;
        this.c = function0;
        f18 ywnVar = Build.VERSION.SDK_INT >= 29 ? new ywn() : new xwn(androidComposeView);
        ywnVar.x();
        ywnVar.s(false);
        this.l = ywnVar;
    }

    @Override // defpackage.tzj
    public final void a(float[] fArr) {
        feh.e(fArr, this.i.c(this.l));
    }

    @Override // defpackage.tzj
    public final void b(spi spiVar, boolean z) {
        f18 f18Var = this.l;
        dzd dzdVar = this.i;
        if (!z) {
            float[] c = dzdVar.c(f18Var);
            if (dzdVar.d) {
                return;
            }
            feh.c(c, spiVar);
            return;
        }
        float[] b = dzdVar.b(f18Var);
        if (b != null) {
            if (dzdVar.d) {
                return;
            }
            feh.c(b, spiVar);
        } else {
            spiVar.b = 0.0f;
            spiVar.c = 0.0f;
            spiVar.d = 0.0f;
            spiVar.e = 0.0f;
        }
    }

    @Override // defpackage.tzj
    public final void c(zco zcoVar) {
        Function0 function0;
        jzk jzkVar = vnj.i;
        int i = zcoVar.a | this.m;
        int i2 = i & 4096;
        if (i2 != 0) {
            this.k = zcoVar.l;
        }
        f18 f18Var = this.l;
        boolean A = f18Var.A();
        eyj eyjVar = this.e;
        boolean z = A && eyjVar.g;
        if ((i & 1) != 0) {
            f18Var.j(zcoVar.b);
        }
        if ((i & 2) != 0) {
            f18Var.m(zcoVar.c);
        }
        if ((i & 4) != 0) {
            f18Var.n(zcoVar.d);
        }
        if ((i & 8) != 0) {
            f18Var.o(zcoVar.e);
        }
        if ((i & 16) != 0) {
            f18Var.d(zcoVar.f);
        }
        if ((i & 32) != 0) {
            f18Var.u(zcoVar.g);
        }
        if ((i & 64) != 0) {
            f18Var.H(c3x.U(zcoVar.h));
        }
        if ((i & 128) != 0) {
            f18Var.K(c3x.U(zcoVar.i));
        }
        if ((i & 1024) != 0) {
            f18Var.l(zcoVar.j);
        }
        if ((i & 256) != 0) {
            f18Var.h();
        }
        if ((i & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0) {
            f18Var.i();
        }
        if ((i & 2048) != 0) {
            f18Var.k(zcoVar.k);
        }
        if (i2 != 0) {
            f18Var.E(a7t.b(this.k) * f18Var.c());
            f18Var.F(a7t.c(this.k) * f18Var.a());
        }
        boolean z2 = zcoVar.n && zcoVar.m != jzkVar;
        if ((i & 24576) != 0) {
            f18Var.J(z2);
            f18Var.s(zcoVar.n && zcoVar.m == jzkVar);
        }
        if ((131072 & i) != 0) {
            f18Var.e(zcoVar.s);
        }
        if ((32768 & i) != 0) {
            f18Var.w(zcoVar.o);
        }
        boolean d = this.e.d(zcoVar.t, zcoVar.d, z2, zcoVar.g, zcoVar.p);
        if (eyjVar.f) {
            f18Var.G(eyjVar.b());
        }
        boolean z3 = z2 && eyjVar.g;
        AndroidComposeView androidComposeView = this.a;
        if (z != z3 || (z3 && d)) {
            if (!this.d && !this.f) {
                androidComposeView.invalidate();
                l(true);
            }
        } else if (Build.VERSION.SDK_INT >= 26) {
            woe.v(androidComposeView);
        } else {
            androidComposeView.invalidate();
        }
        if (!this.g && f18Var.L() > 0.0f && (function0 = this.c) != null) {
            function0.invoke();
        }
        if ((i & 7963) != 0) {
            this.i.e();
        }
        this.m = zcoVar.a;
    }

    @Override // defpackage.tzj
    public final long d(long j, boolean z) {
        f18 f18Var = this.l;
        dzd dzdVar = this.i;
        if (!z) {
            return !dzdVar.d ? feh.b(j, dzdVar.c(f18Var)) : j;
        }
        float[] b = dzdVar.b(f18Var);
        if (b == null) {
            return 9187343241974906880L;
        }
        return !dzdVar.d ? feh.b(j, b) : j;
    }

    @Override // defpackage.tzj
    public final void destroy() {
        f18 f18Var = this.l;
        if (f18Var.g()) {
            f18Var.f();
        }
        this.b = null;
        this.c = null;
        this.f = true;
        l(false);
        AndroidComposeView androidComposeView = this.a;
        androidComposeView.D = true;
        androidComposeView.F(this);
    }

    @Override // defpackage.tzj
    public final void e(Function2 function2, Function0 function0) {
        dzd dzdVar = this.i;
        dzdVar.a = false;
        dzdVar.b = false;
        dzdVar.d = true;
        dzdVar.c = true;
        feh.d((float[]) dzdVar.g);
        feh.d((float[]) dzdVar.h);
        l(false);
        this.f = false;
        this.g = false;
        this.k = a7t.b;
        this.b = function2;
        this.c = function0;
    }

    @Override // defpackage.tzj
    public final void f(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        float b = a7t.b(this.k) * i;
        f18 f18Var = this.l;
        f18Var.E(b);
        f18Var.F(a7t.c(this.k) * i2);
        if (f18Var.t(f18Var.r(), f18Var.z(), f18Var.r() + i, f18Var.z() + i2)) {
            f18Var.G(this.e.b());
            if (!this.d && !this.f) {
                this.a.invalidate();
                l(true);
            }
            this.i.e();
        }
    }

    @Override // defpackage.tzj
    public final void g(mu3 mu3Var, xod xodVar) {
        Canvas a = vd0.a(mu3Var);
        boolean isHardwareAccelerated = a.isHardwareAccelerated();
        f18 f18Var = this.l;
        if (isHardwareAccelerated) {
            k();
            boolean z = f18Var.L() > 0.0f;
            this.g = z;
            if (z) {
                mu3Var.n();
            }
            f18Var.q(a);
            if (this.g) {
                mu3Var.s();
                return;
            }
            return;
        }
        float r = f18Var.r();
        float z2 = f18Var.z();
        float I = f18Var.I();
        float D = f18Var.D();
        if (f18Var.b() < 1.0f) {
            gh0 gh0Var = this.h;
            if (gh0Var == null) {
                gh0Var = hld.p();
                this.h = gh0Var;
            }
            gh0Var.c(f18Var.b());
            a.saveLayer(r, z2, I, D, gh0Var.a);
        } else {
            mu3Var.r();
        }
        mu3Var.j(r, z2);
        mu3Var.u(this.i.c(f18Var));
        if (f18Var.A() || f18Var.y()) {
            this.e.a(mu3Var);
        }
        Function2 function2 = this.b;
        if (function2 != null) {
            function2.invoke(mu3Var, null);
        }
        mu3Var.k();
        l(false);
    }

    @Override // defpackage.tzj
    /* renamed from: getUnderlyingMatrix-sQKQjiQ, reason: not valid java name */
    public final float[] mo2getUnderlyingMatrixsQKQjiQ() {
        return this.i.c(this.l);
    }

    @Override // defpackage.tzj
    public final boolean h(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j));
        f18 f18Var = this.l;
        if (f18Var.y()) {
            return 0.0f <= intBitsToFloat && intBitsToFloat < ((float) f18Var.c()) && 0.0f <= intBitsToFloat2 && intBitsToFloat2 < ((float) f18Var.a());
        }
        if (f18Var.A()) {
            return this.e.c(j);
        }
        return true;
    }

    @Override // defpackage.tzj
    public final void i(float[] fArr) {
        float[] b = this.i.b(this.l);
        if (b != null) {
            feh.e(fArr, b);
        }
    }

    @Override // defpackage.tzj
    public final void invalidate() {
        if (this.d || this.f) {
            return;
        }
        this.a.invalidate();
        l(true);
    }

    @Override // defpackage.tzj
    public final void j(long j) {
        f18 f18Var = this.l;
        int r = f18Var.r();
        int z = f18Var.z();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (r == i && z == i2) {
            return;
        }
        if (r != i) {
            f18Var.C(i - r);
        }
        if (z != i2) {
            f18Var.v(i2 - z);
        }
        int i3 = Build.VERSION.SDK_INT;
        AndroidComposeView androidComposeView = this.a;
        if (i3 >= 26) {
            woe.v(androidComposeView);
        } else {
            androidComposeView.invalidate();
        }
        this.i.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    @Override // defpackage.tzj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        eak eakVar;
        Function2 function2;
        boolean z = this.d;
        f18 f18Var = this.l;
        if (z || !f18Var.g()) {
            if (f18Var.A()) {
                eyj eyjVar = this.e;
                if (eyjVar.g) {
                    eyjVar.e();
                    eakVar = eyjVar.e;
                    function2 = this.b;
                    if (function2 != null) {
                        f18Var.p(this.j, eakVar, new nna(function2, 2));
                    }
                    l(false);
                }
            }
            eakVar = null;
            function2 = this.b;
            if (function2 != null) {
            }
            l(false);
        }
    }

    public final void l(boolean z) {
        if (z != this.d) {
            this.d = z;
            this.a.w(this, z);
        }
    }
}
