package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class fyw extends l9 implements a8o {
    public static final Parcelable.Creator<fyw> CREATOR = new onv(9);
    public final List a;
    public final String b;

    public fyw(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    @Override // defpackage.a8o
    public final Status getStatus() {
        return this.b != null ? Status.e : Status.i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.l0(parcel, 1, this.a);
        o8g.j0(parcel, 2, this.b);
        o8g.p0(parcel, o0);
    }
}
