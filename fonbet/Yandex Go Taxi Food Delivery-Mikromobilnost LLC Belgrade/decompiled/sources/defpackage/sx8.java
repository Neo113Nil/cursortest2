package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class sx8 implements ux8 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final Set f;

    public sx8(String str, String str2, String str3, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str + "_" + list;
        List singletonList = (list == null || list.isEmpty()) ? Collections.singletonList(null) : list;
        ArrayList arrayList = new ArrayList(tcc.n(singletonList, 10));
        Iterator it = singletonList.iterator();
        while (it.hasNext()) {
            arrayList.add(v891.l(this.a, (String) it.next()));
        }
        this.f = a.N0(arrayList);
    }

    @Override // defpackage.lhx0, defpackage.mhx0
    public final Set c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx8)) {
            return false;
        }
        sx8 sx8Var = (sx8) obj;
        return jl40.l(this.a, sx8Var.a) && jl40.l(this.b, sx8Var.b) && jl40.l(this.c, sx8Var.c) && jl40.l(this.d, sx8Var.d);
    }

    @Override // defpackage.ux8, defpackage.e6v
    public final String getId() {
        return this.e;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.d;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // defpackage.ux8
    public final String k() {
        return this.a;
    }

    public final String toString() {
        return tse0.j(this.c, ", optionsNames=", Extension.C_BRAKE, b64.v("Unavailable(requirementName=", this.a, ", title=", this.b, ", bigImageUrl="), this.d);
    }
}
