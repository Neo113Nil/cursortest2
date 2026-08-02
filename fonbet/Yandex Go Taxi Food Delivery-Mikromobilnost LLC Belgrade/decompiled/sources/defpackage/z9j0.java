package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class z9j0 implements uhx0, e6v {
    public final boolean a;
    public final saj0 b;
    public final String c;

    public z9j0(boolean z, saj0 saj0Var) {
        this.a = z;
        this.b = saj0Var;
        String str = saj0Var.a;
        List list = saj0Var.b;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((nu1) it.next()).b);
        }
        this.c = str + arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9j0)) {
            return false;
        }
        z9j0 z9j0Var = (z9j0) obj;
        return this.a == z9j0Var.a && jl40.l(this.b, z9j0Var.b);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "RequiredAltChoiceContentItem(isFirstInSection=" + this.a + ", uiState=" + this.b + Extension.C_BRAKE;
    }
}
