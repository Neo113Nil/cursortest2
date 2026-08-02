package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.data.audio.Album$AlbumType;

/* loaded from: classes5.dex */
public final class dxp extends jxp {

    @NotNull
    public static final Parcelable.Creator<dxp> CREATOR = new bwp(2);
    public final String a;
    public final Album$AlbumType b;

    public dxp(String str, Album$AlbumType album$AlbumType) {
        str.getClass();
        album$AlbumType.getClass();
        this.a = str;
        this.b = album$AlbumType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxp)) {
            return false;
        }
        dxp dxpVar = (dxp) obj;
        return Intrinsics.d(this.a, dxpVar.a) && this.b == dxpVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AlbumId(albumId=" + this.a + ", type=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
    }
}
