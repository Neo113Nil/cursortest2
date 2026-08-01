package Z;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.EnumC0097n;

/* loaded from: classes.dex */
public final class S implements Parcelable {
    public static final Parcelable.Creator<S> CREATOR = new F0.b(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f1472a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1473b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1474c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1475d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1476f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1477g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1478h;
    public final boolean i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1479k;

    /* renamed from: l, reason: collision with root package name */
    public final String f1480l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1481m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1482n;

    public S(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
        this.f1472a = abstractComponentCallbacksC0070s.getClass().getName();
        this.f1473b = abstractComponentCallbacksC0070s.e;
        this.f1474c = abstractComponentCallbacksC0070s.f1609n;
        this.f1475d = abstractComponentCallbacksC0070s.f1618w;
        this.e = abstractComponentCallbacksC0070s.f1619x;
        this.f1476f = abstractComponentCallbacksC0070s.f1620y;
        this.f1477g = abstractComponentCallbacksC0070s.f1580B;
        this.f1478h = abstractComponentCallbacksC0070s.f1607l;
        this.i = abstractComponentCallbacksC0070s.f1579A;
        this.j = abstractComponentCallbacksC0070s.f1621z;
        this.f1479k = abstractComponentCallbacksC0070s.f1591N.ordinal();
        this.f1480l = abstractComponentCallbacksC0070s.f1605h;
        this.f1481m = abstractComponentCallbacksC0070s.i;
        this.f1482n = abstractComponentCallbacksC0070s.f1586H;
    }

    public final AbstractComponentCallbacksC0070s a(F f2) {
        AbstractComponentCallbacksC0070s a2 = f2.a(this.f1472a);
        a2.e = this.f1473b;
        a2.f1609n = this.f1474c;
        a2.f1611p = true;
        a2.f1618w = this.f1475d;
        a2.f1619x = this.e;
        a2.f1620y = this.f1476f;
        a2.f1580B = this.f1477g;
        a2.f1607l = this.f1478h;
        a2.f1579A = this.i;
        a2.f1621z = this.j;
        a2.f1591N = EnumC0097n.values()[this.f1479k];
        a2.f1605h = this.f1480l;
        a2.i = this.f1481m;
        a2.f1586H = this.f1482n;
        return a2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1472a);
        sb.append(" (");
        sb.append(this.f1473b);
        sb.append(")}:");
        if (this.f1474c) {
            sb.append(" fromLayout");
        }
        int i = this.e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f1476f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f1477g) {
            sb.append(" retainInstance");
        }
        if (this.f1478h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.j) {
            sb.append(" hidden");
        }
        String str2 = this.f1480l;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f1481m);
        }
        if (this.f1482n) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1472a);
        parcel.writeString(this.f1473b);
        parcel.writeInt(this.f1474c ? 1 : 0);
        parcel.writeInt(this.f1475d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f1476f);
        parcel.writeInt(this.f1477g ? 1 : 0);
        parcel.writeInt(this.f1478h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.f1479k);
        parcel.writeString(this.f1480l);
        parcel.writeInt(this.f1481m);
        parcel.writeInt(this.f1482n ? 1 : 0);
    }

    public S(Parcel parcel) {
        this.f1472a = parcel.readString();
        this.f1473b = parcel.readString();
        this.f1474c = parcel.readInt() != 0;
        this.f1475d = parcel.readInt();
        this.e = parcel.readInt();
        this.f1476f = parcel.readString();
        this.f1477g = parcel.readInt() != 0;
        this.f1478h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.f1479k = parcel.readInt();
        this.f1480l = parcel.readString();
        this.f1481m = parcel.readInt();
        this.f1482n = parcel.readInt() != 0;
    }
}
