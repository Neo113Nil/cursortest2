package com.squareup.cash.investing.viewmodels.exchange;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface InvestingExchangeViewModel {

    public abstract class Content implements InvestingExchangeViewModel {

        public final class BottomSheetContent extends Content {
            public final List amountSelections;
            public final boolean hasInvalidAmount;
            public final Money maxAmount;
            public final boolean orderTypeButtonVisible;
            public final String restoreKeypadAmount;
            public final boolean submitButtonEnabled;
            public final String submitLabel;
            public final Subtitle subtitle;
            public final String title;

            public BottomSheetContent(String str, Subtitle subtitle, boolean z, List list, String str2, Money money, String str3, boolean z2, boolean z3) {
                list.getClass();
                str3.getClass();
                this.title = str;
                this.subtitle = subtitle;
                this.orderTypeButtonVisible = z;
                this.amountSelections = list;
                this.restoreKeypadAmount = str2;
                this.maxAmount = money;
                this.submitLabel = str3;
                this.submitButtonEnabled = z2;
                this.hasInvalidAmount = z3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BottomSheetContent)) {
                    return false;
                }
                BottomSheetContent bottomSheetContent = (BottomSheetContent) obj;
                return this.title.equals(bottomSheetContent.title) && Intrinsics.areEqual(this.subtitle, bottomSheetContent.subtitle) && this.orderTypeButtonVisible == bottomSheetContent.orderTypeButtonVisible && Intrinsics.areEqual(this.amountSelections, bottomSheetContent.amountSelections) && Intrinsics.areEqual(this.restoreKeypadAmount, bottomSheetContent.restoreKeypadAmount) && this.maxAmount.equals(bottomSheetContent.maxAmount) && Intrinsics.areEqual(this.submitLabel, bottomSheetContent.submitLabel) && this.submitButtonEnabled == bottomSheetContent.submitButtonEnabled && this.hasInvalidAmount == bottomSheetContent.hasInvalidAmount;
            }

            @Override // com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewModel.Content
            public final boolean getHasInvalidAmount() {
                return this.hasInvalidAmount;
            }

            @Override // com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewModel.Content
            public final boolean getSubmitButtonEnabled() {
                return this.submitButtonEnabled;
            }

            @Override // com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewModel.Content
            public final String getSubmitLabel() {
                return this.submitLabel;
            }

            public final int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                Subtitle subtitle = this.subtitle;
                int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (subtitle == null ? 0 : subtitle.hashCode())) * 31, 31, this.orderTypeButtonVisible), 31, this.amountSelections);
                String str = this.restoreKeypadAmount;
                return Boolean.hashCode(this.hasInvalidAmount) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.maxAmount, (m + (str != null ? str.hashCode() : 0)) * 31, 31), 31, this.submitLabel), 31, this.submitButtonEnabled);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("BottomSheetContent(title=");
                sb.append(this.title);
                sb.append(", subtitle=");
                sb.append(this.subtitle);
                sb.append(", orderTypeButtonVisible=");
                sb.append(this.orderTypeButtonVisible);
                sb.append(", amountSelections=");
                sb.append(this.amountSelections);
                sb.append(", restoreKeypadAmount=");
                sb.append(this.restoreKeypadAmount);
                sb.append(", maxAmount=");
                sb.append(this.maxAmount);
                sb.append(", submitLabel=");
                NavAction$$ExternalSyntheticOutline0.m(sb, this.submitLabel, ", submitButtonEnabled=", this.submitButtonEnabled, ", hasInvalidAmount=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.hasInvalidAmount, ")");
            }
        }

        public final class FullScreenContent extends Content {
            public final Money maxAmount;
            public final boolean orderTypeButtonVisible;
            public final String restoreKeypadAmount;
            public final boolean submitButtonEnabled;
            public final String submitLabel;
            public final Subtitle subtitle;
            public final String title;

            public FullScreenContent(String str, Subtitle subtitle, boolean z, String str2, Money money, String str3, boolean z2) {
                str3.getClass();
                this.title = str;
                this.subtitle = subtitle;
                this.orderTypeButtonVisible = z;
                this.restoreKeypadAmount = str2;
                this.maxAmount = money;
                this.submitLabel = str3;
                this.submitButtonEnabled = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FullScreenContent)) {
                    return false;
                }
                FullScreenContent fullScreenContent = (FullScreenContent) obj;
                return this.title.equals(fullScreenContent.title) && Intrinsics.areEqual(this.subtitle, fullScreenContent.subtitle) && this.orderTypeButtonVisible == fullScreenContent.orderTypeButtonVisible && Intrinsics.areEqual(this.restoreKeypadAmount, fullScreenContent.restoreKeypadAmount) && this.maxAmount.equals(fullScreenContent.maxAmount) && Intrinsics.areEqual(this.submitLabel, fullScreenContent.submitLabel) && this.submitButtonEnabled == fullScreenContent.submitButtonEnabled;
            }

            @Override // com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewModel.Content
            public final boolean getHasInvalidAmount() {
                return false;
            }

            @Override // com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewModel.Content
            public final boolean getSubmitButtonEnabled() {
                return this.submitButtonEnabled;
            }

            @Override // com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewModel.Content
            public final String getSubmitLabel() {
                return this.submitLabel;
            }

            public final int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                Subtitle subtitle = this.subtitle;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (subtitle == null ? 0 : subtitle.hashCode())) * 31, 31, this.orderTypeButtonVisible);
                String str = this.restoreKeypadAmount;
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.maxAmount, (m + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.submitLabel), 31, this.submitButtonEnabled), 31, false);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("FullScreenContent(title=");
                sb.append(this.title);
                sb.append(", subtitle=");
                sb.append(this.subtitle);
                sb.append(", orderTypeButtonVisible=");
                NavAction$$ExternalSyntheticOutline0.m(sb, this.orderTypeButtonVisible, ", restoreKeypadAmount=", this.restoreKeypadAmount, ", maxAmount=");
                sb.append(this.maxAmount);
                sb.append(", submitLabel=");
                sb.append(this.submitLabel);
                sb.append(", submitButtonEnabled=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.submitButtonEnabled, ", hasInvalidAmount=false, dialogContent=null)");
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Icon {
            public static final /* synthetic */ Icon[] $VALUES;
            public static final Icon RECURRING;

            static {
                Icon icon = new Icon("RECURRING", 0);
                RECURRING = icon;
                $VALUES = new Icon[]{icon};
            }

            public static Icon valueOf(String str) {
                return (Icon) Enum.valueOf(Icon.class, str);
            }

            public static Icon[] values() {
                return (Icon[]) $VALUES.clone();
            }
        }

        public final class Subtitle {
            public final Icon icon;
            public final String label;

            public Subtitle(String str, Icon icon) {
                str.getClass();
                this.label = str;
                this.icon = icon;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Subtitle)) {
                    return false;
                }
                Subtitle subtitle = (Subtitle) obj;
                return Intrinsics.areEqual(this.label, subtitle.label) && this.icon == subtitle.icon;
            }

            public final int hashCode() {
                int hashCode = this.label.hashCode() * 31;
                Icon icon = this.icon;
                return hashCode + (icon == null ? 0 : icon.hashCode());
            }

            public final String toString() {
                return "Subtitle(label=" + this.label + ", icon=" + this.icon + ")";
            }
        }

        public abstract boolean getHasInvalidAmount();

        public abstract boolean getSubmitButtonEnabled();

        public abstract String getSubmitLabel();
    }

    public final class Initial implements InvestingExchangeViewModel {
        public static final Initial INSTANCE = new Initial();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Initial);
        }

        public final int hashCode() {
            return -857538839;
        }

        public final String toString() {
            return "Initial";
        }
    }
}
