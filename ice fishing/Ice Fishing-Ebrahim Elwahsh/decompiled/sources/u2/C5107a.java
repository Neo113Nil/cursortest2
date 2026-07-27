package u2;

import android.os.Parcel;
import android.os.Parcelable;
import f3.C4509h;
import t0.AbstractC5051n;

/* renamed from: u2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5107a extends P2.a {
    public static final Parcelable.Creator<C5107a> CREATOR = new C4509h(13);

    /* renamed from: n, reason: collision with root package name */
    public final String f41217n;

    /* renamed from: u, reason: collision with root package name */
    public final int f41218u;

    /* renamed from: v, reason: collision with root package name */
    public final int f41219v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f41220w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f41221x;

    public C5107a(String str, int i, int i4, boolean z8, boolean z9) {
        this.f41217n = str;
        this.f41218u = i;
        this.f41219v = i4;
        this.f41220w = z8;
        this.f41221x = z9;
    }

    public static C5107a a() {
        return new C5107a(12451000, 12451000, true, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.u(parcel, 2, this.f41217n);
        S0.f.A(parcel, 3, 4);
        parcel.writeInt(this.f41218u);
        S0.f.A(parcel, 4, 4);
        parcel.writeInt(this.f41219v);
        S0.f.A(parcel, 5, 4);
        parcel.writeInt(this.f41220w ? 1 : 0);
        S0.f.A(parcel, 6, 4);
        parcel.writeInt(this.f41221x ? 1 : 0);
        S0.f.C(parcel, B8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5107a(int i, int i4, boolean z8, boolean z9) {
        this(AbstractC5051n.g(r1, com.anythink.core.common.d.j.f12535z, r0), i, i4, z8, z9);
        String str;
        if (z8) {
            str = "0";
        } else {
            str = "1";
        }
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + length + 13 + 2);
        AbstractC5051n.i(sb, "afma-sdk-a-v", i, com.anythink.core.common.d.j.f12535z, i4);
    }
}
