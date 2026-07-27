package t;

import L.Q;
import java.util.ArrayList;
import v.InterfaceC0256a;

/* loaded from: classes.dex */
public final class e implements InterfaceC0256a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2968a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2969b;

    public /* synthetic */ e(int i2, Object obj) {
        this.f2968a = i2;
        this.f2969b = obj;
    }

    @Override // v.InterfaceC0256a
    public final void accept(Object obj) {
        switch (this.f2968a) {
            case 0:
                f fVar = (f) obj;
                if (fVar == null) {
                    fVar = new f(-3);
                }
                ((Q) this.f2969b).s(fVar);
                return;
            default:
                f fVar2 = (f) obj;
                synchronized (g.f2974c) {
                    try {
                        k.i iVar = g.f2975d;
                        ArrayList arrayList = (ArrayList) iVar.getOrDefault((String) this.f2969b, null);
                        if (arrayList == null) {
                            return;
                        }
                        iVar.remove((String) this.f2969b);
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ((InterfaceC0256a) arrayList.get(i2)).accept(fVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
