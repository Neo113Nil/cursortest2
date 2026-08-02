package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.data.audio.Album$AlbumType;

/* loaded from: classes5.dex */
public final class k10 implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<k10> CREATOR = new l(17);
    public static final k10 i;
    private static final long serialVersionUID = 1;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final boolean g;
    public final String h;

    static {
        oq oqVar = oq.J;
        i = new k10(oqVar.a, Album$AlbumType.COMMON.a, CommonUrlParts.Values.FALSE_INTEGER, oqVar.b, 0, 1, false, 192);
    }

    public /* synthetic */ k10(String str, String str2, String str3, String str4, int i2, int i3, boolean z, int i4) {
        this(str, str2, str3, str4, (i4 & 16) != 0 ? 1 : i2, (i4 & 32) != 0 ? 1 : i3, (i4 & 64) != 0 ? false : z, ouj.o(str3, StringUtils.PROCESS_POSTFIX_DELIMITER, str));
    }

    public final Album$AlbumType d() {
        Album$AlbumType.b.getClass();
        return o6c.e(this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k10.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        k10 k10Var = (k10) obj;
        return Intrinsics.d(this.a, k10Var.a) && Intrinsics.d(this.c, k10Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("AlbumTrack(albumId=", this.a, ", albumTypeRaw=", this.b, ", trackId=");
        su4.v(m, this.c, ", albumTitle=", this.d, ", position=");
        hrg.w(this.e, this.f, ", volume=", ", bestTrack=", m);
        m.append(this.g);
        m.append(", id=");
        m.append(this.h);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeString(this.h);
    }

    public k10(String str, String str2, String str3, String str4, int i2, int i3, boolean z, String str5) {
        eta.r(str, str3, str4, str5);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i2;
        this.f = i3;
        this.g = z;
        this.h = str5;
    }
}
