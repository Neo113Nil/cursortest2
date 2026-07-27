package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class CatchingFishRoomDataStore extends CatchingFishDaggerHilt {
    public static final Parcelable.Creator<CatchingFishRoomDataStore> CREATOR = new CatchingFishDatabindingFlux(3);
    public Parcelable CatchingFishWorkManager;

    public CatchingFishRoomDataStore(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.CatchingFishWorkManager = parcel.readParcelable(classLoader == null ? CatchingFishKtorDataStore.class.getClassLoader() : classLoader);
    }

    @Override // kotlin.text.CatchingFishDaggerHilt, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.CatchingFishWorkManager, 0);
    }
}
