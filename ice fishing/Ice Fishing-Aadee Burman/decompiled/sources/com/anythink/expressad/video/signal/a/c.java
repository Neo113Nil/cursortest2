package com.anythink.expressad.video.signal.a;

import android.app.Activity;
import android.content.Context;
import com.anythink.expressad.out.q;
import com.anythink.expressad.video.signal.c;
import java.util.Objects;

/* loaded from: classes.dex */
public class c implements com.anythink.expressad.video.signal.c {

    /* renamed from: e, reason: collision with root package name */
    protected static final String f21780e = "DefaultJSCommon";

    /* renamed from: o, reason: collision with root package name */
    protected String f21789o;

    /* renamed from: p, reason: collision with root package name */
    protected com.anythink.expressad.videocommon.e.d f21790p;

    /* renamed from: q, reason: collision with root package name */
    protected com.anythink.expressad.videocommon.c.c f21791q;

    /* renamed from: r, reason: collision with root package name */
    protected com.anythink.expressad.b.a f21792r;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f21781f = false;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f21782g = false;

    /* renamed from: h, reason: collision with root package name */
    protected int f21783h = 0;
    protected int i = 0;

    /* renamed from: j, reason: collision with root package name */
    protected int f21784j = 0;

    /* renamed from: k, reason: collision with root package name */
    protected int f21785k = 0;

    /* renamed from: l, reason: collision with root package name */
    protected int f21786l = 0;

    /* renamed from: m, reason: collision with root package name */
    protected int f21787m = 1;

    /* renamed from: n, reason: collision with root package name */
    protected int f21788n = -1;

    /* renamed from: s, reason: collision with root package name */
    public c.a f21793s = new a();

    /* renamed from: t, reason: collision with root package name */
    protected int f21794t = 2;

    public static class a implements c.a {
        @Override // com.anythink.expressad.video.signal.c.a
        public void a() {
        }

        @Override // com.anythink.expressad.out.q.c
        public final boolean b() {
            return false;
        }

        @Override // com.anythink.expressad.out.q.c
        public final void c() {
        }

        @Override // com.anythink.expressad.video.signal.c.a
        public void d() {
        }

        @Override // com.anythink.expressad.video.signal.c.a
        public void a(int i, String str) {
        }

        @Override // com.anythink.expressad.out.q.c
        public final void b(com.anythink.expressad.out.k kVar) {
            Objects.toString(kVar);
        }

        @Override // com.anythink.expressad.out.q.c
        public final void c(com.anythink.expressad.out.k kVar) {
            Objects.toString(kVar);
        }

        @Override // com.anythink.expressad.out.q.c
        public final void d(com.anythink.expressad.out.k kVar) {
            Objects.toString(kVar);
        }

        @Override // com.anythink.expressad.video.signal.c.a
        public void a(com.anythink.expressad.foundation.d.d dVar, boolean z3) {
        }

        @Override // com.anythink.expressad.out.q.c
        public void b(com.anythink.expressad.out.k kVar, String str) {
            Objects.toString(kVar);
        }

        @Override // com.anythink.expressad.out.q.c
        public final void a(com.anythink.expressad.out.k kVar) {
            Objects.toString(kVar);
        }

        @Override // com.anythink.expressad.out.q.c
        public void a(com.anythink.expressad.foundation.d.d dVar, String str) {
            Objects.toString(dVar);
        }

        @Override // com.anythink.expressad.out.q.c
        public void a(com.anythink.expressad.out.k kVar, String str) {
            Objects.toString(kVar);
        }
    }

    public static class b implements c.a {

        /* renamed from: a, reason: collision with root package name */
        private com.anythink.expressad.video.signal.c f21795a;

        /* renamed from: b, reason: collision with root package name */
        private c.a f21796b;

        public b(com.anythink.expressad.video.signal.c cVar, c.a aVar) {
            this.f21795a = cVar;
            this.f21796b = aVar;
        }

        @Override // com.anythink.expressad.out.q.c
        public final void a(com.anythink.expressad.out.k kVar) {
            c.a aVar = this.f21796b;
            if (aVar != null) {
                aVar.a(kVar);
            }
        }

        @Override // com.anythink.expressad.out.q.c
        public final boolean b() {
            c.a aVar = this.f21796b;
            return aVar != null && aVar.b();
        }

        @Override // com.anythink.expressad.out.q.c
        public final void c() {
        }

        @Override // com.anythink.expressad.out.q.c
        public final void d(com.anythink.expressad.out.k kVar) {
            c.a aVar = this.f21796b;
            if (aVar != null) {
                aVar.d(kVar);
            }
        }

        @Override // com.anythink.expressad.out.q.c
        public final void b(com.anythink.expressad.out.k kVar) {
            c.a aVar = this.f21796b;
            if (aVar != null) {
                aVar.b(kVar);
            }
        }

        @Override // com.anythink.expressad.out.q.c
        public final void c(com.anythink.expressad.out.k kVar) {
            c.a aVar = this.f21796b;
            if (aVar != null) {
                aVar.c(kVar);
            }
        }

        @Override // com.anythink.expressad.out.q.c
        public final void a(com.anythink.expressad.foundation.d.d dVar, String str) {
            c.a aVar = this.f21796b;
            if (aVar != null) {
                aVar.a(dVar, str);
            }
        }

        @Override // com.anythink.expressad.video.signal.c.a
        public final void d() {
            c.a aVar = this.f21796b;
            if (aVar != null) {
                aVar.d();
            }
        }

        @Override // com.anythink.expressad.out.q.c
        public final void b(com.anythink.expressad.out.k kVar, String str) {
            c.a aVar = this.f21796b;
            if (aVar != null) {
                aVar.b(kVar, str);
            }
            com.anythink.expressad.video.signal.c cVar = this.f21795a;
            if (cVar != null) {
                cVar.j();
            }
        }

        @Override // com.anythink.expressad.out.q.c
        public final void a(com.anythink.expressad.out.k kVar, String str) {
            c.a aVar = this.f21796b;
            if (aVar != null) {
                aVar.a(kVar, str);
            }
            com.anythink.expressad.video.signal.c cVar = this.f21795a;
            if (cVar != null) {
                cVar.j();
            }
        }

        @Override // com.anythink.expressad.video.signal.c.a
        public final void a() {
            c.a aVar = this.f21796b;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // com.anythink.expressad.video.signal.c.a
        public final void a(com.anythink.expressad.foundation.d.d dVar, boolean z3) {
            c.a aVar = this.f21796b;
            if (aVar != null) {
                aVar.a(dVar, z3);
            }
        }

        @Override // com.anythink.expressad.video.signal.c.a
        public final void a(int i, String str) {
            c.a aVar = this.f21796b;
            if (aVar != null) {
                aVar.a(i, str);
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.c
    public void a(int i, String str) {
    }

    @Override // com.anythink.expressad.video.signal.c
    public void b(String str) {
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void c(int i) {
        this.f21783h = i;
    }

    @Override // com.anythink.expressad.video.signal.d
    public void click(int i, String str) {
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void d(int i) {
        this.f21784j = i;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void e(int i) {
        this.f21785k = i;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void f(int i) {
        this.f21786l = i;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final boolean g() {
        return this.f21781f;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void h() {
        this.f21781f = true;
    }

    @Override // com.anythink.expressad.video.signal.d
    public void handlerH5Exception(int i, String str) {
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void i(int i) {
        this.f21787m = i;
    }

    @Override // com.anythink.expressad.video.signal.c
    public void j() {
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void k() {
        com.anythink.expressad.b.a aVar = this.f21792r;
        if (aVar != null) {
            aVar.a();
            this.f21792r.a((q.c) null);
            this.f21792r.b();
        }
    }

    @Override // com.anythink.expressad.video.signal.c
    public void l() {
    }

    @Override // com.anythink.expressad.video.signal.c
    public final int m() {
        return this.f21788n;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final int n() {
        return this.f21787m;
    }

    @Override // com.anythink.expressad.video.signal.c
    public String o() {
        return null;
    }

    @Override // com.anythink.expressad.video.signal.c
    public void a(Activity activity) {
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void b(int i) {
        this.i = i;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final int c() {
        if (this.f21783h == 0 && this.f21782g) {
            this.f21783h = 1;
        }
        return this.f21783h;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final int d() {
        if (this.f21784j == 0 && this.f21782g) {
            this.f21784j = 1;
        }
        return this.f21784j;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final int e() {
        return this.f21785k;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final int f() {
        return this.f21786l;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void g(int i) {
        this.f21788n = i;
    }

    @Override // com.anythink.expressad.video.signal.c
    public String h(int i) {
        return "{}";
    }

    @Override // com.anythink.expressad.video.signal.c
    public String i() {
        return "{}";
    }

    @Override // com.anythink.expressad.video.signal.c
    public void a(Context context) {
    }

    @Override // com.anythink.expressad.video.signal.c
    public final int b() {
        if (this.i == 0 && this.f21782g) {
            this.i = 1;
        }
        return this.i;
    }

    private void a(com.anythink.expressad.videocommon.c.c cVar) {
        this.f21791q = cVar;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void a(int i) {
        this.f21794t = i;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final boolean a() {
        return this.f21782g;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void a(boolean z3) {
        this.f21782g = z3;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void a(String str) {
        this.f21789o = str;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void a(c.a aVar) {
        Objects.toString(aVar);
        this.f21793s = aVar;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void a(com.anythink.expressad.videocommon.e.d dVar) {
        Objects.toString(dVar);
        this.f21790p = dVar;
    }
}
