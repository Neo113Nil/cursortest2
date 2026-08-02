package androidx.glance.appwidget.protobuf;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public abstract class UnsafeUtil {
    public static final long BYTE_ARRAY_BASE_OFFSET;
    public static final boolean HAS_UNSAFE_ARRAY_OPERATIONS;
    public static final boolean HAS_UNSAFE_BYTEBUFFER_OPERATIONS;
    public static final boolean IS_BIG_ENDIAN;
    public static final MemoryAccessor MEMORY_ACCESSOR;
    public static final Class MEMORY_CLASS;
    public static final Unsafe UNSAFE;

    public final class Android32MemoryAccessor extends MemoryAccessor {
        public final /* synthetic */ int $r8$classId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Android32MemoryAccessor(Unsafe unsafe, int i) {
            super(unsafe);
            this.$r8$classId = i;
        }

        @Override // androidx.glance.appwidget.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean getBoolean(Object obj, long j) {
            switch (this.$r8$classId) {
                case 0:
                    if (!UnsafeUtil.IS_BIG_ENDIAN) {
                        break;
                    } else {
                        break;
                    }
                default:
                    if (!UnsafeUtil.IS_BIG_ENDIAN) {
                        break;
                    } else {
                        break;
                    }
            }
            return UnsafeUtil.access$700(obj, j);
        }

        @Override // androidx.glance.appwidget.protobuf.UnsafeUtil.MemoryAccessor
        public final double getDouble(Object obj, long j) {
            switch (this.$r8$classId) {
            }
            return Double.longBitsToDouble(getLong(obj, j));
        }

        @Override // androidx.glance.appwidget.protobuf.UnsafeUtil.MemoryAccessor
        public final float getFloat(Object obj, long j) {
            switch (this.$r8$classId) {
            }
            return Float.intBitsToFloat(getInt(obj, j));
        }

        @Override // androidx.glance.appwidget.protobuf.UnsafeUtil.MemoryAccessor
        public final void putBoolean(Object obj, long j, boolean z) {
            switch (this.$r8$classId) {
                case 0:
                    if (!UnsafeUtil.IS_BIG_ENDIAN) {
                        UnsafeUtil.putByteLittleEndian(obj, j, z ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        UnsafeUtil.putByteBigEndian(obj, j, z ? (byte) 1 : (byte) 0);
                        break;
                    }
                default:
                    if (!UnsafeUtil.IS_BIG_ENDIAN) {
                        UnsafeUtil.putByteLittleEndian(obj, j, z ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        UnsafeUtil.putByteBigEndian(obj, j, z ? (byte) 1 : (byte) 0);
                        break;
                    }
            }
        }

        @Override // androidx.glance.appwidget.protobuf.UnsafeUtil.MemoryAccessor
        public final void putByte(Object obj, long j, byte b) {
            switch (this.$r8$classId) {
                case 0:
                    if (!UnsafeUtil.IS_BIG_ENDIAN) {
                        UnsafeUtil.putByteLittleEndian(obj, j, b);
                        break;
                    } else {
                        UnsafeUtil.putByteBigEndian(obj, j, b);
                        break;
                    }
                default:
                    if (!UnsafeUtil.IS_BIG_ENDIAN) {
                        UnsafeUtil.putByteLittleEndian(obj, j, b);
                        break;
                    } else {
                        UnsafeUtil.putByteBigEndian(obj, j, b);
                        break;
                    }
            }
        }

        @Override // androidx.glance.appwidget.protobuf.UnsafeUtil.MemoryAccessor
        public final void putDouble(Object obj, long j, double d) {
            switch (this.$r8$classId) {
                case 0:
                    putLong(obj, j, Double.doubleToLongBits(d));
                    break;
                default:
                    putLong(obj, j, Double.doubleToLongBits(d));
                    break;
            }
        }

        @Override // androidx.glance.appwidget.protobuf.UnsafeUtil.MemoryAccessor
        public final void putFloat(Object obj, long j, float f) {
            switch (this.$r8$classId) {
                case 0:
                    putInt(obj, j, Float.floatToIntBits(f));
                    break;
                default:
                    putInt(obj, j, Float.floatToIntBits(f));
                    break;
            }
        }

        @Override // androidx.glance.appwidget.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean supportsUnsafeByteBufferOperations() {
            switch (this.$r8$classId) {
            }
            return false;
        }
    }

    public final class JvmMemoryAccessor extends MemoryAccessor {
        @Override // androidx.glance.appwidget.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean getBoolean(Object obj, long j) {
            return this.unsafe.getBoolean(obj, j);
        }

        @Override // androidx.glance.appwidget.protobuf.UnsafeUtil.MemoryAccessor
        public final double getDouble(Object obj, long j) {
            return this.unsafe.getDouble(obj, j);
        }

        @Override // androidx.glance.appwidget.protobuf.UnsafeUtil.MemoryAccessor
        public final float getFloat(Object obj, long j) {
            return this.unsafe.getFloat(obj, j);
        }

        @Override // androidx.glance.appwidget.protobuf.UnsafeUtil.MemoryAccessor
        public final void putBoolean(Object obj, long j, boolean z) {
            this.unsafe.putBoolean(obj, j, z);
        }

        @Override // androidx.glance.appwidget.protobuf.UnsafeUtil.MemoryAccessor
        public final void putByte(Object obj, long j, byte b) {
            this.unsafe.putByte(obj, j, b);
        }

        @Override // androidx.glance.appwidget.protobuf.UnsafeUtil.MemoryAccessor
        public final void putDouble(Object obj, long j, double d) {
            this.unsafe.putDouble(obj, j, d);
        }

        @Override // androidx.glance.appwidget.protobuf.UnsafeUtil.MemoryAccessor
        public final void putFloat(Object obj, long j, float f) {
            this.unsafe.putFloat(obj, j, f);
        }

        @Override // androidx.glance.appwidget.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean supportsUnsafeArrayOperations() {
            if (!super.supportsUnsafeArrayOperations()) {
                return false;
            }
            try {
                Class<?> cls = this.unsafe.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                UnsafeUtil.access$000(th);
                return false;
            }
        }

        @Override // androidx.glance.appwidget.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean supportsUnsafeByteBufferOperations() {
            Unsafe unsafe = this.unsafe;
            if (unsafe != null) {
                try {
                    Class<?> cls = unsafe.getClass();
                    cls.getMethod("objectFieldOffset", Field.class);
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getLong", Object.class, cls2);
                    if (UnsafeUtil.bufferAddressField() != null) {
                        try {
                            Class<?> cls3 = this.unsafe.getClass();
                            cls3.getMethod("getByte", cls2);
                            cls3.getMethod("putByte", cls2, Byte.TYPE);
                            cls3.getMethod("getInt", cls2);
                            cls3.getMethod("putInt", cls2, Integer.TYPE);
                            cls3.getMethod("getLong", cls2);
                            cls3.getMethod("putLong", cls2, cls2);
                            cls3.getMethod("copyMemory", cls2, cls2, cls2);
                            cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                            return true;
                        } catch (Throwable th) {
                            UnsafeUtil.access$000(th);
                            return false;
                        }
                    }
                } catch (Throwable th2) {
                    UnsafeUtil.access$000(th2);
                }
            }
            return false;
        }
    }

    public abstract class MemoryAccessor {
        public final Unsafe unsafe;

        public MemoryAccessor(Unsafe unsafe) {
            this.unsafe = unsafe;
        }

        public final int arrayBaseOffset(Class cls) {
            return this.unsafe.arrayBaseOffset(cls);
        }

        public final int arrayIndexScale(Class cls) {
            return this.unsafe.arrayIndexScale(cls);
        }

        public abstract boolean getBoolean(Object obj, long j);

        public abstract double getDouble(Object obj, long j);

        public abstract float getFloat(Object obj, long j);

        public final int getInt(Object obj, long j) {
            return this.unsafe.getInt(obj, j);
        }

        public final long getLong(Object obj, long j) {
            return this.unsafe.getLong(obj, j);
        }

        public final Object getObject(Object obj, long j) {
            return this.unsafe.getObject(obj, j);
        }

        public final long objectFieldOffset(Field field) {
            return this.unsafe.objectFieldOffset(field);
        }

        public abstract void putBoolean(Object obj, long j, boolean z);

        public abstract void putByte(Object obj, long j, byte b);

        public abstract void putDouble(Object obj, long j, double d);

        public abstract void putFloat(Object obj, long j, float f);

        public final void putInt(Object obj, long j, int i) {
            this.unsafe.putInt(obj, j, i);
        }

        public final void putLong(Object obj, long j, long j2) {
            this.unsafe.putLong(obj, j, j2);
        }

        public final void putObject(Object obj, long j, Object obj2) {
            this.unsafe.putObject(obj, j, obj2);
        }

        public boolean supportsUnsafeArrayOperations() {
            Unsafe unsafe = this.unsafe;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                UnsafeUtil.access$000(th);
                return false;
            }
        }

        public abstract boolean supportsUnsafeByteBufferOperations();
    }

    static {
        Unsafe unsafe = getUnsafe();
        UNSAFE = unsafe;
        MEMORY_CLASS = Android.MEMORY_CLASS;
        boolean determineAndroidSupportByAddressSize = determineAndroidSupportByAddressSize(Long.TYPE);
        boolean determineAndroidSupportByAddressSize2 = determineAndroidSupportByAddressSize(Integer.TYPE);
        char c = 1;
        int i = 0;
        MemoryAccessor memoryAccessor = null;
        if (unsafe != null) {
            if (!Android.isOnAndroidDevice()) {
                memoryAccessor = new JvmMemoryAccessor(unsafe);
            } else if (determineAndroidSupportByAddressSize) {
                memoryAccessor = new Android32MemoryAccessor(unsafe, c == true ? 1 : 0);
            } else if (determineAndroidSupportByAddressSize2) {
                memoryAccessor = new Android32MemoryAccessor(unsafe, i);
            }
        }
        MEMORY_ACCESSOR = memoryAccessor;
        HAS_UNSAFE_BYTEBUFFER_OPERATIONS = memoryAccessor == null ? false : memoryAccessor.supportsUnsafeByteBufferOperations();
        HAS_UNSAFE_ARRAY_OPERATIONS = memoryAccessor == null ? false : memoryAccessor.supportsUnsafeArrayOperations();
        BYTE_ARRAY_BASE_OFFSET = arrayBaseOffset(byte[].class);
        arrayBaseOffset(boolean[].class);
        arrayIndexScale(boolean[].class);
        arrayBaseOffset(int[].class);
        arrayIndexScale(int[].class);
        arrayBaseOffset(long[].class);
        arrayIndexScale(long[].class);
        arrayBaseOffset(float[].class);
        arrayIndexScale(float[].class);
        arrayBaseOffset(double[].class);
        arrayIndexScale(double[].class);
        arrayBaseOffset(Object[].class);
        arrayIndexScale(Object[].class);
        Field bufferAddressField = bufferAddressField();
        if (bufferAddressField != null && memoryAccessor != null) {
            memoryAccessor.objectFieldOffset(bufferAddressField);
        }
        IS_BIG_ENDIAN = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void access$000(Throwable th) {
        Logger.getLogger(UnsafeUtil.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean access$600(Object obj, long j) {
        return ((byte) ((MEMORY_ACCESSOR.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static boolean access$700(Object obj, long j) {
        return ((byte) ((MEMORY_ACCESSOR.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static Object allocateInstance(Class cls) {
        try {
            return UNSAFE.allocateInstance(cls);
        } catch (InstantiationException e) {
            OptionalProvider$$ExternalSyntheticLambda0.m(e);
            return null;
        }
    }

    public static int arrayBaseOffset(Class cls) {
        if (HAS_UNSAFE_ARRAY_OPERATIONS) {
            return MEMORY_ACCESSOR.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void arrayIndexScale(Class cls) {
        if (HAS_UNSAFE_ARRAY_OPERATIONS) {
            MEMORY_ACCESSOR.arrayIndexScale(cls);
        }
    }

    public static Field bufferAddressField() {
        Field field;
        Field field2;
        if (Android.isOnAndroidDevice()) {
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

    public static boolean determineAndroidSupportByAddressSize(Class cls) {
        if (!Android.isOnAndroidDevice()) {
            return false;
        }
        try {
            Class cls2 = MEMORY_CLASS;
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

    public static Unsafe getUnsafe() {
        try {
            return (Unsafe) AccessController.doPrivileged(new AnonymousClass1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void putByte(byte[] bArr, long j, byte b) {
        MEMORY_ACCESSOR.putByte(bArr, BYTE_ARRAY_BASE_OFFSET + j, b);
    }

    public static void putByteBigEndian(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = MEMORY_ACCESSOR.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    public static void putByteLittleEndian(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        putInt(obj, j2, ((255 & b) << i) | (MEMORY_ACCESSOR.getInt(obj, j2) & (~(255 << i))));
    }

    public static void putInt(Object obj, long j, int i) {
        MEMORY_ACCESSOR.putInt(obj, j, i);
    }

    public static void putLong(Object obj, long j, long j2) {
        MEMORY_ACCESSOR.putLong(obj, j, j2);
    }

    public static void putObject(Object obj, long j, Object obj2) {
        MEMORY_ACCESSOR.putObject(obj, j, obj2);
    }

    /* renamed from: androidx.glance.appwidget.protobuf.UnsafeUtil$1, reason: invalid class name */
    public final class AnonymousClass1 implements PrivilegedExceptionAction {
        public static Unsafe run() {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Object run() {
            return run();
        }
    }
}
