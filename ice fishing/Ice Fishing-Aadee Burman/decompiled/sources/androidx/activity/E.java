package androidx.activity;

import v7.C5127h;

/* loaded from: classes.dex */
public final class E implements InterfaceC0451c {

    /* renamed from: n, reason: collision with root package name */
    public final androidx.fragment.app.E f4420n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ G f4421u;

    public E(G g4, androidx.fragment.app.E onBackPressedCallback) {
        kotlin.jvm.internal.h.e(onBackPressedCallback, "onBackPressedCallback");
        this.f4421u = g4;
        this.f4420n = onBackPressedCallback;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [I7.a, kotlin.jvm.internal.g] */
    @Override // androidx.activity.InterfaceC0451c
    public final void cancel() {
        G g4 = this.f4421u;
        C5127h c5127h = g4.f4424b;
        androidx.fragment.app.E e9 = this.f4420n;
        c5127h.remove(e9);
        if (kotlin.jvm.internal.h.a(g4.f4425c, e9)) {
            e9.getClass();
            g4.f4425c = null;
        }
        e9.f4821b.remove(this);
        ?? r02 = e9.f4822c;
        if (r02 != 0) {
            r02.invoke();
        }
        e9.f4822c = null;
    }
}
