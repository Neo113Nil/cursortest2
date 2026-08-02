package com.squareup.cash.investing.backend.api.model;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface EntitySelectionBlocker {

    /* loaded from: classes6.dex */
    public final class MultiSelectData implements EntitySelectionBlocker {
        public final MultiSelectConfig multiSelectConfig;
        public final StockSelectorConfig stockSelectorConfig;

        public final class MultiSelectConfig {
            public final String cancelCtaText;
            public final String confirmCtaText;
            public final String infoText;
            public final int maxSelections;
            public final List selectedInvestmentEntities;
            public final ZeroSelectionBehavior zeroSelectionBehavior;

            public MultiSelectConfig(int i, List list, String str, String str2, String str3, ZeroSelectionBehavior zeroSelectionBehavior) {
                list.getClass();
                this.maxSelections = i;
                this.selectedInvestmentEntities = list;
                this.confirmCtaText = str;
                this.cancelCtaText = str2;
                this.infoText = str3;
                this.zeroSelectionBehavior = zeroSelectionBehavior;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MultiSelectConfig)) {
                    return false;
                }
                MultiSelectConfig multiSelectConfig = (MultiSelectConfig) obj;
                return this.maxSelections == multiSelectConfig.maxSelections && Intrinsics.areEqual(this.selectedInvestmentEntities, multiSelectConfig.selectedInvestmentEntities) && this.confirmCtaText.equals(multiSelectConfig.confirmCtaText) && this.cancelCtaText.equals(multiSelectConfig.cancelCtaText) && Intrinsics.areEqual(this.infoText, multiSelectConfig.infoText) && this.zeroSelectionBehavior.equals(multiSelectConfig.zeroSelectionBehavior);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(Integer.hashCode(this.maxSelections) * 31, 31, this.selectedInvestmentEntities), 31, this.confirmCtaText), 31, this.cancelCtaText);
                String str = this.infoText;
                return this.zeroSelectionBehavior.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MultiSelectConfig(maxSelections=");
                sb.append(this.maxSelections);
                sb.append(", selectedInvestmentEntities=");
                sb.append(this.selectedInvestmentEntities);
                sb.append(", confirmCtaText=");
                Boxes$$ExternalSyntheticOutline1.m(sb, this.confirmCtaText, ", cancelCtaText=", this.cancelCtaText, ", infoText=");
                sb.append(this.infoText);
                sb.append(", zeroSelectionBehavior=");
                sb.append(this.zeroSelectionBehavior);
                sb.append(")");
                return sb.toString();
            }
        }

        public interface ZeroSelectionBehavior {

            public final class ShowCancelCta implements ZeroSelectionBehavior {
                public static final ShowCancelCta INSTANCE = new ShowCancelCta();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof ShowCancelCta);
                }

                public final int hashCode() {
                    return -1321346469;
                }

                public final String toString() {
                    return "ShowCancelCta";
                }
            }

            public final class ShowConfirmCtaDisabled implements ZeroSelectionBehavior {
                public static final ShowConfirmCtaDisabled INSTANCE = new ShowConfirmCtaDisabled();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof ShowConfirmCtaDisabled);
                }

                public final int hashCode() {
                    return 2147043911;
                }

                public final String toString() {
                    return "ShowConfirmCtaDisabled";
                }
            }
        }

        public MultiSelectData(StockSelectorConfig stockSelectorConfig, MultiSelectConfig multiSelectConfig) {
            this.stockSelectorConfig = stockSelectorConfig;
            this.multiSelectConfig = multiSelectConfig;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultiSelectData)) {
                return false;
            }
            MultiSelectData multiSelectData = (MultiSelectData) obj;
            return this.stockSelectorConfig.equals(multiSelectData.stockSelectorConfig) && this.multiSelectConfig.equals(multiSelectData.multiSelectConfig);
        }

        @Override // com.squareup.cash.investing.backend.api.model.EntitySelectionBlocker
        public final StockSelectorConfig getStockSelectorConfig() {
            return this.stockSelectorConfig;
        }

        public final int hashCode() {
            return this.multiSelectConfig.hashCode() + (this.stockSelectorConfig.hashCode() * 961);
        }

        public final String toString() {
            return "MultiSelectData(stockSelectorConfig=" + this.stockSelectorConfig + ", stockSelectionResult=null, multiSelectConfig=" + this.multiSelectConfig + ")";
        }
    }

    /* loaded from: classes6.dex */
    public final class SingleSelectData implements EntitySelectionBlocker {
        public final StockSelectorConfig stockSelectorConfig;

        public SingleSelectData(StockSelectorConfig stockSelectorConfig) {
            this.stockSelectorConfig = stockSelectorConfig;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SingleSelectData) && this.stockSelectorConfig.equals(((SingleSelectData) obj).stockSelectorConfig);
        }

        @Override // com.squareup.cash.investing.backend.api.model.EntitySelectionBlocker
        public final StockSelectorConfig getStockSelectorConfig() {
            return this.stockSelectorConfig;
        }

        public final int hashCode() {
            return this.stockSelectorConfig.hashCode() * 31;
        }

        public final String toString() {
            return "SingleSelectData(stockSelectorConfig=" + this.stockSelectorConfig + ", stockSelectionResult=null)";
        }
    }

    /* loaded from: classes6.dex */
    public final class StockSelectorConfig {
        public final String searchBarPlaceholderText;
        public final Color selectionTintColor;
        public final String title;

        public StockSelectorConfig(Color color, String str, String str2) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.searchBarPlaceholderText = str2;
            this.selectionTintColor = color;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StockSelectorConfig)) {
                return false;
            }
            StockSelectorConfig stockSelectorConfig = (StockSelectorConfig) obj;
            return Intrinsics.areEqual(this.title, stockSelectorConfig.title) && Intrinsics.areEqual(this.searchBarPlaceholderText, stockSelectorConfig.searchBarPlaceholderText) && Intrinsics.areEqual(this.selectionTintColor, stockSelectorConfig.selectionTintColor);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.searchBarPlaceholderText);
            Color color = this.selectionTintColor;
            return m + (color == null ? 0 : color.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StockSelectorConfig(title=", this.title, ", searchBarPlaceholderText=", this.searchBarPlaceholderText, ", selectionTintColor=");
            m.append(this.selectionTintColor);
            m.append(")");
            return m.toString();
        }
    }

    StockSelectorConfig getStockSelectorConfig();
}
