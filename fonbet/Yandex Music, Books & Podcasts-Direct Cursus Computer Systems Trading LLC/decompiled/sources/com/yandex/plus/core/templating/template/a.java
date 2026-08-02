package com.yandex.plus.core.templating.template;

import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class a {
    public static final a a = new a();
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public static Character a(long j) {
        if (0 > j || j >= 10) {
            return null;
        }
        return Character.valueOf(b[(int) j]);
    }

    public static BigDecimal b(Object obj) {
        obj.getClass();
        if (obj instanceof Byte) {
            BigDecimal valueOf = BigDecimal.valueOf(((Number) obj).byteValue());
            valueOf.getClass();
            return valueOf;
        }
        if (obj instanceof Short) {
            BigDecimal valueOf2 = BigDecimal.valueOf(((Number) obj).shortValue());
            valueOf2.getClass();
            return valueOf2;
        }
        if (obj instanceof Integer) {
            BigDecimal valueOf3 = BigDecimal.valueOf(((Number) obj).intValue());
            valueOf3.getClass();
            return valueOf3;
        }
        if (obj instanceof Long) {
            BigDecimal valueOf4 = BigDecimal.valueOf(((Number) obj).longValue());
            valueOf4.getClass();
            return valueOf4;
        }
        if (obj instanceof Float) {
            return new BigDecimal(String.valueOf(((Number) obj).floatValue()));
        }
        if (obj instanceof Double) {
            return new BigDecimal(String.valueOf(((Number) obj).doubleValue()));
        }
        if (obj instanceof Character) {
            if (kotlin.text.a.a(((Character) obj).charValue()) != null) {
                BigDecimal valueOf5 = BigDecimal.valueOf(r3.intValue());
                valueOf5.getClass();
                return valueOf5;
            }
        } else if (obj instanceof String) {
            String str = (String) obj;
            try {
                if (kotlin.text.b.f(str)) {
                    return new BigDecimal(str);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static BigInteger c(Object obj) {
        obj.getClass();
        if (obj instanceof Byte) {
            BigInteger valueOf = BigInteger.valueOf(((Number) obj).byteValue());
            valueOf.getClass();
            return valueOf;
        }
        if (obj instanceof Short) {
            BigInteger valueOf2 = BigInteger.valueOf(((Number) obj).shortValue());
            valueOf2.getClass();
            return valueOf2;
        }
        if (obj instanceof Integer) {
            BigInteger valueOf3 = BigInteger.valueOf(((Number) obj).intValue());
            valueOf3.getClass();
            return valueOf3;
        }
        if (obj instanceof Long) {
            BigInteger valueOf4 = BigInteger.valueOf(((Number) obj).longValue());
            valueOf4.getClass();
            return valueOf4;
        }
        if (!(obj instanceof Character)) {
            if (obj instanceof String) {
                return kotlin.text.b.g((String) obj);
            }
            return null;
        }
        if (kotlin.text.a.a(((Character) obj).charValue()) == null) {
            return null;
        }
        BigInteger valueOf5 = BigInteger.valueOf(r2.intValue());
        valueOf5.getClass();
        return valueOf5;
    }

    public static Boolean d(Object obj) {
        obj.getClass();
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            return StringsKt.p0((String) obj);
        }
        return null;
    }

    public static Byte e(Object obj) {
        Integer q0;
        int intValue;
        obj.getClass();
        if (obj instanceof Byte) {
            return (Byte) obj;
        }
        if (obj instanceof Character) {
            Integer a2 = kotlin.text.a.a(((Character) obj).charValue());
            if (a2 != null) {
                return Byte.valueOf((byte) a2.intValue());
            }
            return null;
        }
        if (!(obj instanceof String) || (q0 = StringsKt.q0((String) obj)) == null || (intValue = q0.intValue()) < -128 || intValue > 127) {
            return null;
        }
        return Byte.valueOf((byte) intValue);
    }

    public static Character f(Object obj) {
        obj.getClass();
        if (obj instanceof Byte) {
            return a(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return a(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return a(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return a(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return (Character) obj;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if (str.length() == 1) {
            return Character.valueOf(str.charAt(0));
        }
        return null;
    }

    public static Double g(Object obj) {
        obj.getClass();
        if (obj instanceof Byte) {
            return Double.valueOf(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Double.valueOf(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return Double.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return Double.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (!(obj instanceof Character)) {
            if (obj instanceof String) {
                return kotlin.text.b.h((String) obj);
            }
            return null;
        }
        if (kotlin.text.a.a(((Character) obj).charValue()) != null) {
            return Double.valueOf(r2.intValue());
        }
        return null;
    }

    public static Float h(Object obj) {
        obj.getClass();
        if (obj instanceof Byte) {
            return Float.valueOf(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Float.valueOf(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return Float.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof Float) {
            return (Float) obj;
        }
        if (!(obj instanceof Character)) {
            if (obj instanceof String) {
                return kotlin.text.b.i((String) obj);
            }
            return null;
        }
        if (kotlin.text.a.a(((Character) obj).charValue()) != null) {
            return Float.valueOf(r1.intValue());
        }
        return null;
    }

    public static Integer i(Object obj) {
        obj.getClass();
        if (obj instanceof Byte) {
            return Integer.valueOf(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Integer.valueOf(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Character) {
            return kotlin.text.a.a(((Character) obj).charValue());
        }
        if (obj instanceof String) {
            return StringsKt.toIntOrNull((String) obj);
        }
        return null;
    }

    public static Long j(Object obj) {
        obj.getClass();
        if (obj instanceof Byte) {
            return Long.valueOf(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (!(obj instanceof Character)) {
            if (obj instanceof String) {
                return StringsKt.r0(10, (String) obj);
            }
            return null;
        }
        if (kotlin.text.a.a(((Character) obj).charValue()) != null) {
            return Long.valueOf(r2.intValue());
        }
        return null;
    }

    public static Short k(Object obj) {
        Integer q0;
        int intValue;
        obj.getClass();
        if (obj instanceof Byte) {
            return Short.valueOf(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return (Short) obj;
        }
        if (obj instanceof Character) {
            Integer a2 = kotlin.text.a.a(((Character) obj).charValue());
            if (a2 != null) {
                return Short.valueOf((short) a2.intValue());
            }
            return null;
        }
        if (!(obj instanceof String) || (q0 = StringsKt.q0((String) obj)) == null || (intValue = q0.intValue()) < -32768 || intValue > 32767) {
            return null;
        }
        return Short.valueOf((short) intValue);
    }

    public static String l(Object obj) {
        obj.getClass();
        return obj instanceof String ? (String) obj : obj.toString();
    }
}
