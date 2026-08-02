package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class xnd extends l9 {

    @NonNull
    public static final Parcelable.Creator<xnd> CREATOR = new vzw(12);
    public final boolean a;

    public xnd(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xnd) && this.a == ((xnd) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(1, 4, parcel);
        parcel.writeInt(this.a ? 1 : 0);
        o8g.p0(parcel, o0);
    }
}
