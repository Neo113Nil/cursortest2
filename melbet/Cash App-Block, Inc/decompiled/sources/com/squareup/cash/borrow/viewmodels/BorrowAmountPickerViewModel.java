package com.squareup.cash.borrow.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BorrowAmountPickerViewModel {

    public final class Condensed implements BorrowAmountPickerViewModel {
        public final String buttonLabel;
        public final boolean isLoading;
        public final ArrayList quickAmountLabels;
        public final String subtitle;
        public final String title;

        public Condensed(String str, String str2, String str3, boolean z, ArrayList arrayList) {
            str.getClass();
            str3.getClass();
            this.title = str;
            this.subtitle = str2;
            this.buttonLabel = str3;
            this.isLoading = z;
            this.quickAmountLabels = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Condensed)) {
                return false;
            }
            Condensed condensed = (Condensed) obj;
            return Intrinsics.areEqual(this.title, condensed.title) && Intrinsics.areEqual(this.subtitle, condensed.subtitle) && Intrinsics.areEqual(this.buttonLabel, condensed.buttonLabel) && this.isLoading == condensed.isLoading && this.quickAmountLabels.equals(condensed.quickAmountLabels);
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            return this.quickAmountLabels.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.buttonLabel), 31, this.isLoading);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Condensed(title=", this.title, ", subtitle=", this.subtitle, ", buttonLabel=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.buttonLabel, ", isLoading=", this.isLoading, ", quickAmountLabels=");
            return Recorder$$ExternalSyntheticOutline1.m(")", m, this.quickAmountLabels);
        }
    }

    public final class Full implements BorrowAmountPickerViewModel {
        public final String buttonLabel;
        public final boolean isLoading;
        public final Money maxAmount;
        public final Money minAmount;
        public final String subtitle;
        public final String title;

        public Full(Money money, Money money2, String str, String str2, String str3, boolean z) {
            str.getClass();
            str3.getClass();
            this.title = str;
            this.subtitle = str2;
            this.buttonLabel = str3;
            this.isLoading = z;
            this.minAmount = money;
            this.maxAmount = money2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Full)) {
                return false;
            }
            Full full = (Full) obj;
            return Intrinsics.areEqual(this.title, full.title) && Intrinsics.areEqual(this.subtitle, full.subtitle) && Intrinsics.areEqual(this.buttonLabel, full.buttonLabel) && this.isLoading == full.isLoading && Intrinsics.areEqual(this.minAmount, full.minAmount) && Intrinsics.areEqual(this.maxAmount, full.maxAmount);
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.buttonLabel), 31, this.isLoading);
            Money money = this.minAmount;
            int hashCode2 = (m + (money == null ? 0 : money.hashCode())) * 31;
            Money money2 = this.maxAmount;
            return hashCode2 + (money2 != null ? money2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Full(title=", this.title, ", subtitle=", this.subtitle, ", buttonLabel=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.buttonLabel, ", isLoading=", this.isLoading, ", minAmount=");
            m.append(this.minAmount);
            m.append(", maxAmount=");
            m.append(this.maxAmount);
            m.append(")");
            return m.toString();
        }
    }
}
