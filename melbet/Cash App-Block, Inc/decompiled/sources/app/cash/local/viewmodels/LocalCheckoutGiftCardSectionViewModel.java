package app.cash.local.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalCheckoutGiftCardSectionViewModel {
    public final List appliedGiftCards;
    public final GiftCardInputState input;
    public final boolean isExpanded;

    public LocalCheckoutGiftCardSectionViewModel(GiftCardInputState giftCardInputState, List list, boolean z) {
        list.getClass();
        this.input = giftCardInputState;
        this.appliedGiftCards = list;
        this.isExpanded = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalCheckoutGiftCardSectionViewModel)) {
            return false;
        }
        LocalCheckoutGiftCardSectionViewModel localCheckoutGiftCardSectionViewModel = (LocalCheckoutGiftCardSectionViewModel) obj;
        return Intrinsics.areEqual(this.input, localCheckoutGiftCardSectionViewModel.input) && Intrinsics.areEqual(this.appliedGiftCards, localCheckoutGiftCardSectionViewModel.appliedGiftCards) && this.isExpanded == localCheckoutGiftCardSectionViewModel.isExpanded;
    }

    public final int hashCode() {
        GiftCardInputState giftCardInputState = this.input;
        return Boolean.hashCode(this.isExpanded) + Recorder$$ExternalSyntheticOutline2.m((giftCardInputState == null ? 0 : giftCardInputState.hashCode()) * 31, 31, this.appliedGiftCards);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocalCheckoutGiftCardSectionViewModel(input=");
        sb.append(this.input);
        sb.append(", appliedGiftCards=");
        sb.append(this.appliedGiftCards);
        sb.append(", isExpanded=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isExpanded, ")");
    }
}
