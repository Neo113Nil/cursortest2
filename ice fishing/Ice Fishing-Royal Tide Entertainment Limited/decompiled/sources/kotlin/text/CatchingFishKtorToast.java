package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class CatchingFishKtorToast extends CatchingFishDaggerHilt {
    public static final Parcelable.Creator<CatchingFishKtorToast> CREATOR = new CatchingFishReduxHilt(3);
    public boolean CatchingFishWorkManager;

    public CatchingFishKtorToast(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            CatchingFishKtorToast.class.getClassLoader();
        }
        this.CatchingFishWorkManager = parcel.readInt() == 1;
    }

    @Override // kotlin.text.CatchingFishDaggerHilt, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.CatchingFishWorkManager ? 1 : 0);
    }
}
