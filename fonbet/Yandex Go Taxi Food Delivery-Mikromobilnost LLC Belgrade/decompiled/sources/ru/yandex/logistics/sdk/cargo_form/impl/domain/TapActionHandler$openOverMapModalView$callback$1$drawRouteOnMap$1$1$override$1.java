package ru.yandex.logistics.sdk.cargo_form.impl.domain;

import defpackage.c9x0;
import defpackage.h5s;
import defpackage.j5s;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj5s;", "it", "", "<anonymous>", "(Lj5s;)Z"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.domain.TapActionHandler$openOverMapModalView$callback$1$drawRouteOnMap$1$1$override$1", f = "TapActionHandler.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TapActionHandler$openOverMapModalView$callback$1$drawRouteOnMap$1$1$override$1 extends SuspendLambda implements wls {
    final /* synthetic */ c9x0 $action;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapActionHandler$openOverMapModalView$callback$1$drawRouteOnMap$1$1$override$1(c9x0 c9x0Var, Continuation continuation) {
        super(2, continuation);
        this.$action = c9x0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TapActionHandler$openOverMapModalView$callback$1$drawRouteOnMap$1$1$override$1 tapActionHandler$openOverMapModalView$callback$1$drawRouteOnMap$1$1$override$1 = new TapActionHandler$openOverMapModalView$callback$1$drawRouteOnMap$1$1$override$1(this.$action, continuation);
        tapActionHandler$openOverMapModalView$callback$1$drawRouteOnMap$1$1$override$1.L$0 = obj;
        return tapActionHandler$openOverMapModalView$callback$1$drawRouteOnMap$1$1$override$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TapActionHandler$openOverMapModalView$callback$1$drawRouteOnMap$1$1$override$1) create((j5s) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        j5s j5sVar = (j5s) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Object obj2 = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (j5sVar != null) {
            ArrayList arrayList = j5sVar.e;
            c9x0 c9x0Var = this.$action;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (jl40.l(((h5s) next).getId(), c9x0Var.a)) {
                    obj2 = next;
                    break;
                }
            }
            obj2 = (h5s) obj2;
        }
        return Boolean.valueOf(obj2 != null);
    }
}
