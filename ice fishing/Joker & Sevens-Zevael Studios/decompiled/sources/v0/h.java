package v0;

import android.os.Bundle;
import androidx.lifecycle.n0;
import androidx.lifecycle.w;
import java.util.Map;
import x4.l;
import x4.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h implements e, e4.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f7044g;

    /* renamed from: h, reason: collision with root package name */
    public final s f7045h;

    /* renamed from: i, reason: collision with root package name */
    public final w f7046i;

    /* renamed from: j, reason: collision with root package name */
    public final l f7047j;

    public h(f fVar) {
        this.f7044g = fVar;
        s sVar = new s(new g4.a(this, new n0(1, this)));
        this.f7045h = sVar;
        this.f7046i = new w(this, false);
        this.f7047j = (l) sVar.f8357i;
        Object e10 = fVar.e("androidx.savedstate.SavedStateRegistry");
        sVar.h(e10 instanceof Bundle ? (Bundle) e10 : null);
        fVar.f("androidx.savedstate.SavedStateRegistry", new n0(7, this));
    }

    @Override // e4.e
    public final l b() {
        return this.f7047j;
    }

    @Override // v0.e
    public final boolean c(Object obj) {
        return this.f7044g.c(obj);
    }

    @Override // v0.e
    public final Map d() {
        return this.f7044g.d();
    }

    @Override // v0.e
    public final Object e(String str) {
        return this.f7044g.e(str);
    }

    @Override // v0.e
    public final a5.c f(String str, oc.a aVar) {
        return this.f7044g.f(str, aVar);
    }

    @Override // androidx.lifecycle.u
    public final w h() {
        return this.f7046i;
    }
}
