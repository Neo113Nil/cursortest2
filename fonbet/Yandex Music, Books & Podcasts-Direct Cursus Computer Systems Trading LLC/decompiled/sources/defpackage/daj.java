package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class daj {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public daj(String str, String str2, String str3, String str4, ArrayList arrayList) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof daj)) {
            return false;
        }
        daj dajVar = (daj) obj;
        return Intrinsics.d(this.a, dajVar.a) && Intrinsics.d(this.b, dajVar.b) && Intrinsics.d(this.c, dajVar.c) && Intrinsics.d(this.d, dajVar.d) && Intrinsics.d(this.e, dajVar.e);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.e;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("NonMusicBannerEntity(id=", this.a, ", text=", this.b, ", buttonText=");
        su4.v(m, this.c, ", deeplink=", this.d, ", covers=");
        return vz1.u(m, this.e, ")");
    }
}
