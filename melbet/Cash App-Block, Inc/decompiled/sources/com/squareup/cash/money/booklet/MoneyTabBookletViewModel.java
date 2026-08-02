package com.squareup.cash.money.booklet;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MoneyTabBookletViewModel {
    public final String ctaLabel;
    public final ArrayList sections;

    public MoneyTabBookletViewModel(String str, ArrayList arrayList) {
        str.getClass();
        this.sections = arrayList;
        this.ctaLabel = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyTabBookletViewModel)) {
            return false;
        }
        MoneyTabBookletViewModel moneyTabBookletViewModel = (MoneyTabBookletViewModel) obj;
        return this.sections.equals(moneyTabBookletViewModel.sections) && Intrinsics.areEqual(this.ctaLabel, moneyTabBookletViewModel.ctaLabel);
    }

    public final int hashCode() {
        return this.ctaLabel.hashCode() + (this.sections.hashCode() * 31);
    }

    public final String toString() {
        return "MoneyTabBookletViewModel(sections=" + this.sections + ", ctaLabel=" + this.ctaLabel + ")";
    }
}
