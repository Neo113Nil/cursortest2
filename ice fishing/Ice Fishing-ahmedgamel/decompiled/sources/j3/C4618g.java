package j3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: j3.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4618g extends S2.a {
    public static final Parcelable.Creator<C4618g> CREATOR = new C4614c(1);

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f38482n;

    /* renamed from: u, reason: collision with root package name */
    public final String f38483u;

    public C4618g(String str, ArrayList arrayList) {
        this.f38482n = arrayList;
        this.f38483u = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.t(parcel, 1, this.f38482n);
        com.bumptech.glide.e.r(parcel, 2, this.f38483u);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
