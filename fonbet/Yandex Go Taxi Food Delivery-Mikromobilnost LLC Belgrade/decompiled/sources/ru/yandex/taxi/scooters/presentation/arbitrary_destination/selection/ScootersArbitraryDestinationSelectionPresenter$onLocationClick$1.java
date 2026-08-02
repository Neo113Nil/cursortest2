package ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection;

import defpackage.ah00;
import defpackage.gh00;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.po21;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.ScootersArbitraryDestinationSelectionPresenter$onLocationClick$1", f = "ScootersArbitraryDestinationSelectionPresenter.kt", l = {HProv.PP_NK_SYNC}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class ScootersArbitraryDestinationSelectionPresenter$onLocationClick$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersArbitraryDestinationSelectionPresenter$onLocationClick$1(Continuation continuation, d dVar) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersArbitraryDestinationSelectionPresenter$onLocationClick$1(continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersArbitraryDestinationSelectionPresenter$onLocationClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ah00 ah00Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            ah00 ah00Var2 = dVar.y;
            po21 po21Var = dVar.C;
            this.L$0 = ah00Var2;
            this.label = 1;
            obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).h(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            ah00Var = ah00Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ah00Var = (ah00) this.L$0;
            kotlin.b.b(obj);
        }
        ((gh00) ah00Var).C(ru.yandex.taxi.map.utils.a.G((mo21) obj));
        return zy11.a;
    }
}
