package com.google.android.gms.internal.mlkit_genai_prompt;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzjc;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.stripe.android.networking.StripeErrorMappingKt;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public abstract class zzjd implements ListenableFuture {
    public static final StripeErrorMappingKt zza;
    public static final Object zze = new Object();
    public static final zzkr zzf = new zzkr(zzjc.class, 0);
    public static final boolean zzg;
    public volatile zzjc.zzd listenersField;
    public volatile Object valueField;
    public volatile zze waitersField;

    public final class zzb extends StripeErrorMappingKt {
        public static final AtomicReferenceFieldUpdater zza = AtomicReferenceFieldUpdater.newUpdater(zze.class, Thread.class, "thread");
        public static final AtomicReferenceFieldUpdater zzb = AtomicReferenceFieldUpdater.newUpdater(zze.class, zze.class, "next");
        public static final AtomicReferenceFieldUpdater zzc = AtomicReferenceFieldUpdater.newUpdater(zzjd.class, zze.class, "waitersField");
        public static final AtomicReferenceFieldUpdater zzd = AtomicReferenceFieldUpdater.newUpdater(zzjd.class, zzjc.zzd.class, "listenersField");
        public static final AtomicReferenceFieldUpdater zze = AtomicReferenceFieldUpdater.newUpdater(zzjd.class, Object.class, "valueField");

        @Override // com.stripe.android.networking.StripeErrorMappingKt
        public final zzjc.zzd zza(zzjc zzjcVar) {
            return (zzjc.zzd) zzd.getAndSet(zzjcVar, zzjc.zzd.zza);
        }

        @Override // com.stripe.android.networking.StripeErrorMappingKt
        public final zze zzb(zzjc zzjcVar) {
            return (zze) zzc.getAndSet(zzjcVar, zze.zza);
        }

        @Override // com.stripe.android.networking.StripeErrorMappingKt
        public final void zzc(zze zzeVar, zze zzeVar2) {
            zzb.lazySet(zzeVar, zzeVar2);
        }

        @Override // com.stripe.android.networking.StripeErrorMappingKt
        public final void zzd(zze zzeVar, Thread thread) {
            zza.lazySet(zzeVar, thread);
        }

        @Override // com.stripe.android.networking.StripeErrorMappingKt
        public final boolean zze(zzjc zzjcVar, zzjc.zzd zzdVar, zzjc.zzd zzdVar2) {
            return zzje.zza(zzd, zzjcVar, zzdVar, zzdVar2);
        }

        @Override // com.stripe.android.networking.StripeErrorMappingKt
        public final boolean zzf(zzjd zzjdVar, Object obj, Object obj2) {
            return zzje.zza(zze, zzjdVar, obj, obj2);
        }

        @Override // com.stripe.android.networking.StripeErrorMappingKt
        public final boolean zzg(zzjd zzjdVar, zze zzeVar, zze zzeVar2) {
            return zzje.zza(zzc, zzjdVar, zzeVar, zzeVar2);
        }
    }

    public final class zzc extends StripeErrorMappingKt {
        @Override // com.stripe.android.networking.StripeErrorMappingKt
        public final zzjc.zzd zza(zzjc zzjcVar) {
            zzjc.zzd zzdVar;
            zzjc.zzd zzdVar2 = zzjc.zzd.zza;
            synchronized (zzjcVar) {
                try {
                    zzdVar = zzjcVar.listenersField;
                    if (zzdVar != zzdVar2) {
                        zzjcVar.listenersField = zzdVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzdVar;
        }

        @Override // com.stripe.android.networking.StripeErrorMappingKt
        public final zze zzb(zzjc zzjcVar) {
            zze zzeVar;
            zze zzeVar2 = zze.zza;
            synchronized (zzjcVar) {
                try {
                    zzeVar = zzjcVar.waitersField;
                    if (zzeVar != zzeVar2) {
                        zzjcVar.waitersField = zzeVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzeVar;
        }

        @Override // com.stripe.android.networking.StripeErrorMappingKt
        public final void zzc(zze zzeVar, zze zzeVar2) {
            zzeVar.next = zzeVar2;
        }

        @Override // com.stripe.android.networking.StripeErrorMappingKt
        public final void zzd(zze zzeVar, Thread thread) {
            zzeVar.thread = thread;
        }

        @Override // com.stripe.android.networking.StripeErrorMappingKt
        public final boolean zze(zzjc zzjcVar, zzjc.zzd zzdVar, zzjc.zzd zzdVar2) {
            synchronized (zzjcVar) {
                try {
                    if (zzjcVar.listenersField != zzdVar) {
                        return false;
                    }
                    zzjcVar.listenersField = zzdVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.stripe.android.networking.StripeErrorMappingKt
        public final boolean zzf(zzjd zzjdVar, Object obj, Object obj2) {
            synchronized (zzjdVar) {
                try {
                    if (zzjdVar.valueField != obj) {
                        return false;
                    }
                    zzjdVar.valueField = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.stripe.android.networking.StripeErrorMappingKt
        public final boolean zzg(zzjd zzjdVar, zze zzeVar, zze zzeVar2) {
            synchronized (zzjdVar) {
                try {
                    if (zzjdVar.waitersField != zzeVar) {
                        return false;
                    }
                    zzjdVar.waitersField = zzeVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final class zzd extends StripeErrorMappingKt {
        public static final Unsafe zza;
        public static final long zzb;
        public static final long zzc;
        public static final long zzd;
        public static final long zze;
        public static final long zzf;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new zzjg());
                }
                try {
                    zzc = unsafe.objectFieldOffset(zzjd.class.getDeclaredField("waitersField"));
                    zzb = unsafe.objectFieldOffset(zzjd.class.getDeclaredField("listenersField"));
                    zzd = unsafe.objectFieldOffset(zzjd.class.getDeclaredField("valueField"));
                    zze = unsafe.objectFieldOffset(zze.class.getDeclaredField("thread"));
                    zzf = unsafe.objectFieldOffset(zze.class.getDeclaredField("next"));
                    zza = unsafe;
                } catch (NoSuchFieldException e) {
                    a$$ExternalSyntheticBUOutline0.m((Throwable) e);
                }
            } catch (PrivilegedActionException e2) {
                OptionalProvider$$ExternalSyntheticLambda0.m("Could not initialize intrinsics", e2.getCause());
            }
        }

        @Override // com.stripe.android.networking.StripeErrorMappingKt
        public final zzjc.zzd zza(zzjc zzjcVar) {
            zzjc.zzd zzdVar;
            zzjc.zzd zzdVar2 = zzjc.zzd.zza;
            do {
                zzdVar = zzjcVar.listenersField;
                if (zzdVar2 == zzdVar) {
                    break;
                }
            } while (!zze(zzjcVar, zzdVar, zzdVar2));
            return zzdVar;
        }

        @Override // com.stripe.android.networking.StripeErrorMappingKt
        public final zze zzb(zzjc zzjcVar) {
            zze zzeVar;
            zze zzeVar2 = zze.zza;
            do {
                zzeVar = zzjcVar.waitersField;
                if (zzeVar2 == zzeVar) {
                    break;
                }
            } while (!zzg(zzjcVar, zzeVar, zzeVar2));
            return zzeVar;
        }

        @Override // com.stripe.android.networking.StripeErrorMappingKt
        public final void zzc(zze zzeVar, zze zzeVar2) {
            zza.putObject(zzeVar, zzf, zzeVar2);
        }

        @Override // com.stripe.android.networking.StripeErrorMappingKt
        public final void zzd(zze zzeVar, Thread thread) {
            zza.putObject(zzeVar, zze, thread);
        }

        @Override // com.stripe.android.networking.StripeErrorMappingKt
        public final boolean zze(zzjc zzjcVar, zzjc.zzd zzdVar, zzjc.zzd zzdVar2) {
            return zzjf.zza(zza, zzjcVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.stripe.android.networking.StripeErrorMappingKt
        public final boolean zzf(zzjd zzjdVar, Object obj, Object obj2) {
            return zzjf.zza(zza, zzjdVar, zzd, obj, obj2);
        }

        @Override // com.stripe.android.networking.StripeErrorMappingKt
        public final boolean zzg(zzjd zzjdVar, zze zzeVar, zze zzeVar2) {
            return zzjf.zza(zza, zzjdVar, zzc, zzeVar, zzeVar2);
        }
    }

    public final class zze {
        public static final zze zza = new zze();
        public volatile zze next;
        public volatile Thread thread;

        public zze() {
            zzjd.zza.zzd(this, Thread.currentThread());
        }
    }

    static {
        StripeErrorMappingKt zzcVar;
        Throwable th;
        Throwable th2;
        boolean z = false;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
        }
        zzg = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                zzcVar = new zzd();
            } catch (Error | Exception e) {
                try {
                    zzcVar = new zzb();
                } catch (Error | Exception e2) {
                    th3 = e2;
                    zzcVar = new zzc();
                }
                th = th3;
                th2 = e;
            }
        } else {
            try {
                zzcVar = new zzb();
            } catch (NoClassDefFoundError unused2) {
                zzcVar = new zzc();
            }
        }
        th = null;
        th2 = null;
        zza = zzcVar;
        if (th != null) {
            zzkr zzkrVar = zzf;
            Logger zza2 = zzkrVar.zza();
            Level level = Level.SEVERE;
            zza2.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            zzkrVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void zzU(zze zzeVar) {
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
                    } else if (!zza.zzg(this, zzeVar2, zzeVar4)) {
                        break;
                    }
                    zzeVar2 = zzeVar4;
                }
                return;
            }
            return;
        }
    }

    public abstract Throwable zzg();
}
