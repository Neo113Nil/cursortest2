package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nk71;
import defpackage.qje;
import defpackage.xvz;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes7.dex */
public final class mr1 implements Parcelable {
    public static final lr1 CREATOR = new lr1();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, kr1.w)};
    public final String b;
    public final Map c;

    public mr1(int i, String str, Map map) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, nk71.b);
            throw null;
        }
        this.b = str;
        this.c = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr1)) {
            return false;
        }
        mr1 mr1Var = (mr1) obj;
        return jl40.l(this.b, mr1Var.b) && jl40.l(this.c, mr1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return xvz.j("MediationPrefetchNetwork(adapter=", this.b, ", networkData=", Extension.C_BRAKE, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c.size());
        for (Map.Entry entry : this.c.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public mr1(String str, LinkedHashMap linkedHashMap) {
        this.b = str;
        this.c = linkedHashMap;
    }
}
