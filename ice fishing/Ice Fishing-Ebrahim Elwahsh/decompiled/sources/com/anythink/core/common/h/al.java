package com.anythink.core.common.h;

import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class al {

    /* renamed from: a, reason: collision with root package name */
    private String f13655a;

    /* renamed from: b, reason: collision with root package name */
    private String f13656b;

    /* renamed from: c, reason: collision with root package name */
    private String f13657c;

    /* renamed from: d, reason: collision with root package name */
    private String f13658d;

    /* renamed from: e, reason: collision with root package name */
    private int f13659e;

    /* renamed from: f, reason: collision with root package name */
    private long f13660f;

    /* renamed from: g, reason: collision with root package name */
    private long f13661g;

    /* renamed from: h, reason: collision with root package name */
    private int f13662h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f13663j;

    /* renamed from: k, reason: collision with root package name */
    private n f13664k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f13665l;

    private al() {
    }

    public static al a(n nVar, String str, String str2, int i) {
        al alVar = new al();
        alVar.f13656b = nVar.M();
        alVar.f13658d = nVar.aJ();
        alVar.f13655a = nVar.aI();
        alVar.f13659e = nVar.Y();
        alVar.f13660f = System.currentTimeMillis();
        alVar.f13662h = i;
        alVar.i = str;
        alVar.f13663j = str2;
        alVar.f13664k = nVar;
        return alVar;
    }

    public final String b() {
        String str = this.f13655a;
        return str != null ? str : "";
    }

    public final int c() {
        return this.f13659e;
    }

    public final int d() {
        return this.f13662h;
    }

    public final String e() {
        return this.i + "," + this.f13663j;
    }

    public final long f() {
        return this.f13660f + this.f13661g;
    }

    public final String g() {
        return this.f13658d;
    }

    public final String h() {
        return this.f13657c;
    }

    public final n i() {
        return this.f13664k;
    }

    public final boolean j() {
        return this.f13665l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DynWFAdSourceRecordEntity{placementId='");
        sb.append(this.f13655a);
        sb.append("', adSourceId='");
        sb.append(this.f13656b);
        sb.append("', requestId='");
        sb.append(this.f13658d);
        sb.append("', networkFirmId=");
        sb.append(this.f13659e);
        sb.append("', recordTimeStamp=");
        sb.append(this.f13660f);
        sb.append("', recordTimeInterval=");
        sb.append(this.f13661g);
        sb.append("', recordTimeType=");
        sb.append(this.f13662h);
        sb.append("', networkErrorCode='");
        sb.append(this.i);
        sb.append("', networkErrorMsg='");
        sb.append(this.f13663j);
        sb.append("', serverErrorCode='");
        return AbstractC5051n.g(sb, this.f13657c, "'}");
    }

    public final String a() {
        return this.f13656b;
    }

    public final void a(long j9) {
        this.f13661g = j9;
    }

    public final void a(String str) {
        this.f13657c = str;
    }

    public final void a(boolean z8) {
        this.f13665l = z8;
    }
}
