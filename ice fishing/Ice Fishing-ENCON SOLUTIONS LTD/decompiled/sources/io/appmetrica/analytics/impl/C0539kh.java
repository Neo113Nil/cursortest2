package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.kh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0539kh extends N5 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f6375d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6376e;

    /* renamed from: f, reason: collision with root package name */
    public int f6377f;

    /* renamed from: g, reason: collision with root package name */
    public int f6378g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6379h;

    /* renamed from: i, reason: collision with root package name */
    public int f6380i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f6381j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0462hh f6382k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0513jh f6383l;

    /* renamed from: m, reason: collision with root package name */
    public String f6384m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6385n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f6386o;

    /* renamed from: p, reason: collision with root package name */
    public String f6387p;

    /* renamed from: q, reason: collision with root package name */
    public List f6388q;

    /* renamed from: r, reason: collision with root package name */
    public int f6389r;

    /* renamed from: s, reason: collision with root package name */
    public long f6390s;
    public long t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6391u;

    /* renamed from: v, reason: collision with root package name */
    public long f6392v;

    /* renamed from: w, reason: collision with root package name */
    public List f6393w;

    /* renamed from: x, reason: collision with root package name */
    public Set f6394x = new HashSet();

    public C0539kh(X4 x4) {
        this.f6383l = x4;
    }

    public final void a(int i2) {
        this.f6389r = i2;
    }

    public final void b(List<String> list) {
        this.f6388q = list;
    }

    public final String c() {
        return this.f6384m;
    }

    public final void d(boolean z2) {
        this.f6375d = z2;
    }

    public final void e(boolean z2) {
        this.f6379h = z2;
    }

    public final void f(boolean z2) {
        this.f6385n = z2;
    }

    public final boolean g() {
        return this.f6391u;
    }

    public final String h() {
        return (String) WrapUtils.getOrDefault(this.f6387p, "");
    }

    public final boolean i() {
        return this.f6382k.a(this.f6381j);
    }

    public final int j() {
        return this.f6378g;
    }

    public final long k() {
        return this.f6392v;
    }

    public final int l() {
        return this.f6380i;
    }

    public final long m() {
        return this.f6390s;
    }

    public final long n() {
        return this.t;
    }

    public final List<String> o() {
        return this.f6388q;
    }

    public final int p() {
        return this.f6377f;
    }

    public final boolean q() {
        return this.f6386o;
    }

    public final boolean r() {
        return this.f6376e;
    }

    public final boolean s() {
        return this.f6375d;
    }

    public final boolean t() {
        return this.f6385n;
    }

    @Override // io.appmetrica.analytics.impl.N5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "ReportRequestConfig{mLocationTracking=" + this.f6375d + ", mFirstActivationAsUpdate=" + this.f6376e + ", mSessionTimeout=" + this.f6377f + ", mDispatchPeriod=" + this.f6378g + ", mLogEnabled=" + this.f6379h + ", mMaxReportsCount=" + this.f6380i + ", dataSendingEnabledFromArguments=" + this.f6381j + ", dataSendingStrategy=" + this.f6382k + ", mPreloadInfoSendingStrategy=" + this.f6383l + ", mApiKey='" + this.f6384m + "', mPermissionsCollectingEnabled=" + this.f6385n + ", mFeaturesCollectingEnabled=" + this.f6386o + ", mClidsFromStartupResponse='" + this.f6387p + "', mReportHosts=" + this.f6388q + ", mAttributionId=" + this.f6389r + ", mPermissionsCollectingIntervalSeconds=" + this.f6390s + ", mPermissionsForceSendIntervalSeconds=" + this.t + ", mClidsFromClientMatchClidsFromStartupRequest=" + this.f6391u + ", mMaxReportsInDbCount=" + this.f6392v + ", mCertificates=" + this.f6393w + "} " + super.toString();
    }

    public final boolean u() {
        return isIdentifiersValid() && !AbstractC0572lo.a((Collection) this.f6388q) && this.f6391u;
    }

    public final boolean v() {
        return ((X4) this.f6383l).B();
    }

    public final void a(long j2) {
        this.f6392v = j2;
    }

    public final void b(long j2) {
        this.f6390s = j2;
    }

    public final void c(long j2) {
        this.t = j2;
    }

    public final void d(int i2) {
        this.f6377f = i2;
    }

    public final Set<String> e() {
        return this.f6394x;
    }

    public final List<String> f() {
        return this.f6393w;
    }

    public final void a(List<String> list) {
        this.f6393w = list;
    }

    public final void b(boolean z2) {
        this.f6386o = z2;
    }

    public final void c(boolean z2) {
        this.f6376e = z2;
    }

    public final int d() {
        return this.f6389r;
    }

    public final void a(Boolean bool, InterfaceC0462hh interfaceC0462hh) {
        this.f6381j = bool;
        this.f6382k = interfaceC0462hh;
    }

    public final void b(int i2) {
        this.f6378g = i2;
    }

    public final void c(int i2) {
        this.f6380i = i2;
    }

    public final void a(boolean z2) {
        this.f6391u = z2;
    }

    public final void a(Set<String> set) {
        this.f6394x = set;
    }
}
