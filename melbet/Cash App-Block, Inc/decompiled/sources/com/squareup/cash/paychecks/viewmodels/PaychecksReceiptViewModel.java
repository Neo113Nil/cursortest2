package com.squareup.cash.paychecks.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PaychecksReceiptViewModel {
    public final String closeText;
    public final DistributionWheelViewModel distributionWheel;
    public final List lineItemSections;

    public final class Section {
        public final ArrayList rows;

        public final class Row {
            public final String accessibilityDestination;
            public final String amount;
            public final Color color;
            public final String destination;
            public final String note;
            public final Treatment treatment;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Treatment {
                public static final /* synthetic */ Treatment[] $VALUES;
                public static final Treatment ALLOCATION;
                public static final Treatment DEDUCTION;
                public static final Treatment FAILED_ALLOCATION;

                static {
                    Treatment treatment = new Treatment("ALLOCATION", 0);
                    ALLOCATION = treatment;
                    Treatment treatment2 = new Treatment("DEDUCTION", 1);
                    DEDUCTION = treatment2;
                    Treatment treatment3 = new Treatment("FAILED_ALLOCATION", 2);
                    FAILED_ALLOCATION = treatment3;
                    $VALUES = new Treatment[]{treatment, treatment2, treatment3};
                }

                public static Treatment valueOf(String str) {
                    return (Treatment) Enum.valueOf(Treatment.class, str);
                }

                public static Treatment[] values() {
                    return (Treatment[]) $VALUES.clone();
                }
            }

            public Row(Color color, String str, String str2, Treatment treatment, String str3, String str4) {
                color.getClass();
                str.getClass();
                str2.getClass();
                this.color = color;
                this.destination = str;
                this.amount = str2;
                this.treatment = treatment;
                this.note = str3;
                this.accessibilityDestination = str4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Row)) {
                    return false;
                }
                Row row = (Row) obj;
                return Intrinsics.areEqual(this.color, row.color) && Intrinsics.areEqual(this.destination, row.destination) && Intrinsics.areEqual(this.amount, row.amount) && this.treatment == row.treatment && Intrinsics.areEqual(this.note, row.note) && this.accessibilityDestination.equals(row.accessibilityDestination);
            }

            public final int hashCode() {
                int hashCode = (this.treatment.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.color.hashCode() * 31, 31, this.destination), 31, this.amount)) * 31;
                String str = this.note;
                return this.accessibilityDestination.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Row(color=");
                sb.append(this.color);
                sb.append(", destination=");
                sb.append(this.destination);
                sb.append(", amount=");
                sb.append(this.amount);
                sb.append(", treatment=");
                sb.append(this.treatment);
                sb.append(", note=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.note, ", accessibilityDestination=", this.accessibilityDestination, ")");
            }
        }

        public Section(ArrayList arrayList) {
            this.rows = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Section) && this.rows.equals(((Section) obj).rows);
        }

        public final int hashCode() {
            return this.rows.hashCode();
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("Section(rows=", ")", this.rows);
        }
    }

    public PaychecksReceiptViewModel(DistributionWheelViewModel distributionWheelViewModel, List list, String str) {
        list.getClass();
        str.getClass();
        this.distributionWheel = distributionWheelViewModel;
        this.lineItemSections = list;
        this.closeText = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaychecksReceiptViewModel)) {
            return false;
        }
        PaychecksReceiptViewModel paychecksReceiptViewModel = (PaychecksReceiptViewModel) obj;
        return this.distributionWheel.equals(paychecksReceiptViewModel.distributionWheel) && Intrinsics.areEqual(this.lineItemSections, paychecksReceiptViewModel.lineItemSections) && Intrinsics.areEqual(this.closeText, paychecksReceiptViewModel.closeText);
    }

    public final int hashCode() {
        return this.closeText.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.distributionWheel.hashCode() * 31, 31, this.lineItemSections);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaychecksReceiptViewModel(distributionWheel=");
        sb.append(this.distributionWheel);
        sb.append(", lineItemSections=");
        sb.append(this.lineItemSections);
        sb.append(", closeText=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.closeText, ")");
    }
}
