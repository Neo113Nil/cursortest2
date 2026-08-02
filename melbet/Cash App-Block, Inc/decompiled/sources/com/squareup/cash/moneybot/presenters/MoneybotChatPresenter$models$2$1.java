package com.squareup.cash.moneybot.presenters;

import app.cash.versioned.VersionedKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter;
import com.squareup.cash.moneybot.screens.MoneybotChatEntryPoint;
import com.squareup.cash.moneybot.screens.MoneybotChatScreen;
import com.squareup.cash.storage.RealStorage;
import com.squareup.cash.storage.Storage;
import com.squareup.cash.storage.UtilsKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okio.Path;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class MoneybotChatPresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MoneybotChatPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoneybotChatPresenter$models$2$1(MoneybotChatPresenter moneybotChatPresenter, Continuation continuation, int i) {
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
                return new MoneybotChatPresenter$models$2$1(moneybotChatPresenter, continuation, 0);
            case 1:
                return new MoneybotChatPresenter$models$2$1(moneybotChatPresenter, continuation, 1);
            default:
                return new MoneybotChatPresenter$models$2$1(moneybotChatPresenter, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((MoneybotChatPresenter$models$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MoneybotChatPresenter moneybotChatPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MoneybotChatScreen moneybotChatScreen = moneybotChatPresenter.args;
                if (moneybotChatScreen.entryPoint == MoneybotChatEntryPoint.MONEYBOT_HOME && moneybotChatScreen.chatKickoffParams == null) {
                    moneybotChatPresenter.didClickStartNewChat$delegate.setValue(VersionedKt.update(moneybotChatPresenter.getDidClickStartNewChat(), MoneybotChatPresenter.StartNewChatAction.Automatic.INSTANCE));
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                moneybotChatPresenter.analyticsService.chatId = re$$ExternalSyntheticOutline0.m();
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Storage storage = moneybotChatPresenter.storage;
                String str = Path.DIRECTORY_SEPARATOR;
                String path = ((RealStorage) storage).getFileUri(Path.Companion.get(UtilsKt.tempFileName("moneybot_capture"), false), MoneybotChatPresenter$processChatEvent$12$1$fileUri$1.INSTANCE).getPath();
                if (path != null) {
                    return path;
                }
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return null;
        }
    }
}
