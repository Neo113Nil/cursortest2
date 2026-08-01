package com.anythink.expressad.widget.rewardpopview;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.h.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: U, reason: collision with root package name */
    private static final String f22583U = "AcquireRewardPopViewParameters";

    /* renamed from: T, reason: collision with root package name */
    public com.anythink.expressad.widget.rewardpopview.a f22602T;

    /* renamed from: a, reason: collision with root package name */
    public String f22603a;

    /* renamed from: b, reason: collision with root package name */
    public String f22604b;

    /* renamed from: c, reason: collision with root package name */
    public int f22605c;

    /* renamed from: g, reason: collision with root package name */
    public String f22609g;

    /* renamed from: h, reason: collision with root package name */
    public String f22610h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f22611j;

    /* renamed from: k, reason: collision with root package name */
    public String f22612k;

    /* renamed from: l, reason: collision with root package name */
    public String f22613l;

    /* renamed from: m, reason: collision with root package name */
    public String f22614m;

    /* renamed from: n, reason: collision with root package name */
    public String f22615n;

    /* renamed from: o, reason: collision with root package name */
    public String f22616o;

    /* renamed from: p, reason: collision with root package name */
    public String f22617p;

    /* renamed from: q, reason: collision with root package name */
    public List<String> f22618q;

    /* renamed from: r, reason: collision with root package name */
    public List<String> f22619r;

    /* renamed from: d, reason: collision with root package name */
    public int f22606d = 5;

    /* renamed from: e, reason: collision with root package name */
    public int f22607e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22608f = true;

    /* renamed from: s, reason: collision with root package name */
    public int f22620s = b.f22561c;

    /* renamed from: t, reason: collision with root package name */
    public int f22621t = b.f22562d;

    /* renamed from: u, reason: collision with root package name */
    public int f22622u = b.f22563e;

    /* renamed from: v, reason: collision with root package name */
    public int f22623v = b.f22564f;

    /* renamed from: w, reason: collision with root package name */
    public int f22624w = b.f22565g;

    /* renamed from: x, reason: collision with root package name */
    public int f22625x = b.f22569l;

    /* renamed from: y, reason: collision with root package name */
    public int f22626y = b.f22566h;

    /* renamed from: z, reason: collision with root package name */
    public int f22627z = b.i;

    /* renamed from: A, reason: collision with root package name */
    public int f22584A = -1;

    /* renamed from: B, reason: collision with root package name */
    public int f22585B = b.f22567j;

    /* renamed from: C, reason: collision with root package name */
    public int f22586C = -1;

    /* renamed from: D, reason: collision with root package name */
    public int f22587D = -1;

    /* renamed from: E, reason: collision with root package name */
    public int f22588E = b.f22570m;

    /* renamed from: F, reason: collision with root package name */
    public int f22589F = b.f22573p;

    /* renamed from: G, reason: collision with root package name */
    public int f22590G = b.f22574q;

    /* renamed from: H, reason: collision with root package name */
    public int f22591H = b.f22568k;

    /* renamed from: I, reason: collision with root package name */
    public int f22592I = 40;
    public float J = 3.0f;

    /* renamed from: K, reason: collision with root package name */
    public float f22593K = 1.5f;

    /* renamed from: L, reason: collision with root package name */
    public float f22594L = 1.8f;

    /* renamed from: M, reason: collision with root package name */
    public int f22595M = -1;

    /* renamed from: N, reason: collision with root package name */
    public int f22596N = b.f22571n;

    /* renamed from: O, reason: collision with root package name */
    public int f22597O = b.f22572o;

    /* renamed from: P, reason: collision with root package name */
    public int f22598P = 40;

    /* renamed from: Q, reason: collision with root package name */
    public float f22599Q = 3.0f;

    /* renamed from: R, reason: collision with root package name */
    public float f22600R = 1.5f;

    /* renamed from: S, reason: collision with root package name */
    public float f22601S = 1.8f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private c f22628a;

        public a(String str, String str2, int i, String str3) {
            c cVar = new c();
            this.f22628a = cVar;
            cVar.f22603a = str;
            cVar.f22604b = str2;
            cVar.f22605c = i;
            cVar.f22609g = str3;
            Context g4 = t.b().g();
            this.f22628a.f22610h = g4.getString(k.a(g4, "anythink_default_question_title_text", k.f19636g));
            this.f22628a.i = g4.getString(k.a(g4, "anythink_question_tip_text", k.f19636g));
            this.f22628a.f22611j = g4.getString(k.a(g4, "anythink_success_title_text", k.f19636g));
            this.f22628a.f22612k = g4.getString(k.a(g4, "anythink_success_tip_text", k.f19636g));
            this.f22628a.f22613l = g4.getString(k.a(g4, "anythink_fail_title_text", k.f19636g));
            this.f22628a.f22614m = g4.getString(k.a(g4, "anythink_fail_tip_text", k.f19636g));
            this.f22628a.f22615n = g4.getString(k.a(g4, "anythink_slide_title_text", k.f19636g));
            this.f22628a.f22616o = g4.getString(k.a(g4, "anythink_slide_tip_text", k.f19636g));
            this.f22628a.f22617p = g4.getString(k.a(g4, "anythink_slide_success_text", k.f19636g));
            String[] stringArray = g4.getResources().getStringArray(k.a(g4, "anythink_random_answers", "array"));
            this.f22628a.f22619r = Arrays.asList(stringArray);
        }

        private void b() {
            Context g4 = t.b().g();
            this.f22628a.f22610h = g4.getString(k.a(g4, "anythink_default_question_title_text", k.f19636g));
            this.f22628a.i = g4.getString(k.a(g4, "anythink_question_tip_text", k.f19636g));
            this.f22628a.f22611j = g4.getString(k.a(g4, "anythink_success_title_text", k.f19636g));
            this.f22628a.f22612k = g4.getString(k.a(g4, "anythink_success_tip_text", k.f19636g));
            this.f22628a.f22613l = g4.getString(k.a(g4, "anythink_fail_title_text", k.f19636g));
            this.f22628a.f22614m = g4.getString(k.a(g4, "anythink_fail_tip_text", k.f19636g));
            this.f22628a.f22615n = g4.getString(k.a(g4, "anythink_slide_title_text", k.f19636g));
            this.f22628a.f22616o = g4.getString(k.a(g4, "anythink_slide_tip_text", k.f19636g));
            this.f22628a.f22617p = g4.getString(k.a(g4, "anythink_slide_success_text", k.f19636g));
            String[] stringArray = g4.getResources().getStringArray(k.a(g4, "anythink_random_answers", "array"));
            this.f22628a.f22619r = Arrays.asList(stringArray);
        }

        private a c(String str) {
            this.f22628a.f22611j = str;
            return this;
        }

        private a d(String str) {
            this.f22628a.f22612k = str;
            return this;
        }

        private a e(String str) {
            this.f22628a.f22613l = str;
            return this;
        }

        private a f(String str) {
            this.f22628a.f22614m = str;
            return this;
        }

        private a g(String str) {
            this.f22628a.f22615n = str;
            return this;
        }

        private a h(String str) {
            this.f22628a.f22616o = str;
            return this;
        }

        private a i(String str) {
            this.f22628a.f22617p = str;
            return this;
        }

        private a j(int i) {
            this.f22628a.f22627z = i;
            return this;
        }

        private a k(int i) {
            this.f22628a.f22584A = i;
            return this;
        }

        private a l(int i) {
            this.f22628a.f22585B = i;
            return this;
        }

        private a m(int i) {
            this.f22628a.f22586C = i;
            return this;
        }

        private a n(int i) {
            this.f22628a.f22587D = i;
            return this;
        }

        private a o(int i) {
            this.f22628a.f22588E = i;
            return this;
        }

        private a p(int i) {
            this.f22628a.f22589F = i;
            return this;
        }

        private a q(int i) {
            this.f22628a.f22590G = i;
            return this;
        }

        private a r(int i) {
            this.f22628a.f22591H = i;
            return this;
        }

        private a s(int i) {
            this.f22628a.f22592I = i;
            return this;
        }

        private a t(int i) {
            this.f22628a.f22595M = i;
            return this;
        }

        private a u(int i) {
            this.f22628a.f22596N = i;
            return this;
        }

        private a v(int i) {
            this.f22628a.f22597O = i;
            return this;
        }

        private a w(int i) {
            this.f22628a.f22598P = i;
            return this;
        }

        public final a a(int i) {
            this.f22628a.f22606d = i;
            return this;
        }

        private a a(boolean z3) {
            this.f22628a.f22608f = z3;
            return this;
        }

        private a c(int i) {
            this.f22628a.f22620s = i;
            return this;
        }

        private a d(int i) {
            this.f22628a.f22621t = i;
            return this;
        }

        private a e(int i) {
            this.f22628a.f22622u = i;
            return this;
        }

        private a f(int i) {
            this.f22628a.f22623v = i;
            return this;
        }

        private a g(int i) {
            this.f22628a.f22624w = i;
            return this;
        }

        private a h(int i) {
            this.f22628a.f22625x = i;
            return this;
        }

        private a i(int i) {
            this.f22628a.f22626y = i;
            return this;
        }

        private a a(String str) {
            this.f22628a.f22610h = str;
            return this;
        }

        private a c(float f3) {
            this.f22628a.f22594L = f3;
            return this;
        }

        private a d(float f3) {
            this.f22628a.f22599Q = f3;
            return this;
        }

        private a e(float f3) {
            this.f22628a.f22600R = f3;
            return this;
        }

        private a f(float f3) {
            this.f22628a.f22601S = f3;
            return this;
        }

        public final a a(ArrayList<String> arrayList) {
            this.f22628a.f22618q = arrayList;
            return this;
        }

        private a a(float f3) {
            this.f22628a.J = f3;
            return this;
        }

        public final a a(com.anythink.expressad.widget.rewardpopview.a aVar) {
            this.f22628a.f22602T = aVar;
            return this;
        }

        public final c a() {
            return this.f22628a;
        }

        public final a b(int i) {
            this.f22628a.f22607e = i;
            return this;
        }

        private a b(String str) {
            this.f22628a.i = str;
            return this;
        }

        private a b(ArrayList<String> arrayList) {
            this.f22628a.f22619r = arrayList;
            return this;
        }

        private a b(float f3) {
            this.f22628a.f22593K = f3;
            return this;
        }
    }

    private static a a(String str, String str2, int i, String str3) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (i == 0) {
            i = 1;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "EN";
        }
        return new a(str, str2, i, str3);
    }
}
