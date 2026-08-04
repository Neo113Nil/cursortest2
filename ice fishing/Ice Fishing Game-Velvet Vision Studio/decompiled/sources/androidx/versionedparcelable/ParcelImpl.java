package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import com.gamericefishpro.space.h.a;
import com.gamericefishpro.space.k6.b;
import com.gamericefishpro.space.k6.c;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a(3);
    public final c d;

    public ParcelImpl(Parcel parcel) {
        this.d = new b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new b(parcel).i(this.d);
    }
}
