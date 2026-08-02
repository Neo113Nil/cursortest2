package com.anythink.expressad.out;

import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class l implements com.anythink.expressad.g.b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f20841a = 6;

    /* renamed from: b, reason: collision with root package name */
    public static final int f20842b = 7;

    /* renamed from: c, reason: collision with root package name */
    public static final int f20843c = 8;

    /* renamed from: d, reason: collision with root package name */
    private static String f20844d = "CustomInfoManager";

    /* renamed from: e, reason: collision with root package name */
    private static volatile l f20845e;

    /* renamed from: f, reason: collision with root package name */
    private ConcurrentHashMap<String, String> f20846f = new ConcurrentHashMap<>();

    private l() {
    }

    public static l a() {
        if (f20845e == null) {
            synchronized (l.class) {
                try {
                    if (f20845e == null) {
                        f20845e = new l();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f20845e;
    }

    private void a(String str, int i, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        String a9 = com.anythink.core.express.a.a.a(str2);
        if (i == 6) {
            this.f20846f.put(str + "_bid", a9);
            return;
        }
        if (i != 7) {
            if (i != 8) {
                return;
            }
            this.f20846f.put(str, a9);
        } else {
            this.f20846f.put(str + "_bidload", a9);
        }
    }

    private String a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (i == 6) {
            return this.f20846f.get(str + "_bid");
        }
        if (i != 7) {
            return i != 8 ? "" : this.f20846f.get(str);
        }
        return this.f20846f.get(str + "_bidload");
    }

    public final String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            Uri parse = Uri.parse(str2);
            if (parse != null) {
                String host = parse.getHost();
                String path = parse.getPath();
                if (!TextUtils.isEmpty(host) && host.contains("hb") && !TextUtils.isEmpty(path) && path.contains(com.anythink.core.common.m.b.g.i)) {
                    return a(str, 6);
                }
                if (!TextUtils.isEmpty(host) && host.contains("hb") && !TextUtils.isEmpty(path) && path.contains("load")) {
                    return a(str, 7);
                }
                if (!TextUtils.isEmpty(path) && path.contains(com.anythink.expressad.foundation.g.a.f19874k)) {
                    return a(str, 8);
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }
}
