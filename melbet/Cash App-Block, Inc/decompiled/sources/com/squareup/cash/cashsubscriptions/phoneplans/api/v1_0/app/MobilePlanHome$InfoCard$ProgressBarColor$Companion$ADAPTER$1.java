package com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app;

import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class MobilePlanHome$InfoCard$ProgressBarColor$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        MobilePlanHome.InfoCard.ProgressBarColor.Companion.getClass();
        if (i == 0) {
            return MobilePlanHome.InfoCard.ProgressBarColor.PROGRESS_BAR_COLOR_UNSPECIFIED;
        }
        if (i == 1) {
            return MobilePlanHome.InfoCard.ProgressBarColor.PROGRESS_BAR_COLOR_GREEN;
        }
        if (i != 2) {
            return null;
        }
        return MobilePlanHome.InfoCard.ProgressBarColor.PROGRESS_BAR_COLOR_ORANGE;
    }
}
