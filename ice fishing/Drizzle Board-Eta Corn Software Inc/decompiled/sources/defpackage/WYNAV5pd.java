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

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class WYNAV5pd implements Future {
    public static final Object Qr9iLBAD;
    public static final ra b2ZJblxo;
    public volatile I5GHvsYW MdtA4re8;
    public volatile Object NCTxEWno;
    public volatile gjV1z5T1 wxUZMvaN;
    public static final boolean VgvYg0wo = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger P7K7Inc8 = Logger.getLogger(WYNAV5pd.class.getName());

    static {
        ra fySoLYna;
        try {
            fySoLYna = new RXQxj5Oe(AtomicReferenceFieldUpdater.newUpdater(gjV1z5T1.class, Thread.class, "qoPGr6Ce"), AtomicReferenceFieldUpdater.newUpdater(gjV1z5T1.class, gjV1z5T1.class, "NCTxEWno"), AtomicReferenceFieldUpdater.newUpdater(WYNAV5pd.class, gjV1z5T1.class, "wxUZMvaN"), AtomicReferenceFieldUpdater.newUpdater(WYNAV5pd.class, I5GHvsYW.class, "MdtA4re8"), AtomicReferenceFieldUpdater.newUpdater(WYNAV5pd.class, Object.class, "NCTxEWno"));
            th = null;
        } catch (Throwable th) {
            th = th;
            fySoLYna = new FySoLYna();
        }
        b2ZJblxo = fySoLYna;
        if (th != null) {
            P7K7Inc8.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        Qr9iLBAD = new Object();
    }

    public static Object MdtA4re8(Object obj) {
        if (obj instanceof KlHjfFWx) {
            Throwable th = ((KlHjfFWx) obj).qoPGr6Ce;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof Ey6iv0m0) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == Qr9iLBAD) {
            return null;
        }
        return obj;
    }

    public static void NCTxEWno(WYNAV5pd wYNAV5pd) {
        gjV1z5T1 gjv1z5t1;
        I5GHvsYW i5GHvsYW;
        do {
            gjv1z5t1 = wYNAV5pd.wxUZMvaN;
        } while (!b2ZJblxo.eVhOlqcC(wYNAV5pd, gjv1z5t1, gjV1z5T1.MdtA4re8));
        while (gjv1z5t1 != null) {
            Thread thread = gjv1z5t1.qoPGr6Ce;
            if (thread != null) {
                gjv1z5t1.qoPGr6Ce = null;
                LockSupport.unpark(thread);
            }
            gjv1z5t1 = gjv1z5t1.NCTxEWno;
        }
        do {
            i5GHvsYW = wYNAV5pd.MdtA4re8;
        } while (!b2ZJblxo.Qr9iLBAD(wYNAV5pd, i5GHvsYW));
        I5GHvsYW i5GHvsYW2 = null;
        while (i5GHvsYW != null) {
            I5GHvsYW i5GHvsYW3 = i5GHvsYW.qoPGr6Ce;
            i5GHvsYW.qoPGr6Ce = i5GHvsYW2;
            i5GHvsYW2 = i5GHvsYW;
            i5GHvsYW = i5GHvsYW3;
        }
        while (i5GHvsYW2 != null) {
            i5GHvsYW2 = i5GHvsYW2.qoPGr6Ce;
            try {
                throw null;
            } catch (RuntimeException e) {
                P7K7Inc8.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    public static Object wxUZMvaN(WYNAV5pd wYNAV5pd) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = wYNAV5pd.get();
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

    public final void VgvYg0wo(gjV1z5T1 gjv1z5t1) {
        gjv1z5t1.qoPGr6Ce = null;
        while (true) {
            gjV1z5T1 gjv1z5t12 = this.wxUZMvaN;
            if (gjv1z5t12 == gjV1z5T1.MdtA4re8) {
                return;
            }
            gjV1z5T1 gjv1z5t13 = null;
            while (gjv1z5t12 != null) {
                gjV1z5T1 gjv1z5t14 = gjv1z5t12.NCTxEWno;
                if (gjv1z5t12.qoPGr6Ce != null) {
                    gjv1z5t13 = gjv1z5t12;
                } else if (gjv1z5t13 != null) {
                    gjv1z5t13.NCTxEWno = gjv1z5t14;
                    if (gjv1z5t13.qoPGr6Ce == null) {
                        break;
                    }
                } else if (!b2ZJblxo.eVhOlqcC(this, gjv1z5t12, gjv1z5t14)) {
                    break;
                }
                gjv1z5t12 = gjv1z5t14;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.NCTxEWno;
        if (obj != null) {
            return false;
        }
        if (!b2ZJblxo.jb9XjC4I(this, obj, VgvYg0wo ? new KlHjfFWx(new CancellationException("Future.cancel() was called."), z) : z ? KlHjfFWx.NCTxEWno : KlHjfFWx.MdtA4re8)) {
            return false;
        }
        NCTxEWno(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        gjV1z5T1 gjv1z5t1 = gjV1z5T1.MdtA4re8;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.NCTxEWno;
        if (obj != null) {
            return MdtA4re8(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            gjV1z5T1 gjv1z5t12 = this.wxUZMvaN;
            if (gjv1z5t12 != gjv1z5t1) {
                gjV1z5T1 gjv1z5t13 = new gjV1z5T1();
                do {
                    ra raVar = b2ZJblxo;
                    raVar.U0LaHZX7(gjv1z5t13, gjv1z5t12);
                    if (raVar.eVhOlqcC(this, gjv1z5t12, gjv1z5t13)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                VgvYg0wo(gjv1z5t13);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.NCTxEWno;
                            if (obj2 != null) {
                                return MdtA4re8(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        VgvYg0wo(gjv1z5t13);
                    } else {
                        gjv1z5t12 = this.wxUZMvaN;
                    }
                } while (gjv1z5t12 != gjv1z5t1);
            }
            return MdtA4re8(this.NCTxEWno);
        }
        while (nanos > 0) {
            Object obj3 = this.NCTxEWno;
            if (obj3 != null) {
                return MdtA4re8(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String wYNAV5pd = toString();
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
        throw new TimeoutException(q70.P7K7Inc8(str, " for ", wYNAV5pd));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.NCTxEWno instanceof KlHjfFWx;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.NCTxEWno != null;
    }

    public final void qoPGr6Ce(StringBuilder sb) {
        try {
            Object wxUZMvaN = wxUZMvaN(this);
            sb.append("SUCCESS, result=[");
            sb.append(wxUZMvaN == this ? "this future" : String.valueOf(wxUZMvaN));
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

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.NCTxEWno instanceof KlHjfFWx) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            qoPGr6Ce(sb);
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
                qoPGr6Ce(sb);
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
        gjV1z5T1 gjv1z5t1 = gjV1z5T1.MdtA4re8;
        if (!Thread.interrupted()) {
            Object obj2 = this.NCTxEWno;
            if (obj2 != null) {
                return MdtA4re8(obj2);
            }
            gjV1z5T1 gjv1z5t12 = this.wxUZMvaN;
            if (gjv1z5t12 != gjv1z5t1) {
                gjV1z5T1 gjv1z5t13 = new gjV1z5T1();
                do {
                    ra raVar = b2ZJblxo;
                    raVar.U0LaHZX7(gjv1z5t13, gjv1z5t12);
                    if (raVar.eVhOlqcC(this, gjv1z5t12, gjv1z5t13)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.NCTxEWno;
                            } else {
                                VgvYg0wo(gjv1z5t13);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return MdtA4re8(obj);
                    }
                    gjv1z5t12 = this.wxUZMvaN;
                } while (gjv1z5t12 != gjv1z5t1);
            }
            return MdtA4re8(this.NCTxEWno);
        }
        throw new InterruptedException();
    }
}
