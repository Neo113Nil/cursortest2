package com.google.android.gms.internal.mlkit_genai_prompt;

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
public abstract class zzanu {
    public static final boolean zza;
    public static final Unsafe zzc;
    public static final Class zzd;
    public static final zzant zzf;
    public static final boolean zzg;
    public static final boolean zzh;

    /* JADX WARN: Removed duplicated region for block: B:15:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    static {
        boolean z;
        zzant zzantVar;
        boolean z2;
        Field zzy;
        zzant zzantVar2;
        Unsafe zzg2 = zzg();
        zzc = zzg2;
        int i = zzaki.$r8$clinit;
        zzd = Memory.class;
        Class cls = Long.TYPE;
        boolean zzs = zzs(cls);
        Class cls2 = Integer.TYPE;
        boolean zzs2 = zzs(cls2);
        zzant zzantVar3 = null;
        if (zzg2 != null) {
            if (zzs) {
                zzantVar3 = new zzans(zzg2);
            } else if (zzs2) {
                zzantVar3 = new zzanr(zzg2);
            }
        }
        zzf = zzantVar3;
        if (zzantVar3 != null) {
            try {
                Class<?> cls3 = zzantVar3.zza.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                Logger.getLogger(zzanu.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
            if (zzy() != null) {
                z = true;
                zzg = z;
                zzantVar = zzf;
                if (zzantVar != null) {
                    try {
                        Class<?> cls4 = zzantVar.zza.getClass();
                        cls4.getMethod("objectFieldOffset", Field.class);
                        cls4.getMethod("arrayBaseOffset", Class.class);
                        cls4.getMethod("arrayIndexScale", Class.class);
                        cls4.getMethod("getInt", Object.class, cls);
                        cls4.getMethod("putInt", Object.class, cls, cls2);
                        cls4.getMethod("getLong", Object.class, cls);
                        cls4.getMethod("putLong", Object.class, cls, cls);
                        cls4.getMethod("getObject", Object.class, cls);
                        cls4.getMethod("putObject", Object.class, cls, Object.class);
                        z2 = true;
                    } catch (Throwable th2) {
                        Logger.getLogger(zzanu.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                    }
                    zzh = z2;
                    zzw(byte[].class);
                    zzw(boolean[].class);
                    zzx(boolean[].class);
                    zzw(int[].class);
                    zzx(int[].class);
                    zzw(long[].class);
                    zzx(long[].class);
                    zzw(float[].class);
                    zzx(float[].class);
                    zzw(double[].class);
                    zzx(double[].class);
                    zzw(Object[].class);
                    zzx(Object[].class);
                    zzy = zzy();
                    if (zzy != null && (zzantVar2 = zzf) != null) {
                        zzantVar2.zza.objectFieldOffset(zzy);
                    }
                    zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z2 = false;
                zzh = z2;
                zzw(byte[].class);
                zzw(boolean[].class);
                zzx(boolean[].class);
                zzw(int[].class);
                zzx(int[].class);
                zzw(long[].class);
                zzx(long[].class);
                zzw(float[].class);
                zzx(float[].class);
                zzw(double[].class);
                zzx(double[].class);
                zzw(Object[].class);
                zzx(Object[].class);
                zzy = zzy();
                if (zzy != null) {
                    zzantVar2.zza.objectFieldOffset(zzy);
                }
                zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z = false;
        zzg = z;
        zzantVar = zzf;
        if (zzantVar != null) {
        }
        z2 = false;
        zzh = z2;
        zzw(byte[].class);
        zzw(boolean[].class);
        zzx(boolean[].class);
        zzw(int[].class);
        zzx(int[].class);
        zzw(long[].class);
        zzx(long[].class);
        zzw(float[].class);
        zzx(float[].class);
        zzw(double[].class);
        zzx(double[].class);
        zzw(Object[].class);
        zzx(Object[].class);
        zzy = zzy();
        if (zzy != null) {
        }
        zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int zzc(Object obj, long j) {
        return zzf.zza.getInt(obj, j);
    }

    public static long zzd(Object obj, long j) {
        return zzf.zza.getLong(obj, j);
    }

    public static Object zze(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e) {
            OptionalProvider$$ExternalSyntheticLambda0.m(e);
            return null;
        }
    }

    public static Object zzf(Object obj, long j) {
        return zzf.zza.getObject(obj, j);
    }

    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzanq());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void zzi(Object obj, long j, boolean z) {
        Unsafe unsafe = zzf.zza;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((z ? 1 : 0) << i2) | ((~(255 << i2)) & i));
    }

    public static /* synthetic */ void zzj(Object obj, long j, boolean z) {
        Unsafe unsafe = zzf.zza;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((z ? 1 : 0) << i) | ((~(255 << i)) & unsafe.getInt(obj, j2)));
    }

    public static void zzn(long j, Object obj, int i) {
        zzf.zza.putInt(obj, j, i);
    }

    public static void zzo(Object obj, long j, long j2) {
        zzf.zza.putLong(obj, j, j2);
    }

    public static void zzp(Object obj, long j, Object obj2) {
        zzf.zza.putObject(obj, j, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zzq(Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzr(Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static boolean zzs(Class cls) {
        int i = zzaki.$r8$clinit;
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

    public static void zzw(Class cls) {
        if (zzh) {
            zzf.zza.arrayBaseOffset(cls);
        }
    }

    public static void zzx(Class cls) {
        if (zzh) {
            zzf.zza.arrayIndexScale(cls);
        }
    }

    public static Field zzy() {
        Field field;
        Field field2;
        int i = zzaki.$r8$clinit;
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
}
