package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ihb extends jhb {
    public final String d;
    public final String e;
    public final List f;
    public final c5b g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihb(String str, String str2) {
        super(str2);
        str2.getClass();
        this.d = str;
        this.e = str2;
        this.f = t75.c(str);
        this.g = c5b.a;
    }

    @Override // defpackage.jhb
    public final Object a(h4b h4bVar) {
        xxt xxtVar = (xxt) ((g06) h4bVar.a).a;
        String str = this.d;
        Object obj = xxtVar.get(str);
        if (obj != null) {
            return obj;
        }
        throw new b6i(str);
    }

    @Override // defpackage.jhb
    public final List b() {
        return this.g;
    }

    @Override // defpackage.jhb
    public final List c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihb)) {
            return false;
        }
        ihb ihbVar = (ihb) obj;
        return Intrinsics.d(this.d, ihbVar.d) && Intrinsics.d(this.e, ihbVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return this.d;
    }
}
