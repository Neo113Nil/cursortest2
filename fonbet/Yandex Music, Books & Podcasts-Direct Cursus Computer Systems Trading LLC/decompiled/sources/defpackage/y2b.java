package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class y2b implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<y2b> CREATOR = new vn7(19);
    public final boolean a;
    public final CharSequence b;
    public final Parcelable c;

    public y2b(boolean z, CharSequence charSequence, Parcelable parcelable) {
        this.a = z;
        this.b = charSequence;
        this.c = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a ? 1 : 0);
        TextUtils.writeToParcel(this.b, parcel, i);
        parcel.writeParcelable(this.c, i);
    }
}
