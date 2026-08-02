package com.anythink.expressad.video.dynview.b;

import android.view.View;
import com.anythink.expressad.video.dynview.c;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f21924a;

    private b() {
    }

    public static b a() {
        b bVar;
        if (f21924a != null) {
            return f21924a;
        }
        synchronized (b.class) {
            try {
                if (f21924a == null) {
                    f21924a = new b();
                }
                bVar = f21924a;
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
        if (f21924a != null) {
            f21924a = null;
        }
    }

    private static void c(View view, c cVar) {
        new com.anythink.expressad.video.dynview.j.b().b(view, cVar);
    }

    public static void a(View view, c cVar) {
        if (cVar == null) {
            return;
        }
        int h3 = cVar.h();
        if (h3 == 1) {
            new com.anythink.expressad.video.dynview.j.b().a(view);
            return;
        }
        if (h3 == 2) {
            new com.anythink.expressad.video.dynview.j.b().a(view, cVar);
            return;
        }
        if (h3 == 3) {
            new com.anythink.expressad.video.dynview.j.b().b(view, cVar);
        } else if (h3 == 4) {
            new com.anythink.expressad.video.dynview.j.b().c(view, cVar);
        } else {
            if (h3 != 5) {
                return;
            }
            new com.anythink.expressad.video.dynview.j.b();
        }
    }

    private static void a(View view) {
        new com.anythink.expressad.video.dynview.j.b().a(view);
    }
}
