package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class hxd {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final int k;
    public final String l;
    public final xdh m;

    public hxd(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, int i9, String str, xdh xdhVar) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = f;
        this.k = i9;
        this.l = str;
        this.m = xdhVar;
    }

    public static hxd a(d7k d7kVar, boolean z, xdh xdhVar) {
        boolean z2;
        jsg R;
        int i;
        int i2 = 4;
        try {
            if (z) {
                d7kVar.I(4);
            } else {
                d7kVar.I(21);
            }
            int v = d7kVar.v() & 3;
            int v2 = d7kVar.v();
            int i3 = d7kVar.b;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                z2 = true;
                if (i5 >= v2) {
                    break;
                }
                d7kVar.I(1);
                int B = d7kVar.B();
                for (int i7 = 0; i7 < B; i7++) {
                    int B2 = d7kVar.B();
                    i6 += B2 + 4;
                    d7kVar.I(B2);
                }
                i5++;
            }
            d7kVar.H(i3);
            byte[] bArr = new byte[i6];
            xdh xdhVar2 = xdhVar;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            float f = 1.0f;
            String str = null;
            int i16 = 0;
            int i17 = 0;
            while (i16 < v2) {
                int v3 = d7kVar.v() & 63;
                int B3 = d7kVar.B();
                int i18 = i4;
                xdh xdhVar3 = xdhVar2;
                while (i18 < B3) {
                    boolean z3 = z2;
                    int B4 = d7kVar.B();
                    int i19 = v;
                    System.arraycopy(zc4.h, i4, bArr, i17, i2);
                    int i20 = i17 + 4;
                    System.arraycopy(d7kVar.a, d7kVar.b, bArr, i20, B4);
                    if (v3 == 32 && i18 == 0) {
                        xdhVar3 = zc4.T(bArr, i20, i20 + B4);
                    } else {
                        if (v3 == 33 && i18 == 0) {
                            hwi S = zc4.S(bArr, i20, i20 + B4, xdhVar3);
                            i8 = S.a + 1;
                            i9 = S.c + 8;
                            i10 = S.d + 8;
                            int i21 = S.i;
                            int i22 = S.j;
                            i11 = i21;
                            int i23 = S.k;
                            float f2 = S.g;
                            int i24 = S.h;
                            fwi fwiVar = S.b;
                            if (fwiVar != null) {
                                i = i24;
                                str = ir4.b(fwiVar.a, fwiVar.b, fwiVar.c, fwiVar.d, fwiVar.e, fwiVar.f);
                            } else {
                                i = i24;
                            }
                            i15 = i;
                            f = f2;
                            i13 = i23;
                            i12 = i22;
                        } else if (v3 == 39 && i18 == 0 && (R = zc4.R(bArr, i20, i20 + B4)) != null && xdhVar3 != null) {
                            i4 = 0;
                            i14 = R.b == ((ewi) ((yde) xdhVar3.a).get(0)).b ? 4 : 5;
                        }
                        i4 = 0;
                    }
                    i17 = i20 + B4;
                    d7kVar.I(B4);
                    i18++;
                    z2 = z3;
                    v = i19;
                    i2 = 4;
                }
                i16++;
                xdhVar2 = xdhVar3;
                i2 = 4;
            }
            return new hxd(i6 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), v + 1, i8, i9, i10, i11, i12, i13, i14, f, i15, str, xdhVar2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw r7k.a(e, "Error parsing".concat(z ? "L-HEVC config" : "HEVC config"));
        }
    }
}
