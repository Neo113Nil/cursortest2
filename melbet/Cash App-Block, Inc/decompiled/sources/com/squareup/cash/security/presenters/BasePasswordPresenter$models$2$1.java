package com.squareup.cash.security.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.security.viewmodels.PasswordEntryViewEvent;
import com.squareup.protos.franklin.api.BlockerAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class BasePasswordPresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ PasswordEntryViewEvent $event;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $state;
    public int label;
    public final /* synthetic */ BasePasswordPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BasePasswordPresenter$models$2$1(PasswordEntryViewEvent passwordEntryViewEvent, BasePasswordPresenter basePasswordPresenter, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$event = passwordEntryViewEvent;
        this.this$0 = basePasswordPresenter;
        this.$state = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new BasePasswordPresenter$models$2$1(this.$event, this.this$0, this.$state, continuation, 0);
            default:
                return new BasePasswordPresenter$models$2$1(this.$event, this.this$0, this.$state, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((BasePasswordPresenter$models$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (com.squareup.cash.security.presenters.BasePasswordPresenter.access$startSavePasswordWithBiometricsFlow(r0, r2, r1, r11) == r7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        if (r0.setOrVerifyPassword(false, r2, r11.$state, null, r11) == r7) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$state;
        PasswordEntryViewEvent passwordEntryViewEvent = this.$event;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PasswordEntryViewEvent.ActionButtonClick actionButtonClick = (PasswordEntryViewEvent.ActionButtonClick) passwordEntryViewEvent;
                    boolean z = actionButtonClick.savePasswordWithBiometrics;
                    BasePasswordPresenter basePasswordPresenter = this.this$0;
                    if (!z) {
                        PasswordEntryViewEvent.ActionButtonClick.PasswordSubmitData passwordSubmitData = actionButtonClick.passwordSubmitData;
                        this.label = 2;
                        break;
                    } else {
                        PasswordEntryViewEvent.ActionButtonClick.PasswordSubmitData passwordSubmitData2 = actionButtonClick.passwordSubmitData;
                        this.label = 1;
                        break;
                    }
                } else if (i2 != 1 && i2 != 2) {
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
                    BlockerAction blockerAction = ((PasswordEntryViewEvent.HelpMenuItemClick) passwordEntryViewEvent).blockerAction;
                    BasePasswordPresenter basePasswordPresenter2 = this.this$0;
                    RealBlockersHelper realBlockersHelper = basePasswordPresenter2.blockersHelper;
                    BlockersScreens blockersScreens = basePasswordPresenter2.args.screen;
                    BasePasswordPresenter$models$2$5$1 basePasswordPresenter$models$2$5$1 = new BasePasswordPresenter$models$2$5$1(basePasswordPresenter2, mutableState, null);
                    this.label = 1;
                    if (BlockersHelper.handleBlockerAction$default(realBlockersHelper, blockerAction, blockersScreens, null, null, false, null, basePasswordPresenter$models$2$5$1, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
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
