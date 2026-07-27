package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class J0 implements InterfaceC3113e1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f25632a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f25633b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f25634c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f25635d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f25636e;

    /* renamed from: f, reason: collision with root package name */
    public final long f25637f;

    public J0(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f25633b = iArr;
        this.f25634c = jArr;
        this.f25635d = jArr2;
        this.f25636e = jArr3;
        int length = iArr.length;
        this.f25632a = length;
        if (length <= 0) {
            this.f25637f = 0L;
        } else {
            int i = length - 1;
            this.f25637f = jArr2[i] + jArr3[i];
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final C3060d1 b(long j6) {
        long[] jArr = this.f25636e;
        int s9 = AbstractC3159eu.s(jArr, j6, true);
        long j9 = jArr[s9];
        long[] jArr2 = this.f25634c;
        C3167f1 c3167f1 = new C3167f1(j9, jArr2[s9]);
        if (j9 >= j6 || s9 == this.f25632a - 1) {
            return new C3060d1(c3167f1, c3167f1);
        }
        int i = s9 + 1;
        return new C3060d1(c3167f1, new C3167f1(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final long c() {
        return this.f25637f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final boolean f() {
        return true;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f25633b);
        String arrays2 = Arrays.toString(this.f25634c);
        String arrays3 = Arrays.toString(this.f25636e);
        String arrays4 = Arrays.toString(this.f25635d);
        int i = this.f25632a;
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(arrays).length();
        int length3 = String.valueOf(arrays2).length();
        StringBuilder sb = new StringBuilder(length + 26 + length2 + 10 + length3 + 9 + String.valueOf(arrays3).length() + 14 + String.valueOf(arrays4).length() + 1);
        sb.append("ChunkIndex(length=");
        sb.append(i);
        sb.append(", sizes=");
        sb.append(arrays);
        u1.h.i(sb, ", offsets=", arrays2, ", timeUs=", arrays3);
        return D.y.s(sb, ", durationsUs=", arrays4, ")");
    }
}
