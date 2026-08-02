package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class xwh implements Parcelable {

    @Deprecated
    @NotNull
    public static final Parcelable.Creator<xwh> CREATOR = new mmh(8);
    public final String a;
    public final Map b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xwh(String str) {
        this(str, r0);
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwh)) {
            return false;
        }
        xwh xwhVar = (xwh) obj;
        return Intrinsics.d(this.a, xwhVar.a) && Intrinsics.d(this.b, xwhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(key=");
        sb.append(this.a);
        sb.append(", extras=");
        return k5r.p(sb, this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Map map = this.b;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public xwh(String str, Map map) {
        this.a = str;
        this.b = map;
    }
}
