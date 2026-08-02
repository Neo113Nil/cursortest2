package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class eqc implements xa6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eqc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xa6
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                fqc fqcVar = (fqc) obj;
                if (fqcVar == null) {
                    fqcVar = new fqc(-3);
                }
                ((le3) this.b).j(fqcVar);
                return;
            default:
                fqc fqcVar2 = (fqc) obj;
                synchronized (gqc.c) {
                    try {
                        ciq ciqVar = gqc.d;
                        ArrayList arrayList = (ArrayList) ciqVar.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        ciqVar.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((xa6) arrayList.get(i)).accept(fqcVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
