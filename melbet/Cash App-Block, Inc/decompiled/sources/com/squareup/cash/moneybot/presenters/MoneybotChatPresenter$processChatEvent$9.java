package com.squareup.cash.moneybot.presenters;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.moneybot.backend.api.model.chat.WidgetConfig$PromptMessageConfig;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotWidgetManager;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class MoneybotChatPresenter$processChatEvent$9 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MoneybotChatViewEvent $event;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ MoneybotChatPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoneybotChatPresenter$processChatEvent$9(MoneybotChatPresenter moneybotChatPresenter, MoneybotChatViewEvent moneybotChatViewEvent, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = moneybotChatPresenter;
        this.$event = moneybotChatViewEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MoneybotChatViewEvent moneybotChatViewEvent = this.$event;
        MoneybotChatPresenter moneybotChatPresenter = this.this$0;
        switch (i) {
            case 0:
                return new MoneybotChatPresenter$processChatEvent$9(moneybotChatPresenter, moneybotChatViewEvent, continuation, 0);
            default:
                return new MoneybotChatPresenter$processChatEvent$9(moneybotChatPresenter, moneybotChatViewEvent, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((MoneybotChatPresenter$processChatEvent$9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r2.displayToast(r9, r8) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005e, code lost:
    
        if (r9 == r0) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MoneybotChatViewModel.Content.ToastMessage toastMessage;
        int i = this.$r8$classId;
        MoneybotChatViewEvent moneybotChatViewEvent = this.$event;
        MoneybotChatPresenter moneybotChatPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealMoneybotWidgetManager realMoneybotWidgetManager = moneybotChatPresenter.moneybotWidgetManager;
                    WidgetConfig$PromptMessageConfig widgetConfig$PromptMessageConfig = new WidgetConfig$PromptMessageConfig(((MoneybotChatViewEvent.PinMessage) moneybotChatViewEvent).prompt);
                    this.label = 1;
                    obj = realMoneybotWidgetManager.addWidget(widgetConfig$PromptMessageConfig, this);
                    break;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    toastMessage = MoneybotChatViewModel.Content.ToastMessage.PinSucceeded;
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    toastMessage = MoneybotChatViewModel.Content.ToastMessage.PinFailed;
                }
                this.label = 2;
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    EglCore eglCore = moneybotChatPresenter.memoryTooltipManager;
                    String str = ((MoneybotChatViewEvent.MemoryTooltipDismissed) moneybotChatViewEvent).messageToken;
                    this.label = 1;
                    if (eglCore.dismissTooltip(str, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
