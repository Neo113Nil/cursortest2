package defpackage;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class f4x extends r0x {
    public final /* synthetic */ h4x i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4x(h4x h4xVar) {
        super(1);
        this.i = h4xVar;
    }

    @Override // defpackage.r0x
    public final void S0(jw0 jw0Var, String str, String str2, boolean z) {
        h4x h4xVar = this.i;
        h4xVar.t = jw0Var;
        h4xVar.u = str;
        kkx kkxVar = new kkx(new Status(0, null, null, null), jw0Var, str, str2, z);
        synchronized (h4xVar.r) {
            try {
                i8s i8sVar = h4xVar.o;
                if (i8sVar != null) {
                    i8sVar.b(kkxVar);
                }
                h4xVar.o = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.r0x
    public final void U0(int i) {
        this.i.h(i);
    }

    @Override // defpackage.r0x
    public final void V0(int i) {
        h4x h4xVar = this.i;
        h4x.e(h4xVar, i);
        if (h4xVar.D != null) {
            h4x.k(h4xVar).post(new z3x(this, i, 2));
        }
    }

    @Override // defpackage.r0x
    public final void W0(int i) {
        h4x.e(this.i, i);
    }

    @Override // defpackage.r0x
    public final void X0(b0x b0xVar) {
        h4x.k(this.i).post(new rxw(this, b0xVar, false, 8));
    }

    @Override // defpackage.r0x
    public final void Y0(int i) {
        h4x.e(this.i, i);
    }

    @Override // defpackage.r0x
    public final void Z0(String str, byte[] bArr) {
        h4x.G.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // defpackage.r0x
    public final void a1(int i) {
        h4x.k(this.i).post(new z3x(this, i, 1));
    }

    @Override // defpackage.r0x
    public final void b1(j0x j0xVar) {
        h4x.k(this.i).post(new rxw(this, j0xVar, false, 7));
    }

    @Override // defpackage.r0x
    public final void c1(int i) {
        h4x.k(this.i).post(new z3x(this, i, 0));
    }

    @Override // defpackage.r0x
    public final void d1(long j) {
        h4x.d(this.i, j, 0);
    }

    @Override // defpackage.r0x
    public final void e1(int i, long j) {
        h4x.d(this.i, j, i);
    }

    @Override // defpackage.r0x
    public final void f1() {
        h4x.G.b("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }

    @Override // defpackage.r0x
    public final void g1(int i) {
        h4x.k(this.i).post(new z3x(this, i, 3));
    }

    @Override // defpackage.r0x
    public final void h1(String str, String str2) {
        h4x.G.b("Receive (type=text, ns=%s) %s", str, str2);
        h4x.k(this.i).post(new nud(this, str, str2, false, 22));
    }
}
