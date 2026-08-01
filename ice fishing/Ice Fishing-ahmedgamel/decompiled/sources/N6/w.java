package N6;

import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2013a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f2014b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f2015c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2016d;

    static {
        long a9 = a(byte[].class, "value");
        f2013a = a9;
        long a10 = a(Byte.TYPE, "coder");
        f2014b = a10;
        f2015c = v.f2012a ? v.a() : -1;
        f2016d = (a9 == -1 || a10 == -1) ? false : true;
    }

    public static long a(Class cls, String str) {
        if (!v.f2012a) {
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
