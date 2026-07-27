package L;

import S0.l;
import java.util.ArrayList;
import s.k;

/* loaded from: classes.dex */
public final class e implements N.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1678a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1679b;

    public /* synthetic */ e(int i, Object obj) {
        this.f1678a = i;
        this.f1679b = obj;
    }

    @Override // N.a
    public final void accept(Object obj) {
        switch (this.f1678a) {
            case 0:
                f fVar = (f) obj;
                if (fVar == null) {
                    fVar = new f(-3);
                }
                ((l) this.f1679b).r(fVar);
                return;
            default:
                f fVar2 = (f) obj;
                synchronized (g.f1684c) {
                    try {
                        k kVar = g.f1685d;
                        ArrayList arrayList = (ArrayList) kVar.getOrDefault((String) this.f1679b, null);
                        if (arrayList == null) {
                            return;
                        }
                        kVar.remove((String) this.f1679b);
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
