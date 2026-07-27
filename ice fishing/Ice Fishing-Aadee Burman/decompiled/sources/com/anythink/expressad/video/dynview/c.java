package com.anythink.expressad.video.dynview;

import android.content.Context;
import android.view.View;
import com.anythink.expressad.foundation.d.d;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private Context f21138a;

    /* renamed from: b, reason: collision with root package name */
    private String f21139b;

    /* renamed from: c, reason: collision with root package name */
    private int f21140c;

    /* renamed from: d, reason: collision with root package name */
    private float f21141d;

    /* renamed from: e, reason: collision with root package name */
    private float f21142e;

    /* renamed from: f, reason: collision with root package name */
    private int f21143f;

    /* renamed from: g, reason: collision with root package name */
    private int f21144g;

    /* renamed from: h, reason: collision with root package name */
    private View f21145h;
    private List<d> i;

    /* renamed from: j, reason: collision with root package name */
    private int f21146j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21147k;

    /* renamed from: l, reason: collision with root package name */
    private List<String> f21148l;

    /* renamed from: m, reason: collision with root package name */
    private int f21149m;

    /* renamed from: n, reason: collision with root package name */
    private String f21150n;

    /* renamed from: o, reason: collision with root package name */
    private int f21151o;

    /* renamed from: p, reason: collision with root package name */
    private int f21152p;

    /* renamed from: q, reason: collision with root package name */
    private String f21153q;

    public static class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private Context f21154a;

        /* renamed from: b, reason: collision with root package name */
        private String f21155b;

        /* renamed from: c, reason: collision with root package name */
        private int f21156c;

        /* renamed from: d, reason: collision with root package name */
        private float f21157d;

        /* renamed from: e, reason: collision with root package name */
        private float f21158e;

        /* renamed from: f, reason: collision with root package name */
        private int f21159f;

        /* renamed from: g, reason: collision with root package name */
        private int f21160g;

        /* renamed from: h, reason: collision with root package name */
        private View f21161h;
        private List<d> i;

        /* renamed from: j, reason: collision with root package name */
        private int f21162j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f21163k;

        /* renamed from: l, reason: collision with root package name */
        private List<String> f21164l;

        /* renamed from: m, reason: collision with root package name */
        private int f21165m;

        /* renamed from: n, reason: collision with root package name */
        private String f21166n;

        /* renamed from: o, reason: collision with root package name */
        private int f21167o;

        /* renamed from: p, reason: collision with root package name */
        private int f21168p = 1;

        /* renamed from: q, reason: collision with root package name */
        private String f21169q;

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(Context context) {
            this.f21154a = context.getApplicationContext();
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b b(float f3) {
            this.f21158e = f3;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b c(int i) {
            this.f21160g = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b d(int i) {
            this.f21162j = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b e(int i) {
            this.f21165m = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b f(int i) {
            this.f21167o = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b g(int i) {
            this.f21168p = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(String str) {
            this.f21155b = str;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b b(int i) {
            this.f21159f = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b c(String str) {
            this.f21169q = str;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(int i) {
            this.f21156c = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b b(List<String> list) {
            this.f21164l = list;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(float f3) {
            this.f21157d = f3;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b b(String str) {
            this.f21166n = str;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(View view) {
            this.f21161h = view;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(List<d> list) {
            this.i = list;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(boolean z3) {
            this.f21163k = z3;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final c a() {
            return new c(this, (byte) 0);
        }
    }

    public interface b {
        b a(float f3);

        b a(int i);

        b a(Context context);

        b a(View view);

        b a(String str);

        b a(List<d> list);

        b a(boolean z3);

        c a();

        b b(float f3);

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
        return this.f21148l;
    }

    private int p() {
        return this.f21149m;
    }

    private String q() {
        return this.f21150n;
    }

    private static a r() {
        return new a();
    }

    public final Context a() {
        return this.f21138a;
    }

    public final String b() {
        return this.f21139b;
    }

    public final float c() {
        return this.f21141d;
    }

    public final float d() {
        return this.f21142e;
    }

    public final int e() {
        return this.f21143f;
    }

    public final View f() {
        return this.f21145h;
    }

    public final List<d> g() {
        return this.i;
    }

    public final int h() {
        return this.f21140c;
    }

    public final int i() {
        return this.f21146j;
    }

    public final int j() {
        return this.f21144g;
    }

    public final boolean k() {
        return this.f21147k;
    }

    public final int l() {
        return this.f21151o;
    }

    public final int m() {
        return this.f21152p;
    }

    public final String n() {
        return this.f21153q;
    }

    private c(a aVar) {
        this.f21142e = aVar.f21158e;
        this.f21141d = aVar.f21157d;
        this.f21143f = aVar.f21159f;
        this.f21144g = aVar.f21160g;
        this.f21138a = aVar.f21154a;
        this.f21139b = aVar.f21155b;
        this.f21140c = aVar.f21156c;
        this.f21145h = aVar.f21161h;
        this.i = aVar.i;
        this.f21146j = aVar.f21162j;
        this.f21147k = aVar.f21163k;
        this.f21148l = aVar.f21164l;
        this.f21149m = aVar.f21165m;
        this.f21150n = aVar.f21166n;
    }
}
