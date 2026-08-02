package com.squareup.cash.payments.views;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.InstrumentSelection;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MainPaymentViewState implements Parcelable {
    public static final Parcelable.Creator<MainPaymentViewState> CREATOR = new Creator();
    public final InstrumentSelection instrumentSelected;
    public final String note;
    public final String query;
    public final Map selectedRecipients;
    public final boolean updated;

    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            InstrumentSelection instrumentSelection = (InstrumentSelection) parcel.readParcelable(MainPaymentViewState.class.getClassLoader());
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), parcel.readParcelable(MainPaymentViewState.class.getClassLoader()));
            }
            return new MainPaymentViewState(readString, readString2, instrumentSelection, linkedHashMap, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MainPaymentViewState[i];
        }
    }

    public MainPaymentViewState(String str, String str2, InstrumentSelection instrumentSelection, Map map, boolean z) {
        str.getClass();
        str2.getClass();
        map.getClass();
        this.query = str;
        this.note = str2;
        this.instrumentSelected = instrumentSelection;
        this.selectedRecipients = map;
        this.updated = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MainPaymentViewState)) {
            return false;
        }
        MainPaymentViewState mainPaymentViewState = (MainPaymentViewState) obj;
        return Intrinsics.areEqual(this.query, mainPaymentViewState.query) && Intrinsics.areEqual(this.note, mainPaymentViewState.note) && Intrinsics.areEqual(this.instrumentSelected, mainPaymentViewState.instrumentSelected) && Intrinsics.areEqual(this.selectedRecipients, mainPaymentViewState.selectedRecipients) && this.updated == mainPaymentViewState.updated;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.query.hashCode() * 31, 31, this.note);
        InstrumentSelection instrumentSelection = this.instrumentSelected;
        return Boolean.hashCode(this.updated) + CameraState$Type$EnumUnboxingLocalUtility.m((m + (instrumentSelection == null ? 0 : instrumentSelection.hashCode())) * 31, this.selectedRecipients, 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MainPaymentViewState(query=", this.query, ", note=", this.note, ", instrumentSelected=");
        m.append(this.instrumentSelected);
        m.append(", selectedRecipients=");
        m.append(this.selectedRecipients);
        m.append(", updated=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.updated, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.query);
        parcel.writeString(this.note);
        parcel.writeParcelable(this.instrumentSelected, i);
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.selectedRecipients, parcel);
        while (m.hasNext()) {
            Map.Entry entry = (Map.Entry) m.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
        parcel.writeInt(this.updated ? 1 : 0);
    }
}
