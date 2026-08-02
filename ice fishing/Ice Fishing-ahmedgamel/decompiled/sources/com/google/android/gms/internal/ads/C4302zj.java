package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.zj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4302zj {

    /* renamed from: A, reason: collision with root package name */
    public static final String f36182A;

    /* renamed from: B, reason: collision with root package name */
    public static final String f36183B;

    /* renamed from: C, reason: collision with root package name */
    public static final String f36184C;

    /* renamed from: D, reason: collision with root package name */
    public static final String f36185D;

    /* renamed from: E, reason: collision with root package name */
    public static final String f36186E;

    /* renamed from: F, reason: collision with root package name */
    public static final String f36187F;

    /* renamed from: G, reason: collision with root package name */
    public static final String f36188G;

    /* renamed from: H, reason: collision with root package name */
    public static final String f36189H;

    /* renamed from: I, reason: collision with root package name */
    public static final String f36190I;

    /* renamed from: q, reason: collision with root package name */
    public static final String f36191q;

    /* renamed from: r, reason: collision with root package name */
    public static final String f36192r;

    /* renamed from: s, reason: collision with root package name */
    public static final String f36193s;

    /* renamed from: t, reason: collision with root package name */
    public static final String f36194t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f36195u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f36196v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f36197w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f36198x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f36199y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f36200z;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f36201a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f36202b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f36203c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f36204d;

    /* renamed from: e, reason: collision with root package name */
    public final float f36205e;

    /* renamed from: f, reason: collision with root package name */
    public final int f36206f;

    /* renamed from: g, reason: collision with root package name */
    public final int f36207g;

    /* renamed from: h, reason: collision with root package name */
    public final float f36208h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final float f36209j;

    /* renamed from: k, reason: collision with root package name */
    public final float f36210k;

    /* renamed from: l, reason: collision with root package name */
    public final int f36211l;

    /* renamed from: m, reason: collision with root package name */
    public final float f36212m;

    /* renamed from: n, reason: collision with root package name */
    public final int f36213n;

    /* renamed from: o, reason: collision with root package name */
    public final float f36214o;

    /* renamed from: p, reason: collision with root package name */
    public final int f36215p;

    static {
        Layout.Alignment alignment = null;
        float f2 = -3.4028235E38f;
        int i = Integer.MIN_VALUE;
        new C4302zj("", alignment, alignment, null, f2, i, i, f2, i, i, f2, f2, f2, i, 0.0f, 0);
        String str = AbstractC3182eu.f30782a;
        f36191q = Integer.toString(0, 36);
        f36192r = Integer.toString(17, 36);
        f36193s = Integer.toString(1, 36);
        f36194t = Integer.toString(2, 36);
        Integer.toString(3, 36);
        f36195u = Integer.toString(18, 36);
        f36196v = Integer.toString(4, 36);
        f36197w = Integer.toString(5, 36);
        f36198x = Integer.toString(6, 36);
        f36199y = Integer.toString(7, 36);
        f36200z = Integer.toString(8, 36);
        f36182A = Integer.toString(9, 36);
        f36183B = Integer.toString(10, 36);
        f36184C = Integer.toString(11, 36);
        f36185D = Integer.toString(12, 36);
        f36186E = Integer.toString(13, 36);
        f36187F = Integer.toString(14, 36);
        f36188G = Integer.toString(15, 36);
        f36189H = Integer.toString(16, 36);
        f36190I = Integer.toString(19, 36);
    }

    public /* synthetic */ C4302zj(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f2, int i, int i4, float f9, int i6, int i9, float f10, float f11, float f12, int i10, float f13, int i11) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            AbstractC2792Sd.i(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f36201a = SpannedString.valueOf(charSequence);
        } else {
            this.f36201a = charSequence != null ? charSequence.toString() : null;
        }
        this.f36202b = alignment;
        this.f36203c = alignment2;
        this.f36204d = bitmap;
        this.f36205e = f2;
        this.f36206f = i;
        this.f36207g = i4;
        this.f36208h = f9;
        this.i = i6;
        this.f36209j = f11;
        this.f36210k = f12;
        this.f36211l = i9;
        this.f36212m = f10;
        this.f36213n = i10;
        this.f36214o = f13;
        this.f36215p = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4302zj.class != obj.getClass()) {
            return false;
        }
        C4302zj c4302zj = (C4302zj) obj;
        if (!TextUtils.equals(this.f36201a, c4302zj.f36201a) || this.f36202b != c4302zj.f36202b || this.f36203c != c4302zj.f36203c) {
            return false;
        }
        Bitmap bitmap = c4302zj.f36204d;
        Bitmap bitmap2 = this.f36204d;
        if (bitmap2 == null) {
            if (bitmap != null) {
                return false;
            }
        } else if (bitmap == null || !bitmap2.sameAs(bitmap)) {
            return false;
        }
        return this.f36205e == c4302zj.f36205e && this.f36206f == c4302zj.f36206f && this.f36207g == c4302zj.f36207g && this.f36208h == c4302zj.f36208h && this.i == c4302zj.i && this.f36209j == c4302zj.f36209j && this.f36210k == c4302zj.f36210k && this.f36211l == c4302zj.f36211l && this.f36212m == c4302zj.f36212m && this.f36213n == c4302zj.f36213n && this.f36214o == c4302zj.f36214o && this.f36215p == c4302zj.f36215p;
    }

    public final int hashCode() {
        Float valueOf = Float.valueOf(this.f36205e);
        Integer valueOf2 = Integer.valueOf(this.f36206f);
        Integer valueOf3 = Integer.valueOf(this.f36207g);
        Float valueOf4 = Float.valueOf(this.f36208h);
        Integer valueOf5 = Integer.valueOf(this.i);
        Float valueOf6 = Float.valueOf(this.f36209j);
        Float valueOf7 = Float.valueOf(this.f36210k);
        Boolean bool = Boolean.FALSE;
        Integer valueOf8 = Integer.valueOf(this.f36211l);
        Float valueOf9 = Float.valueOf(this.f36212m);
        Integer valueOf10 = Integer.valueOf(this.f36213n);
        Float valueOf11 = Float.valueOf(this.f36214o);
        Integer valueOf12 = Integer.valueOf(this.f36215p);
        return Objects.hash(this.f36201a, this.f36202b, this.f36203c, this.f36204d, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, bool, -16777216, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12);
    }
}
