package com.anythink.basead.exoplayer.e.a;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7110a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7111b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final int f7112c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7113d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7114e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7115f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7116g;

    /* renamed from: h, reason: collision with root package name */
    public final com.anythink.basead.exoplayer.m f7117h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final long[] f7118j;

    /* renamed from: k, reason: collision with root package name */
    public final long[] f7119k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7120l;

    /* renamed from: m, reason: collision with root package name */
    private final k[] f7121m;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public j(int i, int i6, long j6, long j9, long j10, com.anythink.basead.exoplayer.m mVar, int i9, k[] kVarArr, int i10, long[] jArr, long[] jArr2) {
        this.f7112c = i;
        this.f7113d = i6;
        this.f7114e = j6;
        this.f7115f = j9;
        this.f7116g = j10;
        this.f7117h = mVar;
        this.i = i9;
        this.f7121m = kVarArr;
        this.f7120l = i10;
        this.f7118j = jArr;
        this.f7119k = jArr2;
    }

    public final k a(int i) {
        k[] kVarArr = this.f7121m;
        if (kVarArr == null) {
            return null;
        }
        return kVarArr[i];
    }
}
