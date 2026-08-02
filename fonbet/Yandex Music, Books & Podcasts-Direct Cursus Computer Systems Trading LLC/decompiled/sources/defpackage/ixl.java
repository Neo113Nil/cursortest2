package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ixl implements lxl {

    @NotNull
    public static final Parcelable.Creator<ixl> CREATOR = new tgk(24);
    public final String a;
    public final String b;
    public final String c;

    public ixl(String str, String str2) {
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
        if (!(obj instanceof ixl)) {
            return false;
        }
        ixl ixlVar = (ixl) obj;
        return Intrinsics.d(this.a, ixlVar.a) && Intrinsics.d(this.b, ixlVar.b);
    }

    @Override // defpackage.lxl
    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("SpecialPlaylist(owner=", this.a, ", type=", this.b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
