package com.anythink.expressad.video.dynview.b;

import android.view.View;
import com.anythink.expressad.video.dynview.c;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f21137a;

    private b() {
    }

    public static b a() {
        b bVar;
        if (f21137a != null) {
            return f21137a;
        }
        synchronized (b.class) {
            try {
                if (f21137a == null) {
                    f21137a = new b();
                }
                bVar = f21137a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    private static void b(View view, c cVar) {
        new com.anythink.expressad.video.dynview.j.b().a(view, cVar);
    }

    private static void c() {
        new com.anythink.expressad.video.dynview.j.b();
    }

    private static void d(View view, c cVar) {
        new com.anythink.expressad.video.dynview.j.b().c(view, cVar);
    }

    public static void b() {
        if (f21137a != null) {
            f21137a = null;
        }
    }

    private static void c(View view, c cVar) {
        new com.anythink.expressad.video.dynview.j.b().b(view, cVar);
    }

    public static void a(View view, c cVar) {
        if (cVar == null) {
            return;
        }
        int h9 = cVar.h();
        if (h9 == 1) {
            new com.anythink.expressad.video.dynview.j.b().a(view);
            return;
        }
        if (h9 == 2) {
            new com.anythink.expressad.video.dynview.j.b().a(view, cVar);
            return;
        }
        if (h9 == 3) {
            new com.anythink.expressad.video.dynview.j.b().b(view, cVar);
        } else if (h9 == 4) {
            new com.anythink.expressad.video.dynview.j.b().c(view, cVar);
        } else {
            if (h9 != 5) {
                return;
            }
            new com.anythink.expressad.video.dynview.j.b();
        }
    }

    private static void a(View view) {
        new com.anythink.expressad.video.dynview.j.b().a(view);
    }
}
