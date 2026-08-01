package x0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new F0.b(20);

    /* renamed from: A, reason: collision with root package name */
    public Integer f4723A;

    /* renamed from: B, reason: collision with root package name */
    public Integer f4724B;

    /* renamed from: C, reason: collision with root package name */
    public Integer f4725C;

    /* renamed from: D, reason: collision with root package name */
    public Boolean f4726D;

    /* renamed from: a, reason: collision with root package name */
    public int f4727a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f4728b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f4729c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f4730d;
    public Integer e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f4731f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f4732g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f4733h;
    public int i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public int f4734k;

    /* renamed from: l, reason: collision with root package name */
    public int f4735l;

    /* renamed from: m, reason: collision with root package name */
    public int f4736m;

    /* renamed from: n, reason: collision with root package name */
    public Locale f4737n;

    /* renamed from: o, reason: collision with root package name */
    public String f4738o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f4739p;

    /* renamed from: q, reason: collision with root package name */
    public int f4740q;

    /* renamed from: r, reason: collision with root package name */
    public int f4741r;

    /* renamed from: s, reason: collision with root package name */
    public Integer f4742s;

    /* renamed from: t, reason: collision with root package name */
    public Boolean f4743t;

    /* renamed from: u, reason: collision with root package name */
    public Integer f4744u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f4745v;

    /* renamed from: w, reason: collision with root package name */
    public Integer f4746w;

    /* renamed from: x, reason: collision with root package name */
    public Integer f4747x;

    /* renamed from: y, reason: collision with root package name */
    public Integer f4748y;

    /* renamed from: z, reason: collision with root package name */
    public Integer f4749z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4727a);
        parcel.writeSerializable(this.f4728b);
        parcel.writeSerializable(this.f4729c);
        parcel.writeSerializable(this.f4730d);
        parcel.writeSerializable(this.e);
        parcel.writeSerializable(this.f4731f);
        parcel.writeSerializable(this.f4732g);
        parcel.writeSerializable(this.f4733h);
        parcel.writeInt(this.i);
        parcel.writeString(this.j);
        parcel.writeInt(this.f4734k);
        parcel.writeInt(this.f4735l);
        parcel.writeInt(this.f4736m);
        String str = this.f4738o;
        parcel.writeString(str != null ? str.toString() : null);
        CharSequence charSequence = this.f4739p;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        parcel.writeInt(this.f4740q);
        parcel.writeSerializable(this.f4742s);
        parcel.writeSerializable(this.f4744u);
        parcel.writeSerializable(this.f4745v);
        parcel.writeSerializable(this.f4746w);
        parcel.writeSerializable(this.f4747x);
        parcel.writeSerializable(this.f4748y);
        parcel.writeSerializable(this.f4749z);
        parcel.writeSerializable(this.f4725C);
        parcel.writeSerializable(this.f4723A);
        parcel.writeSerializable(this.f4724B);
        parcel.writeSerializable(this.f4743t);
        parcel.writeSerializable(this.f4737n);
        parcel.writeSerializable(this.f4726D);
    }
}
