package e3;

import java.util.ArrayList;
import s.q0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g implements g3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2082a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2083b;

    public /* synthetic */ g(int i10, Object obj) {
        this.f2082a = i10;
        this.f2083b = obj;
    }

    @Override // g3.a
    public final void accept(Object obj) {
        switch (this.f2082a) {
            case 0:
                h hVar = (h) obj;
                if (hVar == null) {
                    hVar = new h(-3);
                }
                ((x4.e) this.f2083b).h(hVar);
                return;
            default:
                h hVar2 = (h) obj;
                synchronized (i.f2088c) {
                    try {
                        q0 q0Var = i.f2089d;
                        ArrayList arrayList = (ArrayList) q0Var.get((String) this.f2083b);
                        if (arrayList == null) {
                            return;
                        }
                        q0Var.remove((String) this.f2083b);
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((g3.a) arrayList.get(i10)).accept(hVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
