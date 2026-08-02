package com.squareup.cash.limits.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class ProgressViewModel {

    public final class CountProgress extends ProgressViewModel {
        public final ColorModel color;
        public final double consumedProportion;
        public final String countRemaining;
        public final String countUsed;
        public final String header;
        public final String limitThresholdCount;
        public final String limitThresholdText;

        public CountProgress(String str, String str2, String str3, String str4, String str5, double d, ColorModel colorModel) {
            Request$Priority$EnumUnboxingLocalUtility.m(str2, str3, str4, str5);
            this.header = str;
            this.countUsed = str2;
            this.countRemaining = str3;
            this.limitThresholdCount = str4;
            this.limitThresholdText = str5;
            this.consumedProportion = d;
            this.color = colorModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CountProgress)) {
                return false;
            }
            CountProgress countProgress = (CountProgress) obj;
            return Intrinsics.areEqual(this.header, countProgress.header) && Intrinsics.areEqual(this.countUsed, countProgress.countUsed) && Intrinsics.areEqual(this.countRemaining, countProgress.countRemaining) && Intrinsics.areEqual(this.limitThresholdCount, countProgress.limitThresholdCount) && Intrinsics.areEqual(this.limitThresholdText, countProgress.limitThresholdText) && Double.compare(this.consumedProportion, countProgress.consumedProportion) == 0 && this.color.equals(countProgress.color);
        }

        public final int hashCode() {
            String str = this.header;
            return this.color.hashCode() + Fragment$5$$ExternalSyntheticOutline0.m(this.consumedProportion, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.countUsed), 31, this.countRemaining), 31, this.limitThresholdCount), 31, this.limitThresholdText), 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CountProgress(header=", this.header, ", countUsed=", this.countUsed, ", countRemaining=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.countRemaining, ", limitThresholdCount=", this.limitThresholdCount, ", limitThresholdText=");
            m.append(this.limitThresholdText);
            m.append(", consumedProportion=");
            m.append(this.consumedProportion);
            m.append(", color=");
            m.append(this.color);
            m.append(")");
            return m.toString();
        }
    }

    public final class MoneyProgress extends ProgressViewModel {
        public final String amountRemaining;
        public final String amountUsed;
        public final ColorModel color;
        public final double consumedProportion;
        public final String header;
        public final String limitThresholdAmount;
        public final String limitThresholdText;

        public MoneyProgress(String str, String str2, String str3, String str4, String str5, double d, ColorModel colorModel) {
            str5.getClass();
            this.header = str;
            this.amountUsed = str2;
            this.amountRemaining = str3;
            this.limitThresholdAmount = str4;
            this.limitThresholdText = str5;
            this.consumedProportion = d;
            this.color = colorModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MoneyProgress)) {
                return false;
            }
            MoneyProgress moneyProgress = (MoneyProgress) obj;
            return Intrinsics.areEqual(this.header, moneyProgress.header) && this.amountUsed.equals(moneyProgress.amountUsed) && this.amountRemaining.equals(moneyProgress.amountRemaining) && this.limitThresholdAmount.equals(moneyProgress.limitThresholdAmount) && Intrinsics.areEqual(this.limitThresholdText, moneyProgress.limitThresholdText) && Double.compare(this.consumedProportion, moneyProgress.consumedProportion) == 0 && this.color.equals(moneyProgress.color);
        }

        public final int hashCode() {
            String str = this.header;
            return this.color.hashCode() + Fragment$5$$ExternalSyntheticOutline0.m(this.consumedProportion, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.amountUsed), 31, this.amountRemaining), 31, this.limitThresholdAmount), 31, this.limitThresholdText), 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MoneyProgress(header=", this.header, ", amountUsed=", this.amountUsed, ", amountRemaining=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.amountRemaining, ", limitThresholdAmount=", this.limitThresholdAmount, ", limitThresholdText=");
            m.append(this.limitThresholdText);
            m.append(", consumedProportion=");
            m.append(this.consumedProportion);
            m.append(", color=");
            m.append(this.color);
            m.append(")");
            return m.toString();
        }
    }

    public final class SimpleProgress extends ProgressViewModel {
        public final ColorModel color;
        public final String primaryText;
        public final Double progress;
        public final String secondaryText;

        /* renamed from: type, reason: collision with root package name */
        public final GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar.Type f1170type;

        public SimpleProgress(String str, String str2, Double d, GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar.Type type2, ColorModel colorModel) {
            str.getClass();
            this.primaryText = str;
            this.secondaryText = str2;
            this.progress = d;
            this.f1170type = type2;
            this.color = colorModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SimpleProgress)) {
                return false;
            }
            SimpleProgress simpleProgress = (SimpleProgress) obj;
            return Intrinsics.areEqual(this.primaryText, simpleProgress.primaryText) && Intrinsics.areEqual(this.secondaryText, simpleProgress.secondaryText) && Intrinsics.areEqual((Object) this.progress, (Object) simpleProgress.progress) && this.f1170type == simpleProgress.f1170type && this.color.equals(simpleProgress.color);
        }

        public final int hashCode() {
            int hashCode = this.primaryText.hashCode() * 31;
            String str = this.secondaryText;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Double d = this.progress;
            int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
            GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar.Type type2 = this.f1170type;
            return this.color.hashCode() + ((hashCode3 + (type2 != null ? type2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SimpleProgress(primaryText=", this.primaryText, ", secondaryText=", this.secondaryText, ", progress=");
            m.append(this.progress);
            m.append(", type=");
            m.append(this.f1170type);
            m.append(", color=");
            return SVG$Unit$EnumUnboxingLocalUtility.m(m, this.color, ")");
        }
    }
}
