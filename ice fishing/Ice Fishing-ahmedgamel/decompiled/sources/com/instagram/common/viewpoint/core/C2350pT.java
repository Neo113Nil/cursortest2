package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;

/* renamed from: com.facebook.ads.redexgen.X.pT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2350pT implements AnonymousClass24 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final Bitmap A0C;
    public final Layout.Alignment A0D;
    public final Layout.Alignment A0E;
    public final CharSequence A0F;
    public final boolean A0G;
    public static String[] A0H = {"KUNE", "raA8kdJusqhSRQUihDErH9yYSlb7Q0pc", "a1YC1OeN6dpIjzX6IUyhBFBaZFiOBPar", "NtybfxE4AhM4u1v", "wsqusZh9gWXwGZdOs5jqqsOsuYO68ouK", "hrWhj8FC8bQIQnfwmhsxP3BdiVuQ0H3H", "RcL5HtL", "cuPzI7wmuuTc6v"};
    public static final C2350pT A0J = new C06143o().A0G("").A0H();
    public static final String A0U = C5C.A0h(0);
    public static final String A0V = C5C.A0h(1);
    public static final String A0P = C5C.A0h(2);
    public static final String A0K = C5C.A0h(3);
    public static final String A0M = C5C.A0h(4);
    public static final String A0O = C5C.A0h(5);
    public static final String A0N = C5C.A0h(6);
    public static final String A0Q = C5C.A0h(7);
    public static final String A0R = C5C.A0h(8);
    public static final String A0X = C5C.A0h(9);
    public static final String A0W = C5C.A0h(10);
    public static final String A0T = C5C.A0h(11);
    public static final String A0L = C5C.A0h(12);
    public static final String A0Z = C5C.A0h(13);
    public static final String A0a = C5C.A0h(14);
    public static final String A0Y = C5C.A0h(15);
    public static final String A0S = C5C.A0h(16);
    public static final AnonymousClass23<C2350pT> A0I = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pV
        @Override // com.instagram.common.viewpoint.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            C2350pT A00;
            A00 = C2350pT.A00(bundle);
            return A00;
        }
    };

    public C2350pT(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f3, int i, int i6, float f9, int i9, int i10, float f10, float f11, float f12, boolean z3, int i11, int i12, float f13) {
        if (charSequence == null) {
            AbstractC06243y.A01(bitmap);
        } else {
            AbstractC06243y.A07(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.A0F = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.A0F = charSequence.toString();
        } else {
            this.A0F = null;
        }
        this.A0E = alignment;
        this.A0D = alignment2;
        this.A0C = bitmap;
        this.A01 = f3;
        this.A07 = i;
        this.A06 = i6;
        this.A02 = f9;
        this.A08 = i9;
        this.A04 = f11;
        this.A00 = f12;
        this.A0G = z3;
        this.A0B = i11;
        this.A09 = i10;
        this.A05 = f10;
        this.A0A = i12;
        this.A03 = f13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0110, code lost:
    
        if (r5.containsKey(r4) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0112, code lost:
    
        r3.A0C(r5.getInt(com.instagram.common.viewpoint.core.C2350pT.A0Z));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0122, code lost:
    
        if (r5.getBoolean(com.instagram.common.viewpoint.core.C2350pT.A0a, false) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0124, code lost:
    
        r3.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012d, code lost:
    
        if (r5.containsKey(com.instagram.common.viewpoint.core.C2350pT.A0Y) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012f, code lost:
    
        r3.A0B(r5.getInt(com.instagram.common.viewpoint.core.C2350pT.A0Y));
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013e, code lost:
    
        if (r5.containsKey(com.instagram.common.viewpoint.core.C2350pT.A0S) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0140, code lost:
    
        r3.A05(r5.getFloat(com.instagram.common.viewpoint.core.C2350pT.A0S));
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014d, code lost:
    
        return r3.A0H();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0152, code lost:
    
        if (r5.containsKey(r4) != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C2350pT A00(Bundle bundle) {
        C06143o c06143o = new C06143o();
        CharSequence charSequence = bundle.getCharSequence(A0U);
        if (charSequence != null) {
            c06143o.A0G(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(A0V);
        if (alignment != null) {
            c06143o.A0F(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(A0P);
        if (alignment2 != null) {
            c06143o.A0E(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(A0K);
        if (bitmap != null) {
            c06143o.A0D(bitmap);
        }
        if (bundle.containsKey(A0M)) {
            boolean containsKey = bundle.containsKey(A0O);
            if (A0H[1].charAt(14) == 'v') {
                throw new RuntimeException();
            }
            A0H[6] = "SnlpZ584xa2urjPIz8YdoedqgUv4xZ";
            if (containsKey) {
                c06143o.A07(bundle.getFloat(A0M), bundle.getInt(A0O));
            }
        }
        if (bundle.containsKey(A0N)) {
            int i = bundle.getInt(A0N);
            if (A0H[4].charAt(16) != 'F') {
                A0H[1] = "ya89OHr1nN19FgUSnedhVAiJJHnMxvW6";
                c06143o.A09(i);
            } else {
                c06143o.A09(i);
            }
        }
        if (bundle.containsKey(A0Q)) {
            c06143o.A04(bundle.getFloat(A0Q));
        }
        if (bundle.containsKey(A0R)) {
            c06143o.A0A(bundle.getInt(A0R));
        }
        if (bundle.containsKey(A0W) && bundle.containsKey(A0X)) {
            c06143o.A08(bundle.getFloat(A0W), bundle.getInt(A0X));
        }
        if (bundle.containsKey(A0T)) {
            c06143o.A06(bundle.getFloat(A0T));
        }
        if (bundle.containsKey(A0L)) {
            c06143o.A03(bundle.getFloat(A0L));
        }
        String str = A0Z;
        if (A0H[6].length() != 9) {
            A0H[6] = "";
        }
    }

    public final C06143o A02() {
        return new C06143o(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2350pT c2350pT = (C2350pT) obj;
        if (TextUtils.equals(this.A0F, c2350pT.A0F) && this.A0E == c2350pT.A0E && this.A0D == c2350pT.A0D && (this.A0C != null ? !(c2350pT.A0C == null || !this.A0C.sameAs(c2350pT.A0C)) : c2350pT.A0C == null) && this.A01 == c2350pT.A01 && this.A07 == c2350pT.A07 && this.A06 == c2350pT.A06) {
            float f3 = this.A02;
            if (A0H[4].charAt(16) == 'F') {
                throw new RuntimeException();
            }
            A0H[6] = "OaHYrPsvOOcaJ1wPKUjhJjBsa";
            if (f3 == c2350pT.A02 && this.A08 == c2350pT.A08 && this.A04 == c2350pT.A04 && this.A00 == c2350pT.A00 && this.A0G == c2350pT.A0G && this.A0B == c2350pT.A0B && this.A09 == c2350pT.A09 && this.A05 == c2350pT.A05 && this.A0A == c2350pT.A0A && this.A03 == c2350pT.A03) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return CB.A00(this.A0F, this.A0E, this.A0D, this.A0C, Float.valueOf(this.A01), Integer.valueOf(this.A07), Integer.valueOf(this.A06), Float.valueOf(this.A02), Integer.valueOf(this.A08), Float.valueOf(this.A04), Float.valueOf(this.A00), Boolean.valueOf(this.A0G), Integer.valueOf(this.A0B), Integer.valueOf(this.A09), Float.valueOf(this.A05), Integer.valueOf(this.A0A), Float.valueOf(this.A03));
    }
}
