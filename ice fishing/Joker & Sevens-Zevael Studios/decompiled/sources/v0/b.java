package v0;

import androidx.lifecycle.n0;
import m0.e2;
import m0.z0;
import w0.n;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements e2 {

    /* renamed from: g, reason: collision with root package name */
    public i f7028g;

    /* renamed from: h, reason: collision with root package name */
    public e f7029h;

    /* renamed from: i, reason: collision with root package name */
    public String f7030i;

    /* renamed from: j, reason: collision with root package name */
    public Object f7031j;

    /* renamed from: k, reason: collision with root package name */
    public Object[] f7032k;

    /* renamed from: l, reason: collision with root package name */
    public a5.c f7033l;

    /* renamed from: m, reason: collision with root package name */
    public final n0 f7034m = new n0(6, this);

    public b(i iVar, e eVar, String str, Object obj, Object[] objArr) {
        this.f7028g = iVar;
        this.f7029h = eVar;
        this.f7030i = str;
        this.f7031j = obj;
        this.f7032k = objArr;
    }

    public final void a() {
        String a6;
        e eVar = this.f7029h;
        if (this.f7033l != null) {
            throw new IllegalArgumentException(("entry(" + this.f7033l + ") is not null").toString());
        }
        if (eVar != null) {
            n0 n0Var = this.f7034m;
            Object invoke = n0Var.invoke();
            if (invoke == null || eVar.c(invoke)) {
                this.f7033l = eVar.f(this.f7030i, n0Var);
                return;
            }
            if (invoke instanceof n) {
                n nVar = (n) invoke;
                if (nVar.d() == z0.f4841i || nVar.d() == z0.f4844l || nVar.d() == z0.f4842j) {
                    a6 = "MutableState containing " + nVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    a6 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                a6 = k.a(invoke);
            }
            throw new IllegalArgumentException(a6);
        }
    }

    @Override // m0.e2
    public final void c() {
        a();
    }

    @Override // m0.e2
    public final void e() {
        a5.c cVar = this.f7033l;
        if (cVar != null) {
            cVar.R();
        }
    }

    @Override // m0.e2
    public final void h() {
        a5.c cVar = this.f7033l;
        if (cVar != null) {
            cVar.R();
        }
    }
}
