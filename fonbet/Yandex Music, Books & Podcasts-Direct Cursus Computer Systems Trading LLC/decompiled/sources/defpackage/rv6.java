package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class rv6 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public final CharSequence a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final int m;
    public final int n;
    public final float o;
    public final int p;
    public final float q;

    static {
        new rv6("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        int i = dvt.a;
        r = Integer.toString(0, 36);
        s = Integer.toString(17, 36);
        t = Integer.toString(1, 36);
        u = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        w = Integer.toString(18, 36);
        x = Integer.toString(4, 36);
        y = Integer.toString(5, 36);
        z = Integer.toString(6, 36);
        A = Integer.toString(7, 36);
        B = Integer.toString(8, 36);
        C = Integer.toString(9, 36);
        D = Integer.toString(10, 36);
        E = Integer.toString(11, 36);
        F = Integer.toString(12, 36);
        G = Integer.toString(13, 36);
        H = Integer.toString(14, 36);
        I = Integer.toString(15, 36);
        J = Integer.toString(16, 36);
    }

    public rv6(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z2, int i5, int i6, float f6) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            vq1.v(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.a = charSequence.toString();
        } else {
            this.a = null;
        }
        this.b = alignment;
        this.c = alignment2;
        this.d = bitmap;
        this.e = f;
        this.f = i;
        this.g = i2;
        this.h = f2;
        this.i = i3;
        this.j = f4;
        this.k = f5;
        this.l = z2;
        this.m = i5;
        this.n = i4;
        this.o = f3;
        this.p = i6;
        this.q = f6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0118  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35, types: [android.text.Spannable, android.text.SpannableString] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static rv6 b(Bundle bundle) {
        CharSequence charSequence;
        Bitmap decodeByteArray;
        float f;
        int i;
        String str;
        float f2;
        int i2;
        String str2;
        int i3;
        ?? charSequence2 = bundle.getCharSequence(r);
        boolean z2 = true;
        if (charSequence2 != 0) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(s);
            if (parcelableArrayList != null) {
                charSequence2 = SpannableString.valueOf(charSequence2);
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    Bundle bundle2 = (Bundle) it.next();
                    int i4 = bundle2.getInt(hx6.a);
                    int i5 = bundle2.getInt(hx6.b);
                    int i6 = bundle2.getInt(hx6.c);
                    int i7 = bundle2.getInt(hx6.d, -1);
                    Bundle bundle3 = bundle2.getBundle(hx6.e);
                    if (i7 == 1) {
                        bundle3.getClass();
                        String string = bundle3.getString(gjo.c);
                        string.getClass();
                        charSequence2.setSpan(new gjo(string, bundle3.getInt(gjo.d)), i4, i5, i6);
                    } else if (i7 == 2) {
                        bundle3.getClass();
                        charSequence2.setSpan(new nas(bundle3.getInt(nas.d), bundle3.getInt(nas.e), bundle3.getInt(nas.f)), i4, i5, i6);
                    } else if (i7 == 3) {
                        charSequence2.setSpan(new h3e(), i4, i5, i6);
                    } else if (i7 == 4) {
                        bundle3.getClass();
                        String string2 = bundle3.getString(aju.b);
                        string2.getClass();
                        charSequence2.setSpan(new aju(string2), i4, i5, i6);
                    }
                }
            }
            charSequence = charSequence2;
        } else {
            charSequence = null;
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(t);
        Layout.Alignment alignment2 = alignment != null ? alignment : null;
        Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(u);
        Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
        Bitmap bitmap = (Bitmap) bundle.getParcelable(v);
        if (bitmap != null) {
            decodeByteArray = bitmap;
        } else {
            byte[] byteArray = bundle.getByteArray(w);
            decodeByteArray = byteArray != null ? BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length) : null;
        }
        String str3 = x;
        if (bundle.containsKey(str3)) {
            String str4 = y;
            if (bundle.containsKey(str4)) {
                f = bundle.getFloat(str3);
                i = bundle.getInt(str4);
                String str5 = z;
                int i8 = !bundle.containsKey(str5) ? bundle.getInt(str5) : Integer.MIN_VALUE;
                String str6 = A;
                float f3 = !bundle.containsKey(str6) ? bundle.getFloat(str6) : -3.4028235E38f;
                String str7 = B;
                int i9 = !bundle.containsKey(str7) ? bundle.getInt(str7) : Integer.MIN_VALUE;
                str = D;
                if (bundle.containsKey(str)) {
                    String str8 = C;
                    if (bundle.containsKey(str8)) {
                        f2 = bundle.getFloat(str);
                        i2 = bundle.getInt(str8);
                        String str9 = E;
                        float f4 = bundle.containsKey(str9) ? bundle.getFloat(str9) : -3.4028235E38f;
                        String str10 = F;
                        float f5 = bundle.containsKey(str10) ? bundle.getFloat(str10) : -3.4028235E38f;
                        str2 = G;
                        if (bundle.containsKey(str2)) {
                            i3 = bundle.getInt(str2);
                        } else {
                            i3 = -16777216;
                            z2 = false;
                        }
                        int i10 = i3;
                        boolean z3 = !bundle.getBoolean(H, false) ? false : z2;
                        String str11 = I;
                        int i11 = bundle.containsKey(str11) ? bundle.getInt(str11) : Integer.MIN_VALUE;
                        String str12 = J;
                        return new rv6(charSequence, alignment2, alignment4, decodeByteArray, f, i, i8, f3, i9, i2, f2, f4, f5, z3, i10, i11, bundle.containsKey(str12) ? bundle.getFloat(str12) : 0.0f);
                    }
                }
                f2 = -3.4028235E38f;
                i2 = Integer.MIN_VALUE;
                String str92 = E;
                if (bundle.containsKey(str92)) {
                }
                String str102 = F;
                float f52 = bundle.containsKey(str102) ? bundle.getFloat(str102) : -3.4028235E38f;
                str2 = G;
                if (bundle.containsKey(str2)) {
                }
                int i102 = i3;
                if (!bundle.getBoolean(H, false)) {
                }
                String str112 = I;
                int i112 = bundle.containsKey(str112) ? bundle.getInt(str112) : Integer.MIN_VALUE;
                String str122 = J;
                return new rv6(charSequence, alignment2, alignment4, decodeByteArray, f, i, i8, f3, i9, i2, f2, f4, f52, z3, i102, i112, bundle.containsKey(str122) ? bundle.getFloat(str122) : 0.0f);
            }
        }
        f = -3.4028235E38f;
        i = Integer.MIN_VALUE;
        String str52 = z;
        if (!bundle.containsKey(str52)) {
        }
        String str62 = A;
        if (!bundle.containsKey(str62)) {
        }
        String str72 = B;
        if (!bundle.containsKey(str72)) {
        }
        str = D;
        if (bundle.containsKey(str)) {
        }
        f2 = -3.4028235E38f;
        i2 = Integer.MIN_VALUE;
        String str922 = E;
        if (bundle.containsKey(str922)) {
        }
        String str1022 = F;
        float f522 = bundle.containsKey(str1022) ? bundle.getFloat(str1022) : -3.4028235E38f;
        str2 = G;
        if (bundle.containsKey(str2)) {
        }
        int i1022 = i3;
        if (!bundle.getBoolean(H, false)) {
        }
        String str1122 = I;
        int i1122 = bundle.containsKey(str1122) ? bundle.getInt(str1122) : Integer.MIN_VALUE;
        String str1222 = J;
        return new rv6(charSequence, alignment2, alignment4, decodeByteArray, f, i, i8, f3, i9, i2, f2, f4, f522, z3, i1022, i1122, bundle.containsKey(str1222) ? bundle.getFloat(str1222) : 0.0f);
    }

    public final qv6 a() {
        qv6 qv6Var = new qv6();
        qv6Var.a = this.a;
        qv6Var.b = this.d;
        qv6Var.c = this.b;
        qv6Var.d = this.c;
        qv6Var.e = this.e;
        qv6Var.f = this.f;
        qv6Var.g = this.g;
        qv6Var.h = this.h;
        qv6Var.i = this.i;
        qv6Var.j = this.n;
        qv6Var.k = this.o;
        qv6Var.l = this.j;
        qv6Var.m = this.k;
        qv6Var.n = this.l;
        qv6Var.o = this.m;
        qv6Var.p = this.p;
        qv6Var.q = this.q;
        return qv6Var;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            bundle.putCharSequence(r, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = hx6.a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (gjo gjoVar : (gjo[]) spanned.getSpans(0, spanned.length(), gjo.class)) {
                    gjoVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(gjo.c, gjoVar.a);
                    bundle2.putInt(gjo.d, gjoVar.b);
                    arrayList.add(hx6.a(spanned, gjoVar, 1, bundle2));
                }
                for (nas nasVar : (nas[]) spanned.getSpans(0, spanned.length(), nas.class)) {
                    nasVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(nas.d, nasVar.a);
                    bundle3.putInt(nas.e, nasVar.b);
                    bundle3.putInt(nas.f, nasVar.c);
                    arrayList.add(hx6.a(spanned, nasVar, 2, bundle3));
                }
                for (h3e h3eVar : (h3e[]) spanned.getSpans(0, spanned.length(), h3e.class)) {
                    arrayList.add(hx6.a(spanned, h3eVar, 3, null));
                }
                for (aju ajuVar : (aju[]) spanned.getSpans(0, spanned.length(), aju.class)) {
                    ajuVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(aju.b, ajuVar.a);
                    arrayList.add(hx6.a(spanned, ajuVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(s, arrayList);
                }
            }
        }
        bundle.putSerializable(t, this.b);
        bundle.putSerializable(u, this.c);
        bundle.putFloat(x, this.e);
        bundle.putInt(y, this.f);
        bundle.putInt(z, this.g);
        bundle.putFloat(A, this.h);
        bundle.putInt(B, this.i);
        bundle.putInt(C, this.n);
        bundle.putFloat(D, this.o);
        bundle.putFloat(E, this.j);
        bundle.putFloat(F, this.k);
        bundle.putBoolean(H, this.l);
        bundle.putInt(G, this.m);
        bundle.putInt(I, this.p);
        bundle.putFloat(J, this.q);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rv6.class == obj.getClass()) {
            rv6 rv6Var = (rv6) obj;
            if (TextUtils.equals(this.a, rv6Var.a) && this.b == rv6Var.b && this.c == rv6Var.c) {
                Bitmap bitmap = rv6Var.d;
                Bitmap bitmap2 = this.d;
                if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                    if (this.e == rv6Var.e && this.f == rv6Var.f && this.g == rv6Var.g && this.h == rv6Var.h && this.i == rv6Var.i && this.j == rv6Var.j && this.k == rv6Var.k && this.l == rv6Var.l && this.m == rv6Var.m && this.n == rv6Var.n && this.o == rv6Var.o && this.p == rv6Var.p && this.q == rv6Var.q) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Float.valueOf(this.h), Integer.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.k), Boolean.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n), Float.valueOf(this.o), Integer.valueOf(this.p), Float.valueOf(this.q));
    }
}
