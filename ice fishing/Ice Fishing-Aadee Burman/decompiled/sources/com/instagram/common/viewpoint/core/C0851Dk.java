package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Dk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0851Dk extends UN<C4A> {
    public final /* synthetic */ C0850Dj A00;

    public C0851Dk(C0850Dj c0850Dj) {
        this.A00 = c0850Dj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C4A c4a) {
        C0877Ek c0877Ek;
        C0877Ek c0877Ek2;
        C0877Ek c0877Ek3;
        String A02;
        c0877Ek = this.A00.A00;
        if (c0877Ek == null) {
            return;
        }
        C0850Dj c0850Dj = this.A00;
        C0850Dj c0850Dj2 = this.A00;
        c0877Ek2 = this.A00.A00;
        int duration = c0877Ek2.getDuration();
        c0877Ek3 = this.A00.A00;
        A02 = c0850Dj2.A02(duration - c0877Ek3.getCurrentPositionInMillis());
        c0850Dj.setText(A02);
    }

    @Override // com.instagram.common.viewpoint.core.UN
    public final Class<C4A> A01() {
        return C4A.class;
    }
}
