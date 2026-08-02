package com.anythink.expressad.foundation.h;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.net.URL;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20525a = "UriUtil";

    public static String a(String str) {
        try {
            return (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) ? "" : new URL(str).getHost();
        } catch (Exception e9) {
            e9.getMessage();
            return "";
        }
    }

    public static String b(String str) {
        try {
            return (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) ? str : new URL(str).getPath();
        } catch (Exception e9) {
            e9.printStackTrace();
            return "";
        }
    }

    public static int c(String str) {
        try {
            if (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) {
                return 0;
            }
            return Uri.parse(str).getQueryParameterNames().size();
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0;
        }
    }

    public static String d(String str) {
        try {
            if (!TextUtils.isEmpty(str) && !str.contains("n_logo=0")) {
                HashMap hashMap = new HashMap();
                hashMap.put("n_logo", "0");
                return l.a(str, hashMap);
            }
            return str;
        } catch (Throwable unused) {
            return str;
        }
    }

    public static String a(String str, String str2) {
        try {
            return (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) ? str : Uri.parse(str).getQueryParameter(str2);
        } catch (Exception e9) {
            e9.printStackTrace();
            return "";
        }
    }
}
