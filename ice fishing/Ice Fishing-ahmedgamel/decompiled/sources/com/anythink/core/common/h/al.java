package com.anythink.core.common.h;

import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes.dex */
public final class al {

    /* renamed from: a, reason: collision with root package name */
    private String f14284a;

    /* renamed from: b, reason: collision with root package name */
    private String f14285b;

    /* renamed from: c, reason: collision with root package name */
    private String f14286c;

    /* renamed from: d, reason: collision with root package name */
    private String f14287d;

    /* renamed from: e, reason: collision with root package name */
    private int f14288e;

    /* renamed from: f, reason: collision with root package name */
    private long f14289f;

    /* renamed from: g, reason: collision with root package name */
    private long f14290g;

    /* renamed from: h, reason: collision with root package name */
    private int f14291h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f14292j;

    /* renamed from: k, reason: collision with root package name */
    private n f14293k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f14294l;

    private al() {
    }

    public static al a(n nVar, String str, String str2, int i) {
        al alVar = new al();
        alVar.f14285b = nVar.M();
        alVar.f14287d = nVar.aJ();
        alVar.f14284a = nVar.aI();
        alVar.f14288e = nVar.Y();
        alVar.f14289f = System.currentTimeMillis();
        alVar.f14291h = i;
        alVar.i = str;
        alVar.f14292j = str2;
        alVar.f14293k = nVar;
        return alVar;
    }

    public final String b() {
        String str = this.f14284a;
        return str != null ? str : "";
    }

    public final int c() {
        return this.f14288e;
    }

    public final int d() {
        return this.f14291h;
    }

    public final String e() {
        return this.i + "," + this.f14292j;
    }

    public final long f() {
        return this.f14289f + this.f14290g;
    }

    public final String g() {
        return this.f14287d;
    }

    public final String h() {
        return this.f14286c;
    }

    public final n i() {
        return this.f14293k;
    }

    public final boolean j() {
        return this.f14294l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DynWFAdSourceRecordEntity{placementId='");
        sb.append(this.f14284a);
        sb.append("', adSourceId='");
        sb.append(this.f14285b);
        sb.append("', requestId='");
        sb.append(this.f14287d);
        sb.append("', networkFirmId=");
        sb.append(this.f14288e);
        sb.append("', recordTimeStamp=");
        sb.append(this.f14289f);
        sb.append("', recordTimeInterval=");
        sb.append(this.f14290g);
        sb.append("', recordTimeType=");
        sb.append(this.f14291h);
        sb.append("', networkErrorCode='");
        sb.append(this.i);
        sb.append("', networkErrorMsg='");
        sb.append(this.f14292j);
        sb.append("', serverErrorCode='");
        return Wv.i(sb, this.f14286c, "'}");
    }

    public final String a() {
        return this.f14285b;
    }

    public final void a(long j6) {
        this.f14290g = j6;
    }

    public final void a(String str) {
        this.f14286c = str;
    }

    public final void a(boolean z6) {
        this.f14294l = z6;
    }
}
