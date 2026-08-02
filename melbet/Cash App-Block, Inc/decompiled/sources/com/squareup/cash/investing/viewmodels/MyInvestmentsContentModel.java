package com.squareup.cash.investing.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class MyInvestmentsContentModel {

    public final class KnownNetProfit extends MyInvestmentsContentModel {
        public final boolean hasHoldings;
        public final String investedText;
        public final List investmentStats;
        public final boolean isStale;
        public final String netProfitText;
        public final String title;

        public KnownNetProfit(String str, boolean z, List list, String str2, String str3, boolean z2) {
            str.getClass();
            list.getClass();
            str2.getClass();
            str3.getClass();
            this.investedText = str;
            this.isStale = z;
            this.investmentStats = list;
            this.netProfitText = str2;
            this.title = str3;
            this.hasHoldings = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KnownNetProfit)) {
                return false;
            }
            KnownNetProfit knownNetProfit = (KnownNetProfit) obj;
            return Intrinsics.areEqual(this.investedText, knownNetProfit.investedText) && this.isStale == knownNetProfit.isStale && Intrinsics.areEqual(this.investmentStats, knownNetProfit.investmentStats) && Intrinsics.areEqual(this.netProfitText, knownNetProfit.netProfitText) && Intrinsics.areEqual(this.title, knownNetProfit.title) && this.hasHoldings == knownNetProfit.hasHoldings;
        }

        @Override // com.squareup.cash.investing.viewmodels.MyInvestmentsContentModel
        public final boolean getHasHoldings() {
            return this.hasHoldings;
        }

        @Override // com.squareup.cash.investing.viewmodels.MyInvestmentsContentModel
        public final String getInvestedText() {
            return this.investedText;
        }

        @Override // com.squareup.cash.investing.viewmodels.MyInvestmentsContentModel
        public final List getInvestmentStats() {
            return this.investmentStats;
        }

        @Override // com.squareup.cash.investing.viewmodels.MyInvestmentsContentModel
        public final boolean getShowHeaderAction() {
            return true;
        }

        @Override // com.squareup.cash.investing.viewmodels.MyInvestmentsContentModel
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.hasHoldings) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.investedText.hashCode() * 31, 31, this.isStale), 31, this.investmentStats), 31, this.netProfitText), 31, this.title);
        }

        @Override // com.squareup.cash.investing.viewmodels.MyInvestmentsContentModel
        public final boolean isStale() {
            return this.isStale;
        }

        public final String toString() {
            StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("KnownNetProfit(investedText=", this.investedText, ", isStale=", ", investmentStats=", this.isStale);
            Recorder$$ExternalSyntheticOutline2.m(", netProfitText=", this.netProfitText, ", title=", m1540m, this.investmentStats);
            return re$$ExternalSyntheticOutline0.m(m1540m, this.title, ", hasHoldings=", this.hasHoldings, ")");
        }
    }

    public final class StatRow {
        public final String label;
        public final String value;
        public final StatValueIconKind valueIcon;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class StatValueIconKind {
            public static final /* synthetic */ StatValueIconKind[] $VALUES;
            public static final StatValueIconKind ArrowDown;
            public static final StatValueIconKind ArrowUp;

            static {
                StatValueIconKind statValueIconKind = new StatValueIconKind("ArrowUp", 0);
                ArrowUp = statValueIconKind;
                StatValueIconKind statValueIconKind2 = new StatValueIconKind("ArrowDown", 1);
                ArrowDown = statValueIconKind2;
                $VALUES = new StatValueIconKind[]{statValueIconKind, statValueIconKind2};
            }

            public static StatValueIconKind valueOf(String str) {
                return (StatValueIconKind) Enum.valueOf(StatValueIconKind.class, str);
            }

            public static StatValueIconKind[] values() {
                return (StatValueIconKind[]) $VALUES.clone();
            }
        }

        public StatRow(String str, String str2, StatValueIconKind statValueIconKind) {
            str.getClass();
            str2.getClass();
            this.label = str;
            this.value = str2;
            this.valueIcon = statValueIconKind;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StatRow)) {
                return false;
            }
            StatRow statRow = (StatRow) obj;
            return Intrinsics.areEqual(this.label, statRow.label) && Intrinsics.areEqual(this.value, statRow.value) && this.valueIcon == statRow.valueIcon;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.label.hashCode() * 31, 31, this.value);
            StatValueIconKind statValueIconKind = this.valueIcon;
            return m + (statValueIconKind == null ? 0 : statValueIconKind.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StatRow(label=", this.label, ", value=", this.value, ", valueIcon=");
            m.append(this.valueIcon);
            m.append(")");
            return m.toString();
        }
    }

    public abstract boolean getHasHoldings();

    public abstract String getInvestedText();

    public abstract List getInvestmentStats();

    public abstract boolean getShowHeaderAction();

    public abstract String getTitle();

    public abstract boolean isStale();

    public final class UnknownNetProfit extends MyInvestmentsContentModel {
        public final boolean hasHoldings;
        public final String investedText;
        public final List investmentStats;
        public final boolean isStale;
        public final boolean showHeaderAction;
        public final String title;

        public UnknownNetProfit(String str, boolean z, List list, boolean z2, String str2, boolean z3) {
            str.getClass();
            list.getClass();
            str2.getClass();
            this.investedText = str;
            this.isStale = z;
            this.investmentStats = list;
            this.showHeaderAction = z2;
            this.title = str2;
            this.hasHoldings = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnknownNetProfit)) {
                return false;
            }
            UnknownNetProfit unknownNetProfit = (UnknownNetProfit) obj;
            return Intrinsics.areEqual(this.investedText, unknownNetProfit.investedText) && this.isStale == unknownNetProfit.isStale && Intrinsics.areEqual(this.investmentStats, unknownNetProfit.investmentStats) && this.showHeaderAction == unknownNetProfit.showHeaderAction && Intrinsics.areEqual(this.title, unknownNetProfit.title) && this.hasHoldings == unknownNetProfit.hasHoldings;
        }

        @Override // com.squareup.cash.investing.viewmodels.MyInvestmentsContentModel
        public final boolean getHasHoldings() {
            return this.hasHoldings;
        }

        @Override // com.squareup.cash.investing.viewmodels.MyInvestmentsContentModel
        public final String getInvestedText() {
            return this.investedText;
        }

        @Override // com.squareup.cash.investing.viewmodels.MyInvestmentsContentModel
        public final List getInvestmentStats() {
            return this.investmentStats;
        }

        @Override // com.squareup.cash.investing.viewmodels.MyInvestmentsContentModel
        public final boolean getShowHeaderAction() {
            return this.showHeaderAction;
        }

        @Override // com.squareup.cash.investing.viewmodels.MyInvestmentsContentModel
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.hasHoldings) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.investedText.hashCode() * 31, 31, this.isStale), 31, this.investmentStats), 31, this.showHeaderAction), 31, this.title);
        }

        @Override // com.squareup.cash.investing.viewmodels.MyInvestmentsContentModel
        public final boolean isStale() {
            return this.isStale;
        }

        public final String toString() {
            StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("UnknownNetProfit(investedText=", this.investedText, ", isStale=", ", investmentStats=", this.isStale);
            m1540m.append(this.investmentStats);
            m1540m.append(", showHeaderAction=");
            m1540m.append(this.showHeaderAction);
            m1540m.append(", title=");
            return re$$ExternalSyntheticOutline0.m(m1540m, this.title, ", hasHoldings=", this.hasHoldings, ")");
        }

        public UnknownNetProfit(String str, String str2, boolean z, boolean z2) {
            this(str, z, EmptyList.INSTANCE, true, str2, z2);
        }
    }
}
