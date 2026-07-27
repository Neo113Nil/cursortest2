package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Vg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2825Vg extends AbstractC2791Tg {
    @Override // com.google.android.gms.internal.ads.AbstractC2791Tg
    public final boolean b(String str) {
        String d2 = u2.d.d(str, "MD5");
        InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) this.f27799v.get();
        if (interfaceC3858rh != null && d2 != null) {
            interfaceC3858rh.B0(d2, this);
        }
        int i = t2.C.f40822b;
        u2.i.f("VideoStreamNoopCache is doing nothing.");
        m(str, d2, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2791Tg
    public final void l() {
    }
}
