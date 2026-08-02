package kotlinx.coroutines.flow.internal;

import defpackage.sb2;
import defpackage.sls;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public abstract class j {
    public static final Object a(vpr vprVar, sls slsVar, zls zlsVar, Continuation continuation, tpr[] tprVarArr) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(vprVar, slsVar, zlsVar, null, tprVarArr);
        zpr zprVar = new zpr(continuation.get_context(), continuation);
        Object H = sb2.H(zprVar, true, zprVar, combineKt$combineInternal$2);
        return H == CoroutineSingletons.COROUTINE_SUSPENDED ? H : zy11.a;
    }
}
