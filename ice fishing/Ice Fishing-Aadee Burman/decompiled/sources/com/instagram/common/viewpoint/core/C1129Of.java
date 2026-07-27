package com.instagram.common.viewpoint.core;

import java.io.Serializable;

/* renamed from: com.facebook.ads.redexgen.X.Of, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1129Of implements Serializable {
    public C1128Oe A00;
    public C1128Oe A01;

    public C1129Of() {
        this(0.5d, 0.5d);
    }

    public C1129Of(double d2) {
        this(d2, 0.5d);
    }

    public C1129Of(double d2, double d9) {
        this.A00 = new C1128Oe(d2);
        this.A01 = new C1128Oe(d9);
        A02();
    }

    public final C1128Oe A00() {
        return this.A00;
    }

    public final C1128Oe A01() {
        return this.A01;
    }

    public final void A02() {
        this.A00.A07();
        this.A01.A07();
    }

    public final void A03() {
        this.A00.A08();
        this.A01.A08();
    }

    public final void A04(double d2, double d9) {
        this.A00.A09(d2, d9);
    }

    public final void A05(double d2, double d9) {
        this.A01.A09(d2, d9);
    }
}
