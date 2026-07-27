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
    private ATNativeAdInfo f9665a;

    /* renamed from: b, reason: collision with root package name */
    private x f9666b;

    /* renamed from: c, reason: collision with root package name */
    private w<?> f9667c;

    /* renamed from: d, reason: collision with root package name */
    private Context f9668d;

    /* renamed from: e, reason: collision with root package name */
    private WeakReference<Context> f9669e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9670f;

    /* renamed from: g, reason: collision with root package name */
    private String f9671g;

    /* renamed from: h, reason: collision with root package name */
    private int f9672h;
    private boolean i;

    /* renamed from: j, reason: collision with root package name */
    private b f9673j;

    /* renamed from: k, reason: collision with root package name */
    private View f9674k;

    /* renamed from: l, reason: collision with root package name */
    private int f9675l;

    /* renamed from: m, reason: collision with root package name */
    private int f9676m;

    /* renamed from: com.anythink.basead.mixad.c.a.a$a, reason: collision with other inner class name */
    public static class C0042a {

        /* renamed from: a, reason: collision with root package name */
        private Context f9677a;

        /* renamed from: b, reason: collision with root package name */
        private ATNativeAdInfo f9678b;

        /* renamed from: c, reason: collision with root package name */
        private x f9679c;

        /* renamed from: d, reason: collision with root package name */
        private w<?> f9680d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f9681e;

        /* renamed from: f, reason: collision with root package name */
        private String f9682f;

        /* renamed from: g, reason: collision with root package name */
        private int f9683g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f9684h;
        private b i;

        /* renamed from: j, reason: collision with root package name */
        private View f9685j;

        /* renamed from: k, reason: collision with root package name */
        private int f9686k;

        /* renamed from: l, reason: collision with root package name */
        private int f9687l;

        private b b() {
            return this.i;
        }

        public final C0042a a(a aVar) {
            if (aVar != null) {
                this.f9677a = aVar.j();
                this.f9680d = aVar.c();
                this.f9679c = aVar.b();
                this.i = aVar.h();
                this.f9678b = aVar.a();
                this.f9685j = aVar.i();
                this.f9684h = aVar.g();
                this.f9681e = aVar.d();
                this.f9683g = aVar.f();
                this.f9682f = aVar.e();
                this.f9686k = aVar.k();
                this.f9687l = aVar.l();
            }
            return this;
        }

        public final C0042a c(int i) {
            this.f9687l = i;
            return this;
        }

        public final C0042a b(boolean z8) {
            this.f9684h = z8;
            return this;
        }

        public final C0042a b(int i) {
            this.f9686k = i;
            return this;
        }

        public final C0042a a(ATNativeAdInfo aTNativeAdInfo) {
            this.f9678b = aTNativeAdInfo;
            return this;
        }

        public final C0042a a(b bVar) {
            this.i = bVar;
            return this;
        }

        public final C0042a a(x xVar) {
            this.f9679c = xVar;
            return this;
        }

        public final C0042a a(w<?> wVar) {
            this.f9680d = wVar;
            return this;
        }

        public final C0042a a(boolean z8) {
            this.f9681e = z8;
            return this;
        }

        public final C0042a a(String str) {
            this.f9682f = str;
            return this;
        }

        public final C0042a a(int i) {
            this.f9683g = i;
            return this;
        }

        public final C0042a a(Context context) {
            this.f9677a = context;
            return this;
        }

        private C0042a a(View view) {
            this.f9685j = view;
            return this;
        }

        public final a a() {
            a aVar = new a((byte) 0);
            Context context = this.f9677a;
            if (!(context instanceof Activity)) {
                aVar.f9668d = context;
            } else {
                aVar.f9669e = new WeakReference(this.f9677a);
            }
            aVar.f9665a = this.f9678b;
            aVar.f9674k = this.f9685j;
            aVar.i = this.f9684h;
            aVar.f9673j = this.i;
            aVar.f9667c = this.f9680d;
            aVar.f9666b = this.f9679c;
            aVar.f9670f = this.f9681e;
            aVar.f9672h = this.f9683g;
            aVar.f9671g = this.f9682f;
            aVar.f9675l = this.f9686k;
            aVar.f9676m = this.f9687l;
            return aVar;
        }
    }

    public /* synthetic */ a(byte b9) {
        this();
    }

    public final boolean d() {
        return this.f9670f;
    }

    public final String e() {
        return this.f9671g;
    }

    public final int f() {
        return this.f9672h;
    }

    public final boolean g() {
        return this.i;
    }

    public final b h() {
        return this.f9673j;
    }

    public final View i() {
        return this.f9674k;
    }

    public final Context j() {
        Context context = this.f9668d;
        WeakReference<Context> weakReference = this.f9669e;
        if (weakReference != null && weakReference.get() != null) {
            context = this.f9669e.get();
        }
        return context == null ? t.b().g() : context;
    }

    public final int k() {
        return this.f9675l;
    }

    public final int l() {
        return this.f9676m;
    }

    private a() {
    }

    public final w<?> c() {
        return this.f9667c;
    }

    public final x b() {
        return this.f9666b;
    }

    public final ATNativeAdInfo a() {
        return this.f9665a;
    }

    public final void a(View view) {
        this.f9674k = view;
    }
}
