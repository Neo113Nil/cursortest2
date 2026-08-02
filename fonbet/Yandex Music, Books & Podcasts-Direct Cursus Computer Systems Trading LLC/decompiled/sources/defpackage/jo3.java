package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class jo3 implements do3 {
    public final boolean a;
    public final String b;

    public jo3(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    @Override // defpackage.do3
    public final boolean a(llo lloVar) {
        int i;
        boolean z = this.a;
        String str = this.b;
        if (z && str == null) {
            str = lloVar.o();
        }
        jlo jloVar = lloVar.b;
        if (jloVar != null) {
            Iterator it = jloVar.a().iterator();
            i = 0;
            while (it.hasNext()) {
                llo lloVar2 = (llo) ((nlo) it.next());
                if (str == null || lloVar2.o().equals(str)) {
                    i++;
                }
            }
        } else {
            i = 1;
        }
        return i == 1;
    }

    public final String toString() {
        return this.a ? hrg.q("only-of-type <", this.b, ">") : "only-child";
    }
}
