package ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection;

import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import defpackage.aym0;
import defpackage.byx;
import defpackage.c430;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.xnt;
import defpackage.zuo0;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzuo0;", "scootersSessionState", "Lzy11;", "<anonymous>", "(Lzuo0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.ScootersArbitraryDestinationSelectionPresenter$listenSessionState$1", f = "ScootersArbitraryDestinationSelectionPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersArbitraryDestinationSelectionPresenter$listenSessionState$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersArbitraryDestinationSelectionPresenter$listenSessionState$1(Continuation continuation, d dVar) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersArbitraryDestinationSelectionPresenter$listenSessionState$1 scootersArbitraryDestinationSelectionPresenter$listenSessionState$1 = new ScootersArbitraryDestinationSelectionPresenter$listenSessionState$1(continuation, this.this$0);
        scootersArbitraryDestinationSelectionPresenter$listenSessionState$1.L$0 = obj;
        return scootersArbitraryDestinationSelectionPresenter$listenSessionState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ScootersArbitraryDestinationSelectionPresenter$listenSessionState$1 scootersArbitraryDestinationSelectionPresenter$listenSessionState$1 = (ScootersArbitraryDestinationSelectionPresenter$listenSessionState$1) create((zuo0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        scootersArbitraryDestinationSelectionPresenter$listenSessionState$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlinx.serialization.json.b bVar;
        zuo0 zuo0Var = (zuo0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.this$0;
        zzs zzsVar = dVar.I;
        if (zzsVar != null) {
            bVar = ((xnt) dVar.x).a(zzsVar, zzs.Companion.serializer());
        } else {
            bVar = null;
        }
        dVar.G.b(new byx(Screen.CHOOSE_B, new c430(Mode.SCOOTERS, (kotlinx.serialization.json.b) null, new aym0(bVar, zuo0Var.getNumber()))));
        return zy11.a;
    }
}
