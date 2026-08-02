package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import yads.af1;

/* loaded from: classes7.dex */
public final class t671 implements ca71 {
    public static final m191 d = new m191(2, -9223372036854775807L);
    public static final m191 e = new m191(3, -9223372036854775807L);
    public final ExecutorService a;
    public af1 b;
    public IOException c;

    public t671(String str) {
        String concat = "ExoPlayer:Loader:".concat(str);
        int i = rf71.a;
        this.a = Executors.newSingleThreadExecutor(new ywd(concat, 3));
    }

    @Override // defpackage.ca71
    public final void a() {
        b(Integer.MIN_VALUE);
    }

    public final void b(int i) {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        af1 af1Var = this.b;
        if (af1Var != null) {
            if (i == Integer.MIN_VALUE) {
                i = af1Var.b;
            }
            IOException iOException2 = af1Var.f;
            if (iOException2 != null && af1Var.g > i) {
                throw iOException2;
            }
        }
    }

    public final void c(zl61 zl61Var, av81 av81Var, int i) {
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            ny61.k();
            return;
        }
        this.c = null;
        af1 af1Var = new af1(this, myLooper, zl61Var, av81Var, i, SystemClock.elapsedRealtime());
        if (this.b != null) {
            ny61.k();
            return;
        }
        this.b = af1Var;
        af1Var.f = null;
        this.a.execute(af1Var);
    }

    public final void d(mp61 mp61Var) {
        af1 af1Var = this.b;
        if (af1Var != null) {
            af1Var.a(true);
        }
        ExecutorService executorService = this.a;
        if (mp61Var != null) {
            executorService.execute(new h3s0(mp61Var));
        }
        executorService.shutdown();
    }

    public final boolean e() {
        return this.b != null;
    }
}
