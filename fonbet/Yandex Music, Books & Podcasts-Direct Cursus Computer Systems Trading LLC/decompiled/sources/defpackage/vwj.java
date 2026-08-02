package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class vwj extends wwj {

    @NotNull
    public static final Parcelable.Creator<vwj> CREATOR = new pgj(2);
    public final String a;
    public final BigDecimal b;
    public final String c;
    public final String d;

    public vwj(String str, BigDecimal bigDecimal, String str2, String str3) {
        str.getClass();
        this.a = str;
        this.b = bigDecimal;
        this.c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwj)) {
            return false;
        }
        vwj vwjVar = (vwj) obj;
        return Intrinsics.d(this.a, vwjVar.a) && Intrinsics.d(this.b, vwjVar.b) && Intrinsics.d(this.c, vwjVar.c) && Intrinsics.d(this.d, vwjVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        BigDecimal bigDecimal = this.b;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Strict(currency=");
        sb.append(this.a);
        sb.append(", amount=");
        sb.append(this.b);
        sb.append(", priceStatus=");
        return ouj.q(sb, this.c, ", label=", this.d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeSerializable(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
