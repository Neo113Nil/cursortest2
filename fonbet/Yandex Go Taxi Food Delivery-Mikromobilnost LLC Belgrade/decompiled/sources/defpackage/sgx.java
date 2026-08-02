package defpackage;

import android.os.Handler;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.yandex.messaging.a;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class sgx implements y4e, vff0 {
    public static final /* synthetic */ kgx[] H;
    public static final long I;
    public boolean A;
    public boolean B;
    public boolean D;
    public wor0 E;
    public dhv F;
    public final Handler a;
    public final w3c b;
    public final h3y c;
    public final k02 w;
    public final k020 x;
    public final a y;
    public long z;
    public boolean C = true;
    public final op3 G = new op3();

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("currentCall", 0, "getCurrentCall()Lcom/yandex/messaging/Cancelable;", sgx.class);
        qoi0.a.getClass();
        H = new kgx[]{mutablePropertyReference1Impl};
        I = DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT;
    }

    public sgx(Handler handler, wff0 wff0Var, w3c w3cVar, a5e a5eVar, h3y h3yVar, k02 k02Var, k020 k020Var, a aVar) {
        this.a = handler;
        this.b = w3cVar;
        this.c = h3yVar;
        this.w = k02Var;
        this.x = k020Var;
        this.y = aVar;
        a5eVar.a(this);
        wff0Var.a(this);
    }

    public final void a() {
        boolean z;
        if (this.E == null || this.F == null) {
            return;
        }
        this.b.getClass();
        long currentTimeMillis = System.currentTimeMillis() - this.z;
        long j = I;
        Handler handler = this.a;
        int i = 1;
        if (currentTimeMillis < j) {
            long j2 = j - currentTimeMillis;
            if (this.A) {
                return;
            }
            z83.i();
            dhv dhvVar = this.F;
            if (dhvVar != null) {
                handler.postDelayed(dhvVar, j2);
                this.A = true;
                return;
            }
            return;
        }
        kgx[] kgxVarArr = H;
        kgx kgxVar = kgxVarArr[0];
        op3 op3Var = this.G;
        op3Var.b(null);
        if (this.C) {
            String r = this.x.r();
            z = r == null || r.equals("L");
            this.C = z;
        } else {
            z = false;
        }
        if (!z) {
            if (this.D) {
                zeu zeuVar = (zeu) this.c.get();
                if (!zeuVar.g) {
                    zeuVar.d.postDelayed(zeuVar.a, zeuVar.e.a());
                    zeuVar.g = true;
                    zeuVar.h = true;
                }
            }
            this.D = true;
            x08 f = ((n5t0) this.E.a).f(new u0c(i, this));
            kgx kgxVar2 = kgxVarArr[0];
            op3Var.b(f);
            this.z = System.currentTimeMillis();
        }
        this.A = false;
        z83.i();
        dhv dhvVar2 = this.F;
        if (dhvVar2 != null) {
            handler.postDelayed(dhvVar2, j);
            this.A = true;
        }
    }

    @Override // defpackage.vff0
    public final void b() {
        this.B = true;
        this.C = true;
        d();
    }

    @Override // defpackage.y4e
    public final void c(wor0 wor0Var) {
        this.E = wor0Var;
        a();
    }

    public final void d() {
        dhv dhvVar = this.F;
        if (dhvVar != null) {
            this.a.removeCallbacks(dhvVar);
        }
        this.F = null;
        zeu zeuVar = (zeu) this.c.get();
        zeuVar.d.removeCallbacks(zeuVar.a);
        zeuVar.g = false;
        this.A = false;
        this.D = false;
        kgx kgxVar = H[0];
        this.G.b(null);
    }

    @Override // defpackage.y4e
    public final void onConnectionClosed() {
        this.E = null;
    }
}
