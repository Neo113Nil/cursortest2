package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes7.dex */
public final class cs1 implements Parcelable {
    public static final Parcelable.Creator<cs1> CREATOR = new as1();
    public final bs1[] b;

    public cs1(Parcel parcel) {
        this.b = new bs1[parcel.readInt()];
        int i = 0;
        while (true) {
            bs1[] bs1VarArr = this.b;
            if (i >= bs1VarArr.length) {
                return;
            }
            bs1VarArr[i] = (bs1) parcel.readParcelable(bs1.class.getClassLoader());
            i++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cs1.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.b, ((cs1) obj).b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "entries=" + Arrays.toString(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b.length);
        for (bs1 bs1Var : this.b) {
            parcel.writeParcelable(bs1Var, 0);
        }
    }

    public cs1(List list) {
        this.b = (bs1[]) list.toArray(new bs1[0]);
    }

    public cs1(bs1... bs1VarArr) {
        this.b = bs1VarArr;
    }
}
