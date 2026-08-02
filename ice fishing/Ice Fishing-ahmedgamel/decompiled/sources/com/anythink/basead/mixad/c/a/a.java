package com.anythink.basead.mixad.c.a;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.anythink.core.api.ATNativeAdInfo;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.l.e.a.b;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private ATNativeAdInfo f10294a;

    /* renamed from: b, reason: collision with root package name */
    private x f10295b;

    /* renamed from: c, reason: collision with root package name */
    private w<?> f10296c;

    /* renamed from: d, reason: collision with root package name */
    private Context f10297d;

    /* renamed from: e, reason: collision with root package name */
    private WeakReference<Context> f10298e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f10299f;

    /* renamed from: g, reason: collision with root package name */
    private String f10300g;

    /* renamed from: h, reason: collision with root package name */
    private int f10301h;
    private boolean i;

    /* renamed from: j, reason: collision with root package name */
    private b f10302j;

    /* renamed from: k, reason: collision with root package name */
    private View f10303k;

    /* renamed from: l, reason: collision with root package name */
    private int f10304l;

    /* renamed from: m, reason: collision with root package name */
    private int f10305m;

    /* renamed from: com.anythink.basead.mixad.c.a.a$a, reason: collision with other inner class name */
    public static class C0043a {

        /* renamed from: a, reason: collision with root package name */
        private Context f10306a;

        /* renamed from: b, reason: collision with root package name */
        private ATNativeAdInfo f10307b;

        /* renamed from: c, reason: collision with root package name */
        private x f10308c;

        /* renamed from: d, reason: collision with root package name */
        private w<?> f10309d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f10310e;

        /* renamed from: f, reason: collision with root package name */
        private String f10311f;

        /* renamed from: g, reason: collision with root package name */
        private int f10312g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f10313h;
        private b i;

        /* renamed from: j, reason: collision with root package name */
        private View f10314j;

        /* renamed from: k, reason: collision with root package name */
        private int f10315k;

        /* renamed from: l, reason: collision with root package name */
        private int f10316l;

        private b b() {
            return this.i;
        }

        public final C0043a a(a aVar) {
            if (aVar != null) {
                this.f10306a = aVar.j();
                this.f10309d = aVar.c();
                this.f10308c = aVar.b();
                this.i = aVar.h();
                this.f10307b = aVar.a();
                this.f10314j = aVar.i();
                this.f10313h = aVar.g();
                this.f10310e = aVar.d();
                this.f10312g = aVar.f();
                this.f10311f = aVar.e();
                this.f10315k = aVar.k();
                this.f10316l = aVar.l();
            }
            return this;
        }

        public final C0043a c(int i) {
            this.f10316l = i;
            return this;
        }

        public final C0043a b(boolean z6) {
            this.f10313h = z6;
            return this;
        }

        public final C0043a b(int i) {
            this.f10315k = i;
            return this;
        }

        public final C0043a a(ATNativeAdInfo aTNativeAdInfo) {
            this.f10307b = aTNativeAdInfo;
            return this;
        }

        public final C0043a a(b bVar) {
            this.i = bVar;
            return this;
        }

        public final C0043a a(x xVar) {
            this.f10308c = xVar;
            return this;
        }

        public final C0043a a(w<?> wVar) {
            this.f10309d = wVar;
            return this;
        }

        public final C0043a a(boolean z6) {
            this.f10310e = z6;
            return this;
        }

        public final C0043a a(String str) {
            this.f10311f = str;
            return this;
        }

        public final C0043a a(int i) {
            this.f10312g = i;
            return this;
        }

        public final C0043a a(Context context) {
            this.f10306a = context;
            return this;
        }

        private C0043a a(View view) {
            this.f10314j = view;
            return this;
        }

        public final a a() {
            a aVar = new a((byte) 0);
            Context context = this.f10306a;
            if (!(context instanceof Activity)) {
                aVar.f10297d = context;
            } else {
                aVar.f10298e = new WeakReference(this.f10306a);
            }
            aVar.f10294a = this.f10307b;
            aVar.f10303k = this.f10314j;
            aVar.i = this.f10313h;
            aVar.f10302j = this.i;
            aVar.f10296c = this.f10309d;
            aVar.f10295b = this.f10308c;
            aVar.f10299f = this.f10310e;
            aVar.f10301h = this.f10312g;
            aVar.f10300g = this.f10311f;
            aVar.f10304l = this.f10315k;
            aVar.f10305m = this.f10316l;
            return aVar;
        }
    }

    public /* synthetic */ a(byte b9) {
        this();
    }

    public final boolean d() {
        return this.f10299f;
    }

    public final String e() {
        return this.f10300g;
    }

    public final int f() {
        return this.f10301h;
    }

    public final boolean g() {
        return this.i;
    }

    public final b h() {
        return this.f10302j;
    }

    public final View i() {
        return this.f10303k;
    }

    public final Context j() {
        Context context = this.f10297d;
        WeakReference<Context> weakReference = this.f10298e;
        if (weakReference != null && weakReference.get() != null) {
            context = this.f10298e.get();
        }
        return context == null ? t.b().g() : context;
    }

    public final int k() {
        return this.f10304l;
    }

    public final int l() {
        return this.f10305m;
    }

    private a() {
    }

    public final w<?> c() {
        return this.f10296c;
    }

    public final x b() {
        return this.f10295b;
    }

    public final ATNativeAdInfo a() {
        return this.f10294a;
    }

    public final void a(View view) {
        this.f10303k = view;
    }
}
