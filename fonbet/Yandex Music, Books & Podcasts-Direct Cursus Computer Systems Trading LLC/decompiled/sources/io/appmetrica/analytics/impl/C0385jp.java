package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.jp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0385jp {
    public final Gp A;
    public final Map B;
    public final Ja C;
    public final String a;
    public final String b;
    public final C0501np c;
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
    public final C0164c5 o;
    public final long p;
    public final boolean q;
    public final boolean r;
    public final String s;
    public final Ug t;
    public final RetryPolicyConfig u;
    public final long v;
    public final long w;
    public final boolean x;
    public final S3 y;
    public final C0104a3 z;

    public C0385jp(String str, String str2, C0501np c0501np) {
        this.a = str;
        this.b = str2;
        this.c = c0501np;
        this.d = c0501np.a;
        this.e = c0501np.b;
        this.f = c0501np.f;
        this.g = c0501np.g;
        this.h = c0501np.h;
        this.i = c0501np.i;
        this.j = c0501np.c;
        this.k = c0501np.d;
        this.l = c0501np.j;
        this.m = c0501np.k;
        this.n = c0501np.l;
        this.o = c0501np.m;
        this.p = c0501np.n;
        this.q = c0501np.o;
        this.r = c0501np.p;
        this.s = c0501np.q;
        this.t = c0501np.s;
        this.u = c0501np.t;
        this.v = c0501np.u;
        this.w = c0501np.v;
        this.x = c0501np.w;
        this.y = c0501np.x;
        this.z = c0501np.y;
        this.A = c0501np.z;
        this.B = c0501np.A;
        this.C = c0501np.B;
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
