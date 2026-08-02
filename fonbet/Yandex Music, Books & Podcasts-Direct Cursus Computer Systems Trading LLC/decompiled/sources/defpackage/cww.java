package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class cww extends l9 implements a8o {
    public static final Parcelable.Creator<cww> CREATOR = new onv(5);
    public final int a;
    public final int b;
    public final Intent c;

    public cww(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // defpackage.a8o
    public final Status getStatus() {
        return this.b == 0 ? Status.e : Status.i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(1, 4, parcel);
        parcel.writeInt(this.a);
        o8g.q0(2, 4, parcel);
        parcel.writeInt(this.b);
        o8g.i0(parcel, 3, this.c, i);
        o8g.p0(parcel, o0);
    }
}
