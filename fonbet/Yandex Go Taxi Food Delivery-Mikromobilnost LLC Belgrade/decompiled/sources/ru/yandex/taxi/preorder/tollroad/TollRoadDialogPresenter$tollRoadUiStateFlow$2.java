package ru.yandex.taxi.preorder.tollroad;

import defpackage.frz0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qpz0;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "", "Lntk0;", "roadOptions", "Lfrz0;", "<anonymous>", "(Ljava/lang/String;Ljava/util/List;)Lfrz0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.tollroad.TollRoadDialogPresenter$tollRoadUiStateFlow$2", f = "TollRoadDialogPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TollRoadDialogPresenter$tollRoadUiStateFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ qpz0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TollRoadDialogPresenter$tollRoadUiStateFlow$2(qpz0 qpz0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = qpz0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TollRoadDialogPresenter$tollRoadUiStateFlow$2 tollRoadDialogPresenter$tollRoadUiStateFlow$2 = new TollRoadDialogPresenter$tollRoadUiStateFlow$2(this.this$0, (Continuation) obj3);
        tollRoadDialogPresenter$tollRoadUiStateFlow$2.L$0 = (String) obj;
        tollRoadDialogPresenter$tollRoadUiStateFlow$2.L$1 = (List) obj2;
        return tollRoadDialogPresenter$tollRoadUiStateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        List list = (List) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new frz0(this.this$0.D, str, list, qpz0.Kg(list));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
