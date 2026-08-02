package com.anythink.core.common.h;

import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f14730a;

    /* renamed from: b, reason: collision with root package name */
    private String f14731b;

    /* renamed from: c, reason: collision with root package name */
    private String f14732c;

    /* renamed from: d, reason: collision with root package name */
    private String f14733d;

    /* renamed from: e, reason: collision with root package name */
    private String f14734e;

    /* renamed from: f, reason: collision with root package name */
    private String f14735f;

    /* renamed from: g, reason: collision with root package name */
    private String f14736g;

    /* renamed from: h, reason: collision with root package name */
    private int f14737h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f14738j;

    /* renamed from: k, reason: collision with root package name */
    private long f14739k;

    /* renamed from: l, reason: collision with root package name */
    private String f14740l;

    /* renamed from: m, reason: collision with root package name */
    private String f14741m;

    /* renamed from: n, reason: collision with root package name */
    private int f14742n;

    /* renamed from: o, reason: collision with root package name */
    private int f14743o;

    /* renamed from: p, reason: collision with root package name */
    private long f14744p;

    public f(String str) {
        this.f14731b = str;
    }

    private String o() {
        return this.f14736g;
    }

    private int p() {
        return this.f14730a;
    }

    public final String a() {
        return this.f14731b;
    }

    public final String b() {
        return this.f14732c;
    }

    public final String c() {
        return this.f14733d;
    }

    public final String d() {
        return this.f14734e;
    }

    public final String e() {
        return this.f14735f;
    }

    public final int f() {
        return this.f14737h;
    }

    public final int g() {
        return this.i;
    }

    public final int h() {
        return this.f14738j;
    }

    public final long i() {
        return this.f14739k;
    }

    public final String j() {
        return this.f14740l;
    }

    public final String k() {
        return this.f14741m;
    }

    public final int l() {
        return this.f14742n;
    }

    public final int m() {
        return this.f14743o;
    }

    public final long n() {
        return this.f14744p;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{eventType='");
        sb.append(this.f14731b);
        sb.append("', networkId='");
        sb.append(this.f14732c);
        sb.append("', format='");
        sb.append(this.f14733d);
        sb.append("', placementId='");
        sb.append(this.f14734e);
        sb.append("', sourceId='");
        sb.append(this.f14735f);
        sb.append("', extra='");
        sb.append(this.f14736g);
        sb.append("', month=");
        sb.append(this.f14737h);
        sb.append(", day=");
        sb.append(this.i);
        sb.append(", hour=");
        sb.append(this.f14738j);
        sb.append(", timeStamp=");
        sb.append(this.f14739k);
        sb.append(", reqNum=");
        sb.append(this.f14730a);
        sb.append(", app='");
        sb.append(this.f14740l);
        sb.append("', networkFormat='");
        return Wv.i(sb, this.f14741m, "'}");
    }

    private void c(int i) {
        this.f14730a = i;
    }

    public final void a(long j6) {
        this.f14739k = j6;
    }

    public final void b(int i) {
        this.f14743o = i;
    }

    public f(String str, String str2, String str3, long j6, int i) {
        this.f14731b = str;
        this.f14739k = j6;
        this.f14730a = i;
        str3.getClass();
        switch (str3) {
            case "network_format":
                this.f14741m = str2;
                break;
            case "source_id":
                this.f14735f = str2;
                break;
            case "format":
                this.f14733d = str2;
                break;
            case "network_id":
                this.f14732c = str2;
                break;
            case "app":
                this.f14740l = str2;
                break;
            case "placement_id":
                this.f14734e = str2;
                break;
        }
    }

    public final void a(String str) {
        this.f14735f = str;
    }

    public final void b(long j6) {
        this.f14744p = j6;
    }

    public final void a(int i) {
        this.f14742n = i;
    }

    public f(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i4, int i6, long j6) {
        this.f14731b = str;
        this.f14740l = str2;
        this.f14732c = str3;
        this.f14733d = str4;
        this.f14741m = str5;
        this.f14734e = str6;
        this.f14735f = str7;
        this.f14737h = i;
        this.i = i4;
        this.f14738j = i6;
        this.f14739k = j6;
    }
}
