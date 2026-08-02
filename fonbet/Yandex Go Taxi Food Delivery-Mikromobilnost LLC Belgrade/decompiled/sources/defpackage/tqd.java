package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class tqd implements jt31 {
    public final ArrayList a = new ArrayList();

    public final void a(jt31 jt31Var) {
        this.a.add(jt31Var);
    }

    @Override // defpackage.jt31
    public final void c(float f, View view) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((jt31) it.next()).c(f, view);
        }
    }
}
