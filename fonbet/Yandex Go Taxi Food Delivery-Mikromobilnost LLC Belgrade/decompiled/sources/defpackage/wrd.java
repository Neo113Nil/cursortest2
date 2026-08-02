package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class wrd implements w8o {
    public final /* synthetic */ asd a;

    public wrd(asd asdVar) {
        this.a = asdVar;
    }

    @Override // defpackage.w8o
    public final void a() {
        Iterator it = ((List) this.a.c.getValue()).iterator();
        while (it.hasNext()) {
            ((w8o) it.next()).a();
        }
    }

    @Override // defpackage.w8o
    public final void reportError(String str, String str2, Throwable th) {
        Iterator it = ((List) this.a.c.getValue()).iterator();
        while (it.hasNext()) {
            ((w8o) it.next()).reportError(str, str2, th);
        }
    }
}
