package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class r8k implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<r8k> CREATOR = new pgj(12);
    public final boolean a;
    public final boolean b;
    public final t7w c;

    public r8k(boolean z, boolean z2, t7w t7wVar) {
        this.a = z;
        this.b = z2;
        this.c = t7wVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        t7w t7wVar = this.c;
        if (t7wVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(t7wVar.name());
        }
    }
}
