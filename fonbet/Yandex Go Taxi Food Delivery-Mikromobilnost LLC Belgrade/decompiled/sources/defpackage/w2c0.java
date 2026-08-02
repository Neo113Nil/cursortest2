package defpackage;

import android.os.Looper;
import androidx.room.util.a;
import com.yandex.messaging.internal.ServerMessageRef;

/* loaded from: classes15.dex */
public final class w2c0 {
    public final n5t0 a;
    public final x0j0 b;
    public final naz0 c;
    public final at2 d;
    public final oy80 e;
    public final Looper f = Looper.myLooper();
    public final zq60 g;
    public final sq60 h;
    public final x2c0 i;
    public w0j0 j;

    public w2c0(n5t0 n5t0Var, x0j0 x0j0Var, naz0 naz0Var, at2 at2Var) {
        this.a = n5t0Var;
        this.b = x0j0Var;
        this.c = naz0Var;
        this.d = at2Var;
        this.e = new oy80(15, naz0Var, at2Var);
        zq60 zq60Var = new zq60();
        this.g = zq60Var;
        this.h = new sq60(zq60Var);
        this.i = at2Var.D();
    }

    public final void a(long j, long j2) {
        x2c0 x2c0Var = this.i;
        naz0 naz0Var = this.c;
        z83.g(null, this.f, Looper.myLooper());
        ikw0 startTransaction = this.d.startTransaction();
        try {
            o1b0 o1b0Var = naz0Var.a;
            o1b0 o1b0Var2 = naz0Var.a;
            if (!((Boolean) a.b(x2c0Var.a, true, false, new dz10(17, o1b0Var.a, j2))).booleanValue()) {
                ((Number) a.b(x2c0Var.a, false, true, new ww90(23, x2c0Var, new y2c0(o1b0Var2.a, j, j2)))).longValue();
                startTransaction.c(this, j > 0 ? new ServerMessageRef(o1b0Var2.b, j) : null);
            }
            startTransaction.s();
            ooc.g(startTransaction, null);
        } finally {
        }
    }
}
