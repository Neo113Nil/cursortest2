package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hxl implements lxl {

    @NotNull
    public static final Parcelable.Creator<hxl> CREATOR = new tgk(23);
    public final String a;
    public final String b;
    public final String c;

    public hxl(String str, String str2) {
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
        if (!(obj instanceof hxl)) {
            return false;
        }
        hxl hxlVar = (hxl) obj;
        return Intrinsics.d(this.a, hxlVar.a) && Intrinsics.d(this.b, hxlVar.b);
    }

    @Override // defpackage.lxl
    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("LoginAndKind(login=", this.a, ", kind=", this.b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
