package com.anythink.core.common.h;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private String f13929a;

    /* renamed from: b, reason: collision with root package name */
    private int f13930b;

    /* renamed from: c, reason: collision with root package name */
    private int f13931c;

    /* renamed from: d, reason: collision with root package name */
    private String f13932d;

    /* renamed from: e, reason: collision with root package name */
    private long f13933e;

    /* renamed from: f, reason: collision with root package name */
    private long f13934f;

    /* renamed from: g, reason: collision with root package name */
    private int f13935g;

    /* renamed from: h, reason: collision with root package name */
    private int f13936h = 2;
    private int i;

    public final void a(String str, int i, int i6) {
        this.f13929a = str;
        this.f13930b = i;
        this.f13931c = i6;
    }

    public final int b() {
        return this.f13930b;
    }

    public final int c() {
        return this.f13931c;
    }

    public final String d() {
        return this.f13932d;
    }

    public final long e() {
        return this.f13933e;
    }

    public final long f() {
        return this.f13934f;
    }

    public final int g() {
        return this.f13935g;
    }

    public final int h() {
        return this.f13936h;
    }

    public final int i() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdCallExtraInfo{realPlacementId='");
        sb.append(this.f13929a);
        sb.append("', realGroupId=");
        sb.append(this.f13930b);
        sb.append(", realTrafficGroupId=");
        sb.append(this.f13931c);
        sb.append(", realRequestId='");
        sb.append(this.f13932d);
        sb.append("', realPLSharedPLReqTimeGap=");
        sb.append(this.f13933e);
        sb.append(", sharedPLFailReqReqTime=");
        sb.append(this.f13934f);
        sb.append(", sharedPLFailRetryReqCount=");
        sb.append(this.f13935g);
        sb.append(", appStrategyType=");
        sb.append(this.f13936h);
        sb.append(", isReadyResultType=");
        return D.y.q(sb, this.i, '}');
    }

    public final void b(long j6) {
        this.f13934f = j6;
    }

    public final void b(int i) {
        this.i = i;
    }

    public final String a() {
        return this.f13929a;
    }

    public final void a(String str) {
        this.f13932d = str;
    }

    public final void a(long j6) {
        this.f13933e = j6;
    }

    public final void a(int i) {
        this.f13935g = i;
    }

    public final void a(boolean z3) {
        if (z3) {
            this.f13936h = 1;
        } else {
            this.f13936h = 2;
        }
    }
}
