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
    public static final int f16387a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f16388b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static volatile b f16389c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, a> f16390d = new ConcurrentHashMap();

    private b() {
    }

    public static b a() {
        if (f16389c == null) {
            synchronized (b.class) {
                try {
                    if (f16389c == null) {
                        f16389c = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16389c;
    }

    private a c(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return new com.anythink.core.common.s.b.b();
        }
        if (context instanceof Activity) {
            context = context.getApplicationContext();
        }
        a aVar = this.f16390d.get(str);
        if (aVar != null) {
            return aVar;
        }
        a d2 = d(context, str);
        this.f16390d.put(str, d2);
        return d2;
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
        return str.endsWith(u.a.f12833m) || str.endsWith(u.a.f12832l);
    }

    private void a(Context context) {
        String[] strArr = {u.b.f12847a, u.b.f12848b, u.b.f12849c, u.b.f12851e, u.b.f12853g, u.b.f12854h, u.b.i, u.b.f12855j, u.b.f12856k, u.b.f12857l, u.b.f12858m, u.b.f12859n, u.b.f12860o, "anythink_app_pl_cl_retry"};
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
