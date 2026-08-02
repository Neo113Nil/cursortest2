package defpackage;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.navigation.base.internal.NavigationRouterException;
import com.yandex.go.navigation.base.internal.StackChangeType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.Pair;
import kotlin.collections.a;

/* loaded from: classes8.dex */
public final class w950 {
    public final Lifecycle a;
    public final pep0 b;
    public final t6f0 c;
    public boolean g;
    public final v950 i;
    public x43 d = new x43();
    public final x43 e = new x43();
    public boolean f = true;
    public final x43 h = new x43();

    public w950(Lifecycle lifecycle, pep0 pep0Var, t6f0 t6f0Var) {
        this.a = lifecycle;
        this.b = pep0Var;
        this.c = t6f0Var;
        v950 v950Var = new v950(this);
        this.i = v950Var;
        v950Var.A = new WeakReference(this);
        v950Var.y(zy11.a, sy60.Q2);
        v950Var.g();
        lifecycle.a(new t950(this));
    }

    public static final void a(w950 w950Var) {
        h55 d;
        x43 x43Var = w950Var.h;
        if (!x43Var.isEmpty()) {
            ArrayList c = w950Var.c();
            w950Var.f = false;
            while (!x43Var.isEmpty()) {
                try {
                    sls slsVar = (sls) x43Var.m();
                    if (slsVar != null) {
                        slsVar.invoke();
                    }
                } catch (Throwable th) {
                    w950Var.f = true;
                    throw th;
                }
            }
            w950Var.f = true;
            if (!c.equals(w950Var.c())) {
                w950Var.i.P();
            }
        }
        if (!w950Var.a.b().a(Lifecycle.State.STARTED) || (d = w950Var.d()) == null || d.x()) {
            return;
        }
        d.M();
    }

    public static void e(x43 x43Var, List list) {
        if (x43Var == null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                azt0 azt0Var = (azt0) it.next();
                if (azt0Var.w()) {
                    azt0Var.i();
                }
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((azt0) obj).w()) {
                arrayList.add(obj);
            }
        }
        x43Var.addAll(arrayList);
    }

    public final h55 b() {
        azt0 azt0Var = (azt0) this.d.f();
        if (azt0Var != null) {
            return azt0Var.D;
        }
        return null;
    }

    public final ArrayList c() {
        x43 x43Var = this.d;
        ArrayList arrayList = new ArrayList(tcc.n(x43Var, 10));
        Iterator it = x43Var.iterator();
        while (it.hasNext()) {
            h55 h55Var = ((azt0) it.next()).D;
            arrayList.add(new Pair(h55Var, h55Var.getLifecycle().w));
        }
        return arrayList;
    }

    public final h55 d() {
        azt0 azt0Var = (azt0) this.d.h();
        if (azt0Var != null) {
            return azt0Var.D;
        }
        return null;
    }

    public final void f(azt0 azt0Var) {
        this.d.remove(azt0Var);
        h55 h55Var = azt0Var.D;
        h(!(h55Var instanceof qa00));
        h55 d = d();
        if (d != null) {
            if (this.a.b().a(Lifecycle.State.STARTED)) {
                d.M();
                return;
            }
            return;
        }
        x43 x43Var = (x43) this.e.n();
        if (x43Var != null) {
            this.d = x43Var;
            this.i.P();
        }
        h55 d2 = d();
        b();
        this.c.c(h55Var, d2, StackChangeType.Poll);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(final m950 m950Var, final Object obj, final sy60 sy60Var, final kxx kxxVar) {
        boolean a;
        final h55 b = gtq0.b(m950Var);
        if (this.g) {
            this.h.addLast(new sls() { // from class: r950
                @Override // defpackage.sls
                public final Object invoke() {
                    w950.this.g(m950Var, obj, sy60Var, kxxVar);
                    return zy11.a;
                }
            });
            return;
        }
        boolean z = kxxVar instanceof hxx;
        if (!z) {
            boolean z2 = kxxVar instanceof jxx;
            azt0 azt0Var = null;
            if (z2) {
                azt0 azt0Var2 = (azt0) this.d.h();
                if (azt0Var2 != null) {
                    h55 h55Var = azt0Var2.D;
                    if (h55Var.getClass() == b.getClass() && h55Var.w()) {
                        azt0Var = azt0Var2;
                    }
                }
            } else if (kxxVar instanceof ixx) {
                x43 x43Var = this.d;
                ListIterator listIterator = x43Var.listIterator(x43Var.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    Object previous = listIterator.previous();
                    azt0 azt0Var3 = (azt0) previous;
                    if (azt0Var3.D.getClass() == b.getClass() && azt0Var3.D.w()) {
                        azt0Var = previous;
                        break;
                    }
                }
                azt0Var = azt0Var;
            } else if (!z) {
                w511.b();
                return;
            }
            if (azt0Var != null) {
                if (z2) {
                    a = ((jxx) kxxVar).a;
                } else {
                    if (!(kxxVar instanceof ixx)) {
                        w511.b();
                        return;
                    }
                    a = ((ixx) kxxVar).a();
                }
                if (a && jl40.l(azt0Var.E, obj)) {
                    return;
                } else {
                    azt0Var.D.i();
                }
            }
        }
        if (b.w()) {
            wby wbyVar = p950.a;
            new NavigationRouterException("Try to launch already launched router");
            wbyVar.getClass();
            ((h55) m950Var).i();
        }
        boolean z3 = m950Var instanceof qa00;
        h(!z3);
        h55 d = d();
        if (d != null) {
            d.O();
        }
        Object obj2 = aep0.a;
        Object obj3 = cep0.a;
        Object obj4 = bep0.a;
        aep0 aep0Var = z3 ? obj4 : m950Var instanceof lwk0 ? obj3 : obj2;
        boolean equals = aep0Var.equals(obj2);
        q1j0 q1j0Var = p1j0.a;
        if (!equals) {
            boolean equals2 = aep0Var.equals(obj3);
            x43 x43Var2 = this.e;
            if (equals2) {
                if (!this.d.isEmpty()) {
                    x43 x43Var3 = this.d;
                    this.d = new x43();
                    Iterator it = x43Var3.iterator();
                    while (it.hasNext()) {
                        ((azt0) it.next()).h();
                    }
                    x43Var2.addLast(x43Var3);
                }
            } else if (!aep0Var.equals(obj4)) {
                w511.b();
                return;
            } else {
                this.d = new x43();
                x43Var2.clear();
                q1j0Var = k1j0.a;
            }
        }
        x43 x43Var4 = this.d;
        v950 v950Var = this.i;
        v950Var.getClass();
        wby wbyVar2 = p950.a;
        Objects.toString(b);
        wbyVar2.getClass();
        final w950 w950Var = v950Var.D;
        final azt0 azt0Var4 = new azt0(b, obj, sy60Var, new csz(13, w950Var));
        sy60 sy60Var2 = new sy60() { // from class: u950
            @Override // defpackage.sy60
            public final void a() {
                w950 w950Var2 = w950Var;
                h55 d2 = w950Var2.d();
                h55 h55Var2 = h55.this;
                boolean equals3 = h55Var2.equals(d2);
                azt0 azt0Var5 = azt0Var4;
                if (equals3) {
                    wby wbyVar3 = p950.a;
                    Objects.toString(h55Var2);
                    wbyVar3.getClass();
                    w950Var2.f(azt0Var5);
                    return;
                }
                if (h55Var2.equals(w950Var2.b())) {
                    wby wbyVar4 = p950.a;
                    Objects.toString(h55Var2);
                    wbyVar4.getClass();
                    List J0 = a.J0(w950Var2.d);
                    if (J0.isEmpty()) {
                        wbyVar4.k(new IllegalStateException(), "Attached screen stack is empty on root close");
                        return;
                    }
                    w950.e((x43) w950Var2.e.h(), a.J(J0, 1));
                    w950Var2.d.removeIf(new sdc(11, new ej40(10)));
                    w950Var2.f(azt0Var5);
                }
            }
        };
        azt0Var4.A = new WeakReference(w950Var);
        x43Var4.addLast(azt0Var4);
        try {
            w950Var.g = true;
            v950Var.B(azt0Var4, zy11.a, sy60Var2, q1j0Var);
            if (w950Var.f && w950Var.a.b().a(Lifecycle.State.STARTED) && azt0Var4.u()) {
                azt0Var4.M();
            }
            w950Var.g = false;
            a(w950Var);
            h55 d2 = d();
            b();
            this.c.c(d, d2, StackChangeType.Push);
        } catch (Throwable th) {
            w950Var.g = false;
            throw th;
        }
    }

    public final void h(boolean z) {
        azt0 azt0Var;
        h55 h55Var;
        x43 x43Var = this.e;
        if (x43Var.isEmpty()) {
            azt0Var = (azt0) this.d.f();
        } else {
            x43 x43Var2 = (x43) x43Var.f();
            azt0Var = x43Var2 != null ? (azt0) x43Var2.f() : null;
        }
        this.d.removeIf(new md3(9, new qz10(6)));
        Iterator it = x43Var.iterator();
        while (true) {
            int i = 10;
            if (!it.hasNext()) {
                break;
            } else {
                ((x43) it.next()).removeIf(new md3(i, new qz10(7)));
            }
        }
        x43Var.removeIf(new md3(11, new qz10(8)));
        ArrayList arrayList = new ArrayList();
        Iterator it2 = x43Var.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            x43 x43Var3 = (x43) next;
            azt0 azt0Var2 = (azt0) x43Var3.f();
            if (!((azt0Var2 != null ? azt0Var2.D : null) instanceof lwk0)) {
                e(i2 == 0 ? null : (x43) x43Var.get(i2 - 1), x43Var3);
                arrayList.add(x43Var3);
            }
            i2 = i3;
        }
        x43Var.removeAll(arrayList);
        if (z) {
            if (!((azt0Var != null ? azt0Var.D : null) instanceof qa00)) {
                xby.t(p950.a, "NavigationRouter:missingMainScreen", new NavigationRouterException(qv10.l((azt0Var == null || (h55Var = azt0Var.D) == null) ? null : h55Var.getClass(), "First router in stack should be implementation of MainScreenNavigationRouter interface, current first router is ")), null, 10);
                return;
            }
            boolean w = azt0Var.w();
            h55 h55Var2 = azt0Var.D;
            if (w) {
                return;
            }
            if (!this.d.isEmpty()) {
                wby wbyVar = p950.a;
                Class<?> cls = h55Var2.getClass();
                h55 b = b();
                Class<?> cls2 = b != null ? b.getClass() : null;
                h55 d = d();
                xby.t(wbyVar, "NavigationRouter:closedMainScreenWithNotEmptyStack", new NavigationRouterException("MainScreenRouter " + cls + " was closed before other routers in stack, currentRoot=" + cls2 + " currentTop=" + (d != null ? d.getClass() : null)), null, 10);
            }
            h55 d2 = d();
            b();
            this.c.c(h55Var2, d2, StackChangeType.Poll);
        }
    }
}
