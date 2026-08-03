package y1;

import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a2 implements m0.u, androidx.lifecycle.s {

    /* renamed from: g, reason: collision with root package name */
    public final r f8468g;

    /* renamed from: h, reason: collision with root package name */
    public final m0.y f8469h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8470i;

    /* renamed from: j, reason: collision with root package name */
    public androidx.lifecycle.w f8471j;

    /* renamed from: k, reason: collision with root package name */
    public oc.e f8472k = w0.f8668a;

    public a2(r rVar, m0.y yVar) {
        this.f8468g = rVar;
        this.f8469h = yVar;
    }

    @Override // androidx.lifecycle.s
    public final void b(androidx.lifecycle.u uVar, androidx.lifecycle.o oVar) {
        if (oVar == androidx.lifecycle.o.ON_DESTROY) {
            c();
        } else {
            if (oVar != androidx.lifecycle.o.ON_CREATE || this.f8470i) {
                return;
            }
            e(this.f8472k);
        }
    }

    public final void c() {
        if (!this.f8470i) {
            this.f8470i = true;
            this.f8468g.getView().setTag(R.id.wrapped_composition_tag, null);
            androidx.lifecycle.w wVar = this.f8471j;
            if (wVar != null) {
                wVar.f(this);
            }
        }
        this.f8469h.l();
    }

    public final void e(oc.e eVar) {
        this.f8468g.setOnViewTreeOwnersAvailable(new b0.l0(25, this, eVar));
    }
}
