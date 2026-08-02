package defpackage;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class xyf implements myf, czf {
    public final HashSet a = new HashSet();
    public final nyf b;

    public xyf(nyf nyfVar) {
        this.b = nyfVar;
        nyfVar.a(this);
    }

    @Override // defpackage.myf
    public final void b(zyf zyfVar) {
        this.a.add(zyfVar);
        nyf nyfVar = this.b;
        if (nyfVar.b() == lyf.a) {
            zyfVar.onDestroy();
        } else if (nyfVar.b().compareTo(lyf.d) >= 0) {
            zyfVar.b();
        } else {
            zyfVar.onStop();
        }
    }

    @Override // defpackage.myf
    public final void l(zyf zyfVar) {
        this.a.remove(zyfVar);
    }

    @eqj(kyf.ON_DESTROY)
    public void onDestroy(@NonNull dzf dzfVar) {
        Iterator it = xut.e(this.a).iterator();
        while (it.hasNext()) {
            ((zyf) it.next()).onDestroy();
        }
        dzfVar.getLifecycle().d(this);
    }

    @eqj(kyf.ON_START)
    public void onStart(@NonNull dzf dzfVar) {
        Iterator it = xut.e(this.a).iterator();
        while (it.hasNext()) {
            ((zyf) it.next()).b();
        }
    }

    @eqj(kyf.ON_STOP)
    public void onStop(@NonNull dzf dzfVar) {
        Iterator it = xut.e(this.a).iterator();
        while (it.hasNext()) {
            ((zyf) it.next()).onStop();
        }
    }
}
