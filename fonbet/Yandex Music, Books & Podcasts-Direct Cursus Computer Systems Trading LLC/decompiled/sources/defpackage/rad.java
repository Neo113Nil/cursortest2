package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class rad extends l9 {

    @NonNull
    public static final Parcelable.Creator<rad> CREATOR = new onv(17);
    public final int a;

    public rad(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rad) {
            return ldg.s(Integer.valueOf(this.a), Integer.valueOf(((rad) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(1, 4, parcel);
        parcel.writeInt(this.a);
        o8g.p0(parcel, o0);
    }
}
