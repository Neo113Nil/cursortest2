package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class hoh {
    public static final hoh K = new hoh(new eoh());
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public static final String o0;
    public static final String p0;
    public static final String q0;
    public static final String r0;
    public static final String s0;
    public static final String t0;
    public final CharSequence A;
    public final CharSequence B;
    public final Integer C;
    public final Integer D;
    public final CharSequence E;
    public final CharSequence F;
    public final CharSequence G;
    public final Integer H;
    public final Bundle I;
    public final yde J;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final Long h;
    public final gin i;
    public final gin j;
    public final byte[] k;
    public final Integer l;
    public final Uri m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Boolean q;
    public final Boolean r;
    public final Integer s;
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final Integer x;
    public final Integer y;
    public final CharSequence z;

    static {
        int i = dvt.a;
        L = Integer.toString(0, 36);
        M = Integer.toString(1, 36);
        N = Integer.toString(2, 36);
        O = Integer.toString(3, 36);
        P = Integer.toString(4, 36);
        Q = Integer.toString(5, 36);
        R = Integer.toString(6, 36);
        S = Integer.toString(8, 36);
        T = Integer.toString(9, 36);
        U = Integer.toString(10, 36);
        V = Integer.toString(11, 36);
        W = Integer.toString(12, 36);
        X = Integer.toString(13, 36);
        Y = Integer.toString(14, 36);
        Z = Integer.toString(15, 36);
        a0 = Integer.toString(16, 36);
        b0 = Integer.toString(17, 36);
        c0 = Integer.toString(18, 36);
        d0 = Integer.toString(19, 36);
        e0 = Integer.toString(20, 36);
        f0 = Integer.toString(21, 36);
        g0 = Integer.toString(22, 36);
        h0 = Integer.toString(23, 36);
        i0 = Integer.toString(24, 36);
        j0 = Integer.toString(25, 36);
        k0 = Integer.toString(26, 36);
        l0 = Integer.toString(27, 36);
        m0 = Integer.toString(28, 36);
        n0 = Integer.toString(29, 36);
        o0 = Integer.toString(30, 36);
        p0 = Integer.toString(31, 36);
        q0 = Integer.toString(32, 36);
        r0 = Integer.toString(33, 36);
        s0 = Integer.toString(34, 36);
        t0 = Integer.toString(1000, 36);
    }

    public hoh(eoh eohVar) {
        Boolean bool = eohVar.q;
        Integer num = eohVar.p;
        Integer num2 = eohVar.G;
        int i = 1;
        int i2 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                        case 32:
                        case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                        case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
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
                    i2 = i;
                }
                num = Integer.valueOf(i2);
            }
        } else if (num != null) {
            boolean z = num.intValue() != -1;
            bool = Boolean.valueOf(z);
            if (z && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                num2 = Integer.valueOf(i2);
            }
        }
        this.a = eohVar.a;
        this.b = eohVar.b;
        this.c = eohVar.c;
        this.d = eohVar.d;
        this.e = eohVar.e;
        this.f = eohVar.f;
        this.g = eohVar.g;
        this.h = eohVar.h;
        this.i = eohVar.i;
        this.j = eohVar.j;
        this.k = eohVar.k;
        this.l = eohVar.l;
        this.m = eohVar.m;
        this.n = eohVar.n;
        this.o = eohVar.o;
        this.p = num;
        this.q = bool;
        this.r = eohVar.r;
        Integer num3 = eohVar.s;
        this.s = num3;
        this.t = num3;
        this.u = eohVar.t;
        this.v = eohVar.u;
        this.w = eohVar.v;
        this.x = eohVar.w;
        this.y = eohVar.x;
        this.z = eohVar.y;
        this.A = eohVar.z;
        this.B = eohVar.A;
        this.C = eohVar.B;
        this.D = eohVar.C;
        this.E = eohVar.D;
        this.F = eohVar.E;
        this.G = eohVar.F;
        this.H = num2;
        this.J = eohVar.I;
        this.I = eohVar.H;
    }

    public static hoh b(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        eoh eohVar = new eoh();
        eohVar.a = bundle.getCharSequence(L);
        eohVar.b = bundle.getCharSequence(M);
        eohVar.c = bundle.getCharSequence(N);
        eohVar.d = bundle.getCharSequence(O);
        eohVar.e = bundle.getCharSequence(P);
        eohVar.f = bundle.getCharSequence(Q);
        eohVar.g = bundle.getCharSequence(R);
        byte[] byteArray = bundle.getByteArray(U);
        String str = n0;
        eohVar.b(byteArray, bundle.containsKey(str) ? Integer.valueOf(bundle.getInt(str)) : null);
        eohVar.m = (Uri) bundle.getParcelable(V);
        eohVar.y = bundle.getCharSequence(g0);
        eohVar.z = bundle.getCharSequence(h0);
        eohVar.A = bundle.getCharSequence(i0);
        eohVar.D = bundle.getCharSequence(l0);
        eohVar.E = bundle.getCharSequence(m0);
        eohVar.F = bundle.getCharSequence(o0);
        eohVar.H = bundle.getBundle(t0);
        String str2 = S;
        if (bundle.containsKey(str2) && (bundle3 = bundle.getBundle(str2)) != null) {
            eohVar.i = gin.a(bundle3);
        }
        String str3 = T;
        if (bundle.containsKey(str3) && (bundle2 = bundle.getBundle(str3)) != null) {
            eohVar.j = gin.a(bundle2);
        }
        String str4 = r0;
        if (bundle.containsKey(str4)) {
            eohVar.c(Long.valueOf(bundle.getLong(str4)));
        }
        String str5 = W;
        if (bundle.containsKey(str5)) {
            eohVar.n = Integer.valueOf(bundle.getInt(str5));
        }
        String str6 = X;
        if (bundle.containsKey(str6)) {
            eohVar.o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Y;
        if (bundle.containsKey(str7)) {
            eohVar.p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = q0;
        if (bundle.containsKey(str8)) {
            eohVar.q = Boolean.valueOf(bundle.getBoolean(str8));
        }
        String str9 = Z;
        if (bundle.containsKey(str9)) {
            eohVar.r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = a0;
        if (bundle.containsKey(str10)) {
            eohVar.s = Integer.valueOf(bundle.getInt(str10));
        }
        String str11 = b0;
        if (bundle.containsKey(str11)) {
            eohVar.t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = c0;
        if (bundle.containsKey(str12)) {
            eohVar.u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = d0;
        if (bundle.containsKey(str13)) {
            eohVar.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = e0;
        if (bundle.containsKey(str14)) {
            eohVar.w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f0;
        if (bundle.containsKey(str15)) {
            eohVar.x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = j0;
        if (bundle.containsKey(str16)) {
            eohVar.B = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = k0;
        if (bundle.containsKey(str17)) {
            eohVar.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = p0;
        if (bundle.containsKey(str18)) {
            eohVar.G = Integer.valueOf(bundle.getInt(str18));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(s0);
        if (stringArrayList != null) {
            eohVar.I = yde.v(stringArrayList);
        }
        return new hoh(eohVar);
    }

    public final eoh a() {
        eoh eohVar = new eoh();
        eohVar.a = this.a;
        eohVar.b = this.b;
        eohVar.c = this.c;
        eohVar.d = this.d;
        eohVar.e = this.e;
        eohVar.f = this.f;
        eohVar.g = this.g;
        eohVar.h = this.h;
        eohVar.i = this.i;
        eohVar.j = this.j;
        eohVar.k = this.k;
        eohVar.l = this.l;
        eohVar.m = this.m;
        eohVar.n = this.n;
        eohVar.o = this.o;
        eohVar.p = this.p;
        eohVar.q = this.q;
        eohVar.r = this.r;
        eohVar.s = this.t;
        eohVar.t = this.u;
        eohVar.u = this.v;
        eohVar.v = this.w;
        eohVar.w = this.x;
        eohVar.x = this.y;
        eohVar.y = this.z;
        eohVar.z = this.A;
        eohVar.A = this.B;
        eohVar.B = this.C;
        eohVar.C = this.D;
        eohVar.D = this.E;
        eohVar.E = this.F;
        eohVar.F = this.G;
        eohVar.G = this.H;
        eohVar.I = this.J;
        eohVar.H = this.I;
        return eohVar;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            bundle.putCharSequence(L, charSequence);
        }
        CharSequence charSequence2 = this.b;
        if (charSequence2 != null) {
            bundle.putCharSequence(M, charSequence2);
        }
        CharSequence charSequence3 = this.c;
        if (charSequence3 != null) {
            bundle.putCharSequence(N, charSequence3);
        }
        CharSequence charSequence4 = this.d;
        if (charSequence4 != null) {
            bundle.putCharSequence(O, charSequence4);
        }
        CharSequence charSequence5 = this.e;
        if (charSequence5 != null) {
            bundle.putCharSequence(P, charSequence5);
        }
        CharSequence charSequence6 = this.f;
        if (charSequence6 != null) {
            bundle.putCharSequence(Q, charSequence6);
        }
        CharSequence charSequence7 = this.g;
        if (charSequence7 != null) {
            bundle.putCharSequence(R, charSequence7);
        }
        Long l = this.h;
        if (l != null) {
            bundle.putLong(r0, l.longValue());
        }
        byte[] bArr = this.k;
        if (bArr != null) {
            bundle.putByteArray(U, bArr);
        }
        Uri uri = this.m;
        if (uri != null) {
            bundle.putParcelable(V, uri);
        }
        CharSequence charSequence8 = this.z;
        if (charSequence8 != null) {
            bundle.putCharSequence(g0, charSequence8);
        }
        CharSequence charSequence9 = this.A;
        if (charSequence9 != null) {
            bundle.putCharSequence(h0, charSequence9);
        }
        CharSequence charSequence10 = this.B;
        if (charSequence10 != null) {
            bundle.putCharSequence(i0, charSequence10);
        }
        CharSequence charSequence11 = this.E;
        if (charSequence11 != null) {
            bundle.putCharSequence(l0, charSequence11);
        }
        CharSequence charSequence12 = this.F;
        if (charSequence12 != null) {
            bundle.putCharSequence(m0, charSequence12);
        }
        CharSequence charSequence13 = this.G;
        if (charSequence13 != null) {
            bundle.putCharSequence(o0, charSequence13);
        }
        gin ginVar = this.i;
        if (ginVar != null) {
            bundle.putBundle(S, ginVar.c());
        }
        gin ginVar2 = this.j;
        if (ginVar2 != null) {
            bundle.putBundle(T, ginVar2.c());
        }
        Integer num = this.n;
        if (num != null) {
            bundle.putInt(W, num.intValue());
        }
        Integer num2 = this.o;
        if (num2 != null) {
            bundle.putInt(X, num2.intValue());
        }
        Integer num3 = this.p;
        if (num3 != null) {
            bundle.putInt(Y, num3.intValue());
        }
        Boolean bool = this.q;
        if (bool != null) {
            bundle.putBoolean(q0, bool.booleanValue());
        }
        Boolean bool2 = this.r;
        if (bool2 != null) {
            bundle.putBoolean(Z, bool2.booleanValue());
        }
        Integer num4 = this.t;
        if (num4 != null) {
            bundle.putInt(a0, num4.intValue());
        }
        Integer num5 = this.u;
        if (num5 != null) {
            bundle.putInt(b0, num5.intValue());
        }
        Integer num6 = this.v;
        if (num6 != null) {
            bundle.putInt(c0, num6.intValue());
        }
        Integer num7 = this.w;
        if (num7 != null) {
            bundle.putInt(d0, num7.intValue());
        }
        Integer num8 = this.x;
        if (num8 != null) {
            bundle.putInt(e0, num8.intValue());
        }
        Integer num9 = this.y;
        if (num9 != null) {
            bundle.putInt(f0, num9.intValue());
        }
        Integer num10 = this.C;
        if (num10 != null) {
            bundle.putInt(j0, num10.intValue());
        }
        Integer num11 = this.D;
        if (num11 != null) {
            bundle.putInt(k0, num11.intValue());
        }
        Integer num12 = this.l;
        if (num12 != null) {
            bundle.putInt(n0, num12.intValue());
        }
        Integer num13 = this.H;
        if (num13 != null) {
            bundle.putInt(p0, num13.intValue());
        }
        yde ydeVar = this.J;
        if (!ydeVar.isEmpty()) {
            bundle.putStringArrayList(s0, new ArrayList<>(ydeVar));
        }
        Bundle bundle2 = this.I;
        if (bundle2 != null) {
            bundle.putBundle(t0, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hoh.class == obj.getClass()) {
            hoh hohVar = (hoh) obj;
            if (Objects.equals(this.a, hohVar.a) && Objects.equals(this.b, hohVar.b) && Objects.equals(this.c, hohVar.c) && Objects.equals(this.d, hohVar.d) && Objects.equals(this.e, hohVar.e) && Objects.equals(this.f, hohVar.f) && Objects.equals(this.g, hohVar.g) && Objects.equals(this.h, hohVar.h) && Objects.equals(this.i, hohVar.i) && Objects.equals(this.j, hohVar.j) && Arrays.equals(this.k, hohVar.k) && Objects.equals(this.l, hohVar.l) && Objects.equals(this.m, hohVar.m) && Objects.equals(this.n, hohVar.n) && Objects.equals(this.o, hohVar.o) && Objects.equals(this.p, hohVar.p) && Objects.equals(this.q, hohVar.q) && Objects.equals(this.r, hohVar.r) && Objects.equals(this.t, hohVar.t) && Objects.equals(this.u, hohVar.u) && Objects.equals(this.v, hohVar.v) && Objects.equals(this.w, hohVar.w) && Objects.equals(this.x, hohVar.x) && Objects.equals(this.y, hohVar.y) && Objects.equals(this.z, hohVar.z) && Objects.equals(this.A, hohVar.A) && Objects.equals(this.B, hohVar.B) && Objects.equals(this.C, hohVar.C) && Objects.equals(this.D, hohVar.D) && Objects.equals(this.E, hohVar.E) && Objects.equals(this.F, hohVar.F) && Objects.equals(this.G, hohVar.G) && Objects.equals(this.H, hohVar.H) && Objects.equals(this.J, hohVar.J)) {
                if ((this.I == null) == (hohVar.I == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, Integer.valueOf(Arrays.hashCode(this.k)), this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, Boolean.valueOf(this.I == null), this.J);
    }
}
