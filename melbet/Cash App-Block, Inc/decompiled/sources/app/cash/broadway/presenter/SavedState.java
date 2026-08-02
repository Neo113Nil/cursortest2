package app.cash.broadway.presenter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.google.android.gms.common.zza;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SavedState implements Parcelable {
    public static final Parcelable.Creator<SavedState> CREATOR = new zza(1);
    public final Map value;

    public SavedState(Map map) {
        map.getClass();
        this.value = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SavedState) && Intrinsics.areEqual(this.value, ((SavedState) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m("SavedState(value=", ")", this.value);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.value, parcel);
        while (m.hasNext()) {
            Map.Entry entry = (Map.Entry) m.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeValue(entry.getValue());
        }
    }
}
