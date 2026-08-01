package t0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: t0.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5005U extends AbstractC4993H {

    /* renamed from: a, reason: collision with root package name */
    public boolean f40612a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5026u f40613b;

    public C5005U(C5026u c5026u) {
        this.f40613b = c5026u;
    }

    @Override // t0.AbstractC4993H
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f40612a) {
            this.f40612a = false;
            this.f40613b.f();
        }
    }

    @Override // t0.AbstractC4993H
    public final void b(RecyclerView recyclerView, int i, int i6) {
        if (i == 0 && i6 == 0) {
            return;
        }
        this.f40612a = true;
    }
}
