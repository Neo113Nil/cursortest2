package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Yg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2871Yg extends AbstractC2839Wg {
    @Override // com.google.android.gms.internal.ads.AbstractC2839Wg
    public final boolean b(String str) {
        String d2 = v2.d.d(str, "MD5");
        InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) this.f28369v.get();
        if (interfaceC4061vh != null && d2 != null) {
            interfaceC4061vh.u0(d2, this);
        }
        int i = u2.z.f41319b;
        v2.i.f("VideoStreamNoopCache is doing nothing.");
        m(str, d2, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2839Wg
    public final void k() {
    }
}
