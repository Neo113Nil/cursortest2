package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class U implements Parcelable {
    public static final Parcelable.Creator<U> CREATOR = new F0.a(22);

    /* renamed from: A, reason: collision with root package name */
    public final boolean f5003A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f5004B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f5005C;

    /* renamed from: D, reason: collision with root package name */
    public final int f5006D;

    /* renamed from: E, reason: collision with root package name */
    public final String f5007E;

    /* renamed from: F, reason: collision with root package name */
    public final int f5008F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f5009G;

    /* renamed from: n, reason: collision with root package name */
    public final String f5010n;

    /* renamed from: u, reason: collision with root package name */
    public final String f5011u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f5012v;

    /* renamed from: w, reason: collision with root package name */
    public final int f5013w;

    /* renamed from: x, reason: collision with root package name */
    public final int f5014x;

    /* renamed from: y, reason: collision with root package name */
    public final String f5015y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f5016z;

    public U(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s) {
        this.f5010n = abstractComponentCallbacksC0485s.getClass().getName();
        this.f5011u = abstractComponentCallbacksC0485s.f5178x;
        this.f5012v = abstractComponentCallbacksC0485s.f5145F;
        this.f5013w = abstractComponentCallbacksC0485s.f5153O;
        this.f5014x = abstractComponentCallbacksC0485s.f5154P;
        this.f5015y = abstractComponentCallbacksC0485s.f5155Q;
        this.f5016z = abstractComponentCallbacksC0485s.f5158T;
        this.f5003A = abstractComponentCallbacksC0485s.f5144E;
        this.f5004B = abstractComponentCallbacksC0485s.f5157S;
        this.f5005C = abstractComponentCallbacksC0485s.f5156R;
        this.f5006D = abstractComponentCallbacksC0485s.f5169r0.ordinal();
        this.f5007E = abstractComponentCallbacksC0485s.f5140A;
        this.f5008F = abstractComponentCallbacksC0485s.f5141B;
        this.f5009G = abstractComponentCallbacksC0485s.f5163Z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f5010n);
        sb.append(" (");
        sb.append(this.f5011u);
        sb.append(")}:");
        if (this.f5012v) {
            sb.append(" fromLayout");
        }
        int i = this.f5014x;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f5015y;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f5016z) {
            sb.append(" retainInstance");
        }
        if (this.f5003A) {
            sb.append(" removing");
        }
        if (this.f5004B) {
            sb.append(" detached");
        }
        if (this.f5005C) {
            sb.append(" hidden");
        }
        String str2 = this.f5007E;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f5008F);
        }
        if (this.f5009G) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5010n);
        parcel.writeString(this.f5011u);
        parcel.writeInt(this.f5012v ? 1 : 0);
        parcel.writeInt(this.f5013w);
        parcel.writeInt(this.f5014x);
        parcel.writeString(this.f5015y);
        parcel.writeInt(this.f5016z ? 1 : 0);
        parcel.writeInt(this.f5003A ? 1 : 0);
        parcel.writeInt(this.f5004B ? 1 : 0);
        parcel.writeInt(this.f5005C ? 1 : 0);
        parcel.writeInt(this.f5006D);
        parcel.writeString(this.f5007E);
        parcel.writeInt(this.f5008F);
        parcel.writeInt(this.f5009G ? 1 : 0);
    }

    public U(Parcel parcel) {
        this.f5010n = parcel.readString();
        this.f5011u = parcel.readString();
        this.f5012v = parcel.readInt() != 0;
        this.f5013w = parcel.readInt();
        this.f5014x = parcel.readInt();
        this.f5015y = parcel.readString();
        this.f5016z = parcel.readInt() != 0;
        this.f5003A = parcel.readInt() != 0;
        this.f5004B = parcel.readInt() != 0;
        this.f5005C = parcel.readInt() != 0;
        this.f5006D = parcel.readInt();
        this.f5007E = parcel.readString();
        this.f5008F = parcel.readInt();
        this.f5009G = parcel.readInt() != 0;
    }
}
