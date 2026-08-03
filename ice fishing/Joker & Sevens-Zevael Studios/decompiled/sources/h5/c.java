package h5;

import android.os.Bundle;
import androidx.lifecycle.f;
import androidx.lifecycle.o;
import androidx.lifecycle.u;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f2851g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Bundle f2852h;

    public c(d dVar, Bundle bundle) {
        this.f2851g = dVar;
        this.f2852h = bundle;
    }

    @Override // androidx.lifecycle.f
    public final void a(u uVar) {
        d.j(this.f2851g.f2857g, o.ON_RESUME);
    }

    @Override // androidx.lifecycle.f
    public final void d(u uVar) {
        d.j(this.f2851g.f2857g, o.ON_PAUSE);
    }

    @Override // androidx.lifecycle.f
    public final void f(u uVar) {
        d.j(this.f2851g.f2857g, o.ON_START);
    }

    @Override // androidx.lifecycle.f
    public final void g(u uVar) {
        d dVar = this.f2851g;
        d.j(dVar.f2857g, o.ON_STOP);
        dVar.f2861k.i(this.f2852h);
    }
}
