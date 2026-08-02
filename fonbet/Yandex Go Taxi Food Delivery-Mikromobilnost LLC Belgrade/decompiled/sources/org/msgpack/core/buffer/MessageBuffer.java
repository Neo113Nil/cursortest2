package org.msgpack.core.buffer;

import defpackage.ny61;
import defpackage.w511;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public class MessageBuffer {
    public static final boolean e;
    public static final Unsafe f;
    public static final Constructor g;
    public static final int h;
    public final Object a;
    public final long b;
    public final int c;
    public final ByteBuffer d;

    /* JADX WARN: Can't wrap try/catch for region: R(19:2|(3:3|4|5)|(3:74|75|(15:80|8|9|10|11|(1:13)(1:71)|14|(1:69)(1:20)|(3:22|23|(2:25|(1:27)(2:42|43))(2:44|45))(1:68)|28|(3:30|(1:32)|33)|34|(3:39|40|41)|36|37))|7|8|9|10|11|(0)(0)|14|(0)|69|(0)(0)|28|(0)|34|(0)|36|37) */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0054, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c A[Catch: all -> 0x003e, Exception -> 0x0042, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0042, blocks: (B:75:0x0024, B:22:0x008c, B:83:0x0047), top: B:74:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7 A[Catch: Exception -> 0x0104, TRY_ENTER, TryCatch #2 {Exception -> 0x0104, blocks: (B:39:0x00e7, B:40:0x0100, B:67:0x015e, B:51:0x0127), top: B:3:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0127 A[Catch: Exception -> 0x0104, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0104, blocks: (B:39:0x00e7, B:40:0x0100, B:67:0x015e, B:51:0x0127), top: B:3:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006f  */
    static {
        Unsafe unsafe;
        Constructor<?> declaredConstructor;
        String property;
        int indexOf;
        int parseInt;
        int parseInt2;
        boolean z;
        Unsafe unsafe2 = "";
        Class cls = Integer.TYPE;
        String str = "org.msgpack.core.buffer.MessageBufferU";
        boolean z2 = false;
        int i = 16;
        try {
            try {
                try {
                    property = System.getProperty("java.specification.version", "");
                    indexOf = property.indexOf(46);
                } catch (Exception e2) {
                    e2.printStackTrace(System.err);
                    ny61.j(e2);
                    return;
                }
            } catch (Exception e3) {
                e = e3;
                unsafe = null;
            } catch (Throwable th) {
                th = th;
                unsafe2 = null;
                z2 = false;
            }
            if (indexOf != -1) {
                try {
                    try {
                        try {
                            parseInt = Integer.parseInt(property.substring(0, indexOf));
                            parseInt2 = Integer.parseInt(property.substring(indexOf + 1));
                        } catch (NumberFormatException e4) {
                            e4.printStackTrace(System.err);
                        }
                    } catch (Exception e5) {
                        e = e5;
                        unsafe = null;
                        e.printStackTrace(System.err);
                        f = unsafe;
                        h = 16;
                        e = true;
                        if (!"org.msgpack.core.buffer.MessageBuffer".equals("org.msgpack.core.buffer.MessageBufferU")) {
                        }
                        g = null;
                    }
                    if (parseInt > 1 || (parseInt == 1 && parseInt2 >= 7)) {
                        z = true;
                        Class.forName("sun.misc.Unsafe");
                        boolean z3 = true;
                        z2 = (Boolean.parseBoolean(System.getProperty("msgpack.universal-buffer", "false")) && !System.getProperty("java.runtime.name", "").toLowerCase().contains(ConstantDeviceInfo.APP_PLATFORM) && !(System.getProperty("com.google.appengine.runtime.version") == null) && z && z3) ? false : true;
                        if (z2) {
                            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
                            declaredField.setAccessible(true);
                            unsafe = (Unsafe) declaredField.get(null);
                            try {
                                if (unsafe == null) {
                                    throw new RuntimeException("Unsafe is unavailable");
                                }
                                i = unsafe.arrayBaseOffset(byte[].class);
                                int arrayIndexScale = unsafe.arrayIndexScale(byte[].class);
                                if (arrayIndexScale != 1) {
                                    throw new IllegalStateException("Byte array index scale must be 1, but is " + arrayIndexScale);
                                }
                            } catch (Exception e6) {
                                e = e6;
                                e.printStackTrace(System.err);
                                f = unsafe;
                                h = 16;
                                e = true;
                                if (!"org.msgpack.core.buffer.MessageBuffer".equals("org.msgpack.core.buffer.MessageBufferU")) {
                                    Class<?> cls2 = Class.forName("org.msgpack.core.buffer.MessageBufferU");
                                    Constructor<?> declaredConstructor2 = cls2.getDeclaredConstructor(byte[].class, cls, cls);
                                    declaredConstructor2.setAccessible(true);
                                    g = declaredConstructor2;
                                    declaredConstructor = cls2.getDeclaredConstructor(ByteBuffer.class);
                                    declaredConstructor.setAccessible(true);
                                    return;
                                }
                                g = null;
                            }
                        } else {
                            unsafe = null;
                        }
                        f = unsafe;
                        h = i;
                        e = z2;
                        if (!z2) {
                            str = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? "org.msgpack.core.buffer.MessageBuffer" : "org.msgpack.core.buffer.MessageBufferBE";
                        }
                        if (!"org.msgpack.core.buffer.MessageBuffer".equals(str)) {
                            Class<?> cls3 = Class.forName(str);
                            Constructor<?> declaredConstructor3 = cls3.getDeclaredConstructor(byte[].class, cls, cls);
                            declaredConstructor3.setAccessible(true);
                            g = declaredConstructor3;
                            declaredConstructor = cls3.getDeclaredConstructor(ByteBuffer.class);
                            declaredConstructor.setAccessible(true);
                            return;
                        }
                        g = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    unsafe2 = null;
                    f = unsafe2;
                    h = 16;
                    e = z2;
                    if (!z2) {
                        str = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? "org.msgpack.core.buffer.MessageBuffer" : "org.msgpack.core.buffer.MessageBufferBE";
                    }
                    if ("org.msgpack.core.buffer.MessageBuffer".equals(str)) {
                        g = null;
                    } else {
                        Class<?> cls4 = Class.forName(str);
                        Constructor<?> declaredConstructor4 = cls4.getDeclaredConstructor(byte[].class, cls, cls);
                        declaredConstructor4.setAccessible(true);
                        g = declaredConstructor4;
                        cls4.getDeclaredConstructor(ByteBuffer.class).setAccessible(true);
                    }
                    throw th;
                }
            }
            z = false;
            Class.forName("sun.misc.Unsafe");
            boolean z32 = true;
            if (Boolean.parseBoolean(System.getProperty("msgpack.universal-buffer", "false"))) {
            }
            if (z2) {
            }
            f = unsafe;
            h = i;
            e = z2;
            if (!z2) {
            }
            if (!"org.msgpack.core.buffer.MessageBuffer".equals(str)) {
            }
            g = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public MessageBuffer(ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            if (!byteBuffer.hasArray()) {
                ny61.g("Only the array-backed ByteBuffer or DirectBuffer is supported");
                throw null;
            }
            this.a = byteBuffer.array();
            this.b = byteBuffer.position() + byteBuffer.arrayOffset() + h;
            this.c = byteBuffer.remaining();
            this.d = null;
            return;
        }
        if (e) {
            w511.x("Cannot create MessageBuffer from a DirectBuffer on this platform");
            throw null;
        }
        this.a = null;
        try {
            this.b = ((Long) b.a.invoke(byteBuffer, null)).longValue() + byteBuffer.position();
            this.c = byteBuffer.remaining();
            this.d = byteBuffer;
        } catch (IllegalAccessException e2) {
            ny61.j(e2);
            throw null;
        } catch (InvocationTargetException e3) {
            ny61.j(e3);
            throw null;
        }
    }

    public static MessageBuffer a(int i) {
        if (i >= 0) {
            return g(0, i, new byte[i]);
        }
        ny61.g("size must not be negative");
        return null;
    }

    public static MessageBuffer g(int i, int i2, byte[] bArr) {
        Constructor constructor = g;
        if (constructor == null) {
            return new MessageBuffer(bArr, i, i2);
        }
        try {
            return (MessageBuffer) constructor.newInstance(bArr, Integer.valueOf(i), Integer.valueOf(i2));
        } catch (IllegalAccessException e2) {
            ny61.o(e2);
            return null;
        } catch (InstantiationException e3) {
            ny61.o(e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            if (e4.getCause() instanceof Error) {
                throw ((Error) e4.getCause());
            }
            ny61.o(e4.getCause());
            return null;
        }
    }

    public byte b(int i) {
        return f.getByte(this.a, this.b + i);
    }

    public void c(int i, int i2, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < i2) {
            throw new BufferOverflowException();
        }
        byteBuffer.put(m(i, i2));
    }

    public int d(int i) {
        return Integer.reverseBytes(f.getInt(this.a, this.b + i));
    }

    public long e(int i) {
        return Long.reverseBytes(f.getLong(this.a, this.b + i));
    }

    public short f(int i) {
        return Short.reverseBytes(f.getShort(this.a, this.b + i));
    }

    public void h(byte b, int i) {
        f.putByte(this.a, this.b + i, b);
    }

    public void i(int i, int i2, int i3, byte[] bArr) {
        f.copyMemory(bArr, h, this.a, this.b + i, i3);
    }

    public void j(int i, int i2) {
        f.putInt(this.a, this.b + i, Integer.reverseBytes(i2));
    }

    public void k(int i, MessageBuffer messageBuffer, int i2, int i3) {
        f.copyMemory(messageBuffer.a, messageBuffer.b + i2, this.a, this.b + i, i3);
    }

    public void l(int i, short s) {
        f.putShort(this.a, this.b + i, Short.reverseBytes(s));
    }

    public ByteBuffer m(int i, int i2) {
        long j = this.b;
        Object obj = this.a;
        if (obj != null) {
            return ByteBuffer.wrap((byte[]) obj, (int) ((j - h) + i), i2);
        }
        ByteBuffer byteBuffer = this.d;
        Constructor constructor = b.b;
        try {
            int i3 = a.a[b.d.ordinal()];
            if (i3 == 1) {
                return (ByteBuffer) constructor.newInstance(Long.valueOf(j + i), Integer.valueOf(i2), byteBuffer);
            }
            if (i3 == 2) {
                return (ByteBuffer) constructor.newInstance(Long.valueOf(j + i), Integer.valueOf(i2));
            }
            if (i3 == 3) {
                return (ByteBuffer) constructor.newInstance(Integer.valueOf(((int) j) + i), Integer.valueOf(i2));
            }
            if (i3 == 4) {
                return (ByteBuffer) constructor.newInstance(b.e.invoke(null, Long.valueOf(j + i), Integer.valueOf(i2)), Integer.valueOf(i2), 0);
            }
            throw new IllegalStateException("Unexpected value");
        } catch (Throwable th) {
            ny61.j(th);
            return null;
        }
    }

    public MessageBuffer(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = h + i;
        this.c = i2;
        this.d = null;
    }

    public MessageBuffer(Object obj, long j, int i) {
        this.a = obj;
        this.b = j;
        this.c = i;
        this.d = null;
    }
}
