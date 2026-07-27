package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.os.Bundle;

/* loaded from: assets/audience_network/classes2.dex */
public class GD implements InterfaceC1671dy {
    public final /* synthetic */ GB A00;

    public GD(GB gb) {
        this.A00 = gb;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1671dy
    public final void AIY() {
        boolean z3;
        C1112No c1112No;
        InterfaceC1381Yh interfaceC1381Yh;
        ZU zu;
        InterfaceC1381Yh interfaceC1381Yh2;
        ZU zu2;
        ZU zu3;
        C1112No c1112No2;
        AbstractC2005jd abstractC2005jd;
        InterfaceC1382Yi A05;
        Intent intent;
        InterfaceC1382Yi interfaceC1382Yi;
        Intent intent2;
        Bundle bundle;
        InterfaceC1382Yi interfaceC1382Yi2;
        this.A00.A0B();
        z3 = this.A00.A0E;
        if (!z3 || this.A00.A01 == null) {
            c1112No = this.A00.A07;
            if (c1112No == null) {
                interfaceC1381Yh = this.A00.A0C;
                zu = this.A00.A0D;
                interfaceC1381Yh.A4j(zu.A81());
                interfaceC1381Yh2 = this.A00.A0C;
                zu2 = this.A00.A0D;
                interfaceC1381Yh2.A4j(zu2.A7w());
                return;
            }
            GB gb = this.A00;
            GB gb2 = this.A00;
            zu3 = this.A00.A0D;
            c1112No2 = this.A00.A07;
            abstractC2005jd = this.A00.A05;
            A05 = gb2.A05(zu3, c1112No2, Boolean.valueOf(abstractC2005jd.A1n()));
            gb.A04 = A05;
            intent = this.A00.A02;
            if (intent != null && this.A00.A00 != null) {
                interfaceC1382Yi = this.A00.A04;
                intent2 = this.A00.A02;
                bundle = this.A00.A03;
                interfaceC1382Yi.AAu(intent2, bundle, this.A00.A00);
                return;
            }
            return;
        }
        if (this.A00.A01 instanceof MW) {
            this.A00.A04 = this.A00.A01;
            interfaceC1382Yi2 = this.A00.A04;
            ((MW) interfaceC1382Yi2).A0b();
        }
    }
}
