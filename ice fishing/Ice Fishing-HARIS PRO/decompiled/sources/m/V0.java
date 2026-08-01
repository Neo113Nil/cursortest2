package m;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import l.InterfaceC0227k;
import l.MenuC0229m;

/* loaded from: classes.dex */
public final class V0 implements InterfaceC0270o, InterfaceC0227k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3890a;

    public /* synthetic */ V0(Toolbar toolbar) {
        this.f3890a = toolbar;
    }

    @Override // l.InterfaceC0227k
    public boolean p(MenuC0229m menuC0229m, MenuItem menuItem) {
        this.f3890a.getClass();
        return false;
    }

    @Override // l.InterfaceC0227k
    public void r(MenuC0229m menuC0229m) {
        Toolbar toolbar = this.f3890a;
        C0264l c0264l = toolbar.f1862a.f1826t;
        if (c0264l == null || !c0264l.g()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f1852G.f617c).iterator();
            while (it.hasNext()) {
                ((Z.E) it.next()).f1409a.s();
            }
        }
    }
}
