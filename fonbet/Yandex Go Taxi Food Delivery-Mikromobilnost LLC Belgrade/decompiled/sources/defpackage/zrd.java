package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class zrd implements zhl0 {
    public final /* synthetic */ asd a;

    public zrd(asd asdVar) {
        this.a = asdVar;
    }

    @Override // defpackage.zhl0
    public final void a(vhl0 vhl0Var) {
        Iterator it = ((List) this.a.f.getValue()).iterator();
        while (it.hasNext()) {
            ((zhl0) it.next()).a(vhl0Var);
        }
    }
}
