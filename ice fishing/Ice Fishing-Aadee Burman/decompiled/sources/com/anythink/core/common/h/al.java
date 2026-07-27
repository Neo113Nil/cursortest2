package com.anythink.core.common.h;

/* loaded from: classes.dex */
public final class al {

    /* renamed from: a, reason: collision with root package name */
    private String f13498a;

    /* renamed from: b, reason: collision with root package name */
    private String f13499b;

    /* renamed from: c, reason: collision with root package name */
    private String f13500c;

    /* renamed from: d, reason: collision with root package name */
    private String f13501d;

    /* renamed from: e, reason: collision with root package name */
    private int f13502e;

    /* renamed from: f, reason: collision with root package name */
    private long f13503f;

    /* renamed from: g, reason: collision with root package name */
    private long f13504g;

    /* renamed from: h, reason: collision with root package name */
    private int f13505h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f13506j;

    /* renamed from: k, reason: collision with root package name */
    private n f13507k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f13508l;

    private al() {
    }

    public static al a(n nVar, String str, String str2, int i) {
        al alVar = new al();
        alVar.f13499b = nVar.M();
        alVar.f13501d = nVar.aJ();
        alVar.f13498a = nVar.aI();
        alVar.f13502e = nVar.Y();
        alVar.f13503f = System.currentTimeMillis();
        alVar.f13505h = i;
        alVar.i = str;
        alVar.f13506j = str2;
        alVar.f13507k = nVar;
        return alVar;
    }

    public final String b() {
        String str = this.f13498a;
        return str != null ? str : "";
    }

    public final int c() {
        return this.f13502e;
    }

    public final int d() {
        return this.f13505h;
    }

    public final String e() {
        return this.i + "," + this.f13506j;
    }

    public final long f() {
        return this.f13503f + this.f13504g;
    }

    public final String g() {
        return this.f13501d;
    }

    public final String h() {
        return this.f13500c;
    }

    public final n i() {
        return this.f13507k;
    }

    public final boolean j() {
        return this.f13508l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DynWFAdSourceRecordEntity{placementId='");
        sb.append(this.f13498a);
        sb.append("', adSourceId='");
        sb.append(this.f13499b);
        sb.append("', requestId='");
        sb.append(this.f13501d);
        sb.append("', networkFirmId=");
        sb.append(this.f13502e);
        sb.append("', recordTimeStamp=");
        sb.append(this.f13503f);
        sb.append("', recordTimeInterval=");
        sb.append(this.f13504g);
        sb.append("', recordTimeType=");
        sb.append(this.f13505h);
        sb.append("', networkErrorCode='");
        sb.append(this.i);
        sb.append("', networkErrorMsg='");
        sb.append(this.f13506j);
        sb.append("', serverErrorCode='");
        return u1.h.g(sb, this.f13500c, "'}");
    }

    public final String a() {
        return this.f13499b;
    }

    public final void a(long j6) {
        this.f13504g = j6;
    }

    public final void a(String str) {
        this.f13500c = str;
    }

    public final void a(boolean z3) {
        this.f13508l = z3;
    }
}
