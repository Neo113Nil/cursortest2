package com.squareup.cash.core.navigationcontainer.navigator;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.composable.adapter.ViewStateId;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PresentersSavedState implements Parcelable {
    public static final Parcelable.Creator<PresentersSavedState> CREATOR = new ViewStateId.Creator(10);
    public final Map presenterStates;

    public PresentersSavedState(Map map) {
        map.getClass();
        this.presenterStates = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PresentersSavedState) && Intrinsics.areEqual(this.presenterStates, ((PresentersSavedState) obj).presenterStates);
    }

    public final Map getPresenterStates() {
        return this.presenterStates;
    }

    public final int hashCode() {
        return this.presenterStates.hashCode();
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m("PresentersSavedState(presenterStates=", ")", this.presenterStates);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.presenterStates, parcel);
        while (m.hasNext()) {
            Map.Entry entry = (Map.Entry) m.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
    }
}
