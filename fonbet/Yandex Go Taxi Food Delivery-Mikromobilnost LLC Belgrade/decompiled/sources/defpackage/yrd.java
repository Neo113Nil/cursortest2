package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class yrd implements uhl0 {
    public final /* synthetic */ asd a;

    public yrd(asd asdVar) {
        this.a = asdVar;
    }

    @Override // defpackage.uhl0
    public final void a(shl0 shl0Var) {
        Iterator it = ((List) this.a.g.getValue()).iterator();
        while (it.hasNext()) {
            ((uhl0) it.next()).a(shl0Var);
        }
    }
}
