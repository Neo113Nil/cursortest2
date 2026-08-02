package defpackage;

import android.util.Log;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class lvf {
    public static final /* synthetic */ int f = 0;
    public final pjc a;
    public final CoroutineContext b;
    public final kvf c;
    public final x6k d;
    public final x6k e;

    static {
        imp impVar = hyf.a;
        if (impVar == null) {
            impVar = new imp();
        }
        hyf.a = impVar;
    }

    public lvf(pjc pjcVar) {
        pjcVar.getClass();
        this.a = pjcVar;
        CoroutineContext coroutineContext = (CoroutineContext) bj0.n.getValue();
        this.b = coroutineContext;
        kvf kvfVar = new kvf(this, new mka(this), coroutineContext, pjcVar instanceof u0q ? (v3k) CollectionsKt.firstOrNull(((u0q) pjcVar).b()) : null);
        this.c = kvfVar;
        this.d = szf.g0(kvfVar.b());
        mb5 mb5Var = (mb5) kvfVar.l.a.getValue();
        if (mb5Var == null) {
            ofg ofgVar = ovf.a;
            mb5Var = new mb5(ofgVar.a, ofgVar.b, ofgVar.c, ofgVar, null);
        }
        this.e = szf.g0(mb5Var);
    }

    public static final void a(lvf lvfVar) {
        lvfVar.d.setValue(lvfVar.c.b());
    }

    public final Object b(aur aurVar) {
        Object collect = this.c.l.a.collect(new pja(new otd(20, this), 26), aurVar);
        nm6 nm6Var = nm6.a;
        if (collect != nm6Var) {
            collect = Unit.a;
        }
        return collect == nm6Var ? collect : Unit.a;
    }

    public final Object c(int i) {
        kvf kvfVar = this.c;
        kvfVar.i = true;
        kvfVar.j = i;
        if (hyf.a != null && Log.isLoggable("Paging", 2)) {
            Log.v("Paging", "Accessing item index[" + i + ']');
        }
        gyd gydVar = kvfVar.c;
        if (gydVar != null) {
            gydVar.k(kvfVar.e.a(i));
        }
        c2k c2kVar = kvfVar.e;
        if (i < 0) {
            c2kVar.getClass();
        } else if (i < c2kVar.d()) {
            int i2 = i - c2kVar.c;
            if (i2 >= 0 && i2 < c2kVar.b) {
                c2kVar.b(i2);
            }
            return ((m0f) this.d.getValue()).get(i);
        }
        l1j.k(c2kVar.d(), k5r.q(i, "Index: ", ", Size: "));
        return null;
    }

    public final int d() {
        return ((m0f) this.d.getValue()).f();
    }

    public final mb5 e() {
        return (mb5) this.e.getValue();
    }

    public final void f() {
        imp impVar = hyf.a;
        kvf kvfVar = this.c;
        if (impVar != null) {
            kvfVar.getClass();
            if (Log.isLoggable("Paging", 3)) {
                Log.d("Paging", "Refresh signal received");
            }
        }
        vft vftVar = kvfVar.d;
        if (vftVar != null) {
            vftVar.A();
        }
    }

    public final void g() {
        imp impVar = hyf.a;
        kvf kvfVar = this.c;
        if (impVar != null) {
            kvfVar.getClass();
            if (Log.isLoggable("Paging", 3)) {
                Log.d("Paging", "Retry signal received");
            }
        }
        vft vftVar = kvfVar.d;
        if (vftVar != null) {
            vftVar.p();
        }
    }
}
