package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class bfk extends Throwable implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<bfk> CREATOR = new pgj(16);
    public final zek a;
    public final afk b;
    public final Integer c;
    public final String d;
    public final String e;
    public final yek f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfk(zek zekVar, afk afkVar, Integer num, String str, String str2, yek yekVar) {
        super(str2);
        zekVar.getClass();
        afkVar.getClass();
        str2.getClass();
        this.a = zekVar;
        this.b = afkVar;
        this.c = num;
        this.d = str;
        this.e = str2;
        this.f = yekVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfk)) {
            return false;
        }
        bfk bfkVar = (bfk) obj;
        return this.a == bfkVar.a && this.b == bfkVar.b && Intrinsics.d(this.c, bfkVar.c) && Intrinsics.d(this.d, bfkVar.d) && Intrinsics.d(this.e, bfkVar.e) && this.f == bfkVar.f;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        int c = k5r.c((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        yek yekVar = this.f;
        return c + (yekVar != null ? yekVar.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "<PaymentKit Error> kind: " + this.a + ", trigger: " + this.b + ", code: " + this.c + ", status: " + this.d + ", message: " + this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
        parcel.writeString(this.b.name());
        Integer num = this.c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            k.v(parcel, 1, num);
        }
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        yek yekVar = this.f;
        if (yekVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(yekVar.name());
        }
    }
}
