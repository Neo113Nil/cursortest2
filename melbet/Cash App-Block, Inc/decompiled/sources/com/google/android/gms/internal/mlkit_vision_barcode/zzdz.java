package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.stripe.android.stripe3ds2.utils.ObjectUtils;
import com.stripe.android.uicore.FocusManagerKtKt;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public abstract class zzdz implements zzet {
    public static final boolean zza;
    public static final com.google.android.gms.internal.mlkit_genai_prompt.zzkr zzb;
    public static final ObjectUtils zzc;
    public static final Object zzd;
    public volatile zzd listeners;
    public volatile Object value;
    public volatile zzj waiters;

    public final class zzb {
        public static final zzb zza;
        public static final zzb zzb;
        public final boolean zzc;
        public final Throwable zzd;

        static {
            if (zzdz.zza) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zzb(null, false);
                zza = new zzb(null, true);
            }
        }

        public zzb(Throwable th, boolean z) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    public final class zzc {
        public final Throwable zzb;

        /* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.zzdz$zzc$1, reason: invalid class name */
        final class AnonymousClass1 extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new zzc(new AnonymousClass1("Failure occurred while trying to finish a future."));
        }

        public zzc(Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    public final class zze extends ObjectUtils {
        public final AtomicReferenceFieldUpdater zza;
        public final AtomicReferenceFieldUpdater zzb;
        public final AtomicReferenceFieldUpdater zzc;
        public final AtomicReferenceFieldUpdater zzd;
        public final AtomicReferenceFieldUpdater zze;

        public zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.stripe.android.stripe3ds2.utils.ObjectUtils
        public final zzd zza(zzdz zzdzVar) {
            return (zzd) this.zzd.getAndSet(zzdzVar, zzd.zza);
        }

        @Override // com.stripe.android.stripe3ds2.utils.ObjectUtils
        public final zzj zzb(zzdz zzdzVar) {
            return (zzj) this.zzc.getAndSet(zzdzVar, zzj.zza);
        }

        @Override // com.stripe.android.stripe3ds2.utils.ObjectUtils
        public final void zzc(zzj zzjVar, zzj zzjVar2) {
            this.zzb.lazySet(zzjVar, zzjVar2);
        }

        @Override // com.stripe.android.stripe3ds2.utils.ObjectUtils
        public final void zzd(zzj zzjVar, Thread thread) {
            this.zza.lazySet(zzjVar, thread);
        }

        @Override // com.stripe.android.stripe3ds2.utils.ObjectUtils
        public final boolean zze(zzdz zzdzVar, zzd zzdVar, zzd zzdVar2) {
            return FocusManagerKtKt.zza(this.zzd, zzdzVar, zzdVar, zzdVar2);
        }

        @Override // com.stripe.android.stripe3ds2.utils.ObjectUtils
        public final boolean zzf(zzdz zzdzVar, Object obj, Object obj2) {
            return FocusManagerKtKt.zza(this.zze, zzdzVar, obj, obj2);
        }

        @Override // com.stripe.android.stripe3ds2.utils.ObjectUtils
        public final boolean zzg(zzdz zzdzVar, zzj zzjVar, zzj zzjVar2) {
            return FocusManagerKtKt.zza(this.zzc, zzdzVar, zzjVar, zzjVar2);
        }
    }

    public abstract class zzf implements Runnable {
    }

    public final class zzg extends ObjectUtils {
        @Override // com.stripe.android.stripe3ds2.utils.ObjectUtils
        public final zzd zza(zzdz zzdzVar) {
            zzd zzdVar;
            zzd zzdVar2 = zzd.zza;
            synchronized (zzdzVar) {
                try {
                    zzdVar = zzdzVar.listeners;
                    if (zzdVar != zzdVar2) {
                        zzdzVar.listeners = zzdVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzdVar;
        }

        @Override // com.stripe.android.stripe3ds2.utils.ObjectUtils
        public final zzj zzb(zzdz zzdzVar) {
            zzj zzjVar;
            zzj zzjVar2 = zzj.zza;
            synchronized (zzdzVar) {
                try {
                    zzjVar = zzdzVar.waiters;
                    if (zzjVar != zzjVar2) {
                        zzdzVar.waiters = zzjVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzjVar;
        }

        @Override // com.stripe.android.stripe3ds2.utils.ObjectUtils
        public final void zzc(zzj zzjVar, zzj zzjVar2) {
            zzjVar.next = zzjVar2;
        }

        @Override // com.stripe.android.stripe3ds2.utils.ObjectUtils
        public final void zzd(zzj zzjVar, Thread thread) {
            zzjVar.thread = thread;
        }

        @Override // com.stripe.android.stripe3ds2.utils.ObjectUtils
        public final boolean zze(zzdz zzdzVar, zzd zzdVar, zzd zzdVar2) {
            synchronized (zzdzVar) {
                try {
                    if (zzdzVar.listeners != zzdVar) {
                        return false;
                    }
                    zzdzVar.listeners = zzdVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.stripe.android.stripe3ds2.utils.ObjectUtils
        public final boolean zzf(zzdz zzdzVar, Object obj, Object obj2) {
            synchronized (zzdzVar) {
                try {
                    if (zzdzVar.value != obj) {
                        return false;
                    }
                    zzdzVar.value = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.stripe.android.stripe3ds2.utils.ObjectUtils
        public final boolean zzg(zzdz zzdzVar, zzj zzjVar, zzj zzjVar2) {
            synchronized (zzdzVar) {
                try {
                    if (zzdzVar.waiters != zzjVar) {
                        return false;
                    }
                    zzdzVar.waiters = zzjVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final class zzi extends ObjectUtils {
        public static final Unsafe zza;
        public static final long zzb;
        public static final long zzc;
        public static final long zzd;
        public static final long zze;
        public static final long zzf;

        /* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.zzdz$zzi$1, reason: invalid class name */
        public final class AnonymousClass1 implements PrivilegedExceptionAction {
            @Override // java.security.PrivilegedExceptionAction
            public final /* bridge */ /* synthetic */ Object run() {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new AnonymousClass1());
                }
                try {
                    zzc = unsafe.objectFieldOffset(zzdz.class.getDeclaredField("waiters"));
                    zzb = unsafe.objectFieldOffset(zzdz.class.getDeclaredField("listeners"));
                    zzd = unsafe.objectFieldOffset(zzdz.class.getDeclaredField("value"));
                    zze = unsafe.objectFieldOffset(zzj.class.getDeclaredField("thread"));
                    zzf = unsafe.objectFieldOffset(zzj.class.getDeclaredField("next"));
                    zza = unsafe;
                } catch (NoSuchFieldException e) {
                    a$$ExternalSyntheticBUOutline0.m((Throwable) e);
                }
            } catch (PrivilegedActionException e2) {
                OptionalProvider$$ExternalSyntheticLambda0.m("Could not initialize intrinsics", e2.getCause());
            }
        }

        @Override // com.stripe.android.stripe3ds2.utils.ObjectUtils
        public final zzd zza(zzdz zzdzVar) {
            zzd zzdVar;
            zzd zzdVar2 = zzd.zza;
            do {
                zzdVar = zzdzVar.listeners;
                if (zzdVar2 == zzdVar) {
                    break;
                }
            } while (!zze(zzdzVar, zzdVar, zzdVar2));
            return zzdVar;
        }

        @Override // com.stripe.android.stripe3ds2.utils.ObjectUtils
        public final zzj zzb(zzdz zzdzVar) {
            zzj zzjVar;
            zzj zzjVar2 = zzj.zza;
            do {
                zzjVar = zzdzVar.waiters;
                if (zzjVar2 == zzjVar) {
                    break;
                }
            } while (!zzg(zzdzVar, zzjVar, zzjVar2));
            return zzjVar;
        }

        @Override // com.stripe.android.stripe3ds2.utils.ObjectUtils
        public final void zzc(zzj zzjVar, zzj zzjVar2) {
            zza.putObject(zzjVar, zzf, zzjVar2);
        }

        @Override // com.stripe.android.stripe3ds2.utils.ObjectUtils
        public final void zzd(zzj zzjVar, Thread thread) {
            zza.putObject(zzjVar, zze, thread);
        }

        @Override // com.stripe.android.stripe3ds2.utils.ObjectUtils
        public final boolean zze(zzdz zzdzVar, zzd zzdVar, zzd zzdVar2) {
            return zzec.zza(zza, zzdzVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.stripe.android.stripe3ds2.utils.ObjectUtils
        public final boolean zzf(zzdz zzdzVar, Object obj, Object obj2) {
            return zzec.zza(zza, zzdzVar, zzd, obj, obj2);
        }

        @Override // com.stripe.android.stripe3ds2.utils.ObjectUtils
        public final boolean zzg(zzdz zzdzVar, zzj zzjVar, zzj zzjVar2) {
            return zzec.zza(zza, zzdzVar, zzc, zzjVar, zzjVar2);
        }
    }

    public final class zzj {
        public static final zzj zza = new zzj();
        public volatile zzj next;
        public volatile Thread thread;

        public zzj() {
            zzdz.zzc.zzd(this, Thread.currentThread());
        }
    }

    static {
        boolean z;
        ObjectUtils zzgVar;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        zza = z;
        zzb = new com.google.android.gms.internal.mlkit_genai_prompt.zzkr(zzdz.class, 1);
        try {
            zzgVar = new zzi();
            th = null;
            th2 = null;
        } catch (Error | Exception e) {
            try {
                th = null;
                th2 = e;
                zzgVar = new zze(AtomicReferenceFieldUpdater.newUpdater(zzj.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzj.class, zzj.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zzdz.class, zzj.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzdz.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzdz.class, Object.class, "value"));
            } catch (Error | Exception e2) {
                zzgVar = new zzg();
                th = e2;
                th2 = e;
            }
        }
        zzc = zzgVar;
        if (th != null) {
            com.google.android.gms.internal.mlkit_genai_prompt.zzkr zzkrVar = zzb;
            Logger zza2 = zzkrVar.zza();
            Level level = Level.SEVERE;
            zza2.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            zzkrVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        zzd = new Object();
    }

    public static void zzv(zzdz zzdzVar) {
        for (zzj zzb2 = zzc.zzb(zzdzVar); zzb2 != null; zzb2 = zzb2.next) {
            Thread thread = zzb2.thread;
            if (thread != null) {
                zzb2.thread = null;
                LockSupport.unpark(thread);
            }
        }
        zzdzVar.zzm();
        zzd zza2 = zzc.zza(zzdzVar);
        zzd zzdVar = null;
        while (zza2 != null) {
            zzd zzdVar2 = zza2.next;
            zza2.next = zzdVar;
            zzdVar = zza2;
            zza2 = zzdVar2;
        }
        while (zzdVar != null) {
            Runnable runnable = zzdVar.zzb;
            zzd zzdVar3 = zzdVar.next;
            Objects.requireNonNull(runnable);
            if (runnable instanceof zzf) {
                throw null;
            }
            zzee zzeeVar = zzdVar.zzc;
            Objects.requireNonNull(zzeeVar);
            zzw(runnable, zzeeVar);
            zzdVar = zzdVar3;
        }
    }

    public static void zzw(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            zzb.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", CameraSelector$$ExternalSyntheticOutline0.m("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    public static final Object zzy(Object obj) {
        if (obj instanceof zzb) {
            Throwable th = ((zzb) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        }
        if (obj == zzd) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        zzb zzbVar;
        Object obj = this.value;
        if ((obj instanceof zzf) | (obj == null)) {
            if (zza) {
                zzbVar = new zzb(new CancellationException("Future.cancel() was called."), z);
            } else {
                zzbVar = z ? zzb.zza : zzb.zzb;
                Objects.requireNonNull(zzbVar);
            }
            while (!zzc.zzf(this, obj, zzbVar)) {
                obj = this.value;
                if (!(obj instanceof zzf)) {
                }
            }
            zzv(this);
            if (obj instanceof zzf) {
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        boolean z;
        long j2;
        zzj zzjVar = zzj.zza;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) && (!(obj instanceof zzf))) {
            return zzy(obj);
        }
        long j3 = 0;
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zzj zzjVar2 = this.waiters;
            if (zzjVar2 != zzjVar) {
                zzj zzjVar3 = new zzj();
                z = true;
                while (true) {
                    ObjectUtils objectUtils = zzc;
                    objectUtils.zzc(zzjVar3, zzjVar2);
                    if (objectUtils.zzg(this, zzjVar2, zzjVar3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zzx(zzjVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof zzf))) {
                                return zzy(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zzx(zzjVar3);
                    } else {
                        long j4 = j3;
                        zzjVar2 = this.waiters;
                        if (zzjVar2 == zzjVar) {
                            break;
                        }
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return zzy(obj3);
        }
        z = true;
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.value;
            if ((obj4 != null ? z : false) && (!(obj4 instanceof zzf))) {
                return zzy(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String zzdzVar = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < j2) {
            String concat = str.concat(" (plus ");
            long j5 = -nanos;
            long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(convert);
            if (convert != j2 && nanos2 <= 1000) {
                z = false;
            }
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
        throw new TimeoutException(Recorder$$ExternalSyntheticOutline2.m(str, " for ", zzdzVar));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof zzb;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.value != null) & (!(r2 instanceof zzf));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String zzf2;
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
        if (this.value instanceof zzb) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzs(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            String str = null;
            if (this.value instanceof zzf) {
                sb.append(", setFuture=[");
                try {
                    sb.append((Object) null);
                } catch (Exception | StackOverflowError e) {
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append("]");
            } else {
                try {
                    zzf2 = zzf();
                } catch (Exception | StackOverflowError e2) {
                    str = "Exception thrown from implementation: ".concat(String.valueOf(e2.getClass()));
                }
                if (zzf2 != null) {
                    if (!zzf2.isEmpty()) {
                        z = false;
                        if (!z) {
                            str = zzf2;
                        }
                        if (str != null) {
                            sb.append(", info=[");
                            sb.append(str);
                            sb.append("]");
                        }
                    }
                }
                z = true;
                if (!z) {
                }
                if (str != null) {
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                zzs(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String zzf() {
        if (this instanceof ScheduledFuture) {
            return Boxes$$ExternalSyntheticOutline1.m(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    public void zzm() {
    }

    public final void zzs(StringBuilder sb) {
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

    public final void zzx(zzj zzjVar) {
        zzjVar.thread = null;
        while (true) {
            zzj zzjVar2 = this.waiters;
            if (zzjVar2 != zzj.zza) {
                zzj zzjVar3 = null;
                while (zzjVar2 != null) {
                    zzj zzjVar4 = zzjVar2.next;
                    if (zzjVar2.thread != null) {
                        zzjVar3 = zzjVar2;
                    } else if (zzjVar3 != null) {
                        zzjVar3.next = zzjVar4;
                        if (zzjVar3.thread == null) {
                            break;
                        }
                    } else if (!zzc.zzg(this, zzjVar2, zzjVar4)) {
                        break;
                    }
                    zzjVar2 = zzjVar4;
                }
                return;
            }
            return;
        }
    }

    public final class zzd {
        public static final zzd zza = new zzd();
        public zzd next;
        public final Runnable zzb;
        public final zzee zzc;

        public zzd(Runnable runnable) {
            this.zzb = runnable;
            this.zzc = zzee.zza;
        }

        public zzd() {
            this.zzb = null;
            this.zzc = null;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        zzj zzjVar = zzj.zza;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof zzf))) {
                return zzy(obj2);
            }
            zzj zzjVar2 = this.waiters;
            if (zzjVar2 != zzjVar) {
                zzj zzjVar3 = new zzj();
                do {
                    ObjectUtils objectUtils = zzc;
                    objectUtils.zzc(zzjVar3, zzjVar2);
                    if (objectUtils.zzg(this, zzjVar2, zzjVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                zzx(zzjVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof zzf))));
                        return zzy(obj);
                    }
                    zzjVar2 = this.waiters;
                } while (zzjVar2 != zzjVar);
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return zzy(obj3);
        }
        throw new InterruptedException();
    }
}
