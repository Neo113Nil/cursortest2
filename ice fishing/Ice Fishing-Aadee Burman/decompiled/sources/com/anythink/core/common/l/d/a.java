package com.anythink.core.common.l.d;

import android.content.Context;
import com.anythink.core.api.ATNativeAdCustomRender;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.IATBaseAdAdapter;
import com.anythink.core.common.h.n;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f14348a;

    /* renamed from: b, reason: collision with root package name */
    private BaseAd f14349b;

    /* renamed from: c, reason: collision with root package name */
    private n f14350c;

    /* renamed from: d, reason: collision with root package name */
    private ATNativeAdCustomRender f14351d;

    /* renamed from: e, reason: collision with root package name */
    private com.anythink.core.common.l.e.a.b f14352e;

    /* renamed from: f, reason: collision with root package name */
    private com.anythink.core.common.l.b.a.b f14353f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f14354g;

    /* renamed from: h, reason: collision with root package name */
    private b f14355h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f14356j;

    /* renamed from: com.anythink.core.common.l.d.a$a, reason: collision with other inner class name */
    public static class C0082a {

        /* renamed from: a, reason: collision with root package name */
        private Context f14357a;

        /* renamed from: b, reason: collision with root package name */
        private BaseAd f14358b;

        /* renamed from: c, reason: collision with root package name */
        private n f14359c;

        /* renamed from: d, reason: collision with root package name */
        private ATNativeAdCustomRender f14360d;

        /* renamed from: e, reason: collision with root package name */
        private com.anythink.core.common.l.e.a.b f14361e;

        /* renamed from: f, reason: collision with root package name */
        private com.anythink.core.common.l.b.a.b f14362f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f14363g;

        /* renamed from: h, reason: collision with root package name */
        private int f14364h;
        private int i;

        public final C0082a a(Context context) {
            this.f14357a = context;
            return this;
        }

        public final C0082a b(int i) {
            this.i = i;
            return this;
        }

        public final C0082a a(BaseAd baseAd) {
            this.f14358b = baseAd;
            return this;
        }

        public final C0082a a(ATNativeAdCustomRender aTNativeAdCustomRender) {
            this.f14360d = aTNativeAdCustomRender;
            return this;
        }

        public final C0082a a(com.anythink.core.common.l.e.a.b bVar) {
            this.f14361e = bVar;
            return this;
        }

        public final C0082a a(n nVar) {
            this.f14359c = nVar;
            return this;
        }

        public final C0082a a(boolean z3) {
            this.f14363g = z3;
            return this;
        }

        public final C0082a a(com.anythink.core.common.l.b.a.b bVar) {
            this.f14362f = bVar;
            return this;
        }

        public final C0082a a(int i) {
            this.f14364h = i;
            return this;
        }

        public final a a() {
            a aVar = new a((byte) 0);
            aVar.f14348a = this.f14357a;
            aVar.f14349b = this.f14358b;
            aVar.f14351d = this.f14360d;
            aVar.f14352e = this.f14361e;
            aVar.f14353f = this.f14362f;
            aVar.f14350c = this.f14359c;
            aVar.f14354g = this.f14363g;
            aVar.i = this.f14364h;
            aVar.f14356j = this.i;
            return aVar;
        }
    }

    public /* synthetic */ a(byte b9) {
        this();
    }

    private int l() {
        b bVar = this.f14355h;
        if (bVar != null) {
            return bVar.b();
        }
        return -1;
    }

    public final ATNativeAdCustomRender c() {
        return this.f14351d;
    }

    public final com.anythink.core.common.l.e.a.b d() {
        return this.f14352e;
    }

    public final int e() {
        b bVar = this.f14355h;
        if (bVar != null) {
            return bVar.e();
        }
        return -1;
    }

    public final IATBaseAdAdapter f() {
        b bVar = this.f14355h;
        if (bVar != null) {
            return bVar.r();
        }
        return null;
    }

    public final n g() {
        return this.f14350c;
    }

    public final boolean h() {
        return this.f14354g;
    }

    public final com.anythink.core.common.l.b.a.b i() {
        return this.f14353f;
    }

    public final int j() {
        return this.i;
    }

    public final int k() {
        return this.f14356j;
    }

    private a() {
    }

    public final BaseAd b() {
        return this.f14349b;
    }

    public final Context a() {
        return this.f14348a;
    }

    public final void a(b bVar) {
        this.f14355h = bVar;
    }

    public final int a(String str) {
        b bVar = this.f14355h;
        return Math.max(bVar != null ? ((Integer) bVar.a(str, 5)).intValue() : 5, 3);
    }
}
