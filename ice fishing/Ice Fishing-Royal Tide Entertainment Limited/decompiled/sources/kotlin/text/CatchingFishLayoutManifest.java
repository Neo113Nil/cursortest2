package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class CatchingFishLayoutManifest extends CatchingFishDaggerHilt {
    public static final Parcelable.Creator<CatchingFishLayoutManifest> CREATOR = new CatchingFishReduxHilt(4);
    public final int CatchingFishWorkManager;

    public CatchingFishLayoutManifest(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.CatchingFishWorkManager = parcel.readInt();
    }

    @Override // kotlin.text.CatchingFishDaggerHilt, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.CatchingFishWorkManager);
    }

    public CatchingFishLayoutManifest(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.CatchingFishWorkManager = sideSheetBehavior.CatchingFishViewModelFAB;
    }
}
