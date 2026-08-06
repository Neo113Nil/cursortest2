package v;

import java.util.ArrayList;
import l.k;
import x.InterfaceC1063a;

/* loaded from: classes.dex */
public final class d implements InterfaceC1063a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8489a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8490b;

    public /* synthetic */ d(int i2, Object obj) {
        this.f8489a = i2;
        this.f8490b = obj;
    }

    @Override // x.InterfaceC1063a
    public final void accept(Object obj) {
        switch (this.f8489a) {
            case 0:
                e eVar = (e) obj;
                if (eVar == null) {
                    eVar = new e(-3);
                }
                ((o.b) this.f8490b).b(eVar);
                return;
            default:
                e eVar2 = (e) obj;
                synchronized (f.f8495c) {
                    try {
                        k kVar = f.f8496d;
                        ArrayList arrayList = (ArrayList) kVar.getOrDefault((String) this.f8490b, null);
                        if (arrayList == null) {
                            return;
                        }
                        kVar.remove((String) this.f8490b);
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ((InterfaceC1063a) arrayList.get(i2)).accept(eVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
