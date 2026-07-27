package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.Ud, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2804Ud extends Q2.a {
    public static final Parcelable.Creator<C2804Ud> CREATOR = new V8(8);

    /* renamed from: n, reason: collision with root package name */
    public final int f27941n;

    /* renamed from: u, reason: collision with root package name */
    public final int f27942u;

    /* renamed from: v, reason: collision with root package name */
    public final int f27943v;

    public C2804Ud(int i, int i6, int i9) {
        this.f27941n = i;
        this.f27942u = i6;
        this.f27943v = i9;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C2804Ud)) {
            C2804Ud c2804Ud = (C2804Ud) obj;
            if (c2804Ud.f27943v == this.f27943v && c2804Ud.f27942u == this.f27942u && c2804Ud.f27941n == this.f27941n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f27941n, this.f27942u, this.f27943v});
    }

    public final String toString() {
        int i = this.f27941n;
        int length = String.valueOf(i).length();
        int i6 = this.f27942u;
        int length2 = String.valueOf(i6).length();
        int i9 = this.f27943v;
        StringBuilder sb = new StringBuilder(length + 1 + length2 + 1 + String.valueOf(i9).length());
        sb.append(i);
        sb.append(com.anythink.core.common.d.j.f12378z);
        sb.append(i6);
        sb.append(com.anythink.core.common.d.j.f12378z);
        sb.append(i9);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 1, 4);
        parcel.writeInt(this.f27941n);
        A8.b.F(parcel, 2, 4);
        parcel.writeInt(this.f27942u);
        A8.b.F(parcel, 3, 4);
        parcel.writeInt(this.f27943v);
        A8.b.I(parcel, G7);
    }
}
