package L2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a extends Q2.a {
    public static final Parcelable.Creator<a> CREATOR = new c(0);

    /* renamed from: n, reason: collision with root package name */
    public final Intent f1620n;

    public a(Intent intent) {
        this.f1620n = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.y(parcel, 1, this.f1620n, i);
        A8.b.I(parcel, G7);
    }
}
