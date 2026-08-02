package defpackage;

import com.yandex.music.core.ui.compose.draggable.a;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class za0 implements ya0 {
    public final ja0 a;

    public za0(ja0 ja0Var) {
        this.a = ja0Var;
    }

    @Override // defpackage.ya0
    public final Object a() {
        return this.a.g.getValue();
    }

    @Override // defpackage.ya0
    public final void b(List list) {
        list.getClass();
        ja0.k(this.a, a.b(new h50(list, 1)));
    }

    @Override // defpackage.ya0
    public final yci c(boolean z) {
        return a.f(vci.a, this.a, bxj.b, z, null, null, 56);
    }

    @Override // defpackage.ya0
    public final Object d() {
        return this.a.h.getValue();
    }

    @Override // defpackage.ya0
    public final Object e(d44 d44Var, ga3 ga3Var) {
        Object i = a.i(this.a, d44Var, ga3Var);
        return i == nm6.a ? i : Unit.a;
    }

    @Override // defpackage.ya0
    public final float getOffset() {
        return this.a.j.e();
    }
}
