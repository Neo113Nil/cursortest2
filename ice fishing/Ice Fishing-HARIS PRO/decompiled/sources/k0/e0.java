package k0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class e0 extends N {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3477a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0211z f3478b;

    public e0(C0211z c0211z) {
        this.f3478b = c0211z;
    }

    @Override // k0.N
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f3477a) {
            this.f3477a = false;
            this.f3478b.f();
        }
    }

    @Override // k0.N
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f3477a = true;
    }
}
