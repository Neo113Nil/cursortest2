package com.squareup.cash.shopping.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.cdf.browser.EntityType;
import com.squareup.cash.shopping.screens.AutofillQuestion;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class EntityInformation implements Parcelable {
    public static final Parcelable.Creator<EntityInformation> CREATOR = new AutofillQuestion.Creator(6);
    public final String businessName;
    public final String businessToken;
    public final String entityName;
    public final String entityToken;
    public final EntityType entityType;

    public EntityInformation(String str, String str2, EntityType entityType, String str3, String str4) {
        this.entityName = str;
        this.entityToken = str2;
        this.entityType = entityType;
        this.businessName = str3;
        this.businessToken = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntityInformation)) {
            return false;
        }
        EntityInformation entityInformation = (EntityInformation) obj;
        return Intrinsics.areEqual(this.entityName, entityInformation.entityName) && Intrinsics.areEqual(this.entityToken, entityInformation.entityToken) && this.entityType == entityInformation.entityType && Intrinsics.areEqual(this.businessName, entityInformation.businessName) && Intrinsics.areEqual(this.businessToken, entityInformation.businessToken);
    }

    public final int hashCode() {
        String str = this.entityName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.entityToken;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        EntityType entityType = this.entityType;
        int hashCode3 = (hashCode2 + (entityType == null ? 0 : entityType.hashCode())) * 31;
        String str3 = this.businessName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.businessToken;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EntityInformation(entityName=", this.entityName, ", entityToken=", this.entityToken, ", entityType=");
        m.append(this.entityType);
        m.append(", businessName=");
        m.append(this.businessName);
        m.append(", businessToken=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.businessToken, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.entityName);
        parcel.writeString(this.entityToken);
        EntityType entityType = this.entityType;
        if (entityType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(entityType.name());
        }
        parcel.writeString(this.businessName);
        parcel.writeString(this.businessToken);
    }
}
