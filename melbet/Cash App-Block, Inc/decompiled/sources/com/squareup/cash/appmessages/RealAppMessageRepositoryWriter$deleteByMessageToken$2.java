package com.squareup.cash.appmessages;

import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.db.QueryResult;
import bo.app.re$$ExternalSyntheticOutline0;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda4;
import com.squareup.cash.appmessages.db.CardMessageQueries$$ExternalSyntheticLambda7;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealAppMessageRepositoryWriter$deleteByMessageToken$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $messageToken;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealAppMessageRepositoryWriter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealAppMessageRepositoryWriter$deleteByMessageToken$2(RealAppMessageRepositoryWriter realAppMessageRepositoryWriter, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realAppMessageRepositoryWriter;
        this.$messageToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        String str = this.$messageToken;
        RealAppMessageRepositoryWriter realAppMessageRepositoryWriter = this.this$0;
        switch (i) {
            case 0:
                return new RealAppMessageRepositoryWriter$deleteByMessageToken$2(realAppMessageRepositoryWriter, str, continuation, 0);
            default:
                return new RealAppMessageRepositoryWriter$deleteByMessageToken$2(realAppMessageRepositoryWriter, str, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealAppMessageRepositoryWriter$deleteByMessageToken$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        String str = this.$messageToken;
        RealAppMessageRepositoryWriter realAppMessageRepositoryWriter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                realAppMessageRepositoryWriter.inlineMessagesQueries.delete(str);
                realAppMessageRepositoryWriter.popupMessageQueries.deleteByMessageToken(str);
                realAppMessageRepositoryWriter.sheetMessageQueries.deleteByMessageToken(str);
                realAppMessageRepositoryWriter.inAppNotificationMessageQueries.deleteMessage(str);
                realAppMessageRepositoryWriter.fullScreenMessageQueries.deleteByMessageToken(str);
                realAppMessageRepositoryWriter.tooltipMessageQueries.delete(str);
                return realAppMessageRepositoryWriter.cardMessageQueries.delete(str);
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalTabContentQueries localTabContentQueries = realAppMessageRepositoryWriter.popupMessageQueries;
                localTabContentQueries.driver.execute(null, re$$ExternalSyntheticOutline0.m("\n        |DELETE FROM popupMessage\n        |WHERE campaignToken ", "=", " ?\n        "), new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(str, 27));
                localTabContentQueries.notifyQueries(285473013, new CardMessageQueries$$ExternalSyntheticLambda7(18));
                LocalTabContentQueries localTabContentQueries2 = realAppMessageRepositoryWriter.sheetMessageQueries;
                QueryResult execute = localTabContentQueries2.driver.execute(null, re$$ExternalSyntheticOutline0.m("\n        |DELETE FROM sheetMessage\n        |WHERE campaign_token ", "=", " ?\n        "), new BadgeKt$$ExternalSyntheticLambda3(str, 1));
                localTabContentQueries2.notifyQueries(-665626200, new CardMessageQueries$$ExternalSyntheticLambda7(25));
                return execute;
        }
    }
}
