package com.anythink.core.common.v;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class af {
    public static void a(Context context, String str) {
        if (context == null) {
            return;
        }
        try {
            com.anythink.core.common.s.b.a().a(context, str).b();
        } catch (Throwable unused) {
        }
    }

    public static void b(Context context, String str, String str2, String str3) {
        if (context == null) {
            return;
        }
        try {
            com.anythink.core.common.s.b.a().a(context, str).a(str2, str3);
        } catch (Throwable unused) {
        }
    }

    public static String c(Context context, String str, String str2, String str3) {
        if (context == null) {
            return null;
        }
        try {
            return (String) com.anythink.core.common.s.b.a().a(context, str).b(str2, str3);
        } catch (Throwable unused) {
            return str3;
        }
    }

    public static void a(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        try {
            com.anythink.core.common.s.b.a().a(context, str).b(str2);
        } catch (Throwable unused) {
        }
    }

    public static long b(Context context, String str, String str2, long j6) {
        if (context != null) {
            try {
                Long l9 = (Long) com.anythink.core.common.s.b.a().a(context, str).b(str2, Long.valueOf(j6));
                if (l9 != null) {
                    return l9.longValue();
                }
            } catch (Throwable unused) {
            }
        }
        return j6;
    }

    public static boolean c(Context context, String str, String str2) {
        if (context == null) {
            return true;
        }
        try {
            Boolean bool = (Boolean) com.anythink.core.common.s.b.a().a(context, str).b(str2, Boolean.TRUE);
            if (bool != null) {
                return bool.booleanValue();
            }
        } catch (Throwable unused) {
        }
        return true;
    }

    public static void a(Context context, String str, String str2, long j6) {
        if (context == null) {
            return;
        }
        try {
            com.anythink.core.common.s.b.a().a(context, str).a(str2, Long.valueOf(j6));
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (context == null) {
            return;
        }
        try {
            com.anythink.core.common.s.b.a().a(context, str).a(str2, str3, 2);
        } catch (Throwable unused) {
        }
    }

    public static int b(Context context, String str, String str2, int i) {
        if (context != null) {
            try {
                return ((Integer) com.anythink.core.common.s.b.a().a(context, str).b(str2, Integer.valueOf(i))).intValue();
            } catch (Throwable unused) {
            }
        }
        return i;
    }

    public static com.anythink.core.common.s.a c(Context context, String str) {
        return com.anythink.core.common.s.b.a().a(context, str);
    }

    public static void a(Context context, String str, String str2, int i) {
        if (context == null) {
            return;
        }
        try {
            com.anythink.core.common.s.b.a().a(context, str).a(str2, Integer.valueOf(i));
        } catch (Throwable unused) {
        }
    }

    public static Map<String, ?> b(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            Map<String, ?> a9 = com.anythink.core.common.s.b.a().a(context, str).a();
            return a9 != null ? a9 : new HashMap();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void b(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        try {
            com.anythink.core.common.s.b.a().a(context, str).a(str2, Boolean.FALSE);
        } catch (Throwable unused) {
        }
    }
}
