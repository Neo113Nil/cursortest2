package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class u6s implements zyf {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.zyf
    public final void b() {
        Iterator it = xut.e(this.a).iterator();
        while (it.hasNext()) {
            ((j6s) it.next()).b();
        }
    }

    @Override // defpackage.zyf
    public final void onDestroy() {
        Iterator it = xut.e(this.a).iterator();
        while (it.hasNext()) {
            ((j6s) it.next()).onDestroy();
        }
    }

    @Override // defpackage.zyf
    public final void onStop() {
        Iterator it = xut.e(this.a).iterator();
        while (it.hasNext()) {
            ((j6s) it.next()).onStop();
        }
    }
}
