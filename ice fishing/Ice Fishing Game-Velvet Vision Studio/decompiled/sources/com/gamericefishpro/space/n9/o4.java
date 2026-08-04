package com.gamericefishpro.space.n9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o4 extends com.gamericefishpro.space.w8.a {
    public static final Parcelable.Creator<o4> CREATOR = new com.gamericefishpro.space.h.a(13);
    public final int d;
    public final String e;
    public final long i;
    public final Long v;
    public final String w;
    public final String y;
    public final Double z;

    public o4(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.d = i;
        this.e = str;
        this.i = j;
        this.v = l;
        this.z = i == 1 ? f != null ? Double.valueOf(f.doubleValue()) : null : d;
        this.w = str2;
        this.y = str3;
    }

    public final Object b() {
        Long l = this.v;
        if (l != null) {
            return l;
        }
        Double d = this.z;
        if (d != null) {
            return d;
        }
        String str = this.w;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        com.gamericefishpro.space.h.a.b(this, parcel);
    }

    public o4(long j, Object obj, String str, String str2) {
        com.gamericefishpro.space.v8.c0.d(str);
        this.d = 2;
        this.e = str;
        this.i = j;
        this.y = str2;
        if (obj == null) {
            this.v = null;
            this.z = null;
            this.w = null;
            return;
        }
        if (obj instanceof Long) {
            this.v = (Long) obj;
            this.z = null;
            this.w = null;
        } else if (obj instanceof String) {
            this.v = null;
            this.z = null;
            this.w = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.v = null;
                this.z = (Double) obj;
                this.w = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public o4(p4 p4Var) {
        this(p4Var.d, p4Var.e, p4Var.c, p4Var.b);
    }
}
