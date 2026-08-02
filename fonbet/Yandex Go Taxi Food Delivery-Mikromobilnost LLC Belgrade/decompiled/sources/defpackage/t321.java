package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes11.dex */
public final class t321 extends w321 {
    public t321(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.w321
    public final void c(long j, byte[] bArr, long j2) {
        this.a.copyMemory((Object) null, j, bArr, z321.f, j2);
    }

    @Override // defpackage.w321
    public final boolean d(long j, Object obj) {
        return this.a.getBoolean(obj, j);
    }

    @Override // defpackage.w321
    public final byte e(long j) {
        return this.a.getByte(j);
    }

    @Override // defpackage.w321
    public final byte f(long j, Object obj) {
        return this.a.getByte(obj, j);
    }

    @Override // defpackage.w321
    public final double g(long j, Object obj) {
        return this.a.getDouble(obj, j);
    }

    @Override // defpackage.w321
    public final float h(long j, Object obj) {
        return this.a.getFloat(obj, j);
    }

    @Override // defpackage.w321
    public final void m(Object obj, long j, boolean z) {
        this.a.putBoolean(obj, j, z);
    }

    @Override // defpackage.w321
    public final void n(Object obj, long j, byte b) {
        this.a.putByte(obj, j, b);
    }

    @Override // defpackage.w321
    public final void o(Object obj, long j, double d) {
        this.a.putDouble(obj, j, d);
    }

    @Override // defpackage.w321
    public final void p(Object obj, long j, float f) {
        this.a.putFloat(obj, j, f);
    }

    @Override // defpackage.w321
    public final boolean t() {
        if (!super.t()) {
            return false;
        }
        try {
            Class<?> cls = this.a.getClass();
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
            z321.a(th);
            return false;
        }
    }

    @Override // defpackage.w321
    public final boolean u() {
        Unsafe unsafe = this.a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (z321.e() != null) {
                    try {
                        Class<?> cls3 = this.a.getClass();
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
                        z321.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                z321.a(th2);
            }
        }
        return false;
    }
}
