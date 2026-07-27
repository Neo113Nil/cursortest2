package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class CatchingFishMVPMockkLayout extends CatchingFishDaggerHilt {
    public static final Parcelable.Creator<CatchingFishMVPMockkLayout> CREATOR = new CatchingFishReduxHilt(5);
    public boolean CatchingFishViewModelScope;
    public int CatchingFishWorkManager;

    public CatchingFishMVPMockkLayout(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.CatchingFishWorkManager = parcel.readInt();
        this.CatchingFishViewModelScope = parcel.readInt() != 0;
    }

    @Override // kotlin.text.CatchingFishDaggerHilt, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.CatchingFishWorkManager);
        parcel.writeInt(this.CatchingFishViewModelScope ? 1 : 0);
    }
}
