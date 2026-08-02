package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class xrd implements rgo {
    public final /* synthetic */ asd a;

    public xrd(asd asdVar) {
        this.a = asdVar;
    }

    @Override // defpackage.rgo
    public final void reportEvent(String str, String str2) {
        Iterator it = ((List) this.a.b.getValue()).iterator();
        while (it.hasNext()) {
            ((rgo) it.next()).reportEvent(str, str2);
        }
    }

    @Override // defpackage.rgo
    public final void reportEvent(String str, Map map) {
        Iterator it = ((List) this.a.b.getValue()).iterator();
        while (it.hasNext()) {
            ((rgo) it.next()).reportEvent(str, map);
        }
    }
}
