package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.d3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3062d3 {

    /* renamed from: C, reason: collision with root package name */
    public static final C3062d3 f29665C;

    /* renamed from: A, reason: collision with root package name */
    public final Integer f29666A;

    /* renamed from: B, reason: collision with root package name */
    public final RB f29667B;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f29668a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f29669b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f29670c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f29671d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f29672e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f29673f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f29674g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f29675h;
    public final Integer i;

    /* renamed from: j, reason: collision with root package name */
    public final Integer f29676j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f29677k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f29678l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f29679m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f29680n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f29681o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f29682p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f29683q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f29684r;

    /* renamed from: s, reason: collision with root package name */
    public final CharSequence f29685s;

    /* renamed from: t, reason: collision with root package name */
    public final CharSequence f29686t;

    /* renamed from: u, reason: collision with root package name */
    public final CharSequence f29687u;

    /* renamed from: v, reason: collision with root package name */
    public final CharSequence f29688v;

    /* renamed from: w, reason: collision with root package name */
    public final Integer f29689w;

    /* renamed from: x, reason: collision with root package name */
    public final Integer f29690x;

    /* renamed from: y, reason: collision with root package name */
    public final CharSequence f29691y;

    /* renamed from: z, reason: collision with root package name */
    public final CharSequence f29692z;

    static {
        M2 m22 = new M2();
        PB pb = RB.f27177u;
        m22.f26210A = C3500lC.f31745x;
        f29665C = new C3062d3(m22);
        String str = AbstractC3159eu.f29993a;
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

    public C3062d3(M2 m22) {
        Boolean bool = m22.f26220k;
        Integer num = m22.f26235z;
        Integer num2 = m22.f26219j;
        int i = 1;
        int i6 = 0;
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
            boolean z3 = num2.intValue() != -1;
            bool = Boolean.valueOf(z3);
            if (z3 && num == null) {
                switch (num2.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i6 = 21;
                        break;
                    case 3:
                        i6 = 22;
                        break;
                    case 4:
                        i6 = 23;
                        break;
                    case 5:
                        i6 = 24;
                        break;
                    case 6:
                        i6 = 25;
                        break;
                    default:
                        i6 = 20;
                        break;
                }
                num = Integer.valueOf(i6);
            }
        } else {
            num2 = null;
        }
        this.f29668a = m22.f26211a;
        this.f29669b = m22.f26212b;
        this.f29670c = m22.f26213c;
        this.f29671d = m22.f26214d;
        this.f29672e = m22.f26215e;
        this.f29673f = m22.f26216f;
        this.f29674g = m22.f26217g;
        this.f29675h = m22.f26218h;
        this.i = m22.i;
        this.f29676j = num2;
        this.f29677k = bool;
        Integer num3 = m22.f26221l;
        this.f29678l = num3;
        this.f29679m = num3;
        this.f29680n = m22.f26222m;
        this.f29681o = m22.f26223n;
        this.f29682p = m22.f26224o;
        this.f29683q = m22.f26225p;
        this.f29684r = m22.f26226q;
        this.f29685s = m22.f26227r;
        this.f29686t = m22.f26228s;
        this.f29687u = m22.f26229t;
        this.f29688v = m22.f26230u;
        this.f29689w = m22.f26231v;
        this.f29690x = m22.f26232w;
        this.f29691y = m22.f26233x;
        this.f29692z = m22.f26234y;
        this.f29666A = num;
        this.f29667B = m22.f26210A;
    }

    public final M2 a() {
        M2 m22 = new M2();
        m22.f26211a = this.f29668a;
        m22.f26212b = this.f29669b;
        m22.f26213c = this.f29670c;
        m22.f26214d = this.f29671d;
        m22.f26215e = this.f29672e;
        m22.f26216f = this.f29673f;
        m22.f26217g = this.f29674g;
        m22.f26218h = this.f29675h;
        m22.i = this.i;
        m22.f26219j = this.f29676j;
        m22.f26220k = this.f29677k;
        m22.f26221l = this.f29679m;
        m22.f26222m = this.f29680n;
        m22.f26223n = this.f29681o;
        m22.f26224o = this.f29682p;
        m22.f26225p = this.f29683q;
        m22.f26226q = this.f29684r;
        m22.f26227r = this.f29685s;
        m22.f26228s = this.f29686t;
        m22.f26229t = this.f29687u;
        m22.f26231v = this.f29689w;
        m22.f26230u = this.f29688v;
        m22.f26232w = this.f29690x;
        m22.f26233x = this.f29691y;
        m22.f26234y = this.f29692z;
        m22.f26235z = this.f29666A;
        m22.f26210A = this.f29667B;
        return m22;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3062d3.class == obj.getClass()) {
            C3062d3 c3062d3 = (C3062d3) obj;
            if (TextUtils.equals(this.f29668a, c3062d3.f29668a) && TextUtils.equals(this.f29669b, c3062d3.f29669b) && TextUtils.equals(this.f29670c, c3062d3.f29670c) && TextUtils.equals(this.f29671d, c3062d3.f29671d) && TextUtils.equals(null, null) && TextUtils.equals(null, null) && TextUtils.equals(this.f29672e, c3062d3.f29672e) && Arrays.equals(this.f29673f, c3062d3.f29673f) && Objects.equals(this.f29674g, c3062d3.f29674g) && Objects.equals(this.f29675h, c3062d3.f29675h) && Objects.equals(this.i, c3062d3.i) && Objects.equals(this.f29676j, c3062d3.f29676j) && Objects.equals(this.f29677k, c3062d3.f29677k) && Objects.equals(this.f29679m, c3062d3.f29679m) && Objects.equals(this.f29680n, c3062d3.f29680n) && Objects.equals(this.f29681o, c3062d3.f29681o) && Objects.equals(this.f29682p, c3062d3.f29682p) && Objects.equals(this.f29683q, c3062d3.f29683q) && Objects.equals(this.f29684r, c3062d3.f29684r) && TextUtils.equals(this.f29685s, c3062d3.f29685s) && TextUtils.equals(this.f29686t, c3062d3.f29686t) && TextUtils.equals(this.f29687u, c3062d3.f29687u) && TextUtils.equals(this.f29688v, c3062d3.f29688v) && Objects.equals(this.f29689w, c3062d3.f29689w) && Objects.equals(this.f29690x, c3062d3.f29690x) && TextUtils.equals(this.f29691y, c3062d3.f29691y) && TextUtils.equals(null, null) && TextUtils.equals(this.f29692z, c3062d3.f29692z) && Objects.equals(this.f29666A, c3062d3.f29666A) && Objects.equals(this.f29667B, c3062d3.f29667B)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f29668a, this.f29669b, this.f29670c, this.f29671d, null, null, this.f29672e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f29673f)), this.f29674g, null, this.f29675h, this.i, this.f29676j, this.f29677k, null, this.f29679m, this.f29680n, this.f29681o, this.f29682p, this.f29683q, this.f29684r, this.f29685s, this.f29686t, this.f29687u, this.f29688v, this.f29689w, this.f29690x, this.f29691y, null, this.f29692z, this.f29666A, Boolean.TRUE, this.f29667B);
    }
}
