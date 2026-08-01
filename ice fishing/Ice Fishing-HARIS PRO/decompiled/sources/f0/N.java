package f0;

import android.os.Bundle;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class N {

    /* renamed from: a, reason: collision with root package name */
    public C0144i f2892a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2893b;

    public abstract w a();

    public final C0144i b() {
        C0144i c0144i = this.f2892a;
        if (c0144i != null) {
            return c0144i;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public w c(w wVar, Bundle bundle, C0134C c0134c) {
        return wVar;
    }

    public void d(List list, C0134C c0134c) {
        J1.c cVar = new J1.c(new J1.d(0, new J1.l(new J1.d(2, list), new C0148m(this, 1, c0134c), 1)));
        while (cVar.hasNext()) {
            b().g((C0141f) cVar.next());
        }
    }

    public void e(C0144i c0144i) {
        this.f2892a = c0144i;
        this.f2893b = true;
    }

    public void f(C0141f c0141f) {
        w wVar = c0141f.f2920b;
        if (wVar == null) {
            wVar = null;
        }
        if (wVar == null) {
            return;
        }
        c(wVar, null, R.j.T(C0137b.f2910o));
        b().c(c0141f);
    }

    public void g(Bundle bundle) {
    }

    public Bundle h() {
        return null;
    }

    public void i(C0141f c0141f, boolean z2) {
        D1.i.e(c0141f, "popUpTo");
        List list = (List) ((O1.q) b().e.f852a).f();
        if (!list.contains(c0141f)) {
            throw new IllegalStateException(("popBackStack was called with " + c0141f + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        C0141f c0141f2 = null;
        while (j()) {
            c0141f2 = (C0141f) listIterator.previous();
            if (D1.i.a(c0141f2, c0141f)) {
                break;
            }
        }
        if (c0141f2 != null) {
            b().d(c0141f2, z2);
        }
    }

    public boolean j() {
        return true;
    }
}
