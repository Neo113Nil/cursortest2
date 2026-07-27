package com.anythink.basead.exoplayer.j;

import android.net.Uri;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8135a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8136b = 2;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f8137c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f8138d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8139e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8140f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8141g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8142h;
    public final int i;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public k(Uri uri) {
        this(uri, 0);
    }

    public final boolean a(int i) {
        return (this.i & i) == i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(this.f8137c);
        sb.append(", ");
        sb.append(Arrays.toString(this.f8138d));
        sb.append(", ");
        sb.append(this.f8139e);
        sb.append(", ");
        sb.append(this.f8140f);
        sb.append(", ");
        sb.append(this.f8141g);
        sb.append(", ");
        sb.append(this.f8142h);
        sb.append(", ");
        return u1.h.e(this.i, "]", sb);
    }

    public k(Uri uri, int i) {
        this(uri, 0L, -1L, null, i);
    }

    public final k a(long j6) {
        long j9 = this.f8141g;
        long j10 = j9 != -1 ? j9 - j6 : -1L;
        return (j6 == 0 && j9 == j10) ? this : new k(this.f8137c, this.f8138d, this.f8139e + j6, this.f8140f + j6, j10, this.f8142h, this.i);
    }

    public k(Uri uri, long j6, String str) {
        this(uri, j6, j6, -1L, str, 0);
    }

    public k(Uri uri, long j6, long j9, String str, int i) {
        this(uri, j6, j6, j9, str, i);
    }

    private k a(long j6, long j9) {
        return (j6 == 0 && this.f8141g == j9) ? this : new k(this.f8137c, this.f8138d, this.f8139e + j6, this.f8140f + j6, j9, this.f8142h, this.i);
    }

    public k(Uri uri, long j6, long j9, long j10, String str, int i) {
        this(uri, null, j6, j9, j10, str, i);
    }

    public k(Uri uri, byte[] bArr, long j6, long j9, long j10, String str, int i) {
        com.anythink.basead.exoplayer.k.a.a(j6 >= 0);
        com.anythink.basead.exoplayer.k.a.a(j9 >= 0);
        com.anythink.basead.exoplayer.k.a.a(j10 > 0 || j10 == -1);
        this.f8137c = uri;
        this.f8138d = bArr;
        this.f8139e = j6;
        this.f8140f = j9;
        this.f8141g = j10;
        this.f8142h = str;
        this.i = i;
    }

    private k a(Uri uri) {
        return new k(uri, this.f8138d, this.f8139e, this.f8140f, this.f8141g, this.f8142h, this.i);
    }
}
