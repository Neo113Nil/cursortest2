package com.anythink.core.common.h;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private String f14086a;

    /* renamed from: b, reason: collision with root package name */
    private int f14087b;

    /* renamed from: c, reason: collision with root package name */
    private int f14088c;

    /* renamed from: d, reason: collision with root package name */
    private String f14089d;

    /* renamed from: e, reason: collision with root package name */
    private long f14090e;

    /* renamed from: f, reason: collision with root package name */
    private long f14091f;

    /* renamed from: g, reason: collision with root package name */
    private int f14092g;

    /* renamed from: h, reason: collision with root package name */
    private int f14093h = 2;
    private int i;

    public final void a(String str, int i, int i4) {
        this.f14086a = str;
        this.f14087b = i;
        this.f14088c = i4;
    }

    public final int b() {
        return this.f14087b;
    }

    public final int c() {
        return this.f14088c;
    }

    public final String d() {
        return this.f14089d;
    }

    public final long e() {
        return this.f14090e;
    }

    public final long f() {
        return this.f14091f;
    }

    public final int g() {
        return this.f14092g;
    }

    public final int h() {
        return this.f14093h;
    }

    public final int i() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdCallExtraInfo{realPlacementId='");
        sb.append(this.f14086a);
        sb.append("', realGroupId=");
        sb.append(this.f14087b);
        sb.append(", realTrafficGroupId=");
        sb.append(this.f14088c);
        sb.append(", realRequestId='");
        sb.append(this.f14089d);
        sb.append("', realPLSharedPLReqTimeGap=");
        sb.append(this.f14090e);
        sb.append(", sharedPLFailReqReqTime=");
        sb.append(this.f14091f);
        sb.append(", sharedPLFailRetryReqCount=");
        sb.append(this.f14092g);
        sb.append(", appStrategyType=");
        sb.append(this.f14093h);
        sb.append(", isReadyResultType=");
        return D.y.m(sb, this.i, '}');
    }

    public final void b(long j9) {
        this.f14091f = j9;
    }

    public final void b(int i) {
        this.i = i;
    }

    public final String a() {
        return this.f14086a;
    }

    public final void a(String str) {
        this.f14089d = str;
    }

    public final void a(long j9) {
        this.f14090e = j9;
    }

    public final void a(int i) {
        this.f14092g = i;
    }

    public final void a(boolean z8) {
        if (z8) {
            this.f14093h = 1;
        } else {
            this.f14093h = 2;
        }
    }
}
