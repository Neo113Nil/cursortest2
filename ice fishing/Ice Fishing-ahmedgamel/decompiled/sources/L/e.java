package L;

import S0.l;
import java.util.ArrayList;
import s.k;

/* loaded from: classes.dex */
public final class e implements N.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1699a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1700b;

    public /* synthetic */ e(int i, Object obj) {
        this.f1699a = i;
        this.f1700b = obj;
    }

    @Override // N.a
    public final void accept(Object obj) {
        switch (this.f1699a) {
            case 0:
                f fVar = (f) obj;
                if (fVar == null) {
                    fVar = new f(-3);
                }
                ((l) this.f1700b).F(fVar);
                return;
            default:
                f fVar2 = (f) obj;
                synchronized (g.f1705c) {
                    try {
                        k kVar = g.f1706d;
                        ArrayList arrayList = (ArrayList) kVar.getOrDefault((String) this.f1700b, null);
                        if (arrayList == null) {
                            return;
                        }
                        kVar.remove((String) this.f1700b);
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
