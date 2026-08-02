package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.N;
import androidx.lifecycle.AbstractC0502p;
import androidx.lifecycle.C0509x;
import androidx.lifecycle.EnumC0501o;
import androidx.lifecycle.InterfaceC0507v;
import java.util.Iterator;
import java.util.ListIterator;
import v7.C5117h;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f4391a;

    /* renamed from: b, reason: collision with root package name */
    public final C5117h f4392b = new C5117h();

    /* renamed from: c, reason: collision with root package name */
    public androidx.fragment.app.E f4393c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f4394d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f4395e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4396f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4397g;

    public G(Runnable runnable) {
        this.f4391a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.f4394d = i >= 34 ? new D(new A(this, 0), new A(this, 1), new B(this, 0), new B(this, 1)) : new C(0, new B(this, 2));
        }
    }

    public final void a(InterfaceC0507v interfaceC0507v, androidx.fragment.app.E onBackPressedCallback) {
        kotlin.jvm.internal.h.e(onBackPressedCallback, "onBackPressedCallback");
        AbstractC0502p lifecycle = interfaceC0507v.getLifecycle();
        if (((C0509x) lifecycle).f5145d == EnumC0501o.f5131n) {
            return;
        }
        onBackPressedCallback.f4789b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        e();
        onBackPressedCallback.f4790c = new F(0, this, G.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
    }

    public final void b() {
        Object obj;
        if (this.f4393c == null) {
            C5117h c5117h = this.f4392b;
            ListIterator<E> listIterator = c5117h.listIterator(c5117h.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                } else {
                    obj = listIterator.previous();
                    if (((androidx.fragment.app.E) obj).f4788a) {
                        break;
                    }
                }
            }
        }
        this.f4393c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        androidx.fragment.app.E e9;
        androidx.fragment.app.E e10 = this.f4393c;
        if (e10 == null) {
            C5117h c5117h = this.f4392b;
            ListIterator listIterator = c5117h.listIterator(c5117h.a());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    e9 = 0;
                    break;
                } else {
                    e9 = listIterator.previous();
                    if (((androidx.fragment.app.E) e9).f4788a) {
                        break;
                    }
                }
            }
            e10 = e9;
        }
        this.f4393c = null;
        if (e10 == null) {
            this.f4391a.run();
            return;
        }
        N n9 = e10.f4791d;
        n9.x(true);
        if (n9.f4825h.f4788a) {
            n9.L();
        } else {
            n9.f4824g.c();
        }
    }

    public final void d(boolean z6) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f4395e;
        OnBackInvokedCallback onBackInvokedCallback = this.f4394d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z6 && !this.f4396f) {
            AbstractC0460h.b(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f4396f = true;
        } else {
            if (z6 || !this.f4396f) {
                return;
            }
            AbstractC0460h.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f4396f = false;
        }
    }

    public final void e() {
        boolean z6 = this.f4397g;
        boolean z9 = false;
        C5117h c5117h = this.f4392b;
        if (c5117h == null || !c5117h.isEmpty()) {
            Iterator<E> it = c5117h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((androidx.fragment.app.E) it.next()).f4788a) {
                    z9 = true;
                    break;
                }
            }
        }
        this.f4397g = z9;
        if (z9 == z6 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z9);
    }
}
