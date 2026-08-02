package com.anythink.basead.exoplayer.j;

import android.net.Uri;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8921a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8922b = 2;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f8923c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f8924d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8925e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8926f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8927g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8928h;
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
        sb.append(this.f8923c);
        sb.append(", ");
        sb.append(Arrays.toString(this.f8924d));
        sb.append(", ");
        sb.append(this.f8925e);
        sb.append(", ");
        sb.append(this.f8926f);
        sb.append(", ");
        sb.append(this.f8927g);
        sb.append(", ");
        sb.append(this.f8928h);
        sb.append(", ");
        return AbstractC5128c.e(this.i, "]", sb);
    }

    public k(Uri uri, int i) {
        this(uri, 0L, -1L, null, i);
    }

    public final k a(long j6) {
        long j9 = this.f8927g;
        long j10 = j9 != -1 ? j9 - j6 : -1L;
        return (j6 == 0 && j9 == j10) ? this : new k(this.f8923c, this.f8924d, this.f8925e + j6, this.f8926f + j6, j10, this.f8928h, this.i);
    }

    public k(Uri uri, long j6, String str) {
        this(uri, j6, j6, -1L, str, 0);
    }

    public k(Uri uri, long j6, long j9, String str, int i) {
        this(uri, j6, j6, j9, str, i);
    }

    private k a(long j6, long j9) {
        return (j6 == 0 && this.f8927g == j9) ? this : new k(this.f8923c, this.f8924d, this.f8925e + j6, this.f8926f + j6, j9, this.f8928h, this.i);
    }

    public k(Uri uri, long j6, long j9, long j10, String str, int i) {
        this(uri, null, j6, j9, j10, str, i);
    }

    public k(Uri uri, byte[] bArr, long j6, long j9, long j10, String str, int i) {
        com.anythink.basead.exoplayer.k.a.a(j6 >= 0);
        com.anythink.basead.exoplayer.k.a.a(j9 >= 0);
        com.anythink.basead.exoplayer.k.a.a(j10 > 0 || j10 == -1);
        this.f8923c = uri;
        this.f8924d = bArr;
        this.f8925e = j6;
        this.f8926f = j9;
        this.f8927g = j10;
        this.f8928h = str;
        this.i = i;
    }

    private k a(Uri uri) {
        return new k(uri, this.f8924d, this.f8925e, this.f8926f, this.f8927g, this.f8928h, this.i);
    }
}
