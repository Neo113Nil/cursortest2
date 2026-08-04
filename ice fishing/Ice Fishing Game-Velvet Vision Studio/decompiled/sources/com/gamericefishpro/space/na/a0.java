package com.gamericefishpro.space.na;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends com.gamericefishpro.space.j4.b {
    public static final Parcelable.Creator<a0> CREATOR = new com.gamericefishpro.space.f1.t(5);
    public CharSequence i;
    public boolean v;

    public a0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.v = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.i) + "}";
    }

    @Override // com.gamericefishpro.space.j4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.i, parcel, i);
        parcel.writeInt(this.v ? 1 : 0);
    }
}
