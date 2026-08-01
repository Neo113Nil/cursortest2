package v2;

import android.os.Parcel;
import android.os.Parcelable;
import h3.C4566c;

/* renamed from: v2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5110a extends Q2.a {
    public static final Parcelable.Creator<C5110a> CREATOR = new C4566c(15);

    /* renamed from: n, reason: collision with root package name */
    public final String f41391n;

    /* renamed from: u, reason: collision with root package name */
    public final int f41392u;

    /* renamed from: v, reason: collision with root package name */
    public final int f41393v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f41394w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f41395x;

    public C5110a(String str, int i, int i6, boolean z3, boolean z6) {
        this.f41391n = str;
        this.f41392u = i;
        this.f41393v = i6;
        this.f41394w = z3;
        this.f41395x = z6;
    }

    public static C5110a a() {
        return new C5110a(12451000, 12451000, true, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.z(parcel, 2, this.f41391n);
        A8.b.F(parcel, 3, 4);
        parcel.writeInt(this.f41392u);
        A8.b.F(parcel, 4, 4);
        parcel.writeInt(this.f41393v);
        A8.b.F(parcel, 5, 4);
        parcel.writeInt(this.f41394w ? 1 : 0);
        A8.b.F(parcel, 6, 4);
        parcel.writeInt(this.f41395x ? 1 : 0);
        A8.b.I(parcel, G7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5110a(int i, int i6, boolean z3, boolean z6) {
        this(u1.h.g(r1, com.anythink.core.common.d.j.f12378z, r0), i, i6, z3, z6);
        String str;
        if (z3) {
            str = "0";
        } else {
            str = "1";
        }
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + length + 13 + 2);
        u1.h.h(sb, "afma-sdk-a-v", i, com.anythink.core.common.d.j.f12378z, i6);
    }
}
