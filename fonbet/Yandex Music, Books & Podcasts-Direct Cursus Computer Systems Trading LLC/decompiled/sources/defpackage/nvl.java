package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class nvl implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<nvl> CREATOR = new tgk(19);
    public static final Regex c = new Regex("^[^:]+:[^:]+$");
    public final String a;
    public final String b;

    public nvl(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final String d() {
        return ouj.o(this.a, StringUtils.PROCESS_POSTFIX_DELIMITER, this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nvl)) {
            return false;
        }
        nvl nvlVar = (nvl) obj;
        return Intrinsics.d(this.a, nvlVar.a) && Intrinsics.d(this.b, nvlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("PlaylistId(uid=", this.a, ", kind=", this.b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
