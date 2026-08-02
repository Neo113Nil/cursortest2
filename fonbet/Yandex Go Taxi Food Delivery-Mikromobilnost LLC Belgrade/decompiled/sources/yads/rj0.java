package yads;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cha1;
import defpackage.rf71;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public final class rj0 implements Parcelable {
    public static final Parcelable.Creator<rj0> CREATOR = new qj0();
    public final String b;
    public final Uri c;
    public final String d;
    public final List e;
    public final byte[] f;
    public final String g;
    public final byte[] h;

    public rj0(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2) {
        int c = rf71.c(uri, str2);
        if (c == 0 || c == 2 || c == 1) {
            cha1.c("customCacheKey must be null for type: " + c, str3 == null);
        }
        this.b = str;
        this.c = uri;
        this.d = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.e = Collections.unmodifiableList(arrayList);
        this.f = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.g = str3;
        this.h = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : rf71.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rj0)) {
            return false;
        }
        rj0 rj0Var = (rj0) obj;
        return this.b.equals(rj0Var.b) && this.c.equals(rj0Var.c) && rf71.o(this.d, rj0Var.d) && this.e.equals(rj0Var.e) && Arrays.equals(this.f, rj0Var.f) && rf71.o(this.g, rj0Var.g) && Arrays.equals(this.h, rj0Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 961)) * 31;
        String str = this.d;
        int hashCode2 = (Arrays.hashCode(this.f) + ((this.e.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.g;
        return Arrays.hashCode(this.h) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.d + ":" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c.toString());
        parcel.writeString(this.d);
        parcel.writeInt(this.e.size());
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            parcel.writeParcelable((Parcelable) this.e.get(i2), 0);
        }
        parcel.writeByteArray(this.f);
        parcel.writeString(this.g);
        parcel.writeByteArray(this.h);
    }

    public rj0(Parcel parcel) {
        String readString = parcel.readString();
        int i = rf71.a;
        this.b = readString;
        this.c = Uri.parse(parcel.readString());
        this.d = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add((y13) parcel.readParcelable(y13.class.getClassLoader()));
        }
        this.e = Collections.unmodifiableList(arrayList);
        this.f = parcel.createByteArray();
        this.g = parcel.readString();
        this.h = parcel.createByteArray();
    }
}
