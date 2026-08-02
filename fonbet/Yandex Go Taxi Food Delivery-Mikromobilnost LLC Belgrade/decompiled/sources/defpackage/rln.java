package defpackage;

import android.os.Looper;
import androidx.room.util.a;

/* loaded from: classes15.dex */
public final class rln implements vx60 {
    public final naz0 a;
    public final Looper b;
    public final h3y c;
    public final at2 d;
    public final n5t0 e;
    public final ks10 f;
    public x08 g;
    public int h = 0;

    public rln(naz0 naz0Var, Looper looper, at2 at2Var, h3y h3yVar, n5t0 n5t0Var, ks10 ks10Var) {
        this.a = naz0Var;
        this.b = looper;
        this.d = at2Var;
        this.c = h3yVar;
        this.e = n5t0Var;
        this.f = ks10Var;
    }

    @Override // defpackage.vx60
    public final void a() {
        b();
    }

    public final void b() {
        z83.g(null, this.b, Looper.myLooper());
        z83.h(null, this.h >= 0);
        if (this.g != null || this.h == 0) {
            return;
        }
        l2b l2bVar = (l2b) a.b(this.d.w().a, true, false, new cs0(this.a.a.a, 15));
        if (l2bVar == null) {
            return;
        }
        long j = l2bVar.b;
        long j2 = l2bVar.c;
        if (j > j2) {
            this.g = this.e.f(new qln(this, j2));
        }
    }
}
