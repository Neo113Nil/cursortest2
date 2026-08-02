package ru.yandex.taxi.requirements.interactor;

import androidx.media3.exoplayer.offline.DownloadService;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ou1;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lou1;", "altChoiceBubble", "", "Lb580;", DownloadService.KEY_REQUIREMENTS, "Lkotlin/Triple;", "Lpex0;", "<anonymous>", "(Lou1;Ljava/util/List;)Lkotlin/Triple;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.requirements.interactor.RequirementBubbleDataInteractor$listenBubbles$3$1", f = "RequirementBubbleDataInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RequirementBubbleDataInteractor$listenBubbles$3$1 extends SuspendLambda implements zls {
    final /* synthetic */ mi31 $verticalTariff;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequirementBubbleDataInteractor$listenBubbles$3$1(mi31 mi31Var, Continuation continuation) {
        super(3, continuation);
        this.$verticalTariff = mi31Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RequirementBubbleDataInteractor$listenBubbles$3$1 requirementBubbleDataInteractor$listenBubbles$3$1 = new RequirementBubbleDataInteractor$listenBubbles$3$1(this.$verticalTariff, (Continuation) obj3);
        requirementBubbleDataInteractor$listenBubbles$3$1.L$0 = (ou1) obj;
        requirementBubbleDataInteractor$listenBubbles$3$1.L$1 = (List) obj2;
        return requirementBubbleDataInteractor$listenBubbles$3$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ou1 ou1Var = (ou1) this.L$0;
        List list = (List) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        mi31 mi31Var = this.$verticalTariff;
        return new Triple(mi31Var != null ? mi31Var.a : null, list, ou1Var);
    }
}
