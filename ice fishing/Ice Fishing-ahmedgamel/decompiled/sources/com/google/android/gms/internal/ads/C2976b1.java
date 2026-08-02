package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.b1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2976b1 implements InterfaceC3136e1 {

    /* renamed from: a, reason: collision with root package name */
    public final I1.a f29969a;

    /* renamed from: b, reason: collision with root package name */
    public final I1.a f29970b;

    /* renamed from: c, reason: collision with root package name */
    public final long f29971c;

    public C2976b1(long j6, long[] jArr, long[] jArr2) {
        int length = jArr.length;
        int length2 = jArr2.length;
        AbstractC2792Sd.i(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.f29969a = new I1.a(length2, 8);
            this.f29970b = new I1.a(length2, 8);
        } else {
            int i = length2 + 1;
            I1.a aVar = new I1.a(i, 8);
            this.f29969a = aVar;
            I1.a aVar2 = new I1.a(i, 8);
            this.f29970b = aVar2;
            aVar.r();
            aVar2.r();
        }
        this.f29969a.v(jArr);
        this.f29970b.v(jArr2);
        this.f29971c = j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final C3083d1 b(long j6) {
        I1.a aVar = this.f29970b;
        int i = aVar.f1303u;
        if (i == 0) {
            C3190f1 c3190f1 = C3190f1.f30799c;
            return new C3083d1(c3190f1, c3190f1);
        }
        String str = AbstractC3182eu.f30782a;
        int i4 = i - 1;
        int i6 = 0;
        int i9 = 0;
        while (i9 <= i4) {
            int i10 = (i9 + i4) >>> 1;
            if (aVar.x(i10) < j6) {
                i9 = i10 + 1;
            } else {
                i4 = i10 - 1;
            }
        }
        int i11 = i4 + 1;
        if (i11 < aVar.f1303u && aVar.x(i11) == j6) {
            i6 = i11;
        } else if (i4 != -1) {
            i6 = i4;
        }
        long x9 = aVar.x(i6);
        I1.a aVar2 = this.f29969a;
        C3190f1 c3190f12 = new C3190f1(x9, aVar2.x(i6));
        if (x9 == j6 || i6 == aVar.f1303u - 1) {
            return new C3083d1(c3190f12, c3190f12);
        }
        int i12 = i6 + 1;
        return new C3083d1(c3190f12, new C3190f1(aVar.x(i12), aVar2.x(i12)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final long c() {
        return this.f29971c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final boolean f() {
        return this.f29970b.f1303u > 0;
    }
}
