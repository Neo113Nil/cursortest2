package q3;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import f3.C4509h;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class b extends View.BaseSavedState {
    public static final Parcelable.Creator<b> CREATOR = new C4509h(5);

    /* renamed from: n, reason: collision with root package name */
    public int f40129n;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.f40129n;
        return AbstractC5051n.g(sb, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.f40129n));
    }
}
