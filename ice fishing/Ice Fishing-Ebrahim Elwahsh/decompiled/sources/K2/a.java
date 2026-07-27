package K2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a extends P2.a {
    public static final Parcelable.Creator<a> CREATOR = new c(0);

    /* renamed from: n, reason: collision with root package name */
    public final Intent f1565n;

    public a(Intent intent) {
        this.f1565n = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.t(parcel, 1, this.f1565n, i);
        S0.f.C(parcel, B8);
    }
}
