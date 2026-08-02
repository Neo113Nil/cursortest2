package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class qpj {
    public final Runnable a;
    public final zx0 b = new zx0();
    public kpj c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public qpj(Runnable runnable) {
        this.a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.d = i >= 34 ? new npj(new lpj(this, 0), new lpj(this, 1), new mpj(this, 0), new mpj(this, 1)) : new yq0(2, new mpj(this, 2));
        }
    }

    public final void a(dzf dzfVar, kpj kpjVar) {
        dzfVar.getClass();
        kpjVar.getClass();
        nyf lifecycle = dzfVar.getLifecycle();
        if (lifecycle.b() == lyf.a) {
            return;
        }
        kpjVar.addCancellable(new opj(this, lifecycle, kpjVar));
        f();
        kpjVar.setEnabledChangedCallback$activity_release(new m9j(0, this, qpj.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 27));
    }

    public final ppj b(kpj kpjVar) {
        kpjVar.getClass();
        this.b.addLast(kpjVar);
        ppj ppjVar = new ppj(this, kpjVar);
        kpjVar.addCancellable(ppjVar);
        f();
        kpjVar.setEnabledChangedCallback$activity_release(new m9j(0, this, qpj.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 28));
        return ppjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        kpj kpjVar;
        kpj kpjVar2 = this.c;
        if (kpjVar2 == null) {
            zx0 zx0Var = this.b;
            ListIterator listIterator = zx0Var.listIterator(zx0Var.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    kpjVar = 0;
                    break;
                } else {
                    kpjVar = listIterator.previous();
                    if (((kpj) kpjVar).isEnabled()) {
                        break;
                    }
                }
            }
            kpjVar2 = kpjVar;
        }
        this.c = null;
        if (kpjVar2 != null) {
            kpjVar2.handleOnBackCancelled();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void d() {
        kpj kpjVar;
        kpj kpjVar2 = this.c;
        if (kpjVar2 == null) {
            zx0 zx0Var = this.b;
            ListIterator listIterator = zx0Var.listIterator(zx0Var.f());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    kpjVar = 0;
                    break;
                } else {
                    kpjVar = listIterator.previous();
                    if (((kpj) kpjVar).isEnabled()) {
                        break;
                    }
                }
            }
            kpjVar2 = kpjVar;
        }
        this.c = null;
        if (kpjVar2 != null) {
            kpjVar2.handleOnBackPressed();
        } else {
            this.a.run();
        }
    }

    public final void e(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.d) == null) {
            return;
        }
        if (z && !this.f) {
            rb.I(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z || !this.f) {
                return;
            }
            rb.O(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void f() {
        boolean z = this.g;
        boolean z2 = false;
        zx0 zx0Var = this.b;
        if (zx0Var == null || !zx0Var.isEmpty()) {
            Iterator<E> it = zx0Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((kpj) it.next()).isEnabled()) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        e(z2);
    }
}
