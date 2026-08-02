package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.a;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import androidx.media3.exoplayer.video.b;
import androidx.media3.exoplayer.video.c;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class qxc0 {
    public ImmutableList a;
    public a b;
    public long c;
    public Executor d;
    public final /* synthetic */ txc0 e;

    public qxc0(txc0 txc0Var, Context context) {
        this.e = txc0Var;
        tw21.S(context);
        this.a = ImmutableList.p();
        this.c = -9223372036854775807L;
        this.d = txc0.o;
    }

    public final void a() {
        b bVar = this.e.f.a;
        if (bVar.e == 0) {
            bVar.e = 1;
        }
    }

    public final void b(boolean z) {
        this.c = -9223372036854775807L;
        txc0 txc0Var = this.e;
        mnh mnhVar = txc0Var.f;
        w8z0 w8z0Var = txc0Var.b;
        if (txc0Var.k == 1) {
            if (z) {
                mnhVar.a.h();
            }
            glt0 glt0Var = mnhVar.c;
            w8z0 w8z0Var2 = (w8z0) glt0Var.f;
            slz slzVar = (slz) glt0Var.h;
            slzVar.a = 0;
            slzVar.b = 0;
            glt0Var.a = -9223372036854775807L;
            w8z0 w8z0Var3 = (w8z0) glt0Var.g;
            if (w8z0Var3.h() > 0) {
                d6z.l(w8z0Var3.h() > 0);
                while (w8z0Var3.h() > 1) {
                    w8z0Var3.e();
                }
                Object e = w8z0Var3.e();
                e.getClass();
                w8z0Var3.a(0L, (Long) e);
            }
            if (w8z0Var2.h() > 0) {
                d6z.l(w8z0Var2.h() > 0);
                while (w8z0Var2.h() > 1) {
                    w8z0Var2.e();
                }
                Object e2 = w8z0Var2.e();
                e2.getClass();
                w8z0Var2.a(0L, (do31) e2);
            }
            mnhVar.d.clear();
            while (w8z0Var.h() > 1) {
                w8z0Var.e();
            }
            if (w8z0Var.h() == 1) {
                Long l = (Long) w8z0Var.e();
                l.getClass();
                mnhVar.a(l.longValue(), txc0Var.m);
            }
            txc0Var.l = -9223372036854775807L;
            a3x0 a3x0Var = txc0Var.i;
            d6z.z(a3x0Var);
            a3x0Var.e(new vpa(20, txc0Var));
        }
    }

    public final Surface c() {
        d6z.x(false);
        d6z.z(null);
        throw null;
    }

    public final boolean d(a aVar) {
        txc0 txc0Var = this.e;
        d6z.x(txc0Var.k == 0);
        kfc kfcVar = aVar.B;
        if (kfcVar == null || !kfcVar.d()) {
            kfcVar = kfc.h;
        }
        if (kfcVar.c == 7 && tw21.a < 34) {
            jfc jfcVar = new jfc();
            jfcVar.a = kfcVar.a;
            jfcVar.b = kfcVar.b;
            jfcVar.d = kfcVar.d;
            jfcVar.e = kfcVar.e;
            jfcVar.f = kfcVar.f;
            jfcVar.c = 6;
            jfcVar.a();
        }
        y3c y3cVar = txc0Var.g;
        Looper myLooper = Looper.myLooper();
        d6z.z(myLooper);
        txc0Var.i = ((o2x0) y3cVar).a(myLooper, null);
        try {
            txc0Var.c.a();
            throw null;
        } catch (VideoFrameProcessingException e) {
            throw new VideoSink$VideoSinkException(e, aVar);
        }
    }

    public final void e(a aVar, List list) {
        d6z.x(false);
        txc0 txc0Var = this.e;
        txc0Var.c.getClass();
        ImmutableList.a aVar2 = new ImmutableList.a();
        aVar2.d(list);
        aVar2.d(txc0Var.e);
        this.a = aVar2.g();
        this.b = aVar;
        f7s a = aVar.a();
        kfc kfcVar = aVar.B;
        if (kfcVar == null || !kfcVar.d()) {
            kfcVar = kfc.h;
        }
        a.A = kfcVar;
        a.a();
        d6z.z(null);
        throw null;
    }

    public final void f(boolean z) {
        this.e.f.a.e = z ? 1 : 0;
    }

    public final void g() {
        this.e.f.a.f();
    }

    public final void h() {
        this.e.f.a.g();
    }

    public final void i() {
        txc0 txc0Var = this.e;
        if (txc0Var.k == 2) {
            return;
        }
        a3x0 a3x0Var = txc0Var.i;
        if (a3x0Var != null) {
            a3x0Var.a.removeCallbacksAndMessages(null);
        }
        txc0Var.j = null;
        txc0Var.k = 2;
    }

    public final void j(int i) {
        c cVar = this.e.f.a.b;
        if (cVar.j == i) {
            return;
        }
        cVar.j = i;
        cVar.d(true);
    }

    public final void k(Surface surface, vis0 vis0Var) {
        txc0 txc0Var = this.e;
        Pair pair = txc0Var.j;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((vis0) txc0Var.j.second).equals(vis0Var)) {
            return;
        }
        txc0Var.j = Pair.create(surface, vis0Var);
        int i = vis0Var.a;
    }

    public final void l(float f) {
        this.e.f.a.k(f);
    }

    public final void m(long j, long j2) {
        txc0 txc0Var = this.e;
        w8z0 w8z0Var = txc0Var.b;
        long j3 = this.c;
        w8z0Var.a(j3 == -9223372036854775807L ? 0L : j3 + 1, Long.valueOf(j));
        txc0Var.m = j2;
        txc0Var.f.a(0L, j2);
    }

    public final void n(List list) {
        if (this.a.equals(list)) {
            return;
        }
        txc0 txc0Var = this.e;
        txc0Var.c.getClass();
        ImmutableList.a aVar = new ImmutableList.a();
        aVar.d(list);
        aVar.d(txc0Var.e);
        this.a = aVar.g();
        a aVar2 = this.b;
        if (aVar2 == null) {
            return;
        }
        f7s a = aVar2.a();
        kfc kfcVar = aVar2.B;
        if (kfcVar == null || !kfcVar.d()) {
            kfcVar = kfc.h;
        }
        a.A = kfcVar;
        a.a();
        d6z.z(null);
        throw null;
    }

    public final void o(xl31 xl31Var) {
        this.e.f.i = xl31Var;
    }

    public final void p() {
        long j = this.c;
        txc0 txc0Var = this.e;
        if (txc0Var.l >= j) {
            long j2 = txc0Var.f.c.a;
        }
    }
}
