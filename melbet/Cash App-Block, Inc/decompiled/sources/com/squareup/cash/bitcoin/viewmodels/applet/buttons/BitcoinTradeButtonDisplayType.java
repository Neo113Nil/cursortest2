package com.squareup.cash.bitcoin.viewmodels.applet.buttons;

import com.squareup.cash.R;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BitcoinTradeButtonDisplayType {

    public final class Drawable implements BitcoinTradeButtonDisplayType {
        public final String contentDescription;

        public Drawable(String str) {
            this.contentDescription = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Drawable) && Intrinsics.areEqual(this.contentDescription, ((Drawable) obj).contentDescription);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(R.drawable.mooncake_send) * 31;
            String str = this.contentDescription;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "Drawable(drawable=" + R.drawable.mooncake_send + ", contentDescription=" + this.contentDescription + ")";
        }
    }

    public final class Text implements BitcoinTradeButtonDisplayType {
        public final String displayText;

        public Text(String str) {
            str.getClass();
            this.displayText = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Text) && Intrinsics.areEqual(this.displayText, ((Text) obj).displayText);
        }

        public final int hashCode() {
            return this.displayText.hashCode() * 31;
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Text(displayText=", this.displayText, ", contentDescription=null)");
        }
    }
}
