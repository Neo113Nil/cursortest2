package com.squareup.cash.pools.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes6.dex */
public final class PoolListSection {
    public final String name;
    public final ImmutableList people;

    public final class PoolListPerson {
        public final Color accentColor;
        public final boolean addedToPool;
        public final String cashtag;
        public final String customerId;
        public final String displayName;
        public final boolean isAvatarTappable;
        public final boolean isBusiness;
        public final boolean isFavorite;
        public final boolean isRemovable;
        public final boolean isRequestInFlight;
        public final boolean isVerified;
        public final String monogram;
        public final Image photoImage;

        public PoolListPerson(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Image image, Color color, boolean z6, boolean z7) {
            this.customerId = str;
            this.displayName = str2;
            this.cashtag = str3;
            this.monogram = str4;
            this.isRequestInFlight = z;
            this.addedToPool = z2;
            this.isFavorite = z3;
            this.isVerified = z4;
            this.isBusiness = z5;
            this.photoImage = image;
            this.accentColor = color;
            this.isRemovable = z6;
            this.isAvatarTappable = z7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoolListPerson)) {
                return false;
            }
            PoolListPerson poolListPerson = (PoolListPerson) obj;
            return Intrinsics.areEqual(this.customerId, poolListPerson.customerId) && Intrinsics.areEqual(this.displayName, poolListPerson.displayName) && Intrinsics.areEqual(this.cashtag, poolListPerson.cashtag) && Intrinsics.areEqual(this.monogram, poolListPerson.monogram) && this.isRequestInFlight == poolListPerson.isRequestInFlight && this.addedToPool == poolListPerson.addedToPool && this.isFavorite == poolListPerson.isFavorite && this.isVerified == poolListPerson.isVerified && this.isBusiness == poolListPerson.isBusiness && Intrinsics.areEqual(this.photoImage, poolListPerson.photoImage) && Intrinsics.areEqual(this.accentColor, poolListPerson.accentColor) && this.isRemovable == poolListPerson.isRemovable && this.isAvatarTappable == poolListPerson.isAvatarTappable;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.customerId.hashCode() * 31, 31, this.displayName);
            String str = this.cashtag;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.monogram;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isRequestInFlight), 31, this.addedToPool), 31, this.isFavorite), 31, this.isVerified), 31, this.isBusiness);
            Image image = this.photoImage;
            int hashCode2 = (m2 + (image == null ? 0 : image.hashCode())) * 31;
            Color color = this.accentColor;
            return Boolean.hashCode(this.isAvatarTappable) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (color != null ? color.hashCode() : 0)) * 31, 31, this.isRemovable);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PoolListPerson(customerId=", this.customerId, ", displayName=", this.displayName, ", cashtag=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.cashtag, ", monogram=", this.monogram, ", isRequestInFlight=");
            re$$ExternalSyntheticOutline0.m(m, this.isRequestInFlight, ", addedToPool=", this.addedToPool, ", isFavorite=");
            re$$ExternalSyntheticOutline0.m(m, this.isFavorite, ", isVerified=", this.isVerified, ", isBusiness=");
            m.append(this.isBusiness);
            m.append(", photoImage=");
            m.append(this.photoImage);
            m.append(", accentColor=");
            m.append(this.accentColor);
            m.append(", isRemovable=");
            m.append(this.isRemovable);
            m.append(", isAvatarTappable=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.isAvatarTappable, ")");
        }
    }

    public PoolListSection(String str, ImmutableList immutableList) {
        str.getClass();
        immutableList.getClass();
        this.name = str;
        this.people = immutableList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoolListSection)) {
            return false;
        }
        PoolListSection poolListSection = (PoolListSection) obj;
        return Intrinsics.areEqual(this.name, poolListSection.name) && Intrinsics.areEqual(this.people, poolListSection.people);
    }

    public final int hashCode() {
        return this.people.hashCode() + (this.name.hashCode() * 31);
    }

    public final String toString() {
        return "PoolListSection(name=" + this.name + ", people=" + this.people + ")";
    }
}
