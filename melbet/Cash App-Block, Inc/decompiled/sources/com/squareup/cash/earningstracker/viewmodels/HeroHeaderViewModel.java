package com.squareup.cash.earningstracker.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class HeroHeaderViewModel {
    public final boolean shouldManualRefresh;
    public final HeaderSubtitle subtitle;
    public final HeaderTitle title;

    public HeroHeaderViewModel(HeaderTitle headerTitle, HeaderSubtitle headerSubtitle, boolean z) {
        this.title = headerTitle;
        this.subtitle = headerSubtitle;
        this.shouldManualRefresh = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeroHeaderViewModel)) {
            return false;
        }
        HeroHeaderViewModel heroHeaderViewModel = (HeroHeaderViewModel) obj;
        return Intrinsics.areEqual(this.title, heroHeaderViewModel.title) && Intrinsics.areEqual(this.subtitle, heroHeaderViewModel.subtitle) && this.shouldManualRefresh == heroHeaderViewModel.shouldManualRefresh;
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        HeaderSubtitle headerSubtitle = this.subtitle;
        return Boolean.hashCode(this.shouldManualRefresh) + ((hashCode + (headerSubtitle == null ? 0 : headerSubtitle.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeroHeaderViewModel(title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", shouldManualRefresh=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.shouldManualRefresh, ")");
    }
}
