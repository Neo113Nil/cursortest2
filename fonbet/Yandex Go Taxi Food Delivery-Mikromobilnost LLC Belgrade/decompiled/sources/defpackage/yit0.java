package defpackage;

import com.yandex.go.preorder.map.b;
import com.yandex.go.taxi.summary.api.ui.MapPositionAction;
import kotlin.collections.a;

/* loaded from: classes13.dex */
public final class yit0 {
    public final ou7 a;
    public final biv0 b;
    public final b c;
    public final hit0 d;
    public final rft0 e;

    public yit0(ou7 ou7Var, biv0 biv0Var, b bVar, hit0 hit0Var, rft0 rft0Var) {
        this.a = ou7Var;
        this.b = biv0Var;
        this.c = bVar;
        this.d = hit0Var;
        this.e = rft0Var;
    }

    public final void a(MapPositionAction mapPositionAction) {
        this.c.b(mapPositionAction);
        iit0 iit0Var = (iit0) a.b0(this.d.a);
        if (iit0Var != null) {
            iit0Var.b();
        }
    }

    public final void c(bov0 bov0Var) {
        iit0 iit0Var;
        if (!this.a.a()) {
            ((qht0) this.e).b.Z();
            return;
        }
        jpv0 b = this.b.b();
        b.getClass();
        if ((b instanceof hpv0) || (iit0Var = (iit0) a.b0(this.d.a)) == null) {
            return;
        }
        iit0Var.a(bov0Var);
    }
}
