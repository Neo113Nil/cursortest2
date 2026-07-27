package D0;

import android.view.ViewGroup;

/* renamed from: D0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0303d extends p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f547a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f548b;

    public C0303d(ViewGroup viewGroup) {
        this.f548b = viewGroup;
    }

    @Override // D0.p, D0.m
    public final void b() {
        com.bumptech.glide.g.i(this.f548b, false);
    }

    @Override // D0.p, D0.m
    public final void c(o oVar) {
        com.bumptech.glide.g.i(this.f548b, false);
        this.f547a = true;
    }

    @Override // D0.m
    public final void d(o oVar) {
        if (!this.f547a) {
            com.bumptech.glide.g.i(this.f548b, false);
        }
        oVar.C(this);
    }

    @Override // D0.p, D0.m
    public final void e() {
        com.bumptech.glide.g.i(this.f548b, true);
    }
}
