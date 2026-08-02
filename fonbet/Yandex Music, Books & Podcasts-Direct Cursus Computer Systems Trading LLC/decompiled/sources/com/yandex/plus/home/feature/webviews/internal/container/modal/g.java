package com.yandex.plus.home.feature.webviews.internal.container.modal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class g extends androidx.customview.view.a {
    public static final Parcelable.Creator<g> CREATOR = new f();
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public g(Parcel parcel, ClassLoader classLoader) {
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

    public g(Parcelable parcelable, ModalViewBehavior modalViewBehavior) {
        super(parcelable);
        int i;
        int i2;
        boolean z;
        boolean z2;
        i = modalViewBehavior.state;
        this.c = i;
        i2 = modalViewBehavior.peekHeight;
        this.d = i2;
        z = modalViewBehavior.fitToContents;
        this.e = z;
        this.f = modalViewBehavior.hideable;
        z2 = modalViewBehavior.skipCollapsed;
        this.g = z2;
    }
}
