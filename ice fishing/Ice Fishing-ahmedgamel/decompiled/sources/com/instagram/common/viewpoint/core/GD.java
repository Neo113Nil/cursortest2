package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.os.Bundle;

/* loaded from: assets/audience_network/classes2.dex */
public class GD implements InterfaceC1691dy {
    public final /* synthetic */ GB A00;

    public GD(GB gb) {
        this.A00 = gb;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1691dy
    public final void AIY() {
        boolean z6;
        C1132No c1132No;
        InterfaceC1401Yh interfaceC1401Yh;
        ZU zu;
        InterfaceC1401Yh interfaceC1401Yh2;
        ZU zu2;
        ZU zu3;
        C1132No c1132No2;
        AbstractC2025jd abstractC2025jd;
        InterfaceC1402Yi A05;
        Intent intent;
        InterfaceC1402Yi interfaceC1402Yi;
        Intent intent2;
        Bundle bundle;
        InterfaceC1402Yi interfaceC1402Yi2;
        this.A00.A0B();
        z6 = this.A00.A0E;
        if (!z6 || this.A00.A01 == null) {
            c1132No = this.A00.A07;
            if (c1132No == null) {
                interfaceC1401Yh = this.A00.A0C;
                zu = this.A00.A0D;
                interfaceC1401Yh.A4j(zu.A81());
                interfaceC1401Yh2 = this.A00.A0C;
                zu2 = this.A00.A0D;
                interfaceC1401Yh2.A4j(zu2.A7w());
                return;
            }
            GB gb = this.A00;
            GB gb2 = this.A00;
            zu3 = this.A00.A0D;
            c1132No2 = this.A00.A07;
            abstractC2025jd = this.A00.A05;
            A05 = gb2.A05(zu3, c1132No2, Boolean.valueOf(abstractC2025jd.A1n()));
            gb.A04 = A05;
            intent = this.A00.A02;
            if (intent != null && this.A00.A00 != null) {
                interfaceC1402Yi = this.A00.A04;
                intent2 = this.A00.A02;
                bundle = this.A00.A03;
                interfaceC1402Yi.AAu(intent2, bundle, this.A00.A00);
                return;
            }
            return;
        }
        if (this.A00.A01 instanceof MW) {
            this.A00.A04 = this.A00.A01;
            interfaceC1402Yi2 = this.A00.A04;
            ((MW) interfaceC1402Yi2).A0b();
        }
    }
}
