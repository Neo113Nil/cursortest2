package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.3c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C06043c extends AbstractC0860Dt {
    public final /* synthetic */ C0848Dh A00;

    public C06043c(C0848Dh c0848Dh) {
        this.A00 = c0848Dh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0861Du c0861Du) {
        C0877Ek c0877Ek;
        Handler handler;
        c0877Ek = this.A00.A01;
        if (c0877Ek == null || c0861Du.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A04;
        handler.removeCallbacksAndMessages(null);
        this.A00.A07(new C1741f7(this));
    }
}
