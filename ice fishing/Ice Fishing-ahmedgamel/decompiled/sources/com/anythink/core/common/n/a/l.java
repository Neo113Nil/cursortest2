package com.anythink.core.common.n.a;

import java.util.Locale;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final int f15626a = 60;

    /* renamed from: b, reason: collision with root package name */
    public static final int f15627b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f15628c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f15629d = 28;

    /* renamed from: e, reason: collision with root package name */
    public static final int f15630e = 5;

    /* renamed from: f, reason: collision with root package name */
    public static final int f15631f = 16;

    /* renamed from: g, reason: collision with root package name */
    public final String f15632g;

    /* renamed from: h, reason: collision with root package name */
    public final int f15633h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final long f15634j;

    /* renamed from: k, reason: collision with root package name */
    public final int f15635k;

    /* renamed from: l, reason: collision with root package name */
    public final String f15636l;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f15637a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f15638b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f15639c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f15640d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f15641e = 4;

        /* renamed from: f, reason: collision with root package name */
        public static final int f15642f = 5;
    }

    public l(String str, int i, int i4, long j6, int i6, String str2) {
        this.f15632g = str;
        this.f15633h = i;
        this.i = i4 <= 0 ? i4 == -1 ? -1 : 60 : i4;
        this.f15634j = j6;
        this.f15635k = i6;
        this.f15636l = str2;
    }

    private boolean c() {
        return this.f15633h == 5;
    }

    private boolean d() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        int i = this.i;
        return i != -1 && this.f15634j + ((long) i) <= currentTimeMillis;
    }

    public final boolean a() {
        return this.f15633h == 1;
    }

    public final boolean b() {
        return this.f15633h == 28;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof l)) {
            l lVar = (l) obj;
            if (this.f15632g.equals(lVar.f15632g) && this.f15633h == lVar.f15633h && this.i == lVar.i && this.f15634j == lVar.f15634j) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "{type:%s, value:%s, source:%s, server:%s, timestamp:%d, ttl:%d}", Integer.valueOf(this.f15633h), this.f15632g, Integer.valueOf(this.f15635k), this.f15636l, Long.valueOf(this.f15634j), Integer.valueOf(this.i));
    }

    private boolean a(long j6) {
        int i = this.i;
        return i != -1 && this.f15634j + ((long) i) <= j6;
    }
}
