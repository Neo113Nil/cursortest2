package p0;

import android.view.ViewGroup;

/* renamed from: p0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326d extends n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4153a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f4154b;

    public C0326d(ViewGroup viewGroup) {
        this.f4154b = viewGroup;
    }

    @Override // p0.n, p0.k
    public final void a() {
        h0.f.C(this.f4154b, false);
    }

    @Override // p0.k
    public final void c(m mVar) {
        if (!this.f4153a) {
            h0.f.C(this.f4154b, false);
        }
        mVar.x(this);
    }

    @Override // p0.n, p0.k
    public final void e() {
        h0.f.C(this.f4154b, true);
    }

    @Override // p0.n, p0.k
    public final void f(m mVar) {
        h0.f.C(this.f4154b, false);
        this.f4153a = true;
    }
}
