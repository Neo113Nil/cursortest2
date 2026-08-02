package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class h4x extends omd {
    public static final msg G = new msg("CastClient", null);
    public static final po0 H = new po0("Cast.API_CXLESS", new bww(11), j1x.a);
    public final CastDevice A;
    public final HashMap B;
    public final HashMap C;
    public final kox D;
    public final List E;
    public int F;
    public final f4x k;
    public fsn l;
    public boolean m;
    public boolean n;
    public i8s o;
    public i8s p;
    public final AtomicLong q;
    public final Object r;
    public final Object s;
    public jw0 t;
    public String u;
    public double v;
    public boolean w;
    public int x;
    public int y;
    public a2x z;

    public h4x(Context context, s54 s54Var) {
        super(context, null, H, s54Var, nmd.c);
        this.k = new f4x(this);
        this.r = new Object();
        this.s = new Object();
        this.E = Collections.synchronizedList(new ArrayList());
        this.D = s54Var.b;
        this.A = s54Var.a;
        this.B = new HashMap();
        this.C = new HashMap();
        this.q = new AtomicLong(0L);
        this.F = 1;
        j();
    }

    public static void d(h4x h4xVar, long j, int i) {
        i8s i8sVar;
        synchronized (h4xVar.B) {
            HashMap hashMap = h4xVar.B;
            Long valueOf = Long.valueOf(j);
            i8sVar = (i8s) hashMap.get(valueOf);
            h4xVar.B.remove(valueOf);
        }
        if (i8sVar != null) {
            if (i == 0) {
                i8sVar.b(null);
            } else {
                i8sVar.a(n7w.K(new Status(i, null, null, null)));
            }
        }
    }

    public static void e(h4x h4xVar, int i) {
        synchronized (h4xVar.s) {
            try {
                i8s i8sVar = h4xVar.p;
                if (i8sVar == null) {
                    return;
                }
                if (i == 0) {
                    i8sVar.b(new Status(0, null, null, null));
                } else {
                    i8sVar.a(n7w.K(new Status(i, null, null, null)));
                }
                h4xVar.p = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Handler k(h4x h4xVar) {
        if (h4xVar.l == null) {
            h4xVar.l = new fsn(h4xVar.f, 3);
        }
        return h4xVar.l;
    }

    public final onx f(r0x r0xVar) {
        vcg vcgVar = b(r0xVar).a;
        y1g.H(vcgVar, "Key must not be null");
        umd umdVar = this.j;
        umdVar.getClass();
        i8s i8sVar = new i8s();
        umdVar.f(i8sVar, 8415, this);
        pxw pxwVar = new pxw(new cyw(vcgVar, i8sVar), umdVar.i.get(), this);
        fsn fsnVar = umdVar.n;
        fsnVar.sendMessage(fsnVar.obtainMessage(13, pxwVar));
        return i8sVar.a;
    }

    public final void g() {
        G.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.C) {
            this.C.clear();
        }
    }

    public final void h(int i) {
        synchronized (this.r) {
            try {
                i8s i8sVar = this.o;
                if (i8sVar != null) {
                    i8sVar.a(n7w.K(new Status(i, null, null, null)));
                }
                this.o = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        q5i a = h8s.a();
        a.c = new ddl();
        a.b = 8403;
        c(1, a.c());
        g();
        f(this.k);
    }

    public final void j() {
        CastDevice castDevice = this.A;
        jsg jsgVar = castDevice.i;
        jsg jsgVar2 = castDevice.i;
        if (jsgVar.p(2048) || !jsgVar2.p(4) || jsgVar2.p(1)) {
            return;
        }
        "Chromecast Audio".equals(castDevice.e);
    }
}
