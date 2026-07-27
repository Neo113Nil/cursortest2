package com.anythink.expressad.videocommon.b;

import android.text.TextUtils;
import com.anythink.core.common.d.t;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f22213a;

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.core.common.res.b.c f22214b = com.anythink.core.common.res.b.c.a();

    private a() {
    }

    public static a a() {
        if (f22213a == null) {
            synchronized (a.class) {
                try {
                    if (f22213a == null) {
                        f22213a = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f22213a;
    }

    public static com.anythink.core.common.a.n b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return com.anythink.core.common.a.o.a().a(str);
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return com.anythink.core.common.res.d.a(t.b().g()).c(4, com.anythink.core.common.v.o.a(str));
    }
}
