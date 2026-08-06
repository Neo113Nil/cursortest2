package p0;

import a.AbstractC0083a;
import android.os.Parcel;
import android.os.Parcelable;
import q0.AbstractC1035a;

/* renamed from: p0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1009f extends AbstractC1035a {
    public static final Parcelable.Creator<C1009f> CREATOR = new C.l(15);

    /* renamed from: a, reason: collision with root package name */
    public final int f8365a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8366b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8367c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8368d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8369e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8370f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8371g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8372h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8373i;

    public C1009f(int i2, int i3, int i4, long j2, long j3, String str, String str2, int i5, int i6) {
        this.f8365a = i2;
        this.f8366b = i3;
        this.f8367c = i4;
        this.f8368d = j2;
        this.f8369e = j3;
        this.f8370f = str;
        this.f8371g = str2;
        this.f8372h = i5;
        this.f8373i = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int y2 = AbstractC0083a.y(parcel, 20293);
        AbstractC0083a.A(parcel, 1, 4);
        parcel.writeInt(this.f8365a);
        AbstractC0083a.A(parcel, 2, 4);
        parcel.writeInt(this.f8366b);
        AbstractC0083a.A(parcel, 3, 4);
        parcel.writeInt(this.f8367c);
        AbstractC0083a.A(parcel, 4, 8);
        parcel.writeLong(this.f8368d);
        AbstractC0083a.A(parcel, 5, 8);
        parcel.writeLong(this.f8369e);
        AbstractC0083a.v(parcel, 6, this.f8370f);
        AbstractC0083a.v(parcel, 7, this.f8371g);
        AbstractC0083a.A(parcel, 8, 4);
        parcel.writeInt(this.f8372h);
        AbstractC0083a.A(parcel, 9, 4);
        parcel.writeInt(this.f8373i);
        AbstractC0083a.z(parcel, y2);
    }
}
