package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class pqa implements Comparator, Parcelable {
    public static final Parcelable.Creator<pqa> CREATOR = new vn7(14);
    public final oqa[] a;
    public int b;
    public final String c;
    public final int d;

    public pqa(Parcel parcel) {
        this.c = parcel.readString();
        oqa[] oqaVarArr = (oqa[]) parcel.createTypedArray(oqa.CREATOR);
        int i = dvt.a;
        this.a = oqaVarArr;
        this.d = oqaVarArr.length;
    }

    public final pqa a(String str) {
        return Objects.equals(this.c, str) ? this : new pqa(str, false, this.a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        oqa oqaVar = (oqa) obj;
        oqa oqaVar2 = (oqa) obj2;
        UUID uuid = un3.a;
        return uuid.equals(oqaVar.b) ? uuid.equals(oqaVar2.b) ? 0 : 1 : oqaVar.b.compareTo(oqaVar2.b);
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
        if (obj != null && pqa.class == obj.getClass()) {
            pqa pqaVar = (pqa) obj;
            if (Objects.equals(this.c, pqaVar.c) && Arrays.equals(this.a, pqaVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.b == 0) {
            String str = this.c;
            this.b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.a);
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.a, 0);
    }

    public pqa(oqa... oqaVarArr) {
        this(null, true, oqaVarArr);
    }

    public pqa(String str, boolean z, oqa... oqaVarArr) {
        this.c = str;
        oqaVarArr = z ? (oqa[]) oqaVarArr.clone() : oqaVarArr;
        this.a = oqaVarArr;
        this.d = oqaVarArr.length;
        Arrays.sort(oqaVarArr, this);
    }

    public pqa(String str, ArrayList arrayList) {
        this(str, false, (oqa[]) arrayList.toArray(new oqa[0]));
    }
}
