package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class CatchingFishToastNavigation extends CatchingFishDaggerHilt {
    public static final Parcelable.Creator<CatchingFishToastNavigation> CREATOR = new CatchingFishDatabindingFlux(4);
    public boolean CatchingFishViewModelScope;
    public CharSequence CatchingFishWorkManager;

    public CatchingFishToastNavigation(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.CatchingFishWorkManager = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.CatchingFishViewModelScope = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.CatchingFishWorkManager) + "}";
    }

    @Override // kotlin.text.CatchingFishDaggerHilt, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.CatchingFishWorkManager, parcel, i);
        parcel.writeInt(this.CatchingFishViewModelScope ? 1 : 0);
    }
}
