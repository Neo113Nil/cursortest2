package com.squareup.cash.shopping.web;

import android.net.Uri;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.common.web.UriScheme;
import com.squareup.cash.shopping.backend.analytics.ShopHubAnalyticsHelper$Flow;
import com.squareup.cash.shopping.backend.real.RealShopHubAnalyticsHelper;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.webview.android.AndroidCookieManager;
import com.squareup.cropview.Edge;
import com.squareup.protos.cash.cashapproxy.api.CashApProxyClientService;
import com.squareup.protos.cash.cashapproxy.api.GetAfterpayCheckoutTokensRequest;
import com.squareup.protos.cash.cashapproxy.api.GetAfterpayCheckoutTokensResponse;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt__StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealShoppingWebCheckoutCookieManager {
    public static final List cookieUrls = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"https://portalapi.afterpay.com", "https://portalapi-sandbox.afterpay.com", "https://portalapi.sandbox.afterpay.com", "https://portalapi.qa.afterpay-beta.com", "https://portalapi.us.afterpay.com", "https://portalapi.us-sandbox.afterpay.com", "https://portalapi.us-qa.afterpay-beta.com", "https://portalapi.eu.clearpay.co.uk", "https://portalapi.eu-sandbox.clearpay.co.uk", "https://portalapi.eu-qa.clearpay-beta.co.uk"});
    public final AndroidClock clock;
    public final ConcurrentHashMap cookieExpiryTimes = new ConcurrentHashMap();
    public final AndroidCookieManager cookieManager;
    public final CashApProxyClientService service;
    public final RealShopHubAnalyticsHelper shopHubAnalyticsHelper;

    public RealShoppingWebCheckoutCookieManager(AndroidCookieManager androidCookieManager, AndroidClock androidClock, CashApProxyClientService cashApProxyClientService, RealShopHubAnalyticsHelper realShopHubAnalyticsHelper) {
        this.cookieManager = androidCookieManager;
        this.clock = androidClock;
        this.service = cashApProxyClientService;
        this.shopHubAnalyticsHelper = realShopHubAnalyticsHelper;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getCheckoutTokens(boolean z, ContinuationImpl continuationImpl) {
        RealShoppingWebCheckoutCookieManager$getCheckoutTokens$1 realShoppingWebCheckoutCookieManager$getCheckoutTokens$1;
        int i;
        GetAfterpayCheckoutTokensRequest getAfterpayCheckoutTokensRequest;
        ApiResult apiResult;
        if (continuationImpl instanceof RealShoppingWebCheckoutCookieManager$getCheckoutTokens$1) {
            realShoppingWebCheckoutCookieManager$getCheckoutTokens$1 = (RealShoppingWebCheckoutCookieManager$getCheckoutTokens$1) continuationImpl;
            int i2 = realShoppingWebCheckoutCookieManager$getCheckoutTokens$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realShoppingWebCheckoutCookieManager$getCheckoutTokens$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realShoppingWebCheckoutCookieManager$getCheckoutTokens$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realShoppingWebCheckoutCookieManager$getCheckoutTokens$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealShopHubAnalyticsHelper realShopHubAnalyticsHelper = this.shopHubAnalyticsHelper;
                    if (z) {
                        String flowToken = realShopHubAnalyticsHelper.getFlowToken(ShopHubAnalyticsHelper$Flow.SHOP);
                        Edge.Companion companion = GetAfterpayCheckoutTokensRequest.Source.Companion;
                        getAfterpayCheckoutTokensRequest = new GetAfterpayCheckoutTokensRequest(flowToken, 4);
                    } else {
                        getAfterpayCheckoutTokensRequest = new GetAfterpayCheckoutTokensRequest(realShopHubAnalyticsHelper.getFlowToken(ShopHubAnalyticsHelper$Flow.SHOP), 6);
                    }
                    realShoppingWebCheckoutCookieManager$getCheckoutTokens$1.label = 1;
                    obj = this.service.getAfterpayCheckoutTokens(getAfterpayCheckoutTokensRequest, realShoppingWebCheckoutCookieManager$getCheckoutTokens$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    return ((GetAfterpayCheckoutTokensResponse) ((ApiResult.Success) apiResult).response).tokens;
                }
                if (apiResult instanceof ApiResult.Failure) {
                    return EmptyList.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        realShoppingWebCheckoutCookieManager$getCheckoutTokens$1 = new RealShoppingWebCheckoutCookieManager$getCheckoutTokens$1(this, continuationImpl);
        Object obj2 = realShoppingWebCheckoutCookieManager$getCheckoutTokens$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realShoppingWebCheckoutCookieManager$getCheckoutTokens$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00de, code lost:
    
        if (r4 == null) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object syncCookieTokens(String str, boolean z, ContinuationImpl continuationImpl) {
        RealShoppingWebCheckoutCookieManager$syncCookieTokens$1 realShoppingWebCheckoutCookieManager$syncCookieTokens$1;
        int i;
        String str2;
        Object checkoutTokens;
        String str3;
        List split$default;
        RealShoppingWebCheckoutCookieManager realShoppingWebCheckoutCookieManager = this;
        if (continuationImpl instanceof RealShoppingWebCheckoutCookieManager$syncCookieTokens$1) {
            realShoppingWebCheckoutCookieManager$syncCookieTokens$1 = (RealShoppingWebCheckoutCookieManager$syncCookieTokens$1) continuationImpl;
            int i2 = realShoppingWebCheckoutCookieManager$syncCookieTokens$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realShoppingWebCheckoutCookieManager$syncCookieTokens$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realShoppingWebCheckoutCookieManager$syncCookieTokens$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realShoppingWebCheckoutCookieManager$syncCookieTokens$1.label;
                Throwable th = null;
                AndroidClock androidClock = realShoppingWebCheckoutCookieManager.clock;
                ConcurrentHashMap concurrentHashMap = realShoppingWebCheckoutCookieManager.cookieExpiryTimes;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!concurrentHashMap.isEmpty()) {
                        if (!concurrentHashMap.isEmpty()) {
                            Iterator it = concurrentHashMap.entrySet().iterator();
                            while (it.hasNext()) {
                                if (DimensionKt.nowSeconds(androidClock).compareTo((Instant) ((Map.Entry) it.next()).getValue()) >= 0) {
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    concurrentHashMap.clear();
                    str2 = str;
                    realShoppingWebCheckoutCookieManager$syncCookieTokens$1.L$0 = str2;
                    realShoppingWebCheckoutCookieManager$syncCookieTokens$1.label = 1;
                    checkoutTokens = realShoppingWebCheckoutCookieManager.getCheckoutTokens(z, realShoppingWebCheckoutCookieManager$syncCookieTokens$1);
                    if (checkoutTokens == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str4 = realShoppingWebCheckoutCookieManager$syncCookieTokens$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    checkoutTokens = obj;
                    str2 = str4;
                }
                int i3 = 0;
                for (Object obj2 : (List) checkoutTokens) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        Throwable th2 = th;
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw th2;
                    }
                    GetAfterpayCheckoutTokensResponse.CheckoutToken checkoutToken = (GetAfterpayCheckoutTokensResponse.CheckoutToken) obj2;
                    Instant nowSeconds = DimensionKt.nowSeconds(androidClock);
                    Integer num = checkoutToken.expires_in_seconds;
                    String str5 = checkoutToken.token;
                    String str6 = checkoutToken.domain;
                    concurrentHashMap.put(new Integer(i3), nowSeconds.plusSeconds(num != null ? num.intValue() : 0L).minusSeconds(60L));
                    if (str6 != null) {
                        Uri.Builder builder = new Uri.Builder();
                        UriScheme[] uriSchemeArr = UriScheme.$VALUES;
                        str3 = builder.scheme("https").authority(str6).build().toString();
                    }
                    str3 = str2;
                    String str7 = checkoutToken.name;
                    if (str7 == null) {
                        str7 = "";
                    }
                    int intValue = num != null ? num.intValue() : 0;
                    if (str6 == null) {
                        str6 = "";
                    }
                    String str8 = str5 == null ? "" : str5;
                    Throwable th3 = th;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str7);
                    sb.append("=");
                    sb.append(str8);
                    sb.append("; Max-Age=");
                    sb.append(intValue);
                    String m = Recorder$$ExternalSyntheticOutline2.m(sb, "; Secure; HttpOnly; domain=", str6, ";");
                    AndroidCookieManager androidCookieManager = realShoppingWebCheckoutCookieManager.cookieManager;
                    androidCookieManager.setCookie(str3, m);
                    for (String str9 : cookieUrls) {
                        String str10 = str2;
                        split$default = StringsKt__StringsKt.split$default(Recorder$$ExternalSyntheticOutline1.m("cash_checkout_token=", num != null ? num.intValue() : 0, str5 == null ? "" : str5, "; Max-Age=", "; SameSite=None; Secure; HttpOnly"), new String[]{";"}, false, 0, 6, null);
                        Iterator it2 = split$default.iterator();
                        while (it2.hasNext()) {
                            androidCookieManager.setCookie(str9, (String) it2.next());
                        }
                        str2 = str10;
                    }
                    realShoppingWebCheckoutCookieManager = this;
                    th = th3;
                    i3 = i4;
                }
                return Unit.INSTANCE;
            }
        }
        realShoppingWebCheckoutCookieManager$syncCookieTokens$1 = new RealShoppingWebCheckoutCookieManager$syncCookieTokens$1(realShoppingWebCheckoutCookieManager, continuationImpl);
        Object obj3 = realShoppingWebCheckoutCookieManager$syncCookieTokens$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realShoppingWebCheckoutCookieManager$syncCookieTokens$1.label;
        Throwable th4 = null;
        AndroidClock androidClock2 = realShoppingWebCheckoutCookieManager.clock;
        ConcurrentHashMap concurrentHashMap2 = realShoppingWebCheckoutCookieManager.cookieExpiryTimes;
        if (i != 0) {
        }
        int i32 = 0;
        while (r2.hasNext()) {
        }
        return Unit.INSTANCE;
    }
}
