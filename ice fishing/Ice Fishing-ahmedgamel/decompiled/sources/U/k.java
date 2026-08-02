package U;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class k extends View.BaseSavedState {
    public static final Parcelable.Creator<k> CREATOR = new B8.d(18);

    /* renamed from: n, reason: collision with root package name */
    public int f3244n;

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" scrollPosition=");
        return AbstractC5128c.e(this.f3244n, "}", sb);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3244n);
    }
}
