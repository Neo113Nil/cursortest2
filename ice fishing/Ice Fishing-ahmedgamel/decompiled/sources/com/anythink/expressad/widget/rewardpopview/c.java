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
    private static final String f23370U = "AcquireRewardPopViewParameters";

    /* renamed from: T, reason: collision with root package name */
    public com.anythink.expressad.widget.rewardpopview.a f23389T;

    /* renamed from: a, reason: collision with root package name */
    public String f23390a;

    /* renamed from: b, reason: collision with root package name */
    public String f23391b;

    /* renamed from: c, reason: collision with root package name */
    public int f23392c;

    /* renamed from: g, reason: collision with root package name */
    public String f23396g;

    /* renamed from: h, reason: collision with root package name */
    public String f23397h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f23398j;

    /* renamed from: k, reason: collision with root package name */
    public String f23399k;

    /* renamed from: l, reason: collision with root package name */
    public String f23400l;

    /* renamed from: m, reason: collision with root package name */
    public String f23401m;

    /* renamed from: n, reason: collision with root package name */
    public String f23402n;

    /* renamed from: o, reason: collision with root package name */
    public String f23403o;

    /* renamed from: p, reason: collision with root package name */
    public String f23404p;

    /* renamed from: q, reason: collision with root package name */
    public List<String> f23405q;

    /* renamed from: r, reason: collision with root package name */
    public List<String> f23406r;

    /* renamed from: d, reason: collision with root package name */
    public int f23393d = 5;

    /* renamed from: e, reason: collision with root package name */
    public int f23394e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23395f = true;

    /* renamed from: s, reason: collision with root package name */
    public int f23407s = b.f23348c;

    /* renamed from: t, reason: collision with root package name */
    public int f23408t = b.f23349d;

    /* renamed from: u, reason: collision with root package name */
    public int f23409u = b.f23350e;

    /* renamed from: v, reason: collision with root package name */
    public int f23410v = b.f23351f;

    /* renamed from: w, reason: collision with root package name */
    public int f23411w = b.f23352g;

    /* renamed from: x, reason: collision with root package name */
    public int f23412x = b.f23356l;

    /* renamed from: y, reason: collision with root package name */
    public int f23413y = b.f23353h;

    /* renamed from: z, reason: collision with root package name */
    public int f23414z = b.i;

    /* renamed from: A, reason: collision with root package name */
    public int f23371A = -1;

    /* renamed from: B, reason: collision with root package name */
    public int f23372B = b.f23354j;

    /* renamed from: C, reason: collision with root package name */
    public int f23373C = -1;

    /* renamed from: D, reason: collision with root package name */
    public int f23374D = -1;

    /* renamed from: E, reason: collision with root package name */
    public int f23375E = b.f23357m;

    /* renamed from: F, reason: collision with root package name */
    public int f23376F = b.f23360p;

    /* renamed from: G, reason: collision with root package name */
    public int f23377G = b.f23361q;

    /* renamed from: H, reason: collision with root package name */
    public int f23378H = b.f23355k;

    /* renamed from: I, reason: collision with root package name */
    public int f23379I = 40;
    public float J = 3.0f;

    /* renamed from: K, reason: collision with root package name */
    public float f23380K = 1.5f;

    /* renamed from: L, reason: collision with root package name */
    public float f23381L = 1.8f;

    /* renamed from: M, reason: collision with root package name */
    public int f23382M = -1;

    /* renamed from: N, reason: collision with root package name */
    public int f23383N = b.f23358n;

    /* renamed from: O, reason: collision with root package name */
    public int f23384O = b.f23359o;

    /* renamed from: P, reason: collision with root package name */
    public int f23385P = 40;

    /* renamed from: Q, reason: collision with root package name */
    public float f23386Q = 3.0f;

    /* renamed from: R, reason: collision with root package name */
    public float f23387R = 1.5f;

    /* renamed from: S, reason: collision with root package name */
    public float f23388S = 1.8f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private c f23415a;

        public a(String str, String str2, int i, String str3) {
            c cVar = new c();
            this.f23415a = cVar;
            cVar.f23390a = str;
            cVar.f23391b = str2;
            cVar.f23392c = i;
            cVar.f23396g = str3;
            Context g9 = t.b().g();
            this.f23415a.f23397h = g9.getString(k.a(g9, "anythink_default_question_title_text", k.f20423g));
            this.f23415a.i = g9.getString(k.a(g9, "anythink_question_tip_text", k.f20423g));
            this.f23415a.f23398j = g9.getString(k.a(g9, "anythink_success_title_text", k.f20423g));
            this.f23415a.f23399k = g9.getString(k.a(g9, "anythink_success_tip_text", k.f20423g));
            this.f23415a.f23400l = g9.getString(k.a(g9, "anythink_fail_title_text", k.f20423g));
            this.f23415a.f23401m = g9.getString(k.a(g9, "anythink_fail_tip_text", k.f20423g));
            this.f23415a.f23402n = g9.getString(k.a(g9, "anythink_slide_title_text", k.f20423g));
            this.f23415a.f23403o = g9.getString(k.a(g9, "anythink_slide_tip_text", k.f20423g));
            this.f23415a.f23404p = g9.getString(k.a(g9, "anythink_slide_success_text", k.f20423g));
            String[] stringArray = g9.getResources().getStringArray(k.a(g9, "anythink_random_answers", "array"));
            this.f23415a.f23406r = Arrays.asList(stringArray);
        }

        private void b() {
            Context g9 = t.b().g();
            this.f23415a.f23397h = g9.getString(k.a(g9, "anythink_default_question_title_text", k.f20423g));
            this.f23415a.i = g9.getString(k.a(g9, "anythink_question_tip_text", k.f20423g));
            this.f23415a.f23398j = g9.getString(k.a(g9, "anythink_success_title_text", k.f20423g));
            this.f23415a.f23399k = g9.getString(k.a(g9, "anythink_success_tip_text", k.f20423g));
            this.f23415a.f23400l = g9.getString(k.a(g9, "anythink_fail_title_text", k.f20423g));
            this.f23415a.f23401m = g9.getString(k.a(g9, "anythink_fail_tip_text", k.f20423g));
            this.f23415a.f23402n = g9.getString(k.a(g9, "anythink_slide_title_text", k.f20423g));
            this.f23415a.f23403o = g9.getString(k.a(g9, "anythink_slide_tip_text", k.f20423g));
            this.f23415a.f23404p = g9.getString(k.a(g9, "anythink_slide_success_text", k.f20423g));
            String[] stringArray = g9.getResources().getStringArray(k.a(g9, "anythink_random_answers", "array"));
            this.f23415a.f23406r = Arrays.asList(stringArray);
        }

        private a c(String str) {
            this.f23415a.f23398j = str;
            return this;
        }

        private a d(String str) {
            this.f23415a.f23399k = str;
            return this;
        }

        private a e(String str) {
            this.f23415a.f23400l = str;
            return this;
        }

        private a f(String str) {
            this.f23415a.f23401m = str;
            return this;
        }

        private a g(String str) {
            this.f23415a.f23402n = str;
            return this;
        }

        private a h(String str) {
            this.f23415a.f23403o = str;
            return this;
        }

        private a i(String str) {
            this.f23415a.f23404p = str;
            return this;
        }

        private a j(int i) {
            this.f23415a.f23414z = i;
            return this;
        }

        private a k(int i) {
            this.f23415a.f23371A = i;
            return this;
        }

        private a l(int i) {
            this.f23415a.f23372B = i;
            return this;
        }

        private a m(int i) {
            this.f23415a.f23373C = i;
            return this;
        }

        private a n(int i) {
            this.f23415a.f23374D = i;
            return this;
        }

        private a o(int i) {
            this.f23415a.f23375E = i;
            return this;
        }

        private a p(int i) {
            this.f23415a.f23376F = i;
            return this;
        }

        private a q(int i) {
            this.f23415a.f23377G = i;
            return this;
        }

        private a r(int i) {
            this.f23415a.f23378H = i;
            return this;
        }

        private a s(int i) {
            this.f23415a.f23379I = i;
            return this;
        }

        private a t(int i) {
            this.f23415a.f23382M = i;
            return this;
        }

        private a u(int i) {
            this.f23415a.f23383N = i;
            return this;
        }

        private a v(int i) {
            this.f23415a.f23384O = i;
            return this;
        }

        private a w(int i) {
            this.f23415a.f23385P = i;
            return this;
        }

        public final a a(int i) {
            this.f23415a.f23393d = i;
            return this;
        }

        private a a(boolean z6) {
            this.f23415a.f23395f = z6;
            return this;
        }

        private a c(int i) {
            this.f23415a.f23407s = i;
            return this;
        }

        private a d(int i) {
            this.f23415a.f23408t = i;
            return this;
        }

        private a e(int i) {
            this.f23415a.f23409u = i;
            return this;
        }

        private a f(int i) {
            this.f23415a.f23410v = i;
            return this;
        }

        private a g(int i) {
            this.f23415a.f23411w = i;
            return this;
        }

        private a h(int i) {
            this.f23415a.f23412x = i;
            return this;
        }

        private a i(int i) {
            this.f23415a.f23413y = i;
            return this;
        }

        private a a(String str) {
            this.f23415a.f23397h = str;
            return this;
        }

        private a c(float f2) {
            this.f23415a.f23381L = f2;
            return this;
        }

        private a d(float f2) {
            this.f23415a.f23386Q = f2;
            return this;
        }

        private a e(float f2) {
            this.f23415a.f23387R = f2;
            return this;
        }

        private a f(float f2) {
            this.f23415a.f23388S = f2;
            return this;
        }

        public final a a(ArrayList<String> arrayList) {
            this.f23415a.f23405q = arrayList;
            return this;
        }

        private a a(float f2) {
            this.f23415a.J = f2;
            return this;
        }

        public final a a(com.anythink.expressad.widget.rewardpopview.a aVar) {
            this.f23415a.f23389T = aVar;
            return this;
        }

        public final c a() {
            return this.f23415a;
        }

        public final a b(int i) {
            this.f23415a.f23394e = i;
            return this;
        }

        private a b(String str) {
            this.f23415a.i = str;
            return this;
        }

        private a b(ArrayList<String> arrayList) {
            this.f23415a.f23406r = arrayList;
            return this;
        }

        private a b(float f2) {
            this.f23415a.f23380K = f2;
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
