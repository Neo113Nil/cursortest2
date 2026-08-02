package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes7.dex */
public final class qr1 implements Parcelable {
    public static final pr1 CREATOR = new pr1();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, or1.w)};
    public final long b;
    public final List c;

    public qr1(int i, long j, List list) {
        this.b = (i & 1) == 0 ? 30000L : j;
        if ((i & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr1)) {
            return false;
        }
        qr1 qr1Var = (qr1) obj;
        return this.b == qr1Var.b && jl40.l(this.c, qr1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "MediationPrefetchSettings(loadTimeoutMillis=" + this.b + ", mediationPrefetchAdUnits=" + this.c + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeTypedList(this.c);
    }

    public qr1(long j, ArrayList arrayList) {
        this.b = j;
        this.c = arrayList;
    }

    public qr1(Parcel parcel) {
        long readLong = parcel.readLong();
        ArrayList createTypedArrayList = parcel.createTypedArrayList(hr1.CREATOR);
        this.b = readLong;
        this.c = createTypedArrayList;
    }
}
