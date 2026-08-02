package com.squareup.cash.blockers.viewmodels;

import com.squareup.cash.blockers.viewmodels.LayoutUpdate;
import com.squareup.protos.franklin.common.StatusResultButton;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class StatusResultViewEvent {

    public final class ButtonClick extends StatusResultViewEvent {
        public final StatusResultButton button;

        public ButtonClick(StatusResultButton statusResultButton) {
            statusResultButton.getClass();
            this.button = statusResultButton;
        }
    }

    public final class GoBack extends StatusResultViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return -418225261;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class PromotionsSelected extends StatusResultViewEvent {
        public final LayoutUpdate.Promotions promotions;

        public PromotionsSelected(LayoutUpdate.Promotions promotions) {
            promotions.getClass();
            this.promotions = promotions;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PromotionsSelected) && Intrinsics.areEqual(this.promotions, ((PromotionsSelected) obj).promotions);
        }

        public final int hashCode() {
            return this.promotions.hashCode();
        }

        public final String toString() {
            return "PromotionsSelected(promotions=" + this.promotions + ")";
        }
    }
}
