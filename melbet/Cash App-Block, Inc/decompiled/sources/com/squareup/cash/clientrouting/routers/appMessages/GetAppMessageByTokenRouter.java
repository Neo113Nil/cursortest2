package com.squareup.cash.clientrouting.routers.appMessages;

import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzjo;
import com.squareup.cash.advertising.screens.FullscreenAdScreen;
import com.squareup.cash.appmessages.RealAppMessageRepositoryWriter;
import com.squareup.cash.arcade.treehouse.SearchBarBinding$Content$1$1;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageClientService;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageFormat;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageFormat$Message$FullScreenMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.GetAppMessageByTemplateTokenRequest;
import com.squareup.protos.cash.messagingplatformcommon.app.GetAppMessageByTemplateTokenResponse;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.coroutines.JobKt;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class GetAppMessageByTokenRouter {
    public final AppMessageClientService AppMessageClientService;
    public final RealAppMessageRepositoryWriter appMessageRepository;
    public final Navigator navigator;

    public GetAppMessageByTokenRouter(AppMessageClientService appMessageClientService, RealAppMessageRepositoryWriter realAppMessageRepositoryWriter, Navigator navigator) {
        navigator.getClass();
        this.AppMessageClientService = appMessageClientService;
        this.appMessageRepository = realAppMessageRepositoryWriter;
        this.navigator = navigator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        if (r14 != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0055, code lost:
    
        if (r14 == r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.squareup.protos.cash.messagingplatformcommon.app.FullScreenMessage] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.GetAppMessageByToken getAppMessageByToken, ContinuationImpl continuationImpl) {
        GetAppMessageByTokenRouter$route$1 getAppMessageByTokenRouter$route$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        ?? r5;
        ApiResult apiResult;
        AppMessage appMessage;
        Object withContext;
        zzjo zzjoVar;
        if (continuationImpl instanceof GetAppMessageByTokenRouter$route$1) {
            getAppMessageByTokenRouter$route$1 = (GetAppMessageByTokenRouter$route$1) continuationImpl;
            int i2 = getAppMessageByTokenRouter$route$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                getAppMessageByTokenRouter$route$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = getAppMessageByTokenRouter$route$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getAppMessageByTokenRouter$route$1.label;
                r5 = 0;
                r5 = 0;
                r5 = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetAppMessageByTemplateTokenRequest getAppMessageByTemplateTokenRequest = new GetAppMessageByTemplateTokenRequest(getAppMessageByToken.token, null, null, StringsKt.toLongOrNull(10, getAppMessageByToken.version), ByteString.EMPTY);
                    getAppMessageByTokenRouter$route$1.label = 1;
                    obj = this.AppMessageClientService.getAppMessageByTemplateToken(getAppMessageByTemplateTokenRequest, getAppMessageByTokenRouter$route$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        appMessage = getAppMessageByTokenRouter$route$1.L$2;
                        SafeTrace.throwOnFailure(obj);
                        String str = appMessage.message_token;
                        if (str != null) {
                            AppMessageFormat appMessageFormat = appMessage.app_message_format;
                            if (appMessageFormat != null && (zzjoVar = appMessageFormat.message) != null) {
                                AppMessageFormat$Message$FullScreenMessage appMessageFormat$Message$FullScreenMessage = zzjoVar instanceof AppMessageFormat$Message$FullScreenMessage ? (AppMessageFormat$Message$FullScreenMessage) zzjoVar : null;
                                if (appMessageFormat$Message$FullScreenMessage != null) {
                                    r5 = appMessageFormat$Message$FullScreenMessage.value;
                                }
                            }
                            if (r5 != 0) {
                                this.navigator.goTo(new FullscreenAdScreen(str));
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if ((apiResult instanceof ApiResult.Success) && (appMessage = ((GetAppMessageByTemplateTokenResponse) ((ApiResult.Success) apiResult).response).message) != null) {
                    getAppMessageByTokenRouter$route$1.L$2 = appMessage;
                    getAppMessageByTokenRouter$route$1.label = 2;
                    RealAppMessageRepositoryWriter realAppMessageRepositoryWriter = this.appMessageRepository;
                    withContext = JobKt.withContext(realAppMessageRepositoryWriter.ioDispatcher, new SearchBarBinding$Content$1$1(realAppMessageRepositoryWriter, appMessage, r5, 20), getAppMessageByTokenRouter$route$1);
                    if (withContext != coroutineSingletons) {
                        withContext = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        getAppMessageByTokenRouter$route$1 = new GetAppMessageByTokenRouter$route$1(this, continuationImpl);
        Object obj2 = getAppMessageByTokenRouter$route$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getAppMessageByTokenRouter$route$1.label;
        r5 = 0;
        r5 = 0;
        r5 = 0;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
            getAppMessageByTokenRouter$route$1.L$2 = appMessage;
            getAppMessageByTokenRouter$route$1.label = 2;
            RealAppMessageRepositoryWriter realAppMessageRepositoryWriter2 = this.appMessageRepository;
            withContext = JobKt.withContext(realAppMessageRepositoryWriter2.ioDispatcher, new SearchBarBinding$Content$1$1(realAppMessageRepositoryWriter2, appMessage, r5, 20), getAppMessageByTokenRouter$route$1);
            if (withContext != coroutineSingletons) {
            }
        }
        return Unit.INSTANCE;
    }
}
