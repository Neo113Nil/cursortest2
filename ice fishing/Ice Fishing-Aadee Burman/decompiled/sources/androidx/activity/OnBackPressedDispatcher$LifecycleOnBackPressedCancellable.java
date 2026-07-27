package androidx.activity;

import androidx.lifecycle.AbstractC0498p;
import androidx.lifecycle.EnumC0496n;
import androidx.lifecycle.InterfaceC0501t;
import androidx.lifecycle.InterfaceC0503v;

/* loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements InterfaceC0501t, InterfaceC0451c {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC0498p f4433n;

    /* renamed from: u, reason: collision with root package name */
    public final androidx.fragment.app.E f4434u;

    /* renamed from: v, reason: collision with root package name */
    public E f4435v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ G f4436w;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(G g4, AbstractC0498p abstractC0498p, androidx.fragment.app.E onBackPressedCallback) {
        kotlin.jvm.internal.h.e(onBackPressedCallback, "onBackPressedCallback");
        this.f4436w = g4;
        this.f4433n = abstractC0498p;
        this.f4434u = onBackPressedCallback;
        abstractC0498p.a(this);
    }

    @Override // androidx.lifecycle.InterfaceC0501t
    public final void a(InterfaceC0503v interfaceC0503v, EnumC0496n enumC0496n) {
        if (enumC0496n != EnumC0496n.ON_START) {
            if (enumC0496n != EnumC0496n.ON_STOP) {
                if (enumC0496n == EnumC0496n.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                E e9 = this.f4435v;
                if (e9 != null) {
                    e9.cancel();
                    return;
                }
                return;
            }
        }
        G g4 = this.f4436w;
        g4.getClass();
        androidx.fragment.app.E onBackPressedCallback = this.f4434u;
        kotlin.jvm.internal.h.e(onBackPressedCallback, "onBackPressedCallback");
        g4.f4424b.addLast(onBackPressedCallback);
        E e10 = new E(g4, onBackPressedCallback);
        onBackPressedCallback.f4821b.add(e10);
        g4.e();
        onBackPressedCallback.f4822c = new F(0, g4, G.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
        this.f4435v = e10;
    }

    @Override // androidx.activity.InterfaceC0451c
    public final void cancel() {
        this.f4433n.b(this);
        this.f4434u.f4821b.remove(this);
        E e9 = this.f4435v;
        if (e9 != null) {
            e9.cancel();
        }
        this.f4435v = null;
    }
}
