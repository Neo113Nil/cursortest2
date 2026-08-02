package com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app;

import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class MobilePlanHome$CtaStyle$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        MobilePlanHome.CtaStyle.Companion.getClass();
        if (i == 0) {
            return MobilePlanHome.CtaStyle.UNKNOWN;
        }
        if (i == 1) {
            return MobilePlanHome.CtaStyle.LINK;
        }
        if (i != 2) {
            return null;
        }
        return MobilePlanHome.CtaStyle.BUTTON;
    }
}
