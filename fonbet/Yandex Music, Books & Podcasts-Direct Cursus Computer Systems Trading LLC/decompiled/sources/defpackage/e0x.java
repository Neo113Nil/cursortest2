package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e0x extends l9 {
    public static final Parcelable.Creator<e0x> CREATOR = new vzw(7);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;

    public e0x(int i, boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, boolean z3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e0x)) {
            return false;
        }
        e0x e0xVar = (e0x) obj;
        return this.a == e0xVar.a && this.b == e0xVar.b && this.c == e0xVar.c && TextUtils.equals(this.d, e0xVar.d) && TextUtils.equals(this.e, e0xVar.e) && TextUtils.equals(this.f, e0xVar.f) && TextUtils.equals(this.g, e0xVar.g) && TextUtils.equals(this.h, e0xVar.h) && this.i == e0xVar.i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, Boolean.valueOf(this.i)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(2, 4, parcel);
        parcel.writeInt(this.a);
        o8g.q0(3, 4, parcel);
        parcel.writeInt(this.b ? 1 : 0);
        o8g.q0(4, 4, parcel);
        parcel.writeInt(this.c ? 1 : 0);
        o8g.j0(parcel, 5, this.d);
        o8g.j0(parcel, 6, this.e);
        o8g.j0(parcel, 7, this.f);
        o8g.j0(parcel, 8, this.g);
        o8g.j0(parcel, 9, this.h);
        o8g.q0(10, 4, parcel);
        parcel.writeInt(this.i ? 1 : 0);
        o8g.p0(parcel, o0);
    }
}
