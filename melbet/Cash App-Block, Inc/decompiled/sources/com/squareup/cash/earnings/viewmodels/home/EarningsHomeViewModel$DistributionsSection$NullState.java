package com.squareup.cash.earnings.viewmodels.home;

import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewEvent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class EarningsHomeViewModel$DistributionsSection$NullState {
    public final EarningsHomeViewEvent.CallToAction callToActionButtonAction;
    public final String callToActionButtonText;
    public final String subtitle;
    public final String title;

    public EarningsHomeViewModel$DistributionsSection$NullState(String str, String str2, String str3, EarningsHomeViewEvent.CallToAction callToAction) {
        this.title = str;
        this.subtitle = str2;
        this.callToActionButtonText = str3;
        this.callToActionButtonAction = callToAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarningsHomeViewModel$DistributionsSection$NullState)) {
            return false;
        }
        EarningsHomeViewModel$DistributionsSection$NullState earningsHomeViewModel$DistributionsSection$NullState = (EarningsHomeViewModel$DistributionsSection$NullState) obj;
        return this.title.equals(earningsHomeViewModel$DistributionsSection$NullState.title) && this.subtitle.equals(earningsHomeViewModel$DistributionsSection$NullState.subtitle) && this.callToActionButtonText.equals(earningsHomeViewModel$DistributionsSection$NullState.callToActionButtonText) && this.callToActionButtonAction.equals(earningsHomeViewModel$DistributionsSection$NullState.callToActionButtonAction);
    }

    public final int hashCode() {
        return this.callToActionButtonAction.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle), 31, this.callToActionButtonText);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NullState(title=", this.title, ", subtitle=", this.subtitle, ", callToActionButtonText=");
        m.append(this.callToActionButtonText);
        m.append(", callToActionButtonAction=");
        m.append(this.callToActionButtonAction);
        m.append(")");
        return m.toString();
    }
}
