package com.squareup.cash.payments.viewmodels;

import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public interface PersonalizePaymentStickersViewEvent {

    public final class Back implements PersonalizePaymentStickersViewEvent {
        public static final Back INSTANCE = new Back();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return 2040494296;
        }

        public final String toString() {
            return Constants.META_BACK_BUTTON;
        }
    }

    public final class StickerSelected implements PersonalizePaymentStickersViewEvent {
        public final int index;

        public StickerSelected(int i) {
            this.index = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StickerSelected) && this.index == ((StickerSelected) obj).index;
        }

        public final int hashCode() {
            return Integer.hashCode(this.index);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.index, "StickerSelected(index=", ")");
        }
    }
}
