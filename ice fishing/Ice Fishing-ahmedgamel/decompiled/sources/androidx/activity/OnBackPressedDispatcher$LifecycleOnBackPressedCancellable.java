package androidx.activity;

import androidx.lifecycle.AbstractC0502p;
import androidx.lifecycle.EnumC0500n;
import androidx.lifecycle.InterfaceC0505t;
import androidx.lifecycle.InterfaceC0507v;

/* loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements InterfaceC0505t, InterfaceC0455c {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC0502p f4401n;

    /* renamed from: u, reason: collision with root package name */
    public final androidx.fragment.app.E f4402u;

    /* renamed from: v, reason: collision with root package name */
    public E f4403v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ G f4404w;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(G g9, AbstractC0502p abstractC0502p, androidx.fragment.app.E onBackPressedCallback) {
        kotlin.jvm.internal.h.e(onBackPressedCallback, "onBackPressedCallback");
        this.f4404w = g9;
        this.f4401n = abstractC0502p;
        this.f4402u = onBackPressedCallback;
        abstractC0502p.a(this);
    }

    @Override // androidx.lifecycle.InterfaceC0505t
    public final void a(InterfaceC0507v interfaceC0507v, EnumC0500n enumC0500n) {
        if (enumC0500n != EnumC0500n.ON_START) {
            if (enumC0500n != EnumC0500n.ON_STOP) {
                if (enumC0500n == EnumC0500n.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                E e9 = this.f4403v;
                if (e9 != null) {
                    e9.cancel();
                    return;
                }
                return;
            }
        }
        G g9 = this.f4404w;
        g9.getClass();
        androidx.fragment.app.E onBackPressedCallback = this.f4402u;
        kotlin.jvm.internal.h.e(onBackPressedCallback, "onBackPressedCallback");
        g9.f4392b.addLast(onBackPressedCallback);
        E e10 = new E(g9, onBackPressedCallback);
        onBackPressedCallback.f4789b.add(e10);
        g9.e();
        onBackPressedCallback.f4790c = new F(0, g9, G.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
        this.f4403v = e10;
    }

    @Override // androidx.activity.InterfaceC0455c
    public final void cancel() {
        this.f4401n.b(this);
        this.f4402u.f4789b.remove(this);
        E e9 = this.f4403v;
        if (e9 != null) {
            e9.cancel();
        }
        this.f4403v = null;
    }
}
