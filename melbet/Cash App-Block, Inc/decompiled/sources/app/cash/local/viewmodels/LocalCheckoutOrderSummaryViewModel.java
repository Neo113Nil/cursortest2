package app.cash.local.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalCheckoutOrderSummaryViewModel {
    public final boolean isExpanded;
    public final int itemCount;
    public final List selections;
    public final String subtotalAmount;
    public final List summaryLines;

    public LocalCheckoutOrderSummaryViewModel(int i, List list, List list2, boolean z, int i2) {
        list2 = (i2 & 4) != 0 ? EmptyList.INSTANCE : list2;
        z = (i2 & 32) != 0 ? false : z;
        list.getClass();
        list2.getClass();
        this.itemCount = i;
        this.selections = list;
        this.summaryLines = list2;
        this.subtotalAmount = null;
        this.isExpanded = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalCheckoutOrderSummaryViewModel)) {
            return false;
        }
        LocalCheckoutOrderSummaryViewModel localCheckoutOrderSummaryViewModel = (LocalCheckoutOrderSummaryViewModel) obj;
        return this.itemCount == localCheckoutOrderSummaryViewModel.itemCount && Intrinsics.areEqual(this.selections, localCheckoutOrderSummaryViewModel.selections) && this.summaryLines.equals(localCheckoutOrderSummaryViewModel.summaryLines) && Intrinsics.areEqual(this.subtotalAmount, localCheckoutOrderSummaryViewModel.subtotalAmount) && this.isExpanded == localCheckoutOrderSummaryViewModel.isExpanded;
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Integer.hashCode(this.itemCount) * 31, 31, this.selections), 31, this.summaryLines);
        String str = this.subtotalAmount;
        return Boolean.hashCode(this.isExpanded) + ((m + (str == null ? 0 : str.hashCode())) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocalCheckoutOrderSummaryViewModel(itemCount=");
        sb.append(this.itemCount);
        sb.append(", selections=");
        sb.append(this.selections);
        sb.append(", summaryLines=");
        Recorder$$ExternalSyntheticOutline2.m(", subtotalAmount=", this.subtotalAmount, ", totalAmount=null, isExpanded=", sb, this.summaryLines);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isExpanded, ")");
    }
}
