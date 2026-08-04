package com.gamericefishpro.space.la;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.gamericefishpro.space.f1.t;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends com.gamericefishpro.space.j4.b {
    public static final Parcelable.Creator<e> CREATOR = new t(3);
    public final int i;

    public e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.i = parcel.readInt();
    }

    @Override // com.gamericefishpro.space.j4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.i);
    }

    public e(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.i = sideSheetBehavior.h;
    }
}
