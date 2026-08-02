package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.circle_buttons;

import defpackage.fy4;
import defpackage.gri;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.circle_buttons.BaseButtonsStateHolder$special$$inlined$combine$1$3", f = "BaseButtonsStateHolder.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class BaseButtonsStateHolder$special$$inlined$combine$1$3 extends SuspendLambda implements zls {
    int I$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ fy4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseButtonsStateHolder$special$$inlined$combine$1$3(Continuation continuation, fy4 fy4Var) {
        super(3, continuation);
        this.this$0 = fy4Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BaseButtonsStateHolder$special$$inlined$combine$1$3 baseButtonsStateHolder$special$$inlined$combine$1$3 = new BaseButtonsStateHolder$special$$inlined$combine$1$3((Continuation) obj3, this.this$0);
        baseButtonsStateHolder$special$$inlined$combine$1$3.L$0 = (vpr) obj;
        baseButtonsStateHolder$special$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return baseButtonsStateHolder$special$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            Object[] objArr = (Object[]) this.L$1;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            Map map = (Map) objArr[5];
            int intValue = ((Number) obj6).intValue();
            boolean booleanValue = ((Boolean) obj4).booleanValue();
            boolean booleanValue2 = ((Boolean) obj3).booleanValue();
            fy4 fy4Var = this.this$0;
            List singletonList = Collections.singletonList(fy4Var.b((gri) obj2, booleanValue2, booleanValue, (Set) obj5, intValue, map));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(singletonList, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
