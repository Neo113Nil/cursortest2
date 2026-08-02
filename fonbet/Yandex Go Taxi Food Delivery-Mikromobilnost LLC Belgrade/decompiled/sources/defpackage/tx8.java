package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class tx8 implements ux8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final String h;
    public final Set i;

    public tx8(String str, String str2, String str3, String str4, String str5, String str6, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = list;
        this.h = str + "_" + list;
        List singletonList = (list == null || list.isEmpty()) ? Collections.singletonList(null) : list;
        ArrayList arrayList = new ArrayList(tcc.n(singletonList, 10));
        Iterator it = singletonList.iterator();
        while (it.hasNext()) {
            arrayList.add(v891.l(this.a, (String) it.next()));
        }
        this.i = a.N0(arrayList);
    }

    @Override // defpackage.lhx0, defpackage.mhx0
    public final Set c() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx8)) {
            return false;
        }
        tx8 tx8Var = (tx8) obj;
        return jl40.l(this.a, tx8Var.a) && jl40.l(this.b, tx8Var.b) && jl40.l(this.c, tx8Var.c) && jl40.l(this.d, tx8Var.d) && jl40.l(this.e, tx8Var.e) && jl40.l(this.f, tx8Var.f) && jl40.l(this.g, tx8Var.g);
    }

    @Override // defpackage.ux8, defpackage.e6v
    public final String getId() {
        return this.h;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int b2 = unr0.b(unr0.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
        String str2 = this.f;
        int hashCode = (b2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.g;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // defpackage.ux8
    public final String k() {
        return this.a;
    }

    public final String toString() {
        StringBuilder v = b64.v("UnavailableRedirect(unavailableRequirementName=", this.a, ", redirectRequirementName=", this.b, ", redirectDescription=");
        g8e.D(v, this.c, ", redirectTariffClass=", this.d, ", title=");
        g8e.D(v, this.e, ", bigImageUrl=", this.f, ", optionsNames=");
        return ly3.s(v, this.g, Extension.C_BRAKE);
    }
}
