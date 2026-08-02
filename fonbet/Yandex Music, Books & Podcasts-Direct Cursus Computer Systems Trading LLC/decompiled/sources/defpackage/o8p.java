package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.a;

/* loaded from: classes.dex */
public final class o8p extends a {
    public static final Parcelable.Creator<o8p> CREATOR = new w6k(13);
    public boolean c;

    public o8p(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" isIconified=");
        return ouj.r(sb, this.c, "}");
    }

    @Override // androidx.customview.view.a, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.c));
    }
}
