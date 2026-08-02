package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.d3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3085d3 {

    /* renamed from: C, reason: collision with root package name */
    public static final C3085d3 f30437C;

    /* renamed from: A, reason: collision with root package name */
    public final Integer f30438A;

    /* renamed from: B, reason: collision with root package name */
    public final RB f30439B;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f30440a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f30441b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f30442c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f30443d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f30444e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f30445f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f30446g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f30447h;
    public final Integer i;

    /* renamed from: j, reason: collision with root package name */
    public final Integer f30448j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f30449k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f30450l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f30451m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f30452n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f30453o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f30454p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f30455q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f30456r;

    /* renamed from: s, reason: collision with root package name */
    public final CharSequence f30457s;

    /* renamed from: t, reason: collision with root package name */
    public final CharSequence f30458t;

    /* renamed from: u, reason: collision with root package name */
    public final CharSequence f30459u;

    /* renamed from: v, reason: collision with root package name */
    public final CharSequence f30460v;

    /* renamed from: w, reason: collision with root package name */
    public final Integer f30461w;

    /* renamed from: x, reason: collision with root package name */
    public final Integer f30462x;

    /* renamed from: y, reason: collision with root package name */
    public final CharSequence f30463y;

    /* renamed from: z, reason: collision with root package name */
    public final CharSequence f30464z;

    static {
        M2 m22 = new M2();
        PB pb = RB.f27933u;
        m22.f27001A = C3523lC.f32525x;
        f30437C = new C3085d3(m22);
        String str = AbstractC3182eu.f30782a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
        Integer.toString(35, 36);
        Integer.toString(1000, 36);
    }

    public C3085d3(M2 m22) {
        Boolean bool = m22.f27011k;
        Integer num = m22.f27026z;
        Integer num2 = m22.f27010j;
        int i = 1;
        int i4 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num2 = -1;
            } else if (num2 == null || num2.intValue() == -1) {
                if (num != null) {
                    switch (num.intValue()) {
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    num2 = Integer.valueOf(i);
                }
                i = 0;
                num2 = Integer.valueOf(i);
            }
        } else if (num2 != null) {
            boolean z6 = num2.intValue() != -1;
            bool = Boolean.valueOf(z6);
            if (z6 && num == null) {
                switch (num2.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i4 = 21;
                        break;
                    case 3:
                        i4 = 22;
                        break;
                    case 4:
                        i4 = 23;
                        break;
                    case 5:
                        i4 = 24;
                        break;
                    case 6:
                        i4 = 25;
                        break;
                    default:
                        i4 = 20;
                        break;
                }
                num = Integer.valueOf(i4);
            }
        } else {
            num2 = null;
        }
        this.f30440a = m22.f27002a;
        this.f30441b = m22.f27003b;
        this.f30442c = m22.f27004c;
        this.f30443d = m22.f27005d;
        this.f30444e = m22.f27006e;
        this.f30445f = m22.f27007f;
        this.f30446g = m22.f27008g;
        this.f30447h = m22.f27009h;
        this.i = m22.i;
        this.f30448j = num2;
        this.f30449k = bool;
        Integer num3 = m22.f27012l;
        this.f30450l = num3;
        this.f30451m = num3;
        this.f30452n = m22.f27013m;
        this.f30453o = m22.f27014n;
        this.f30454p = m22.f27015o;
        this.f30455q = m22.f27016p;
        this.f30456r = m22.f27017q;
        this.f30457s = m22.f27018r;
        this.f30458t = m22.f27019s;
        this.f30459u = m22.f27020t;
        this.f30460v = m22.f27021u;
        this.f30461w = m22.f27022v;
        this.f30462x = m22.f27023w;
        this.f30463y = m22.f27024x;
        this.f30464z = m22.f27025y;
        this.f30438A = num;
        this.f30439B = m22.f27001A;
    }

    public final M2 a() {
        M2 m22 = new M2();
        m22.f27002a = this.f30440a;
        m22.f27003b = this.f30441b;
        m22.f27004c = this.f30442c;
        m22.f27005d = this.f30443d;
        m22.f27006e = this.f30444e;
        m22.f27007f = this.f30445f;
        m22.f27008g = this.f30446g;
        m22.f27009h = this.f30447h;
        m22.i = this.i;
        m22.f27010j = this.f30448j;
        m22.f27011k = this.f30449k;
        m22.f27012l = this.f30451m;
        m22.f27013m = this.f30452n;
        m22.f27014n = this.f30453o;
        m22.f27015o = this.f30454p;
        m22.f27016p = this.f30455q;
        m22.f27017q = this.f30456r;
        m22.f27018r = this.f30457s;
        m22.f27019s = this.f30458t;
        m22.f27020t = this.f30459u;
        m22.f27022v = this.f30461w;
        m22.f27021u = this.f30460v;
        m22.f27023w = this.f30462x;
        m22.f27024x = this.f30463y;
        m22.f27025y = this.f30464z;
        m22.f27026z = this.f30438A;
        m22.f27001A = this.f30439B;
        return m22;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3085d3.class == obj.getClass()) {
            C3085d3 c3085d3 = (C3085d3) obj;
            if (TextUtils.equals(this.f30440a, c3085d3.f30440a) && TextUtils.equals(this.f30441b, c3085d3.f30441b) && TextUtils.equals(this.f30442c, c3085d3.f30442c) && TextUtils.equals(this.f30443d, c3085d3.f30443d) && TextUtils.equals(null, null) && TextUtils.equals(null, null) && TextUtils.equals(this.f30444e, c3085d3.f30444e) && Arrays.equals(this.f30445f, c3085d3.f30445f) && Objects.equals(this.f30446g, c3085d3.f30446g) && Objects.equals(this.f30447h, c3085d3.f30447h) && Objects.equals(this.i, c3085d3.i) && Objects.equals(this.f30448j, c3085d3.f30448j) && Objects.equals(this.f30449k, c3085d3.f30449k) && Objects.equals(this.f30451m, c3085d3.f30451m) && Objects.equals(this.f30452n, c3085d3.f30452n) && Objects.equals(this.f30453o, c3085d3.f30453o) && Objects.equals(this.f30454p, c3085d3.f30454p) && Objects.equals(this.f30455q, c3085d3.f30455q) && Objects.equals(this.f30456r, c3085d3.f30456r) && TextUtils.equals(this.f30457s, c3085d3.f30457s) && TextUtils.equals(this.f30458t, c3085d3.f30458t) && TextUtils.equals(this.f30459u, c3085d3.f30459u) && TextUtils.equals(this.f30460v, c3085d3.f30460v) && Objects.equals(this.f30461w, c3085d3.f30461w) && Objects.equals(this.f30462x, c3085d3.f30462x) && TextUtils.equals(this.f30463y, c3085d3.f30463y) && TextUtils.equals(null, null) && TextUtils.equals(this.f30464z, c3085d3.f30464z) && Objects.equals(this.f30438A, c3085d3.f30438A) && Objects.equals(this.f30439B, c3085d3.f30439B)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f30440a, this.f30441b, this.f30442c, this.f30443d, null, null, this.f30444e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f30445f)), this.f30446g, null, this.f30447h, this.i, this.f30448j, this.f30449k, null, this.f30451m, this.f30452n, this.f30453o, this.f30454p, this.f30455q, this.f30456r, this.f30457s, this.f30458t, this.f30459u, this.f30460v, this.f30461w, this.f30462x, this.f30463y, null, this.f30464z, this.f30438A, Boolean.TRUE, this.f30439B);
    }
}
