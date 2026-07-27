package com.anythink.core.common.h;

import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f14101a;

    /* renamed from: b, reason: collision with root package name */
    private String f14102b;

    /* renamed from: c, reason: collision with root package name */
    private String f14103c;

    /* renamed from: d, reason: collision with root package name */
    private String f14104d;

    /* renamed from: e, reason: collision with root package name */
    private String f14105e;

    /* renamed from: f, reason: collision with root package name */
    private String f14106f;

    /* renamed from: g, reason: collision with root package name */
    private String f14107g;

    /* renamed from: h, reason: collision with root package name */
    private int f14108h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f14109j;

    /* renamed from: k, reason: collision with root package name */
    private long f14110k;

    /* renamed from: l, reason: collision with root package name */
    private String f14111l;

    /* renamed from: m, reason: collision with root package name */
    private String f14112m;

    /* renamed from: n, reason: collision with root package name */
    private int f14113n;

    /* renamed from: o, reason: collision with root package name */
    private int f14114o;

    /* renamed from: p, reason: collision with root package name */
    private long f14115p;

    public f(String str) {
        this.f14102b = str;
    }

    private String o() {
        return this.f14107g;
    }

    private int p() {
        return this.f14101a;
    }

    public final String a() {
        return this.f14102b;
    }

    public final String b() {
        return this.f14103c;
    }

    public final String c() {
        return this.f14104d;
    }

    public final String d() {
        return this.f14105e;
    }

    public final String e() {
        return this.f14106f;
    }

    public final int f() {
        return this.f14108h;
    }

    public final int g() {
        return this.i;
    }

    public final int h() {
        return this.f14109j;
    }

    public final long i() {
        return this.f14110k;
    }

    public final String j() {
        return this.f14111l;
    }

    public final String k() {
        return this.f14112m;
    }

    public final int l() {
        return this.f14113n;
    }

    public final int m() {
        return this.f14114o;
    }

    public final long n() {
        return this.f14115p;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{eventType='");
        sb.append(this.f14102b);
        sb.append("', networkId='");
        sb.append(this.f14103c);
        sb.append("', format='");
        sb.append(this.f14104d);
        sb.append("', placementId='");
        sb.append(this.f14105e);
        sb.append("', sourceId='");
        sb.append(this.f14106f);
        sb.append("', extra='");
        sb.append(this.f14107g);
        sb.append("', month=");
        sb.append(this.f14108h);
        sb.append(", day=");
        sb.append(this.i);
        sb.append(", hour=");
        sb.append(this.f14109j);
        sb.append(", timeStamp=");
        sb.append(this.f14110k);
        sb.append(", reqNum=");
        sb.append(this.f14101a);
        sb.append(", app='");
        sb.append(this.f14111l);
        sb.append("', networkFormat='");
        return AbstractC5051n.g(sb, this.f14112m, "'}");
    }

    private void c(int i) {
        this.f14101a = i;
    }

    public final void a(long j9) {
        this.f14110k = j9;
    }

    public final void b(int i) {
        this.f14114o = i;
    }

    public f(String str, String str2, String str3, long j9, int i) {
        this.f14102b = str;
        this.f14110k = j9;
        this.f14101a = i;
        str3.getClass();
        switch (str3) {
            case "network_format":
                this.f14112m = str2;
                break;
            case "source_id":
                this.f14106f = str2;
                break;
            case "format":
                this.f14104d = str2;
                break;
            case "network_id":
                this.f14103c = str2;
                break;
            case "app":
                this.f14111l = str2;
                break;
            case "placement_id":
                this.f14105e = str2;
                break;
        }
    }

    public final void a(String str) {
        this.f14106f = str;
    }

    public final void b(long j9) {
        this.f14115p = j9;
    }

    public final void a(int i) {
        this.f14113n = i;
    }

    public f(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i4, int i9, long j9) {
        this.f14102b = str;
        this.f14111l = str2;
        this.f14103c = str3;
        this.f14104d = str4;
        this.f14112m = str5;
        this.f14105e = str6;
        this.f14106f = str7;
        this.f14108h = i;
        this.i = i4;
        this.f14109j = i9;
        this.f14110k = j9;
    }
}
