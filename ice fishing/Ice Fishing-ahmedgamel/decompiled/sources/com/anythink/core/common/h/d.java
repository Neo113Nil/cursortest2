package com.anythink.core.common.h;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private String f14715a;

    /* renamed from: b, reason: collision with root package name */
    private int f14716b;

    /* renamed from: c, reason: collision with root package name */
    private int f14717c;

    /* renamed from: d, reason: collision with root package name */
    private String f14718d;

    /* renamed from: e, reason: collision with root package name */
    private long f14719e;

    /* renamed from: f, reason: collision with root package name */
    private long f14720f;

    /* renamed from: g, reason: collision with root package name */
    private int f14721g;

    /* renamed from: h, reason: collision with root package name */
    private int f14722h = 2;
    private int i;

    public final void a(String str, int i, int i4) {
        this.f14715a = str;
        this.f14716b = i;
        this.f14717c = i4;
    }

    public final int b() {
        return this.f14716b;
    }

    public final int c() {
        return this.f14717c;
    }

    public final String d() {
        return this.f14718d;
    }

    public final long e() {
        return this.f14719e;
    }

    public final long f() {
        return this.f14720f;
    }

    public final int g() {
        return this.f14721g;
    }

    public final int h() {
        return this.f14722h;
    }

    public final int i() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdCallExtraInfo{realPlacementId='");
        sb.append(this.f14715a);
        sb.append("', realGroupId=");
        sb.append(this.f14716b);
        sb.append(", realTrafficGroupId=");
        sb.append(this.f14717c);
        sb.append(", realRequestId='");
        sb.append(this.f14718d);
        sb.append("', realPLSharedPLReqTimeGap=");
        sb.append(this.f14719e);
        sb.append(", sharedPLFailReqReqTime=");
        sb.append(this.f14720f);
        sb.append(", sharedPLFailRetryReqCount=");
        sb.append(this.f14721g);
        sb.append(", appStrategyType=");
        sb.append(this.f14722h);
        sb.append(", isReadyResultType=");
        return D.x.n(sb, this.i, '}');
    }

    public final void b(long j6) {
        this.f14720f = j6;
    }

    public final void b(int i) {
        this.i = i;
    }

    public final String a() {
        return this.f14715a;
    }

    public final void a(String str) {
        this.f14718d = str;
    }

    public final void a(long j6) {
        this.f14719e = j6;
    }

    public final void a(int i) {
        this.f14721g = i;
    }

    public final void a(boolean z6) {
        if (z6) {
            this.f14722h = 1;
        } else {
            this.f14722h = 2;
        }
    }
}
