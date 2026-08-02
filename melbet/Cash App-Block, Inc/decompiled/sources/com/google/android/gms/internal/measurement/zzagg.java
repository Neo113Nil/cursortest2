package com.google.android.gms.internal.measurement;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public abstract class zzagg {
    public static final long zza;
    public static final boolean zzb;
    public static final Unsafe zzc;
    public static final Class zzd;
    public static final zzyf zzf;
    public static final boolean zzg;

    /* JADX WARN: Removed duplicated region for block: B:25:0x013c  */
    static {
        boolean z;
        Field zzA;
        zzyf zzyfVar;
        Unsafe zzp = zzp();
        zzc = zzp;
        int i = zzacf.$r8$clinit;
        zzd = Memory.class;
        Class cls = Long.TYPE;
        boolean zzq = zzq(cls);
        Class cls2 = Integer.TYPE;
        boolean zzq2 = zzq(cls2);
        zzyf zzyfVar2 = null;
        if (zzp != null) {
            if (zzq) {
                zzyfVar2 = new zzage(zzp);
            } else if (zzq2) {
                zzyfVar2 = new zzagd(zzp);
            }
        }
        zzf = zzyfVar2;
        if (zzyfVar2 != null) {
            try {
                Class<?> cls3 = ((Unsafe) zzyfVar2.zza).getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                zzA();
            } catch (Throwable th) {
                Logger.getLogger(zzagg.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        zzyf zzyfVar3 = zzf;
        if (zzyfVar3 != null) {
            try {
                Class<?> cls4 = ((Unsafe) zzyfVar3.zza).getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z = true;
            } catch (Throwable th2) {
                Logger.getLogger(zzagg.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
            }
            zzg = z;
            zza = zzy(byte[].class);
            zzy(boolean[].class);
            zzz(boolean[].class);
            zzy(int[].class);
            zzz(int[].class);
            zzy(long[].class);
            zzz(long[].class);
            zzy(float[].class);
            zzz(float[].class);
            zzy(double[].class);
            zzz(double[].class);
            zzy(Object[].class);
            zzz(Object[].class);
            zzA = zzA();
            if (zzA != null && (zzyfVar = zzf) != null) {
                ((Unsafe) zzyfVar.zza).objectFieldOffset(zzA);
            }
            zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        }
        z = false;
        zzg = z;
        zza = zzy(byte[].class);
        zzy(boolean[].class);
        zzz(boolean[].class);
        zzy(int[].class);
        zzz(int[].class);
        zzy(long[].class);
        zzz(long[].class);
        zzy(float[].class);
        zzz(float[].class);
        zzy(double[].class);
        zzz(double[].class);
        zzy(Object[].class);
        zzz(Object[].class);
        zzA = zzA();
        if (zzA != null) {
            ((Unsafe) zzyfVar.zza).objectFieldOffset(zzA);
        }
        zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Field zzA() {
        Field field;
        Field field2;
        int i = zzacf.$r8$clinit;
        try {
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field != null) {
            return field;
        }
        try {
            field2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field2 = null;
        }
        if (field2 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    public static void zzC(Object obj, long j, byte b) {
        Unsafe unsafe = (Unsafe) zzf.zza;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    public static void zzD(Object obj, long j, byte b) {
        Unsafe unsafe = (Unsafe) zzf.zza;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    public static Object zzb(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e) {
            OptionalProvider$$ExternalSyntheticLambda0.m(e);
            return null;
        }
    }

    public static int zzc(Object obj, long j) {
        return ((Unsafe) zzf.zza).getInt(obj, j);
    }

    public static void zzd(long j, Object obj, int i) {
        ((Unsafe) zzf.zza).putInt(obj, j, i);
    }

    public static long zze(Object obj, long j) {
        return ((Unsafe) zzf.zza).getLong(obj, j);
    }

    public static void zzf(Object obj, long j, long j2) {
        ((Unsafe) zzf.zza).putLong(obj, j, j2);
    }

    public static Object zzm(Object obj, long j) {
        return ((Unsafe) zzf.zza).getObject(obj, j);
    }

    public static void zzn(Object obj, long j, Object obj2) {
        ((Unsafe) zzf.zza).putObject(obj, j, obj2);
    }

    public static void zzo(byte[] bArr, long j, byte b) {
        zzf.zza(bArr, zza + j, b);
    }

    public static Unsafe zzp() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new zzagc());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(zzagg.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static boolean zzq(Class cls) {
        int i = zzacf.$r8$clinit;
        try {
            Class cls2 = zzd;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean zzt(Object obj, long j) {
        return ((byte) ((((Unsafe) zzf.zza).getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean zzu(Object obj, long j) {
        return ((byte) ((((Unsafe) zzf.zza).getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static int zzy(Class cls) {
        if (zzg) {
            return ((Unsafe) zzf.zza).arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void zzz(Class cls) {
        if (zzg) {
            ((Unsafe) zzf.zza).arrayIndexScale(cls);
        }
    }
}
