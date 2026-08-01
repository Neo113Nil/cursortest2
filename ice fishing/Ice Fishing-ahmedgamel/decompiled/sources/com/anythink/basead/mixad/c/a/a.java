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
    private ATNativeAdInfo f9508a;

    /* renamed from: b, reason: collision with root package name */
    private x f9509b;

    /* renamed from: c, reason: collision with root package name */
    private w<?> f9510c;

    /* renamed from: d, reason: collision with root package name */
    private Context f9511d;

    /* renamed from: e, reason: collision with root package name */
    private WeakReference<Context> f9512e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9513f;

    /* renamed from: g, reason: collision with root package name */
    private String f9514g;

    /* renamed from: h, reason: collision with root package name */
    private int f9515h;
    private boolean i;

    /* renamed from: j, reason: collision with root package name */
    private b f9516j;

    /* renamed from: k, reason: collision with root package name */
    private View f9517k;

    /* renamed from: l, reason: collision with root package name */
    private int f9518l;

    /* renamed from: m, reason: collision with root package name */
    private int f9519m;

    /* renamed from: com.anythink.basead.mixad.c.a.a$a, reason: collision with other inner class name */
    public static class C0043a {

        /* renamed from: a, reason: collision with root package name */
        private Context f9520a;

        /* renamed from: b, reason: collision with root package name */
        private ATNativeAdInfo f9521b;

        /* renamed from: c, reason: collision with root package name */
        private x f9522c;

        /* renamed from: d, reason: collision with root package name */
        private w<?> f9523d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f9524e;

        /* renamed from: f, reason: collision with root package name */
        private String f9525f;

        /* renamed from: g, reason: collision with root package name */
        private int f9526g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f9527h;
        private b i;

        /* renamed from: j, reason: collision with root package name */
        private View f9528j;

        /* renamed from: k, reason: collision with root package name */
        private int f9529k;

        /* renamed from: l, reason: collision with root package name */
        private int f9530l;

        private b b() {
            return this.i;
        }

        public final C0043a a(a aVar) {
            if (aVar != null) {
                this.f9520a = aVar.j();
                this.f9523d = aVar.c();
                this.f9522c = aVar.b();
                this.i = aVar.h();
                this.f9521b = aVar.a();
                this.f9528j = aVar.i();
                this.f9527h = aVar.g();
                this.f9524e = aVar.d();
                this.f9526g = aVar.f();
                this.f9525f = aVar.e();
                this.f9529k = aVar.k();
                this.f9530l = aVar.l();
            }
            return this;
        }

        public final C0043a c(int i) {
            this.f9530l = i;
            return this;
        }

        public final C0043a b(boolean z3) {
            this.f9527h = z3;
            return this;
        }

        public final C0043a b(int i) {
            this.f9529k = i;
            return this;
        }

        public final C0043a a(ATNativeAdInfo aTNativeAdInfo) {
            this.f9521b = aTNativeAdInfo;
            return this;
        }

        public final C0043a a(b bVar) {
            this.i = bVar;
            return this;
        }

        public final C0043a a(x xVar) {
            this.f9522c = xVar;
            return this;
        }

        public final C0043a a(w<?> wVar) {
            this.f9523d = wVar;
            return this;
        }

        public final C0043a a(boolean z3) {
            this.f9524e = z3;
            return this;
        }

        public final C0043a a(String str) {
            this.f9525f = str;
            return this;
        }

        public final C0043a a(int i) {
            this.f9526g = i;
            return this;
        }

        public final C0043a a(Context context) {
            this.f9520a = context;
            return this;
        }

        private C0043a a(View view) {
            this.f9528j = view;
            return this;
        }

        public final a a() {
            a aVar = new a((byte) 0);
            Context context = this.f9520a;
            if (!(context instanceof Activity)) {
                aVar.f9511d = context;
            } else {
                aVar.f9512e = new WeakReference(this.f9520a);
            }
            aVar.f9508a = this.f9521b;
            aVar.f9517k = this.f9528j;
            aVar.i = this.f9527h;
            aVar.f9516j = this.i;
            aVar.f9510c = this.f9523d;
            aVar.f9509b = this.f9522c;
            aVar.f9513f = this.f9524e;
            aVar.f9515h = this.f9526g;
            aVar.f9514g = this.f9525f;
            aVar.f9518l = this.f9529k;
            aVar.f9519m = this.f9530l;
            return aVar;
        }
    }

    public /* synthetic */ a(byte b9) {
        this();
    }

    public final boolean d() {
        return this.f9513f;
    }

    public final String e() {
        return this.f9514g;
    }

    public final int f() {
        return this.f9515h;
    }

    public final boolean g() {
        return this.i;
    }

    public final b h() {
        return this.f9516j;
    }

    public final View i() {
        return this.f9517k;
    }

    public final Context j() {
        Context context = this.f9511d;
        WeakReference<Context> weakReference = this.f9512e;
        if (weakReference != null && weakReference.get() != null) {
            context = this.f9512e.get();
        }
        return context == null ? t.b().g() : context;
    }

    public final int k() {
        return this.f9518l;
    }

    public final int l() {
        return this.f9519m;
    }

    private a() {
    }

    public final w<?> c() {
        return this.f9510c;
    }

    public final x b() {
        return this.f9509b;
    }

    public final ATNativeAdInfo a() {
        return this.f9508a;
    }

    public final void a(View view) {
        this.f9517k = view;
    }
}
