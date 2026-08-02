package com.squareup.cash.appmessages;

import androidx.paging.PagingDataPresenter$collectFrom$2;
import app.cash.api.ApiResult;
import app.cash.molecule.PlatformKt;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda4;
import com.squareup.cash.appmessages.db.CardMessageQueries$$ExternalSyntheticLambda7;
import com.squareup.cash.db.SessionQueries;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageClientService;
import com.squareup.protos.cash.messagingplatformcommon.app.ReportAppMessageActionRequest;
import com.squareup.protos.cash.messagingplatformcommon.app.ReportAppMessageDeliveredRequest;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealAppMessageManager$reportMessageView$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $messageToken;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ RealAppMessageManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealAppMessageManager$reportMessageView$1(RealAppMessageManager realAppMessageManager, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realAppMessageManager;
        this.$messageToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        String str = this.$messageToken;
        RealAppMessageManager realAppMessageManager = this.this$0;
        switch (i) {
            case 0:
                return new RealAppMessageManager$reportMessageView$1(realAppMessageManager, str, continuation, 0);
            case 1:
                return new RealAppMessageManager$reportMessageView$1(realAppMessageManager, str, continuation, 1);
            default:
                return new RealAppMessageManager$reportMessageView$1(realAppMessageManager, str, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealAppMessageManager$reportMessageView$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d3, code lost:
    
        if (r4.refreshAll(r16) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
    
        if (r2 == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object reportAppMessageAction;
        Object reportAppMessageDelivered;
        int i = this.$r8$classId;
        RealAppMessageManager realAppMessageManager = this.this$0;
        String str = this.$messageToken;
        String str2 = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PagingDataPresenter$collectFrom$2 pagingDataPresenter$collectFrom$2 = new PagingDataPresenter$collectFrom$2(realAppMessageManager, str, null == true ? 1 : 0, 8);
                    this.label = 1;
                    if (PlatformKt.retryWhenRetryable$default(null, pagingDataPresenter$collectFrom$2, this, 3) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppMessageClientService appMessageClientService = realAppMessageManager.appService;
                    ReportAppMessageActionRequest reportAppMessageActionRequest = new ReportAppMessageActionRequest(str, str2);
                    this.label = 1;
                    reportAppMessageAction = appMessageClientService.reportAppMessageAction(reportAppMessageActionRequest, this);
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    reportAppMessageAction = obj;
                }
                ApiResult apiResult = (ApiResult) reportAppMessageAction;
                if (apiResult instanceof ApiResult.Success) {
                    this.label = 2;
                    break;
                } else if (!(apiResult instanceof ApiResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            default:
                SessionQueries sessionQueries = realAppMessageManager.messageDeliveredQueries;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SqlDriver sqlDriver = sessionQueries.driver;
                    CardMessageQueries$$ExternalSyntheticLambda7 cardMessageQueries$$ExternalSyntheticLambda7 = new CardMessageQueries$$ExternalSyntheticLambda7(16);
                    sqlDriver.getClass();
                    if (CollectionsKt.toSet(new SimpleQuery(1810798911, new String[]{"messageDelivered"}, sqlDriver, "MessageDelivered.sq", "getAll", "SELECT token FROM messageDelivered", cardMessageQueries$$ExternalSyntheticLambda7).executeAsList()).contains(str)) {
                        return Unit.INSTANCE;
                    }
                    AppMessageClientService appMessageClientService2 = realAppMessageManager.appService;
                    ReportAppMessageDeliveredRequest reportAppMessageDeliveredRequest = new ReportAppMessageDeliveredRequest(str, null, ByteString.EMPTY);
                    this.label = 1;
                    reportAppMessageDelivered = appMessageClientService2.reportAppMessageDelivered(reportAppMessageDeliveredRequest, this);
                    if (reportAppMessageDelivered == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    reportAppMessageDelivered = obj;
                }
                if (!(((ApiResult) reportAppMessageDelivered) instanceof ApiResult.Failure)) {
                    sessionQueries.getClass();
                    str.getClass();
                    sessionQueries.driver.execute(1877580365, "INSERT OR IGNORE INTO messageDelivered VALUES (?)", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(str, 26));
                    sessionQueries.notifyQueries(1877580365, new CardMessageQueries$$ExternalSyntheticLambda7(15));
                }
                return Unit.INSTANCE;
        }
    }
}
