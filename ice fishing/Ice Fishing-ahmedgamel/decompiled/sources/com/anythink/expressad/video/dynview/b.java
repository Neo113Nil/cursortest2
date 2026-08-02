package com.anythink.expressad.video.dynview;

import android.content.Context;
import android.view.View;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.video.dynview.f.h;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static volatile b f21920b;

    /* renamed from: a, reason: collision with root package name */
    public Map<String, SoftReference<View>> f21921a = new HashMap();

    private b() {
    }

    public static b a() {
        b bVar;
        if (f21920b != null) {
            return f21920b;
        }
        synchronized (b.class) {
            try {
                if (f21920b == null) {
                    f21920b = new b();
                }
                bVar = f21920b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    private static void b() {
    }

    private static void c() {
        com.anythink.expressad.video.dynview.b.b.a();
        com.anythink.expressad.video.dynview.b.b.b();
        com.anythink.expressad.video.dynview.b.a.a();
        com.anythink.expressad.video.dynview.b.a.c();
    }

    public static void a(Context context, List<d> list, h hVar, Map<String, Object> map) {
        new com.anythink.expressad.video.dynview.h.a(context, list, hVar, map);
    }

    public static void a(c cVar, h hVar) {
        new com.anythink.expressad.video.dynview.h.a(cVar, hVar, new HashMap());
    }

    public static void a(c cVar, h hVar, Map<String, Object> map) {
        new com.anythink.expressad.video.dynview.h.a(cVar, hVar, map);
    }
}
