package com.google.android.gms.internal.wearable;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public abstract class zzap<V> extends zzaq<V> {

    /* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
    final class zza {
        static final zza zza;
        static final zza zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzaq.zzc) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zza(false, null);
                zza = new zza(true, null);
            }
        }

        zza(boolean z, Throwable th) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
    final class zzb<V> implements Runnable {
        final zzap<V> zza;
        final zzbf<? extends V> zzb;

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
    final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.wearable.zzap.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        zzc(Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
    final class zzd {
        static final zzd zza = new zzd();
        zzd next;
        final Runnable zzb = null;
        final Executor zzc = null;

        zzd() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
    interface zze<V> extends zzbf<V> {
    }

    /* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
    abstract class zzf<V> extends zzap<V> implements zze<V> {
        zzf() {
        }
    }

    protected zzap() {
    }

    static Object zza(Object obj) throws ExecutionException {
        if (obj instanceof zza) {
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(((zza) obj).zzd);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        }
        if (obj == zza) {
            return null;
        }
        return obj;
    }

    static boolean zzb(Object obj) {
        return !(obj instanceof zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Object zzn(zzbf zzbfVar) {
        Throwable zzf2;
        if (zzbfVar instanceof zze) {
            Object obj = ((zzap) zzbfVar).valueField;
            if (obj instanceof zza) {
                zza zzaVar = (zza) obj;
                if (zzaVar.zzc) {
                    Throwable th = zzaVar.zzd;
                    obj = th != null ? new zza(false, th) : zza.zzb;
                }
            }
            return Objects.requireNonNull(obj);
        }
        if ((zzbfVar instanceof zzbp) && (zzf2 = ((zzbp) zzbfVar).zzf()) != null) {
            return new zzc(zzf2);
        }
        boolean isCancelled = zzbfVar.isCancelled();
        if ((!zzc) && isCancelled) {
            return Objects.requireNonNull(zza.zzb);
        }
        try {
            Object zzo = zzo(zzbfVar);
            if (!isCancelled) {
                return zzr(zzo);
            }
            String valueOf = String.valueOf(zzbfVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
            sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb.append(valueOf);
            return new zza(false, new IllegalArgumentException(sb.toString()));
        } catch (Error e) {
            e = e;
            return new zzc(e);
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new zza(false, e2);
            }
            String valueOf2 = String.valueOf(zzbfVar);
            String.valueOf(valueOf2);
            return new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(valueOf2)), e2));
        } catch (ExecutionException e3) {
            if (!isCancelled) {
                return new zzc(e3.getCause());
            }
            String valueOf3 = String.valueOf(zzbfVar);
            String.valueOf(valueOf3);
            return new zza(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(valueOf3)), e3));
        } catch (Exception e4) {
            e = e4;
            return new zzc(e);
        }
    }

    private static Object zzo(Future future) throws ExecutionException {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
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

    private static void zzp(zzap zzapVar, boolean z) {
        zzd zzdVar;
        zzd zzdVar2 = null;
        while (true) {
            zzapVar.zzj();
            zzapVar.zze();
            zzd zzdVar3 = zzdVar2;
            zzd zzh = zzapVar.zzh(zzd.zza);
            zzd zzdVar4 = zzdVar3;
            while (zzh != null) {
                zzd zzdVar5 = zzh.next;
                zzh.next = zzdVar4;
                zzdVar4 = zzh;
                zzh = zzdVar5;
            }
            while (zzdVar4 != null) {
                Runnable runnable = zzdVar4.zzb;
                zzdVar = zzdVar4.next;
                Runnable runnable2 = (Runnable) Objects.requireNonNull(runnable);
                if (runnable2 instanceof zzb) {
                    zzb zzbVar = (zzb) runnable2;
                    zzapVar = zzbVar.zza;
                    if (zzapVar.valueField == zzbVar && zzi(zzapVar, zzbVar, zzn(zzbVar.zzb))) {
                        break;
                    }
                } else {
                    Executor executor = (Executor) Objects.requireNonNull(zzdVar4.zzc);
                    try {
                        executor.execute(runnable2);
                    } catch (Exception e) {
                        Logger zza2 = zzb.zza();
                        Level level = Level.SEVERE;
                        String valueOf = String.valueOf(runnable2);
                        String valueOf2 = String.valueOf(executor);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
                        sb.append("RuntimeException while executing runnable ");
                        sb.append(valueOf);
                        sb.append(" with executor ");
                        sb.append(valueOf2);
                        zza2.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), (Throwable) e);
                    }
                }
                zzdVar4 = zzdVar;
            }
            return;
            zzdVar2 = zzdVar;
        }
    }

    private final void zzq(StringBuilder sb) {
        try {
            Object zzo = zzo(this);
            sb.append("SUCCESS, result=[");
            if (zzo == null) {
                sb.append("null");
            } else if (zzo == this) {
                sb.append("this future");
            } else {
                sb.append(zzo.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(zzo)));
            }
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

    private static Object zzr(Object obj) {
        return obj == null ? zza : obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object requireNonNull;
        Object obj = this.valueField;
        if (!(obj instanceof zzb) && !(obj == null)) {
            return false;
        }
        if (zzc) {
            requireNonNull = new zza(z, new CancellationException("Future.cancel() was called."));
        } else {
            requireNonNull = Objects.requireNonNull(z ? zza.zza : zza.zzb);
        }
        zzap<V> zzapVar = this;
        boolean z2 = false;
        while (true) {
            if (zzi(zzapVar, obj, requireNonNull)) {
                zzp(zzapVar, z);
                if (!(obj instanceof zzb)) {
                    break;
                }
                zzbf<? extends V> zzbfVar = ((zzb) obj).zzb;
                if (!(zzbfVar instanceof zze)) {
                    zzbfVar.cancel(z);
                    break;
                }
                zzapVar = (zzap) zzbfVar;
                obj = zzapVar.valueField;
                if (!(obj == null) && !(obj instanceof zzb)) {
                    break;
                }
                z2 = true;
            } else {
                obj = zzapVar.valueField;
                if (zzb(obj)) {
                    return z2;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException, ExecutionException {
        return zzl();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.valueField instanceof zza;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.valueField;
        return (obj != null) & zzb(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009e, code lost:
    
        if (r3.isEmpty() != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.valueField instanceof zza) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzq(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.valueField;
            if (obj instanceof zzb) {
                sb.append(", setFuture=[");
                zzbf<? extends V> zzbfVar = ((zzb) obj).zzb;
                try {
                    if (zzbfVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(zzbfVar);
                    }
                } catch (Throwable th) {
                    zzbm.zza(th);
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    concat = zzg();
                    if (concat != null) {
                    }
                    concat = null;
                } catch (Throwable th2) {
                    zzbm.zza(th2);
                    String valueOf = String.valueOf(th2.getClass());
                    String.valueOf(valueOf);
                    concat = "Exception thrown from implementation: ".concat(String.valueOf(valueOf));
                }
                if (concat != null) {
                    sb.append(", info=[");
                    sb.append(concat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                zzq(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected final boolean zzc(Object obj) {
        if (!zzi(this, null, zzr(obj))) {
            return false;
        }
        zzp(this, false);
        return true;
    }

    protected final boolean zzd(Throwable th) {
        if (!zzi(this, null, new zzc(th))) {
            return false;
        }
        zzp(this, false);
        return true;
    }

    protected void zze() {
    }

    @Override // com.google.android.gms.internal.wearable.zzbp
    protected final Throwable zzf() {
        if (!(this instanceof zze)) {
            return null;
        }
        Object obj = this.valueField;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String zzg() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + 21);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        return zzk(j, timeUnit);
    }
}
