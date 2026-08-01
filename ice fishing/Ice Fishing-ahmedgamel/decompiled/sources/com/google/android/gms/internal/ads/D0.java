package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class D0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f24290a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24291b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24292c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24293d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24294e;

    /* renamed from: f, reason: collision with root package name */
    public final int f24295f;

    /* renamed from: g, reason: collision with root package name */
    public final int f24296g;

    /* renamed from: h, reason: collision with root package name */
    public final int f24297h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f24298j;

    /* renamed from: k, reason: collision with root package name */
    public final float f24299k;

    /* renamed from: l, reason: collision with root package name */
    public final String f24300l;

    public D0(ArrayList arrayList, int i, int i6, int i9, int i10, int i11, int i12, int i13, int i14, int i15, float f3, String str) {
        this.f24290a = arrayList;
        this.f24291b = i;
        this.f24292c = i6;
        this.f24293d = i9;
        this.f24294e = i10;
        this.f24295f = i11;
        this.f24296g = i12;
        this.f24297h = i13;
        this.i = i14;
        this.f24298j = i15;
        this.f24299k = f3;
        this.f24300l = str;
    }

    public static D0 a(Cr cr) {
        String str;
        int i;
        int i6;
        int i9;
        int i10;
        int i11;
        int i12;
        float f3;
        int i13;
        int i14;
        try {
            cr.G(4);
            int K7 = (cr.K() & 3) + 1;
            if (K7 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int K8 = cr.K() & 31;
            for (int i15 = 0; i15 < K8; i15++) {
                int L6 = cr.L();
                int i16 = cr.f24253b;
                cr.G(L6);
                byte[] bArr = cr.f24252a;
                byte[] bArr2 = AbstractC4228ym.f35218a;
                byte[] bArr3 = new byte[L6 + 4];
                System.arraycopy(AbstractC4228ym.f35218a, 0, bArr3, 0, 4);
                System.arraycopy(bArr, i16, bArr3, 4, L6);
                arrayList.add(bArr3);
            }
            int K9 = cr.K();
            for (int i17 = 0; i17 < K9; i17++) {
                int L8 = cr.L();
                int i18 = cr.f24253b;
                cr.G(L8);
                byte[] bArr4 = cr.f24252a;
                byte[] bArr5 = AbstractC4228ym.f35218a;
                byte[] bArr6 = new byte[L8 + 4];
                System.arraycopy(AbstractC4228ym.f35218a, 0, bArr6, 0, 4);
                System.arraycopy(bArr4, i18, bArr6, 4, L8);
                arrayList.add(bArr6);
            }
            if (K8 > 0) {
                C3390jA I8 = SK.I((byte[]) arrayList.get(0), 5, ((byte[]) arrayList.get(0)).length);
                int i19 = I8.f31204e;
                int i20 = I8.f31205f;
                int i21 = I8.f31207h + 8;
                int i22 = I8.i + 8;
                int i23 = I8.f31208j;
                int i24 = I8.f31209k;
                int i25 = I8.f31210l;
                int i26 = I8.f31211m;
                float f9 = I8.f31206g;
                int i27 = I8.f31200a;
                int i28 = I8.f31201b;
                int i29 = I8.f31202c;
                byte[] bArr7 = AbstractC4228ym.f35218a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i27), Integer.valueOf(i28), Integer.valueOf(i29));
                i10 = i24;
                i11 = i25;
                i12 = i26;
                f3 = f9;
                i6 = i20;
                i9 = i21;
                i13 = i22;
                i14 = i23;
                i = i19;
            } else {
                str = null;
                i = -1;
                i6 = -1;
                i9 = -1;
                i10 = -1;
                i11 = -1;
                i12 = 16;
                f3 = 1.0f;
                i13 = -1;
                i14 = -1;
            }
            return new D0(arrayList, K7, i, i6, i9, i13, i14, i10, i11, i12, f3, str);
        } catch (ArrayIndexOutOfBoundsException e9) {
            throw U4.a(e9, "Error parsing AVC config");
        }
    }
}
