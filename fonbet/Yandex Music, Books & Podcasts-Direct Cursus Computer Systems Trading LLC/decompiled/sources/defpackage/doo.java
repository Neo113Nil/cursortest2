package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class doo extends l9 {

    @NonNull
    public static final Parcelable.Creator<doo> CREATOR = new onv(24);
    public final PendingIntent a;

    public doo(PendingIntent pendingIntent) {
        y1g.G(pendingIntent);
        this.a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof doo) {
            return ldg.s(this.a, ((doo) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.i0(parcel, 1, this.a, i);
        o8g.p0(parcel, o0);
    }
}
