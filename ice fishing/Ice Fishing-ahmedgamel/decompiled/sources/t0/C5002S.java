package t0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: t0.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5002S extends AbstractC4990F {

    /* renamed from: a, reason: collision with root package name */
    public boolean f40662a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5025u f40663b;

    public C5002S(C5025u c5025u) {
        this.f40663b = c5025u;
    }

    @Override // t0.AbstractC4990F
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f40662a) {
            this.f40662a = false;
            this.f40663b.f();
        }
    }

    @Override // t0.AbstractC4990F
    public final void b(RecyclerView recyclerView, int i, int i4) {
        if (i == 0 && i4 == 0) {
            return;
        }
        this.f40662a = true;
    }
}
