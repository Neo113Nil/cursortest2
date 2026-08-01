package com.anythink.expressad.mbbanner.a.b;

import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.h.n;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f19856a = "2000067";

    /* renamed from: b, reason: collision with root package name */
    public static final String f19857b = "2000068";

    /* renamed from: c, reason: collision with root package name */
    public static final String f19858c = "2000069";

    /* renamed from: d, reason: collision with root package name */
    private String f19859d;

    /* renamed from: e, reason: collision with root package name */
    private String f19860e;

    /* renamed from: f, reason: collision with root package name */
    private String f19861f;

    /* renamed from: g, reason: collision with root package name */
    private String f19862g;

    /* renamed from: h, reason: collision with root package name */
    private String f19863h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f19864j;

    /* renamed from: k, reason: collision with root package name */
    private String f19865k;

    /* renamed from: l, reason: collision with root package name */
    private int f19866l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f19867m;

    private c() {
    }

    private c a(boolean z3) {
        this.f19867m = z3;
        return this;
    }

    private String b() {
        return this.f19859d;
    }

    private String c() {
        return this.f19860e;
    }

    private String d() {
        return this.f19861f;
    }

    private String e() {
        return this.f19862g;
    }

    private String f() {
        return this.f19863h;
    }

    private String g() {
        return this.i;
    }

    private String h() {
        return this.f19864j;
    }

    private String i() {
        return this.f19865k;
    }

    private int j() {
        return this.f19866l;
    }

    private String k() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f19860e)) {
            sb.append("unit_id=");
            sb.append(this.f19860e);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f19862g)) {
            sb.append("cid=");
            sb.append(this.f19862g);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f19863h)) {
            sb.append("rid=");
            sb.append(this.f19863h);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.i)) {
            sb.append("rid_n=");
            sb.append(this.i);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f19864j)) {
            sb.append("creative_id=");
            sb.append(this.f19864j);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f19865k)) {
            sb.append("reason=");
            sb.append(this.f19865k);
            sb.append("&");
        }
        if (this.f19866l != 0) {
            sb.append("result=");
            sb.append(this.f19866l);
            sb.append("&");
        }
        if (this.f19867m) {
            sb.append("hb=1&");
        }
        sb.append("network_type=");
        t.b().g();
        sb.append(n.b());
        sb.append("&");
        if (!TextUtils.isEmpty(this.f19859d)) {
            sb.append("key=");
            sb.append(this.f19859d);
        }
        return sb.toString();
    }

    private static c a() {
        return new c();
    }

    private c b(String str) {
        this.f19860e = str;
        return this;
    }

    private c c(String str) {
        this.f19861f = str;
        return this;
    }

    private c d(String str) {
        this.f19862g = str;
        return this;
    }

    private c e(String str) {
        this.f19863h = str;
        return this;
    }

    private c f(String str) {
        this.i = str;
        return this;
    }

    private c g(String str) {
        this.f19864j = str;
        return this;
    }

    private c h(String str) {
        this.f19865k = str;
        return this;
    }

    private c a(String str) {
        this.f19859d = str;
        return this;
    }

    private c a(int i) {
        this.f19866l = i;
        return this;
    }
}
