package defpackage;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.zzw;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes11.dex */
public abstract class u430 {
    public final itx0 a;
    public final AtomicInteger b;
    public final AtomicBoolean c;

    public u430() {
        this.b = new AtomicInteger(0);
        this.c = new AtomicBoolean(false);
        this.a = new itx0();
    }

    public final zzw a(final Executor executor, Callable callable, final CancellationToken cancellationToken) {
        cvw.o(this.b.get() > 0);
        if (cancellationToken.a()) {
            zzw zzwVar = new zzw();
            zzwVar.t();
            return zzwVar;
        }
        final x18 x18Var = new x18();
        final atx0 atx0Var = new atx0(x18Var.a);
        this.a.a(new vz(this, cancellationToken, x18Var, callable, atx0Var, 8), new Executor() { // from class: zxa1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e) {
                    if (cancellationToken.a()) {
                        x18Var.a();
                    } else {
                        atx0Var.a.r(e);
                    }
                    throw e;
                }
            }
        });
        return atx0Var.a;
    }

    public abstract void b();

    public abstract void c();

    public u430(itx0 itx0Var) {
        this.b = new AtomicInteger(0);
        this.c = new AtomicBoolean(false);
        this.a = itx0Var;
    }
}
