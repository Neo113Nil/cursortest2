package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.zj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4279zj {

    /* renamed from: A, reason: collision with root package name */
    public static final String f35409A;

    /* renamed from: B, reason: collision with root package name */
    public static final String f35410B;

    /* renamed from: C, reason: collision with root package name */
    public static final String f35411C;

    /* renamed from: D, reason: collision with root package name */
    public static final String f35412D;

    /* renamed from: E, reason: collision with root package name */
    public static final String f35413E;

    /* renamed from: F, reason: collision with root package name */
    public static final String f35414F;

    /* renamed from: G, reason: collision with root package name */
    public static final String f35415G;

    /* renamed from: H, reason: collision with root package name */
    public static final String f35416H;

    /* renamed from: I, reason: collision with root package name */
    public static final String f35417I;

    /* renamed from: q, reason: collision with root package name */
    public static final String f35418q;

    /* renamed from: r, reason: collision with root package name */
    public static final String f35419r;

    /* renamed from: s, reason: collision with root package name */
    public static final String f35420s;

    /* renamed from: t, reason: collision with root package name */
    public static final String f35421t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f35422u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f35423v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f35424w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f35425x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f35426y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f35427z;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f35428a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f35429b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f35430c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f35431d;

    /* renamed from: e, reason: collision with root package name */
    public final float f35432e;

    /* renamed from: f, reason: collision with root package name */
    public final int f35433f;

    /* renamed from: g, reason: collision with root package name */
    public final int f35434g;

    /* renamed from: h, reason: collision with root package name */
    public final float f35435h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final float f35436j;

    /* renamed from: k, reason: collision with root package name */
    public final float f35437k;

    /* renamed from: l, reason: collision with root package name */
    public final int f35438l;

    /* renamed from: m, reason: collision with root package name */
    public final float f35439m;

    /* renamed from: n, reason: collision with root package name */
    public final int f35440n;

    /* renamed from: o, reason: collision with root package name */
    public final float f35441o;

    /* renamed from: p, reason: collision with root package name */
    public final int f35442p;

    static {
        Layout.Alignment alignment = null;
        float f3 = -3.4028235E38f;
        int i = Integer.MIN_VALUE;
        new C4279zj("", alignment, alignment, null, f3, i, i, f3, i, i, f3, f3, f3, i, 0.0f, 0);
        String str = AbstractC3159eu.f29993a;
        f35418q = Integer.toString(0, 36);
        f35419r = Integer.toString(17, 36);
        f35420s = Integer.toString(1, 36);
        f35421t = Integer.toString(2, 36);
        Integer.toString(3, 36);
        f35422u = Integer.toString(18, 36);
        f35423v = Integer.toString(4, 36);
        f35424w = Integer.toString(5, 36);
        f35425x = Integer.toString(6, 36);
        f35426y = Integer.toString(7, 36);
        f35427z = Integer.toString(8, 36);
        f35409A = Integer.toString(9, 36);
        f35410B = Integer.toString(10, 36);
        f35411C = Integer.toString(11, 36);
        f35412D = Integer.toString(12, 36);
        f35413E = Integer.toString(13, 36);
        f35414F = Integer.toString(14, 36);
        f35415G = Integer.toString(15, 36);
        f35416H = Integer.toString(16, 36);
        f35417I = Integer.toString(19, 36);
    }

    public /* synthetic */ C4279zj(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f3, int i, int i6, float f9, int i9, int i10, float f10, float f11, float f12, int i11, float f13, int i12) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            AbstractC2772Sd.i(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f35428a = SpannedString.valueOf(charSequence);
        } else {
            this.f35428a = charSequence != null ? charSequence.toString() : null;
        }
        this.f35429b = alignment;
        this.f35430c = alignment2;
        this.f35431d = bitmap;
        this.f35432e = f3;
        this.f35433f = i;
        this.f35434g = i6;
        this.f35435h = f9;
        this.i = i9;
        this.f35436j = f11;
        this.f35437k = f12;
        this.f35438l = i10;
        this.f35439m = f10;
        this.f35440n = i11;
        this.f35441o = f13;
        this.f35442p = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4279zj.class != obj.getClass()) {
            return false;
        }
        C4279zj c4279zj = (C4279zj) obj;
        if (!TextUtils.equals(this.f35428a, c4279zj.f35428a) || this.f35429b != c4279zj.f35429b || this.f35430c != c4279zj.f35430c) {
            return false;
        }
        Bitmap bitmap = c4279zj.f35431d;
        Bitmap bitmap2 = this.f35431d;
        if (bitmap2 == null) {
            if (bitmap != null) {
                return false;
            }
        } else if (bitmap == null || !bitmap2.sameAs(bitmap)) {
            return false;
        }
        return this.f35432e == c4279zj.f35432e && this.f35433f == c4279zj.f35433f && this.f35434g == c4279zj.f35434g && this.f35435h == c4279zj.f35435h && this.i == c4279zj.i && this.f35436j == c4279zj.f35436j && this.f35437k == c4279zj.f35437k && this.f35438l == c4279zj.f35438l && this.f35439m == c4279zj.f35439m && this.f35440n == c4279zj.f35440n && this.f35441o == c4279zj.f35441o && this.f35442p == c4279zj.f35442p;
    }

    public final int hashCode() {
        Float valueOf = Float.valueOf(this.f35432e);
        Integer valueOf2 = Integer.valueOf(this.f35433f);
        Integer valueOf3 = Integer.valueOf(this.f35434g);
        Float valueOf4 = Float.valueOf(this.f35435h);
        Integer valueOf5 = Integer.valueOf(this.i);
        Float valueOf6 = Float.valueOf(this.f35436j);
        Float valueOf7 = Float.valueOf(this.f35437k);
        Boolean bool = Boolean.FALSE;
        Integer valueOf8 = Integer.valueOf(this.f35438l);
        Float valueOf9 = Float.valueOf(this.f35439m);
        Integer valueOf10 = Integer.valueOf(this.f35440n);
        Float valueOf11 = Float.valueOf(this.f35441o);
        Integer valueOf12 = Integer.valueOf(this.f35442p);
        return Objects.hash(this.f35428a, this.f35429b, this.f35430c, this.f35431d, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, bool, -16777216, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12);
    }
}
