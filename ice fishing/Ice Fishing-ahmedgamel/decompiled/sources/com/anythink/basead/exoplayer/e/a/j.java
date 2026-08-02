package com.anythink.basead.exoplayer.e.a;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7896a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7897b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final int f7898c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7899d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7900e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7901f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7902g;

    /* renamed from: h, reason: collision with root package name */
    public final com.anythink.basead.exoplayer.m f7903h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final long[] f7904j;

    /* renamed from: k, reason: collision with root package name */
    public final long[] f7905k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7906l;

    /* renamed from: m, reason: collision with root package name */
    private final k[] f7907m;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public j(int i, int i4, long j6, long j9, long j10, com.anythink.basead.exoplayer.m mVar, int i6, k[] kVarArr, int i9, long[] jArr, long[] jArr2) {
        this.f7898c = i;
        this.f7899d = i4;
        this.f7900e = j6;
        this.f7901f = j9;
        this.f7902g = j10;
        this.f7903h = mVar;
        this.i = i6;
        this.f7907m = kVarArr;
        this.f7906l = i9;
        this.f7904j = jArr;
        this.f7905k = jArr2;
    }

    public final k a(int i) {
        k[] kVarArr = this.f7907m;
        if (kVarArr == null) {
            return null;
        }
        return kVarArr[i];
    }
}
