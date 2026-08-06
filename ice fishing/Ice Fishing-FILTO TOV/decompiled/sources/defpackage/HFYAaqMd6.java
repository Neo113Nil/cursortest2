package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class HFYAaqMd6 implements Future {
    public static final n30 JFJ3QoxA;
    public static final boolean encWxUiV2 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger mOu10nynGul = Logger.getLogger(HFYAaqMd6.class.getName());
    public static final Object rQPn8YBR;
    public volatile DmJncFq5 AvO7iQsrTN;
    public volatile eUH21U3apd EljAMC1QTz;
    public volatile Object OOA6hdeuvCS;

    static {
        n30 mZhzXH72;
        try {
            mZhzXH72 = new A1EKNP6CxJ(AtomicReferenceFieldUpdater.newUpdater(DmJncFq5.class, Thread.class, "GWasM1elztuh"), AtomicReferenceFieldUpdater.newUpdater(DmJncFq5.class, DmJncFq5.class, "Yi7zF1RB1"), AtomicReferenceFieldUpdater.newUpdater(HFYAaqMd6.class, DmJncFq5.class, "AvO7iQsrTN"), AtomicReferenceFieldUpdater.newUpdater(HFYAaqMd6.class, eUH21U3apd.class, "EljAMC1QTz"), AtomicReferenceFieldUpdater.newUpdater(HFYAaqMd6.class, Object.class, "OOA6hdeuvCS"));
            th = null;
        } catch (Throwable th) {
            th = th;
            mZhzXH72 = new MZhzXH72();
        }
        JFJ3QoxA = mZhzXH72;
        if (th != null) {
            mOu10nynGul.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        rQPn8YBR = new Object();
    }

    public static Object X1lG3V04pd(Object obj) {
        if (obj instanceof AEn1Rrio) {
            Throwable th = ((AEn1Rrio) obj).GWasM1elztuh;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof YZjbz8VdP5) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == rQPn8YBR) {
            return null;
        }
        return obj;
    }

    public static void Yi7zF1RB1(HFYAaqMd6 hFYAaqMd6) {
        DmJncFq5 dmJncFq5;
        eUH21U3apd euh21u3apd;
        do {
            dmJncFq5 = hFYAaqMd6.AvO7iQsrTN;
        } while (!JFJ3QoxA.iwATDS1i01k(hFYAaqMd6, dmJncFq5, DmJncFq5.X1lG3V04pd));
        while (dmJncFq5 != null) {
            Thread thread = dmJncFq5.GWasM1elztuh;
            if (thread != null) {
                dmJncFq5.GWasM1elztuh = null;
                LockSupport.unpark(thread);
            }
            dmJncFq5 = dmJncFq5.Yi7zF1RB1;
        }
        do {
            euh21u3apd = hFYAaqMd6.EljAMC1QTz;
        } while (!JFJ3QoxA.XnEVoBF0td1l(hFYAaqMd6, euh21u3apd));
        eUH21U3apd euh21u3apd2 = null;
        while (euh21u3apd != null) {
            eUH21U3apd euh21u3apd3 = euh21u3apd.GWasM1elztuh;
            euh21u3apd.GWasM1elztuh = euh21u3apd2;
            euh21u3apd2 = euh21u3apd;
            euh21u3apd = euh21u3apd3;
        }
        while (euh21u3apd2 != null) {
            euh21u3apd2 = euh21u3apd2.GWasM1elztuh;
            try {
                throw null;
            } catch (RuntimeException e) {
                mOu10nynGul.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    public static Object xqGvceK5x(HFYAaqMd6 hFYAaqMd6) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = hFYAaqMd6.get();
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

    public final void GWasM1elztuh(StringBuilder sb) {
        try {
            Object xqGvceK5x = xqGvceK5x(this);
            sb.append("SUCCESS, result=[");
            sb.append(xqGvceK5x == this ? "this future" : String.valueOf(xqGvceK5x));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    public final void OOA6hdeuvCS(DmJncFq5 dmJncFq5) {
        dmJncFq5.GWasM1elztuh = null;
        while (true) {
            DmJncFq5 dmJncFq52 = this.AvO7iQsrTN;
            if (dmJncFq52 == DmJncFq5.X1lG3V04pd) {
                return;
            }
            DmJncFq5 dmJncFq53 = null;
            while (dmJncFq52 != null) {
                DmJncFq5 dmJncFq54 = dmJncFq52.Yi7zF1RB1;
                if (dmJncFq52.GWasM1elztuh != null) {
                    dmJncFq53 = dmJncFq52;
                } else if (dmJncFq53 != null) {
                    dmJncFq53.Yi7zF1RB1 = dmJncFq54;
                    if (dmJncFq53.GWasM1elztuh == null) {
                        break;
                    }
                } else if (!JFJ3QoxA.iwATDS1i01k(this, dmJncFq52, dmJncFq54)) {
                    break;
                }
                dmJncFq52 = dmJncFq54;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.OOA6hdeuvCS;
        if (obj != null) {
            return false;
        }
        if (!JFJ3QoxA.uFEq9NpZ(this, obj, encWxUiV2 ? new AEn1Rrio(new CancellationException("Future.cancel() was called."), z) : z ? AEn1Rrio.Yi7zF1RB1 : AEn1Rrio.X1lG3V04pd)) {
            return false;
        }
        Yi7zF1RB1(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        DmJncFq5 dmJncFq5 = DmJncFq5.X1lG3V04pd;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.OOA6hdeuvCS;
        if (obj != null) {
            return X1lG3V04pd(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            DmJncFq5 dmJncFq52 = this.AvO7iQsrTN;
            if (dmJncFq52 != dmJncFq5) {
                DmJncFq5 dmJncFq53 = new DmJncFq5();
                do {
                    n30 n30Var = JFJ3QoxA;
                    n30Var.rezfBrjOrqK(dmJncFq53, dmJncFq52);
                    if (n30Var.iwATDS1i01k(this, dmJncFq52, dmJncFq53)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                OOA6hdeuvCS(dmJncFq53);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.OOA6hdeuvCS;
                            if (obj2 != null) {
                                return X1lG3V04pd(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        OOA6hdeuvCS(dmJncFq53);
                    } else {
                        dmJncFq52 = this.AvO7iQsrTN;
                    }
                } while (dmJncFq52 != dmJncFq5);
            }
            return X1lG3V04pd(this.OOA6hdeuvCS);
        }
        while (nanos > 0) {
            Object obj3 = this.OOA6hdeuvCS;
            if (obj3 != null) {
                return X1lG3V04pd(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String hFYAaqMd6 = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String concat = str.concat(" (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = concat + convert + " " + lowerCase;
                if (z) {
                    str2 = str2.concat(",");
                }
                concat = str2.concat(" ");
            }
            if (z) {
                concat = concat + nanos2 + " nanoseconds ";
            }
            str = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(str.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + hFYAaqMd6);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.OOA6hdeuvCS instanceof AEn1Rrio;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.OOA6hdeuvCS != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.OOA6hdeuvCS instanceof AEn1Rrio) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            GWasM1elztuh(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                GWasM1elztuh(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        DmJncFq5 dmJncFq5 = DmJncFq5.X1lG3V04pd;
        if (!Thread.interrupted()) {
            Object obj2 = this.OOA6hdeuvCS;
            if (obj2 != null) {
                return X1lG3V04pd(obj2);
            }
            DmJncFq5 dmJncFq52 = this.AvO7iQsrTN;
            if (dmJncFq52 != dmJncFq5) {
                DmJncFq5 dmJncFq53 = new DmJncFq5();
                do {
                    n30 n30Var = JFJ3QoxA;
                    n30Var.rezfBrjOrqK(dmJncFq53, dmJncFq52);
                    if (n30Var.iwATDS1i01k(this, dmJncFq52, dmJncFq53)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.OOA6hdeuvCS;
                            } else {
                                OOA6hdeuvCS(dmJncFq53);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return X1lG3V04pd(obj);
                    }
                    dmJncFq52 = this.AvO7iQsrTN;
                } while (dmJncFq52 != dmJncFq5);
            }
            return X1lG3V04pd(this.OOA6hdeuvCS);
        }
        throw new InterruptedException();
    }
}
