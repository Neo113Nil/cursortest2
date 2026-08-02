package ru.yandex.taxi.zalogin;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjy;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.zalogin.LinkAccountInteractor$performLinkage$1$accountLinkedResult$1", f = "LinkAccountInteractor.kt", l = {66}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class LinkAccountInteractor$performLinkage$1$accountLinkedResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ Events$Zalogin$LinkageContext $context;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ sjy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAccountInteractor$performLinkage$1$accountLinkedResult$1(sjy sjyVar, Events$Zalogin$LinkageContext events$Zalogin$LinkageContext, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sjyVar;
        this.$context = events$Zalogin$LinkageContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LinkAccountInteractor$performLinkage$1$accountLinkedResult$1 linkAccountInteractor$performLinkage$1$accountLinkedResult$1 = new LinkAccountInteractor$performLinkage$1$accountLinkedResult$1(this.this$0, this.$context, continuation);
        linkAccountInteractor$performLinkage$1$accountLinkedResult$1.L$0 = obj;
        return linkAccountInteractor$performLinkage$1$accountLinkedResult$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LinkAccountInteractor$performLinkage$1$accountLinkedResult$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                sjy sjyVar = this.this$0;
                Events$Zalogin$LinkageContext events$Zalogin$LinkageContext = this.$context;
                j jVar = sjyVar.b;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                obj = jVar.c(events$Zalogin$LinkageContext, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            failure = (Boolean) obj;
            failure.getClass();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return new Result(failure);
    }
}
