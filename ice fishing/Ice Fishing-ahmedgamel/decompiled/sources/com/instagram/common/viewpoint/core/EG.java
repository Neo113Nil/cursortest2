package com.instagram.common.viewpoint.core;

import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public class EG extends AbstractC1147Od {
    public final /* synthetic */ EF A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EG(EF ef, double d9, double d10, double d11, boolean z6) {
        super(d9, d10, d11, z6);
        this.A00 = ef;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1147Od
    public final void A00(boolean z6, boolean z9, C1149Of c1149Of) {
        C1860gi c1860gi;
        String str;
        Map A0J;
        boolean z10;
        c1860gi = this.A00.A0D;
        if (C1310Up.A0z(c1860gi)) {
            z10 = this.A00.A0A;
            if (z10) {
                return;
            }
        }
        if (z9) {
            this.A00.A0A = true;
            EF ef = this.A00;
            str = this.A00.A0J;
            A0J = this.A00.A0J(EnumC1738ek.A0B);
            ef.A0R(str, A0J);
        }
    }
}
