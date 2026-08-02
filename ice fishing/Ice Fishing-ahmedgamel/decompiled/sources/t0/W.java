package t0;

import android.os.Parcel;
import android.os.Parcelable;
import j3.C4614c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class W implements Parcelable {
    public static final Parcelable.Creator<W> CREATOR = new C4614c(9);

    /* renamed from: A, reason: collision with root package name */
    public boolean f40676A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f40677B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f40678C;

    /* renamed from: n, reason: collision with root package name */
    public int f40679n;

    /* renamed from: u, reason: collision with root package name */
    public int f40680u;

    /* renamed from: v, reason: collision with root package name */
    public int f40681v;

    /* renamed from: w, reason: collision with root package name */
    public int[] f40682w;

    /* renamed from: x, reason: collision with root package name */
    public int f40683x;

    /* renamed from: y, reason: collision with root package name */
    public int[] f40684y;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f40685z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f40679n);
        parcel.writeInt(this.f40680u);
        parcel.writeInt(this.f40681v);
        if (this.f40681v > 0) {
            parcel.writeIntArray(this.f40682w);
        }
        parcel.writeInt(this.f40683x);
        if (this.f40683x > 0) {
            parcel.writeIntArray(this.f40684y);
        }
        parcel.writeInt(this.f40676A ? 1 : 0);
        parcel.writeInt(this.f40677B ? 1 : 0);
        parcel.writeInt(this.f40678C ? 1 : 0);
        parcel.writeList(this.f40685z);
    }
}
