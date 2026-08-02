package com.anythink.expressad.video.dynview;

import android.content.Context;
import android.view.View;
import com.anythink.expressad.foundation.d.d;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private Context f21925a;

    /* renamed from: b, reason: collision with root package name */
    private String f21926b;

    /* renamed from: c, reason: collision with root package name */
    private int f21927c;

    /* renamed from: d, reason: collision with root package name */
    private float f21928d;

    /* renamed from: e, reason: collision with root package name */
    private float f21929e;

    /* renamed from: f, reason: collision with root package name */
    private int f21930f;

    /* renamed from: g, reason: collision with root package name */
    private int f21931g;

    /* renamed from: h, reason: collision with root package name */
    private View f21932h;
    private List<d> i;

    /* renamed from: j, reason: collision with root package name */
    private int f21933j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21934k;

    /* renamed from: l, reason: collision with root package name */
    private List<String> f21935l;

    /* renamed from: m, reason: collision with root package name */
    private int f21936m;

    /* renamed from: n, reason: collision with root package name */
    private String f21937n;

    /* renamed from: o, reason: collision with root package name */
    private int f21938o;

    /* renamed from: p, reason: collision with root package name */
    private int f21939p;

    /* renamed from: q, reason: collision with root package name */
    private String f21940q;

    public static class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private Context f21941a;

        /* renamed from: b, reason: collision with root package name */
        private String f21942b;

        /* renamed from: c, reason: collision with root package name */
        private int f21943c;

        /* renamed from: d, reason: collision with root package name */
        private float f21944d;

        /* renamed from: e, reason: collision with root package name */
        private float f21945e;

        /* renamed from: f, reason: collision with root package name */
        private int f21946f;

        /* renamed from: g, reason: collision with root package name */
        private int f21947g;

        /* renamed from: h, reason: collision with root package name */
        private View f21948h;
        private List<d> i;

        /* renamed from: j, reason: collision with root package name */
        private int f21949j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f21950k;

        /* renamed from: l, reason: collision with root package name */
        private List<String> f21951l;

        /* renamed from: m, reason: collision with root package name */
        private int f21952m;

        /* renamed from: n, reason: collision with root package name */
        private String f21953n;

        /* renamed from: o, reason: collision with root package name */
        private int f21954o;

        /* renamed from: p, reason: collision with root package name */
        private int f21955p = 1;

        /* renamed from: q, reason: collision with root package name */
        private String f21956q;

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(Context context) {
            this.f21941a = context.getApplicationContext();
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b b(float f2) {
            this.f21945e = f2;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b c(int i) {
            this.f21947g = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b d(int i) {
            this.f21949j = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b e(int i) {
            this.f21952m = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b f(int i) {
            this.f21954o = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b g(int i) {
            this.f21955p = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(String str) {
            this.f21942b = str;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b b(int i) {
            this.f21946f = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b c(String str) {
            this.f21956q = str;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(int i) {
            this.f21943c = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b b(List<String> list) {
            this.f21951l = list;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(float f2) {
            this.f21944d = f2;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b b(String str) {
            this.f21953n = str;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(View view) {
            this.f21948h = view;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(List<d> list) {
            this.i = list;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(boolean z6) {
            this.f21950k = z6;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final c a() {
            return new c(this, (byte) 0);
        }
    }

    public interface b {
        b a(float f2);

        b a(int i);

        b a(Context context);

        b a(View view);

        b a(String str);

        b a(List<d> list);

        b a(boolean z6);

        c a();

        b b(float f2);

        b b(int i);

        b b(String str);

        b b(List<String> list);

        b c(int i);

        b c(String str);

        b d(int i);

        b e(int i);

        b f(int i);

        b g(int i);
    }

    public /* synthetic */ c(a aVar, byte b9) {
        this(aVar);
    }

    private List<String> o() {
        return this.f21935l;
    }

    private int p() {
        return this.f21936m;
    }

    private String q() {
        return this.f21937n;
    }

    private static a r() {
        return new a();
    }

    public final Context a() {
        return this.f21925a;
    }

    public final String b() {
        return this.f21926b;
    }

    public final float c() {
        return this.f21928d;
    }

    public final float d() {
        return this.f21929e;
    }

    public final int e() {
        return this.f21930f;
    }

    public final View f() {
        return this.f21932h;
    }

    public final List<d> g() {
        return this.i;
    }

    public final int h() {
        return this.f21927c;
    }

    public final int i() {
        return this.f21933j;
    }

    public final int j() {
        return this.f21931g;
    }

    public final boolean k() {
        return this.f21934k;
    }

    public final int l() {
        return this.f21938o;
    }

    public final int m() {
        return this.f21939p;
    }

    public final String n() {
        return this.f21940q;
    }

    private c(a aVar) {
        this.f21929e = aVar.f21945e;
        this.f21928d = aVar.f21944d;
        this.f21930f = aVar.f21946f;
        this.f21931g = aVar.f21947g;
        this.f21925a = aVar.f21941a;
        this.f21926b = aVar.f21942b;
        this.f21927c = aVar.f21943c;
        this.f21932h = aVar.f21948h;
        this.i = aVar.i;
        this.f21933j = aVar.f21949j;
        this.f21934k = aVar.f21950k;
        this.f21935l = aVar.f21951l;
        this.f21936m = aVar.f21952m;
        this.f21937n = aVar.f21953n;
    }
}
