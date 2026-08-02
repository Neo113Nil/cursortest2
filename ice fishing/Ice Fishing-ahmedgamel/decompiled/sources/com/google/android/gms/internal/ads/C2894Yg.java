package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Yg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2894Yg extends AbstractC2862Wg {
    @Override // com.google.android.gms.internal.ads.AbstractC2862Wg
    public final boolean b(String str) {
        String d9 = x2.d.d(str, "MD5");
        InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) this.f29168v.get();
        if (interfaceC4084vh != null && d9 != null) {
            interfaceC4084vh.s0(d9, this);
        }
        int i = w2.z.f41712b;
        x2.i.f("VideoStreamNoopCache is doing nothing.");
        m(str, d9, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2862Wg
    public final void k() {
    }
}
