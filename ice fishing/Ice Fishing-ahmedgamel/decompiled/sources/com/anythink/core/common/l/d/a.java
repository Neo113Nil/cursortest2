package com.anythink.core.common.l.d;

import android.content.Context;
import com.anythink.core.api.ATNativeAdCustomRender;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.IATBaseAdAdapter;
import com.anythink.core.common.h.n;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f15134a;

    /* renamed from: b, reason: collision with root package name */
    private BaseAd f15135b;

    /* renamed from: c, reason: collision with root package name */
    private n f15136c;

    /* renamed from: d, reason: collision with root package name */
    private ATNativeAdCustomRender f15137d;

    /* renamed from: e, reason: collision with root package name */
    private com.anythink.core.common.l.e.a.b f15138e;

    /* renamed from: f, reason: collision with root package name */
    private com.anythink.core.common.l.b.a.b f15139f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f15140g;

    /* renamed from: h, reason: collision with root package name */
    private b f15141h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f15142j;

    /* renamed from: com.anythink.core.common.l.d.a$a, reason: collision with other inner class name */
    public static class C0082a {

        /* renamed from: a, reason: collision with root package name */
        private Context f15143a;

        /* renamed from: b, reason: collision with root package name */
        private BaseAd f15144b;

        /* renamed from: c, reason: collision with root package name */
        private n f15145c;

        /* renamed from: d, reason: collision with root package name */
        private ATNativeAdCustomRender f15146d;

        /* renamed from: e, reason: collision with root package name */
        private com.anythink.core.common.l.e.a.b f15147e;

        /* renamed from: f, reason: collision with root package name */
        private com.anythink.core.common.l.b.a.b f15148f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f15149g;

        /* renamed from: h, reason: collision with root package name */
        private int f15150h;
        private int i;

        public final C0082a a(Context context) {
            this.f15143a = context;
            return this;
        }

        public final C0082a b(int i) {
            this.i = i;
            return this;
        }

        public final C0082a a(BaseAd baseAd) {
            this.f15144b = baseAd;
            return this;
        }

        public final C0082a a(ATNativeAdCustomRender aTNativeAdCustomRender) {
            this.f15146d = aTNativeAdCustomRender;
            return this;
        }

        public final C0082a a(com.anythink.core.common.l.e.a.b bVar) {
            this.f15147e = bVar;
            return this;
        }

        public final C0082a a(n nVar) {
            this.f15145c = nVar;
            return this;
        }

        public final C0082a a(boolean z6) {
            this.f15149g = z6;
            return this;
        }

        public final C0082a a(com.anythink.core.common.l.b.a.b bVar) {
            this.f15148f = bVar;
            return this;
        }

        public final C0082a a(int i) {
            this.f15150h = i;
            return this;
        }

        public final a a() {
            a aVar = new a((byte) 0);
            aVar.f15134a = this.f15143a;
            aVar.f15135b = this.f15144b;
            aVar.f15137d = this.f15146d;
            aVar.f15138e = this.f15147e;
            aVar.f15139f = this.f15148f;
            aVar.f15136c = this.f15145c;
            aVar.f15140g = this.f15149g;
            aVar.i = this.f15150h;
            aVar.f15142j = this.i;
            return aVar;
        }
    }

    public /* synthetic */ a(byte b9) {
        this();
    }

    private int l() {
        b bVar = this.f15141h;
        if (bVar != null) {
            return bVar.b();
        }
        return -1;
    }

    public final ATNativeAdCustomRender c() {
        return this.f15137d;
    }

    public final com.anythink.core.common.l.e.a.b d() {
        return this.f15138e;
    }

    public final int e() {
        b bVar = this.f15141h;
        if (bVar != null) {
            return bVar.e();
        }
        return -1;
    }

    public final IATBaseAdAdapter f() {
        b bVar = this.f15141h;
        if (bVar != null) {
            return bVar.r();
        }
        return null;
    }

    public final n g() {
        return this.f15136c;
    }

    public final boolean h() {
        return this.f15140g;
    }

    public final com.anythink.core.common.l.b.a.b i() {
        return this.f15139f;
    }

    public final int j() {
        return this.i;
    }

    public final int k() {
        return this.f15142j;
    }

    private a() {
    }

    public final BaseAd b() {
        return this.f15135b;
    }

    public final Context a() {
        return this.f15134a;
    }

    public final void a(b bVar) {
        this.f15141h = bVar;
    }

    public final int a(String str) {
        b bVar = this.f15141h;
        return Math.max(bVar != null ? ((Integer) bVar.a(str, 5)).intValue() : 5, 3);
    }
}
