package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class q66 extends l9 {

    @NonNull
    public static final Parcelable.Creator<q66> CREATOR = new oex(12);
    public final ffo a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public q66(ffo ffoVar, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.a = ffoVar;
        this.b = z;
        this.c = z2;
        this.d = iArr;
        this.e = i;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.i0(parcel, 1, this.a, i);
        o8g.q0(2, 4, parcel);
        parcel.writeInt(this.b ? 1 : 0);
        o8g.q0(3, 4, parcel);
        parcel.writeInt(this.c ? 1 : 0);
        o8g.e0(parcel, 4, this.d);
        o8g.q0(5, 4, parcel);
        parcel.writeInt(this.e);
        o8g.e0(parcel, 6, this.f);
        o8g.p0(parcel, o0);
    }
}
