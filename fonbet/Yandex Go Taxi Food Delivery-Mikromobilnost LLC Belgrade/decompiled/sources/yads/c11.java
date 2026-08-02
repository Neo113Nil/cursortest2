package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a291;
import defpackage.b64;
import defpackage.oyr;
import defpackage.qd81;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class c11 implements bs1 {
    public static final Parcelable.Creator<c11> CREATOR = new b11();
    public final byte[] b;
    public final String c;
    public final String d;

    public c11(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.b = createByteArray;
        this.c = parcel.readString();
        this.d = parcel.readString();
    }

    @Override // yads.bs1
    public final void a(a291 a291Var) {
        String str = this.c;
        if (str != null) {
            a291Var.a = str;
        }
    }

    @Override // yads.bs1
    public /* bridge */ /* synthetic */ byte[] b() {
        return super.b();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c11.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.b, ((c11) obj).b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        return oyr.m(this.b.length, "\"", b64.v("ICY: title=\"", this.c, "\", url=\"", this.d, "\", rawMetadata.length=\""));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    @Override // yads.bs1
    public /* bridge */ /* synthetic */ qd81 a() {
        return super.a();
    }

    public c11(byte[] bArr, String str, String str2) {
        this.b = bArr;
        this.c = str;
        this.d = str2;
    }
}
