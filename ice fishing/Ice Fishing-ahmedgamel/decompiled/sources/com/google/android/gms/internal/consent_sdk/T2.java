package com.google.android.gms.internal.consent_sdk;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class T2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f36384a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f36385b;

    /* renamed from: c, reason: collision with root package name */
    public static final S2 f36386c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f36387d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f36388e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f36389f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f36390g;

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(18:(1:65)(1:(1:67))|4|(7:43|44|45|46|47|(4:51|52|(1:54)|57)|(14:50|8|(14:36|37|38|39|11|12|13|(3:26|27|(6:31|(1:19)|20|(1:22)|23|24))|15|(2:17|19)|20|(0)|23|24)|10|11|12|13|(0)|15|(0)|20|(0)|23|24))|6|7|8|(0)|10|11|12|13|(0)|15|(0)|20|(0)|23|24)|3|4|(0)|6|7|8|(0)|10|11|12|13|(0)|15|(0)|20|(0)|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0157, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0078, code lost:
    
        if (r0.getType() == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0050  */
    static {
        S2 q22;
        Class cls;
        Field field;
        boolean z6;
        S2 s22;
        boolean z9;
        Field field2;
        Field field3;
        S2 s23;
        Unsafe h3 = h();
        f36384a = h3;
        int i = AbstractC4338e2.f36436a;
        f36385b = Memory.class;
        Class<?> cls2 = Long.TYPE;
        boolean n9 = n(cls2);
        Class cls3 = Integer.TYPE;
        boolean n10 = n(cls3);
        if (h3 != null) {
            if (n9) {
                q22 = new R2(h3);
            } else if (n10) {
                q22 = new Q2(h3);
            }
            f36386c = q22;
            if (q22 != null) {
                try {
                    Class<?> cls4 = q22.f36383a.getClass();
                    cls4.getMethod("objectFieldOffset", Field.class);
                    cls4.getMethod("getLong", Object.class, cls2);
                    try {
                        field = Buffer.class.getDeclaredField("effectiveDirectAddress");
                    } catch (Throwable unused) {
                        field = null;
                    }
                    if (field == null) {
                        try {
                            field = Buffer.class.getDeclaredField("address");
                        } catch (Throwable unused2) {
                            field = null;
                        }
                        if (field != null) {
                        }
                        field = null;
                    }
                } catch (Throwable th) {
                    cls = Class.class;
                    Logger.getLogger(T2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
                }
                if (field != null) {
                    cls = Class.class;
                    z6 = true;
                    f36387d = z6;
                    s22 = f36386c;
                    if (s22 != null) {
                        try {
                            Class<?> cls5 = s22.f36383a.getClass();
                            cls5.getMethod("objectFieldOffset", Field.class);
                            cls5.getMethod("arrayBaseOffset", cls);
                            cls5.getMethod("arrayIndexScale", cls);
                            cls5.getMethod("getInt", Object.class, cls2);
                            cls5.getMethod("putInt", Object.class, cls2, cls3);
                            cls5.getMethod("getLong", Object.class, cls2);
                            cls5.getMethod("putLong", Object.class, cls2, cls2);
                            cls5.getMethod("getObject", Object.class, cls2);
                            cls5.getMethod("putObject", Object.class, cls2, Object.class);
                            z9 = true;
                        } catch (Throwable th2) {
                            Logger.getLogger(T2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                        }
                        f36388e = z9;
                        f36389f = o(byte[].class);
                        o(boolean[].class);
                        a(boolean[].class);
                        o(int[].class);
                        a(int[].class);
                        o(long[].class);
                        a(long[].class);
                        o(float[].class);
                        a(float[].class);
                        o(double[].class);
                        a(double[].class);
                        o(Object[].class);
                        a(Object[].class);
                        int i4 = AbstractC4338e2.f36436a;
                        field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
                        if (field2 == null) {
                            try {
                                field2 = Buffer.class.getDeclaredField("address");
                            } catch (Throwable unused3) {
                                field2 = null;
                            }
                            if (field2 == null || field2.getType() != cls2) {
                                field3 = null;
                                if (field3 != null && (s23 = f36386c) != null) {
                                    s23.f36383a.objectFieldOffset(field3);
                                }
                                f36390g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                            }
                        }
                        field3 = field2;
                        if (field3 != null) {
                            s23.f36383a.objectFieldOffset(field3);
                        }
                        f36390g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                    }
                    z9 = false;
                    f36388e = z9;
                    f36389f = o(byte[].class);
                    o(boolean[].class);
                    a(boolean[].class);
                    o(int[].class);
                    a(int[].class);
                    o(long[].class);
                    a(long[].class);
                    o(float[].class);
                    a(float[].class);
                    o(double[].class);
                    a(double[].class);
                    o(Object[].class);
                    a(Object[].class);
                    int i42 = AbstractC4338e2.f36436a;
                    field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
                    if (field2 == null) {
                    }
                    field3 = field2;
                    if (field3 != null) {
                    }
                    f36390g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
            }
            cls = Class.class;
            z6 = false;
            f36387d = z6;
            s22 = f36386c;
            if (s22 != null) {
            }
            z9 = false;
            f36388e = z9;
            f36389f = o(byte[].class);
            o(boolean[].class);
            a(boolean[].class);
            o(int[].class);
            a(int[].class);
            o(long[].class);
            a(long[].class);
            o(float[].class);
            a(float[].class);
            o(double[].class);
            a(double[].class);
            o(Object[].class);
            a(Object[].class);
            int i422 = AbstractC4338e2.f36436a;
            field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            if (field2 == null) {
            }
            field3 = field2;
            if (field3 != null) {
            }
            f36390g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        }
        q22 = null;
        f36386c = q22;
        if (q22 != null) {
        }
        cls = Class.class;
        z6 = false;
        f36387d = z6;
        s22 = f36386c;
        if (s22 != null) {
        }
        z9 = false;
        f36388e = z9;
        f36389f = o(byte[].class);
        o(boolean[].class);
        a(boolean[].class);
        o(int[].class);
        a(int[].class);
        o(long[].class);
        a(long[].class);
        o(float[].class);
        a(float[].class);
        o(double[].class);
        a(double[].class);
        o(Object[].class);
        a(Object[].class);
        int i4222 = AbstractC4338e2.f36436a;
        field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
        if (field2 == null) {
        }
        field3 = field2;
        if (field3 != null) {
        }
        f36390g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Class cls) {
        if (f36388e) {
            f36386c.f36383a.arrayIndexScale(cls);
        }
    }

    public static void b(Object obj, long j6, byte b9) {
        Unsafe unsafe = f36386c.f36383a;
        long j9 = (-4) & j6;
        int i = unsafe.getInt(obj, j9);
        int i4 = ((~((int) j6)) & 3) << 3;
        unsafe.putInt(obj, j9, ((255 & b9) << i4) | (i & (~(com.anythink.basead.exoplayer.k.p.f9259b << i4))));
    }

    public static void c(Object obj, long j6, byte b9) {
        Unsafe unsafe = f36386c.f36383a;
        long j9 = (-4) & j6;
        int i = (((int) j6) & 3) << 3;
        unsafe.putInt(obj, j9, ((255 & b9) << i) | (unsafe.getInt(obj, j9) & (~(com.anythink.basead.exoplayer.k.p.f9259b << i))));
    }

    public static int d(long j6, Object obj) {
        return f36386c.f36383a.getInt(obj, j6);
    }

    public static long e(long j6, Object obj) {
        return f36386c.f36383a.getLong(obj, j6);
    }

    public static Object f(Class cls) {
        try {
            return f36384a.allocateInstance(cls);
        } catch (InstantiationException e9) {
            throw new IllegalStateException(e9);
        }
    }

    public static Object g(long j6, Object obj) {
        return f36386c.f36383a.getObject(obj, j6);
    }

    public static Unsafe h() {
        try {
            return (Unsafe) AccessController.doPrivileged(new P2());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void i(int i, long j6, Object obj) {
        f36386c.f36383a.putInt(obj, j6, i);
    }

    public static void j(Object obj, long j6, long j9) {
        f36386c.f36383a.putLong(obj, j6, j9);
    }

    public static void k(long j6, Object obj, Object obj2) {
        f36386c.f36383a.putObject(obj, j6, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean l(long j6, Object obj) {
        return ((byte) ((f36386c.f36383a.getInt(obj, (-4) & j6) >>> ((int) (((~j6) & 3) << 3))) & com.anythink.basead.exoplayer.k.p.f9259b)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean m(long j6, Object obj) {
        return ((byte) ((f36386c.f36383a.getInt(obj, (-4) & j6) >>> ((int) ((j6 & 3) << 3))) & com.anythink.basead.exoplayer.k.p.f9259b)) != 0;
    }

    public static boolean n(Class cls) {
        int i = AbstractC4338e2.f36436a;
        try {
            Class cls2 = f36385b;
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

    public static int o(Class cls) {
        if (f36388e) {
            return f36386c.f36383a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
