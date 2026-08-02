package com.squareup.cash.deposits.physical.viewmodels.map;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.db.contacts.Recipient;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AtmExplainerViewModel implements Parcelable {
    public static final Parcelable.Creator<AtmExplainerViewModel> CREATOR = new Recipient.Creator(29);
    public final ArrayList benefits;
    public final HeaderIcon headerIcon;
    public final String helpButtonClientRoute;
    public final String helpButtonText;
    public final ArrayList limits;
    public final String title;

    public AtmExplainerViewModel(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2, HeaderIcon headerIcon) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        headerIcon.getClass();
        this.title = str;
        this.helpButtonText = str2;
        this.helpButtonClientRoute = str3;
        this.benefits = arrayList;
        this.limits = arrayList2;
        this.headerIcon = headerIcon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtmExplainerViewModel)) {
            return false;
        }
        AtmExplainerViewModel atmExplainerViewModel = (AtmExplainerViewModel) obj;
        return Intrinsics.areEqual(this.title, atmExplainerViewModel.title) && Intrinsics.areEqual(this.helpButtonText, atmExplainerViewModel.helpButtonText) && Intrinsics.areEqual(this.helpButtonClientRoute, atmExplainerViewModel.helpButtonClientRoute) && this.benefits.equals(atmExplainerViewModel.benefits) && this.limits.equals(atmExplainerViewModel.limits) && this.headerIcon == atmExplainerViewModel.headerIcon;
    }

    public final int hashCode() {
        return this.headerIcon.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.limits, CameraState$Type$EnumUnboxingLocalUtility.m(this.benefits, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.helpButtonText), 31, this.helpButtonClientRoute), 31), 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AtmExplainerViewModel(title=", this.title, ", helpButtonText=", this.helpButtonText, ", helpButtonClientRoute=");
        m.append(this.helpButtonClientRoute);
        m.append(", benefits=");
        m.append(this.benefits);
        m.append(", limits=");
        m.append(this.limits);
        m.append(", headerIcon=");
        m.append(this.headerIcon);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.helpButtonText);
        parcel.writeString(this.helpButtonClientRoute);
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.benefits, parcel);
        while (m.hasNext()) {
            ((Benefit) m.next()).writeToParcel(parcel, i);
        }
        Iterator m2 = NavAction$$ExternalSyntheticOutline0.m(this.limits, parcel);
        while (m2.hasNext()) {
            ((Limit) m2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.headerIcon.name());
    }
}
