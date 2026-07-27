package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.os.Bundle;

/* loaded from: assets/audience_network/classes2.dex */
public class GD implements InterfaceC1670dy {
    public final /* synthetic */ GB A00;

    public GD(GB gb) {
        this.A00 = gb;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1670dy
    public final void AIY() {
        boolean z8;
        C1111No c1111No;
        InterfaceC1380Yh interfaceC1380Yh;
        ZU zu;
        InterfaceC1380Yh interfaceC1380Yh2;
        ZU zu2;
        ZU zu3;
        C1111No c1111No2;
        AbstractC2004jd abstractC2004jd;
        InterfaceC1381Yi A05;
        Intent intent;
        InterfaceC1381Yi interfaceC1381Yi;
        Intent intent2;
        Bundle bundle;
        InterfaceC1381Yi interfaceC1381Yi2;
        this.A00.A0B();
        z8 = this.A00.A0E;
        if (!z8 || this.A00.A01 == null) {
            c1111No = this.A00.A07;
            if (c1111No == null) {
                interfaceC1380Yh = this.A00.A0C;
                zu = this.A00.A0D;
                interfaceC1380Yh.A4j(zu.A81());
                interfaceC1380Yh2 = this.A00.A0C;
                zu2 = this.A00.A0D;
                interfaceC1380Yh2.A4j(zu2.A7w());
                return;
            }
            GB gb = this.A00;
            GB gb2 = this.A00;
            zu3 = this.A00.A0D;
            c1111No2 = this.A00.A07;
            abstractC2004jd = this.A00.A05;
            A05 = gb2.A05(zu3, c1111No2, Boolean.valueOf(abstractC2004jd.A1n()));
            gb.A04 = A05;
            intent = this.A00.A02;
            if (intent != null && this.A00.A00 != null) {
                interfaceC1381Yi = this.A00.A04;
                intent2 = this.A00.A02;
                bundle = this.A00.A03;
                interfaceC1381Yi.AAu(intent2, bundle, this.A00.A00);
                return;
            }
            return;
        }
        if (this.A00.A01 instanceof MW) {
            this.A00.A04 = this.A00.A01;
            interfaceC1381Yi2 = this.A00.A04;
            ((MW) interfaceC1381Yi2).A0b();
        }
    }
}
