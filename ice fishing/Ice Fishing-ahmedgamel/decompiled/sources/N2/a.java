package N2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a extends S2.a {
    public static final Parcelable.Creator<a> CREATOR = new c(0);

    /* renamed from: n, reason: collision with root package name */
    public final Intent f1909n;

    public a(Intent intent) {
        this.f1909n = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.q(parcel, 1, this.f1909n, i);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
