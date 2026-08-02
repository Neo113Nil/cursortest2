package com.squareup.cash.savings.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewEvent;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader implements SavingsScreenViewModel.Content.SavingsScreenElement {
    public final SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance balance;
    public final Footer footer;
    public final String iconId;
    public final String iconLabel;
    public final SavingsScreenViewEvent onRenderedEvent;
    public final String pageHeader;
    public final SavingsScreenViewModel.Content.SavingsScreenElement.BetweenSection pageHeaderBottomSpacing;
    public final float progress;
    public final String progressAccessibilityLabel;

    public interface Footer {

        public final class GoalAmountRemaining implements Footer {
            public final SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance.Amount amount;
            public final String subtitle;

            public GoalAmountRemaining(SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance.Amount amount, String str) {
                this.amount = amount;
                this.subtitle = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof GoalAmountRemaining)) {
                    return false;
                }
                GoalAmountRemaining goalAmountRemaining = (GoalAmountRemaining) obj;
                return this.amount.equals(goalAmountRemaining.amount) && this.subtitle.equals(goalAmountRemaining.subtitle);
            }

            public final int hashCode() {
                return this.subtitle.hashCode() + (this.amount.hashCode() * 31);
            }

            public final String toString() {
                return "GoalAmountRemaining(amount=" + this.amount + ", subtitle=" + this.subtitle + ")";
            }
        }

        public final class GoalMet implements Footer {
            public final Button button;

            public final class Button {
                public final SavingsScreenViewEvent action;
                public final boolean enabled;
                public final String text;

                public Button(String str, SavingsScreenViewEvent savingsScreenViewEvent, boolean z) {
                    this.text = str;
                    this.action = savingsScreenViewEvent;
                    this.enabled = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Button)) {
                        return false;
                    }
                    Button button = (Button) obj;
                    return this.text.equals(button.text) && this.action.equals(button.action) && this.enabled == button.enabled;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.enabled) + ((this.action.hashCode() + (this.text.hashCode() * 31)) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Button(text=");
                    sb.append(this.text);
                    sb.append(", action=");
                    sb.append(this.action);
                    sb.append(", enabled=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.enabled, ")");
                }
            }

            public GoalMet(Button button) {
                this.button = button;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GoalMet) && this.button.equals(((GoalMet) obj).button);
            }

            public final int hashCode() {
                return this.button.hashCode();
            }

            public final String toString() {
                return "GoalMet(button=" + this.button + ")";
            }
        }
    }

    public SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader(String str, SavingsScreenViewModel.Content.SavingsScreenElement.BetweenSection betweenSection, float f, SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance savingsScreenViewModel$Content$SavingsScreenElement$Header$Balance, String str2, String str3, Footer footer, String str4, SavingsScreenViewEvent.BalanceSeenEvent balanceSeenEvent) {
        this.pageHeader = str;
        this.pageHeaderBottomSpacing = betweenSection;
        this.progress = f;
        this.balance = savingsScreenViewModel$Content$SavingsScreenElement$Header$Balance;
        this.iconId = str2;
        this.iconLabel = str3;
        this.footer = footer;
        this.progressAccessibilityLabel = str4;
        this.onRenderedEvent = balanceSeenEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader)) {
            return false;
        }
        SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader = (SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader) obj;
        return Intrinsics.areEqual(this.pageHeader, savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.pageHeader) && Intrinsics.areEqual(this.pageHeaderBottomSpacing, savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.pageHeaderBottomSpacing) && Float.compare(this.progress, savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.progress) == 0 && this.balance.equals(savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.balance) && Intrinsics.areEqual(this.iconId, savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.iconId) && Intrinsics.areEqual(this.iconLabel, savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.iconLabel) && Intrinsics.areEqual(this.footer, savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.footer) && this.progressAccessibilityLabel.equals(savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.progressAccessibilityLabel) && Intrinsics.areEqual(this.onRenderedEvent, savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.onRenderedEvent);
    }

    public final int hashCode() {
        String str = this.pageHeader;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        SavingsScreenViewModel.Content.SavingsScreenElement.BetweenSection betweenSection = this.pageHeaderBottomSpacing;
        int hashCode2 = (this.balance.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.progress, (hashCode + (betweenSection == null ? 0 : betweenSection.variant.hashCode())) * 31, 31)) * 31;
        String str2 = this.iconId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconLabel;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Footer footer = this.footer;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (footer == null ? 0 : footer.hashCode())) * 31, 31, this.progressAccessibilityLabel);
        SavingsScreenViewEvent savingsScreenViewEvent = this.onRenderedEvent;
        return m + (savingsScreenViewEvent != null ? savingsScreenViewEvent.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoalHeader(pageHeader=");
        sb.append(this.pageHeader);
        sb.append(", pageHeaderBottomSpacing=");
        sb.append(this.pageHeaderBottomSpacing);
        sb.append(", progress=");
        sb.append(this.progress);
        sb.append(", balance=");
        sb.append(this.balance);
        sb.append(", iconId=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.iconId, ", iconLabel=", this.iconLabel, ", footer=");
        sb.append(this.footer);
        sb.append(", progressAccessibilityLabel=");
        sb.append(this.progressAccessibilityLabel);
        sb.append(", onRenderedEvent=");
        sb.append(this.onRenderedEvent);
        sb.append(")");
        return sb.toString();
    }
}
