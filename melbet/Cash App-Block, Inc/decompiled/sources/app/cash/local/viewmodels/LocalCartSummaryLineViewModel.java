package app.cash.local.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalCartSummaryLineViewModel {
    public final Discount discount;
    public final int index;
    public final String information;
    public final String label;
    public final int quantity;
    public final List slots;
    public final String totalPriceBeforeDiscountFormatted;
    public final String totalPriceFormatted;

    public final class Discount {
        public final String amount;
        public final String text;

        public Discount(String str, String str2) {
            this.text = str;
            this.amount = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Discount)) {
                return false;
            }
            Discount discount = (Discount) obj;
            return this.text.equals(discount.text) && this.amount.equals(discount.amount);
        }

        public final int hashCode() {
            return this.amount.hashCode() + (this.text.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Discount(text=", this.text, ", amount=", this.amount, ")");
        }
    }

    public LocalCartSummaryLineViewModel(int i, String str, String str2, String str3, String str4, int i2, Discount discount, List list) {
        str.getClass();
        list.getClass();
        this.index = i;
        this.label = str;
        this.information = str2;
        this.totalPriceFormatted = str3;
        this.totalPriceBeforeDiscountFormatted = str4;
        this.quantity = i2;
        this.discount = discount;
        this.slots = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalCartSummaryLineViewModel)) {
            return false;
        }
        LocalCartSummaryLineViewModel localCartSummaryLineViewModel = (LocalCartSummaryLineViewModel) obj;
        return this.index == localCartSummaryLineViewModel.index && Intrinsics.areEqual(this.label, localCartSummaryLineViewModel.label) && Intrinsics.areEqual(this.information, localCartSummaryLineViewModel.information) && Intrinsics.areEqual(this.totalPriceFormatted, localCartSummaryLineViewModel.totalPriceFormatted) && Intrinsics.areEqual(this.totalPriceBeforeDiscountFormatted, localCartSummaryLineViewModel.totalPriceBeforeDiscountFormatted) && this.quantity == localCartSummaryLineViewModel.quantity && Intrinsics.areEqual(this.discount, localCartSummaryLineViewModel.discount) && Intrinsics.areEqual(this.slots, localCartSummaryLineViewModel.slots);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Integer.hashCode(this.index) * 31, 31, this.label);
        String str = this.information;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.totalPriceFormatted);
        String str2 = this.totalPriceBeforeDiscountFormatted;
        int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.quantity, (m2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Discount discount = this.discount;
        return this.slots.hashCode() + ((m3 + (discount != null ? discount.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("LocalCartSummaryLineViewModel(index=", this.index, ", label=", this.label, ", information=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.information, ", totalPriceFormatted=", this.totalPriceFormatted, ", totalPriceBeforeDiscountFormatted=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.totalPriceBeforeDiscountFormatted, ", quantity=", this.quantity, ", discount=");
        m.append(this.discount);
        m.append(", slots=");
        m.append(this.slots);
        m.append(")");
        return m.toString();
    }
}
