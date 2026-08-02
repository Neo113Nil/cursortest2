package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class D0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f25035a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25036b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25037c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25038d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25039e;

    /* renamed from: f, reason: collision with root package name */
    public final int f25040f;

    /* renamed from: g, reason: collision with root package name */
    public final int f25041g;

    /* renamed from: h, reason: collision with root package name */
    public final int f25042h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f25043j;

    /* renamed from: k, reason: collision with root package name */
    public final float f25044k;

    /* renamed from: l, reason: collision with root package name */
    public final String f25045l;

    public D0(ArrayList arrayList, int i, int i4, int i6, int i9, int i10, int i11, int i12, int i13, int i14, float f2, String str) {
        this.f25035a = arrayList;
        this.f25036b = i;
        this.f25037c = i4;
        this.f25038d = i6;
        this.f25039e = i9;
        this.f25040f = i10;
        this.f25041g = i11;
        this.f25042h = i12;
        this.i = i13;
        this.f25043j = i14;
        this.f25044k = f2;
        this.f25045l = str;
    }

    public static D0 a(Cr cr) {
        String str;
        int i;
        int i4;
        int i6;
        int i9;
        int i10;
        int i11;
        float f2;
        int i12;
        int i13;
        try {
            cr.G(4);
            int K7 = (cr.K() & 3) + 1;
            if (K7 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int K8 = cr.K() & 31;
            for (int i14 = 0; i14 < K8; i14++) {
                int L2 = cr.L();
                int i15 = cr.f24998b;
                cr.G(L2);
                byte[] bArr = cr.f24997a;
                byte[] bArr2 = AbstractC4305zm.f36216a;
                byte[] bArr3 = new byte[L2 + 4];
                System.arraycopy(AbstractC4305zm.f36216a, 0, bArr3, 0, 4);
                System.arraycopy(bArr, i15, bArr3, 4, L2);
                arrayList.add(bArr3);
            }
            int K9 = cr.K();
            for (int i16 = 0; i16 < K9; i16++) {
                int L6 = cr.L();
                int i17 = cr.f24998b;
                cr.G(L6);
                byte[] bArr4 = cr.f24997a;
                byte[] bArr5 = AbstractC4305zm.f36216a;
                byte[] bArr6 = new byte[L6 + 4];
                System.arraycopy(AbstractC4305zm.f36216a, 0, bArr6, 0, 4);
                System.arraycopy(bArr4, i17, bArr6, 4, L6);
                arrayList.add(bArr6);
            }
            if (K8 > 0) {
                C3413jA I8 = SK.I((byte[]) arrayList.get(0), 5, ((byte[]) arrayList.get(0)).length);
                int i18 = I8.f31991e;
                int i19 = I8.f31992f;
                int i20 = I8.f31994h + 8;
                int i21 = I8.i + 8;
                int i22 = I8.f31995j;
                int i23 = I8.f31996k;
                int i24 = I8.f31997l;
                int i25 = I8.f31998m;
                float f9 = I8.f31993g;
                int i26 = I8.f31987a;
                int i27 = I8.f31988b;
                int i28 = I8.f31989c;
                byte[] bArr7 = AbstractC4305zm.f36216a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i26), Integer.valueOf(i27), Integer.valueOf(i28));
                i9 = i23;
                i10 = i24;
                i11 = i25;
                f2 = f9;
                i4 = i19;
                i6 = i20;
                i12 = i21;
                i13 = i22;
                i = i18;
            } else {
                str = null;
                i = -1;
                i4 = -1;
                i6 = -1;
                i9 = -1;
                i10 = -1;
                i11 = 16;
                f2 = 1.0f;
                i12 = -1;
                i13 = -1;
            }
            return new D0(arrayList, K7, i, i4, i6, i12, i13, i9, i10, i11, f2, str);
        } catch (ArrayIndexOutOfBoundsException e9) {
            throw U4.a(e9, "Error parsing AVC config");
        }
    }
}
