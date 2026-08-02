package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Jg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1021Jg extends AbstractC1573c3 {
    public static byte[] A00;

    static {
        A0B();
    }

    public static String A0A(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A00 = new byte[]{106, 111, 111, 110, Byte.MAX_VALUE, 106, 98, 103, 120};
    }

    public abstract void A1R();

    public abstract void A1S();

    public abstract void A1T();

    public abstract boolean A1U();

    public abstract boolean A1V();

    public AbstractC1021Jg(C1577c7 c1577c7, boolean z6) {
        super(c1577c7, z6);
        if (C1310Up.A17(c1577c7.A06())) {
            if (c1577c7.A0B() != null) {
                c1577c7.A0B().setCTAClickListener(getCtaButton());
            }
            getTitleDescContainer().setCTAClickListener(getCtaButton());
        }
    }

    public final void A1Q() {
        if (C1310Up.A17(this.A07.A06()) && this.A07.A0B() != null) {
            this.A07.A0B().setCTAClickListener(getCtaButton());
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1573c3
    public ViewOnClickListenerC1058Kr getCtaButton() {
        return super.getCtaButton();
    }

    public void setAdDetailsClickListener(AbstractC1523bF abstractC1523bF) {
        if (C1310Up.A17(this.A07.A06()) && abstractC1523bF != null) {
            abstractC1523bF.setOnClickListener(AbstractC1564bu.A03(getCtaButton(), A0A(0, 9, 29)));
        }
    }

    public void setupNativeCtaExtension(C1698e5 c1698e5) {
    }
}
