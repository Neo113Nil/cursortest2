package defpackage;

import com.yandex.music.core.ui.compose.draggable.a;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class e2o {
    public final ja0 a;
    public final t6k b;
    public final t6k c;
    public final x6k d;
    public final t6k e;
    public final t6k f;
    public final t6k g;
    public final u6k h;
    public final u6k i;
    public final x6k j;

    public e2o(d2o d2oVar, float f, float f2) {
        d2oVar.getClass();
        if (f2 < f) {
            throw new IllegalStateException(("expandedFraction must be greater than or equal to halfExpandedFraction: expandedFraction=" + f2 + " and halfExpandedFraction=" + f).toString());
        }
        this.a = new ja0(d2oVar);
        this.b = new t6k(f);
        this.c = new t6k(f2);
        Boolean bool = Boolean.FALSE;
        this.d = szf.g0(bool);
        this.e = new t6k(0.0f);
        this.f = new t6k(0.0f);
        this.g = new t6k(0.0f);
        this.h = new u6k(0);
        this.i = new u6k(0);
        this.j = szf.g0(bool);
    }

    public final boolean a() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public final void b(boolean z) {
        x6k x6kVar = this.d;
        if (!z) {
            if (a()) {
                this.j.setValue(Boolean.TRUE);
                x6kVar.setValue(Boolean.FALSE);
                return;
            }
            return;
        }
        if (a()) {
            return;
        }
        this.a.j(a.b(new mjm(13, this)), d2o.a);
        this.g.h(1.0f);
        x6kVar.setValue(Boolean.TRUE);
    }

    public final Object c(b9r b9rVar, cg6 cg6Var) {
        Object h;
        ja0 ja0Var = this.a;
        Object value = ja0Var.g.getValue();
        Object a = ja0Var.c().a(ja0Var.g());
        if (a == null || !((Boolean) ja0Var.a.invoke(a)).booleanValue()) {
            h = a.h(ja0Var, value, b9rVar, cg6Var);
            if (h != nm6.a) {
                h = Unit.a;
            }
        } else {
            h = a.h(ja0Var, a, b9rVar, cg6Var);
            if (h != nm6.a) {
                h = Unit.a;
            }
        }
        return h == nm6.a ? h : Unit.a;
    }
}
