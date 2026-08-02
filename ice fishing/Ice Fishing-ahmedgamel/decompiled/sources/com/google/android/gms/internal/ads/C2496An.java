package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.An, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2496An implements InterfaceC3863rc {

    /* renamed from: n, reason: collision with root package name */
    public final C2595Gk f24517n;

    /* renamed from: u, reason: collision with root package name */
    public final C3114df f24518u;

    /* renamed from: v, reason: collision with root package name */
    public final String f24519v;

    /* renamed from: w, reason: collision with root package name */
    public final String f24520w;

    public C2496An(C2595Gk c2595Gk, St st) {
        this.f24517n = c2595Gk;
        this.f24518u = st.f28410l;
        this.f24519v = st.f28406j;
        this.f24520w = st.f28408k;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3863rc
    public final void B(C3114df c3114df) {
        int i;
        String str;
        C3114df c3114df2 = this.f24518u;
        if (c3114df2 != null) {
            c3114df = c3114df2;
        }
        if (c3114df != null) {
            str = c3114df.f30562n;
            i = c3114df.f30563u;
        } else {
            i = 1;
            str = "";
        }
        BinderC2844Ve binderC2844Ve = new BinderC2844Ve(str, i);
        C2595Gk c2595Gk = this.f24517n;
        c2595Gk.getClass();
        c2595Gk.M1(new C3504ku(8, binderC2844Ve, this.f24519v, this.f24520w));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3863rc
    public final void F() {
        this.f24517n.M1(C2958ak.f29865B);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3863rc
    public final void t() {
        this.f24517n.M1(C2958ak.f29864A);
    }
}
