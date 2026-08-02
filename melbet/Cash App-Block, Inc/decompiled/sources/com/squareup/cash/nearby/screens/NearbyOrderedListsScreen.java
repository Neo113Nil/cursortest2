package com.squareup.cash.nearby.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.broadway.screen.Screen;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.nearby.viewmodels.ListSection;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class NearbyOrderedListsScreen implements Screen {
    public static final Parcelable.Creator<NearbyOrderedListsScreen> CREATOR = new ListSection.Creator(1);
    public final String description;
    public final List sections;
    public final String title;

    public NearbyOrderedListsScreen(String str, String str2, List list) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, list);
        this.title = str;
        this.description = str2;
        this.sections = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyOrderedListsScreen)) {
            return false;
        }
        NearbyOrderedListsScreen nearbyOrderedListsScreen = (NearbyOrderedListsScreen) obj;
        return Intrinsics.areEqual(this.title, nearbyOrderedListsScreen.title) && Intrinsics.areEqual(this.description, nearbyOrderedListsScreen.description) && Intrinsics.areEqual(this.sections, nearbyOrderedListsScreen.sections);
    }

    public final int hashCode() {
        return this.sections.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NearbyOrderedListsScreen(title=", this.title, ", description=", this.description, ", sections="), this.sections, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.sections, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
    }
}
