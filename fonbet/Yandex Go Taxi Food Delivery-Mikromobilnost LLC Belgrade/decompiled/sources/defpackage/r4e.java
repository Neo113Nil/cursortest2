package defpackage;

import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes15.dex */
public final class r4e implements vff0 {
    public final Looper a = Looper.myLooper();
    public final w3c b;
    public final x22 c;
    public final h3y w;
    public long x;
    public long y;
    public long z;

    public r4e(w3c w3cVar, wff0 wff0Var, x22 x22Var, h3y h3yVar) {
        this.b = w3cVar;
        this.c = x22Var;
        this.w = h3yVar;
        wff0Var.a(this);
    }

    public final void a() {
        z83.g(null, this.a, Looper.myLooper());
        long j = this.y;
        w3c w3cVar = this.b;
        if (j != 0 && this.x != 0) {
            long j2 = this.z;
            w3cVar.getClass();
            this.z = (SystemClock.elapsedRealtime() - Math.max(this.x, this.y)) + j2;
        }
        if (this.x != 0) {
            w3cVar.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.x;
            String providerName = ((n5t0) this.w.get()).getProviderName();
            if (providerName != null) {
                this.c.h("connection health", "connected", Long.valueOf(this.z), "onscreen", Long.valueOf(elapsedRealtime), "socket", providerName);
            }
            this.x = 0L;
            this.z = 0L;
        }
    }

    @Override // defpackage.vff0
    public final void b() {
        a();
    }
}
