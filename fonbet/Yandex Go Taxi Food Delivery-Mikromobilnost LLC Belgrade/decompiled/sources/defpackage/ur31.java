package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class ur31 {
    public final String a;
    public final int b;
    public final f6w c;
    public final idt0 d;
    public final List e;
    public final Object f;
    public final String g;

    public ur31(String str, int i, f6w f6wVar, idt0 idt0Var, List list, Object obj, String str2) {
        this.a = str;
        this.b = i;
        this.c = f6wVar;
        this.d = idt0Var;
        this.e = list;
        this.f = obj;
        this.g = str2;
    }

    public final ArrayList a() {
        List list = this.e;
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ycc.r(((ur31) it.next()).a(), arrayList);
        }
        return a.m0(arrayList, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur31)) {
            return false;
        }
        ur31 ur31Var = (ur31) obj;
        return this.a.equals(ur31Var.a) && this.b == ur31Var.b && jl40.l(this.c, ur31Var.c) && jl40.l(this.d, ur31Var.d) && jl40.l(this.e, ur31Var.e) && jl40.l(this.f, ur31Var.f) && jl40.l(this.g, ur31Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31)) * 31;
        idt0 idt0Var = this.d;
        int c = unr0.c((hashCode + (idt0Var == null ? 0 : idt0Var.hashCode())) * 31, 31, this.e);
        Object obj = this.f;
        int hashCode2 = (c + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.g;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(Extension.O_BRAKE);
        sb.append(this.a);
        sb.append(':');
        sb.append(this.b);
        sb.append(",\n            |bounds=(top=");
        f6w f6wVar = this.c;
        sb.append(f6wVar.b);
        sb.append(", left=");
        sb.append(f6wVar.a);
        sb.append(",\n            |location=");
        idt0 idt0Var = this.d;
        if (idt0Var != null) {
            str = Extension.O_BRAKE + idt0Var.b + 'L' + idt0Var.c;
        } else {
            str = "<none>";
        }
        sb.append(str);
        sb.append("\n            |bottom=");
        sb.append(f6wVar.d);
        sb.append(", right=");
        sb.append(f6wVar.c);
        sb.append("),\n            |childrenCount=");
        sb.append(this.e.size());
        sb.append(')');
        return vuu0.d(sb.toString());
    }
}
