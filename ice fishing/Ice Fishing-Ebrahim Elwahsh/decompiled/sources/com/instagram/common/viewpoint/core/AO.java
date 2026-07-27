package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class AO implements C5Y {
    public InterfaceC06705t A02;
    public InterfaceC2070kj<String> A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final C06655o A07 = new C06655o();
    public int A00 = 8000;
    public int A01 = 8000;

    public final AO A00(InterfaceC06705t interfaceC06705t) {
        this.A02 = interfaceC06705t;
        return this;
    }

    public final AO A01(String str) {
        this.A04 = str;
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.C5Y
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final C05611k A5I() {
        C05611k c05611k = new C05611k(this.A04, this.A00, this.A01, this.A05, this.A07, this.A03, this.A06);
        if (this.A02 != null) {
            c05611k.A43(this.A02);
        }
        return c05611k;
    }
}
