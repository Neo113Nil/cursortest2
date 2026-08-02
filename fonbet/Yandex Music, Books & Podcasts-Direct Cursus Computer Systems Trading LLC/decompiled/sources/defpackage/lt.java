package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.data.audio.Album$AlbumType;
import ru.yandex.music.data.audio.WarningContent;

/* loaded from: classes5.dex */
public final class lt implements aab, Parcelable {

    @NotNull
    public static final Parcelable.Creator<lt> CREATOR = new l(12);
    public final String a;
    public final Album$AlbumType b;
    public final String c;
    public final WarningContent d;
    public final u9b e;
    public final gd6 f;
    public final jzb g;

    public lt(String str, Album$AlbumType album$AlbumType, String str2, WarningContent warningContent, u9b u9bVar, gd6 gd6Var) {
        str.getClass();
        album$AlbumType.getClass();
        str2.getClass();
        warningContent.getClass();
        this.a = str;
        this.b = album$AlbumType;
        this.c = str2;
        this.d = warningContent;
        this.e = u9bVar;
        this.f = gd6Var;
        this.g = gd6Var != null ? saf.o0(gd6Var) : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt)) {
            return false;
        }
        lt ltVar = (lt) obj;
        return Intrinsics.d(this.a, ltVar.a) && this.b == ltVar.b && Intrinsics.d(this.c, ltVar.c) && this.d == ltVar.d && Intrinsics.d(this.e, ltVar.e) && Intrinsics.d(this.f, ltVar.f);
    }

    @Override // defpackage.aab
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + k5r.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31;
        u9b u9bVar = this.e;
        int hashCode2 = (hashCode + (u9bVar == null ? 0 : u9bVar.hashCode())) * 31;
        gd6 gd6Var = this.f;
        return hashCode2 + (gd6Var != null ? gd6Var.hashCode() : 0);
    }

    public final String toString() {
        return "AlbumDomainItem(id=" + this.a + ", albumType=" + this.b + ", title=" + this.c + ", warningContent=" + this.d + ", cover=" + this.e + ", contentRestrictions=" + this.f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
        parcel.writeString(this.c);
        parcel.writeString(this.d.name());
        u9b u9bVar = this.e;
        if (u9bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            u9bVar.writeToParcel(parcel, i);
        }
        gd6 gd6Var = this.f;
        if (gd6Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gd6Var.writeToParcel(parcel, i);
        }
    }
}
