package com.anythink.core.express.d;

import android.net.Uri;
import android.text.TextUtils;
import com.anythink.core.common.d.j;
import com.anythink.expressad.foundation.d.d;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f17569a = {"wv_hybrid:", "mraid:", "ssp:", "mvb_hybrid:"};

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f17570b = Pattern.compile("hybrid://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f17571c = Pattern.compile("mraid://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f17572d = Pattern.compile("ssp://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f17573e = Pattern.compile("mv://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: f, reason: collision with root package name */
    private static Map<String, String> f17574f = new HashMap();

    static {
        for (c cVar : c.values()) {
            f17574f.put(cVar.a(), cVar.b());
        }
    }

    public static boolean a(String str) {
        for (String str2 : f17569a) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static Pattern b(String str) {
        if ("wv_hybrid:".equals(str)) {
            return f17573e;
        }
        if ("mraid:".equals(str)) {
            return f17571c;
        }
        if ("ssp:".equals(str)) {
            return f17572d;
        }
        if ("mvb_hybrid:".equals(str)) {
            return f17573e;
        }
        return null;
    }

    public static String c(String str) {
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

    public static boolean d(String str) {
        return e(str).startsWith(d.c.f18635e);
    }

    public static String e(String str) {
        String str2 = f17574f.get(f(str));
        return str2 == null ? "" : str2;
    }

    private static String f(String str) {
        String path;
        int lastIndexOf;
        return (TextUtils.isEmpty(str) || (path = Uri.parse(str).getPath()) == null || (lastIndexOf = path.lastIndexOf(j.f12378z)) == -1) ? "" : path.substring(lastIndexOf + 1);
    }
}
