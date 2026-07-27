package com.google.android.gms.internal.ads;

import java.util.Arrays;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class I0 implements InterfaceC3015c1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f25498a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f25499b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f25500c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f25501d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f25502e;

    /* renamed from: f, reason: collision with root package name */
    public final long f25503f;

    public I0(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f25499b = iArr;
        this.f25500c = jArr;
        this.f25501d = jArr2;
        this.f25502e = jArr3;
        int length = iArr.length;
        this.f25498a = length;
        if (length <= 0) {
            this.f25503f = 0L;
        } else {
            int i = length - 1;
            this.f25503f = jArr2[i] + jArr3[i];
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final long a() {
        return this.f25503f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final C2961b1 c(long j9) {
        long[] jArr = this.f25502e;
        int s3 = AbstractC3548lu.s(jArr, j9, true);
        long j10 = jArr[s3];
        long[] jArr2 = this.f25500c;
        C3070d1 c3070d1 = new C3070d1(j10, jArr2[s3]);
        if (j10 >= j9 || s3 == this.f25498a - 1) {
            return new C2961b1(c3070d1, c3070d1);
        }
        int i = s3 + 1;
        return new C2961b1(c3070d1, new C3070d1(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final boolean d() {
        return true;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f25499b);
        String arrays2 = Arrays.toString(this.f25500c);
        String arrays3 = Arrays.toString(this.f25502e);
        String arrays4 = Arrays.toString(this.f25501d);
        int i = this.f25498a;
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(arrays).length();
        int length3 = String.valueOf(arrays2).length();
        StringBuilder sb = new StringBuilder(length + 26 + length2 + 10 + length3 + 9 + String.valueOf(arrays3).length() + 14 + String.valueOf(arrays4).length() + 1);
        sb.append("ChunkIndex(length=");
        sb.append(i);
        sb.append(", sizes=");
        sb.append(arrays);
        AbstractC5051n.j(sb, ", offsets=", arrays2, ", timeUs=", arrays3);
        return D.y.o(sb, ", durationsUs=", arrays4, ")");
    }
}
