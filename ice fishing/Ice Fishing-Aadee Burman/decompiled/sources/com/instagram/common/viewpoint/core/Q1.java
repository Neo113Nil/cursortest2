package com.instagram.common.viewpoint.core;

import android.content.DialogInterface;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public class Q1 extends AbstractRunnableC1327Wc {
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ YR A01;

    public Q1(YR yr, DialogInterface dialogInterface) {
        this.A01 = yr;
        this.A00 = dialogInterface;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1327Wc
    public final void A07() {
        InterfaceC1791fv interfaceC1791fv;
        InterfaceC1791fv interfaceC1791fv2;
        C1836ge c1836ge;
        Map<? extends String, ? extends String> A02;
        interfaceC1791fv = this.A01.A01.A02;
        if (interfaceC1791fv != null) {
            interfaceC1791fv2 = this.A01.A01.A02;
            c1836ge = this.A01.A01.A00;
            String A03 = WI.A03(c1836ge);
            C1805g9 c1805g9 = new C1805g9();
            A02 = this.A01.A01.A02(this.A01.A00.getText().toString());
            interfaceC1791fv2.AGx(A03, c1805g9.A05(A02).A08());
        }
        this.A00.cancel();
    }
}
