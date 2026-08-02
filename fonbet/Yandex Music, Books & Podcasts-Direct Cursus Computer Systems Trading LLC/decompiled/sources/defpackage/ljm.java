package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes5.dex */
public final class ljm implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ljm> CREATOR = new s2m(3);
    public final String a;
    public final String b;
    public final CoverPath c;

    public ljm(String str, String str2, CoverPath coverPath) {
        str.getClass();
        str2.getClass();
        coverPath.getClass();
        this.a = str;
        this.b = str2;
        this.c = coverPath;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljm)) {
            return false;
        }
        ljm ljmVar = (ljm) obj;
        return Intrinsics.d(this.a, ljmVar.a) && Intrinsics.d(this.b, ljmVar.b) && Intrinsics.d(this.c, ljmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder m = f1d.m("PreSaveArtist(id=", this.a, ", name=", this.b, ", coverPath=");
        m.append(this.c);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
