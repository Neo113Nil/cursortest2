package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g extends q6.a {
    public static final Parcelable.Creator<g> CREATOR = new c(1);

    /* renamed from: g, reason: collision with root package name */
    public final List f2126g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2127h;

    public g(String str, ArrayList arrayList) {
        this.f2126g = arrayList;
        this.f2127h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int g02 = x4.f.g0(parcel, 20293);
        List<String> list = this.f2126g;
        if (list != null) {
            int g03 = x4.f.g0(parcel, 1);
            parcel.writeStringList(list);
            x4.f.h0(parcel, g03);
        }
        x4.f.c0(parcel, 2, this.f2127h);
        x4.f.h0(parcel, g02);
    }
}
