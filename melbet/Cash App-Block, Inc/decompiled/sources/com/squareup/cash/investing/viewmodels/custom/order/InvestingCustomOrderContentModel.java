package com.squareup.cash.investing.viewmodels.custom.order;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.multiplatform.investing.PriceValue;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingStockDetailsHeaderViewModel;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.TypesJVMKt;

/* loaded from: classes6.dex */
public abstract class InvestingCustomOrderContentModel {

    public final class Content extends InvestingCustomOrderContentModel {
        public final long currentPrice;
        public final String explanation;
        public final InvestingGraphContentModel.Loaded graphContentModel;
        public final InvestingStockDetailsHeaderViewModel headerViewModel;
        public final boolean isGraphReady;
        public final boolean isGraphReset;
        public final String lowerLimit;
        public final PriceValue selectedPrice;
        public final HistoricalRange selectedRange;
        public final List ticks;
        public final String title;
        public final TypesJVMKt tooltip;
        public final String upperLimit;

        public Content(String str, InvestingStockDetailsHeaderViewModel investingStockDetailsHeaderViewModel, InvestingGraphContentModel.Loaded loaded, String str2, String str3, List list, TypesJVMKt typesJVMKt, HistoricalRange historicalRange, PriceValue priceValue, long j, String str4, boolean z, boolean z2) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            list.getClass();
            historicalRange.getClass();
            this.title = str;
            this.headerViewModel = investingStockDetailsHeaderViewModel;
            this.graphContentModel = loaded;
            this.upperLimit = str2;
            this.lowerLimit = str3;
            this.ticks = list;
            this.tooltip = typesJVMKt;
            this.selectedRange = historicalRange;
            this.selectedPrice = priceValue;
            this.currentPrice = j;
            this.explanation = str4;
            this.isGraphReady = z;
            this.isGraphReset = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.title, content.title) && this.headerViewModel.equals(content.headerViewModel) && this.graphContentModel.equals(content.graphContentModel) && Intrinsics.areEqual(this.upperLimit, content.upperLimit) && Intrinsics.areEqual(this.lowerLimit, content.lowerLimit) && Intrinsics.areEqual(this.ticks, content.ticks) && this.tooltip.equals(content.tooltip) && this.selectedRange == content.selectedRange && this.selectedPrice.equals(content.selectedPrice) && PriceValue.m3663equalsimpl0(this.currentPrice, content.currentPrice) && Intrinsics.areEqual(this.explanation, content.explanation) && this.isGraphReady == content.isGraphReady && this.isGraphReset == content.isGraphReset;
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((this.selectedRange.hashCode() + ((this.tooltip.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.graphContentModel.hashCode() + ((this.headerViewModel.hashCode() + (this.title.hashCode() * 31)) * 31)) * 31, 31, this.upperLimit), 31, this.lowerLimit), 31, this.ticks)) * 31)) * 31, 31, this.selectedPrice.value), 31, this.currentPrice);
            String str = this.explanation;
            return Boolean.hashCode(this.isGraphReset) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.isGraphReady);
        }

        public final String toString() {
            String m3664toStringimpl = PriceValue.m3664toStringimpl(this.currentPrice);
            StringBuilder sb = new StringBuilder("Content(title=");
            sb.append(this.title);
            sb.append(", headerViewModel=");
            sb.append(this.headerViewModel);
            sb.append(", graphContentModel=");
            sb.append(this.graphContentModel);
            sb.append(", upperLimit=");
            sb.append(this.upperLimit);
            sb.append(", lowerLimit=");
            NavAction$$ExternalSyntheticOutline0.m(this.lowerLimit, ", ticks=", ", tooltip=", sb, this.ticks);
            sb.append(this.tooltip);
            sb.append(", selectedRange=");
            sb.append(this.selectedRange);
            sb.append(", selectedPrice=");
            sb.append(this.selectedPrice);
            sb.append(", currentPrice=");
            sb.append(m3664toStringimpl);
            sb.append(", explanation=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.explanation, ", isGraphReady=", this.isGraphReady, ", isGraphReset=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isGraphReset, ")");
        }
    }

    public final class Loading extends InvestingCustomOrderContentModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -619317953;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
