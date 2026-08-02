package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class uhj0 implements kij0, e6v, mhx0 {
    public final String a;
    public final String b;
    public final List c;
    public final LinkedHashSet d;

    public uhj0(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ycc.r(((ux8) it.next()).c(), linkedHashSet);
        }
        this.d = linkedHashSet;
    }

    @Override // defpackage.mhx0
    public final Set c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uhj0)) {
            return false;
        }
        uhj0 uhj0Var = (uhj0) obj;
        return jl40.l(this.a, uhj0Var.a) && jl40.l(this.b, uhj0Var.b) && this.c.equals(uhj0Var.c);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ly3.s(b64.v("Carousel(tariffClass=", this.a, ", groupName=", this.b, ", requirements="), this.c, Extension.C_BRAKE);
    }
}
