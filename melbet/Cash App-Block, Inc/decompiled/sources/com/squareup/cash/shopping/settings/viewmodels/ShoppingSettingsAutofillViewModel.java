package com.squareup.cash.shopping.settings.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ShoppingSettingsAutofillViewModel {
    public final AddressViewModel addressViewModel;
    public final boolean autofillEnabled;

    public interface AddressViewModel {

        public final class Error implements AddressViewModel {
            public static final Error INSTANCE = new Error();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Error);
            }

            public final int hashCode() {
                return 236921849;
            }

            public final String toString() {
                return "Error";
            }
        }

        public final class Incomplete implements AddressViewModel {
            public static final Incomplete INSTANCE = new Incomplete();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Incomplete);
            }

            public final int hashCode() {
                return -1216575987;
            }

            public final String toString() {
                return "Incomplete";
            }
        }

        public final class Loaded implements AddressViewModel {
            public final String address;
            public final String fullName;

            public Loaded(String str, String str2) {
                str.getClass();
                this.fullName = str;
                this.address = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Loaded)) {
                    return false;
                }
                Loaded loaded = (Loaded) obj;
                return Intrinsics.areEqual(this.fullName, loaded.fullName) && this.address.equals(loaded.address);
            }

            public final int hashCode() {
                return this.address.hashCode() + (this.fullName.hashCode() * 31);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("Loaded(fullName=", this.fullName, ", address=", this.address, ")");
            }
        }

        public final class Loading implements AddressViewModel {
            public static final Loading INSTANCE = new Loading();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return 1864268525;
            }

            public final String toString() {
                return "Loading";
            }
        }
    }

    public ShoppingSettingsAutofillViewModel(boolean z, AddressViewModel addressViewModel) {
        this.autofillEnabled = z;
        this.addressViewModel = addressViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingSettingsAutofillViewModel)) {
            return false;
        }
        ShoppingSettingsAutofillViewModel shoppingSettingsAutofillViewModel = (ShoppingSettingsAutofillViewModel) obj;
        return this.autofillEnabled == shoppingSettingsAutofillViewModel.autofillEnabled && this.addressViewModel.equals(shoppingSettingsAutofillViewModel.addressViewModel);
    }

    public final int hashCode() {
        return this.addressViewModel.hashCode() + (Boolean.hashCode(this.autofillEnabled) * 31);
    }

    public final String toString() {
        return "ShoppingSettingsAutofillViewModel(autofillEnabled=" + this.autofillEnabled + ", addressViewModel=" + this.addressViewModel + ")";
    }
}
