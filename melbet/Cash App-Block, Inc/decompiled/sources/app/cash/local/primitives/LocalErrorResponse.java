package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.local.primitives.Line;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalErrorResponse implements Parcelable {
    public static final Parcelable.Creator<LocalErrorResponse> CREATOR = new Line.Creator(13);
    public final List errors;

    public LocalErrorResponse(AbstractList abstractList) {
        abstractList.getClass();
        this.errors = abstractList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalErrorResponse) && Intrinsics.areEqual(this.errors, ((LocalErrorResponse) obj).errors);
    }

    public final int hashCode() {
        return this.errors.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("LocalErrorResponse(errors=", ")", this.errors);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.errors, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
    }
}
