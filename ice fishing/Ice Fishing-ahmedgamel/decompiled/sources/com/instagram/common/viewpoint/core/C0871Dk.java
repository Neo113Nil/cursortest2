package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Dk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0871Dk extends UN<C4A> {
    public final /* synthetic */ C0870Dj A00;

    public C0871Dk(C0870Dj c0870Dj) {
        this.A00 = c0870Dj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C4A c4a) {
        C0897Ek c0897Ek;
        C0897Ek c0897Ek2;
        C0897Ek c0897Ek3;
        String A02;
        c0897Ek = this.A00.A00;
        if (c0897Ek == null) {
            return;
        }
        C0870Dj c0870Dj = this.A00;
        C0870Dj c0870Dj2 = this.A00;
        c0897Ek2 = this.A00.A00;
        int duration = c0897Ek2.getDuration();
        c0897Ek3 = this.A00.A00;
        A02 = c0870Dj2.A02(duration - c0897Ek3.getCurrentPositionInMillis());
        c0870Dj.setText(A02);
    }

    @Override // com.instagram.common.viewpoint.core.UN
    public final Class<C4A> A01() {
        return C4A.class;
    }
}
