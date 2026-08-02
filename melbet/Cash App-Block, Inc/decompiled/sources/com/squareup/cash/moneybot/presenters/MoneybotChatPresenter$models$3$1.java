package com.squareup.cash.moneybot.presenters;

import androidx.camera.video.internal.utils.StorageUtil;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.appmessages.RealAppMessageManager;
import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$MoneybotCachedSessionIdTimeoutSeconds;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.moneybot.backend.RealMoneybotChatMessagesCache;
import com.squareup.cash.moneybot.backend.api.managers.ChatManager;
import com.squareup.cash.moneybot.backend.real.managers.RealChatManager;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotPreambleManager;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import com.squareup.preferences.values.RecentMoneybotSession;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class MoneybotChatPresenter$models$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ MoneybotChatPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoneybotChatPresenter$models$3$1(MoneybotChatPresenter moneybotChatPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = moneybotChatPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MoneybotChatPresenter moneybotChatPresenter = this.this$0;
        switch (i) {
            case 0:
                return new MoneybotChatPresenter$models$3$1(moneybotChatPresenter, continuation, 0);
            case 1:
                return new MoneybotChatPresenter$models$3$1(moneybotChatPresenter, continuation, 1);
            case 2:
                return new MoneybotChatPresenter$models$3$1(moneybotChatPresenter, continuation, 2);
            case 3:
                return new MoneybotChatPresenter$models$3$1(moneybotChatPresenter, continuation, 3);
            default:
                return new MoneybotChatPresenter$models$3$1(moneybotChatPresenter, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((MoneybotChatPresenter$models$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Long l;
        int i = this.$r8$classId;
        MoneybotChatPresenter moneybotChatPresenter = this.this$0;
        switch (i) {
            case 0:
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = moneybotChatPresenter.slashCommands$delegate;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (moneybotChatPresenter.moneybotFlagsHelper.slashCommandsEnabled()) {
                        ChatManager chatManager = moneybotChatPresenter.chatManager;
                        this.label = 1;
                        obj = ((RealChatManager) chatManager).listSkills(this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                ApiResult apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    parcelableSnapshotMutableState.setValue((List) ((ApiResult.Success) apiResult).response);
                    moneybotChatPresenter.slashCommandMatches$delegate.setValue(StorageUtil.computeSlashCommandMatches((String) moneybotChatPresenter.composerText$delegate.getValue(), (List) parcelableSnapshotMutableState.getValue()));
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Timber.Forest.w("Failed to prefetch slash commands: " + apiResult, new Object[0]);
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    moneybotChatPresenter.hasTriggeredMemoryTooltipFetch$delegate.setValue(Boolean.TRUE);
                    EglCore eglCore = moneybotChatPresenter.memoryTooltipManager;
                    this.label = 1;
                    Object refreshAll = ((RealAppMessageManager) eglCore.eglDisplay).refreshAll(this);
                    if (refreshAll != coroutineSingletons2) {
                        refreshAll = Unit.INSTANCE;
                    }
                    if (refreshAll == coroutineSingletons2) {
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
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealMoneybotChatMessagesCache realMoneybotChatMessagesCache = moneybotChatPresenter.chatMessagesCache;
                    this.label = 1;
                    obj = realMoneybotChatMessagesCache.recentMoneybotSessionPref.get(this);
                    if (obj == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                RecentMoneybotSession recentMoneybotSession = (RecentMoneybotSession) obj;
                long longValue = (recentMoneybotSession == null || (l = recentMoneybotSession.updatedAtMs) == null) ? 0L : l.longValue();
                if (recentMoneybotSession == null || (str = recentMoneybotSession.sessionId) == null) {
                    return null;
                }
                if (moneybotChatPresenter.clock.millis() - longValue < ((FeatureFlag$LongFeatureFlag.Value) ((RealFeatureFlagManager) moneybotChatPresenter.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$MoneybotCachedSessionIdTimeoutSeconds.INSTANCE)).value * 1000) {
                    return str;
                }
                return null;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
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
                RealMoneybotPreambleManager realMoneybotPreambleManager = moneybotChatPresenter.moneybotPreambleManager;
                this.label = 1;
                Object hasPreambleOverride = realMoneybotPreambleManager.hasPreambleOverride(this);
                return hasPreambleOverride == coroutineSingletons4 ? coroutineSingletons4 : hasPreambleOverride;
            default:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MoneybotChatViewModel.Content.ToastMessage toastMessage = MoneybotChatViewModel.Content.ToastMessage.FeedbackSubmitted;
                    this.label = 1;
                    if (moneybotChatPresenter.displayToast(toastMessage, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
