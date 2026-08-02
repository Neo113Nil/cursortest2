package com.squareup.cash.session.backend;

import androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.initialscreenloader.backend.AppVersionCheckerActivityWorker;
import com.squareup.cash.investing.backend.real.RealInvestingSyncer;
import com.squareup.cash.investing.backend.real.RealInvestingSyncer$syncSettings$2;
import com.squareup.preferences.SharedPreferencesKeyValue;
import com.squareup.protos.cash.janus.api.GetAccountSettingsRequest;
import com.squareup.protos.cash.janus.api.JanusService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.CheckVersionRequest;
import com.squareup.protos.franklin.app.CheckVersionResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobKt;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealSessionManager$updateSessionState$newOnboarded$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealSessionManager$updateSessionState$newOnboarded$1(Object obj, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        Object obj = this.this$0;
        switch (i) {
            case 0:
                return new RealSessionManager$updateSessionState$newOnboarded$1((RealSessionManager) obj, continuation, 0);
            case 1:
                return new RealSessionManager$updateSessionState$newOnboarded$1((TextFieldCoreModifierNode) obj, continuation, 1);
            case 2:
                return new RealSessionManager$updateSessionState$newOnboarded$1((RealSettingsEligibilityManager) obj, continuation, 2);
            case 3:
                return new RealSessionManager$updateSessionState$newOnboarded$1((AppVersionCheckerActivityWorker) obj, continuation, 3);
            default:
                return new RealSessionManager$updateSessionState$newOnboarded$1((RealInvestingSyncer) obj, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((RealSessionManager$updateSessionState$newOnboarded$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r3.ioDispatcher, new com.squareup.cash.investing.backend.real.RealInvestingSyncer$syncSettings$2(r3, r5, 0), r7) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        if (r8 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00fb, code lost:
    
        if (r7 == r0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d5, code lost:
    
        if (r8.updateClipboardEntry() == r0) goto L63;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        int i2 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                SharedPreferencesKeyValue sharedPreferencesKeyValue = ((RealSessionManager) obj2).onboarded;
                this.label = 1;
                Object obj3 = sharedPreferencesKeyValue.get(this);
                return obj3 == coroutineSingletons ? coroutineSingletons : obj3;
            case 1:
                TextFieldCoreModifierNode textFieldCoreModifierNode = (TextFieldCoreModifierNode) obj2;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TextFieldSelectionState textFieldSelectionState = textFieldCoreModifierNode.textFieldSelectionState;
                    this.label = 1;
                    break;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        textFieldCoreModifierNode.textFieldSelectionState.textToolbarShown$delegate.setValue(Boolean.TRUE);
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl = textFieldCoreModifierNode.platformSelectionBehaviors;
                if (platformSelectionBehaviorsImpl != null) {
                    CharSequence charSequence = textFieldCoreModifierNode.textFieldSelectionState.textFieldState.getVisualText().text;
                    long j = textFieldCoreModifierNode.textFieldSelectionState.textFieldState.getVisualText().selection;
                    this.label = 2;
                    Object m438onShowContextMenuOrSelectionToolbarSbBc2M = platformSelectionBehaviorsImpl.m438onShowContextMenuOrSelectionToolbarSbBc2M(charSequence, j, this);
                    if (m438onShowContextMenuOrSelectionToolbarSbBc2M != coroutineSingletons2) {
                        m438onShowContextMenuOrSelectionToolbarSbBc2M = Unit.INSTANCE;
                        break;
                    }
                }
                textFieldCoreModifierNode.textFieldSelectionState.textToolbarShown$delegate.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 != 0) {
                    if (i5 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                JanusService janusService = ((RealSettingsEligibilityManager) obj2).service;
                GetAccountSettingsRequest getAccountSettingsRequest = new GetAccountSettingsRequest(ByteString.EMPTY);
                this.label = 1;
                Object accountSettings = janusService.getAccountSettings(getAccountSettingsRequest, this);
                return accountSettings == coroutineSingletons3 ? coroutineSingletons3 : accountSettings;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService = ((AppVersionCheckerActivityWorker) obj2).appService;
                    CheckVersionRequest checkVersionRequest = new CheckVersionRequest(ByteString.EMPTY);
                    this.label = 1;
                    obj = appService.checkVersion(checkVersionRequest, this);
                    if (obj == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult.Success success = obj instanceof ApiResult.Success ? (ApiResult.Success) obj : null;
                if (success != null) {
                    return (CheckVersionResponse) success.response;
                }
                return null;
            default:
                RealInvestingSyncer realInvestingSyncer = (RealInvestingSyncer) obj2;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object withContext = JobKt.withContext(realInvestingSyncer.ioDispatcher, new RealInvestingSyncer$syncSettings$2(realInvestingSyncer, continuation, i2), this);
                    if (withContext != obj4) {
                        withContext = Unit.INSTANCE;
                        break;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                this.label = 2;
                break;
        }
    }
}
