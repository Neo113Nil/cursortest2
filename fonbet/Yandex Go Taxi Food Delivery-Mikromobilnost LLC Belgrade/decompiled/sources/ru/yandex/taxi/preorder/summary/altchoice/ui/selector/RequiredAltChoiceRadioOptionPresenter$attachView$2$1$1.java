package ru.yandex.taxi.preorder.summary.altchoice.ui.selector;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.saj0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "selectedKey", "selectedSlot", "Lkotlin/Triple;", "Lsaj0;", "<anonymous>", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/Triple;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.altchoice.ui.selector.RequiredAltChoiceRadioOptionPresenter$attachView$2$1$1", f = "RequiredAltChoiceRadioOptionPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RequiredAltChoiceRadioOptionPresenter$attachView$2$1$1 extends SuspendLambda implements zls {
    final /* synthetic */ saj0 $altChoice;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequiredAltChoiceRadioOptionPresenter$attachView$2$1$1(saj0 saj0Var, Continuation continuation) {
        super(3, continuation);
        this.$altChoice = saj0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RequiredAltChoiceRadioOptionPresenter$attachView$2$1$1 requiredAltChoiceRadioOptionPresenter$attachView$2$1$1 = new RequiredAltChoiceRadioOptionPresenter$attachView$2$1$1(this.$altChoice, (Continuation) obj3);
        requiredAltChoiceRadioOptionPresenter$attachView$2$1$1.L$0 = (String) obj;
        requiredAltChoiceRadioOptionPresenter$attachView$2$1$1.L$1 = (String) obj2;
        return requiredAltChoiceRadioOptionPresenter$attachView$2$1$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        String str2 = (String) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Triple(this.$altChoice, str, str2);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
