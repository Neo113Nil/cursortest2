package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class gpf extends f8j {
    public static final gh0 Z;
    public epf X;
    public fpf Y;

    static {
        gh0 p = hld.p();
        int i = d85.o;
        p.e(d85.i);
        p.k(1.0f);
        p.l(1);
        Z = p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gpf(mpf mpfVar, epf epfVar) {
        super(mpfVar);
        this.X = epfVar;
        this.Y = mpfVar.h != null ? new fpf(this) : null;
        if ((((xci) epfVar).a.c & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0) {
            return;
        }
        l1j.f();
        throw null;
    }

    public final void A1() {
        if (this.g) {
            return;
        }
        o1();
        K0().d();
        this.m.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B1(epf epfVar) {
        if (epfVar.equals(this.X) || (((xci) epfVar).a.c & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0) {
            this.X = epfVar;
        } else {
            l1j.f();
        }
    }

    @Override // defpackage.twg
    public final int C0(v2e v2eVar) {
        fpf fpfVar = this.Y;
        return fpfVar != null ? fpfVar.q.f(Integer.MIN_VALUE, v2eVar) : vnj.g(this, v2eVar);
    }

    @Override // defpackage.ffh
    public final int G(int i) {
        epf epfVar = this.X;
        f8j f8jVar = this.m;
        f8jVar.getClass();
        return epfVar.M(this, f8jVar, i);
    }

    @Override // defpackage.ffh
    public final int J(int i) {
        epf epfVar = this.X;
        f8j f8jVar = this.m;
        f8jVar.getClass();
        return epfVar.b(this, f8jVar, i);
    }

    @Override // defpackage.ffh
    public final ksk M(long j) {
        z0(j);
        epf epfVar = this.X;
        f8j f8jVar = this.m;
        f8jVar.getClass();
        t1(epfVar.c(this, f8jVar, j));
        n1();
        return this;
    }

    @Override // defpackage.f8j
    public final void V0() {
        if (this.Y == null) {
            this.Y = new fpf(this);
        }
    }

    @Override // defpackage.f8j
    public final vwg Z0() {
        return this.Y;
    }

    @Override // defpackage.ffh
    public final int a(int i) {
        epf epfVar = this.X;
        f8j f8jVar = this.m;
        f8jVar.getClass();
        return epfVar.E(this, f8jVar, i);
    }

    @Override // defpackage.f8j
    public final xci b1() {
        return ((xci) this.X).a;
    }

    @Override // defpackage.f8j, defpackage.ksk
    public final void p0(long j, float f, xod xodVar) {
        r1(j, f, null, xodVar);
        A1();
    }

    @Override // defpackage.f8j
    public final void q1(mu3 mu3Var, xod xodVar) {
        f8j f8jVar = this.m;
        f8jVar.getClass();
        f8jVar.T0(mu3Var, xodVar);
        if (ppf.a(this.l).getShowLayoutBounds()) {
            long j = this.c;
            mu3Var.t(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, Z);
        }
    }

    @Override // defpackage.ksk
    public final void r0(long j, float f, Function1 function1) {
        r1(j, f, function1, null);
        A1();
    }

    @Override // defpackage.ffh
    public final int z(int i) {
        epf epfVar = this.X;
        f8j f8jVar = this.m;
        f8jVar.getClass();
        return epfVar.p0(this, f8jVar, i);
    }
}
