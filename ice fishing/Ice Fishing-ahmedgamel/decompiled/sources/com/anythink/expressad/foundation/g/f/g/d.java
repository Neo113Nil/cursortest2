package com.anythink.expressad.foundation.g.f.g;

import android.text.TextUtils;
import com.anythink.expressad.foundation.h.y;
import com.anythink.expressad.foundation.h.z;
import java.util.List;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20135a = "d";

    public static String a(List<com.anythink.expressad.foundation.g.f.c.c> list) {
        com.anythink.expressad.foundation.g.f.c.c b9 = b(list, "Content-Type");
        if (b9 == null) {
            return "UTF-8";
        }
        String b10 = b9.b();
        if (TextUtils.isEmpty(b10)) {
            return "UTF-8";
        }
        String[] split = b10.split(";");
        for (int i = 1; i < split.length; i++) {
            String[] split2 = split[i].trim().split("=");
            if (split2.length == 2 && split2[0].equals("charset")) {
                return split2[1];
            }
        }
        return "UTF-8";
    }

    private static com.anythink.expressad.foundation.g.f.c.c b(List<com.anythink.expressad.foundation.g.f.c.c> list, String str) {
        if (list == null) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            com.anythink.expressad.foundation.g.f.c.c cVar = list.get(i);
            if (cVar != null && str.equals(cVar.a())) {
                return cVar;
            }
        }
        return null;
    }

    private static boolean c(List<com.anythink.expressad.foundation.g.f.c.c> list) {
        if (TextUtils.equals(a(list, "Accept-Ranges"), "bytes")) {
            return true;
        }
        String a9 = a(list, "Content-Range");
        return a9 != null && a9.startsWith("bytes");
    }

    public static boolean b(List<com.anythink.expressad.foundation.g.f.c.c> list) {
        return TextUtils.equals(a(list, "Content-Encoding"), b.f20128d);
    }

    public static String a(List<com.anythink.expressad.foundation.g.f.c.c> list, String str) {
        com.anythink.expressad.foundation.g.f.c.c b9 = b(list, str);
        if (b9 != null) {
            return b9.b();
        }
        return "";
    }

    private static void a(com.anythink.expressad.foundation.g.f.h.b bVar, String str, String str2) {
        if (bVar != null) {
            try {
                if (!y.a(str) && !y.a(str2)) {
                    bVar.a(str, str2);
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    private static void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.startsWith("http")) {
                str = z.a(str);
            }
            TextUtils.isEmpty(str);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
