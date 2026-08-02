package com.anythink.expressad.video.signal.a;

import android.app.Activity;
import android.content.Context;
import com.anythink.expressad.out.q;
import com.anythink.expressad.video.signal.c;
import java.util.Objects;

/* loaded from: classes.dex */
public class c implements com.anythink.expressad.video.signal.c {

    /* renamed from: e, reason: collision with root package name */
    protected static final String f22567e = "DefaultJSCommon";

    /* renamed from: o, reason: collision with root package name */
    protected String f22576o;

    /* renamed from: p, reason: collision with root package name */
    protected com.anythink.expressad.videocommon.e.d f22577p;

    /* renamed from: q, reason: collision with root package name */
    protected com.anythink.expressad.videocommon.c.c f22578q;

    /* renamed from: r, reason: collision with root package name */
    protected com.anythink.expressad.b.a f22579r;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f22568f = false;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f22569g = false;

    /* renamed from: h, reason: collision with root package name */
    protected int f22570h = 0;
    protected int i = 0;

    /* renamed from: j, reason: collision with root package name */
    protected int f22571j = 0;

    /* renamed from: k, reason: collision with root package name */
    protected int f22572k = 0;

    /* renamed from: l, reason: collision with root package name */
    protected int f22573l = 0;

    /* renamed from: m, reason: collision with root package name */
    protected int f22574m = 1;

    /* renamed from: n, reason: collision with root package name */
    protected int f22575n = -1;

    /* renamed from: s, reason: collision with root package name */
    public c.a f22580s = new a();

    /* renamed from: t, reason: collision with root package name */
    protected int f22581t = 2;

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
        public void a(com.anythink.expressad.foundation.d.d dVar, boolean z6) {
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
        private com.anythink.expressad.video.signal.c f22582a;

        /* renamed from: b, reason: collision with root package name */
        private c.a f22583b;

        public b(com.anythink.expressad.video.signal.c cVar, c.a aVar) {
            this.f22582a = cVar;
            this.f22583b = aVar;
        }

        @Override // com.anythink.expressad.out.q.c
        public final void a(com.anythink.expressad.out.k kVar) {
            c.a aVar = this.f22583b;
            if (aVar != null) {
                aVar.a(kVar);
            }
        }

        @Override // com.anythink.expressad.out.q.c
        public final boolean b() {
            c.a aVar = this.f22583b;
            return aVar != null && aVar.b();
        }

        @Override // com.anythink.expressad.out.q.c
        public final void c() {
        }

        @Override // com.anythink.expressad.out.q.c
        public final void d(com.anythink.expressad.out.k kVar) {
            c.a aVar = this.f22583b;
            if (aVar != null) {
                aVar.d(kVar);
            }
        }

        @Override // com.anythink.expressad.out.q.c
        public final void b(com.anythink.expressad.out.k kVar) {
            c.a aVar = this.f22583b;
            if (aVar != null) {
                aVar.b(kVar);
            }
        }

        @Override // com.anythink.expressad.out.q.c
        public final void c(com.anythink.expressad.out.k kVar) {
            c.a aVar = this.f22583b;
            if (aVar != null) {
                aVar.c(kVar);
            }
        }

        @Override // com.anythink.expressad.out.q.c
        public final void a(com.anythink.expressad.foundation.d.d dVar, String str) {
            c.a aVar = this.f22583b;
            if (aVar != null) {
                aVar.a(dVar, str);
            }
        }

        @Override // com.anythink.expressad.video.signal.c.a
        public final void d() {
            c.a aVar = this.f22583b;
            if (aVar != null) {
                aVar.d();
            }
        }

        @Override // com.anythink.expressad.out.q.c
        public final void b(com.anythink.expressad.out.k kVar, String str) {
            c.a aVar = this.f22583b;
            if (aVar != null) {
                aVar.b(kVar, str);
            }
            com.anythink.expressad.video.signal.c cVar = this.f22582a;
            if (cVar != null) {
                cVar.j();
            }
        }

        @Override // com.anythink.expressad.out.q.c
        public final void a(com.anythink.expressad.out.k kVar, String str) {
            c.a aVar = this.f22583b;
            if (aVar != null) {
                aVar.a(kVar, str);
            }
            com.anythink.expressad.video.signal.c cVar = this.f22582a;
            if (cVar != null) {
                cVar.j();
            }
        }

        @Override // com.anythink.expressad.video.signal.c.a
        public final void a() {
            c.a aVar = this.f22583b;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // com.anythink.expressad.video.signal.c.a
        public final void a(com.anythink.expressad.foundation.d.d dVar, boolean z6) {
            c.a aVar = this.f22583b;
            if (aVar != null) {
                aVar.a(dVar, z6);
            }
        }

        @Override // com.anythink.expressad.video.signal.c.a
        public final void a(int i, String str) {
            c.a aVar = this.f22583b;
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
        this.f22570h = i;
    }

    @Override // com.anythink.expressad.video.signal.d
    public void click(int i, String str) {
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void d(int i) {
        this.f22571j = i;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void e(int i) {
        this.f22572k = i;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void f(int i) {
        this.f22573l = i;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final boolean g() {
        return this.f22568f;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void h() {
        this.f22568f = true;
    }

    @Override // com.anythink.expressad.video.signal.d
    public void handlerH5Exception(int i, String str) {
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void i(int i) {
        this.f22574m = i;
    }

    @Override // com.anythink.expressad.video.signal.c
    public void j() {
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void k() {
        com.anythink.expressad.b.a aVar = this.f22579r;
        if (aVar != null) {
            aVar.a();
            this.f22579r.a((q.c) null);
            this.f22579r.b();
        }
    }

    @Override // com.anythink.expressad.video.signal.c
    public void l() {
    }

    @Override // com.anythink.expressad.video.signal.c
    public final int m() {
        return this.f22575n;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final int n() {
        return this.f22574m;
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
        if (this.f22570h == 0 && this.f22569g) {
            this.f22570h = 1;
        }
        return this.f22570h;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final int d() {
        if (this.f22571j == 0 && this.f22569g) {
            this.f22571j = 1;
        }
        return this.f22571j;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final int e() {
        return this.f22572k;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final int f() {
        return this.f22573l;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void g(int i) {
        this.f22575n = i;
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
        if (this.i == 0 && this.f22569g) {
            this.i = 1;
        }
        return this.i;
    }

    private void a(com.anythink.expressad.videocommon.c.c cVar) {
        this.f22578q = cVar;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void a(int i) {
        this.f22581t = i;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final boolean a() {
        return this.f22569g;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void a(boolean z6) {
        this.f22569g = z6;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void a(String str) {
        this.f22576o = str;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void a(c.a aVar) {
        Objects.toString(aVar);
        this.f22580s = aVar;
    }

    @Override // com.anythink.expressad.video.signal.c
    public final void a(com.anythink.expressad.videocommon.e.d dVar) {
        Objects.toString(dVar);
        this.f22577p = dVar;
    }
}
