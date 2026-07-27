package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class CatchingFishGraphQLView extends CatchingFishDaggerHilt {
    public static final Parcelable.Creator<CatchingFishGraphQLView> CREATOR = new CatchingFishReduxHilt(2);
    public boolean CatchingFishWorkManager;

    public CatchingFishGraphQLView(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.CatchingFishWorkManager = parcel.readInt() == 1;
    }

    @Override // kotlin.text.CatchingFishDaggerHilt, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.CatchingFishWorkManager ? 1 : 0);
    }
}
