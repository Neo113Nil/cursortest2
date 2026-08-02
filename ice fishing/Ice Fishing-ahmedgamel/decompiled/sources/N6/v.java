package N6;

import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f2100a;

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        double parseDouble;
        String property = System.getProperty("java.specification.version");
        if (property != null) {
            try {
                parseDouble = Double.parseDouble(property);
            } catch (NumberFormatException unused) {
            }
            boolean z6 = false;
            if (Boolean.parseBoolean(k6.d.b("otel.java.experimental.exporter.unsafe.enabled", (parseDouble != -1.0d || parseDouble > 22.0d) ? "false" : "true"))) {
                try {
                    Class.forName("sun.misc.Unsafe", false, v.class.getClassLoader());
                    if (u.f2099a != null) {
                        z6 = true;
                    }
                } catch (ClassNotFoundException unused2) {
                }
            }
            f2100a = z6;
        }
        parseDouble = -1.0d;
        boolean z62 = false;
        if (Boolean.parseBoolean(k6.d.b("otel.java.experimental.exporter.unsafe.enabled", (parseDouble != -1.0d || parseDouble > 22.0d) ? "false" : "true"))) {
        }
        f2100a = z62;
    }

    public static int a() {
        return u.f2099a.arrayBaseOffset(byte[].class);
    }

    public static byte b(String str, long j6) {
        return u.f2099a.getByte(str, j6);
    }

    public static long c(long j6, Object obj) {
        return u.f2099a.getLong(obj, j6);
    }

    public static Object d(String str, long j6) {
        return u.f2099a.getObject(str, j6);
    }

    public static long e(Field field) {
        return u.f2099a.objectFieldOffset(field);
    }
}
