package com.anythink.expressad.video.dynview.b;

import android.view.View;
import com.anythink.expressad.video.dynview.c;
import com.anythink.expressad.video.dynview.f.e;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static volatile a f21922b;

    /* renamed from: a, reason: collision with root package name */
    public com.anythink.expressad.video.dynview.e.a f21923a;

    private a() {
    }

    public static a a() {
        a aVar;
        if (f21922b != null) {
            return f21922b;
        }
        synchronized (a.class) {
            try {
                if (f21922b == null) {
                    f21922b = new a();
                }
                aVar = f21922b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    private static void b(c cVar, View view, Map map, e eVar) {
        new com.anythink.expressad.video.dynview.j.a().b(cVar, view, map, eVar);
    }

    private static void c(c cVar, View view, Map map, e eVar) {
        new com.anythink.expressad.video.dynview.j.a().c(cVar, view, map, eVar);
    }

    private void d() {
        com.anythink.expressad.video.dynview.e.a aVar = this.f21923a;
        if (aVar != null) {
            aVar.a();
        }
    }

    private void e() {
        com.anythink.expressad.video.dynview.e.a aVar = this.f21923a;
        if (aVar != null) {
            aVar.b();
        }
    }

    public static void c() {
        if (f21922b != null) {
            f21922b = null;
        }
    }

    public final void b() {
        com.anythink.expressad.video.dynview.e.a aVar = this.f21923a;
        if (aVar != null) {
            aVar.c();
        }
    }

    public final void a(View view, c cVar, Map map, e eVar) {
        int h3 = cVar.h();
        if (h3 == 1) {
            com.anythink.expressad.video.dynview.j.a aVar = new com.anythink.expressad.video.dynview.j.a();
            aVar.a(cVar, view, map, eVar);
            this.f21923a = aVar.f22020b;
        } else {
            if (h3 == 2) {
                new com.anythink.expressad.video.dynview.j.a().b(cVar, view, map, eVar);
                return;
            }
            if (h3 == 4) {
                new com.anythink.expressad.video.dynview.j.a().a(cVar, view, eVar);
            } else if (h3 != 5) {
                eVar.a(view, new ArrayList());
            } else {
                new com.anythink.expressad.video.dynview.j.a().c(cVar, view, map, eVar);
            }
        }
    }

    private void a(c cVar, View view, Map map, e eVar) {
        com.anythink.expressad.video.dynview.j.a aVar = new com.anythink.expressad.video.dynview.j.a();
        aVar.a(cVar, view, map, eVar);
        this.f21923a = aVar.f22020b;
    }

    private static void a(c cVar, View view, e eVar) {
        new com.anythink.expressad.video.dynview.j.a().a(cVar, view, eVar);
    }
}
