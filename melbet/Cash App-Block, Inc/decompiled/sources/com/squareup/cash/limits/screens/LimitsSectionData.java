package com.squareup.cash.limits.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.limits.screens.LimitsScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LimitsSectionData implements Parcelable {
    public static final Parcelable.Creator<LimitsSectionData> CREATOR = new LimitsScreen.Creator(1);
    public final String accentColor;
    public final ArrayList categories;
    public final String description;
    public final LimitsSectionIconData icon;
    public final String title;

    public LimitsSectionData(String str, LimitsSectionIconData limitsSectionIconData, ArrayList arrayList, String str2, String str3) {
        str.getClass();
        limitsSectionIconData.getClass();
        this.title = str;
        this.icon = limitsSectionIconData;
        this.categories = arrayList;
        this.accentColor = str2;
        this.description = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitsSectionData)) {
            return false;
        }
        LimitsSectionData limitsSectionData = (LimitsSectionData) obj;
        return Intrinsics.areEqual(this.title, limitsSectionData.title) && this.icon == limitsSectionData.icon && this.categories.equals(limitsSectionData.categories) && Intrinsics.areEqual(this.accentColor, limitsSectionData.accentColor) && Intrinsics.areEqual(this.description, limitsSectionData.description);
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.categories, (this.icon.hashCode() + (this.title.hashCode() * 31)) * 31, 31);
        String str = this.accentColor;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LimitsSectionData(title=");
        sb.append(this.title);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", categories=");
        sb.append(this.categories);
        sb.append(", accentColor=");
        sb.append(this.accentColor);
        sb.append(", description=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.description, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        this.icon.writeToParcel(parcel, i);
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.categories, parcel);
        while (m.hasNext()) {
            ((LimitsCategoryData) m.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.accentColor);
        parcel.writeString(this.description);
    }
}
