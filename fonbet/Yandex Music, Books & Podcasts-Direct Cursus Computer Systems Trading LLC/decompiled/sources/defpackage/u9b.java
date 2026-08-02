package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes5.dex */
public final class u9b implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<u9b> CREATOR = new vn7(20);
    public final String a;
    public final String b;
    public final String c;

    public u9b(String str, String str2, String str3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final Integer d() {
        String str = this.b;
        if (str != null) {
            return y2x.b0(str);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e(int i, WebPath$Storage webPath$Storage) {
        String str = this.a;
        CoverPath jcvVar = str.length() > 0 ? new jcv(str, webPath$Storage) : CoverPath.none();
        jcvVar.getClass();
        String pathForSize = jcvVar.getPathForSize(i);
        pathForSize.getClass();
        return pathForSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9b)) {
            return false;
        }
        u9b u9bVar = (u9b) obj;
        return Intrinsics.d(this.a, u9bVar.a) && Intrinsics.d(this.b, u9bVar.b) && Intrinsics.d(this.c, u9bVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return su4.o(f1d.m("EntityCover(uri=", this.a, ", color=", this.b, ", videoUrl="), this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
