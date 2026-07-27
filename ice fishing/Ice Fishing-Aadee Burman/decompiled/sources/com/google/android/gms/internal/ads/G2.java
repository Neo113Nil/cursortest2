package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Optional;

/* loaded from: classes2.dex */
public final class G2 implements InterfaceC3437k3 {

    /* renamed from: n, reason: collision with root package name */
    public long f24907n;

    /* renamed from: u, reason: collision with root package name */
    public long f24908u;

    /* renamed from: v, reason: collision with root package name */
    public Object f24909v;

    /* renamed from: w, reason: collision with root package name */
    public Object f24910w;

    public G2(String str, byte[] bArr, long j6, long j9) {
        this.f24909v = str;
        this.f24910w = bArr;
        this.f24907n = j6;
        this.f24908u = j9;
    }

    public static G2 b(L3.h hVar, byte[] bArr, boolean z3) {
        hVar.s();
        ((C2958b6) hVar.f1697u).f29216c.f27173u = M5.e(bArr);
        List list = (List) hVar.v(Optional.empty());
        long longValue = ((Long) list.get(0)).longValue();
        long longValue2 = ((Long) list.get(1)).longValue();
        long longValue3 = ((Long) list.get(2)).longValue();
        hVar.x(longValue, Optional.empty());
        byte[] m4 = AbstractC2639Kg.m();
        String g4 = EC.f24555d.g(m4.length, m4);
        int length = g4.length();
        String str = true != z3 ? "" : "-s";
        String s9 = D.y.s(new StringBuilder(str.length() + length + 12), "3.904631200.", g4, str);
        G2 g22 = new G2();
        g22.f24910w = hVar;
        g22.f24907n = longValue2;
        g22.f24908u = longValue3;
        g22.f24909v = s9;
        return g22;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3437k3
    public void a(long j6) {
        long[] jArr = (long[]) ((S0.s) this.f24910w).f2840u;
        this.f24908u = jArr[AbstractC3159eu.s(jArr, j6, true)];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3437k3
    public long h(K0 k02) {
        long j6 = this.f24908u;
        if (j6 < 0) {
            return -1L;
        }
        this.f24908u = -1L;
        return -(j6 + 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3437k3
    /* renamed from: i */
    public InterfaceC3113e1 mo9i() {
        AbstractC2772Sd.H(this.f24907n != -1);
        return new V0((W0) this.f24909v, this.f24907n);
    }

    public G2(long j6) {
        AbstractC2772Sd.H(((C3972u) this.f24909v) == null);
        this.f24907n = j6;
        this.f24908u = j6 + 65536;
    }
}
