package d;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f1550a;

    /* renamed from: b, reason: collision with root package name */
    public final bc.k f1551b = new bc.k();

    /* renamed from: c, reason: collision with root package name */
    public q f1552c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f1553d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f1554e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1555f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1556g;

    public y(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallback;
        this.f1550a = runnable;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            if (i10 >= 34) {
                onBackInvokedCallback = new u(new r(this, 0), new r(this, 1), new s(this, 0), new s(this, 1));
            } else {
                final s sVar = new s(this, 2);
                onBackInvokedCallback = new OnBackInvokedCallback() { // from class: d.t
                    public final void onBackInvoked() {
                        s.this.invoke();
                    }
                };
            }
            this.f1553d = onBackInvokedCallback;
        }
    }

    public final void a() {
        Object obj;
        if (this.f1552c == null) {
            bc.k kVar = this.f1551b;
            ListIterator<E> listIterator = kVar.listIterator(kVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                } else {
                    obj = listIterator.previous();
                    if (((q) obj).f1531a) {
                        break;
                    }
                }
            }
        }
        this.f1552c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        q qVar;
        q qVar2 = this.f1552c;
        if (qVar2 == null) {
            bc.k kVar = this.f1551b;
            ListIterator listIterator = kVar.listIterator(kVar.a());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    qVar = 0;
                    break;
                } else {
                    qVar = listIterator.previous();
                    if (((q) qVar).f1531a) {
                        break;
                    }
                }
            }
            qVar2 = qVar;
        }
        this.f1552c = null;
        if (qVar2 != null) {
            qVar2.a();
        } else {
            this.f1550a.run();
        }
    }

    public final void c(boolean z10) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1554e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f1553d) == null) {
            return;
        }
        if (z10 && !this.f1555f) {
            k.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1555f = true;
        } else {
            if (z10 || !this.f1555f) {
                return;
            }
            k.f(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1555f = false;
        }
    }

    public final void d() {
        boolean z10 = this.f1556g;
        boolean z11 = false;
        bc.k kVar = this.f1551b;
        if (kVar == null || !kVar.isEmpty()) {
            Iterator it = kVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((q) it.next()).f1531a) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f1556g = z11;
        if (z11 == z10 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z11);
    }
}
