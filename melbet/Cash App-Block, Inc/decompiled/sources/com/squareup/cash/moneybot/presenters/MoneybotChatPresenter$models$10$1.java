package com.squareup.cash.moneybot.presenters;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.moneybot.backend.RealMoneybotChatMessagesCache;
import com.squareup.cash.screens.Back;
import com.squareup.preferences.values.RecentMoneybotSession;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class MoneybotChatPresenter$models$10$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $failedSessionId;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ MoneybotChatPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneybotChatPresenter$models$10$1(String str, MoneybotChatPresenter moneybotChatPresenter, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.$failedSessionId = str;
        this.this$0 = moneybotChatPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        String str = this.$failedSessionId;
        MoneybotChatPresenter moneybotChatPresenter = this.this$0;
        switch (i) {
            case 0:
                return new MoneybotChatPresenter$models$10$1(str, moneybotChatPresenter, continuation);
            case 1:
                return new MoneybotChatPresenter$models$10$1(moneybotChatPresenter, str, continuation, 1);
            case 2:
                return new MoneybotChatPresenter$models$10$1(moneybotChatPresenter, str, continuation, 2);
            default:
                return new MoneybotChatPresenter$models$10$1(moneybotChatPresenter, str, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((MoneybotChatPresenter$models$10$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        String str = this.$failedSessionId;
        MoneybotChatPresenter moneybotChatPresenter = this.this$0;
        switch (i) {
            case 0:
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = moneybotChatPresenter.loadChatRetryTrigger$delegate;
                RealMoneybotChatMessagesCache realMoneybotChatMessagesCache = moneybotChatPresenter.chatMessagesCache;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (str != null && realMoneybotChatMessagesCache.deletedSessionIds.contains(str)) {
                        this.label = 1;
                        if (realMoneybotChatMessagesCache.setRecentSession(null, this) == coroutineSingletons) {
                            break;
                        }
                    }
                    break;
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + 1);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealMoneybotChatMessagesCache realMoneybotChatMessagesCache2 = moneybotChatPresenter.chatMessagesCache;
                    RecentMoneybotSession recentMoneybotSession = new RecentMoneybotSession(str, new Long(moneybotChatPresenter.clock.millis()));
                    this.label = 1;
                    if (realMoneybotChatMessagesCache2.setRecentSession(recentMoneybotSession, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealMoneybotChatMessagesCache realMoneybotChatMessagesCache3 = moneybotChatPresenter.chatMessagesCache;
                    RecentMoneybotSession recentMoneybotSession2 = new RecentMoneybotSession(str, new Long(moneybotChatPresenter.clock.millis()));
                    this.label = 1;
                    if (realMoneybotChatMessagesCache3.setRecentSession(recentMoneybotSession2, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                moneybotChatPresenter.navigator.goTo(Back.INSTANCE);
                break;
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (MoneybotChatPresenter.access$cancelLastMessage(moneybotChatPresenter, str, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoneybotChatPresenter$models$10$1(MoneybotChatPresenter moneybotChatPresenter, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = moneybotChatPresenter;
        this.$failedSessionId = str;
    }
}
