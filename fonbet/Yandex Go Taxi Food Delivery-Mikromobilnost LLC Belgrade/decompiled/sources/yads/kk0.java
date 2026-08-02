package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.rf71;
import defpackage.sm81;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* loaded from: classes7.dex */
public final class kk0 implements Comparator, Parcelable {
    public static final Parcelable.Creator<kk0> CREATOR = new hk0();
    public final jk0[] b;
    public int c;
    public final String d;
    public final int e;

    public kk0(Parcel parcel) {
        this.d = parcel.readString();
        jk0[] jk0VarArr = (jk0[]) parcel.createTypedArray(jk0.CREATOR);
        int i = rf71.a;
        this.b = jk0VarArr;
        this.e = jk0VarArr.length;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        jk0 jk0Var = (jk0) obj;
        jk0 jk0Var2 = (jk0) obj2;
        UUID uuid = sm81.a;
        return uuid.equals(jk0Var.c) ? uuid.equals(jk0Var2.c) ? 0 : 1 : jk0Var.c.compareTo(jk0Var2.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kk0.class == obj.getClass()) {
            kk0 kk0Var = (kk0) obj;
            if (rf71.o(this.d, kk0Var.d) && Arrays.equals(this.b, kk0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.c == 0) {
            String str = this.d;
            this.c = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.b);
        }
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
        parcel.writeTypedArray(this.b, 0);
    }

    public kk0(String str, boolean z, jk0... jk0VarArr) {
        this.d = str;
        jk0VarArr = z ? (jk0[]) jk0VarArr.clone() : jk0VarArr;
        this.b = jk0VarArr;
        this.e = jk0VarArr.length;
        Arrays.sort(jk0VarArr, this);
    }
}
