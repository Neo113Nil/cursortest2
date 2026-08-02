package com.squareup.cash.bitcoin.viewmodels.applet.performance;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BitcoinPerformanceSummaryViewModel extends BitcoinHomeWidgetViewModel {

    public final class Loaded implements BitcoinPerformanceSummaryViewModel {
        public final boolean isStale;
        public final String performanceAmount;
        public final String performancePercent;
        public final String sectionBody;

        public Loaded(String str, String str2, String str3, boolean z) {
            str.getClass();
            this.performanceAmount = str;
            this.performancePercent = str2;
            this.sectionBody = str3;
            this.isStale = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.performanceAmount, loaded.performanceAmount) && this.performancePercent.equals(loaded.performancePercent) && Intrinsics.areEqual(this.sectionBody, loaded.sectionBody) && this.isStale == loaded.isStale;
        }

        @Override // com.squareup.cash.bitcoin.viewmodels.applet.performance.BitcoinPerformanceSummaryViewModel
        public final String getSectionBody() {
            return this.sectionBody;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.performanceAmount.hashCode() * 31, 31, this.performancePercent);
            String str = this.sectionBody;
            return Boolean.hashCode(this.isStale) + ((m + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return re$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loaded(performanceAmount=", this.performanceAmount, ", performancePercent=", this.performancePercent, ", sectionBody="), this.sectionBody, ", isStale=", this.isStale, ")");
        }
    }

    public final class Loading implements BitcoinPerformanceSummaryViewModel {
        public final String sectionBody;

        public Loading(String str) {
            this.sectionBody = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && Intrinsics.areEqual(this.sectionBody, ((Loading) obj).sectionBody);
        }

        @Override // com.squareup.cash.bitcoin.viewmodels.applet.performance.BitcoinPerformanceSummaryViewModel
        public final String getSectionBody() {
            return this.sectionBody;
        }

        public final int hashCode() {
            String str = this.sectionBody;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loading(sectionBody=", this.sectionBody, ")");
        }
    }

    String getSectionBody();
}
