package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.qje;
import defpackage.s471;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes7.dex */
public final class hr1 implements Parcelable {
    public static final gr1 CREATOR = new gr1();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, fr1.w)};
    public final String b;
    public final List c;

    public hr1(int i, String str, List list) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, s471.b);
            throw null;
        }
        this.b = str;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr1)) {
            return false;
        }
        hr1 hr1Var = (hr1) obj;
        return jl40.l(this.b, hr1Var.b) && jl40.l(this.c, hr1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return nnm.h("MediationPrefetchAdUnit(adUnitId=", this.b, ", networks=", Extension.C_BRAKE, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeTypedList(this.c);
    }

    public hr1(Parcel parcel) {
        String readString = parcel.readString();
        ArrayList createTypedArrayList = parcel.createTypedArrayList(mr1.CREATOR);
        this.b = readString;
        this.c = createTypedArrayList;
    }
}
