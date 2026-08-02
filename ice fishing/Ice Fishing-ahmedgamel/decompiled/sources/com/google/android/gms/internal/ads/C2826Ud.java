package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.Ud, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2826Ud extends S2.a {
    public static final Parcelable.Creator<C2826Ud> CREATOR = new V8(8);

    /* renamed from: n, reason: collision with root package name */
    public final int f28739n;

    /* renamed from: u, reason: collision with root package name */
    public final int f28740u;

    /* renamed from: v, reason: collision with root package name */
    public final int f28741v;

    public C2826Ud(int i, int i4, int i6) {
        this.f28739n = i;
        this.f28740u = i4;
        this.f28741v = i6;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C2826Ud)) {
            C2826Ud c2826Ud = (C2826Ud) obj;
            if (c2826Ud.f28741v == this.f28741v && c2826Ud.f28740u == this.f28740u && c2826Ud.f28739n == this.f28739n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f28739n, this.f28740u, this.f28741v});
    }

    public final String toString() {
        int i = this.f28739n;
        int length = String.valueOf(i).length();
        int i4 = this.f28740u;
        int length2 = String.valueOf(i4).length();
        int i6 = this.f28741v;
        StringBuilder sb = new StringBuilder(length + 1 + length2 + 1 + String.valueOf(i6).length());
        sb.append(i);
        sb.append(com.anythink.core.common.d.j.f13164z);
        sb.append(i4);
        sb.append(com.anythink.core.common.d.j.f13164z);
        sb.append(i6);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 1, 4);
        parcel.writeInt(this.f28739n);
        com.bumptech.glide.e.w(parcel, 2, 4);
        parcel.writeInt(this.f28740u);
        com.bumptech.glide.e.w(parcel, 3, 4);
        parcel.writeInt(this.f28741v);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
