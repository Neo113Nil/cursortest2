package defpackage;

/* loaded from: classes.dex */
public final class nMM9nLv63p implements android.os.Parcelable.Creator {
    public final /* synthetic */ int IHQe1A4L2xu;

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        switch (this.IHQe1A4L2xu) {
            case 0:
                parcel.getClass();
                return new defpackage.Q1EpAU06IV(parcel.readInt() == 0 ? null : (android.content.Intent) android.content.Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 1:
                return new defpackage.wm(parcel.readInt());
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                return new androidx.versionedparcelable.ParcelImpl(parcel);
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                return new defpackage.mt0(parcel.readFloat());
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                return new defpackage.nt0(parcel.readInt());
            default:
                return new defpackage.ot0(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        switch (this.IHQe1A4L2xu) {
            case 0:
                return new defpackage.Q1EpAU06IV[i];
            case 1:
                return new defpackage.wm[i];
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                return new androidx.versionedparcelable.ParcelImpl[i];
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                return new defpackage.mt0[i];
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                return new defpackage.nt0[i];
            default:
                return new defpackage.ot0[i];
        }
    }
}
