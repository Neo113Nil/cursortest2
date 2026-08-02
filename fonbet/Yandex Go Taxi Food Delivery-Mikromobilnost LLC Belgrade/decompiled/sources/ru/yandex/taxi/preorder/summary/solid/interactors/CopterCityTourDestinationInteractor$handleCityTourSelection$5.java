package ru.yandex.taxi.preorder.summary.solid.interactors;

import com.yandex.go.address.models.Address;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpex0;", "it", "Lzy11;", "<anonymous>", "(Lpex0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.solid.interactors.CopterCityTourDestinationInteractor$handleCityTourSelection$5", f = "CopterCityTourDestinationInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class CopterCityTourDestinationInteractor$handleCityTourSelection$5 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopterCityTourDestinationInteractor$handleCityTourSelection$5(Continuation continuation, s sVar) {
        super(2, continuation);
        this.this$0 = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CopterCityTourDestinationInteractor$handleCityTourSelection$5(continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CopterCityTourDestinationInteractor$handleCityTourSelection$5 copterCityTourDestinationInteractor$handleCityTourSelection$5 = (CopterCityTourDestinationInteractor$handleCityTourSelection$5) create((pex0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        copterCityTourDestinationInteractor$handleCityTourSelection$5.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        s sVar = this.this$0;
        Address d = sVar.d.d();
        if (d != null) {
            sVar.e.p(Collections.singletonList(d));
        }
        return zy11.a;
    }
}
