package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes13.dex */
public final class zh41 implements ci41 {
    public final ArrayList a = new ArrayList();

    @Override // defpackage.ci41
    public final void b(n790 n790Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ci41) it.next()).b(n790Var);
        }
    }

    @Override // defpackage.ci41
    public final void onPageFinished(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ci41) it.next()).onPageFinished(str);
        }
    }

    @Override // defpackage.ci41
    public final void onPageStarted(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ci41) it.next()).onPageStarted(str);
        }
    }
}
