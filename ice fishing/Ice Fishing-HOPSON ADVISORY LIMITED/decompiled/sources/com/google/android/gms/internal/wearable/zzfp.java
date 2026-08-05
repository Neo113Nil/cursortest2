package com.google.android.gms.internal.wearable;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzfp {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzfo zzf;
    private static final boolean zzg;

    /* JADX WARN: Removed duplicated region for block: B:25:0x014a  */
    static {
        boolean z;
        Field zzA;
        zzfo zzfoVar;
        Unsafe zzp = zzp();
        zzc = zzp;
        int i = zzbv.zza;
        zzd = Memory.class;
        boolean zzq = zzq(Long.TYPE);
        zze = zzq;
        boolean zzq2 = zzq(Integer.TYPE);
        zzfo zzfoVar2 = null;
        if (zzp != null) {
            if (zzq) {
                zzfoVar2 = new zzfn(zzp);
            } else if (zzq2) {
                zzfoVar2 = new zzfm(zzp);
            }
        }
        zzf = zzfoVar2;
        if (zzfoVar2 != null) {
            try {
                Class<?> cls = zzfoVar2.zza.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                zzA();
            } catch (Throwable th) {
                zzx(th);
            }
        }
        zzfo zzfoVar3 = zzf;
        if (zzfoVar3 != null) {
            try {
                Class<?> cls2 = zzfoVar3.zza.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("arrayBaseOffset", Class.class);
                cls2.getMethod("arrayIndexScale", Class.class);
                cls2.getMethod("getInt", Object.class, Long.TYPE);
                cls2.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
                cls2.getMethod("getLong", Object.class, Long.TYPE);
                cls2.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
                cls2.getMethod("getObject", Object.class, Long.TYPE);
                cls2.getMethod("putObject", Object.class, Long.TYPE, Object.class);
                z = true;
            } catch (Throwable th2) {
                zzx(th2);
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
            if (zzA != null && (zzfoVar = zzf) != null) {
                zzfoVar.zza.objectFieldOffset(zzA);
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
            zzfoVar.zza.objectFieldOffset(zzA);
        }
        zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzfp() {
    }

    private static Field zzA() {
        int i = zzbv.zza;
        Field zzB = zzB(Buffer.class, "effectiveDirectAddress");
        if (zzB != null) {
            return zzB;
        }
        Field zzB2 = zzB(Buffer.class, "address");
        if (zzB2 == null || zzB2.getType() != Long.TYPE) {
            return null;
        }
        return zzB2;
    }

    private static Field zzB(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzC(Object obj, long j, byte b) {
        Unsafe unsafe = zzf.zza;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(Object obj, long j, byte b) {
        Unsafe unsafe = zzf.zza;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    static boolean zza() {
        return zzg;
    }

    static Object zzb(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    static int zzc(Object obj, long j) {
        return zzf.zza.getInt(obj, j);
    }

    static void zzd(Object obj, long j, int i) {
        zzf.zza.putInt(obj, j, i);
    }

    static long zze(Object obj, long j) {
        return zzf.zza.getLong(obj, j);
    }

    static void zzf(Object obj, long j, long j2) {
        zzf.zza.putLong(obj, j, j2);
    }

    static boolean zzg(Object obj, long j) {
        return zzf.zzb(obj, j);
    }

    static void zzh(Object obj, long j, boolean z) {
        zzf.zzc(obj, j, z);
    }

    static float zzi(Object obj, long j) {
        return zzf.zzd(obj, j);
    }

    static void zzj(Object obj, long j, float f) {
        zzf.zze(obj, j, f);
    }

    static double zzk(Object obj, long j) {
        return zzf.zzf(obj, j);
    }

    static void zzl(Object obj, long j, double d) {
        zzf.zzg(obj, j, d);
    }

    static Object zzm(Object obj, long j) {
        return zzf.zza.getObject(obj, j);
    }

    static void zzn(Object obj, long j, Object obj2) {
        zzf.zza.putObject(obj, j, obj2);
    }

    static void zzo(byte[] bArr, long j, byte b) {
        zzf.zza(bArr, zza + j, b);
    }

    static Unsafe zzp() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new zzfl());
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
            Logger.getLogger(zzfp.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean zzq(Class cls) {
        int i = zzbv.zza;
        try {
            Class cls2 = zzd;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static /* synthetic */ boolean zzt(Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ boolean zzu(Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ void zzx(Throwable th) {
        Logger.getLogger(zzfp.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    private static int zzy(Class cls) {
        if (zzg) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzz(Class cls) {
        if (zzg) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }
}
