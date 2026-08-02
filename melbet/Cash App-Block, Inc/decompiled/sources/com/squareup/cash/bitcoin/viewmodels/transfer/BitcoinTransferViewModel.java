package com.squareup.cash.bitcoin.viewmodels.transfer;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BitcoinTransferViewModel {

    public abstract class Content implements BitcoinTransferViewModel {

        public final class BottomSheetContent extends Content {
            public final List amountSelections;
            public final boolean hasInvalidAmount;
            public final boolean instrumentCellEnabled;
            public final InstrumentCellViewModel instrumentCellViewModel;
            public final Money maxAmount;
            public final boolean orderTypeButtonVisible;
            public final String restoreKeypadAmount;
            public final boolean submitButtonEnabled;
            public final String submitLabel;
            public final Subtitle subtitle;
            public final String title;

            public BottomSheetContent(String str, Subtitle subtitle, boolean z, List list, String str2, Money money, String str3, boolean z2, boolean z3, InstrumentCellViewModel instrumentCellViewModel, boolean z4) {
                str.getClass();
                list.getClass();
                money.getClass();
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
                this.instrumentCellViewModel = instrumentCellViewModel;
                this.instrumentCellEnabled = z4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BottomSheetContent)) {
                    return false;
                }
                BottomSheetContent bottomSheetContent = (BottomSheetContent) obj;
                return Intrinsics.areEqual(this.title, bottomSheetContent.title) && Intrinsics.areEqual(this.subtitle, bottomSheetContent.subtitle) && this.orderTypeButtonVisible == bottomSheetContent.orderTypeButtonVisible && Intrinsics.areEqual(this.amountSelections, bottomSheetContent.amountSelections) && Intrinsics.areEqual(this.restoreKeypadAmount, bottomSheetContent.restoreKeypadAmount) && Intrinsics.areEqual(this.maxAmount, bottomSheetContent.maxAmount) && Intrinsics.areEqual(this.submitLabel, bottomSheetContent.submitLabel) && this.submitButtonEnabled == bottomSheetContent.submitButtonEnabled && this.hasInvalidAmount == bottomSheetContent.hasInvalidAmount && Intrinsics.areEqual(this.instrumentCellViewModel, bottomSheetContent.instrumentCellViewModel) && this.instrumentCellEnabled == bottomSheetContent.instrumentCellEnabled;
            }

            @Override // com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel.Content
            public final boolean getHasInvalidAmount() {
                return this.hasInvalidAmount;
            }

            @Override // com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel.Content
            public final InstrumentCellViewModel getInstrumentCellViewModel() {
                return this.instrumentCellViewModel;
            }

            @Override // com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel.Content
            public final String getSubmitLabel() {
                return this.submitLabel;
            }

            public final int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                Subtitle subtitle = this.subtitle;
                int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (subtitle == null ? 0 : subtitle.hashCode())) * 31, 31, this.orderTypeButtonVisible), 31, this.amountSelections);
                String str = this.restoreKeypadAmount;
                int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.maxAmount, (m + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.submitLabel), 31, this.submitButtonEnabled), 31, this.hasInvalidAmount);
                InstrumentCellViewModel instrumentCellViewModel = this.instrumentCellViewModel;
                return Boolean.hashCode(this.instrumentCellEnabled) + ((m2 + (instrumentCellViewModel != null ? instrumentCellViewModel.hashCode() : 0)) * 31);
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
                sb.append(this.hasInvalidAmount);
                sb.append(", instrumentCellViewModel=");
                sb.append(this.instrumentCellViewModel);
                sb.append(", instrumentCellEnabled=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.instrumentCellEnabled, ")");
            }
        }

        public final class FullScreenContent extends Content {
            public final boolean hasInvalidAmount;
            public final boolean instrumentCellEnabled;
            public final InstrumentCellViewModel instrumentCellViewModel;
            public final Money maxAmount;
            public final NavigationIconType navigationType;
            public final boolean orderTypeButtonVisible;
            public final String restoreKeypadAmount;
            public final boolean submitButtonEnabled;
            public final String submitLabel;
            public final Subtitle subtitle;
            public final String title;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class NavigationIconType {
                public static final /* synthetic */ NavigationIconType[] $VALUES;
                public static final NavigationIconType BACK;
                public static final NavigationIconType CLOSE;

                static {
                    NavigationIconType navigationIconType = new NavigationIconType("CLOSE", 0);
                    CLOSE = navigationIconType;
                    NavigationIconType navigationIconType2 = new NavigationIconType("BACK", 1);
                    BACK = navigationIconType2;
                    $VALUES = new NavigationIconType[]{navigationIconType, navigationIconType2};
                }

                public static NavigationIconType valueOf(String str) {
                    return (NavigationIconType) Enum.valueOf(NavigationIconType.class, str);
                }

                public static NavigationIconType[] values() {
                    return (NavigationIconType[]) $VALUES.clone();
                }
            }

            public FullScreenContent(String str, Subtitle subtitle, boolean z, String str2, Money money, String str3, boolean z2, boolean z3, NavigationIconType navigationIconType, InstrumentCellViewModel instrumentCellViewModel, boolean z4) {
                str.getClass();
                money.getClass();
                str3.getClass();
                navigationIconType.getClass();
                this.title = str;
                this.subtitle = subtitle;
                this.orderTypeButtonVisible = z;
                this.restoreKeypadAmount = str2;
                this.maxAmount = money;
                this.submitLabel = str3;
                this.submitButtonEnabled = z2;
                this.hasInvalidAmount = z3;
                this.navigationType = navigationIconType;
                this.instrumentCellViewModel = instrumentCellViewModel;
                this.instrumentCellEnabled = z4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FullScreenContent)) {
                    return false;
                }
                FullScreenContent fullScreenContent = (FullScreenContent) obj;
                return Intrinsics.areEqual(this.title, fullScreenContent.title) && Intrinsics.areEqual(this.subtitle, fullScreenContent.subtitle) && this.orderTypeButtonVisible == fullScreenContent.orderTypeButtonVisible && Intrinsics.areEqual(this.restoreKeypadAmount, fullScreenContent.restoreKeypadAmount) && Intrinsics.areEqual(this.maxAmount, fullScreenContent.maxAmount) && Intrinsics.areEqual(this.submitLabel, fullScreenContent.submitLabel) && this.submitButtonEnabled == fullScreenContent.submitButtonEnabled && this.hasInvalidAmount == fullScreenContent.hasInvalidAmount && this.navigationType == fullScreenContent.navigationType && Intrinsics.areEqual(this.instrumentCellViewModel, fullScreenContent.instrumentCellViewModel) && this.instrumentCellEnabled == fullScreenContent.instrumentCellEnabled;
            }

            @Override // com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel.Content
            public final boolean getHasInvalidAmount() {
                return this.hasInvalidAmount;
            }

            @Override // com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel.Content
            public final InstrumentCellViewModel getInstrumentCellViewModel() {
                return this.instrumentCellViewModel;
            }

            @Override // com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel.Content
            public final String getSubmitLabel() {
                return this.submitLabel;
            }

            public final int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                Subtitle subtitle = this.subtitle;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (subtitle == null ? 0 : subtitle.hashCode())) * 31, 31, this.orderTypeButtonVisible);
                String str = this.restoreKeypadAmount;
                int hashCode2 = (this.navigationType.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.maxAmount, (m + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.submitLabel), 31, this.submitButtonEnabled), 961, this.hasInvalidAmount)) * 31;
                InstrumentCellViewModel instrumentCellViewModel = this.instrumentCellViewModel;
                return Boolean.hashCode(this.instrumentCellEnabled) + ((hashCode2 + (instrumentCellViewModel != null ? instrumentCellViewModel.hashCode() : 0)) * 31);
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
                re$$ExternalSyntheticOutline0.m(sb, this.submitButtonEnabled, ", hasInvalidAmount=", this.hasInvalidAmount, ", dialogContent=null, navigationType=");
                sb.append(this.navigationType);
                sb.append(", instrumentCellViewModel=");
                sb.append(this.instrumentCellViewModel);
                sb.append(", instrumentCellEnabled=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.instrumentCellEnabled, ")");
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

        public abstract InstrumentCellViewModel getInstrumentCellViewModel();

        public abstract String getSubmitLabel();
    }

    public final class DefaultInitialModel implements BitcoinTransferViewModel {
        public static final DefaultInitialModel INSTANCE = new DefaultInitialModel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DefaultInitialModel);
        }

        public final int hashCode() {
            return -1113783271;
        }

        public final String toString() {
            return "DefaultInitialModel";
        }
    }

    /* loaded from: classes4.dex */
    public final class Loading implements BitcoinTransferViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -2078471505;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
