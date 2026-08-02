package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class aip implements Executor {
    public static final Logger c = Logger.getLogger(aip.class.getName());
    public boolean a;
    public ArrayDeque b;

    public final void a() {
        while (true) {
            Runnable runnable = (Runnable) this.b.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th) {
                c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        o2g.O(runnable, "'task' must not be null.");
        if (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque(4);
            }
            this.b.add(runnable);
            return;
        }
        this.a = true;
        try {
            runnable.run();
        } catch (Throwable th) {
            try {
                c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
                if (this.b != null) {
                    a();
                }
                this.a = false;
            } finally {
                if (this.b != null) {
                    a();
                }
                this.a = false;
            }
        }
    }
}
