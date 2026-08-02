package com.squareup.cash.shopping.backend.real;

import androidx.camera.camera2.impl.FlashControl$applyScreenFlash$2;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.api.ApiResult;
import app.cash.redwood.yoga.internal.detail.GlobalMembers;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.shopping.backend.api.SheetDetails;
import com.squareup.cash.shopping.db.ShopInfoDetails;
import com.squareup.cash.support.chat.views.ChatInputView$Content$1$1$1;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.cashsuggest.api.CashSuggestClientService;
import com.squareup.protos.cash.cashsuggest.api.ShopInfoRequest;
import com.squareup.protos.cash.cashsuggest.api.ShopInfoResponse;
import com.squareup.protos.cash.cashsuggest.api.ShopInfoResponse$Picture$Avatar;
import com.squareup.protos.cash.cashsuggest.api.ShopInfoResponse$Picture$Image;
import com.squareup.protos.cash.customersearch.api.CustomerSearchClientService;
import com.squareup.protos.cash.ui.Image;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealShopHubRepository {
    public final CashAccountDatabaseImpl cashDatabase;
    public final AndroidClock clock;
    public final CustomerSearchClientService customerSearchService;
    public final CoroutineContext ioDispatcher;
    public final CashSuggestClientService suggestService;

    public RealShopHubRepository(CustomerSearchClientService customerSearchClientService, CashSuggestClientService cashSuggestClientService, CashAccountDatabaseImpl cashAccountDatabaseImpl, AndroidClock androidClock, CoroutineContext coroutineContext) {
        this.customerSearchService = customerSearchClientService;
        this.suggestService = cashSuggestClientService;
        this.cashDatabase = cashAccountDatabaseImpl;
        this.clock = androidClock;
        this.ioDispatcher = coroutineContext;
    }

    public static SheetDetails toSheetDetails(ShopInfoResponse shopInfoResponse) {
        GlobalMembers globalMembers = shopInfoResponse.picture;
        ShopInfoResponse$Picture$Image shopInfoResponse$Picture$Image = globalMembers instanceof ShopInfoResponse$Picture$Image ? (ShopInfoResponse$Picture$Image) globalMembers : null;
        Image image = shopInfoResponse$Picture$Image != null ? shopInfoResponse$Picture$Image.value : null;
        ShopInfoResponse$Picture$Avatar shopInfoResponse$Picture$Avatar = globalMembers instanceof ShopInfoResponse$Picture$Avatar ? (ShopInfoResponse$Picture$Avatar) globalMembers : null;
        return new SheetDetails(image, shopInfoResponse$Picture$Avatar != null ? shopInfoResponse$Picture$Avatar.value : null, shopInfoResponse.title, shopInfoResponse.subtitle, shopInfoResponse.bullets, shopInfoResponse.action_button, shopInfoResponse.footer, null, shopInfoResponse.picture_max_px_height, shopInfoResponse.picture_horizontal_alignment, shopInfoResponse.display_criteria, 128);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0050, code lost:
    
        if (r0 == r8) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchShopInfoRequest(ContinuationImpl continuationImpl) {
        RealShopHubRepository$fetchShopInfoRequest$1 realShopHubRepository$fetchShopInfoRequest$1;
        int i;
        ApiResult apiResult;
        ApiResult apiResult2;
        if (continuationImpl instanceof RealShopHubRepository$fetchShopInfoRequest$1) {
            realShopHubRepository$fetchShopInfoRequest$1 = (RealShopHubRepository$fetchShopInfoRequest$1) continuationImpl;
            int i2 = realShopHubRepository$fetchShopInfoRequest$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realShopHubRepository$fetchShopInfoRequest$1.label = i2 - PKIFailureInfo.systemUnavail;
                RealShopHubRepository$fetchShopInfoRequest$1 realShopHubRepository$fetchShopInfoRequest$12 = realShopHubRepository$fetchShopInfoRequest$1;
                Object obj = realShopHubRepository$fetchShopInfoRequest$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realShopHubRepository$fetchShopInfoRequest$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ShopInfoRequest shopInfoRequest = new ShopInfoRequest(null, null, ByteString.EMPTY);
                    realShopHubRepository$fetchShopInfoRequest$12.label = 1;
                    obj = this.suggestService.shopInfo(shopInfoRequest, realShopHubRepository$fetchShopInfoRequest$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        apiResult2 = realShopHubRepository$fetchShopInfoRequest$12.L$2;
                        SafeTrace.throwOnFailure(obj);
                        return toSheetDetails((ShopInfoResponse) ((ApiResult.Success) apiResult2).response);
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure.NetworkFailure)) {
                    return new SheetDetails(null, null, null, null, null, null, null, Recorder$$ExternalSyntheticOutline2.m("Error: ", ((ApiResult.Failure.NetworkFailure) apiResult).error.getLocalizedMessage()), null, null, null, 1919);
                }
                if (apiResult instanceof ApiResult.Failure.HttpFailure) {
                    return new SheetDetails(null, null, null, null, null, null, null, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((ApiResult.Failure.HttpFailure) apiResult).code, "Error: "), null, null, null, 1919);
                }
                if (!(apiResult instanceof ApiResult.Success)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ApiResult.Success success = (ApiResult.Success) apiResult;
                ShopInfoResponse shopInfoResponse = (ShopInfoResponse) success.response;
                realShopHubRepository$fetchShopInfoRequest$12.L$2 = success;
                realShopHubRepository$fetchShopInfoRequest$12.label = 2;
                Object withContext = JobKt.withContext(this.ioDispatcher, new FlashControl$applyScreenFlash$2(this, 1L, shopInfoResponse, (Continuation) null, 10), realShopHubRepository$fetchShopInfoRequest$12);
                if (withContext != coroutineSingletons) {
                    withContext = Unit.INSTANCE;
                }
                if (withContext != coroutineSingletons) {
                    apiResult2 = apiResult;
                    return toSheetDetails((ShopInfoResponse) ((ApiResult.Success) apiResult2).response);
                }
                return coroutineSingletons;
            }
        }
        realShopHubRepository$fetchShopInfoRequest$1 = new RealShopHubRepository$fetchShopInfoRequest$1(this, continuationImpl);
        RealShopHubRepository$fetchShopInfoRequest$1 realShopHubRepository$fetchShopInfoRequest$122 = realShopHubRepository$fetchShopInfoRequest$1;
        Object obj2 = realShopHubRepository$fetchShopInfoRequest$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realShopHubRepository$fetchShopInfoRequest$122.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure.NetworkFailure)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0047, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadInfoSheet(ContinuationImpl continuationImpl) {
        RealShopHubRepository$loadInfoSheet$1 realShopHubRepository$loadInfoSheet$1;
        Object obj;
        int i;
        ShopInfoDetails shopInfoDetails;
        if (continuationImpl instanceof RealShopHubRepository$loadInfoSheet$1) {
            realShopHubRepository$loadInfoSheet$1 = (RealShopHubRepository$loadInfoSheet$1) continuationImpl;
            int i2 = realShopHubRepository$loadInfoSheet$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realShopHubRepository$loadInfoSheet$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realShopHubRepository$loadInfoSheet$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realShopHubRepository$loadInfoSheet$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    realShopHubRepository$loadInfoSheet$1.label = 1;
                    obj2 = JobKt.withContext(this.ioDispatcher, new ChatInputView$Content$1$1$1(this, continuation, 8), realShopHubRepository$loadInfoSheet$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj2);
                            return obj2;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                shopInfoDetails = (ShopInfoDetails) obj2;
                long j = shopInfoDetails == null ? shopInfoDetails.ttl_in_millis : 0L;
                if (shopInfoDetails == null && j > this.clock.millis()) {
                    return toSheetDetails(shopInfoDetails.shop_info_response);
                }
                realShopHubRepository$loadInfoSheet$1.label = 2;
                Object fetchShopInfoRequest = fetchShopInfoRequest(realShopHubRepository$loadInfoSheet$1);
                return fetchShopInfoRequest != obj ? obj : fetchShopInfoRequest;
            }
        }
        realShopHubRepository$loadInfoSheet$1 = new RealShopHubRepository$loadInfoSheet$1(this, continuationImpl);
        Object obj22 = realShopHubRepository$loadInfoSheet$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realShopHubRepository$loadInfoSheet$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        shopInfoDetails = (ShopInfoDetails) obj22;
        if (shopInfoDetails == null) {
        }
        if (shopInfoDetails == null) {
        }
        realShopHubRepository$loadInfoSheet$1.label = 2;
        Object fetchShopInfoRequest2 = fetchShopInfoRequest(realShopHubRepository$loadInfoSheet$1);
        if (fetchShopInfoRequest2 != obj) {
        }
    }
}
