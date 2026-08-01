package L;

import java.util.ArrayList;
import r.C0342j;

/* loaded from: classes.dex */
public final class g implements N.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f423a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f424b;

    public /* synthetic */ g(int i, Object obj) {
        this.f423a = i;
        this.f424b = obj;
    }

    @Override // N.a
    public final void accept(Object obj) {
        switch (this.f423a) {
            case 0:
                h hVar = (h) obj;
                if (hVar == null) {
                    hVar = new h(-3);
                }
                ((F.i) this.f424b).D(hVar);
                return;
            default:
                h hVar2 = (h) obj;
                synchronized (i.f429c) {
                    try {
                        C0342j c0342j = i.f430d;
                        ArrayList arrayList = (ArrayList) c0342j.get((String) this.f424b);
                        if (arrayList == null) {
                            return;
                        }
                        c0342j.remove((String) this.f424b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((N.a) arrayList.get(i)).accept(hVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
