package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a291;
import defpackage.da81;
import defpackage.qd81;
import defpackage.rf71;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class nm0 implements bs1 {
    public static final Parcelable.Creator<nm0> CREATOR;
    public static final qd81 h;
    public static final qd81 i;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final byte[] f;
    public int g;

    static {
        da81 da81Var = new da81();
        da81Var.k = "application/id3";
        h = new qd81(da81Var);
        da81 da81Var2 = new da81();
        da81Var2.k = "application/x-scte35";
        i = new qd81(da81Var2);
        CREATOR = new mm0();
    }

    public nm0(Parcel parcel) {
        String readString = parcel.readString();
        int i2 = rf71.a;
        this.b = readString;
        this.c = parcel.readString();
        this.d = parcel.readLong();
        this.e = parcel.readLong();
        this.f = parcel.createByteArray();
    }

    @Override // yads.bs1
    public final qd81 a() {
        String str = this.b;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return i;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return h;
            default:
                return null;
        }
    }

    @Override // yads.bs1
    public final byte[] b() {
        if (a() != null) {
            return this.f;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nm0.class == obj.getClass()) {
            nm0 nm0Var = (nm0) obj;
            if (this.d == nm0Var.d && this.e == nm0Var.e && rf71.o(this.b, nm0Var.b) && rf71.o(this.c, nm0Var.c) && Arrays.equals(this.f, nm0Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.g == 0) {
            String str = this.b;
            int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
            String str2 = this.c;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.d;
            int i2 = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.e;
            this.g = Arrays.hashCode(this.f) + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.g;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.b + ", id=" + this.e + ", durationMs=" + this.d + ", value=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeByteArray(this.f);
    }

    public nm0(String str, String str2, long j, long j2, byte[] bArr) {
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = bArr;
    }

    @Override // yads.bs1
    public /* bridge */ /* synthetic */ void a(a291 a291Var) {
        super.a(a291Var);
    }
}
