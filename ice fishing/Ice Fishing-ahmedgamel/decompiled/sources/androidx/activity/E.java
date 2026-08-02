package androidx.activity;

import v7.C5117h;

/* loaded from: classes.dex */
public final class E implements InterfaceC0455c {

    /* renamed from: n, reason: collision with root package name */
    public final androidx.fragment.app.E f4388n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ G f4389u;

    public E(G g9, androidx.fragment.app.E onBackPressedCallback) {
        kotlin.jvm.internal.h.e(onBackPressedCallback, "onBackPressedCallback");
        this.f4389u = g9;
        this.f4388n = onBackPressedCallback;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [I7.a, kotlin.jvm.internal.g] */
    @Override // androidx.activity.InterfaceC0455c
    public final void cancel() {
        G g9 = this.f4389u;
        C5117h c5117h = g9.f4392b;
        androidx.fragment.app.E e9 = this.f4388n;
        c5117h.remove(e9);
        if (kotlin.jvm.internal.h.a(g9.f4393c, e9)) {
            e9.getClass();
            g9.f4393c = null;
        }
        e9.f4789b.remove(this);
        ?? r02 = e9.f4790c;
        if (r02 != 0) {
            r02.invoke();
        }
        e9.f4790c = null;
    }
}
