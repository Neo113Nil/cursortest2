package com.squareup.cash.blockers.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.common.location.GlobalAddress;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SetAddressViewModel {
    public final ColorModel accentColor;
    public final GlobalAddress address;
    public final boolean autofill;
    public final Country country;
    public final String hint;
    public final boolean isLoading;
    public final Mode mode;
    public final boolean showCloseButton;
    public final boolean showHelp;
    public final String stateHint;
    public final String subtitle;
    public final String title;
    public final String zipHint;

    /* loaded from: classes6.dex */
    public interface Mode {

        /* loaded from: classes7.dex */
        public final class FullAddress implements Mode {
            public final boolean autofill;

            public FullAddress(boolean z) {
                this.autofill = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FullAddress) && this.autofill == ((FullAddress) obj).autofill;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.autofill);
            }

            public final String toString() {
                return Fragment$5$$ExternalSyntheticOutline0.m("FullAddress(autofill=", ")", this.autofill);
            }
        }

        /* loaded from: classes7.dex */
        public final class Postal implements Mode {
            public static final Postal INSTANCE = new Postal();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Postal);
            }

            public final int hashCode() {
                return 701780190;
            }

            public final String toString() {
                return "Postal";
            }
        }

        /* loaded from: classes7.dex */
        public final class StreetAndPostal implements Mode {
            public static final StreetAndPostal INSTANCE = new StreetAndPostal();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof StreetAndPostal);
            }

            public final int hashCode() {
                return -76146164;
            }

            public final String toString() {
                return "StreetAndPostal";
            }
        }
    }

    public SetAddressViewModel(String str, String str2, String str3, Mode mode, String str4, String str5, GlobalAddress globalAddress, Country country, boolean z, boolean z2, ColorModel colorModel, boolean z3, boolean z4) {
        re$$ExternalSyntheticOutline0.m1432m(str, str3, str5);
        this.title = str;
        this.subtitle = str2;
        this.hint = str3;
        this.mode = mode;
        this.stateHint = str4;
        this.zipHint = str5;
        this.address = globalAddress;
        this.country = country;
        this.showHelp = z;
        this.isLoading = z2;
        this.accentColor = colorModel;
        this.showCloseButton = z3;
        this.autofill = z4;
    }

    public static SetAddressViewModel copy$default(SetAddressViewModel setAddressViewModel, boolean z) {
        String str = setAddressViewModel.title;
        String str2 = setAddressViewModel.subtitle;
        String str3 = setAddressViewModel.hint;
        Mode mode = setAddressViewModel.mode;
        String str4 = setAddressViewModel.stateHint;
        String str5 = setAddressViewModel.zipHint;
        GlobalAddress globalAddress = setAddressViewModel.address;
        Country country = setAddressViewModel.country;
        boolean z2 = setAddressViewModel.showHelp;
        ColorModel colorModel = setAddressViewModel.accentColor;
        boolean z3 = setAddressViewModel.showCloseButton;
        boolean z4 = setAddressViewModel.autofill;
        setAddressViewModel.getClass();
        str.getClass();
        str3.getClass();
        str5.getClass();
        return new SetAddressViewModel(str, str2, str3, mode, str4, str5, globalAddress, country, z2, z, colorModel, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetAddressViewModel)) {
            return false;
        }
        SetAddressViewModel setAddressViewModel = (SetAddressViewModel) obj;
        return Intrinsics.areEqual(this.title, setAddressViewModel.title) && Intrinsics.areEqual(this.subtitle, setAddressViewModel.subtitle) && Intrinsics.areEqual(this.hint, setAddressViewModel.hint) && this.mode.equals(setAddressViewModel.mode) && Intrinsics.areEqual(this.stateHint, setAddressViewModel.stateHint) && Intrinsics.areEqual(this.zipHint, setAddressViewModel.zipHint) && Intrinsics.areEqual(this.address, setAddressViewModel.address) && this.country == setAddressViewModel.country && this.showHelp == setAddressViewModel.showHelp && this.isLoading == setAddressViewModel.isLoading && Intrinsics.areEqual(this.accentColor, setAddressViewModel.accentColor) && this.showCloseButton == setAddressViewModel.showCloseButton && this.autofill == setAddressViewModel.autofill;
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (this.mode.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.hint)) * 31;
        String str2 = this.stateHint;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.zipHint);
        GlobalAddress globalAddress = this.address;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.country.hashCode() + ((m + (globalAddress == null ? 0 : globalAddress.hashCode())) * 31)) * 31, 31, this.showHelp), 31, this.isLoading);
        ColorModel colorModel = this.accentColor;
        return Boolean.hashCode(this.autofill) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m2 + (colorModel != null ? colorModel.hashCode() : 0)) * 31, 31, this.showCloseButton);
    }

    public final String toString() {
        return "SetAddressViewModel";
    }
}
