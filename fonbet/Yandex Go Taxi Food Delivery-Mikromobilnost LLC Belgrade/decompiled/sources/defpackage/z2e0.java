package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.layers.domain.PolygonActionsInteractor$special$$inlined$flatMapLatest$1;
import ru.yandex.taxi.layers.domain.PolygonActionsInteractor$special$$inlined$withPreviousEmit$1;

/* loaded from: classes9.dex */
public final class z2e0 {
    public final ysd0 a;
    public final n0 b;
    public final eci0 c;

    public z2e0(tt2 tt2Var, ysd0 ysd0Var) {
        this.a = ysd0Var;
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.b = b;
        g X = e.X(new mth(new j0(null, b, new PolygonActionsInteractor$special$$inlined$withPreviousEmit$1(3, null)), 6), new PolygonActionsInteractor$special$$inlined$flatMapLatest$1(null, this));
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.c = e.O(X, bvf0.a(o400.a), wsr0.a(xsr0.a, 3), 0);
    }

    public static final Object a(z2e0 z2e0Var, vpr vprVar, nm00 nm00Var, Continuation continuation) {
        z2e0Var.getClass();
        return nm00Var == null ? zy11.a : vprVar.emit(new kyi(nm00Var.a), continuation);
    }
}
