package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class evr extends View.BaseSavedState {
    public static final Parcelable.Creator<evr> CREATOR = new bwp(24);
    public final boolean a;

    public evr(Parcel parcel) {
        super(parcel);
        this.a = parcel.readByte() != 0;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
    }

    public evr(Parcelable parcelable, boolean z) {
        super(parcelable);
        this.a = z;
    }
}
