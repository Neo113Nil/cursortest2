package defpackage;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class ow6 implements t6t {
    public int c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long i;
    public final xdr j;
    public final xdr k;
    public final efo a = new efo(19);
    public final ywq b = new ywq();
    public long h = 1000000;

    public ow6() {
        xdr a = ydr.a(new h6r(-1));
        this.j = a;
        this.k = a;
    }

    @Override // defpackage.t6t
    public final synchronized void C(db7 db7Var, nb7 nb7Var, boolean z) {
        db7Var.getClass();
        nb7Var.getClass();
        if (z && !nb7Var.c(8)) {
            if (this.c == 0) {
                this.d = SystemClock.elapsedRealtime();
            }
            this.c++;
        }
    }

    @Override // defpackage.t6t
    public final synchronized void a(lq2 lq2Var, nb7 nb7Var, boolean z, int i) {
        nb7Var.getClass();
        if (z && !nb7Var.c(8)) {
            this.e += i;
        }
    }

    public final void b(nb7 nb7Var, int i, long j, long j2) {
        if (i == 0 && j == 0 && j2 == this.i) {
            return;
        }
        this.i = j2;
        efo efoVar = this.a;
        efoVar.getClass();
        nb7Var.getClass();
        Iterator it = ((CopyOnWriteArrayList) efoVar.b).iterator();
        it.getClass();
        if (it.hasNext()) {
            throw hrg.j(it);
        }
        h6r h6rVar = new h6r((int) (j2 / 1000));
        xdr xdrVar = this.j;
        xdrVar.getClass();
        xdrVar.m(null, h6rVar);
    }

    @Override // defpackage.t6t
    public final void h(db7 db7Var, nb7 nb7Var, boolean z) {
        db7Var.getClass();
        nb7Var.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r11.g >= 102400) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001c A[Catch: all -> 0x007c, TRY_ENTER, TryCatch #2 {all -> 0x007c, blocks: (B:3:0x0001, B:15:0x001c, B:18:0x0021, B:20:0x003c, B:26:0x0069, B:34:0x005e), top: B:2:0x0001 }] */
    @Override // defpackage.t6t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void z(db7 db7Var, nb7 nb7Var, boolean z) {
        Throwable th;
        boolean z2;
        ow6 ow6Var;
        try {
            try {
                nb7Var.getClass();
                if (z) {
                    try {
                        if (!nb7Var.c(8)) {
                            z2 = true;
                            if (z2) {
                                return;
                            }
                            vq1.A(this.c > 0);
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            int i = (int) (elapsedRealtime - this.d);
                            this.f += i;
                            long j = this.g;
                            long j2 = this.e;
                            this.g = j + j2;
                            if (i > 0) {
                                this.b.a((int) Math.sqrt(j2), (j2 * 8000.0f) / i);
                                if (this.f < 2000) {
                                }
                                this.h = (long) this.b.i(0.75f);
                                ow6Var = this;
                                ow6Var.b(nb7Var, i, this.e, this.h);
                                ow6Var.d = elapsedRealtime;
                                ow6Var.e = 0L;
                            } else {
                                ow6Var = this;
                            }
                            ow6Var.c--;
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                z2 = false;
                if (z2) {
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }
}
