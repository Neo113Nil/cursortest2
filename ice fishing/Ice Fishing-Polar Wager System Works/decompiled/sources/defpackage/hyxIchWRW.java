package defpackage;

/* loaded from: classes.dex */
public abstract class hyxIchWRW implements java.util.concurrent.Future {
    public static final defpackage.s21 SH1y5HwkJhh;
    public static final java.lang.Object ez2rX8ReCYw;
    public volatile defpackage.mAr5m2L7gYDP AARZUJiTa;
    public volatile java.lang.Object adDC3e2L;
    public volatile defpackage.yIx6ChFVk xiZrDbcSW0;
    public static final boolean EXtogiMhuM = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final java.util.logging.Logger riuEU0zW4 = java.util.logging.Logger.getLogger(defpackage.hyxIchWRW.class.getName());

    static {
        defpackage.s21 xZx205DYe;
        try {
            xZx205DYe = new defpackage.wll2JLbTBC2(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.mAr5m2L7gYDP.class, java.lang.Thread.class, "IHQe1A4L2xu"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.mAr5m2L7gYDP.class, defpackage.mAr5m2L7gYDP.class, "oh6vYeIP"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.hyxIchWRW.class, defpackage.mAr5m2L7gYDP.class, "AARZUJiTa"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.hyxIchWRW.class, defpackage.yIx6ChFVk.class, "xiZrDbcSW0"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.hyxIchWRW.class, java.lang.Object.class, "adDC3e2L"));
            th = null;
        } catch (java.lang.Throwable th) {
            th = th;
            xZx205DYe = new defpackage.XZx205DYe();
        }
        SH1y5HwkJhh = xZx205DYe;
        if (th != null) {
            riuEU0zW4.log(java.util.logging.Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        ez2rX8ReCYw = new java.lang.Object();
    }

    public static java.lang.Object F7NU4MC0GW(defpackage.hyxIchWRW hyxichwrw) {
        java.lang.Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = hyxichwrw.get();
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

    public static void oh6vYeIP(defpackage.hyxIchWRW hyxichwrw) {
        defpackage.mAr5m2L7gYDP mar5m2l7gydp;
        defpackage.yIx6ChFVk yix6chfvk;
        do {
            mar5m2l7gydp = hyxichwrw.AARZUJiTa;
        } while (!SH1y5HwkJhh.kNAkVymC(hyxichwrw, mar5m2l7gydp, defpackage.mAr5m2L7gYDP.r1MBDhnF));
        while (mar5m2l7gydp != null) {
            java.lang.Thread thread = mar5m2l7gydp.IHQe1A4L2xu;
            if (thread != null) {
                mar5m2l7gydp.IHQe1A4L2xu = null;
                java.util.concurrent.locks.LockSupport.unpark(thread);
            }
            mar5m2l7gydp = mar5m2l7gydp.oh6vYeIP;
        }
        do {
            yix6chfvk = hyxichwrw.xiZrDbcSW0;
        } while (!SH1y5HwkJhh.EgCjBq0SZwJ(hyxichwrw, yix6chfvk));
        defpackage.yIx6ChFVk yix6chfvk2 = null;
        while (yix6chfvk != null) {
            defpackage.yIx6ChFVk yix6chfvk3 = yix6chfvk.IHQe1A4L2xu;
            yix6chfvk.IHQe1A4L2xu = yix6chfvk2;
            yix6chfvk2 = yix6chfvk;
            yix6chfvk = yix6chfvk3;
        }
        while (yix6chfvk2 != null) {
            yix6chfvk2 = yix6chfvk2.IHQe1A4L2xu;
            try {
                throw null;
            } catch (java.lang.RuntimeException e) {
                riuEU0zW4.log(java.util.logging.Level.SEVERE, "RuntimeException while executing runnable null with executor null", (java.lang.Throwable) e);
            }
        }
    }

    public static java.lang.Object r1MBDhnF(java.lang.Object obj) {
        if (obj instanceof defpackage.SiPhmbmu) {
            java.lang.Throwable th = ((defpackage.SiPhmbmu) obj).IHQe1A4L2xu;
            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof defpackage.p4kuH6PDtgom) {
            throw new java.util.concurrent.ExecutionException((java.lang.Throwable) null);
        }
        if (obj == ez2rX8ReCYw) {
            return null;
        }
        return obj;
    }

    public final void IHQe1A4L2xu(java.lang.StringBuilder sb) {
        try {
            java.lang.Object F7NU4MC0GW = F7NU4MC0GW(this);
            sb.append("SUCCESS, result=[");
            sb.append(F7NU4MC0GW == this ? "this future" : java.lang.String.valueOf(F7NU4MC0GW));
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

    public final void adDC3e2L(defpackage.mAr5m2L7gYDP mar5m2l7gydp) {
        mar5m2l7gydp.IHQe1A4L2xu = null;
        while (true) {
            defpackage.mAr5m2L7gYDP mar5m2l7gydp2 = this.AARZUJiTa;
            if (mar5m2l7gydp2 == defpackage.mAr5m2L7gYDP.r1MBDhnF) {
                return;
            }
            defpackage.mAr5m2L7gYDP mar5m2l7gydp3 = null;
            while (mar5m2l7gydp2 != null) {
                defpackage.mAr5m2L7gYDP mar5m2l7gydp4 = mar5m2l7gydp2.oh6vYeIP;
                if (mar5m2l7gydp2.IHQe1A4L2xu != null) {
                    mar5m2l7gydp3 = mar5m2l7gydp2;
                } else if (mar5m2l7gydp3 != null) {
                    mar5m2l7gydp3.oh6vYeIP = mar5m2l7gydp4;
                    if (mar5m2l7gydp3.IHQe1A4L2xu == null) {
                        break;
                    }
                } else if (!SH1y5HwkJhh.kNAkVymC(this, mar5m2l7gydp2, mar5m2l7gydp4)) {
                    break;
                }
                mar5m2l7gydp2 = mar5m2l7gydp4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        java.lang.Object obj = this.adDC3e2L;
        if (obj != null) {
            return false;
        }
        if (!SH1y5HwkJhh.fnWB2E7cs(this, obj, EXtogiMhuM ? new defpackage.SiPhmbmu(new java.util.concurrent.CancellationException("Future.cancel() was called."), z) : z ? defpackage.SiPhmbmu.oh6vYeIP : defpackage.SiPhmbmu.r1MBDhnF)) {
            return false;
        }
        oh6vYeIP(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.mAr5m2L7gYDP mar5m2l7gydp = defpackage.mAr5m2L7gYDP.r1MBDhnF;
        long nanos = timeUnit.toNanos(j);
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj = this.adDC3e2L;
        if (obj != null) {
            return r1MBDhnF(obj);
        }
        long nanoTime = nanos > 0 ? java.lang.System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            defpackage.mAr5m2L7gYDP mar5m2l7gydp2 = this.AARZUJiTa;
            if (mar5m2l7gydp2 != mar5m2l7gydp) {
                defpackage.mAr5m2L7gYDP mar5m2l7gydp3 = new defpackage.mAr5m2L7gYDP();
                do {
                    defpackage.s21 s21Var = SH1y5HwkJhh;
                    s21Var.EoOhNTTfIN7K(mar5m2l7gydp3, mar5m2l7gydp2);
                    if (s21Var.kNAkVymC(this, mar5m2l7gydp2, mar5m2l7gydp3)) {
                        do {
                            java.util.concurrent.locks.LockSupport.parkNanos(this, nanos);
                            if (java.lang.Thread.interrupted()) {
                                adDC3e2L(mar5m2l7gydp3);
                                throw new java.lang.InterruptedException();
                            }
                            java.lang.Object obj2 = this.adDC3e2L;
                            if (obj2 != null) {
                                return r1MBDhnF(obj2);
                            }
                            nanos = nanoTime - java.lang.System.nanoTime();
                        } while (nanos >= 1000);
                        adDC3e2L(mar5m2l7gydp3);
                    } else {
                        mar5m2l7gydp2 = this.AARZUJiTa;
                    }
                } while (mar5m2l7gydp2 != mar5m2l7gydp);
            }
            return r1MBDhnF(this.adDC3e2L);
        }
        while (nanos > 0) {
            java.lang.Object obj3 = this.adDC3e2L;
            if (obj3 != null) {
                return r1MBDhnF(obj3);
            }
            if (java.lang.Thread.interrupted()) {
                throw new java.lang.InterruptedException();
            }
            nanos = nanoTime - java.lang.System.nanoTime();
        }
        java.lang.String hyxichwrw = toString();
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
        throw new java.util.concurrent.TimeoutException(str + " for " + hyxichwrw);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.adDC3e2L instanceof defpackage.SiPhmbmu;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.adDC3e2L != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.adDC3e2L instanceof defpackage.SiPhmbmu) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            IHQe1A4L2xu(sb);
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
                IHQe1A4L2xu(sb);
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
        defpackage.mAr5m2L7gYDP mar5m2l7gydp = defpackage.mAr5m2L7gYDP.r1MBDhnF;
        if (!java.lang.Thread.interrupted()) {
            java.lang.Object obj2 = this.adDC3e2L;
            if (obj2 != null) {
                return r1MBDhnF(obj2);
            }
            defpackage.mAr5m2L7gYDP mar5m2l7gydp2 = this.AARZUJiTa;
            if (mar5m2l7gydp2 != mar5m2l7gydp) {
                defpackage.mAr5m2L7gYDP mar5m2l7gydp3 = new defpackage.mAr5m2L7gYDP();
                do {
                    defpackage.s21 s21Var = SH1y5HwkJhh;
                    s21Var.EoOhNTTfIN7K(mar5m2l7gydp3, mar5m2l7gydp2);
                    if (s21Var.kNAkVymC(this, mar5m2l7gydp2, mar5m2l7gydp3)) {
                        do {
                            java.util.concurrent.locks.LockSupport.park(this);
                            if (!java.lang.Thread.interrupted()) {
                                obj = this.adDC3e2L;
                            } else {
                                adDC3e2L(mar5m2l7gydp3);
                                throw new java.lang.InterruptedException();
                            }
                        } while (obj == null);
                        return r1MBDhnF(obj);
                    }
                    mar5m2l7gydp2 = this.AARZUJiTa;
                } while (mar5m2l7gydp2 != mar5m2l7gydp);
            }
            return r1MBDhnF(this.adDC3e2L);
        }
        throw new java.lang.InterruptedException();
    }
}
