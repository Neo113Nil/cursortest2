package com.squareup.cash.family.familyhub.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.RestoringScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.earnings.screens.AddPayerCustomersScreen;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface DependentControlScreen extends Screen {

    /* loaded from: classes6.dex */
    public final class ApprovedContactsControl implements DependentControlScreen {
        public static final Parcelable.Creator<ApprovedContactsControl> CREATOR = new AddPayerCustomersScreen.Creator(28);
        public final ControlType controlType;
        public final String dependentCustomerToken;

        public ApprovedContactsControl(ControlType controlType, String str) {
            str.getClass();
            controlType.getClass();
            this.dependentCustomerToken = str;
            this.controlType = controlType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApprovedContactsControl)) {
                return false;
            }
            ApprovedContactsControl approvedContactsControl = (ApprovedContactsControl) obj;
            return Intrinsics.areEqual(this.dependentCustomerToken, approvedContactsControl.dependentCustomerToken) && this.controlType == approvedContactsControl.controlType;
        }

        @Override // com.squareup.cash.family.familyhub.screens.DependentControlScreen
        public final ControlType getControlType() {
            return this.controlType;
        }

        @Override // com.squareup.cash.family.familyhub.screens.DependentControlScreen
        public final String getDependentCustomerToken() {
            return this.dependentCustomerToken;
        }

        public final int hashCode() {
            return this.controlType.hashCode() + (this.dependentCustomerToken.hashCode() * 31);
        }

        public final String toString() {
            return "ApprovedContactsControl(dependentCustomerToken=" + this.dependentCustomerToken + ", controlType=" + this.controlType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.dependentCustomerToken);
            parcel.writeString(this.controlType.name());
        }
    }

    /* loaded from: classes6.dex */
    public final class ManagedAccount implements DependentControlScreen {
        public static final Parcelable.Creator<ManagedAccount> CREATOR = new AddPayerCustomersScreen.Creator(29);
        public final ControlType controlType;
        public final String dependentCustomerToken;

        public ManagedAccount(ControlType controlType, String str) {
            str.getClass();
            controlType.getClass();
            this.dependentCustomerToken = str;
            this.controlType = controlType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ManagedAccount)) {
                return false;
            }
            ManagedAccount managedAccount = (ManagedAccount) obj;
            return Intrinsics.areEqual(this.dependentCustomerToken, managedAccount.dependentCustomerToken) && this.controlType == managedAccount.controlType;
        }

        @Override // com.squareup.cash.family.familyhub.screens.DependentControlScreen
        public final ControlType getControlType() {
            return this.controlType;
        }

        @Override // com.squareup.cash.family.familyhub.screens.DependentControlScreen
        public final String getDependentCustomerToken() {
            return this.dependentCustomerToken;
        }

        public final int hashCode() {
            return this.controlType.hashCode() + (this.dependentCustomerToken.hashCode() * 31);
        }

        public final String toString() {
            return "ManagedAccount(dependentCustomerToken=" + this.dependentCustomerToken + ", controlType=" + this.controlType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.dependentCustomerToken);
            parcel.writeString(this.controlType.name());
        }
    }

    /* loaded from: classes6.dex */
    public final class Toggle implements DependentControlScreen, RestoringScreen {
        public static final Parcelable.Creator<Toggle> CREATOR = new FamilyHome.Creator(1);
        public final ControlType controlType;
        public final String dependentCustomerToken;

        public Toggle(ControlType controlType, String str) {
            str.getClass();
            controlType.getClass();
            this.dependentCustomerToken = str;
            this.controlType = controlType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Toggle)) {
                return false;
            }
            Toggle toggle = (Toggle) obj;
            return Intrinsics.areEqual(this.dependentCustomerToken, toggle.dependentCustomerToken) && this.controlType == toggle.controlType;
        }

        @Override // com.squareup.cash.family.familyhub.screens.DependentControlScreen
        public final ControlType getControlType() {
            return this.controlType;
        }

        @Override // com.squareup.cash.family.familyhub.screens.DependentControlScreen
        public final String getDependentCustomerToken() {
            return this.dependentCustomerToken;
        }

        public final int hashCode() {
            return this.controlType.hashCode() + (this.dependentCustomerToken.hashCode() * 31);
        }

        public final String toString() {
            return "Toggle(dependentCustomerToken=" + this.dependentCustomerToken + ", controlType=" + this.controlType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.dependentCustomerToken);
            parcel.writeString(this.controlType.name());
        }
    }

    ControlType getControlType();

    String getDependentCustomerToken();
}
