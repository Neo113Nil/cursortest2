package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class K0gkXZrJwRZi implements android.os.Parcelable.Creator {
    public final /* synthetic */ int ZpBGe2uQfcn8;

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        switch (this.ZpBGe2uQfcn8) {
            case 0:
                parcel.getClass();
                return new defpackage.Ux2tdpxXtKdg(parcel.readInt() == 0 ? null : (android.content.Intent) android.content.Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 1:
                return new defpackage.eo(parcel.readInt());
            case 2:
                return new androidx.versionedparcelable.ParcelImpl(parcel);
            case 3:
                return new defpackage.lw0(parcel.readFloat());
            case 4:
                return new defpackage.mw0(parcel.readInt());
            default:
                return new defpackage.nw0(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        switch (this.ZpBGe2uQfcn8) {
            case 0:
                return new defpackage.Ux2tdpxXtKdg[i];
            case 1:
                return new defpackage.eo[i];
            case 2:
                return new androidx.versionedparcelable.ParcelImpl[i];
            case 3:
                return new defpackage.lw0[i];
            case 4:
                return new defpackage.mw0[i];
            default:
                return new defpackage.nw0[i];
        }
    }
}
