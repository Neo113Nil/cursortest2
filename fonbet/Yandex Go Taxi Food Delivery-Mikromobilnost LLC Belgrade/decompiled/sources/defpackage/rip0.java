package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.j;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.Anchor;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.ScrollTagStateHolder$tagFlow$lambda$1$$inlined$combine$1$3;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.e;

/* loaded from: classes5.dex */
public final class rip0 implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ e b;
    public final /* synthetic */ List c;
    public final /* synthetic */ zii0 w;
    public final /* synthetic */ Anchor x;

    public rip0(tpr[] tprVarArr, e eVar, List list, zii0 zii0Var, Anchor anchor) {
        this.a = tprVarArr;
        this.b = eVar;
        this.c = list;
        this.w = zii0Var;
        this.x = anchor;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        tpr[] tprVarArr = this.a;
        Object a = j.a(vprVar, new ab00(tprVarArr, 20), new ScrollTagStateHolder$tagFlow$lambda$1$$inlined$combine$1$3(null, this.b, this.c, this.w, this.x), continuation, tprVarArr);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }
}
