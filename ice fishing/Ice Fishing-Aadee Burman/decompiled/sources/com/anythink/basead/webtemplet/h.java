package com.anythink.basead.webtemplet;

import android.net.Uri;
import android.text.TextUtils;
import com.anythink.expressad.foundation.d.d;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11510a = "atwt:";

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f11511b = {f11510a};

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f11512c = Pattern.compile("atwt://(.+?)#(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: d, reason: collision with root package name */
    private static Map<String, String> f11513d = new HashMap();

    static {
        for (com.anythink.core.express.d.c cVar : com.anythink.core.express.d.c.values()) {
            f11513d.put(cVar.a(), cVar.b());
        }
    }

    public static boolean a(String str) {
        for (String str2 : f11511b) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static Pattern b(String str) {
        if (f11510a.equals(str)) {
            return f11512c;
        }
        return null;
    }

    public static boolean c(String str) {
        return d(str).startsWith(d.c.f18635e);
    }

    public static String d(String str) {
        String str2 = f11513d.get(h(str));
        return str2 == null ? "" : str2;
    }

    public static String e(String str) {
        return TextUtils.isEmpty(str) ? str : com.anythink.core.common.v.k.a(str);
    }

    public static String f(String str) {
        return TextUtils.isEmpty(str) ? str : com.anythink.core.common.v.k.b(str);
    }

    private static String g(String str) {
        char[] cArr = {'\'', '\\'};
        StringBuffer stringBuffer = new StringBuffer(1000);
        stringBuffer.setLength(0);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 255) {
                int i6 = 0;
                while (true) {
                    if (i6 >= 2) {
                        stringBuffer.append(charAt);
                        break;
                    }
                    if (cArr[i6] == charAt) {
                        stringBuffer.append("\\".concat(String.valueOf(charAt)));
                        break;
                    }
                    i6++;
                }
            } else {
                stringBuffer.append("\\u");
                String upperCase = Integer.toHexString(charAt >>> '\b').toUpperCase();
                if (upperCase.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase);
                String upperCase2 = Integer.toHexString(charAt & 255).toUpperCase();
                if (upperCase2.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase2);
            }
        }
        return new String(stringBuffer);
    }

    private static String h(String str) {
        String path;
        int lastIndexOf;
        return (TextUtils.isEmpty(str) || (path = Uri.parse(str).getPath()) == null || (lastIndexOf = path.lastIndexOf(com.anythink.core.common.d.j.f12378z)) == -1) ? "" : path.substring(lastIndexOf + 1);
    }
}
