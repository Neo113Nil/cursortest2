package b;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0103u;
import androidx.lifecycle.EnumC0097n;
import androidx.lifecycle.InterfaceC0101s;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f2320a;

    /* renamed from: b, reason: collision with root package name */
    public final u1.e f2321b = new u1.e();

    /* renamed from: c, reason: collision with root package name */
    public AbstractC0116l f2322c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f2323d;
    public OnBackInvokedDispatcher e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2324f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2325g;

    public u(Runnable runnable) {
        this.f2320a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.f2323d = i >= 34 ? q.f2313a.a(new m(this, 0), new m(this, 1), new n(this, 0), new n(this, 1)) : o.f2308a.a(new n(this, 2));
        }
    }

    public final void a(InterfaceC0101s interfaceC0101s, AbstractC0116l abstractC0116l) {
        D1.i.e(abstractC0116l, "onBackPressedCallback");
        C0103u d2 = interfaceC0101s.d();
        if (d2.f2048c == EnumC0097n.f2038a) {
            return;
        }
        abstractC0116l.f2302b.add(new r(this, d2, abstractC0116l));
        d();
        abstractC0116l.f2303c = new t(0, this, u.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
    }

    public final void b() {
        Object obj;
        u1.e eVar = this.f2321b;
        eVar.getClass();
        ListIterator listIterator = eVar.listIterator(eVar.f4471c);
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            } else {
                obj = listIterator.previous();
                if (((AbstractC0116l) obj).f2301a) {
                    break;
                }
            }
        }
        AbstractC0116l abstractC0116l = (AbstractC0116l) obj;
        this.f2322c = null;
        if (abstractC0116l != null) {
            abstractC0116l.a();
        } else {
            this.f2320a.run();
        }
    }

    public final void c(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        OnBackInvokedCallback onBackInvokedCallback = this.f2323d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        o oVar = o.f2308a;
        if (z2 && !this.f2324f) {
            oVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f2324f = true;
        } else {
            if (z2 || !this.f2324f) {
                return;
            }
            oVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f2324f = false;
        }
    }

    public final void d() {
        boolean z2 = this.f2325g;
        boolean z3 = false;
        u1.e eVar = this.f2321b;
        if (eVar == null || !eVar.isEmpty()) {
            Iterator it = eVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((AbstractC0116l) it.next()).f2301a) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f2325g = z3;
        if (z3 == z2 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z3);
    }
}
