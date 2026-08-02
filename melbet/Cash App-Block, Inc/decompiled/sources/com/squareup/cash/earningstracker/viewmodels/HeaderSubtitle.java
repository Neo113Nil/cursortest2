package com.squareup.cash.earningstracker.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface HeaderSubtitle {

    public final class TextSubtitle implements HeaderSubtitle {
        public final String text;

        public TextSubtitle(String str) {
            str.getClass();
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TextSubtitle) && Intrinsics.areEqual(this.text, ((TextSubtitle) obj).text);
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TextSubtitle(text=", this.text, ")");
        }
    }

    public final class TrendSubtitle implements HeaderSubtitle {
        public final String comparisonText;
        public final Trend trend;

        public TrendSubtitle(Trend trend, String str) {
            this.trend = trend;
            this.comparisonText = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrendSubtitle)) {
                return false;
            }
            TrendSubtitle trendSubtitle = (TrendSubtitle) obj;
            return this.trend == trendSubtitle.trend && this.comparisonText.equals(trendSubtitle.comparisonText);
        }

        public final int hashCode() {
            return this.comparisonText.hashCode() + (this.trend.hashCode() * 31);
        }

        public final String toString() {
            return "TrendSubtitle(trend=" + this.trend + ", comparisonText=" + this.comparisonText + ")";
        }
    }
}
