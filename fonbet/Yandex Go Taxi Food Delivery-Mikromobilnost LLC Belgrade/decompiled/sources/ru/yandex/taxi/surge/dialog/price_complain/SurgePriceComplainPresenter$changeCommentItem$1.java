package ru.yandex.taxi.surge.dialog.price_complain;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wt60;
import defpackage.wuw0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.dialog.price_complain.SurgePriceComplainPresenter$changeCommentItem$1", f = "SurgePriceComplainPresenter.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgePriceComplainPresenter$changeCommentItem$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $text;
    Object L$0;
    int label;
    final /* synthetic */ wuw0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgePriceComplainPresenter$changeCommentItem$1(wuw0 wuw0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wuw0Var;
        this.$text = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SurgePriceComplainPresenter$changeCommentItem$1(this.this$0, this.$text, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgePriceComplainPresenter$changeCommentItem$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            wt60 Kg = wuw0.Kg(this.this$0);
            if (Kg != null) {
                wuw0 wuw0Var = this.this$0;
                String str = this.$text;
                ru.yandex.taxi.surge.repository.a aVar = wuw0Var.B;
                this.L$0 = null;
                this.label = 1;
                if (aVar.d(Kg, str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
