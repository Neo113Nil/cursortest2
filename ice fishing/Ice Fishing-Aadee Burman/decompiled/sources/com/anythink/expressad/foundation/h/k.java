package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f19630a = "layout";

    /* renamed from: b, reason: collision with root package name */
    public static final String f19631b = "id";

    /* renamed from: c, reason: collision with root package name */
    public static final String f19632c = "drawable";

    /* renamed from: d, reason: collision with root package name */
    public static final String f19633d = "color";

    /* renamed from: e, reason: collision with root package name */
    public static final String f19634e = "style";

    /* renamed from: f, reason: collision with root package name */
    public static final String f19635f = "anim";

    /* renamed from: g, reason: collision with root package name */
    public static final String f19636g = "string";

    /* renamed from: h, reason: collision with root package name */
    public static final int f19637h = -1;
    private static final String i = "ResourceUtil";

    public static Resources a(Context context) {
        if (context != null) {
            try {
                return context.getResources();
            } catch (Exception e9) {
                e9.getMessage();
            }
        }
        return null;
    }

    public static int a(Context context, String str, String str2) {
        if (context == null) {
            return -1;
        }
        try {
            String a9 = com.anythink.expressad.foundation.b.a.c().a();
            int identifier = !TextUtils.isEmpty(a9) ? context.getResources().getIdentifier(str, str2, a9) : -1;
            if (identifier > 0) {
                return identifier;
            }
            String str3 = "";
            try {
                str3 = com.anythink.expressad.foundation.b.a.c().b();
            } catch (Exception unused) {
            }
            if (y.a(str3)) {
                str3 = context.getPackageName();
            }
            if (y.a(str3)) {
                return -1;
            }
            return context.getResources().getIdentifier(str, str2, str3);
        } catch (Exception unused2) {
            return -1;
        }
    }
}
