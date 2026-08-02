package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class rg2 {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    public rg2(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    public static rg2 a(d7k d7kVar) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            d7kVar.I(4);
            int v = (d7kVar.v() & 3) + 1;
            if (v == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int v2 = d7kVar.v() & 31;
            for (int i9 = 0; i9 < v2; i9++) {
                int B = d7kVar.B();
                int i10 = d7kVar.b;
                d7kVar.I(B);
                byte[] bArr = d7kVar.a;
                byte[] bArr2 = new byte[B + 4];
                System.arraycopy(ir4.a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i10, bArr2, 4, B);
                arrayList.add(bArr2);
            }
            int v3 = d7kVar.v();
            for (int i11 = 0; i11 < v3; i11++) {
                int B2 = d7kVar.B();
                int i12 = d7kVar.b;
                d7kVar.I(B2);
                byte[] bArr3 = d7kVar.a;
                byte[] bArr4 = new byte[B2 + 4];
                System.arraycopy(ir4.a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i12, bArr4, 4, B2);
                arrayList.add(bArr4);
            }
            if (v2 > 0) {
                kwi U = zc4.U((byte[]) arrayList.get(0), 4, ((byte[]) arrayList.get(0)).length);
                int i13 = U.e;
                int i14 = U.f;
                int i15 = U.h + 8;
                int i16 = U.i + 8;
                int i17 = U.p;
                int i18 = U.q;
                int i19 = U.r;
                int i20 = U.s;
                float f2 = U.g;
                str = ir4.a(U.a, U.b, U.c);
                i4 = i18;
                i5 = i19;
                i6 = i20;
                f = f2;
                i2 = i14;
                i3 = i15;
                i7 = i16;
                i8 = i17;
                i = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new rg2(arrayList, v, i, i2, i3, i7, i8, i4, i5, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw r7k.a(e, "Error parsing AVC config");
        }
    }
}
