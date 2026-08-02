package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zsu {
    public final String a;
    public final String b;
    public final jcv c;
    public final jcv d;
    public final String e;
    public final List f;
    public final rnu g;

    public zsu(String str, String str2, jcv jcvVar, jcv jcvVar2, String str3, List list, rnu rnuVar) {
        this.a = str;
        this.b = str2;
        this.c = jcvVar;
        this.d = jcvVar2;
        this.e = str3;
        this.f = list;
        this.g = rnuVar;
    }

    public static zsu a(zsu zsuVar, jcv jcvVar) {
        String str = zsuVar.a;
        String str2 = zsuVar.b;
        jcv jcvVar2 = zsuVar.d;
        String str3 = zsuVar.e;
        List list = zsuVar.f;
        rnu rnuVar = zsuVar.g;
        zsuVar.getClass();
        return new zsu(str, str2, jcvVar, jcvVar2, str3, list, rnuVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsu)) {
            return false;
        }
        zsu zsuVar = (zsu) obj;
        return this.a.equals(zsuVar.a) && Intrinsics.d(this.b, zsuVar.b) && Intrinsics.d(this.c, zsuVar.c) && Intrinsics.d(this.d, zsuVar.d) && this.e.equals(zsuVar.e) && this.f.equals(zsuVar.f) && this.g.equals(zsuVar.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        jcv jcvVar = this.c;
        int hashCode3 = (hashCode2 + (jcvVar == null ? 0 : jcvVar.hashCode())) * 31;
        jcv jcvVar2 = this.d;
        return this.g.hashCode() + k5r.d(k5r.c((hashCode3 + (jcvVar2 != null ? jcvVar2.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder m = f1d.m("WaveItem(title=", this.a, ", header=", this.b, ", backgroundImageWebPath=");
        m.append(this.c);
        m.append(", compactImageWebPath=");
        m.append(this.d);
        m.append(", stationId=");
        m.append(this.e);
        m.append(", seeds=");
        m.append(this.f);
        m.append(", colors=");
        m.append(this.g);
        m.append(")");
        return m.toString();
    }
}
