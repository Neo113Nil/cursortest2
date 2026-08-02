package com.squareup.cash.investing.viewmodels.families;

import com.squareup.cash.recurring.db.RecurringPreferenceId;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import org.commonmark.internal.util.LinkScanner;

/* loaded from: classes6.dex */
public final class DependentAutoInvestRecurringPurchaseViewModel {
    public final String autoInvestScheduleText;
    public final char avatarCharacter;
    public final String entityId;
    public final LinkScanner icon;
    public final String stockName;

    public DependentAutoInvestRecurringPurchaseViewModel(LinkScanner linkScanner, String str, String str2, char c, String str3) {
        this.icon = linkScanner;
        this.entityId = str;
        this.stockName = str2;
        this.avatarCharacter = c;
        this.autoInvestScheduleText = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DependentAutoInvestRecurringPurchaseViewModel)) {
            return false;
        }
        DependentAutoInvestRecurringPurchaseViewModel dependentAutoInvestRecurringPurchaseViewModel = (DependentAutoInvestRecurringPurchaseViewModel) obj;
        return this.icon.equals(dependentAutoInvestRecurringPurchaseViewModel.icon) && this.entityId.equals(dependentAutoInvestRecurringPurchaseViewModel.entityId) && this.stockName.equals(dependentAutoInvestRecurringPurchaseViewModel.stockName) && this.avatarCharacter == dependentAutoInvestRecurringPurchaseViewModel.avatarCharacter && this.autoInvestScheduleText.equals(dependentAutoInvestRecurringPurchaseViewModel.autoInvestScheduleText);
    }

    public final int hashCode() {
        return this.autoInvestScheduleText.hashCode() + ((Character.hashCode(this.avatarCharacter) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.icon.hashCode() * 31, 31, this.entityId), 31, this.stockName)) * 31);
    }

    public final String toString() {
        String m3732toStringimpl = RecurringPreferenceId.m3732toStringimpl(this.entityId);
        StringBuilder sb = new StringBuilder("DependentAutoInvestRecurringPurchaseViewModel(icon=");
        sb.append(this.icon);
        sb.append(", entityId=");
        sb.append(m3732toStringimpl);
        sb.append(", stockName=");
        sb.append(this.stockName);
        sb.append(", avatarCharacter=");
        sb.append(this.avatarCharacter);
        sb.append(", autoInvestScheduleText=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.autoInvestScheduleText, ")");
    }
}
