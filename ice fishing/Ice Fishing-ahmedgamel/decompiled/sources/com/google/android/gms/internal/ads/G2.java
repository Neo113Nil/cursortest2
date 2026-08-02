package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Optional;

/* loaded from: classes2.dex */
public final class G2 implements InterfaceC3460k3 {

    /* renamed from: n, reason: collision with root package name */
    public long f25697n;

    /* renamed from: u, reason: collision with root package name */
    public long f25698u;

    /* renamed from: v, reason: collision with root package name */
    public Object f25699v;

    /* renamed from: w, reason: collision with root package name */
    public Object f25700w;

    public G2(String str, byte[] bArr, long j6, long j9) {
        this.f25699v = str;
        this.f25700w = bArr;
        this.f25697n = j6;
        this.f25698u = j9;
    }

    public static G2 b(M.h hVar, byte[] bArr, boolean z6) {
        hVar.s();
        ((C2981b6) hVar.f1807u).f30004c.f27929u = M5.e(bArr);
        List list = (List) hVar.v(Optional.empty());
        long longValue = ((Long) list.get(0)).longValue();
        long longValue2 = ((Long) list.get(1)).longValue();
        long longValue3 = ((Long) list.get(2)).longValue();
        hVar.x(longValue, Optional.empty());
        byte[] m9 = AbstractC2659Kg.m();
        String g9 = EC.f25316d.g(m9.length, m9);
        int length = g9.length();
        String str = true != z6 ? "" : "-s";
        String p9 = D.x.p(new StringBuilder(str.length() + length + 12), "3.904631200.", g9, str);
        G2 g22 = new G2();
        g22.f25700w = hVar;
        g22.f25697n = longValue2;
        g22.f25698u = longValue3;
        g22.f25699v = p9;
        return g22;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3460k3
    public void a(long j6) {
        long[] jArr = (long[]) ((S0.s) this.f25700w).f2969u;
        this.f25698u = jArr[AbstractC3182eu.s(jArr, j6, true)];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3460k3
    public long h(K0 k02) {
        long j6 = this.f25698u;
        if (j6 < 0) {
            return -1L;
        }
        this.f25698u = -1L;
        return -(j6 + 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3460k3
    /* renamed from: i */
    public InterfaceC3136e1 mo8i() {
        AbstractC2792Sd.H(this.f25697n != -1);
        return new V0((W0) this.f25699v, this.f25697n);
    }

    public G2(long j6) {
        AbstractC2792Sd.H(((C3995u) this.f25699v) == null);
        this.f25697n = j6;
        this.f25698u = j6 + 65536;
    }
}
