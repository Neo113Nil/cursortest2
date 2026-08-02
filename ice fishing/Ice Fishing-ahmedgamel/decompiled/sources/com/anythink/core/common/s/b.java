package com.anythink.core.common.s;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.d.u;
import com.anythink.core.common.s.b.d;
import com.anythink.core.common.s.b.e;
import com.anythink.core.common.s.c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f17174a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f17175b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static volatile b f17176c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, a> f17177d = new ConcurrentHashMap();

    private b() {
    }

    public static b a() {
        if (f17176c == null) {
            synchronized (b.class) {
                try {
                    if (f17176c == null) {
                        f17176c = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17176c;
    }

    private a c(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return new com.anythink.core.common.s.b.b();
        }
        if (context instanceof Activity) {
            context = context.getApplicationContext();
        }
        a aVar = this.f17177d.get(str);
        if (aVar != null) {
            return aVar;
        }
        a d9 = d(context, str);
        this.f17177d.put(str, d9);
        return d9;
    }

    private static a d(Context context, String str) {
        return d.c(new c.a().a(context).a(str).b(1).a(1).a());
    }

    public final a b(Context context, String str) {
        return c(context, str);
    }

    private static boolean b(String str) {
        return !a(str);
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.endsWith(u.a.f13619m) || str.endsWith(u.a.f13618l);
    }

    private void a(Context context) {
        String[] strArr = {u.b.f13633a, u.b.f13634b, u.b.f13635c, u.b.f13637e, u.b.f13639g, u.b.f13640h, u.b.i, u.b.f13641j, u.b.f13642k, u.b.f13643l, u.b.f13644m, u.b.f13645n, u.b.f13646o, "anythink_app_pl_cl_retry"};
        for (int i = 0; i < 14; i++) {
            a c9 = c(context, strArr[i]);
            if (c9 instanceof e) {
                ((e) c9).c();
            }
        }
    }

    public final a a(Context context, String str) {
        return c(context, str);
    }
}
