package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.b1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2953b1 implements InterfaceC3113e1 {

    /* renamed from: a, reason: collision with root package name */
    public final G1.a f29181a;

    /* renamed from: b, reason: collision with root package name */
    public final G1.a f29182b;

    /* renamed from: c, reason: collision with root package name */
    public final long f29183c;

    public C2953b1(long j6, long[] jArr, long[] jArr2) {
        int length = jArr.length;
        int length2 = jArr2.length;
        AbstractC2772Sd.i(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.f29181a = new G1.a(length2, 8);
            this.f29182b = new G1.a(length2, 8);
        } else {
            int i = length2 + 1;
            G1.a aVar = new G1.a(i, 8);
            this.f29181a = aVar;
            G1.a aVar2 = new G1.a(i, 8);
            this.f29182b = aVar2;
            aVar.r();
            aVar2.r();
        }
        this.f29181a.v(jArr);
        this.f29182b.v(jArr2);
        this.f29183c = j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final C3060d1 b(long j6) {
        G1.a aVar = this.f29182b;
        int i = aVar.f1050u;
        if (i == 0) {
            C3167f1 c3167f1 = C3167f1.f30012c;
            return new C3060d1(c3167f1, c3167f1);
        }
        String str = AbstractC3159eu.f29993a;
        int i6 = i - 1;
        int i9 = 0;
        int i10 = 0;
        while (i10 <= i6) {
            int i11 = (i10 + i6) >>> 1;
            if (aVar.x(i11) < j6) {
                i10 = i11 + 1;
            } else {
                i6 = i11 - 1;
            }
        }
        int i12 = i6 + 1;
        if (i12 < aVar.f1050u && aVar.x(i12) == j6) {
            i9 = i12;
        } else if (i6 != -1) {
            i9 = i6;
        }
        long x9 = aVar.x(i9);
        G1.a aVar2 = this.f29181a;
        C3167f1 c3167f12 = new C3167f1(x9, aVar2.x(i9));
        if (x9 == j6 || i9 == aVar.f1050u - 1) {
            return new C3060d1(c3167f12, c3167f12);
        }
        int i13 = i9 + 1;
        return new C3060d1(c3167f12, new C3167f1(aVar.x(i13), aVar2.x(i13)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final long c() {
        return this.f29183c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final boolean f() {
        return this.f29182b.f1050u > 0;
    }
}
