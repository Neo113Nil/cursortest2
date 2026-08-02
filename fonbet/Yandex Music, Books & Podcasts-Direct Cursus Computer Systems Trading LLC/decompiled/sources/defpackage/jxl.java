package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class jxl implements lxl {

    @NotNull
    public static final Parcelable.Creator<jxl> CREATOR = new tgk(25);
    public final String a;
    public final String b;
    public final String c;

    public jxl(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = ouj.o(str, StringUtils.PROCESS_POSTFIX_DELIMITER, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxl)) {
            return false;
        }
        jxl jxlVar = (jxl) obj;
        return Intrinsics.d(this.a, jxlVar.a) && Intrinsics.d(this.b, jxlVar.b);
    }

    @Override // defpackage.lxl
    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("UserIdAndKind(userId=", this.a, ", kind=", this.b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
