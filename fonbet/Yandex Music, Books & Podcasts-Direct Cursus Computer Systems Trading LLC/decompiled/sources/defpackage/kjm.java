package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.data.audio.WarningContent;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes5.dex */
public final class kjm implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<kjm> CREATOR = new s2m(2);
    public final List a;
    public final String b;
    public final Date c;
    public final long d;
    public final CoverPath e;
    public final String f;
    public final String g;
    public final WarningContent h;
    public final Date i;
    public final boolean j;
    public final zjm k;
    public final jzb l;
    public final co6 m;

    public kjm(List list, String str, Date date, long j, CoverPath coverPath, String str2, String str3, WarningContent warningContent, Date date2, boolean z, zjm zjmVar) {
        list.getClass();
        str.getClass();
        date.getClass();
        coverPath.getClass();
        warningContent.getClass();
        this.a = list;
        this.b = str;
        this.c = date;
        this.d = j;
        this.e = coverPath;
        this.f = str2;
        this.g = str3;
        this.h = warningContent;
        this.i = date2;
        this.j = z;
        this.k = zjmVar;
        this.l = zjmVar != null ? (jzb) zjmVar.e.getValue() : null;
        this.m = new co6(coverPath, qo6.b, null);
    }

    public final jjm d() {
        Object obj;
        jjm.b.getClass();
        Iterator it = jjm.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((jjm) obj).a.equals(this.g)) {
                break;
            }
        }
        jjm jjmVar = (jjm) obj;
        return jjmVar == null ? jjm.c : jjmVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjm)) {
            return false;
        }
        kjm kjmVar = (kjm) obj;
        return Intrinsics.d(this.a, kjmVar.a) && Intrinsics.d(this.b, kjmVar.b) && Intrinsics.d(this.c, kjmVar.c) && this.d == kjmVar.d && Intrinsics.d(this.e, kjmVar.e) && Intrinsics.d(this.f, kjmVar.f) && Intrinsics.d(this.g, kjmVar.g) && this.h == kjmVar.h && Intrinsics.d(this.i, kjmVar.i) && this.j == kjmVar.j && Intrinsics.d(this.k, kjmVar.k);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + tlm.c(this.d, (this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31, 31)) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode3 = (this.h.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Date date = this.i;
        int e = k5r.e((hashCode3 + (date == null ? 0 : date.hashCode())) * 31, 31, this.j);
        zjm zjmVar = this.k;
        return e + (zjmVar != null ? zjmVar.hashCode() : 0);
    }

    public final String toString() {
        return "PreSave(artists=" + this.a + ", id=" + this.b + ", releaseDate=" + this.c + ", millisecondsUntilRelease=" + this.d + ", coverPath=" + this.e + ", title=" + this.f + ", typeRaw=" + this.g + ", warningContent=" + this.h + ", preSaveDate=" + this.i + ", isPreSaved=" + this.j + ", contentRestrictions=" + this.k + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator n = f1d.n(parcel, this.a);
        while (n.hasNext()) {
            ((ljm) n.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.b);
        parcel.writeSerializable(this.c);
        parcel.writeLong(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h.name());
        parcel.writeSerializable(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        zjm zjmVar = this.k;
        if (zjmVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            zjmVar.writeToParcel(parcel, i);
        }
    }
}
