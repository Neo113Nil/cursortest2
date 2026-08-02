package ru.yandex.taxi.cashback;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.h8b0;
import defpackage.l49;
import defpackage.mvg;
import defpackage.n49;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.cashback.CashbackTeaserController$onExperimentChanged$$inlined$combine$1$3", f = "CashbackTeaserController.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
public final class CashbackTeaserController$onExperimentChanged$$inlined$combine$1$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ n49 receiver$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashbackTeaserController$onExperimentChanged$$inlined$combine$1$3(Continuation continuation, n49 n49Var) {
        super(3, continuation);
        this.receiver$inlined = n49Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CashbackTeaserController$onExperimentChanged$$inlined$combine$1$3 cashbackTeaserController$onExperimentChanged$$inlined$combine$1$3 = new CashbackTeaserController$onExperimentChanged$$inlined$combine$1$3((Continuation) obj3, this.receiver$inlined);
        cashbackTeaserController$onExperimentChanged$$inlined$combine$1$3.L$0 = (vpr) obj;
        cashbackTeaserController$onExperimentChanged$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return cashbackTeaserController$onExperimentChanged$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean z = false;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            boolean booleanValue = ((Boolean) objArr[5]).booleanValue();
            Screen screen = (Screen) obj6;
            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
            boolean booleanValue3 = ((Boolean) obj4).booleanValue();
            h8b0 h8b0Var = (h8b0) obj3;
            boolean booleanValue4 = ((Boolean) obj2).booleanValue();
            n49 n49Var = this.receiver$inlined;
            n49Var.getClass();
            if (!booleanValue2 && booleanValue4 && ((((Boolean) n49Var.d.a.a.b()).booleanValue() || h8b0Var != null) && booleanValue)) {
                z = l49.a[screen.ordinal()] == 1 ? booleanValue3 : true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(valueOf, this) == coroutineSingletons) {
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
