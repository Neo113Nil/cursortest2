package com.anythink.core.common.s.b;

import com.anythink.core.common.s.a.h;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f17186a = false;

    public static class a implements com.anythink.core.common.s.a.a.c {
        @Override // com.anythink.core.common.s.a.a.c
        public final void a(String str, String str2) {
        }

        @Override // com.anythink.core.common.s.a.a.c
        public final void b(String str, Exception exc) {
            exc.getMessage();
        }

        @Override // com.anythink.core.common.s.a.a.c
        public final void a(String str, Exception exc) {
            exc.getMessage();
        }
    }

    private static void a() {
        if (f17186a) {
            return;
        }
        f17186a = true;
        h.a(com.anythink.core.common.v.b.b.a().c());
        h.a(new a());
    }

    public static f b(com.anythink.core.common.s.c cVar) {
        if (cVar != null) {
            return new f(cVar);
        }
        return null;
    }

    public static com.anythink.core.common.s.a c(com.anythink.core.common.s.c cVar) {
        if (cVar != null) {
            return new e(cVar);
        }
        return null;
    }

    public static c a(com.anythink.core.common.s.c cVar) {
        if (cVar == null) {
            return null;
        }
        if (!f17186a) {
            f17186a = true;
            h.a(com.anythink.core.common.v.b.b.a().c());
            h.a(new a());
        }
        return new c(cVar);
    }
}
