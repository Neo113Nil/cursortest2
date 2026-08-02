package defpackage;

import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class vyr implements e9e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vyr(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.e9e
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                wyr wyrVar = (wyr) obj;
                if (wyrVar == null) {
                    wyrVar = new wyr(-3);
                }
                ((c06) this.b).r(wyrVar);
                return;
            default:
                wyr wyrVar2 = (wyr) obj;
                synchronized (xyr.c) {
                    try {
                        ycs0 ycs0Var = xyr.d;
                        ArrayList arrayList = (ArrayList) ycs0Var.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        ycs0Var.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((e9e) arrayList.get(i)).accept(wyrVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
