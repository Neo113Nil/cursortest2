package com.squareup.cash.moneybot.presenters.plugins;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.TemplateCard;
import com.squareup.protos.cash.piggybank.appapi.PiggybankAppService;
import com.squareup.protos.cash.piggybank.appapi.RefreshSavingsAppletRequest;
import com.squareup.protos.franklin.common.RequestContext;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class TemplateCardPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ TemplateCardPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TemplateCardPresenter$models$1$1(TemplateCardPresenter templateCardPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = templateCardPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        TemplateCardPresenter templateCardPresenter = this.this$0;
        switch (i) {
            case 0:
                return new TemplateCardPresenter$models$1$1(templateCardPresenter, continuation, 0);
            default:
                return new TemplateCardPresenter$models$1$1(templateCardPresenter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((TemplateCardPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        TemplateCardPresenter templateCardPresenter = this.this$0;
        Continuation continuation = null;
        int i2 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ArrayList allPickers = TemplateCardPresenterKt.allPickers(templateCardPresenter.metadata);
                    if (!allPickers.isEmpty()) {
                        Iterator it = allPickers.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((TemplateCard.Picker) ((Pair) it.next()).second) instanceof TemplateCard.Picker.SavingsTransferOptionPicker) {
                                    CoroutineContext coroutineContext = templateCardPresenter.ioDispatcher;
                                    TemplateCardPresenter$models$1$1 templateCardPresenter$models$1$1 = new TemplateCardPresenter$models$1$1(templateCardPresenter, continuation, i2);
                                    this.label = 1;
                                    if (JobKt.withContext(coroutineContext, templateCardPresenter$models$1$1, this) == coroutineSingletons) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PiggybankAppService piggybankAppService = templateCardPresenter.appService;
                    RefreshSavingsAppletRequest refreshSavingsAppletRequest = new RefreshSavingsAppletRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191), 2);
                    this.label = 1;
                    if (piggybankAppService.refreshSavingsApplet(refreshSavingsAppletRequest, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
