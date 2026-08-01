package s3;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import h3.C4566c;
import u1.h;

/* renamed from: s3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4973b extends View.BaseSavedState {
    public static final Parcelable.Creator<C4973b> CREATOR = new C4566c(8);

    /* renamed from: n, reason: collision with root package name */
    public int f40465n;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.f40465n;
        return h.g(sb, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.f40465n));
    }
}
