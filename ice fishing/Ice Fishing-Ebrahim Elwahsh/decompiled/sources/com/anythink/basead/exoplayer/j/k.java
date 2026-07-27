package com.anythink.basead.exoplayer.j;

import android.net.Uri;
import com.anythink.basead.exoplayer.k.C0544a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8292a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8293b = 2;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f8294c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f8295d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8296e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8297f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8298g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8299h;
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
        sb.append(this.f8294c);
        sb.append(", ");
        sb.append(Arrays.toString(this.f8295d));
        sb.append(", ");
        sb.append(this.f8296e);
        sb.append(", ");
        sb.append(this.f8297f);
        sb.append(", ");
        sb.append(this.f8298g);
        sb.append(", ");
        sb.append(this.f8299h);
        sb.append(", ");
        return AbstractC5051n.e(this.i, "]", sb);
    }

    public k(Uri uri, int i) {
        this(uri, 0L, -1L, null, i);
    }

    public final k a(long j9) {
        long j10 = this.f8298g;
        long j11 = j10 != -1 ? j10 - j9 : -1L;
        return (j9 == 0 && j10 == j11) ? this : new k(this.f8294c, this.f8295d, this.f8296e + j9, this.f8297f + j9, j11, this.f8299h, this.i);
    }

    public k(Uri uri, long j9, String str) {
        this(uri, j9, j9, -1L, str, 0);
    }

    public k(Uri uri, long j9, long j10, String str, int i) {
        this(uri, j9, j9, j10, str, i);
    }

    private k a(long j9, long j10) {
        return (j9 == 0 && this.f8298g == j10) ? this : new k(this.f8294c, this.f8295d, this.f8296e + j9, this.f8297f + j9, j10, this.f8299h, this.i);
    }

    public k(Uri uri, long j9, long j10, long j11, String str, int i) {
        this(uri, null, j9, j10, j11, str, i);
    }

    public k(Uri uri, byte[] bArr, long j9, long j10, long j11, String str, int i) {
        C0544a.a(j9 >= 0);
        C0544a.a(j10 >= 0);
        C0544a.a(j11 > 0 || j11 == -1);
        this.f8294c = uri;
        this.f8295d = bArr;
        this.f8296e = j9;
        this.f8297f = j10;
        this.f8298g = j11;
        this.f8299h = str;
        this.i = i;
    }

    private k a(Uri uri) {
        return new k(uri, this.f8295d, this.f8296e, this.f8297f, this.f8298g, this.f8299h, this.i);
    }
}
