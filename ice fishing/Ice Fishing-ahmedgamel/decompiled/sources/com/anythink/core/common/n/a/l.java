package com.anythink.core.common.n.a;

import java.util.Locale;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final int f14840a = 60;

    /* renamed from: b, reason: collision with root package name */
    public static final int f14841b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f14842c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f14843d = 28;

    /* renamed from: e, reason: collision with root package name */
    public static final int f14844e = 5;

    /* renamed from: f, reason: collision with root package name */
    public static final int f14845f = 16;

    /* renamed from: g, reason: collision with root package name */
    public final String f14846g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14847h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final long f14848j;

    /* renamed from: k, reason: collision with root package name */
    public final int f14849k;

    /* renamed from: l, reason: collision with root package name */
    public final String f14850l;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f14851a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f14852b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f14853c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f14854d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f14855e = 4;

        /* renamed from: f, reason: collision with root package name */
        public static final int f14856f = 5;
    }

    public l(String str, int i, int i6, long j6, int i9, String str2) {
        this.f14846g = str;
        this.f14847h = i;
        this.i = i6 <= 0 ? i6 == -1 ? -1 : 60 : i6;
        this.f14848j = j6;
        this.f14849k = i9;
        this.f14850l = str2;
    }

    private boolean c() {
        return this.f14847h == 5;
    }

    private boolean d() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        int i = this.i;
        return i != -1 && this.f14848j + ((long) i) <= currentTimeMillis;
    }

    public final boolean a() {
        return this.f14847h == 1;
    }

    public final boolean b() {
        return this.f14847h == 28;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof l)) {
            l lVar = (l) obj;
            if (this.f14846g.equals(lVar.f14846g) && this.f14847h == lVar.f14847h && this.i == lVar.i && this.f14848j == lVar.f14848j) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "{type:%s, value:%s, source:%s, server:%s, timestamp:%d, ttl:%d}", Integer.valueOf(this.f14847h), this.f14846g, Integer.valueOf(this.f14849k), this.f14850l, Long.valueOf(this.f14848j), Integer.valueOf(this.i));
    }

    private boolean a(long j6) {
        int i = this.i;
        return i != -1 && this.f14848j + ((long) i) <= j6;
    }
}
