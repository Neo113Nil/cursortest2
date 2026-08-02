package com.squareup.cash.deposits.physical.viewmodels.map;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.deposits.physical.viewmodels.map.Limit;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Benefit implements Parcelable {
    public static final Parcelable.Creator<Benefit> CREATOR = new Limit.Creator(1);
    public final String buttonClientRoute;
    public final String buttonName;
    public final String description;
    public final List descriptionItems;
    public final boolean enabled;
    public final String highlightedInfoText;
    public final String name;

    public Benefit(boolean z, String str, String str2, List list, String str3, String str4, String str5) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, list);
        this.enabled = z;
        this.name = str;
        this.description = str2;
        this.descriptionItems = list;
        this.buttonName = str3;
        this.buttonClientRoute = str4;
        this.highlightedInfoText = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Benefit)) {
            return false;
        }
        Benefit benefit = (Benefit) obj;
        return this.enabled == benefit.enabled && Intrinsics.areEqual(this.name, benefit.name) && Intrinsics.areEqual(this.description, benefit.description) && Intrinsics.areEqual(this.descriptionItems, benefit.descriptionItems) && Intrinsics.areEqual(this.buttonName, benefit.buttonName) && Intrinsics.areEqual(this.buttonClientRoute, benefit.buttonClientRoute) && Intrinsics.areEqual(this.highlightedInfoText, benefit.highlightedInfoText);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.enabled) * 31, 31, this.name), 31, this.description), 31, this.descriptionItems);
        String str = this.buttonName;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.buttonClientRoute;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.highlightedInfoText;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("Benefit(enabled=", ", name=", this.name, ", description=", this.enabled);
        NavAction$$ExternalSyntheticOutline0.m(this.description, ", descriptionItems=", ", buttonName=", m, this.descriptionItems);
        Boxes$$ExternalSyntheticOutline1.m(m, this.buttonName, ", buttonClientRoute=", this.buttonClientRoute, ", highlightedInfoText=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.highlightedInfoText, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.enabled ? 1 : 0);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeStringList(this.descriptionItems);
        parcel.writeString(this.buttonName);
        parcel.writeString(this.buttonClientRoute);
        parcel.writeString(this.highlightedInfoText);
    }
}
