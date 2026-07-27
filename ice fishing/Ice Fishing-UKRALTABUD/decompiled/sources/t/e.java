package t;

import L.Q;
import java.util.ArrayList;
import v.InterfaceC0262a;

/* loaded from: classes.dex */
public final class e implements InterfaceC0262a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2963a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2964b;

    public /* synthetic */ e(int i2, Object obj) {
        this.f2963a = i2;
        this.f2964b = obj;
    }

    @Override // v.InterfaceC0262a
    public final void accept(Object obj) {
        switch (this.f2963a) {
            case 0:
                f fVar = (f) obj;
                if (fVar == null) {
                    fVar = new f(-3);
                }
                ((Q) this.f2964b).s(fVar);
                return;
            default:
                f fVar2 = (f) obj;
                synchronized (g.f2969c) {
                    try {
                        k.i iVar = g.f2970d;
                        ArrayList arrayList = (ArrayList) iVar.getOrDefault((String) this.f2964b, null);
                        if (arrayList == null) {
                            return;
                        }
                        iVar.remove((String) this.f2964b);
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ((InterfaceC0262a) arrayList.get(i2)).accept(fVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
