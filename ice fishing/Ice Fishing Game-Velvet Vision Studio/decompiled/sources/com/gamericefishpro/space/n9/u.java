package com.gamericefishpro.space.n9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends com.gamericefishpro.space.w8.a {
    public static final Parcelable.Creator<u> CREATOR = new com.gamericefishpro.space.h.a(8);
    public final String d;
    public final t e;
    public final String i;
    public final long v;

    public u(u uVar, long j) {
        com.gamericefishpro.space.v8.c0.g(uVar);
        this.d = uVar.d;
        this.e = uVar.e;
        this.i = uVar.i;
        this.v = j;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.e);
        String str = this.i;
        int length = String.valueOf(str).length();
        String str2 = this.d;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        return com.gamericefishpro.space.t0.y0.j(sb, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        com.gamericefishpro.space.h.a.a(this, parcel, i);
    }

    public u(String str, t tVar, String str2, long j) {
        this.d = str;
        this.e = tVar;
        this.i = str2;
        this.v = j;
    }
}
