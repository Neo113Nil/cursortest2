package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class pfk extends rfk {

    @NotNull
    public static final Parcelable.Creator<pfk> CREATOR = new pgj(28);
    public final String a;
    public final boolean b;
    public final u7w c;
    public final c5c d;
    public final String e;
    public final List f;
    public final String g;

    public pfk(String str, boolean z, u7w u7wVar, c5c c5cVar, String str2, List list, String str3) {
        str.getClass();
        u7wVar.getClass();
        list.getClass();
        this.a = str;
        this.b = z;
        this.c = u7wVar;
        this.d = c5cVar;
        this.e = str2;
        this.f = list;
        this.g = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        this.c.writeToParcel(parcel, i);
        c5c c5cVar = this.d;
        if (c5cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            c5cVar.writeToParcel(parcel, i);
        }
        parcel.writeString(this.e);
        parcel.writeStringList(this.f);
        parcel.writeString(this.g);
    }
}
