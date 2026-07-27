package com.instagram.common.viewpoint.core;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Eu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0886Eu implements InterfaceC1716ej {
    public final C1839gi A01;
    public final VA A02;
    public final C1713eg A03;
    public final C0876Ek A04;
    public final String A07;
    public final E4 A06 = new E4() { // from class: com.facebook.ads.redexgen.X.4P
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.UN
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C4B c4b) {
            Boolean bool;
            C1839gi c1839gi;
            bool = C0886Eu.this.A00;
            if (bool.booleanValue()) {
                return;
            }
            c1839gi = C0886Eu.this.A01;
            c1839gi.A0F().AJ2();
            C0886Eu.this.A08();
        }
    };
    public final EA A05 = new EA() { // from class: com.facebook.ads.redexgen.X.4O
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.UN
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C4K c4k) {
            Boolean bool;
            C1839gi c1839gi;
            bool = C0886Eu.this.A00;
            if (!bool.booleanValue()) {
                c1839gi = C0886Eu.this.A01;
                c1839gi.A0F().AJ0();
                C0886Eu.this.A08();
            }
            C0886Eu.this.A00 = true;
        }
    };
    public Boolean A00 = false;

    public C0886Eu(C1839gi c1839gi, VA va, C0876Ek c0876Ek, String str, boolean z8, EF ef, Map<String, String> extraParams) {
        this.A01 = c1839gi;
        this.A02 = va;
        this.A07 = str;
        this.A04 = c0876Ek;
        this.A03 = new C1713eg(c0876Ek, str, z8, extraParams);
        if (C1289Up.A2B(this.A01)) {
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

    @Override // com.instagram.common.viewpoint.core.InterfaceC1716ej
    public final void AEk() {
        this.A01.A0F().AJ1();
        A08();
    }
}
