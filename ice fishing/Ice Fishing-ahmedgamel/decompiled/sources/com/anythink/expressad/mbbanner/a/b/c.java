package com.anythink.expressad.mbbanner.a.b;

import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.h.n;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20643a = "2000067";

    /* renamed from: b, reason: collision with root package name */
    public static final String f20644b = "2000068";

    /* renamed from: c, reason: collision with root package name */
    public static final String f20645c = "2000069";

    /* renamed from: d, reason: collision with root package name */
    private String f20646d;

    /* renamed from: e, reason: collision with root package name */
    private String f20647e;

    /* renamed from: f, reason: collision with root package name */
    private String f20648f;

    /* renamed from: g, reason: collision with root package name */
    private String f20649g;

    /* renamed from: h, reason: collision with root package name */
    private String f20650h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f20651j;

    /* renamed from: k, reason: collision with root package name */
    private String f20652k;

    /* renamed from: l, reason: collision with root package name */
    private int f20653l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f20654m;

    private c() {
    }

    private c a(boolean z6) {
        this.f20654m = z6;
        return this;
    }

    private String b() {
        return this.f20646d;
    }

    private String c() {
        return this.f20647e;
    }

    private String d() {
        return this.f20648f;
    }

    private String e() {
        return this.f20649g;
    }

    private String f() {
        return this.f20650h;
    }

    private String g() {
        return this.i;
    }

    private String h() {
        return this.f20651j;
    }

    private String i() {
        return this.f20652k;
    }

    private int j() {
        return this.f20653l;
    }

    private String k() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f20647e)) {
            sb.append("unit_id=");
            sb.append(this.f20647e);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f20649g)) {
            sb.append("cid=");
            sb.append(this.f20649g);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f20650h)) {
            sb.append("rid=");
            sb.append(this.f20650h);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.i)) {
            sb.append("rid_n=");
            sb.append(this.i);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f20651j)) {
            sb.append("creative_id=");
            sb.append(this.f20651j);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f20652k)) {
            sb.append("reason=");
            sb.append(this.f20652k);
            sb.append("&");
        }
        if (this.f20653l != 0) {
            sb.append("result=");
            sb.append(this.f20653l);
            sb.append("&");
        }
        if (this.f20654m) {
            sb.append("hb=1&");
        }
        sb.append("network_type=");
        t.b().g();
        sb.append(n.b());
        sb.append("&");
        if (!TextUtils.isEmpty(this.f20646d)) {
            sb.append("key=");
            sb.append(this.f20646d);
        }
        return sb.toString();
    }

    private static c a() {
        return new c();
    }

    private c b(String str) {
        this.f20647e = str;
        return this;
    }

    private c c(String str) {
        this.f20648f = str;
        return this;
    }

    private c d(String str) {
        this.f20649g = str;
        return this;
    }

    private c e(String str) {
        this.f20650h = str;
        return this;
    }

    private c f(String str) {
        this.i = str;
        return this;
    }

    private c g(String str) {
        this.f20651j = str;
        return this;
    }

    private c h(String str) {
        this.f20652k = str;
        return this;
    }

    private c a(String str) {
        this.f20646d = str;
        return this;
    }

    private c a(int i) {
        this.f20653l = i;
        return this;
    }
}
