package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class IBvW5fLsPuHy implements java.util.concurrent.Future {
    public static final defpackage.jr0 GE9mJIPrb8gP;
    public static final java.lang.Object Ns0WNyEWdPsk;
    public static final boolean P05cfTpS5W5L = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final java.util.logging.Logger e6mdH7fiFuta = java.util.logging.Logger.getLogger(defpackage.IBvW5fLsPuHy.class.getName());
    public volatile defpackage.KrtOTfE6jiS2 QiMR8OkAhezm;
    public volatile java.lang.Object WDYagTQQm9ns;
    public volatile defpackage.jjTN4uUnoyEn oh71FJcDz6S2;

    static {
        defpackage.jr0 frswwkilbuhk;
        try {
            frswwkilbuhk = new defpackage.Mearx7yMn90V(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.KrtOTfE6jiS2.class, java.lang.Thread.class, "ZpBGe2uQfcn8"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.KrtOTfE6jiS2.class, defpackage.KrtOTfE6jiS2.class, "giKS3J6vZuNy"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.IBvW5fLsPuHy.class, defpackage.KrtOTfE6jiS2.class, "QiMR8OkAhezm"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.IBvW5fLsPuHy.class, defpackage.jjTN4uUnoyEn.class, "oh71FJcDz6S2"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.IBvW5fLsPuHy.class, java.lang.Object.class, "WDYagTQQm9ns"));
            th = null;
        } catch (java.lang.Throwable th) {
            th = th;
            frswwkilbuhk = new defpackage.frSwwKIlbUhK();
        }
        GE9mJIPrb8gP = frswwkilbuhk;
        if (th != null) {
            e6mdH7fiFuta.log(java.util.logging.Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        Ns0WNyEWdPsk = new java.lang.Object();
    }

    public static java.lang.Object JhCgjQRTAOCT(defpackage.IBvW5fLsPuHy iBvW5fLsPuHy) {
        java.lang.Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = iBvW5fLsPuHy.get();
                break;
            } catch (java.lang.InterruptedException unused) {
                z = true;
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static java.lang.Object fWTAfUmVKrZq(java.lang.Object obj) {
        if (obj instanceof defpackage.UmgHb6n58gfG) {
            java.lang.Throwable th = ((defpackage.UmgHb6n58gfG) obj).ZpBGe2uQfcn8;
            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof defpackage.qjMheFZ0l9kA) {
            throw new java.util.concurrent.ExecutionException((java.lang.Throwable) null);
        }
        if (obj == Ns0WNyEWdPsk) {
            return null;
        }
        return obj;
    }

    public static void giKS3J6vZuNy(defpackage.IBvW5fLsPuHy iBvW5fLsPuHy) {
        defpackage.KrtOTfE6jiS2 krtOTfE6jiS2;
        defpackage.jjTN4uUnoyEn jjtn4uunoyen;
        do {
            krtOTfE6jiS2 = iBvW5fLsPuHy.QiMR8OkAhezm;
        } while (!GE9mJIPrb8gP.T1fB7bDYiVJQ(iBvW5fLsPuHy, krtOTfE6jiS2, defpackage.KrtOTfE6jiS2.fWTAfUmVKrZq));
        while (krtOTfE6jiS2 != null) {
            java.lang.Thread thread = krtOTfE6jiS2.ZpBGe2uQfcn8;
            if (thread != null) {
                krtOTfE6jiS2.ZpBGe2uQfcn8 = null;
                java.util.concurrent.locks.LockSupport.unpark(thread);
            }
            krtOTfE6jiS2 = krtOTfE6jiS2.giKS3J6vZuNy;
        }
        do {
            jjtn4uunoyen = iBvW5fLsPuHy.oh71FJcDz6S2;
        } while (!GE9mJIPrb8gP.h3m55N1URyyK(iBvW5fLsPuHy, jjtn4uunoyen));
        defpackage.jjTN4uUnoyEn jjtn4uunoyen2 = null;
        while (jjtn4uunoyen != null) {
            defpackage.jjTN4uUnoyEn jjtn4uunoyen3 = jjtn4uunoyen.ZpBGe2uQfcn8;
            jjtn4uunoyen.ZpBGe2uQfcn8 = jjtn4uunoyen2;
            jjtn4uunoyen2 = jjtn4uunoyen;
            jjtn4uunoyen = jjtn4uunoyen3;
        }
        while (jjtn4uunoyen2 != null) {
            jjtn4uunoyen2 = jjtn4uunoyen2.ZpBGe2uQfcn8;
            try {
                throw null;
            } catch (java.lang.RuntimeException e) {
                e6mdH7fiFuta.log(java.util.logging.Level.SEVERE, "RuntimeException while executing runnable null with executor null", (java.lang.Throwable) e);
            }
        }
    }

    public final void WDYagTQQm9ns(defpackage.KrtOTfE6jiS2 krtOTfE6jiS2) {
        krtOTfE6jiS2.ZpBGe2uQfcn8 = null;
        while (true) {
            defpackage.KrtOTfE6jiS2 krtOTfE6jiS22 = this.QiMR8OkAhezm;
            if (krtOTfE6jiS22 == defpackage.KrtOTfE6jiS2.fWTAfUmVKrZq) {
                return;
            }
            defpackage.KrtOTfE6jiS2 krtOTfE6jiS23 = null;
            while (krtOTfE6jiS22 != null) {
                defpackage.KrtOTfE6jiS2 krtOTfE6jiS24 = krtOTfE6jiS22.giKS3J6vZuNy;
                if (krtOTfE6jiS22.ZpBGe2uQfcn8 != null) {
                    krtOTfE6jiS23 = krtOTfE6jiS22;
                } else if (krtOTfE6jiS23 != null) {
                    krtOTfE6jiS23.giKS3J6vZuNy = krtOTfE6jiS24;
                    if (krtOTfE6jiS23.ZpBGe2uQfcn8 == null) {
                        break;
                    }
                } else if (!GE9mJIPrb8gP.T1fB7bDYiVJQ(this, krtOTfE6jiS22, krtOTfE6jiS24)) {
                    break;
                }
                krtOTfE6jiS22 = krtOTfE6jiS24;
            }
            return;
        }
    }

    public final void ZpBGe2uQfcn8(java.lang.StringBuilder sb) {
        try {
            java.lang.Object JhCgjQRTAOCT = JhCgjQRTAOCT(this);
            sb.append("SUCCESS, result=[");
            sb.append(JhCgjQRTAOCT == this ? "this future" : java.lang.String.valueOf(JhCgjQRTAOCT));
            sb.append("]");
        } catch (java.util.concurrent.CancellationException unused) {
            sb.append("CANCELLED");
        } catch (java.lang.RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (java.util.concurrent.ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        java.lang.Object obj = this.WDYagTQQm9ns;
        if (obj != null) {
            return false;
        }
        if (!GE9mJIPrb8gP.gUjdnLbkVAaA(this, obj, P05cfTpS5W5L ? new defpackage.UmgHb6n58gfG(new java.util.concurrent.CancellationException("Future.cancel() was called."), z) : z ? defpackage.UmgHb6n58gfG.giKS3J6vZuNy : defpackage.UmgHb6n58gfG.fWTAfUmVKrZq)) {
            return false;
        }
        giKS3J6vZuNy(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.KrtOTfE6jiS2 krtOTfE6jiS2 = defpackage.KrtOTfE6jiS2.fWTAfUmVKrZq;
        long nanos = timeUnit.toNanos(j);
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj = this.WDYagTQQm9ns;
        if (obj != null) {
            return fWTAfUmVKrZq(obj);
        }
        long nanoTime = nanos > 0 ? java.lang.System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            defpackage.KrtOTfE6jiS2 krtOTfE6jiS22 = this.QiMR8OkAhezm;
            if (krtOTfE6jiS22 != krtOTfE6jiS2) {
                defpackage.KrtOTfE6jiS2 krtOTfE6jiS23 = new defpackage.KrtOTfE6jiS2();
                do {
                    defpackage.jr0 jr0Var = GE9mJIPrb8gP;
                    jr0Var.w6IV1lieBIux(krtOTfE6jiS23, krtOTfE6jiS22);
                    if (jr0Var.T1fB7bDYiVJQ(this, krtOTfE6jiS22, krtOTfE6jiS23)) {
                        do {
                            java.util.concurrent.locks.LockSupport.parkNanos(this, nanos);
                            if (java.lang.Thread.interrupted()) {
                                WDYagTQQm9ns(krtOTfE6jiS23);
                                throw new java.lang.InterruptedException();
                            }
                            java.lang.Object obj2 = this.WDYagTQQm9ns;
                            if (obj2 != null) {
                                return fWTAfUmVKrZq(obj2);
                            }
                            nanos = nanoTime - java.lang.System.nanoTime();
                        } while (nanos >= 1000);
                        WDYagTQQm9ns(krtOTfE6jiS23);
                    } else {
                        krtOTfE6jiS22 = this.QiMR8OkAhezm;
                    }
                } while (krtOTfE6jiS22 != krtOTfE6jiS2);
            }
            return fWTAfUmVKrZq(this.WDYagTQQm9ns);
        }
        while (nanos > 0) {
            java.lang.Object obj3 = this.WDYagTQQm9ns;
            if (obj3 != null) {
                return fWTAfUmVKrZq(obj3);
            }
            if (java.lang.Thread.interrupted()) {
                throw new java.lang.InterruptedException();
            }
            nanos = nanoTime - java.lang.System.nanoTime();
        }
        java.lang.String iBvW5fLsPuHy = toString();
        java.lang.String obj4 = timeUnit.toString();
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = obj4.toLowerCase(locale);
        java.lang.String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            java.lang.String concat = str.concat(" (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, java.util.concurrent.TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                java.lang.String str2 = concat + convert + " " + lowerCase;
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
            throw new java.util.concurrent.TimeoutException(str.concat(" but future completed as timeout expired"));
        }
        throw new java.util.concurrent.TimeoutException(str + " for " + iBvW5fLsPuHy);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.WDYagTQQm9ns instanceof defpackage.UmgHb6n58gfG;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.WDYagTQQm9ns != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.WDYagTQQm9ns instanceof defpackage.UmgHb6n58gfG) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            ZpBGe2uQfcn8(sb);
        } else {
            try {
                if (this instanceof java.util.concurrent.ScheduledFuture) {
                    str = "remaining delay=[" + ((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (java.lang.RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                ZpBGe2uQfcn8(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        java.lang.Object obj;
        defpackage.KrtOTfE6jiS2 krtOTfE6jiS2 = defpackage.KrtOTfE6jiS2.fWTAfUmVKrZq;
        if (!java.lang.Thread.interrupted()) {
            java.lang.Object obj2 = this.WDYagTQQm9ns;
            if (obj2 != null) {
                return fWTAfUmVKrZq(obj2);
            }
            defpackage.KrtOTfE6jiS2 krtOTfE6jiS22 = this.QiMR8OkAhezm;
            if (krtOTfE6jiS22 != krtOTfE6jiS2) {
                defpackage.KrtOTfE6jiS2 krtOTfE6jiS23 = new defpackage.KrtOTfE6jiS2();
                do {
                    defpackage.jr0 jr0Var = GE9mJIPrb8gP;
                    jr0Var.w6IV1lieBIux(krtOTfE6jiS23, krtOTfE6jiS22);
                    if (jr0Var.T1fB7bDYiVJQ(this, krtOTfE6jiS22, krtOTfE6jiS23)) {
                        do {
                            java.util.concurrent.locks.LockSupport.park(this);
                            if (!java.lang.Thread.interrupted()) {
                                obj = this.WDYagTQQm9ns;
                            } else {
                                WDYagTQQm9ns(krtOTfE6jiS23);
                                throw new java.lang.InterruptedException();
                            }
                        } while (obj == null);
                        return fWTAfUmVKrZq(obj);
                    }
                    krtOTfE6jiS22 = this.QiMR8OkAhezm;
                } while (krtOTfE6jiS22 != krtOTfE6jiS2);
            }
            return fWTAfUmVKrZq(this.WDYagTQQm9ns);
        }
        throw new java.lang.InterruptedException();
    }
}
