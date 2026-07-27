package com.anythink.core.common.h;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f13944a;

    /* renamed from: b, reason: collision with root package name */
    private String f13945b;

    /* renamed from: c, reason: collision with root package name */
    private String f13946c;

    /* renamed from: d, reason: collision with root package name */
    private String f13947d;

    /* renamed from: e, reason: collision with root package name */
    private String f13948e;

    /* renamed from: f, reason: collision with root package name */
    private String f13949f;

    /* renamed from: g, reason: collision with root package name */
    private String f13950g;

    /* renamed from: h, reason: collision with root package name */
    private int f13951h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f13952j;

    /* renamed from: k, reason: collision with root package name */
    private long f13953k;

    /* renamed from: l, reason: collision with root package name */
    private String f13954l;

    /* renamed from: m, reason: collision with root package name */
    private String f13955m;

    /* renamed from: n, reason: collision with root package name */
    private int f13956n;

    /* renamed from: o, reason: collision with root package name */
    private int f13957o;

    /* renamed from: p, reason: collision with root package name */
    private long f13958p;

    public f(String str) {
        this.f13945b = str;
    }

    private String o() {
        return this.f13950g;
    }

    private int p() {
        return this.f13944a;
    }

    public final String a() {
        return this.f13945b;
    }

    public final String b() {
        return this.f13946c;
    }

    public final String c() {
        return this.f13947d;
    }

    public final String d() {
        return this.f13948e;
    }

    public final String e() {
        return this.f13949f;
    }

    public final int f() {
        return this.f13951h;
    }

    public final int g() {
        return this.i;
    }

    public final int h() {
        return this.f13952j;
    }

    public final long i() {
        return this.f13953k;
    }

    public final String j() {
        return this.f13954l;
    }

    public final String k() {
        return this.f13955m;
    }

    public final int l() {
        return this.f13956n;
    }

    public final int m() {
        return this.f13957o;
    }

    public final long n() {
        return this.f13958p;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{eventType='");
        sb.append(this.f13945b);
        sb.append("', networkId='");
        sb.append(this.f13946c);
        sb.append("', format='");
        sb.append(this.f13947d);
        sb.append("', placementId='");
        sb.append(this.f13948e);
        sb.append("', sourceId='");
        sb.append(this.f13949f);
        sb.append("', extra='");
        sb.append(this.f13950g);
        sb.append("', month=");
        sb.append(this.f13951h);
        sb.append(", day=");
        sb.append(this.i);
        sb.append(", hour=");
        sb.append(this.f13952j);
        sb.append(", timeStamp=");
        sb.append(this.f13953k);
        sb.append(", reqNum=");
        sb.append(this.f13944a);
        sb.append(", app='");
        sb.append(this.f13954l);
        sb.append("', networkFormat='");
        return u1.h.g(sb, this.f13955m, "'}");
    }

    private void c(int i) {
        this.f13944a = i;
    }

    public final void a(long j6) {
        this.f13953k = j6;
    }

    public final void b(int i) {
        this.f13957o = i;
    }

    public f(String str, String str2, String str3, long j6, int i) {
        this.f13945b = str;
        this.f13953k = j6;
        this.f13944a = i;
        str3.getClass();
        switch (str3) {
            case "network_format":
                this.f13955m = str2;
                break;
            case "source_id":
                this.f13949f = str2;
                break;
            case "format":
                this.f13947d = str2;
                break;
            case "network_id":
                this.f13946c = str2;
                break;
            case "app":
                this.f13954l = str2;
                break;
            case "placement_id":
                this.f13948e = str2;
                break;
        }
    }

    public final void a(String str) {
        this.f13949f = str;
    }

    public final void b(long j6) {
        this.f13958p = j6;
    }

    public final void a(int i) {
        this.f13956n = i;
    }

    public f(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i6, int i9, long j6) {
        this.f13945b = str;
        this.f13954l = str2;
        this.f13946c = str3;
        this.f13947d = str4;
        this.f13955m = str5;
        this.f13948e = str6;
        this.f13949f = str7;
        this.f13951h = i;
        this.i = i6;
        this.f13952j = i9;
        this.f13953k = j6;
    }
}
