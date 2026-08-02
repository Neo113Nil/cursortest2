package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class x2f implements lcg {
    public final ou7 a;
    public final xop b = new xop();
    public boolean c;

    public x2f(ou7 ou7Var) {
        this.a = ou7Var;
    }

    @Override // defpackage.lcg
    public final void a(Runnable runnable, Executor executor) {
        this.b.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (!this.b.cancel(z)) {
            return false;
        }
        this.a.g(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj = this.b.get();
        if (obj instanceof iu3) {
            throw new CancellationException().initCause(((iu3) obj).a);
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        boolean z;
        if (this.b.a instanceof g6) {
            return true;
        }
        if (this.b.isDone() && !this.c) {
            try {
                z = uwf.t(this.b) instanceof iu3;
            } catch (CancellationException unused) {
                z = true;
            } catch (ExecutionException unused2) {
                this.c = true;
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        xop xopVar = this.b;
        if (xopVar.isDone()) {
            try {
                Object t = uwf.t(xopVar);
                if (t instanceof iu3) {
                    sb.append("CANCELLED, cause=[" + ((iu3) t).a + ']');
                } else {
                    sb.append("SUCCESS, result=[" + t + ']');
                }
            } catch (CancellationException unused) {
                sb.append("CANCELLED");
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[" + e.getCause() + ']');
            } catch (Throwable th) {
                sb.append("UNKNOWN, cause=[" + th.getClass() + " thrown from get()]");
            }
        } else {
            sb.append("PENDING, delegate=[" + xopVar + ']');
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        Object obj = this.b.get(j, timeUnit);
        if (obj instanceof iu3) {
            throw new CancellationException().initCause(((iu3) obj).a);
        }
        return obj;
    }
}
