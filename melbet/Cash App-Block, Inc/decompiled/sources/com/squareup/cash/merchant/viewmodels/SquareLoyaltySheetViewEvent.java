package com.squareup.cash.merchant.viewmodels;

import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface SquareLoyaltySheetViewEvent {

    public final class Close implements SquareLoyaltySheetViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 613498494;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class LoyaltyGenericTreeElementsViewEvent implements SquareLoyaltySheetViewEvent {
        public final GenericTreeElementsViewEvent event;

        public LoyaltyGenericTreeElementsViewEvent(GenericTreeElementsViewEvent genericTreeElementsViewEvent) {
            genericTreeElementsViewEvent.getClass();
            this.event = genericTreeElementsViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoyaltyGenericTreeElementsViewEvent) && Intrinsics.areEqual(this.event, ((LoyaltyGenericTreeElementsViewEvent) obj).event);
        }

        public final int hashCode() {
            return this.event.hashCode();
        }

        public final String toString() {
            return "LoyaltyGenericTreeElementsViewEvent(event=" + this.event + ")";
        }
    }
}
