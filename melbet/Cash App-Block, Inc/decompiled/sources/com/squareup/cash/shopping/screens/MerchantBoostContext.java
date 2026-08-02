package com.squareup.cash.shopping.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.shopping.screens.AutofillQuestion;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface MerchantBoostContext extends Parcelable {

    public final class MerchantProfileBoost implements MerchantBoostContext {
        public static final Parcelable.Creator<MerchantProfileBoost> CREATOR = new AutofillQuestion.Creator(11);
        public final String flowToken;

        public MerchantProfileBoost(String str) {
            this.flowToken = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MerchantProfileBoost) && Intrinsics.areEqual(this.flowToken, ((MerchantProfileBoost) obj).flowToken);
        }

        public final int hashCode() {
            String str = this.flowToken;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MerchantProfileBoost(flowToken=", this.flowToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.flowToken);
        }
    }

    public final class MerchantProfileDiscover implements MerchantBoostContext {
        public static final Parcelable.Creator<MerchantProfileDiscover> CREATOR = new AutofillQuestion.Creator(12);
        public final String flowToken;

        public MerchantProfileDiscover(String str) {
            this.flowToken = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MerchantProfileDiscover) && Intrinsics.areEqual(this.flowToken, ((MerchantProfileDiscover) obj).flowToken);
        }

        public final int hashCode() {
            String str = this.flowToken;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MerchantProfileDiscover(flowToken=", this.flowToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.flowToken);
        }
    }
}
