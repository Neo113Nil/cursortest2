package com.squareup.cash.crypto.common.presenters;

import android.os.Parcelable;
import app.cash.api.ApiResult;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.api.ContextKt;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.cryptoinvestflow.api.blockers.v1.BitcoinP2pConversionPercentageInputs;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SubmitBitcoinP2pConversionPercentageRequest;
import com.squareup.protos.franklin.app.SubmitBlockerRequest;
import com.squareup.protos.franklin.app.SubmitBlockerRequest$Request$Request$SubmitBitcoinP2pConversionPercentageRequest;
import com.squareup.protos.franklin.app.SubmitBlockerResponse;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.coroutines.TickerKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class BitcoinP2pConversionPercentageSubmitter {
    public final AppService appService;
    public final BlockersDataNavigator blockersDataNavigator;
    public final AndroidStringManager stringManager;

    public BitcoinP2pConversionPercentageSubmitter(AppService appService, BlockersDataNavigator blockersDataNavigator, AndroidStringManager androidStringManager) {
        this.appService = appService;
        this.blockersDataNavigator = blockersDataNavigator;
        this.stringManager = androidStringManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object submit(Screen screen, BlockersData blockersData, long j, BitcoinP2pConversionPercentageInputs.SubmissionInteraction submissionInteraction, BetterNavigator.ScreenNavigator screenNavigator, ContinuationImpl continuationImpl) {
        BitcoinP2pConversionPercentageSubmitter$submit$1 bitcoinP2pConversionPercentageSubmitter$submit$1;
        int i;
        BetterNavigator.ScreenNavigator screenNavigator2;
        Screen screen2;
        Object obj;
        BlockersData blockersData2 = blockersData;
        if (continuationImpl instanceof BitcoinP2pConversionPercentageSubmitter$submit$1) {
            bitcoinP2pConversionPercentageSubmitter$submit$1 = (BitcoinP2pConversionPercentageSubmitter$submit$1) continuationImpl;
            int i2 = bitcoinP2pConversionPercentageSubmitter$submit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                bitcoinP2pConversionPercentageSubmitter$submit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = bitcoinP2pConversionPercentageSubmitter$submit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bitcoinP2pConversionPercentageSubmitter$submit$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    ClientScenario clientScenario = blockersData2.clientScenario;
                    clientScenario.getClass();
                    String str = blockersData2.flowToken;
                    SubmitBlockerRequest.Request.Builder builder = new SubmitBlockerRequest.Request.Builder();
                    String str2 = blockersData2.blockerId;
                    str2.getClass();
                    builder.blocker_descriptor_id = str2;
                    RequestContext requestContext = blockersData2.requestContext;
                    Long l = new Long(j);
                    ByteString byteString = ByteString.EMPTY;
                    builder.request = new SubmitBlockerRequest$Request$Request$SubmitBitcoinP2pConversionPercentageRequest(new SubmitBitcoinP2pConversionPercentageRequest(requestContext, new BitcoinP2pConversionPercentageInputs(submissionInteraction, l, byteString), byteString));
                    SubmitBlockerRequest submitBlockerRequest = new SubmitBlockerRequest(null, CollectionsKt__CollectionsJVMKt.listOf(builder.build()), 11);
                    bitcoinP2pConversionPercentageSubmitter$submit$1.L$0 = screen;
                    bitcoinP2pConversionPercentageSubmitter$submit$1.L$1 = blockersData2;
                    screenNavigator2 = screenNavigator;
                    bitcoinP2pConversionPercentageSubmitter$submit$1.L$3 = screenNavigator2;
                    bitcoinP2pConversionPercentageSubmitter$submit$1.label = 1;
                    obj2 = this.appService.submitBlocker(clientScenario, str, submitBlockerRequest, bitcoinP2pConversionPercentageSubmitter$submit$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    screen2 = screen;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    BetterNavigator.ScreenNavigator screenNavigator3 = bitcoinP2pConversionPercentageSubmitter$submit$1.L$3;
                    BlockersData blockersData3 = bitcoinP2pConversionPercentageSubmitter$submit$1.L$1;
                    screen2 = bitcoinP2pConversionPercentageSubmitter$submit$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    screenNavigator2 = screenNavigator3;
                    blockersData2 = blockersData3;
                }
                obj = (ApiResult) obj2;
                if (!(obj instanceof ApiResult.Success)) {
                    SubmitBlockerResponse submitBlockerResponse = (SubmitBlockerResponse) ((ApiResult.Success) obj).response;
                    ResponseContext mergeResponseContexts = ContextKt.mergeResponseContexts(submitBlockerResponse.app_response_context, submitBlockerResponse.blocker_response_context, submitBlockerResponse.flow_response_context);
                    obj = Matcher$$ExternalSyntheticOutline0.m(mergeResponseContexts, mergeResponseContexts);
                } else if (!(obj instanceof ApiResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                if (!(obj instanceof ApiResult.Success)) {
                    ResponseContext responseContext = (ResponseContext) ((ApiResult.Success) obj).response;
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    screenNavigator2.goTo(this.blockersDataNavigator.getNext(screen2, blockersData2.updateFromResponseContext(responseContext, false)));
                } else {
                    if (!(obj instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator2.goTo(TickerKt.toMessageScreen$default((ApiResult.Failure) obj, screen2, this.stringManager));
                }
                return Unit.INSTANCE;
            }
        }
        bitcoinP2pConversionPercentageSubmitter$submit$1 = new BitcoinP2pConversionPercentageSubmitter$submit$1(this, continuationImpl);
        Object obj22 = bitcoinP2pConversionPercentageSubmitter$submit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bitcoinP2pConversionPercentageSubmitter$submit$1.label;
        if (i != 0) {
        }
        obj = (ApiResult) obj22;
        if (!(obj instanceof ApiResult.Success)) {
        }
        if (!(obj instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }
}
