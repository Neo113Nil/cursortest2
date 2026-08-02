package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentState;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new FragmentState.AnonymousClass1(19);
    public ArrayList mActive;
    public ArrayList mAdded;
    public BackStackRecordState[] mBackStack;
    public int mBackStackIndex;
    public ArrayList mLaunchedFragments;
    public String mPrimaryNavActiveWho = null;
    public ArrayList mBackStackStateKeys = new ArrayList();
    public ArrayList mBackStackStates = new ArrayList();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.mActive);
        parcel.writeStringList(this.mAdded);
        parcel.writeTypedArray(this.mBackStack, i);
        parcel.writeInt(this.mBackStackIndex);
        parcel.writeString(this.mPrimaryNavActiveWho);
        parcel.writeStringList(this.mBackStackStateKeys);
        parcel.writeTypedList(this.mBackStackStates);
        parcel.writeTypedList(this.mLaunchedFragments);
    }
}
