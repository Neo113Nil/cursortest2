package com.squareup.cash.investing.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.investing.primitives.FilterToken;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class FilterConfiguration implements Parcelable {

    public final class Categories extends FilterConfiguration {
        public static final Parcelable.Creator<Categories> CREATOR = new FilterToken.Creator(7);
        public final List categoryTokens;
        public final FilterToken filterToken;

        public Categories(FilterToken filterToken, List list) {
            filterToken.getClass();
            list.getClass();
            this.filterToken = filterToken;
            this.categoryTokens = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Categories)) {
                return false;
            }
            Categories categories = (Categories) obj;
            return Intrinsics.areEqual(this.filterToken, categories.filterToken) && Intrinsics.areEqual(this.categoryTokens, categories.categoryTokens);
        }

        @Override // com.squareup.cash.investing.primitives.FilterConfiguration
        public final FilterToken getFilterToken() {
            return this.filterToken;
        }

        public final int hashCode() {
            return this.categoryTokens.hashCode() + (this.filterToken.value.hashCode() * 31);
        }

        public final String toString() {
            return "Categories(filterToken=" + this.filterToken + ", categoryTokens=" + this.categoryTokens + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.filterToken.writeToParcel(parcel, i);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.categoryTokens, parcel);
            while (m.hasNext()) {
                CategoryToken categoryToken = (CategoryToken) m.next();
                categoryToken.getClass();
                parcel.writeString(categoryToken.value);
            }
        }
    }

    public final class Empty extends FilterConfiguration {
        public static final Parcelable.Creator<Empty> CREATOR = new FilterToken.Creator(8);
        public final FilterToken filterToken;

        public Empty(FilterToken filterToken) {
            filterToken.getClass();
            this.filterToken = filterToken;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Empty) && Intrinsics.areEqual(this.filterToken, ((Empty) obj).filterToken);
        }

        @Override // com.squareup.cash.investing.primitives.FilterConfiguration
        public final FilterToken getFilterToken() {
            return this.filterToken;
        }

        public final int hashCode() {
            return this.filterToken.value.hashCode();
        }

        public final String toString() {
            return "Empty(filterToken=" + this.filterToken + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.filterToken.writeToParcel(parcel, i);
        }
    }

    public final class SubFilters extends FilterConfiguration {
        public static final Parcelable.Creator<SubFilters> CREATOR = new FilterToken.Creator(9);
        public final FilterToken filterToken;
        public final Map subFilterSelections;

        public SubFilters(FilterToken filterToken, Map map) {
            filterToken.getClass();
            map.getClass();
            this.filterToken = filterToken;
            this.subFilterSelections = map;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubFilters)) {
                return false;
            }
            SubFilters subFilters = (SubFilters) obj;
            return Intrinsics.areEqual(this.filterToken, subFilters.filterToken) && Intrinsics.areEqual(this.subFilterSelections, subFilters.subFilterSelections);
        }

        @Override // com.squareup.cash.investing.primitives.FilterConfiguration
        public final FilterToken getFilterToken() {
            return this.filterToken;
        }

        public final int hashCode() {
            return this.subFilterSelections.hashCode() + (this.filterToken.value.hashCode() * 31);
        }

        public final String toString() {
            return "SubFilters(filterToken=" + this.filterToken + ", subFilterSelections=" + this.subFilterSelections + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.filterToken.writeToParcel(parcel, i);
            Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.subFilterSelections, parcel);
            while (m.hasNext()) {
                Map.Entry entry = (Map.Entry) m.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
    }

    public abstract FilterToken getFilterToken();
}
