package com.squareup.cash.profile.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.profile.viewmodels.Alias;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public interface Accessory extends Parcelable {

    public final class AddButton implements Accessory {
        public static final AddButton INSTANCE = new AddButton();
        public static final Parcelable.Creator<AddButton> CREATOR = new Alias.Creator(15);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AddButton);
        }

        public final int hashCode() {
            return 282318287;
        }

        public final String toString() {
            return "AddButton";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Toggle implements Accessory {
        public static final Parcelable.Creator<Toggle> CREATOR = new Alias.Creator(16);
        public final boolean hasNoEnabledAlias;
        public final boolean isEnabled;
        public final boolean isRequired;
        public final boolean isToggledOn;

        public Toggle(boolean z, boolean z2, boolean z3, boolean z4) {
            this.isToggledOn = z;
            this.isEnabled = z2;
            this.isRequired = z3;
            this.hasNoEnabledAlias = z4;
        }

        public static Toggle copy$default(Toggle toggle, boolean z) {
            return new Toggle(z, toggle.isEnabled, toggle.isRequired, toggle.hasNoEnabledAlias);
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
            return this.isToggledOn == toggle.isToggledOn && this.isEnabled == toggle.isEnabled && this.isRequired == toggle.isRequired && this.hasNoEnabledAlias == toggle.hasNoEnabledAlias;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.hasNoEnabledAlias) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.isToggledOn) * 31, 31, this.isEnabled), 31, this.isRequired);
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m(NavAction$$ExternalSyntheticOutline0.m("Toggle(isToggledOn=", ", isEnabled=", ", isRequired=", this.isToggledOn, this.isEnabled), this.isRequired, ", hasNoEnabledAlias=", this.hasNoEnabledAlias, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.isToggledOn ? 1 : 0);
            parcel.writeInt(this.isEnabled ? 1 : 0);
            parcel.writeInt(this.isRequired ? 1 : 0);
            parcel.writeInt(this.hasNoEnabledAlias ? 1 : 0);
        }
    }
}
