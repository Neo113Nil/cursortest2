package t0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: t0.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5034S extends AbstractC5022F {

    /* renamed from: a, reason: collision with root package name */
    public boolean f40634a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5058u f40635b;

    public C5034S(C5058u c5058u) {
        this.f40635b = c5058u;
    }

    @Override // t0.AbstractC5022F
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f40634a) {
            this.f40634a = false;
            this.f40635b.f();
        }
    }

    @Override // t0.AbstractC5022F
    public final void b(RecyclerView recyclerView, int i, int i4) {
        if (i == 0 && i4 == 0) {
            return;
        }
        this.f40634a = true;
    }
}
