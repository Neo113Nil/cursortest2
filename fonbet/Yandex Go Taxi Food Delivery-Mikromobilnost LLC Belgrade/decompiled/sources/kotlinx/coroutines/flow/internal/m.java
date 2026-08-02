package kotlinx.coroutines.flow.internal;

import defpackage.fse;
import defpackage.gwk0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes4.dex */
public final class m implements vpr {
    public final fse a;
    public final Object b;
    public final wls c;

    public m(vpr vprVar, fse fseVar) {
        this.a = fseVar;
        this.b = fseVar.fold(0, gwk0.e);
        this.c = new UndispatchedContextCollector$emitRef$1(vprVar, null);
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object b = b.b(this.a, obj, this.b, this.c, continuation);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : zy11.a;
    }
}
