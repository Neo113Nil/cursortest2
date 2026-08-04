package com.gamericefishpro.space.p9;

import android.os.Parcel;
import android.os.Parcelable;
import com.gamericefishpro.space.i9.y3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends com.gamericefishpro.space.w8.a {
    public static final Parcelable.Creator<f> CREATOR = new com.gamericefishpro.space.h.a(17);
    public final List d;
    public final String e;

    public f(String str, ArrayList arrayList) {
        this.d = arrayList;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = y3.V(parcel, 20293);
        List<String> list = this.d;
        if (list != null) {
            int iV2 = y3.V(parcel, 1);
            parcel.writeStringList(list);
            y3.W(parcel, iV2);
        }
        y3.Q(parcel, 2, this.e);
        y3.W(parcel, iV);
    }
}
