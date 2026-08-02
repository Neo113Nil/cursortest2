package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class rnx extends r0x {
    public final AtomicReference i;
    public final fsn j;

    public rnx(fox foxVar) {
        super(1);
        this.i = new AtomicReference(foxVar);
        this.j = new fsn(foxVar.i, 3);
    }

    @Override // defpackage.r0x
    public final void S0(jw0 jw0Var, String str, String str2, boolean z) {
        fox foxVar = (fox) this.i.get();
        if (foxVar == null) {
            return;
        }
        foxVar.E = jw0Var;
        foxVar.z0 = jw0Var.a;
        foxVar.A0 = str2;
        foxVar.L = str;
        synchronized (fox.E0) {
        }
    }

    @Override // defpackage.r0x
    public final void U0(int i) {
        if (((fox) this.i.get()) == null) {
            return;
        }
        synchronized (fox.E0) {
        }
    }

    @Override // defpackage.r0x
    public final void V0(int i) {
        fox foxVar = (fox) this.i.get();
        if (foxVar == null) {
            return;
        }
        foxVar.z0 = null;
        foxVar.A0 = null;
        synchronized (fox.F0) {
        }
        if (foxVar.G != null) {
            this.j.post(new zs3(foxVar, i, 6));
        }
    }

    @Override // defpackage.r0x
    public final void W0(int i) {
        if (((fox) this.i.get()) == null) {
            return;
        }
        synchronized (fox.F0) {
        }
    }

    @Override // defpackage.r0x
    public final void X0(b0x b0xVar) {
        fox foxVar = (fox) this.i.get();
        if (foxVar == null) {
            return;
        }
        fox.D0.b("onApplicationStatusChanged", new Object[0]);
        this.j.post(new rxw(foxVar, b0xVar, false, 20));
    }

    @Override // defpackage.r0x
    public final void Y0(int i) {
        if (((fox) this.i.get()) == null) {
            return;
        }
        synchronized (fox.F0) {
        }
    }

    @Override // defpackage.r0x
    public final void Z0(String str, byte[] bArr) {
        if (((fox) this.i.get()) == null) {
            return;
        }
        fox.D0.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // defpackage.r0x
    public final void b1(j0x j0xVar) {
        fox foxVar = (fox) this.i.get();
        if (foxVar == null) {
            return;
        }
        fox.D0.b("onDeviceStatusChanged", new Object[0]);
        this.j.post(new rxw(foxVar, j0xVar, false, 19));
    }

    @Override // defpackage.r0x
    public final void c1(int i) {
        fox foxVar = null;
        fox foxVar2 = (fox) this.i.getAndSet(null);
        if (foxVar2 != null) {
            foxVar2.x0 = -1;
            foxVar2.y0 = -1;
            foxVar2.E = null;
            foxVar2.L = null;
            foxVar2.v0 = 0.0d;
            foxVar2.D();
            foxVar2.X = false;
            foxVar2.w0 = null;
            foxVar = foxVar2;
        }
        if (foxVar == null) {
            return;
        }
        fox.D0.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i));
        if (i != 0) {
            int i2 = foxVar.B.get();
            f3x f3xVar = foxVar.k;
            f3xVar.sendMessage(f3xVar.obtainMessage(6, i2, 2));
        }
    }

    @Override // defpackage.r0x
    public final void d1(long j) {
        fox foxVar = (fox) this.i.get();
        if (foxVar == null) {
            return;
        }
        fox.B(foxVar, j, 0);
    }

    @Override // defpackage.r0x
    public final void e1(int i, long j) {
        fox foxVar = (fox) this.i.get();
        if (foxVar == null) {
            return;
        }
        fox.B(foxVar, j, i);
    }

    @Override // defpackage.r0x
    public final void f1() {
        fox.D0.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override // defpackage.r0x
    public final void h1(String str, String str2) {
        fox foxVar = (fox) this.i.get();
        if (foxVar == null) {
            return;
        }
        fox.D0.b("Receive (type=text, ns=%s) %s", str, str2);
        this.j.post(new nud(foxVar, str, str2, false, 28));
    }

    @Override // defpackage.r0x
    public final void a1(int i) {
    }

    @Override // defpackage.r0x
    public final void g1(int i) {
    }
}
