package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class CatchingFishHiltLayout extends CatchingFishDaggerHilt {
    public static final Parcelable.Creator<CatchingFishHiltLayout> CREATOR = new CatchingFishDatabindingFlux(1);
    public final boolean CatchingFishFragmentHandler;
    public final boolean CatchingFishLayout;
    public final boolean CatchingFishViewModelFAB;
    public final int CatchingFishViewModelScope;
    public final int CatchingFishWorkManager;

    public CatchingFishHiltLayout(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.CatchingFishWorkManager = parcel.readInt();
        this.CatchingFishViewModelScope = parcel.readInt();
        this.CatchingFishViewModelFAB = parcel.readInt() == 1;
        this.CatchingFishLayout = parcel.readInt() == 1;
        this.CatchingFishFragmentHandler = parcel.readInt() == 1;
    }

    @Override // kotlin.text.CatchingFishDaggerHilt, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.CatchingFishWorkManager);
        parcel.writeInt(this.CatchingFishViewModelScope);
        parcel.writeInt(this.CatchingFishViewModelFAB ? 1 : 0);
        parcel.writeInt(this.CatchingFishLayout ? 1 : 0);
        parcel.writeInt(this.CatchingFishFragmentHandler ? 1 : 0);
    }

    public CatchingFishHiltLayout(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.CatchingFishWorkManager = bottomSheetBehavior.CatchingFishPayPalLiveData;
        this.CatchingFishViewModelScope = bottomSheetBehavior.CatchingFishDaggerWebsocket;
        this.CatchingFishViewModelFAB = bottomSheetBehavior.CatchingFishSnackbar;
        this.CatchingFishLayout = bottomSheetBehavior.CatchingFishSensorManager;
        this.CatchingFishFragmentHandler = bottomSheetBehavior.CatchingFishEspressoMockk;
    }
}
