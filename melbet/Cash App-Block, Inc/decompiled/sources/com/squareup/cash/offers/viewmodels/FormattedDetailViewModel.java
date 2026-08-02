package com.squareup.cash.offers.viewmodels;

import com.squareup.protos.cash.ui.Color;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class FormattedDetailViewModel {

    public final class Countdown extends FormattedDetailViewModel {
        public final OfferCountdownTemplateViewModel template;

        public Countdown(OfferCountdownTemplateViewModel offerCountdownTemplateViewModel) {
            this.template = offerCountdownTemplateViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Countdown) && this.template.equals(((Countdown) obj).template);
        }

        public final int hashCode() {
            return this.template.hashCode();
        }

        public final String toString() {
            return "Countdown(template=" + this.template + ")";
        }
    }

    public final class Loading extends FormattedDetailViewModel {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Loading(leadingText=null, textColor=null)";
        }
    }

    public final class Text extends FormattedDetailViewModel {
        public final String text;
        public final Color textColor;

        public Text(Color color, String str) {
            str.getClass();
            this.text = str;
            this.textColor = color;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Text)) {
                return false;
            }
            Text text = (Text) obj;
            return Intrinsics.areEqual(this.text, text.text) && Intrinsics.areEqual(this.textColor, text.textColor);
        }

        public final int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            Color color = this.textColor;
            return hashCode + (color == null ? 0 : color.hashCode());
        }

        public final String toString() {
            return "Text(text=" + this.text + ", textColor=" + this.textColor + ")";
        }
    }
}
