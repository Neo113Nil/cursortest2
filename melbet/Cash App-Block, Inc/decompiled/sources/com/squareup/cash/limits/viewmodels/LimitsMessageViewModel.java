package com.squareup.cash.limits.viewmodels;

import com.squareup.cash.marketing.components.CardUpsellIllustration;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface LimitsMessageViewModel {

    public final class CardUpsell implements LimitsMessageViewModel {
        public final String descriptionText;
        public final CardUpsellIllustration illustration;
        public final String primaryButtonText;
        public final String titleText;

        public CardUpsell(String str, String str2, CardUpsellIllustration cardUpsellIllustration, String str3) {
            str.getClass();
            this.titleText = str;
            this.descriptionText = str2;
            this.illustration = cardUpsellIllustration;
            this.primaryButtonText = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardUpsell)) {
                return false;
            }
            CardUpsell cardUpsell = (CardUpsell) obj;
            return Intrinsics.areEqual(this.titleText, cardUpsell.titleText) && Intrinsics.areEqual(this.descriptionText, cardUpsell.descriptionText) && Intrinsics.areEqual(this.illustration, cardUpsell.illustration) && this.primaryButtonText.equals(cardUpsell.primaryButtonText);
        }

        public final int hashCode() {
            int hashCode = this.titleText.hashCode() * 31;
            String str = this.descriptionText;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            CardUpsellIllustration cardUpsellIllustration = this.illustration;
            return this.primaryButtonText.hashCode() + ((hashCode2 + (cardUpsellIllustration != null ? cardUpsellIllustration.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CardUpsell(titleText=", this.titleText, ", descriptionText=", this.descriptionText, ", illustration=");
            m.append(this.illustration);
            m.append(", primaryButtonText=");
            m.append(this.primaryButtonText);
            m.append(")");
            return m.toString();
        }
    }

    public abstract class InlineMessage implements LimitsMessageViewModel {
    }

    public final class None implements LimitsMessageViewModel {
        public static final None INSTANCE = new None();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public final int hashCode() {
            return -1837900970;
        }

        public final String toString() {
            return "None";
        }
    }
}
