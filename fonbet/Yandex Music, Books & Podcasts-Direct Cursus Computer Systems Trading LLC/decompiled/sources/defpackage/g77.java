package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.impl.a;

/* loaded from: classes5.dex */
public final class g77 implements i77 {
    public final p2f a;
    public final f77 b;
    public final f77 c;

    public g77(p2f p2fVar) {
        this.a = p2fVar;
        this.b = new f77(su4.o(new StringBuilder("JmDNS("), p2fVar.q, ").Timer"));
        this.c = new f77(su4.o(new StringBuilder("JmDNS("), p2fVar.q, ").State.Timer"));
    }

    @Override // defpackage.i77
    public final void D(a aVar) {
        hkp hkpVar = new hkp(this.a, aVar);
        p2f p2fVar = hkpVar.a;
        if (p2fVar.L0() || p2fVar.K0()) {
            return;
        }
        this.b.schedule(hkpVar, 225L, 225L);
    }

    @Override // defpackage.i77
    public final void H() {
        this.b.purge();
    }

    @Override // defpackage.i77
    public final void I() {
        vt3 vt3Var = new vt3(this.a, 0);
        z67 z67Var = z67.i;
        vt3Var.c = z67Var;
        vt3Var.h(z67Var);
        this.c.schedule(vt3Var, 0L, 1000L);
    }

    @Override // defpackage.i77
    public final void N() {
        onn onnVar = new onn(this.a);
        p2f p2fVar = onnVar.a;
        if (p2fVar.L0() || p2fVar.K0()) {
            return;
        }
        this.b.schedule(onnVar, 10000L, 10000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    @Override // defpackage.i77
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(l67 l67Var, InetAddress inetAddress, int i) {
        p2f p2fVar;
        int nextInt;
        j3o j3oVar = new j3o(this.a, l67Var, inetAddress, i);
        Logger logger = j3o.f;
        l67 l67Var2 = j3oVar.b;
        Iterator it = l67Var2.d.iterator();
        boolean z = true;
        do {
            boolean hasNext = it.hasNext();
            p2fVar = j3oVar.a;
            if (!hasNext) {
                break;
            }
            q67 q67Var = (q67) it.next();
            if (logger.isLoggable(Level.FINEST)) {
                logger.finest(j3oVar.e() + "start() question=" + q67Var);
            }
            z = q67Var.r(p2fVar);
        } while (z);
        if (z) {
            if (!((l67Var2.c & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0)) {
                nextInt = 0;
                int i2 = nextInt >= 0 ? nextInt : 0;
                if (logger.isLoggable(Level.FINEST)) {
                    logger.finest(j3oVar.e() + "start() Responder chosen delay=" + i2);
                }
                if (!p2fVar.L0() || p2fVar.K0()) {
                }
                this.b.schedule(j3oVar, i2);
                return;
            }
        }
        nextInt = (p2f.t.nextInt(96) + 20) - ((int) (System.currentTimeMillis() - l67Var2.i));
        if (nextInt >= 0) {
        }
        if (logger.isLoggable(Level.FINEST)) {
        }
        if (p2fVar.L0()) {
        }
    }

    @Override // defpackage.i77
    public final void Q() {
        vn0 vn0Var = new vn0(this.a, a77.e);
        z67 z67Var = z67.f;
        vn0Var.c = z67Var;
        vn0Var.h(z67Var);
        p2f p2fVar = vn0Var.a;
        if (p2fVar.L0() || p2fVar.K0()) {
            return;
        }
        this.c.schedule(vn0Var, 1000L, 1000L);
    }

    @Override // defpackage.i77
    public final void R() {
        this.c.purge();
    }

    @Override // defpackage.i77
    public final void a() {
        this.c.cancel();
    }

    @Override // defpackage.i77
    public final void b(String str) {
        hkp hkpVar = new hkp(this.a, str);
        p2f p2fVar = hkpVar.a;
        if (p2fVar.L0() || p2fVar.K0()) {
            return;
        }
        this.b.schedule(hkpVar, 225L, 225L);
    }

    @Override // defpackage.i77
    public final void g() {
        this.b.cancel();
    }

    @Override // defpackage.i77
    public final void o() {
        vsm vsmVar = new vsm(this.a, a77.e);
        z67 z67Var = z67.c;
        vsmVar.c = z67Var;
        vsmVar.h(z67Var);
        f77 f77Var = this.c;
        long currentTimeMillis = System.currentTimeMillis();
        p2f p2fVar = vsmVar.a;
        if (currentTimeMillis - p2fVar.l < 5000) {
            p2fVar.k++;
        } else {
            p2fVar.k = 1;
        }
        p2fVar.l = currentTimeMillis;
        if (p2fVar.i.d.c.b() && p2fVar.k < 10) {
            f77Var.schedule(vsmVar, p2f.t.nextInt(251), 250L);
        } else {
            if (p2fVar.L0() || p2fVar.K0()) {
                return;
            }
            f77Var.schedule(vsmVar, 1000L, 1000L);
        }
    }

    @Override // defpackage.i77
    public final void z() {
        nxn nxnVar = new nxn(this.a, a77.e);
        z67 z67Var = z67.h;
        nxnVar.c = z67Var;
        nxnVar.h(z67Var);
        p2f p2fVar = nxnVar.a;
        if (p2fVar.L0() || p2fVar.K0()) {
            return;
        }
        this.c.schedule(nxnVar, 1800000L, 1800000L);
    }
}
