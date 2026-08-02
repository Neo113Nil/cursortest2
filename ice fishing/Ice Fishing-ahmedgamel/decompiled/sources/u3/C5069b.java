package u3;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.internal.ads.Wv;
import j3.C4614c;

/* renamed from: u3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5069b extends View.BaseSavedState {
    public static final Parcelable.Creator<C5069b> CREATOR = new C4614c(11);

    /* renamed from: n, reason: collision with root package name */
    public int f41019n;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.f41019n;
        return Wv.i(sb, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.f41019n));
    }
}
