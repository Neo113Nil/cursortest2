package defpackage;

import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ecc {
    public final String a;
    public final String b;
    public final Set c;

    public ecc(String str, String str2, HashSet hashSet) {
        this.a = str;
        this.b = str2;
        this.c = hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ecc)) {
            return false;
        }
        ecc eccVar = (ecc) obj;
        return this.a.equals(eccVar.a) && this.b.equals(eccVar.b) && Intrinsics.d(this.c, eccVar.c);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        Set set = this.c;
        return c + (set == null ? 0 : set.hashCode());
    }

    public final String toString() {
        StringBuilder m = f1d.m("FilterData(id=", this.a, ", name=", this.b, ", trackIdList=");
        m.append(this.c);
        m.append(")");
        return m.toString();
    }
}
