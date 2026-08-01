package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class Y5 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f28653a;

    /* renamed from: b, reason: collision with root package name */
    public int f28654b;

    public Y5() {
        this.f28653a = new ArrayList();
        this.f28654b = 0;
    }

    public int a(long j6) {
        long j9;
        int[] iArr = {2001100545, 2130723407, 140753313, -149863858, -2003236720, 202391198, 23353437, 1141616124, 84353895};
        int i = iArr[0];
        int i6 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        int g4 = com.anythink.basead.exoplayer.f.f.g(((~i) & i6) | i9, (i & i10) | i11, i12, i13);
        int i15 = i14 % 84353895;
        long[] jArr = {269441500, 1994078854, 158128940, -158130045, -1992289935, 556430036, 8936987, 2147469841, 438792350};
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        long j18 = (((((~j10) & j11) | j12) + ((j10 & j13) | j14)) - j15) + j16;
        long j19 = j17 % 438792350;
        if (j6 >= 0) {
            j9 = (this.f28654b + (g4 ^ i15)) - j6;
        } else {
            j9 = (j18 ^ j19) + (-j6);
        }
        if (j9 < 0 || j9 >= this.f28654b) {
            throw new W5();
        }
        return (int) j9;
    }

    public void b(C3226g6 c3226g6) {
        int[] iArr = {524133589, 740889625, 408955079, 621796408, 24562149, 1207357565, 297783268, 1066077375, 937558955};
        int i = iArr[0];
        int i6 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        int g4 = com.anythink.basead.exoplayer.f.f.g((i6 & (~i)) | i9, (i & i10) | i11, i12, i13);
        int i15 = this.f28654b;
        if (i15 >= ((i14 % 937558955) ^ g4)) {
            throw new X5();
        }
        ArrayList arrayList = this.f28653a;
        if (i15 == arrayList.size()) {
            arrayList.add(c3226g6);
        } else {
            arrayList.set(this.f28654b, c3226g6);
        }
        this.f28654b++;
    }

    public C3226g6 c() {
        int[] iArr = {91119157, 1459677288, 586253619, -183145911, -1567288443, 919325394, 146725508, 787086305, 459541652};
        int i = iArr[0];
        int i6 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        int g4 = com.anythink.basead.exoplayer.f.f.g((i6 & (~i)) | i9, (i & i10) | i11, i12, i13);
        int i15 = i14 % 459541652;
        int i16 = this.f28654b;
        if (i16 <= 0) {
            throw new W5();
        }
        int i17 = i15 ^ g4;
        ArrayList arrayList = this.f28653a;
        C3226g6 c3226g6 = (C3226g6) arrayList.get(i16 + i17);
        arrayList.set(this.f28654b + i17, null);
        this.f28654b += i17;
        return c3226g6;
    }

    public C3226g6 d(long j6) {
        return (C3226g6) this.f28653a.get(a(j6));
    }

    public Y5(ArrayList arrayList) {
        this.f28653a = arrayList;
    }
}
