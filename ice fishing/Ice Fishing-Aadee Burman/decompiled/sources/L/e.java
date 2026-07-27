package L;

import java.util.ArrayList;
import s.k;

/* loaded from: classes.dex */
public final class e implements N.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1591b;

    public /* synthetic */ e(int i, Object obj) {
        this.f1590a = i;
        this.f1591b = obj;
    }

    @Override // N.a
    public final void accept(Object obj) {
        switch (this.f1590a) {
            case 0:
                f fVar = (f) obj;
                if (fVar == null) {
                    fVar = new f(-3);
                }
                ((S0.e) this.f1591b).l(fVar);
                return;
            default:
                f fVar2 = (f) obj;
                synchronized (g.f1596c) {
                    try {
                        k kVar = g.f1597d;
                        ArrayList arrayList = (ArrayList) kVar.getOrDefault((String) this.f1591b, null);
                        if (arrayList == null) {
                            return;
                        }
                        kVar.remove((String) this.f1591b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((N.a) arrayList.get(i)).accept(fVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
