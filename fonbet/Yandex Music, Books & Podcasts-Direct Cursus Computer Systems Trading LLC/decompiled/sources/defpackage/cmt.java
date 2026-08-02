package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public abstract class cmt {
    public static final Logger a = Logger.getLogger(cmt.class.getName());
    public static final Unsafe b;
    public static final Class c;
    public static final zlt d;
    public static final boolean e;
    public static final boolean f;
    public static final long g;
    public static final boolean h;

    /* JADX WARN: Removed duplicated region for block: B:19:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Class cls;
        Class<?> cls2;
        boolean z;
        Unsafe unsafe;
        boolean z2;
        Field d2;
        zlt zltVar;
        Unsafe i = i();
        b = i;
        c = gb0.a;
        Class cls3 = Long.TYPE;
        boolean e2 = e(cls3);
        Class cls4 = Integer.TYPE;
        boolean e3 = e(cls4);
        zlt zltVar2 = null;
        if (i != null) {
            if (!gb0.a()) {
                zltVar2 = new wlt(i);
            } else if (e2) {
                zltVar2 = new tlt(i, 1);
            } else if (e3) {
                zltVar2 = new tlt(i, 0);
            }
        }
        d = zltVar2;
        Class cls5 = Byte.TYPE;
        if (i != null) {
            try {
                cls2 = i.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls3);
            } catch (Throwable th) {
                cls = Field.class;
                a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            }
            if (d() != null) {
                if (!gb0.a()) {
                    cls2.getMethod("getByte", cls3);
                    cls2.getMethod("putByte", cls3, cls5);
                    cls2.getMethod("getInt", cls3);
                    cls2.getMethod("putInt", cls3, cls4);
                    cls2.getMethod("getLong", cls3);
                    cls2.getMethod("putLong", cls3, cls3);
                    cls2.getMethod("copyMemory", cls3, cls3, cls3);
                    cls2.getMethod("copyMemory", Object.class, cls3, Object.class, cls3, cls3);
                }
                cls = Field.class;
                z = true;
                e = z;
                unsafe = b;
                if (unsafe != null) {
                    try {
                        Class<?> cls6 = unsafe.getClass();
                        cls6.getMethod("objectFieldOffset", cls);
                        cls6.getMethod("arrayBaseOffset", Class.class);
                        cls6.getMethod("arrayIndexScale", Class.class);
                        cls6.getMethod("getInt", Object.class, cls3);
                        cls6.getMethod("putInt", Object.class, cls3, cls4);
                        cls6.getMethod("getLong", Object.class, cls3);
                        cls6.getMethod("putLong", Object.class, cls3, cls3);
                        cls6.getMethod("getObject", Object.class, cls3);
                        cls6.getMethod("putObject", Object.class, cls3, Object.class);
                        if (!gb0.a()) {
                            cls6.getMethod("getByte", Object.class, cls3);
                            cls6.getMethod("putByte", Object.class, cls3, cls5);
                            cls6.getMethod("getBoolean", Object.class, cls3);
                            cls6.getMethod("putBoolean", Object.class, cls3, Boolean.TYPE);
                            cls6.getMethod("getFloat", Object.class, cls3);
                            cls6.getMethod("putFloat", Object.class, cls3, Float.TYPE);
                            cls6.getMethod("getDouble", Object.class, cls3);
                            cls6.getMethod("putDouble", Object.class, cls3, Double.TYPE);
                        }
                        z2 = true;
                    } catch (Throwable th2) {
                        a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
                    }
                    f = z2;
                    g = b(byte[].class);
                    b(boolean[].class);
                    c(boolean[].class);
                    b(int[].class);
                    c(int[].class);
                    b(long[].class);
                    c(long[].class);
                    b(float[].class);
                    c(float[].class);
                    b(double[].class);
                    c(double[].class);
                    b(Object[].class);
                    c(Object[].class);
                    d2 = d();
                    if (d2 != null && (zltVar = d) != null) {
                        zltVar.j(d2);
                    }
                    h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z2 = false;
                f = z2;
                g = b(byte[].class);
                b(boolean[].class);
                c(boolean[].class);
                b(int[].class);
                c(int[].class);
                b(long[].class);
                c(long[].class);
                b(float[].class);
                c(float[].class);
                b(double[].class);
                c(double[].class);
                b(Object[].class);
                c(Object[].class);
                d2 = d();
                if (d2 != null) {
                    zltVar.j(d2);
                }
                h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        cls = Field.class;
        z = false;
        e = z;
        unsafe = b;
        if (unsafe != null) {
        }
        z2 = false;
        f = z2;
        g = b(byte[].class);
        b(boolean[].class);
        c(boolean[].class);
        b(int[].class);
        c(int[].class);
        b(long[].class);
        c(long[].class);
        b(float[].class);
        c(float[].class);
        b(double[].class);
        c(double[].class);
        b(Object[].class);
        c(Object[].class);
        d2 = d();
        if (d2 != null) {
        }
        h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Object a(Class cls) {
        try {
            return b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            wvs.m(e2);
            return null;
        }
    }

    public static int b(Class cls) {
        if (f) {
            return d.a(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (f) {
            d.b(cls);
        }
    }

    public static Field d() {
        Field field;
        Field field2;
        if (gb0.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean e(Class cls) {
        if (!gb0.a()) {
            return false;
        }
        try {
            Class cls2 = c;
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

    public static byte f(long j, byte[] bArr) {
        return d.d(g + j, bArr);
    }

    public static byte g(long j, Object obj) {
        return (byte) ((d.g((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static byte h(long j, Object obj) {
        return (byte) ((d.g((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new qlt());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, byte b2, long j) {
        d.l(bArr, g + j, b2);
    }

    public static void k(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int g2 = d.g(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m(j2, obj, ((255 & b2) << i) | (g2 & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    public static void l(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m(j2, obj, ((255 & b2) << i) | (d.g(j2, obj) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    public static void m(long j, Object obj, int i) {
        d.o(j, obj, i);
    }

    public static void n(Object obj, long j, long j2) {
        d.p(obj, j, j2);
    }

    public static void o(long j, Object obj, Object obj2) {
        d.q(j, obj, obj2);
    }
}
