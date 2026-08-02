package com.squareup.address.typeahead.views;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface AddressModel {

    public final class Condensed implements AddressModel {
        public final List results;
        public final String searchInput;

        public Condensed(String str, List list) {
            str.getClass();
            this.searchInput = str;
            this.results = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Condensed)) {
                return false;
            }
            Condensed condensed = (Condensed) obj;
            return Intrinsics.areEqual(this.searchInput, condensed.searchInput) && Intrinsics.areEqual(this.results, condensed.results);
        }

        public final int hashCode() {
            int hashCode = this.searchInput.hashCode() * 31;
            List list = this.results;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Condensed(searchInput=", this.searchInput, ", results=", ")", this.results);
        }
    }

    public final class Expanded implements AddressModel {
        public final Field addressLine1;
        public final Field addressLine2;
        public final Field city;
        public final Field country;
        public final Field postalCode;
        public final boolean postalCodeBeforeState;
        public final List results;
        public final Field state;

        public interface Field {

            public final class Hidden implements Field {
                public static final Hidden INSTANCE = new Hidden();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof Hidden);
                }

                public final int hashCode() {
                    return -1826739420;
                }

                public final String toString() {
                    return "Hidden";
                }
            }

            public final class Shown implements Field {
                public final String hint;
                public final String input;
                public final String label;

                public Shown(String str, String str2, String str3, int i) {
                    str2 = (i & 2) != 0 ? null : str2;
                    str3 = (i & 4) != 0 ? null : str3;
                    str.getClass();
                    this.input = str;
                    this.label = str2;
                    this.hint = str3;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Shown)) {
                        return false;
                    }
                    Shown shown = (Shown) obj;
                    return Intrinsics.areEqual(this.input, shown.input) && Intrinsics.areEqual(this.label, shown.label) && Intrinsics.areEqual(this.hint, shown.hint);
                }

                public final int hashCode() {
                    int hashCode = this.input.hashCode() * 31;
                    String str = this.label;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.hint;
                    return hashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Shown(input=", this.input, ", label=", this.label, ", hint="), this.hint, ")");
                }
            }
        }

        public Expanded(boolean z, Field field, Field field2, Field field3, Field field4, Field field5, Field field6, List list) {
            this.postalCodeBeforeState = z;
            this.addressLine1 = field;
            this.addressLine2 = field2;
            this.city = field3;
            this.state = field4;
            this.postalCode = field5;
            this.country = field6;
            this.results = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Expanded)) {
                return false;
            }
            Expanded expanded = (Expanded) obj;
            return this.postalCodeBeforeState == expanded.postalCodeBeforeState && this.addressLine1.equals(expanded.addressLine1) && this.addressLine2.equals(expanded.addressLine2) && this.city.equals(expanded.city) && this.state.equals(expanded.state) && this.postalCode.equals(expanded.postalCode) && this.country.equals(expanded.country) && Intrinsics.areEqual(this.results, expanded.results);
        }

        public final int hashCode() {
            int hashCode = (this.country.hashCode() + ((this.postalCode.hashCode() + ((this.state.hashCode() + ((this.city.hashCode() + ((this.addressLine2.hashCode() + ((this.addressLine1.hashCode() + (Boolean.hashCode(this.postalCodeBeforeState) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            List list = this.results;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            return "Expanded(postalCodeBeforeState=" + this.postalCodeBeforeState + ", addressLine1=" + this.addressLine1 + ", addressLine2=" + this.addressLine2 + ", city=" + this.city + ", state=" + this.state + ", postalCode=" + this.postalCode + ", country=" + this.country + ", results=" + this.results + ")";
        }
    }

    public final class Initializing implements AddressModel {
        public static final Initializing INSTANCE = new Initializing();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Initializing);
        }

        public final int hashCode() {
            return 1921877628;
        }

        public final String toString() {
            return "Initializing";
        }
    }
}
