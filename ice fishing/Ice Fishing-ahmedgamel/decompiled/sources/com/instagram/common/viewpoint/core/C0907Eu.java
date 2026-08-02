package com.instagram.common.viewpoint.core;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Eu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0907Eu implements InterfaceC1737ej {
    public final C1860gi A01;
    public final VA A02;
    public final C1734eg A03;
    public final C0897Ek A04;
    public final String A07;
    public final E4 A06 = new E4() { // from class: com.facebook.ads.redexgen.X.4P
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.UN
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C4B c4b) {
            Boolean bool;
            C1860gi c1860gi;
            bool = C0907Eu.this.A00;
            if (bool.booleanValue()) {
                return;
            }
            c1860gi = C0907Eu.this.A01;
            c1860gi.A0F().AJ2();
            C0907Eu.this.A08();
        }
    };
    public final EA A05 = new EA() { // from class: com.facebook.ads.redexgen.X.4O
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.UN
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C4K c4k) {
            Boolean bool;
            C1860gi c1860gi;
            bool = C0907Eu.this.A00;
            if (!bool.booleanValue()) {
                c1860gi = C0907Eu.this.A01;
                c1860gi.A0F().AJ0();
                C0907Eu.this.A08();
            }
            C0907Eu.this.A00 = true;
        }
    };
    public Boolean A00 = false;

    public C0907Eu(C1860gi c1860gi, VA va, C0897Ek c0897Ek, String str, boolean z6, EF ef, Map<String, String> extraParams) {
        this.A01 = c1860gi;
        this.A02 = va;
        this.A07 = str;
        this.A04 = c0897Ek;
        this.A03 = new C1734eg(c0897Ek, str, z6, extraParams);
        if (C1310Up.A2B(this.A01)) {
            this.A01.A0F().AIx();
            ef.A0m(this);
        } else {
            this.A01.A0F().AIy();
            this.A04.getEventBus().A03(this.A06, this.A05);
        }
    }

    public final void A07() {
        F1 f12 = new F1(this);
        if (this.A04.A0q()) {
            Y4.A00(f12);
        } else {
            this.A04.getStateHandler().post(f12);
        }
    }

    public final synchronized void A08() {
        if (!this.A00.booleanValue()) {
            this.A02.ABy(this.A07, this.A03.A06());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1737ej
    public final void AEk() {
        this.A01.A0F().AJ1();
        A08();
    }
}
