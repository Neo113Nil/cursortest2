package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.3c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C06243c extends AbstractC0880Dt {
    public final /* synthetic */ C0868Dh A00;

    public C06243c(C0868Dh c0868Dh) {
        this.A00 = c0868Dh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0881Du c0881Du) {
        C0897Ek c0897Ek;
        Handler handler;
        c0897Ek = this.A00.A01;
        if (c0897Ek == null || c0881Du.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A04;
        handler.removeCallbacksAndMessages(null);
        this.A00.A07(new C1761f7(this));
    }
}
