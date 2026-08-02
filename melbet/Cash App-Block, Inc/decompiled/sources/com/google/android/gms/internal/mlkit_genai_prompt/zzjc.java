package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzjd;
import com.google.common.util.concurrent.ListenableFuture;
import com.stripe.android.networking.StripeErrorMappingKt;
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

/* loaded from: classes4.dex */
public abstract class zzjc extends zzjd {

    public final class zza {
        public static final zza zza;
        public static final zza zzb;
        public final boolean zzc;
        public final Throwable zzd;

        static {
            if (zzjd.zzg) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zza(null, false);
                zza = new zza(null, true);
            }
        }

        public zza(Throwable th, boolean z) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    public final class zzb implements Runnable {
        public final zzjc zza;
        public final ListenableFuture zzb;

        public zzb(zzjc zzjcVar, ListenableFuture listenableFuture) {
            this.zza = zzjcVar;
            this.zzb = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.zza.valueField != this) {
                return;
            }
            ListenableFuture listenableFuture = this.zzb;
            if (zzjd.zza.zzf(this.zza, this, zzjc.zza(listenableFuture))) {
                zzjc.zzx(this.zza, false);
            }
        }
    }

    public final class zzc {
        public static final zzc zza = new zzc(new AnonymousClass1("Failure occurred while trying to finish a future."));
        public final Throwable zzb;

        /* renamed from: com.google.android.gms.internal.mlkit_genai_prompt.zzjc$zzc$1, reason: invalid class name */
        final class AnonymousClass1 extends Throwable {
            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                return this;
            }
        }

        public zzc(Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    public interface zze extends ListenableFuture {
    }

    public abstract class zzf extends zzjc implements zze {
    }

    public static Object zza(ListenableFuture listenableFuture) {
        Object obj;
        Throwable zzg;
        if (listenableFuture instanceof zze) {
            Object obj2 = ((zzjc) listenableFuture).valueField;
            if (obj2 instanceof zza) {
                zza zzaVar = (zza) obj2;
                if (zzaVar.zzc) {
                    Throwable th = zzaVar.zzd;
                    obj2 = th != null ? new zza(th, false) : zza.zzb;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if ((listenableFuture instanceof zzjd) && (zzg = ((zzjd) listenableFuture).zzg()) != null) {
            return new zzc(zzg);
        }
        boolean isCancelled = listenableFuture.isCancelled();
        boolean z = true;
        if ((!zzjd.zzg) && isCancelled) {
            zza zzaVar2 = zza.zzb;
            Objects.requireNonNull(zzaVar2);
            return zzaVar2;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = listenableFuture.get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th2) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (Error | Exception e) {
                return new zzc(e);
            } catch (CancellationException e2) {
                return !isCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(listenableFuture)), e2)) : new zza(e2, false);
            } catch (ExecutionException e3) {
                return isCancelled ? new zza(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(listenableFuture)), e3), false) : new zzc(e3.getCause());
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return isCancelled ? new zza(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(listenableFuture))), false) : obj == null ? zzjd.zze : obj;
    }

    public static Object zzf(Object obj) {
        if (obj instanceof zza) {
            Throwable th = ((zza) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        }
        if (obj == zzjd.zze) {
            return null;
        }
        return obj;
    }

    public static boolean zzk(Object obj) {
        return !(obj instanceof zzb);
    }

    public static void zzx(zzjc zzjcVar, boolean z) {
        zzd zzdVar = null;
        while (true) {
            for (zzjd.zze zzb2 = zzjd.zza.zzb(zzjcVar); zzb2 != null; zzb2 = zzb2.next) {
                Thread thread = zzb2.thread;
                if (thread != null) {
                    zzb2.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                zzjcVar.zzi();
            }
            zzjcVar.zzd();
            zzd zzdVar2 = zzdVar;
            zzd zza2 = zzjd.zza.zza(zzjcVar);
            zzd zzdVar3 = zzdVar2;
            while (zza2 != null) {
                zzd zzdVar4 = zza2.next;
                zza2.next = zzdVar3;
                zzdVar3 = zza2;
                zza2 = zzdVar4;
            }
            while (zzdVar3 != null) {
                Runnable runnable = zzdVar3.zzb;
                zzdVar = zzdVar3.next;
                Objects.requireNonNull(runnable);
                if (runnable instanceof zzb) {
                    zzb zzbVar = (zzb) runnable;
                    zzjcVar = zzbVar.zza;
                    if (zzjcVar.valueField == zzbVar) {
                        if (zzjd.zza.zzf(zzjcVar, zzbVar, zza(zzbVar.zzb))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzdVar3.zzc;
                    Objects.requireNonNull(executor);
                    zzy(runnable, executor);
                }
                zzdVar3 = zzdVar;
            }
            return;
            z = false;
        }
    }

    public static void zzy(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            zzjd.zzf.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", CameraSelector$$ExternalSyntheticOutline0.m("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzd zzdVar2 = zzd.zza;
        if (executor == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Executor was null.");
            return;
        }
        if (!isDone() && (zzdVar = this.listenersField) != zzdVar2) {
            zzd zzdVar3 = new zzd(runnable, executor);
            do {
                zzdVar3.next = zzdVar;
                if (zzjd.zza.zze(this, zzdVar, zzdVar3)) {
                    return;
                } else {
                    zzdVar = this.listenersField;
                }
            } while (zzdVar != zzdVar2);
        }
        zzy(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        zza zzaVar;
        Object obj = this.valueField;
        if (!(obj instanceof zzb) && !(obj == null)) {
            return false;
        }
        if (zzjd.zzg) {
            zzaVar = new zza(new CancellationException("Future.cancel() was called."), z);
        } else {
            zzaVar = z ? zza.zza : zza.zzb;
            Objects.requireNonNull(zzaVar);
        }
        boolean z2 = false;
        while (true) {
            if (zzjd.zza.zzf(this, obj, zzaVar)) {
                zzx(this, z);
                if (!(obj instanceof zzb)) {
                    break;
                }
                ListenableFuture listenableFuture = ((zzb) obj).zzb;
                if (!(listenableFuture instanceof zze)) {
                    listenableFuture.cancel(z);
                    break;
                }
                this = (zzjc) listenableFuture;
                obj = this.valueField;
                if (!(obj == null) && !(obj instanceof zzb)) {
                    break;
                }
                z2 = true;
            } else {
                obj = this.valueField;
                if (zzk(obj)) {
                    return z2;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        long j2;
        zzjd.zze zzeVar = zzjd.zze.zza;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.valueField;
        if ((obj != null) && zzk(obj)) {
            return zzf(obj);
        }
        long j3 = 0;
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zzjd.zze zzeVar2 = this.waitersField;
            if (zzeVar2 != zzeVar) {
                zzjd.zze zzeVar3 = new zzjd.zze();
                while (true) {
                    StripeErrorMappingKt stripeErrorMappingKt = zzjd.zza;
                    stripeErrorMappingKt.zzc(zzeVar3, zzeVar2);
                    if (stripeErrorMappingKt.zzg(this, zzeVar2, zzeVar3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zzU(zzeVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.valueField;
                            if ((obj2 != null) && zzk(obj2)) {
                                return zzf(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zzU(zzeVar3);
                    } else {
                        long j4 = j3;
                        zzeVar2 = this.waitersField;
                        if (zzeVar2 == zzeVar) {
                            break;
                        }
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.valueField;
            Objects.requireNonNull(obj3);
            return zzf(obj3);
        }
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.valueField;
            if ((obj4 != null) && zzk(obj4)) {
                return zzf(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String zzjcVar = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < j2) {
            String concat = str.concat(" (plus ");
            long j5 = -nanos;
            long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(convert);
            boolean z = convert == j2 || nanos2 > 1000;
            if (convert > j2) {
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
        throw new TimeoutException(Recorder$$ExternalSyntheticOutline2.m(str, " for ", zzjcVar));
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.valueField instanceof zza;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.valueField;
        return (obj != null) & zzk(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        String concat;
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
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzw(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.valueField;
            if (obj instanceof zzb) {
                sb.append(", setFuture=[");
                ListenableFuture listenableFuture = ((zzb) obj).zzb;
                try {
                    if (listenableFuture == this) {
                        sb.append("this future");
                    } else {
                        sb.append(listenableFuture);
                    }
                } catch (Throwable th) {
                    if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                        throw th;
                    }
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    concat = zzc();
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    concat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (concat != null) {
                    if (!concat.isEmpty()) {
                        z = false;
                        if (z) {
                            concat = null;
                        }
                        if (concat != null) {
                            sb.append(", info=[");
                            sb.append(concat);
                            sb.append("]");
                        }
                    }
                }
                z = true;
                if (z) {
                }
                if (concat != null) {
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                zzw(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String zzc() {
        if (this instanceof ScheduledFuture) {
            return Boxes$$ExternalSyntheticOutline1.m(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    public void zzd() {
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzjd
    public final Throwable zzg() {
        if (!(this instanceof zze)) {
            return null;
        }
        Object obj = this.valueField;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    public void zzi() {
    }

    public boolean zzl(Object obj) {
        if (obj == null) {
            obj = zzjd.zze;
        }
        if (!zzjd.zza.zzf(this, null, obj)) {
            return false;
        }
        zzx(this, false);
        return true;
    }

    public boolean zzm(Throwable th) {
        th.getClass();
        if (!zzjd.zza.zzf(this, null, new zzc(th))) {
            return false;
        }
        zzx(this, false);
        return true;
    }

    public final void zzn(ListenableFuture listenableFuture) {
        zzc zzcVar;
        listenableFuture.getClass();
        Object obj = this.valueField;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (zzjd.zza.zzf(this, null, zza(listenableFuture))) {
                    zzx(this, false);
                    return;
                }
                return;
            }
            zzb zzbVar = new zzb(this, listenableFuture);
            if (zzjd.zza.zzf(this, null, zzbVar)) {
                try {
                    listenableFuture.addListener(zzbVar, zzjx.zza);
                    return;
                } catch (Throwable th) {
                    try {
                        zzcVar = new zzc(th);
                    } catch (Error | Exception unused) {
                        zzcVar = zzc.zza;
                    }
                    zzjd.zza.zzf(this, zzbVar, zzcVar);
                    return;
                }
            }
            obj = this.valueField;
        }
        if (obj instanceof zza) {
            listenableFuture.cancel(((zza) obj).zzc);
        }
    }

    public final boolean zzo() {
        Object obj = this.valueField;
        return (obj instanceof zza) && ((zza) obj).zzc;
    }

    public final void zzw(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (Exception e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb.append("]");
    }

    public final class zzd {
        public static final zzd zza = new zzd();
        public zzd next;
        public final Runnable zzb;
        public final Executor zzc;

        public zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        public zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        zzjd.zze zzeVar = zzjd.zze.zza;
        if (!Thread.interrupted()) {
            Object obj2 = this.valueField;
            if ((obj2 != null) & zzk(obj2)) {
                return zzf(obj2);
            }
            zzjd.zze zzeVar2 = this.waitersField;
            if (zzeVar2 != zzeVar) {
                zzjd.zze zzeVar3 = new zzjd.zze();
                do {
                    StripeErrorMappingKt stripeErrorMappingKt = zzjd.zza;
                    stripeErrorMappingKt.zzc(zzeVar3, zzeVar2);
                    if (stripeErrorMappingKt.zzg(this, zzeVar2, zzeVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.valueField;
                            } else {
                                zzU(zzeVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & zzk(obj)));
                        return zzf(obj);
                    }
                    zzeVar2 = this.waitersField;
                } while (zzeVar2 != zzeVar);
            }
            Object obj3 = this.valueField;
            Objects.requireNonNull(obj3);
            return zzf(obj3);
        }
        throw new InterruptedException();
    }
}
