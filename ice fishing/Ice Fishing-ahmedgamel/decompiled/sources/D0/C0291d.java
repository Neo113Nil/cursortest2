package D0;

import a.AbstractC0426a;
import android.view.ViewGroup;

/* renamed from: D0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0291d extends p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f442a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f443b;

    public C0291d(ViewGroup viewGroup) {
        this.f443b = viewGroup;
    }

    @Override // D0.p, D0.m
    public final void b() {
        AbstractC0426a.p(this.f443b, false);
    }

    @Override // D0.p, D0.m
    public final void c(o oVar) {
        AbstractC0426a.p(this.f443b, false);
        this.f442a = true;
    }

    @Override // D0.m
    public final void d(o oVar) {
        if (!this.f442a) {
            AbstractC0426a.p(this.f443b, false);
        }
        oVar.C(this);
    }

    @Override // D0.p, D0.m
    public final void e() {
        AbstractC0426a.p(this.f443b, true);
    }
}
