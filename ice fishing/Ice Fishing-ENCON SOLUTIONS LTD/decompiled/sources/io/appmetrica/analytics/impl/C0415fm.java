package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.fm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0415fm {

    /* renamed from: A, reason: collision with root package name */
    public final Map f6000A;

    /* renamed from: B, reason: collision with root package name */
    public final B9 f6001B;

    /* renamed from: a, reason: collision with root package name */
    public final String f6002a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6003b;

    /* renamed from: c, reason: collision with root package name */
    public final C0518jm f6004c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6005d;

    /* renamed from: e, reason: collision with root package name */
    public final List f6006e;

    /* renamed from: f, reason: collision with root package name */
    public final List f6007f;

    /* renamed from: g, reason: collision with root package name */
    public final List f6008g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f6009h;

    /* renamed from: i, reason: collision with root package name */
    public final String f6010i;

    /* renamed from: j, reason: collision with root package name */
    public final String f6011j;

    /* renamed from: k, reason: collision with root package name */
    public final String f6012k;

    /* renamed from: l, reason: collision with root package name */
    public final String f6013l;

    /* renamed from: m, reason: collision with root package name */
    public final String f6014m;

    /* renamed from: n, reason: collision with root package name */
    public final C0552l4 f6015n;

    /* renamed from: o, reason: collision with root package name */
    public final long f6016o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f6017p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f6018q;

    /* renamed from: r, reason: collision with root package name */
    public final String f6019r;

    /* renamed from: s, reason: collision with root package name */
    public final C0873xe f6020s;
    public final RetryPolicyConfig t;

    /* renamed from: u, reason: collision with root package name */
    public final long f6021u;

    /* renamed from: v, reason: collision with root package name */
    public final long f6022v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f6023w;

    /* renamed from: x, reason: collision with root package name */
    public final C0345d3 f6024x;

    /* renamed from: y, reason: collision with root package name */
    public final C0576m2 f6025y;

    /* renamed from: z, reason: collision with root package name */
    public final Cm f6026z;

    public C0415fm(String str, String str2, C0518jm c0518jm) {
        this.f6002a = str;
        this.f6003b = str2;
        this.f6004c = c0518jm;
        this.f6005d = c0518jm.f6306a;
        this.f6006e = c0518jm.f6307b;
        this.f6007f = c0518jm.f6311f;
        this.f6008g = c0518jm.f6312g;
        this.f6009h = c0518jm.f6314i;
        this.f6010i = c0518jm.f6308c;
        this.f6011j = c0518jm.f6309d;
        this.f6012k = c0518jm.f6315j;
        this.f6013l = c0518jm.f6316k;
        this.f6014m = c0518jm.f6317l;
        this.f6015n = c0518jm.f6318m;
        this.f6016o = c0518jm.f6319n;
        this.f6017p = c0518jm.f6320o;
        this.f6018q = c0518jm.f6321p;
        this.f6019r = c0518jm.f6322q;
        this.f6020s = c0518jm.f6324s;
        this.t = c0518jm.t;
        this.f6021u = c0518jm.f6325u;
        this.f6022v = c0518jm.f6326v;
        this.f6023w = c0518jm.f6327w;
        this.f6024x = c0518jm.f6328x;
        this.f6025y = c0518jm.f6329y;
        this.f6026z = c0518jm.f6330z;
        this.f6000A = c0518jm.f6304A;
        this.f6001B = c0518jm.f6305B;
    }

    public final String a() {
        return this.f6002a;
    }

    public final String b() {
        return this.f6003b;
    }

    public final String c() {
        return this.f6005d;
    }

    public final String toString() {
        return "StartupState(deviceId=" + this.f6002a + ", deviceIdHash=" + this.f6003b + ", startupStateModel=" + this.f6004c + ')';
    }
}
