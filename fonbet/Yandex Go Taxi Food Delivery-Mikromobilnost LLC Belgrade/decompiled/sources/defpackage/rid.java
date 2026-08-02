package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.a;

/* loaded from: classes9.dex */
public final class rid implements fw {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public rid(ArrayList arrayList) {
        this.b = a.a(new fyi(arrayList, 0));
    }

    @Override // defpackage.fw
    public final dw handler(kr krVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    dw handler = ((fw) it.next()).handler(krVar);
                    if (handler != null) {
                        return handler;
                    }
                }
                return null;
            default:
                return (dw) ((Map) ((i3y) obj).getValue()).get(qoi0.a(krVar.getClass()));
        }
    }

    public rid(List list) {
        this.b = list;
    }

    @Override // defpackage.fw
    public final dw handler(kr krVar, klc klcVar) {
        switch (this.a) {
            case 0:
                Iterator it = ((List) this.b).iterator();
                while (it.hasNext()) {
                    dw handler = ((fw) it.next()).handler(krVar, klcVar);
                    if (handler != null) {
                        return handler;
                    }
                }
                return null;
            default:
                return handler(krVar);
        }
    }
}
