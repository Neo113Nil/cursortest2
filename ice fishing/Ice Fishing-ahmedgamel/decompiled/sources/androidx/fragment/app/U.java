package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class U implements Parcelable {
    public static final Parcelable.Creator<U> CREATOR = new B8.d(24);

    /* renamed from: A, reason: collision with root package name */
    public final boolean f4859A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f4860B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f4861C;

    /* renamed from: D, reason: collision with root package name */
    public final int f4862D;

    /* renamed from: E, reason: collision with root package name */
    public final String f4863E;

    /* renamed from: F, reason: collision with root package name */
    public final int f4864F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f4865G;

    /* renamed from: n, reason: collision with root package name */
    public final String f4866n;

    /* renamed from: u, reason: collision with root package name */
    public final String f4867u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f4868v;

    /* renamed from: w, reason: collision with root package name */
    public final int f4869w;

    /* renamed from: x, reason: collision with root package name */
    public final int f4870x;

    /* renamed from: y, reason: collision with root package name */
    public final String f4871y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f4872z;

    public U(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s) {
        this.f4866n = abstractComponentCallbacksC0479s.getClass().getName();
        this.f4867u = abstractComponentCallbacksC0479s.f5034x;
        this.f4868v = abstractComponentCallbacksC0479s.f5001F;
        this.f4869w = abstractComponentCallbacksC0479s.f5009O;
        this.f4870x = abstractComponentCallbacksC0479s.f5010P;
        this.f4871y = abstractComponentCallbacksC0479s.f5011Q;
        this.f4872z = abstractComponentCallbacksC0479s.f5014T;
        this.f4859A = abstractComponentCallbacksC0479s.f5000E;
        this.f4860B = abstractComponentCallbacksC0479s.f5013S;
        this.f4861C = abstractComponentCallbacksC0479s.f5012R;
        this.f4862D = abstractComponentCallbacksC0479s.m0.ordinal();
        this.f4863E = abstractComponentCallbacksC0479s.f4996A;
        this.f4864F = abstractComponentCallbacksC0479s.f4997B;
        this.f4865G = abstractComponentCallbacksC0479s.f5019Z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f4866n);
        sb.append(" (");
        sb.append(this.f4867u);
        sb.append(")}:");
        if (this.f4868v) {
            sb.append(" fromLayout");
        }
        int i = this.f4870x;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f4871y;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f4872z) {
            sb.append(" retainInstance");
        }
        if (this.f4859A) {
            sb.append(" removing");
        }
        if (this.f4860B) {
            sb.append(" detached");
        }
        if (this.f4861C) {
            sb.append(" hidden");
        }
        String str2 = this.f4863E;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f4864F);
        }
        if (this.f4865G) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f4866n);
        parcel.writeString(this.f4867u);
        parcel.writeInt(this.f4868v ? 1 : 0);
        parcel.writeInt(this.f4869w);
        parcel.writeInt(this.f4870x);
        parcel.writeString(this.f4871y);
        parcel.writeInt(this.f4872z ? 1 : 0);
        parcel.writeInt(this.f4859A ? 1 : 0);
        parcel.writeInt(this.f4860B ? 1 : 0);
        parcel.writeInt(this.f4861C ? 1 : 0);
        parcel.writeInt(this.f4862D);
        parcel.writeString(this.f4863E);
        parcel.writeInt(this.f4864F);
        parcel.writeInt(this.f4865G ? 1 : 0);
    }

    public U(Parcel parcel) {
        this.f4866n = parcel.readString();
        this.f4867u = parcel.readString();
        this.f4868v = parcel.readInt() != 0;
        this.f4869w = parcel.readInt();
        this.f4870x = parcel.readInt();
        this.f4871y = parcel.readString();
        this.f4872z = parcel.readInt() != 0;
        this.f4859A = parcel.readInt() != 0;
        this.f4860B = parcel.readInt() != 0;
        this.f4861C = parcel.readInt() != 0;
        this.f4862D = parcel.readInt();
        this.f4863E = parcel.readString();
        this.f4864F = parcel.readInt();
        this.f4865G = parcel.readInt() != 0;
    }
}
