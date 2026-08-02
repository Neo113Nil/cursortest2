package N6;

import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2101a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f2102b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f2103c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2104d;

    static {
        long a9 = a(byte[].class, "value");
        f2101a = a9;
        long a10 = a(Byte.TYPE, "coder");
        f2102b = a10;
        f2103c = v.f2100a ? v.a() : -1;
        f2104d = (a9 == -1 || a10 == -1) ? false : true;
    }

    public static long a(Class cls, String str) {
        if (!v.f2100a) {
            return -1L;
        }
        try {
            Field declaredField = String.class.getDeclaredField(str);
            if (declaredField.getType() != cls) {
                return -1L;
            }
            return v.e(declaredField);
        } catch (Exception unused) {
            return -1L;
        }
    }
}
