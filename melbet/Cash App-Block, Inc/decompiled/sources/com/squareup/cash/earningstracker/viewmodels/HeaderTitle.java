package com.squareup.cash.earningstracker.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface HeaderTitle {

    public final class EarningsCounterTitle implements HeaderTitle {
        public final boolean animate;
        public final String currencySymbol;
        public final Money earnings;

        public EarningsCounterTitle(Money money, String str, boolean z) {
            money.getClass();
            this.currencySymbol = str;
            this.earnings = money;
            this.animate = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EarningsCounterTitle)) {
                return false;
            }
            EarningsCounterTitle earningsCounterTitle = (EarningsCounterTitle) obj;
            return this.currencySymbol.equals(earningsCounterTitle.currencySymbol) && Intrinsics.areEqual(this.earnings, earningsCounterTitle.earnings) && this.animate == earningsCounterTitle.animate;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.animate) + NavAction$$ExternalSyntheticOutline0.m(this.earnings, this.currencySymbol.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EarningsCounterTitle(currencySymbol=");
            sb.append(this.currencySymbol);
            sb.append(", earnings=");
            sb.append(this.earnings);
            sb.append(", animate=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.animate, ")");
        }
    }

    public final class TextTitle implements HeaderTitle {
        public final String text;

        public TextTitle(String str) {
            str.getClass();
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TextTitle) && Intrinsics.areEqual(this.text, ((TextTitle) obj).text);
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TextTitle(text=", this.text, ")");
        }
    }
}
