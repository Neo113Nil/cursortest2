package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class wy2 extends l9 {

    @NonNull
    public static final Parcelable.Creator<wy2> CREATOR = new onv(16);
    public final PendingIntent a;

    public wy2(PendingIntent pendingIntent) {
        y1g.G(pendingIntent);
        this.a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.i0(parcel, 1, this.a, i);
        o8g.p0(parcel, o0);
    }
}
