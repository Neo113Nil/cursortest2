package com.squareup.cash.afterpayapplet.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class AfterpayAppletHomePresenter$models$8$5$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $it;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ AfterpayAppletHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AfterpayAppletHomePresenter$models$8$5$1(AfterpayAppletHomePresenter afterpayAppletHomePresenter, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = afterpayAppletHomePresenter;
        this.$it = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        String str = this.$it;
        AfterpayAppletHomePresenter afterpayAppletHomePresenter = this.this$0;
        switch (i) {
            case 0:
                return new AfterpayAppletHomePresenter$models$8$5$1(afterpayAppletHomePresenter, str, continuation, 0);
            default:
                return new AfterpayAppletHomePresenter$models$8$5$1(afterpayAppletHomePresenter, str, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AfterpayAppletHomePresenter$models$8$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        String str = this.$it;
        AfterpayAppletHomePresenter afterpayAppletHomePresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealAfterpayAppletRepository realAfterpayAppletRepository = afterpayAppletHomePresenter.afterpayAppletRepository;
                    this.label = 1;
                    if (realAfterpayAppletRepository.addViewedSectionId(str, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealAfterpayAppletRepository realAfterpayAppletRepository2 = afterpayAppletHomePresenter.afterpayAppletRepository;
                    this.label = 1;
                    Object addViewedMessageId = realAfterpayAppletRepository2.addViewedMessageId(str, this);
                    if (addViewedMessageId != coroutineSingletons2) {
                        addViewedMessageId = Unit.INSTANCE;
                    }
                    if (addViewedMessageId == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                afterpayAppletHomePresenter.hasShownDisplayMessageThisSession$delegate.setValue(Boolean.TRUE);
                break;
        }
        return Unit.INSTANCE;
    }
}
