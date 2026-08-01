package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.N;
import androidx.lifecycle.AbstractC0498p;
import androidx.lifecycle.C0505x;
import androidx.lifecycle.EnumC0497o;
import androidx.lifecycle.InterfaceC0503v;
import java.util.Iterator;
import java.util.ListIterator;
import v7.C5127h;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f4423a;

    /* renamed from: b, reason: collision with root package name */
    public final C5127h f4424b = new C5127h();

    /* renamed from: c, reason: collision with root package name */
    public androidx.fragment.app.E f4425c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f4426d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f4427e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4428f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4429g;

    public G(Runnable runnable) {
        this.f4423a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.f4426d = i >= 34 ? new D(new A(this, 0), new A(this, 1), new B(this, 0), new B(this, 1)) : new C(0, new B(this, 2));
        }
    }

    public final void a(InterfaceC0503v interfaceC0503v, androidx.fragment.app.E onBackPressedCallback) {
        kotlin.jvm.internal.h.e(onBackPressedCallback, "onBackPressedCallback");
        AbstractC0498p lifecycle = interfaceC0503v.getLifecycle();
        if (((C0505x) lifecycle).f5178d == EnumC0497o.f5164n) {
            return;
        }
        onBackPressedCallback.f4821b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        e();
        onBackPressedCallback.f4822c = new F(0, this, G.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
    }

    public final void b() {
        Object obj;
        if (this.f4425c == null) {
            C5127h c5127h = this.f4424b;
            ListIterator<E> listIterator = c5127h.listIterator(c5127h.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                } else {
                    obj = listIterator.previous();
                    if (((androidx.fragment.app.E) obj).f4820a) {
                        break;
                    }
                }
            }
        }
        this.f4425c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        androidx.fragment.app.E e9;
        androidx.fragment.app.E e10 = this.f4425c;
        if (e10 == null) {
            C5127h c5127h = this.f4424b;
            ListIterator listIterator = c5127h.listIterator(c5127h.a());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    e9 = 0;
                    break;
                } else {
                    e9 = listIterator.previous();
                    if (((androidx.fragment.app.E) e9).f4820a) {
                        break;
                    }
                }
            }
            e10 = e9;
        }
        this.f4425c = null;
        if (e10 == null) {
            this.f4423a.run();
            return;
        }
        N n9 = e10.f4823d;
        n9.x(true);
        if (n9.f4857h.f4820a) {
            n9.L();
        } else {
            n9.f4856g.c();
        }
    }

    public final void d(boolean z3) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f4427e;
        OnBackInvokedCallback onBackInvokedCallback = this.f4426d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z3 && !this.f4428f) {
            AbstractC0456h.b(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f4428f = true;
        } else {
            if (z3 || !this.f4428f) {
                return;
            }
            AbstractC0456h.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f4428f = false;
        }
    }

    public final void e() {
        boolean z3 = this.f4429g;
        boolean z6 = false;
        C5127h c5127h = this.f4424b;
        if (c5127h == null || !c5127h.isEmpty()) {
            Iterator<E> it = c5127h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((androidx.fragment.app.E) it.next()).f4820a) {
                    z6 = true;
                    break;
                }
            }
        }
        this.f4429g = z6;
        if (z6 == z3 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z6);
    }
}
