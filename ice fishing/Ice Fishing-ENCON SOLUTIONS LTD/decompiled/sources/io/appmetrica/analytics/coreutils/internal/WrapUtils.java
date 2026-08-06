package io.appmetrica.analytics.coreutils.internal;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class WrapUtils {
    public static double getFiniteDoubleOrDefault(double d2, double d3) {
        return Double.isFinite(d2) ? d2 : d3;
    }

    public static double getFiniteDoubleOrDefaultNullable(Double d2, double d3) {
        return d2 == null ? d3 : getFiniteDoubleOrDefault(d2.doubleValue(), d3);
    }

    public static long getMillisOrDefault(Long l2, TimeUnit timeUnit, long j2) {
        return l2 == null ? j2 : timeUnit.toMillis(l2.longValue());
    }

    public static <T> T getOrDefault(T t, T t2) {
        return t == null ? t2 : t;
    }

    public static String getOrDefaultIfEmpty(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static <T> T getOrDefaultNullable(T t, T t2) {
        return t == null ? t2 : t;
    }

    public static String getOrDefaultNullableIfEmpty(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static <T> String wrapToTag(T t) {
        return t == null ? "<null>" : t.toString().isEmpty() ? "<empty>" : t.toString();
    }
}
