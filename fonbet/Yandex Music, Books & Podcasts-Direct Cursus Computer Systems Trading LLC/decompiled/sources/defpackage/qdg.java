package defpackage;

import android.os.Looper;
import androidx.fragment.app.o;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class qdg {
    public static final Object k = new Object();
    public final Object a;
    public final jno b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final dsd j;

    public qdg() {
        this.a = new Object();
        this.b = new jno();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new dsd(4, this);
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        hx0.Z().a.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        xq0.q(hrg.q("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(pdg pdgVar) {
        if (pdgVar.b) {
            if (!pdgVar.d()) {
                pdgVar.a(false);
                return;
            }
            int i = pdgVar.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            pdgVar.c = i2;
            pdgVar.a.onChanged(this.e);
        }
    }

    public final void c(pdg pdgVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (pdgVar != null) {
                b(pdgVar);
                pdgVar = null;
            } else {
                jno jnoVar = this.b;
                jnoVar.getClass();
                hno hnoVar = new hno(jnoVar);
                jnoVar.c.put(hnoVar, Boolean.FALSE);
                while (hnoVar.hasNext()) {
                    b((pdg) ((Map.Entry) hnoVar.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final Object d() {
        Object obj = this.e;
        if (obj != k) {
            return obj;
        }
        return null;
    }

    public final boolean e() {
        return this.c > 0;
    }

    public final void f(dzf dzfVar, xjj xjjVar) {
        Object obj;
        a("observe");
        if (dzfVar.getLifecycle().b() == lyf.a) {
            return;
        }
        odg odgVar = new odg(this, dzfVar, xjjVar);
        jno jnoVar = this.b;
        gno a = jnoVar.a(xjjVar);
        if (a != null) {
            obj = a.b;
        } else {
            gno gnoVar = new gno(xjjVar, odgVar);
            jnoVar.d++;
            gno gnoVar2 = jnoVar.b;
            if (gnoVar2 == null) {
                jnoVar.a = gnoVar;
                jnoVar.b = gnoVar;
            } else {
                gnoVar2.c = gnoVar;
                gnoVar.d = gnoVar2;
                jnoVar.b = gnoVar;
            }
            obj = null;
        }
        pdg pdgVar = (pdg) obj;
        if (pdgVar != null && !pdgVar.c(dzfVar)) {
            xq0.x("Cannot add the same observer with different lifecycles");
        } else {
            if (pdgVar != null) {
                return;
            }
            dzfVar.getLifecycle().a(odgVar);
        }
    }

    public final void g(xjj xjjVar) {
        Object obj;
        a("observeForever");
        ndg ndgVar = new ndg(this, xjjVar);
        jno jnoVar = this.b;
        gno a = jnoVar.a(xjjVar);
        if (a != null) {
            obj = a.b;
        } else {
            gno gnoVar = new gno(xjjVar, ndgVar);
            jnoVar.d++;
            gno gnoVar2 = jnoVar.b;
            if (gnoVar2 == null) {
                jnoVar.a = gnoVar;
                jnoVar.b = gnoVar;
            } else {
                gnoVar2.c = gnoVar;
                gnoVar.d = gnoVar2;
                jnoVar.b = gnoVar;
            }
            obj = null;
        }
        pdg pdgVar = (pdg) obj;
        if (pdgVar instanceof odg) {
            xq0.x("Cannot add the same observer with different lifecycles");
        } else {
            if (pdgVar != null) {
                return;
            }
            ndgVar.a(true);
        }
    }

    public void j(xjj xjjVar) {
        a("removeObserver");
        pdg pdgVar = (pdg) this.b.g(xjjVar);
        if (pdgVar == null) {
            return;
        }
        pdgVar.b();
        pdgVar.a(false);
    }

    public final void k(o oVar) {
        a("removeObservers");
        Iterator it = this.b.iterator();
        while (true) {
            fno fnoVar = (fno) it;
            if (!fnoVar.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) fnoVar.next();
            if (((pdg) entry.getValue()).c(oVar)) {
                j((xjj) entry.getKey());
            }
        }
    }

    public abstract void l(Object obj);

    public void h() {
    }

    public void i() {
    }

    public qdg(Object obj) {
        this.a = new Object();
        this.b = new jno();
        this.c = 0;
        this.f = k;
        this.j = new dsd(4, this);
        this.e = obj;
        this.g = 0;
    }
}
