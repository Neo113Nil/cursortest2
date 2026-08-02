package ru.yandex.taxi.surge.interactor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.prv0;
import defpackage.pz40;
import defpackage.trv0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.interactor.SummaryWidgetStateInteractor$emitLastHandledWithDelay$1", f = "SummaryWidgetStateInteractor.kt", l = {HProv.PP_CONTAINER_DEFAULT, HProv.PP_LCD_QUERY}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryWidgetStateInteractor$emitLastHandledWithDelay$1 extends SuspendLambda implements wls {
    final /* synthetic */ pz40 $widgetStateFlow;
    Object L$0;
    int label;
    final /* synthetic */ trv0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryWidgetStateInteractor$emitLastHandledWithDelay$1(trv0 trv0Var, pz40 pz40Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = trv0Var;
        this.$widgetStateFlow = pz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryWidgetStateInteractor$emitLastHandledWithDelay$1(this.this$0, this.$widgetStateFlow, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryWidgetStateInteractor$emitLastHandledWithDelay$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (kotlinx.coroutines.a.i(1000, r7) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        prv0 prv0Var = this.this$0.j;
        if (prv0Var != null) {
            pz40 pz40Var = this.$widgetStateFlow;
            this.L$0 = null;
            this.label = 2;
            ((r0) pz40Var).emit(prv0Var, this);
            if (zy11Var == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
