package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.cM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3036cM {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f29696a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f29697b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC2982bM f29698c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f29699d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f29700e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f29701f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f29702g;

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(18:(1:61)(1:(1:63))|4|(6:6|7|8|9|10|(3:12|13|(1:15)))|59|23|(15:52|53|54|55|26|27|28|(3:42|43|(7:47|31|(1:35)|36|(1:38)|39|40))|30|31|(2:33|35)|36|(0)|39|40)|25|26|27|28|(0)|30|31|(0)|36|(0)|39|40)|3|4|(0)|59|23|(0)|25|26|27|28|(0)|30|31|(0)|36|(0)|39|40) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0146, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0149 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0047  */
    static {
        AbstractC2982bM zl;
        Class cls;
        AbstractC2982bM abstractC2982bM;
        boolean z8;
        Field field;
        Field field2;
        long j9;
        AbstractC2982bM abstractC2982bM2;
        Field field3;
        Field field4;
        Unsafe n9 = n();
        f29696a = n9;
        int i = KK.f25952a;
        f29697b = Memory.class;
        Class<?> cls2 = Long.TYPE;
        boolean o9 = o(cls2);
        Class cls3 = Integer.TYPE;
        boolean o10 = o(cls3);
        if (n9 != null) {
            if (o9) {
                zl = new C2927aM(n9);
            } else if (o10) {
                zl = new ZL(n9);
            }
            f29698c = zl;
            if (zl != null) {
                try {
                    Class<?> cls4 = ((Unsafe) zl.f29483n).getClass();
                    cls4.getMethod("objectFieldOffset", Field.class);
                    cls4.getMethod("getLong", Object.class, cls2);
                    try {
                        field3 = Buffer.class.getDeclaredField("effectiveDirectAddress");
                    } catch (Throwable unused) {
                        field3 = null;
                    }
                    if (field3 == null) {
                        try {
                            field4 = Buffer.class.getDeclaredField("address");
                        } catch (Throwable unused2) {
                            field4 = null;
                        }
                        if (field4 != null) {
                            field4.getType();
                        }
                    }
                } catch (Throwable th) {
                    cls = Class.class;
                    Logger.getLogger(AbstractC3036cM.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
                }
            }
            cls = Class.class;
            abstractC2982bM = f29698c;
            if (abstractC2982bM != null) {
                try {
                    Class<?> cls5 = ((Unsafe) abstractC2982bM.f29483n).getClass();
                    cls5.getMethod("objectFieldOffset", Field.class);
                    cls5.getMethod("arrayBaseOffset", cls);
                    cls5.getMethod("arrayIndexScale", cls);
                    cls5.getMethod("getInt", Object.class, cls2);
                    cls5.getMethod("putInt", Object.class, cls2, cls3);
                    cls5.getMethod("getLong", Object.class, cls2);
                    cls5.getMethod("putLong", Object.class, cls2, cls2);
                    cls5.getMethod("getObject", Object.class, cls2);
                    cls5.getMethod("putObject", Object.class, cls2, Object.class);
                    z8 = true;
                } catch (Throwable th2) {
                    Logger.getLogger(AbstractC3036cM.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                }
                f29699d = z8;
                f29700e = a(byte[].class);
                a(boolean[].class);
                b(boolean[].class);
                a(int[].class);
                b(int[].class);
                a(long[].class);
                b(long[].class);
                a(float[].class);
                b(float[].class);
                a(double[].class);
                b(double[].class);
                a(Object[].class);
                b(Object[].class);
                int i4 = KK.f25952a;
                field = Buffer.class.getDeclaredField("effectiveDirectAddress");
                if (field == null) {
                    try {
                        field = Buffer.class.getDeclaredField("address");
                    } catch (Throwable unused3) {
                        field = null;
                    }
                    if (field == null || field.getType() != cls2) {
                        field2 = null;
                        j9 = -1;
                        if (field2 != null && (abstractC2982bM2 = f29698c) != null) {
                            j9 = ((Unsafe) abstractC2982bM2.f29483n).objectFieldOffset(field2);
                        }
                        f29701f = j9;
                        f29702g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                    }
                }
                field2 = field;
                j9 = -1;
                if (field2 != null) {
                    j9 = ((Unsafe) abstractC2982bM2.f29483n).objectFieldOffset(field2);
                }
                f29701f = j9;
                f29702g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
            z8 = false;
            f29699d = z8;
            f29700e = a(byte[].class);
            a(boolean[].class);
            b(boolean[].class);
            a(int[].class);
            b(int[].class);
            a(long[].class);
            b(long[].class);
            a(float[].class);
            b(float[].class);
            a(double[].class);
            b(double[].class);
            a(Object[].class);
            b(Object[].class);
            int i42 = KK.f25952a;
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
            if (field == null) {
            }
            field2 = field;
            j9 = -1;
            if (field2 != null) {
            }
            f29701f = j9;
            f29702g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        }
        zl = null;
        f29698c = zl;
        if (zl != null) {
        }
        cls = Class.class;
        abstractC2982bM = f29698c;
        if (abstractC2982bM != null) {
        }
        z8 = false;
        f29699d = z8;
        f29700e = a(byte[].class);
        a(boolean[].class);
        b(boolean[].class);
        a(int[].class);
        b(int[].class);
        a(long[].class);
        b(long[].class);
        a(float[].class);
        b(float[].class);
        a(double[].class);
        b(double[].class);
        a(Object[].class);
        b(Object[].class);
        int i422 = KK.f25952a;
        field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        if (field == null) {
        }
        field2 = field;
        j9 = -1;
        if (field2 != null) {
        }
        f29701f = j9;
        f29702g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int a(Class cls) {
        if (f29699d) {
            return ((Unsafe) f29698c.f29483n).arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void b(Class cls) {
        if (f29699d) {
            ((Unsafe) f29698c.f29483n).arrayIndexScale(cls);
        }
    }

    public static void c(Object obj, long j9, byte b9) {
        Unsafe unsafe = (Unsafe) f29698c.f29483n;
        long j10 = (-4) & j9;
        int i = unsafe.getInt(obj, j10);
        int i4 = ((~((int) j9)) & 3) << 3;
        unsafe.putInt(obj, j10, ((255 & b9) << i4) | (i & (~(com.anythink.basead.exoplayer.k.p.f8630b << i4))));
    }

    public static void d(Object obj, long j9, byte b9) {
        Unsafe unsafe = (Unsafe) f29698c.f29483n;
        long j10 = (-4) & j9;
        int i = (((int) j9) & 3) << 3;
        unsafe.putInt(obj, j10, ((255 & b9) << i) | (unsafe.getInt(obj, j10) & (~(com.anythink.basead.exoplayer.k.p.f8630b << i))));
    }

    public static Object e(Class cls) {
        try {
            return f29696a.allocateInstance(cls);
        } catch (InstantiationException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public static int f(long j9, Object obj) {
        return ((Unsafe) f29698c.f29483n).getInt(obj, j9);
    }

    public static void g(int i, long j9, Object obj) {
        ((Unsafe) f29698c.f29483n).putInt(obj, j9, i);
    }

    public static long h(long j9, Object obj) {
        return ((Unsafe) f29698c.f29483n).getLong(obj, j9);
    }

    public static void i(Object obj, long j9, long j10) {
        ((Unsafe) f29698c.f29483n).putLong(obj, j9, j10);
    }

    public static Object j(long j9, Object obj) {
        return ((Unsafe) f29698c.f29483n).getObject(obj, j9);
    }

    public static void k(long j9, Object obj, Object obj2) {
        ((Unsafe) f29698c.f29483n).putObject(obj, j9, obj2);
    }

    public static void l(byte[] bArr, long j9, byte b9) {
        f29698c.N(bArr, f29700e + j9, b9);
    }

    public static long m(ByteBuffer byteBuffer) {
        return ((Unsafe) f29698c.f29483n).getLong(byteBuffer, f29701f);
    }

    public static Unsafe n() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new YL());
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
            Logger.getLogger(AbstractC3036cM.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static boolean o(Class cls) {
        int i = KK.f25952a;
        try {
            Class cls2 = f29697b;
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

    public static /* synthetic */ boolean p(long j9, Object obj) {
        return ((byte) ((((Unsafe) f29698c.f29483n).getInt(obj, (-4) & j9) >>> ((int) (((~j9) & 3) << 3))) & com.anythink.basead.exoplayer.k.p.f8630b)) != 0;
    }

    public static /* synthetic */ boolean q(long j9, Object obj) {
        return ((byte) ((((Unsafe) f29698c.f29483n).getInt(obj, (-4) & j9) >>> ((int) ((j9 & 3) << 3))) & com.anythink.basead.exoplayer.k.p.f8630b)) != 0;
    }
}
