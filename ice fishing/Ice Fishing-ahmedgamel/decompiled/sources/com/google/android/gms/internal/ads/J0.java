package com.google.android.gms.internal.ads;

import java.util.Arrays;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class J0 implements InterfaceC3136e1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f26385a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f26386b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f26387c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f26388d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f26389e;

    /* renamed from: f, reason: collision with root package name */
    public final long f26390f;

    public J0(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f26386b = iArr;
        this.f26387c = jArr;
        this.f26388d = jArr2;
        this.f26389e = jArr3;
        int length = iArr.length;
        this.f26385a = length;
        if (length <= 0) {
            this.f26390f = 0L;
        } else {
            int i = length - 1;
            this.f26390f = jArr2[i] + jArr3[i];
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final C3083d1 b(long j6) {
        long[] jArr = this.f26389e;
        int s9 = AbstractC3182eu.s(jArr, j6, true);
        long j9 = jArr[s9];
        long[] jArr2 = this.f26387c;
        C3190f1 c3190f1 = new C3190f1(j9, jArr2[s9]);
        if (j9 >= j6 || s9 == this.f26385a - 1) {
            return new C3083d1(c3190f1, c3190f1);
        }
        int i = s9 + 1;
        return new C3083d1(c3190f1, new C3190f1(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final long c() {
        return this.f26390f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final boolean f() {
        return true;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f26386b);
        String arrays2 = Arrays.toString(this.f26387c);
        String arrays3 = Arrays.toString(this.f26389e);
        String arrays4 = Arrays.toString(this.f26388d);
        int i = this.f26385a;
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(arrays).length();
        int length3 = String.valueOf(arrays2).length();
        StringBuilder sb = new StringBuilder(length + 26 + length2 + 10 + length3 + 9 + String.valueOf(arrays3).length() + 14 + String.valueOf(arrays4).length() + 1);
        sb.append("ChunkIndex(length=");
        sb.append(i);
        sb.append(", sizes=");
        sb.append(arrays);
        AbstractC5128c.h(sb, ", offsets=", arrays2, ", timeUs=", arrays3);
        return D.x.p(sb, ", durationsUs=", arrays4, ")");
    }
}
