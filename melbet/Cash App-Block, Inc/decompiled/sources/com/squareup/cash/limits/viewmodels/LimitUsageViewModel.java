package com.squareup.cash.limits.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class LimitUsageViewModel {
    public final double consumedProportion;
    public final String limitThresholdTypeText;
    public final LimitValue limitValue;

    public interface LimitValue {

        public final class CountLimitValue implements LimitValue {
            public final long countRemaining;
            public final long countUsed;
            public final long limitThreshold;

            public CountLimitValue(long j, long j2, long j3) {
                this.countUsed = j;
                this.countRemaining = j2;
                this.limitThreshold = j3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CountLimitValue)) {
                    return false;
                }
                CountLimitValue countLimitValue = (CountLimitValue) obj;
                return this.countUsed == countLimitValue.countUsed && this.countRemaining == countLimitValue.countRemaining && this.limitThreshold == countLimitValue.limitThreshold;
            }

            public final int hashCode() {
                return Long.hashCode(this.limitThreshold) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.countUsed) * 31, 31, this.countRemaining);
            }

            public final String toString() {
                StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(this.countUsed, "CountLimitValue(countUsed=", ", countRemaining=");
                m1149m.append(this.countRemaining);
                return Boxes$$ExternalSyntheticOutline1.m(this.limitThreshold, ", limitThreshold=", ")", m1149m);
            }
        }

        public final class MoneyLimitValue implements LimitValue {
            public final String amountRemainingFormatted;
            public final String amountUsedFormatted;
            public final String limitThresholdFormatted;

            public MoneyLimitValue(String str, String str2, String str3) {
                this.amountUsedFormatted = str;
                this.amountRemainingFormatted = str2;
                this.limitThresholdFormatted = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MoneyLimitValue)) {
                    return false;
                }
                MoneyLimitValue moneyLimitValue = (MoneyLimitValue) obj;
                return this.amountUsedFormatted.equals(moneyLimitValue.amountUsedFormatted) && this.amountRemainingFormatted.equals(moneyLimitValue.amountRemainingFormatted) && this.limitThresholdFormatted.equals(moneyLimitValue.limitThresholdFormatted);
            }

            public final int hashCode() {
                return this.limitThresholdFormatted.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.amountUsedFormatted.hashCode() * 31, 31, this.amountRemainingFormatted);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MoneyLimitValue(amountUsedFormatted=", this.amountUsedFormatted, ", amountRemainingFormatted=", this.amountRemainingFormatted, ", limitThresholdFormatted="), this.limitThresholdFormatted, ")");
            }
        }
    }

    public LimitUsageViewModel(double d, String str, LimitValue limitValue) {
        this.consumedProportion = d;
        this.limitThresholdTypeText = str;
        this.limitValue = limitValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitUsageViewModel)) {
            return false;
        }
        LimitUsageViewModel limitUsageViewModel = (LimitUsageViewModel) obj;
        return Double.compare(this.consumedProportion, limitUsageViewModel.consumedProportion) == 0 && this.limitThresholdTypeText.equals(limitUsageViewModel.limitThresholdTypeText) && this.limitValue.equals(limitUsageViewModel.limitValue);
    }

    public final int hashCode() {
        return this.limitValue.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Double.hashCode(this.consumedProportion) * 31, 961, this.limitThresholdTypeText);
    }

    public final String toString() {
        return "LimitUsageViewModel(consumedProportion=" + this.consumedProportion + ", limitThresholdTypeText=" + this.limitThresholdTypeText + ", headerText=null, limitValue=" + this.limitValue + ")";
    }
}
