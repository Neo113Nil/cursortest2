package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class eul implements aab, Parcelable {

    @NotNull
    public static final Parcelable.Creator<eul> CREATOR = new tgk(17);
    public final String a;
    public final String b;
    public final String c;
    public final u9b d;
    public final String e;
    public final String f;
    public final boolean g;

    public eul(String str, String str2, String str3, u9b u9bVar, String str4) {
        dfi.s(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = u9bVar;
        this.e = str4;
        this.f = ouj.o(str, StringUtils.PROCESS_POSTFIX_DELIMITER, str2);
        this.g = "3".equals(str2);
    }

    public final nvl d() {
        return new nvl(this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eul)) {
            return false;
        }
        eul eulVar = (eul) obj;
        return Intrinsics.d(this.a, eulVar.a) && Intrinsics.d(this.b, eulVar.b) && Intrinsics.d(this.c, eulVar.c) && Intrinsics.d(this.d, eulVar.d) && Intrinsics.d(this.e, eulVar.e);
    }

    @Override // defpackage.aab
    public final String getId() {
        return this.f;
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        u9b u9bVar = this.d;
        int hashCode = (c + (u9bVar == null ? 0 : u9bVar.hashCode())) * 31;
        String str = this.e;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("PlaylistDomainItem(uid=", this.a, ", kind=", this.b, ", title=");
        m.append(this.c);
        m.append(", cover=");
        m.append(this.d);
        m.append(", uuid=");
        return su4.o(m, this.e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        u9b u9bVar = this.d;
        if (u9bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            u9bVar.writeToParcel(parcel, i);
        }
        parcel.writeString(this.e);
    }
}
