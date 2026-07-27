package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Dk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0850Dk extends UN<C4A> {
    public final /* synthetic */ C0849Dj A00;

    public C0850Dk(C0849Dj c0849Dj) {
        this.A00 = c0849Dj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C4A c4a) {
        C0876Ek c0876Ek;
        C0876Ek c0876Ek2;
        C0876Ek c0876Ek3;
        String A02;
        c0876Ek = this.A00.A00;
        if (c0876Ek == null) {
            return;
        }
        C0849Dj c0849Dj = this.A00;
        C0849Dj c0849Dj2 = this.A00;
        c0876Ek2 = this.A00.A00;
        int duration = c0876Ek2.getDuration();
        c0876Ek3 = this.A00.A00;
        A02 = c0849Dj2.A02(duration - c0876Ek3.getCurrentPositionInMillis());
        c0849Dj.setText(A02);
    }

    @Override // com.instagram.common.viewpoint.core.UN
    public final Class<C4A> A01() {
        return C4A.class;
    }
}
