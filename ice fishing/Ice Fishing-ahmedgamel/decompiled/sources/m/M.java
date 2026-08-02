package m;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import j3.C4614c;

/* loaded from: classes.dex */
public final class M extends View.BaseSavedState {
    public static final Parcelable.Creator<M> CREATOR = new C4614c(3);

    /* renamed from: n, reason: collision with root package name */
    public boolean f39104n;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f39104n ? (byte) 1 : (byte) 0);
    }
}
