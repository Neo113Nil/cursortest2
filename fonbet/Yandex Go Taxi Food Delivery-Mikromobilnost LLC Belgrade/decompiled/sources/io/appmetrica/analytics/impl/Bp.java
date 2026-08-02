package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class Bp {
    public final Yp A;
    public final Map B;
    public final Ra C;
    public final String a;
    public final String b;
    public final Fp c;
    public final String d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final Map i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final C0353g5 o;
    public final long p;
    public final boolean q;
    public final boolean r;
    public final String s;
    public final C0480kh t;
    public final RetryPolicyConfig u;
    public final long v;
    public final long w;
    public final boolean x;
    public final V3 y;
    public final C0178a3 z;

    public Bp(String str, String str2, Fp fp) {
        this.a = str;
        this.b = str2;
        this.c = fp;
        this.d = fp.a;
        this.e = fp.b;
        this.f = fp.f;
        this.g = fp.g;
        this.h = fp.h;
        this.i = fp.i;
        this.j = fp.c;
        this.k = fp.d;
        this.l = fp.j;
        this.m = fp.k;
        this.n = fp.l;
        this.o = fp.m;
        this.p = fp.n;
        this.q = fp.o;
        this.r = fp.p;
        this.s = fp.q;
        this.t = fp.s;
        this.u = fp.t;
        this.v = fp.u;
        this.w = fp.v;
        this.x = fp.w;
        this.y = fp.x;
        this.z = fp.y;
        this.A = fp.z;
        this.B = fp.A;
        this.C = fp.B;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.d;
    }

    public final String toString() {
        return "StartupState(deviceId=" + this.a + ", deviceIdHash=" + this.b + ", startupStateModel=" + this.c + ')';
    }
}
