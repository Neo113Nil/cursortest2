package com.squareup.cash.shopping.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.shopping.screens.AutofillQuestion;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes7.dex */
public abstract class ShoppingScreen$Filter implements Parcelable {

    public final class PriceRange extends ShoppingScreen$Filter {
        public static final Parcelable.Creator<PriceRange> CREATOR = new AutofillQuestion.Creator(16);
        public final String name;
        public final IntRange selectedRange;

        public PriceRange(String str, IntRange intRange) {
            str.getClass();
            this.name = str;
            this.selectedRange = intRange;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PriceRange)) {
                return false;
            }
            PriceRange priceRange = (PriceRange) obj;
            return Intrinsics.areEqual(this.name, priceRange.name) && this.selectedRange.equals(priceRange.selectedRange);
        }

        public final int hashCode() {
            return this.selectedRange.hashCode() + (this.name.hashCode() * 31);
        }

        public final String toString() {
            return "PriceRange(name=" + this.name + ", selectedRange=" + this.selectedRange + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.name);
            IntRange intRange = this.selectedRange;
            parcel.writeInt(intRange.first);
            parcel.writeInt(intRange.last);
        }
    }

    public final class Selections extends ShoppingScreen$Filter {
        public static final Parcelable.Creator<Selections> CREATOR = new AutofillQuestion.Creator(17);
        public final String name;
        public final LinkedHashSet selectedOptions;

        public Selections(String str, LinkedHashSet linkedHashSet) {
            str.getClass();
            this.name = str;
            this.selectedOptions = linkedHashSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Selections)) {
                return false;
            }
            Selections selections = (Selections) obj;
            return Intrinsics.areEqual(this.name, selections.name) && this.selectedOptions.equals(selections.selectedOptions);
        }

        public final int hashCode() {
            return this.selectedOptions.hashCode() + (this.name.hashCode() * 31);
        }

        public final String toString() {
            return "Selections(name=" + this.name + ", selectedOptions=" + this.selectedOptions + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.name);
            LinkedHashSet linkedHashSet = this.selectedOptions;
            parcel.writeInt(linkedHashSet.size());
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                parcel.writeString((String) it.next());
            }
        }
    }

    public final class Toggle extends ShoppingScreen$Filter {
        public static final Parcelable.Creator<Toggle> CREATOR = new AutofillQuestion.Creator(18);
        public final String name;
        public final boolean toggled;

        public Toggle(String str, boolean z) {
            str.getClass();
            this.name = str;
            this.toggled = z;
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
            return Intrinsics.areEqual(this.name, toggle.name) && this.toggled == toggle.toggled;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.toggled) + (this.name.hashCode() * 31);
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("Toggle(name=", this.name, ", toggled=", ")", this.toggled);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.name);
            parcel.writeInt(this.toggled ? 1 : 0);
        }
    }
}
