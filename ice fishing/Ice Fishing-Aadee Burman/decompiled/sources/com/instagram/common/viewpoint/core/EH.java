package com.instagram.common.viewpoint.core;

import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public class EH extends AbstractC1127Od {
    public final /* synthetic */ EF A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EH(EF ef, double d2, double d9, double d10, boolean z3) {
        super(d2, d9, d10, z3);
        this.A00 = ef;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1127Od
    public final void A00(boolean z3, boolean z6, C1129Of c1129Of) {
        C1840gi c1840gi;
        String str;
        Map A0J;
        boolean z9;
        c1840gi = this.A00.A0D;
        if (C1290Up.A0z(c1840gi)) {
            z9 = this.A00.A09;
            if (z9) {
                return;
            }
        }
        if (z6) {
            this.A00.A09 = true;
            EF ef = this.A00;
            str = this.A00.A0J;
            A0J = this.A00.A0J(EnumC1718ek.A03);
            ef.A0R(str, A0J);
        }
    }
}
