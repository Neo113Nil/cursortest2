package androidx.activity;

import r7.C4977h;

/* loaded from: classes.dex */
public final class E implements InterfaceC0461c {

    /* renamed from: n, reason: collision with root package name */
    public final androidx.fragment.app.E f4535n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ G f4536u;

    public E(G g9, androidx.fragment.app.E onBackPressedCallback) {
        kotlin.jvm.internal.h.e(onBackPressedCallback, "onBackPressedCallback");
        this.f4536u = g9;
        this.f4535n = onBackPressedCallback;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [E7.a, kotlin.jvm.internal.g] */
    @Override // androidx.activity.InterfaceC0461c
    public final void cancel() {
        G g9 = this.f4536u;
        C4977h c4977h = g9.f4539b;
        androidx.fragment.app.E e6 = this.f4535n;
        c4977h.remove(e6);
        if (kotlin.jvm.internal.h.a(g9.f4540c, e6)) {
            e6.getClass();
            g9.f4540c = null;
        }
        e6.f4933b.remove(this);
        ?? r02 = e6.f4934c;
        if (r02 != 0) {
            r02.invoke();
        }
        e6.f4934c = null;
    }
}
