package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class PL {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f26759a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f26760b;

    /* renamed from: c, reason: collision with root package name */
    public static final OK f26761c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f26762d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f26763e;

    /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|(17:(1:60)(1:(1:62))|4|(6:6|7|8|9|10|(3:12|13|(1:15)))|58|23|(14:51|52|53|54|26|27|28|(3:41|42|(6:46|(1:34)|35|(1:37)|38|39))|30|(2:32|34)|35|(0)|38|39)|25|26|27|28|(0)|30|(0)|35|(0)|38|39)|3|4|(0)|58|23|(0)|25|26|27|28|(0)|30|(0)|35|(0)|38|39) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0142, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0145 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0047  */
    static {
        OK nl;
        Class cls;
        OK ok;
        boolean z3;
        Field field;
        Field field2;
        OK ok2;
        Field field3;
        Field field4;
        Unsafe h9 = h();
        f26759a = h9;
        int i = BK.f23877a;
        f26760b = Memory.class;
        Class<?> cls2 = Long.TYPE;
        boolean i6 = i(cls2);
        Class cls3 = Integer.TYPE;
        boolean i9 = i(cls3);
        if (h9 != null) {
            if (i6) {
                nl = new OL(h9);
            } else if (i9) {
                nl = new NL(h9);
            }
            f26761c = nl;
            if (nl != null) {
                try {
                    Class<?> cls4 = ((Unsafe) nl.f26598n).getClass();
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
                    Logger.getLogger(PL.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
                }
            }
            cls = Class.class;
            ok = f26761c;
            if (ok != null) {
                try {
                    Class<?> cls5 = ((Unsafe) ok.f26598n).getClass();
                    cls5.getMethod("objectFieldOffset", Field.class);
                    cls5.getMethod("arrayBaseOffset", cls);
                    cls5.getMethod("arrayIndexScale", cls);
                    cls5.getMethod("getInt", Object.class, cls2);
                    cls5.getMethod("putInt", Object.class, cls2, cls3);
                    cls5.getMethod("getLong", Object.class, cls2);
                    cls5.getMethod("putLong", Object.class, cls2, cls2);
                    cls5.getMethod("getObject", Object.class, cls2);
                    cls5.getMethod("putObject", Object.class, cls2, Object.class);
                    z3 = true;
                } catch (Throwable th2) {
                    Logger.getLogger(PL.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                }
                f26762d = z3;
                n(byte[].class);
                n(boolean[].class);
                o(boolean[].class);
                n(int[].class);
                o(int[].class);
                n(long[].class);
                o(long[].class);
                n(float[].class);
                o(float[].class);
                n(double[].class);
                o(double[].class);
                n(Object[].class);
                o(Object[].class);
                int i10 = BK.f23877a;
                field = Buffer.class.getDeclaredField("effectiveDirectAddress");
                if (field == null) {
                    try {
                        field = Buffer.class.getDeclaredField("address");
                    } catch (Throwable unused3) {
                        field = null;
                    }
                    if (field == null || field.getType() != cls2) {
                        field2 = null;
                        if (field2 != null && (ok2 = f26761c) != null) {
                            ((Unsafe) ok2.f26598n).objectFieldOffset(field2);
                        }
                        f26763e = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                    }
                }
                field2 = field;
                if (field2 != null) {
                    ((Unsafe) ok2.f26598n).objectFieldOffset(field2);
                }
                f26763e = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
            z3 = false;
            f26762d = z3;
            n(byte[].class);
            n(boolean[].class);
            o(boolean[].class);
            n(int[].class);
            o(int[].class);
            n(long[].class);
            o(long[].class);
            n(float[].class);
            o(float[].class);
            n(double[].class);
            o(double[].class);
            n(Object[].class);
            o(Object[].class);
            int i102 = BK.f23877a;
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
            if (field == null) {
            }
            field2 = field;
            if (field2 != null) {
            }
            f26763e = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        }
        nl = null;
        f26761c = nl;
        if (nl != null) {
        }
        cls = Class.class;
        ok = f26761c;
        if (ok != null) {
        }
        z3 = false;
        f26762d = z3;
        n(byte[].class);
        n(boolean[].class);
        o(boolean[].class);
        n(int[].class);
        o(int[].class);
        n(long[].class);
        o(long[].class);
        n(float[].class);
        o(float[].class);
        n(double[].class);
        o(double[].class);
        n(Object[].class);
        o(Object[].class);
        int i1022 = BK.f23877a;
        field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        if (field == null) {
        }
        field2 = field;
        if (field2 != null) {
        }
        f26763e = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Object a(Class cls) {
        try {
            return f26759a.allocateInstance(cls);
        } catch (InstantiationException e9) {
            throw new IllegalStateException(e9);
        }
    }

    public static int b(long j6, Object obj) {
        return ((Unsafe) f26761c.f26598n).getInt(obj, j6);
    }

    public static void c(int i, long j6, Object obj) {
        ((Unsafe) f26761c.f26598n).putInt(obj, j6, i);
    }

    public static long d(long j6, Object obj) {
        return ((Unsafe) f26761c.f26598n).getLong(obj, j6);
    }

    public static void e(Object obj, long j6, long j9) {
        ((Unsafe) f26761c.f26598n).putLong(obj, j6, j9);
    }

    public static Object f(long j6, Object obj) {
        return ((Unsafe) f26761c.f26598n).getObject(obj, j6);
    }

    public static void g(long j6, Object obj, Object obj2) {
        ((Unsafe) f26761c.f26598n).putObject(obj, j6, obj2);
    }

    public static Unsafe h() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new ML());
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
            Logger.getLogger(PL.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static boolean i(Class cls) {
        int i = BK.f23877a;
        try {
            Class cls2 = f26760b;
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

    public static /* synthetic */ boolean j(long j6, Object obj) {
        return ((byte) ((((Unsafe) f26761c.f26598n).getInt(obj, (-4) & j6) >>> ((int) (((~j6) & 3) << 3))) & com.anythink.basead.exoplayer.k.p.f8473b)) != 0;
    }

    public static /* synthetic */ boolean k(long j6, Object obj) {
        return ((byte) ((((Unsafe) f26761c.f26598n).getInt(obj, (-4) & j6) >>> ((int) ((j6 & 3) << 3))) & com.anythink.basead.exoplayer.k.p.f8473b)) != 0;
    }

    public static /* synthetic */ void l(Object obj, long j6, boolean z3) {
        Unsafe unsafe = (Unsafe) f26761c.f26598n;
        long j9 = (-4) & j6;
        int i = unsafe.getInt(obj, j9);
        int i6 = ((~((int) j6)) & 3) << 3;
        unsafe.putInt(obj, j9, ((z3 ? 1 : 0) << i6) | ((~(com.anythink.basead.exoplayer.k.p.f8473b << i6)) & i));
    }

    public static /* synthetic */ void m(Object obj, long j6, boolean z3) {
        Unsafe unsafe = (Unsafe) f26761c.f26598n;
        long j9 = (-4) & j6;
        int i = (((int) j6) & 3) << 3;
        unsafe.putInt(obj, j9, ((z3 ? 1 : 0) << i) | ((~(com.anythink.basead.exoplayer.k.p.f8473b << i)) & unsafe.getInt(obj, j9)));
    }

    public static void n(Class cls) {
        if (f26762d) {
            ((Unsafe) f26761c.f26598n).arrayBaseOffset(cls);
        }
    }

    public static void o(Class cls) {
        if (f26762d) {
            ((Unsafe) f26761c.f26598n).arrayIndexScale(cls);
        }
    }
}
