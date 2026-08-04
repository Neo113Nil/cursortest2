package com.gamericefishpro.space.x9;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.gamericefishpro.space.f1.t;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends com.gamericefishpro.space.j4.b {
    public static final Parcelable.Creator<a> CREATOR = new t(8);
    public final int i;
    public final int v;
    public final boolean w;
    public final boolean y;
    public final boolean z;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.i = parcel.readInt();
        this.v = parcel.readInt();
        this.w = parcel.readInt() == 1;
        this.y = parcel.readInt() == 1;
        this.z = parcel.readInt() == 1;
    }

    @Override // com.gamericefishpro.space.j4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.i);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w ? 1 : 0);
        parcel.writeInt(this.y ? 1 : 0);
        parcel.writeInt(this.z ? 1 : 0);
    }

    public a(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.i = bottomSheetBehavior.N;
        this.v = bottomSheetBehavior.e;
        this.w = bottomSheetBehavior.b;
        this.y = bottomSheetBehavior.I;
        this.z = bottomSheetBehavior.J;
    }
}
