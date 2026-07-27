package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class U implements Parcelable {
    public static final Parcelable.Creator<U> CREATOR = new B8.d(24);

    /* renamed from: A, reason: collision with root package name */
    public final boolean f4891A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f4892B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f4893C;

    /* renamed from: D, reason: collision with root package name */
    public final int f4894D;

    /* renamed from: E, reason: collision with root package name */
    public final String f4895E;

    /* renamed from: F, reason: collision with root package name */
    public final int f4896F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f4897G;

    /* renamed from: n, reason: collision with root package name */
    public final String f4898n;

    /* renamed from: u, reason: collision with root package name */
    public final String f4899u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f4900v;

    /* renamed from: w, reason: collision with root package name */
    public final int f4901w;

    /* renamed from: x, reason: collision with root package name */
    public final int f4902x;

    /* renamed from: y, reason: collision with root package name */
    public final String f4903y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f4904z;

    public U(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s) {
        this.f4898n = abstractComponentCallbacksC0475s.getClass().getName();
        this.f4899u = abstractComponentCallbacksC0475s.f5066x;
        this.f4900v = abstractComponentCallbacksC0475s.f5033F;
        this.f4901w = abstractComponentCallbacksC0475s.f5041O;
        this.f4902x = abstractComponentCallbacksC0475s.f5042P;
        this.f4903y = abstractComponentCallbacksC0475s.f5043Q;
        this.f4904z = abstractComponentCallbacksC0475s.f5046T;
        this.f4891A = abstractComponentCallbacksC0475s.f5032E;
        this.f4892B = abstractComponentCallbacksC0475s.f5045S;
        this.f4893C = abstractComponentCallbacksC0475s.f5044R;
        this.f4894D = abstractComponentCallbacksC0475s.f5057r0.ordinal();
        this.f4895E = abstractComponentCallbacksC0475s.f5028A;
        this.f4896F = abstractComponentCallbacksC0475s.f5029B;
        this.f4897G = abstractComponentCallbacksC0475s.f5051Z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f4898n);
        sb.append(" (");
        sb.append(this.f4899u);
        sb.append(")}:");
        if (this.f4900v) {
            sb.append(" fromLayout");
        }
        int i = this.f4902x;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f4903y;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f4904z) {
            sb.append(" retainInstance");
        }
        if (this.f4891A) {
            sb.append(" removing");
        }
        if (this.f4892B) {
            sb.append(" detached");
        }
        if (this.f4893C) {
            sb.append(" hidden");
        }
        String str2 = this.f4895E;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f4896F);
        }
        if (this.f4897G) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f4898n);
        parcel.writeString(this.f4899u);
        parcel.writeInt(this.f4900v ? 1 : 0);
        parcel.writeInt(this.f4901w);
        parcel.writeInt(this.f4902x);
        parcel.writeString(this.f4903y);
        parcel.writeInt(this.f4904z ? 1 : 0);
        parcel.writeInt(this.f4891A ? 1 : 0);
        parcel.writeInt(this.f4892B ? 1 : 0);
        parcel.writeInt(this.f4893C ? 1 : 0);
        parcel.writeInt(this.f4894D);
        parcel.writeString(this.f4895E);
        parcel.writeInt(this.f4896F);
        parcel.writeInt(this.f4897G ? 1 : 0);
    }

    public U(Parcel parcel) {
        this.f4898n = parcel.readString();
        this.f4899u = parcel.readString();
        this.f4900v = parcel.readInt() != 0;
        this.f4901w = parcel.readInt();
        this.f4902x = parcel.readInt();
        this.f4903y = parcel.readString();
        this.f4904z = parcel.readInt() != 0;
        this.f4891A = parcel.readInt() != 0;
        this.f4892B = parcel.readInt() != 0;
        this.f4893C = parcel.readInt() != 0;
        this.f4894D = parcel.readInt();
        this.f4895E = parcel.readString();
        this.f4896F = parcel.readInt();
        this.f4897G = parcel.readInt() != 0;
    }
}
