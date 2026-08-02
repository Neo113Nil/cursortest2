package defpackage;

import com.google.common.util.concurrent.a;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* loaded from: classes11.dex */
public final class w4r0 extends x7 implements euy {
    public static void g(w4r0 w4r0Var) {
        for (w7 f = x7.z.f(w4r0Var); f != null; f = f.b) {
            Thread thread = f.a;
            if (thread != null) {
                f.a = null;
                LockSupport.unpark(thread);
            }
        }
        o7 e = x7.z.e(w4r0Var);
        o7 o7Var = null;
        while (e != null) {
            o7 o7Var2 = e.c;
            e.c = o7Var;
            o7Var = e;
            e = o7Var2;
        }
        while (o7Var != null) {
            o7 o7Var3 = o7Var.c;
            Runnable runnable = o7Var.a;
            Objects.requireNonNull(runnable);
            Executor executor = o7Var.b;
            Objects.requireNonNull(executor);
            h(runnable, executor);
            o7Var = o7Var3;
        }
    }

    public static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            x7.x.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object i(Object obj) {
        if (obj instanceof n7) {
            Throwable th = ((n7) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof a) {
            throw new ExecutionException(((a) obj).a);
        }
        if (obj == x7.w) {
            return null;
        }
        return obj;
    }

    public static Object j(w4r0 w4r0Var) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = w4r0Var.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // defpackage.x7
    public final Throwable b() {
        if (!(this instanceof w4r0)) {
            return null;
        }
        Object obj = this.a;
        if (obj instanceof a) {
            return ((a) obj).a;
        }
        return null;
    }

    @Override // defpackage.euy
    public final void c(Runnable runnable, Executor executor) {
        o7 o7Var;
        o7 o7Var2 = o7.d;
        ffx.o(executor, "Executor was null.");
        if (!isDone() && (o7Var = this.b) != o7Var2) {
            o7 o7Var3 = new o7(runnable, executor);
            do {
                o7Var3.c = o7Var;
                if (x7.z.b(this, o7Var, o7Var3)) {
                    return;
                } else {
                    o7Var = this.b;
                }
            } while (o7Var != o7Var2);
        }
        h(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        n7 n7Var;
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (x7.y) {
            n7Var = new n7(new CancellationException("Future.cancel() was called."), z);
        } else {
            n7Var = z ? n7.b : n7.c;
            Objects.requireNonNull(n7Var);
        }
        if (!x7.z.c(this, obj, n7Var)) {
            return false;
        }
        g(this);
        return true;
    }

    public final void e(StringBuilder sb) {
        try {
            Object j = j(this);
            sb.append("SUCCESS, result=[");
            f(sb, j);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    public final void f(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        long j2;
        w7 w7Var = w7.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if (obj != null) {
            return i(obj);
        }
        long j3 = 0;
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            w7 w7Var2 = this.c;
            if (w7Var2 != w7Var) {
                w7 w7Var3 = new w7();
                while (true) {
                    qha1 qha1Var = x7.z;
                    qha1Var.i(w7Var3, w7Var2);
                    if (qha1Var.d(this, w7Var2, w7Var3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                a(w7Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return i(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        a(w7Var3);
                    } else {
                        long j4 = j3;
                        w7Var2 = this.c;
                        if (w7Var2 == w7Var) {
                            break;
                        }
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return i(obj3);
        }
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.a;
            if (obj4 != null) {
                return i(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String w4r0Var = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        StringBuilder w = unr0.w(j, "Waited ", " ");
        w.append(timeUnit.toString().toLowerCase(locale));
        String sb = w.toString();
        if (nanos + 1000 < j2) {
            String concat = sb.concat(" (plus ");
            long j5 = -nanos;
            long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(convert);
            boolean z = convert == j2 || nanos2 > 1000;
            if (convert > j2) {
                String str = concat + convert + " " + lowerCase;
                if (z) {
                    str = str.concat(",");
                }
                concat = str.concat(" ");
            }
            if (z) {
                concat = concat + nanos2 + " nanoseconds ";
            }
            sb = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(sb.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(g8e.p(sb, " for ", w4r0Var));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof n7;
    }

    @Override // java.util.concurrent.Future
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final boolean isDone() {
        return this.a != null;
    }

    public final boolean l(Object obj) {
        if (obj == null) {
            obj = x7.w;
        }
        if (!x7.z.c(this, null, obj)) {
            return false;
        }
        g(this);
        return true;
    }

    public final boolean m(Throwable th) {
        th.getClass();
        if (!x7.z.c(this, null, new a(th))) {
            return false;
        }
        g(this);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        String str2;
        boolean z;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.a instanceof n7) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            e(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            try {
                str = null;
                if (this instanceof ScheduledFuture) {
                    str2 = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str2 = null;
                }
            } catch (Throwable th) {
                if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                    throw th;
                }
                str = "Exception thrown from implementation: " + th.getClass();
            }
            if (str2 != null) {
                if (!str2.isEmpty()) {
                    z = false;
                    if (!z) {
                        str = str2;
                    }
                    if (str != null) {
                        x4e.C(sb, ", info=[", str, "]");
                    }
                    if (isDone()) {
                        sb.delete(length, sb.length());
                        e(sb);
                    }
                }
            }
            z = true;
            if (!z) {
            }
            if (str != null) {
            }
            if (isDone()) {
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        w7 w7Var = w7.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return i(obj2);
            }
            w7 w7Var2 = this.c;
            if (w7Var2 != w7Var) {
                w7 w7Var3 = new w7();
                do {
                    qha1 qha1Var = x7.z;
                    qha1Var.i(w7Var3, w7Var2);
                    if (qha1Var.d(this, w7Var2, w7Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                a(w7Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return i(obj);
                    }
                    w7Var2 = this.c;
                } while (w7Var2 != w7Var);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return i(obj3);
        }
        throw new InterruptedException();
    }
}
