package com.squareup.cash.screens.blockers;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.screens.BoostDetailsScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class AmountSheetSavedState implements Parcelable {

    /* loaded from: classes6.dex */
    public final class AmountKeypadState extends AmountSheetSavedState {
        public static final Parcelable.Creator<AmountKeypadState> CREATOR = new BoostDetailsScreen.Creator(11);
        public final String rawAmount;

        public AmountKeypadState(String str) {
            str.getClass();
            this.rawAmount = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AmountKeypadState) && Intrinsics.areEqual(this.rawAmount, ((AmountKeypadState) obj).rawAmount);
        }

        public final int hashCode() {
            return this.rawAmount.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AmountKeypadState(rawAmount=", this.rawAmount, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.rawAmount);
        }
    }

    /* loaded from: classes6.dex */
    public final class AmountSelectorState extends AmountSheetSavedState {
        public static final Parcelable.Creator<AmountSelectorState> CREATOR = new BoostDetailsScreen.Creator(12);
        public final Long selectedAmountUsd;

        public AmountSelectorState(Long l) {
            this.selectedAmountUsd = l;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AmountSelectorState) && Intrinsics.areEqual(this.selectedAmountUsd, ((AmountSelectorState) obj).selectedAmountUsd);
        }

        public final int hashCode() {
            Long l = this.selectedAmountUsd;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        public final String toString() {
            return "AmountSelectorState(selectedAmountUsd=" + this.selectedAmountUsd + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Long l = this.selectedAmountUsd;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l);
            }
        }
    }
}
