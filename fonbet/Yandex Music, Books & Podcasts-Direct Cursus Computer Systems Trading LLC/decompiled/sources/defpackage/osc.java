package defpackage;

import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public abstract class osc extends f8g {
    @Override // defpackage.f8g
    public f8g C(Executor executor) {
        j0().C(executor);
        return this;
    }

    @Override // defpackage.f8g
    public f8g I(List list) {
        j0().I(list);
        return this;
    }

    @Override // defpackage.f8g
    public f8g L(Executor executor) {
        j0().L(executor);
        return this;
    }

    public abstract f8g j0();

    @Override // defpackage.f8g
    public t7h k() {
        return j0().k();
    }

    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.q(j0(), "delegate");
        return Y.toString();
    }
}
