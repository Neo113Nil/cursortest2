package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class sjx extends l9 {
    public static final Parcelable.Creator<sjx> CREATOR = new oex(23);
    public final long a;
    public final obx b;
    public final obx c;
    public final obx d;

    public sjx(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        y1g.G(bArr);
        obx t = obx.t(bArr.length, bArr);
        y1g.G(bArr2);
        obx t2 = obx.t(bArr2.length, bArr2);
        y1g.G(bArr3);
        obx t3 = obx.t(bArr3.length, bArr3);
        this.a = j;
        this.b = t;
        this.c = t2;
        this.d = t3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sjx)) {
            return false;
        }
        sjx sjxVar = (sjx) obj;
        return this.a == sjxVar.a && ldg.s(this.b, sjxVar.b) && ldg.s(this.c, sjxVar.c) && ldg.s(this.d, sjxVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(1, 8, parcel);
        parcel.writeLong(this.a);
        o8g.c0(parcel, 2, this.b.u());
        o8g.c0(parcel, 3, this.c.u());
        o8g.c0(parcel, 4, this.d.u());
        o8g.p0(parcel, o0);
    }
}
