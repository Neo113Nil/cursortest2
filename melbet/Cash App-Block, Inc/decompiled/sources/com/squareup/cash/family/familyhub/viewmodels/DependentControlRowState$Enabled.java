package com.squareup.cash.family.familyhub.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.google.android.libraries.places.api.model.zzco;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DependentControlRowState$Enabled extends zzco {
    public static final Parcelable.Creator<DependentControlRowState$Enabled> CREATOR = new FamilyHome.Creator(22);
    public final DependentControlInfo controlInfo;
    public final String controlRowText;
    public final String description;
    public final boolean isChecked;
    public final boolean isEditable;
    public final String title;

    public /* synthetic */ DependentControlRowState$Enabled(boolean z, String str, String str2, DependentControlInfo dependentControlInfo, boolean z2, int i) {
        this(z, str, (String) null, str2, (i & 16) != 0 ? null : dependentControlInfo, (i & 32) != 0 ? false : z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DependentControlRowState$Enabled)) {
            return false;
        }
        DependentControlRowState$Enabled dependentControlRowState$Enabled = (DependentControlRowState$Enabled) obj;
        return this.isChecked == dependentControlRowState$Enabled.isChecked && Intrinsics.areEqual(this.controlRowText, dependentControlRowState$Enabled.controlRowText) && Intrinsics.areEqual(this.title, dependentControlRowState$Enabled.title) && Intrinsics.areEqual(this.description, dependentControlRowState$Enabled.description) && this.controlInfo == dependentControlRowState$Enabled.controlInfo && this.isEditable == dependentControlRowState$Enabled.isEditable;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isChecked) * 31;
        String str = this.controlRowText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DependentControlInfo dependentControlInfo = this.controlInfo;
        return Boolean.hashCode(this.isEditable) + ((hashCode4 + (dependentControlInfo != null ? dependentControlInfo.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("Enabled(isChecked=", ", controlRowText=", this.controlRowText, ", title=", this.isChecked);
        Boxes$$ExternalSyntheticOutline1.m(m, this.title, ", description=", this.description, ", controlInfo=");
        m.append(this.controlInfo);
        m.append(", isEditable=");
        m.append(this.isEditable);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.isChecked ? 1 : 0);
        parcel.writeString(this.controlRowText);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        DependentControlInfo dependentControlInfo = this.controlInfo;
        if (dependentControlInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dependentControlInfo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isEditable ? 1 : 0);
    }

    public DependentControlRowState$Enabled(boolean z, String str, String str2, String str3, DependentControlInfo dependentControlInfo, boolean z2) {
        this.isChecked = z;
        this.controlRowText = str;
        this.title = str2;
        this.description = str3;
        this.controlInfo = dependentControlInfo;
        this.isEditable = z2;
    }
}
