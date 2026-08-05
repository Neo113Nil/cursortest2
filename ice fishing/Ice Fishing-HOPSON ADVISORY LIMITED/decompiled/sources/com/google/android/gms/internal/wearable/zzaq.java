package com.google.android.gms.internal.wearable;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import com.google.android.gms.internal.wearable.zzap;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
abstract class zzaq<V> extends zzbp implements zzbf<V> {
    static final Object zza = new Object();
    static final zzbe zzb = new zzbe(zzap.class);
    static final boolean zzc;
    private static final zza zzd;
    volatile zzap.zzd listenersField;
    volatile Object valueField;
    volatile zze waitersField;

    /* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
    abstract class zza {
        /* synthetic */ zza(byte[] bArr) {
        }

        abstract void zza(zze zzeVar, Thread thread);

        abstract void zzb(zze zzeVar, zze zzeVar2);

        abstract boolean zzc(zzaq zzaqVar, zze zzeVar, zze zzeVar2);

        abstract zze zzd(zzaq zzaqVar, zze zzeVar);

        abstract zzap.zzd zze(zzaq zzaqVar, zzap.zzd zzdVar);

        abstract boolean zzf(zzaq zzaqVar, Object obj, Object obj2);
    }

    /* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
    final class zzb extends zza {
        private static final AtomicReferenceFieldUpdater<zze, Thread> zza = AtomicReferenceFieldUpdater.newUpdater(zze.class, Thread.class, "thread");
        private static final AtomicReferenceFieldUpdater<zze, zze> zzb = AtomicReferenceFieldUpdater.newUpdater(zze.class, zze.class, "next");
        private static final AtomicReferenceFieldUpdater<? super zzaq<?>, zze> zzc = AtomicReferenceFieldUpdater.newUpdater(zzaq.class, zze.class, "waitersField");
        private static final AtomicReferenceFieldUpdater<? super zzaq<?>, zzap.zzd> zzd = AtomicReferenceFieldUpdater.newUpdater(zzaq.class, zzap.zzd.class, "listenersField");
        private static final AtomicReferenceFieldUpdater<? super zzaq<?>, Object> zze = AtomicReferenceFieldUpdater.newUpdater(zzaq.class, Object.class, "valueField");

        private zzb() {
            throw null;
        }

        /* synthetic */ zzb(byte[] bArr) {
            super(null);
        }

        @Override // com.google.android.gms.internal.wearable.zzaq.zza
        final void zza(zze zzeVar, Thread thread) {
            zza.lazySet(zzeVar, thread);
        }

        @Override // com.google.android.gms.internal.wearable.zzaq.zza
        final void zzb(zze zzeVar, zze zzeVar2) {
            zzb.lazySet(zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.wearable.zzaq.zza
        final boolean zzc(zzaq zzaqVar, zze zzeVar, zze zzeVar2) {
            return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(zzc, zzaqVar, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.wearable.zzaq.zza
        final zze zzd(zzaq zzaqVar, zze zzeVar) {
            return zzc.getAndSet(zzaqVar, zzeVar);
        }

        @Override // com.google.android.gms.internal.wearable.zzaq.zza
        final zzap.zzd zze(zzaq zzaqVar, zzap.zzd zzdVar) {
            return zzd.getAndSet(zzaqVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.wearable.zzaq.zza
        final boolean zzf(zzaq zzaqVar, Object obj, Object obj2) {
            return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(zze, zzaqVar, obj, obj2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
    final class zzc extends zza {
        private zzc() {
            throw null;
        }

        /* synthetic */ zzc(byte[] bArr) {
            super(null);
        }

        @Override // com.google.android.gms.internal.wearable.zzaq.zza
        final void zza(zze zzeVar, Thread thread) {
            zzeVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.wearable.zzaq.zza
        final void zzb(zze zzeVar, zze zzeVar2) {
            zzeVar.next = zzeVar2;
        }

        @Override // com.google.android.gms.internal.wearable.zzaq.zza
        final boolean zzc(zzaq zzaqVar, zze zzeVar, zze zzeVar2) {
            synchronized (zzaqVar) {
                if (zzaqVar.waitersField != zzeVar) {
                    return false;
                }
                zzaqVar.waitersField = zzeVar2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.wearable.zzaq.zza
        final zze zzd(zzaq zzaqVar, zze zzeVar) {
            zze zzeVar2;
            synchronized (zzaqVar) {
                zzeVar2 = zzaqVar.waitersField;
                if (zzeVar2 != zzeVar) {
                    zzaqVar.waitersField = zzeVar;
                }
            }
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.wearable.zzaq.zza
        final zzap.zzd zze(zzaq zzaqVar, zzap.zzd zzdVar) {
            zzap.zzd zzdVar2;
            synchronized (zzaqVar) {
                zzdVar2 = zzaqVar.listenersField;
                if (zzdVar2 != zzdVar) {
                    zzaqVar.listenersField = zzdVar;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.wearable.zzaq.zza
        final boolean zzf(zzaq zzaqVar, Object obj, Object obj2) {
            synchronized (zzaqVar) {
                if (zzaqVar.valueField != obj) {
                    return false;
                }
                zzaqVar.valueField = obj2;
                return true;
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
    final class zzd extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        static {
            Unsafe zzh;
            try {
                try {
                    zzh = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    try {
                        zzh = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, zzar.zza);
                    } catch (Exception unused2) {
                        zzh = zzh();
                        Unsafe unsafe = zzh;
                    }
                }
                try {
                    zzc = zzh.objectFieldOffset(zzaq.class.getDeclaredField("waitersField"));
                    zzb = zzh.objectFieldOffset(zzaq.class.getDeclaredField("listenersField"));
                    zzd = zzh.objectFieldOffset(zzaq.class.getDeclaredField("valueField"));
                    zze = zzh.objectFieldOffset(zze.class.getDeclaredField("thread"));
                    zzf = zzh.objectFieldOffset(zze.class.getDeclaredField("next"));
                    zza = zzh;
                } catch (NoSuchFieldException e) {
                    throw new RuntimeException(e);
                }
            } catch (Exception e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2);
            }
        }

        private zzd() {
            throw null;
        }

        /* synthetic */ zzd(byte[] bArr) {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unsafe zzh() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        @Override // com.google.android.gms.internal.wearable.zzaq.zza
        final void zza(zze zzeVar, Thread thread) {
            zza.putObject(zzeVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.wearable.zzaq.zza
        final void zzb(zze zzeVar, zze zzeVar2) {
            zza.putObject(zzeVar, zzf, zzeVar2);
        }

        @Override // com.google.android.gms.internal.wearable.zzaq.zza
        final boolean zzc(zzaq zzaqVar, zze zzeVar, zze zzeVar2) {
            return zzaq$zzd$$ExternalSyntheticBackportWithForwarding0.m(zza, zzaqVar, zzc, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.wearable.zzaq.zza
        final zze zzd(zzaq zzaqVar, zze zzeVar) {
            zze zzeVar2;
            do {
                zzeVar2 = zzaqVar.waitersField;
                if (zzeVar == zzeVar2) {
                    break;
                }
            } while (!zzc(zzaqVar, zzeVar2, zzeVar));
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.wearable.zzaq.zza
        final zzap.zzd zze(zzaq zzaqVar, zzap.zzd zzdVar) {
            zzap.zzd zzdVar2;
            do {
                zzdVar2 = zzaqVar.listenersField;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zzaq$zzd$$ExternalSyntheticBackportWithForwarding0.m(zza, zzaqVar, zzb, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.wearable.zzaq.zza
        final boolean zzf(zzaq zzaqVar, Object obj, Object obj2) {
            return zzaq$zzd$$ExternalSyntheticBackportWithForwarding0.m(zza, zzaqVar, zzd, obj, obj2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
    final class zze {
        static final zze zza = new zze(false);
        volatile zze next;
        volatile Thread thread;

        zze() {
            zzaq.zzm(this, Thread.currentThread());
        }

        zze(boolean z) {
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        zza zzcVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        zzc = z;
        String property = System.getProperty("java.runtime.name", "");
        byte[] bArr = null;
        if (property == null || property.contains("Android")) {
            try {
                zzcVar = new zzd(bArr);
            } catch (Error | Exception e) {
                try {
                    th = e;
                    th2 = null;
                    zzcVar = new zzb(bArr);
                } catch (Error | Exception e2) {
                    th = e;
                    th2 = e2;
                    zzcVar = new zzc(bArr);
                }
            }
        } else {
            try {
                zzcVar = new zzb(bArr);
            } catch (NoClassDefFoundError unused2) {
                zzcVar = new zzc(bArr);
            }
        }
        th2 = null;
        th = null;
        zzd = zzcVar;
        if (th2 != null) {
            zzbe zzbeVar = zzb;
            zzbeVar.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            zzbeVar.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
    }

    zzaq() {
    }

    private final void zza(zze zzeVar) {
        zzeVar.thread = null;
        while (true) {
            zze zzeVar2 = this.waitersField;
            if (zzeVar2 != zze.zza) {
                zze zzeVar3 = null;
                while (zzeVar2 != null) {
                    zze zzeVar4 = zzeVar2.next;
                    if (zzeVar2.thread != null) {
                        zzeVar3 = zzeVar2;
                    } else if (zzeVar3 != null) {
                        zzeVar3.next = zzeVar4;
                        if (zzeVar3.thread == null) {
                            break;
                        }
                    } else if (!zzd.zzc(this, zzeVar2, zzeVar4)) {
                        break;
                    }
                    zzeVar2 = zzeVar4;
                }
                return;
            }
            return;
        }
    }

    static boolean zzi(zzaq zzaqVar, Object obj, Object obj2) {
        return zzd.zzf(zzaqVar, obj, obj2);
    }

    static /* synthetic */ void zzm(zze zzeVar, Thread thread) {
        zzd.zza(zzeVar, thread);
    }

    final zzap.zzd zzh(zzap.zzd zzdVar) {
        return zzd.zze(this, zzdVar);
    }

    final void zzj() {
        for (zze zzd2 = zzd.zzd(this, zze.zza); zzd2 != null; zzd2 = zzd2.next) {
            Thread thread = zzd2.thread;
            if (thread != null) {
                zzd2.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    final Object zzk(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.valueField;
        if ((obj != null) && zzap.zzb(obj)) {
            return zzap.zza(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zze zzeVar = this.waitersField;
            if (zzeVar != zze.zza) {
                zze zzeVar2 = new zze();
                do {
                    zza zzaVar = zzd;
                    zzaVar.zzb(zzeVar2, zzeVar);
                    if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zza(zzeVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.valueField;
                            if ((obj2 != null) && zzap.zzb(obj2)) {
                                return zzap.zza(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zza(zzeVar2);
                    } else {
                        zzeVar = this.waitersField;
                    }
                } while (zzeVar != zze.zza);
            }
            return zzap.zza(Objects.requireNonNull(this.valueField));
        }
        while (nanos > 0) {
            Object obj3 = this.valueField;
            if ((obj3 != null) && zzap.zzb(obj3)) {
                return zzap.zza(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String obj4 = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String lowerCase2 = timeUnit.toString().toLowerCase(Locale.ROOT);
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 8 + String.valueOf(lowerCase2).length());
        sb.append("Waited ");
        sb.append(j);
        sb.append(" ");
        sb.append(lowerCase2);
        String sb2 = sb.toString();
        if (nanos + 1000 < 0) {
            String concat = sb2.concat(" (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                StringBuilder sb3 = new StringBuilder(concat.length() + String.valueOf(convert).length() + 1 + String.valueOf(lowerCase).length());
                sb3.append(concat);
                sb3.append(convert);
                sb3.append(" ");
                sb3.append(lowerCase);
                String sb4 = sb3.toString();
                if (z) {
                    sb4 = sb4.concat(",");
                }
                concat = sb4.concat(" ");
            }
            if (z) {
                StringBuilder sb5 = new StringBuilder(concat.length() + String.valueOf(nanos2).length() + 13);
                sb5.append(concat);
                sb5.append(nanos2);
                sb5.append(" nanoseconds ");
                concat = sb5.toString();
            }
            sb2 = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(sb2.concat(" but future completed as timeout expired"));
        }
        StringBuilder sb6 = new StringBuilder(sb2.length() + 5 + String.valueOf(obj4).length());
        sb6.append(sb2);
        sb6.append(" for ");
        sb6.append(obj4);
        throw new TimeoutException(sb6.toString());
    }

    final Object zzl() throws InterruptedException, ExecutionException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.valueField;
        if ((obj2 != null) && zzap.zzb(obj2)) {
            return zzap.zza(obj2);
        }
        zze zzeVar = this.waitersField;
        if (zzeVar != zze.zza) {
            zze zzeVar2 = new zze();
            do {
                zza zzaVar = zzd;
                zzaVar.zzb(zzeVar2, zzeVar);
                if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zza(zzeVar2);
                            throw new InterruptedException();
                        }
                        obj = this.valueField;
                    } while (!((obj != null) & zzap.zzb(obj)));
                    return zzap.zza(obj);
                }
                zzeVar = this.waitersField;
            } while (zzeVar != zze.zza);
        }
        return zzap.zza(Objects.requireNonNull(this.valueField));
    }
}
