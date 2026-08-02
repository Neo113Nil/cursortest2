package com.google.android.material.bottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.w6k;

/* loaded from: classes3.dex */
public final class c extends androidx.customview.view.a {
    public static final Parcelable.Creator<c> CREATOR = new w6k(3);
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt() == 1;
        this.f = parcel.readInt() == 1;
        this.g = parcel.readInt() == 1;
    }

    @Override // androidx.customview.view.a, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }

    public c(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
        super(parcelable);
        int i;
        boolean z;
        boolean z2;
        this.c = bottomSheetBehavior.state;
        i = bottomSheetBehavior.peekHeight;
        this.d = i;
        z = bottomSheetBehavior.fitToContents;
        this.e = z;
        this.f = bottomSheetBehavior.hideable;
        z2 = bottomSheetBehavior.skipCollapsed;
        this.g = z2;
    }
}
