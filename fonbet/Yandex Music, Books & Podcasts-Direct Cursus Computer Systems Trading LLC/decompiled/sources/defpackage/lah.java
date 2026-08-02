package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class lah {
    public final String a;
    public final Map b;
    public final Map c;
    public final String d;

    public lah(String str, Map map, Map map2, String str2) {
        this.a = str;
        this.b = map;
        this.c = map2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!lah.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        lah lahVar = (lah) obj;
        return Intrinsics.d(this.a, lahVar.a) && Intrinsics.d(this.b, lahVar.b) && Intrinsics.d(this.c, lahVar.c) && this.d.equals(lahVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((((this.c.hashCode() + f1d.b(this.b, this.a.hashCode() * 31, 31)) * 31) + 1816680781) * 31);
    }

    public final String toString() {
        return "MapiPostRequest(urlPath='" + this.a + "', headers=" + this.b + ", query=" + this.c + ", contentType='application/json;charset=UTF-8', body='" + this.d + "')";
    }
}
