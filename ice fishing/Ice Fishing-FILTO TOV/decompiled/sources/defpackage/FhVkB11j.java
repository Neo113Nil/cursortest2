package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class FhVkB11j implements Parcelable {
    public static final Parcelable.Creator<FhVkB11j> CREATOR = new kbVzROOfKK(0);
    public final Intent EljAMC1QTz;
    public final int OOA6hdeuvCS;

    public FhVkB11j(Intent intent, int i) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.OOA6hdeuvCS;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.EljAMC1QTz);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.OOA6hdeuvCS);
        Intent intent = this.EljAMC1QTz;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
