package com.squareup.cash.limits.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.invitations.SmsInvitation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LimitsCategoryData implements Parcelable {
    public static final Parcelable.Creator<LimitsCategoryData> CREATOR = new SmsInvitation.Creator(28);
    public final String header;
    public final List legacyItems;
    public final List progressBars;

    /* renamed from: type, reason: collision with root package name */
    public final LimitsCategoryType f1169type;

    public LimitsCategoryData(LimitsCategoryType limitsCategoryType, String str, List list, ArrayList arrayList) {
        limitsCategoryType.getClass();
        this.f1169type = limitsCategoryType;
        this.header = str;
        this.legacyItems = list;
        this.progressBars = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitsCategoryData)) {
            return false;
        }
        LimitsCategoryData limitsCategoryData = (LimitsCategoryData) obj;
        return this.f1169type == limitsCategoryData.f1169type && Intrinsics.areEqual(this.header, limitsCategoryData.header) && Intrinsics.areEqual(this.legacyItems, limitsCategoryData.legacyItems) && Intrinsics.areEqual(this.progressBars, limitsCategoryData.progressBars);
    }

    public final int hashCode() {
        int hashCode = this.f1169type.hashCode() * 31;
        String str = this.header;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.legacyItems;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.progressBars;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "LimitsCategoryData(type=" + this.f1169type + ", header=" + this.header + ", legacyItems=" + this.legacyItems + ", progressBars=" + this.progressBars + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.f1169type.writeToParcel(parcel, i);
        parcel.writeString(this.header);
        parcel.writeStringList(this.legacyItems);
        List list = this.progressBars;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator m = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list);
        while (m.hasNext()) {
            ((ProgressBarData) m.next()).writeToParcel(parcel, i);
        }
    }
}
