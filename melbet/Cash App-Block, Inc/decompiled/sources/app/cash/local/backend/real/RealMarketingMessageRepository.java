package app.cash.local.backend.real;

import android.os.Parcelable;
import app.cash.api.ApiResult;
import app.cash.local.primitives.MarketingMessageData;
import app.cash.local.service.LocalService;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$LocalMarketingMessagesBadging;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.protos.cash.local.client.app.v1.GetMarketingMessageRequest;
import com.squareup.protos.cash.local.client.app.v1.GetMarketingMessageResponse;
import com.squareup.protos.cash.local.client.app.v1.ListMarketingMessagesRequest;
import com.squareup.protos.cash.local.client.app.v1.ListMarketingMessagesResponse;
import com.squareup.protos.cash.local.client.app.v1.MarketingMessage;
import com.squareup.protos.cash.local.client.app.v1.ReportMarketingMessageViewedRequest;
import com.squareup.protos.cash.local.client.app.v1.ReportMarketingMessageViewedRequest$ViewedTarget$ClearBadges;
import com.squareup.protos.cash.local.client.app.v1.ReportMarketingMessageViewedRequest$ViewedTarget$MarketingMessageTokens;
import com.squareup.protos.cash.local.client.app.v1.ReportMarketingMessageViewedResponse;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class RealMarketingMessageRepository {
    public final FeatureFlagManager featureFlagManager;
    public final LocalService service;
    public final StateFlowImpl allMessages = FlowKt.MutableStateFlow(null);
    public final StateFlowImpl redeemedOfferTokens = FlowKt.MutableStateFlow(EmptySet.INSTANCE);

    public RealMarketingMessageRepository(LocalService localService, FeatureFlagManager featureFlagManager) {
        this.service = localService;
        this.featureFlagManager = featureFlagManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object clearAllBadges(ContinuationImpl continuationImpl) {
        RealMarketingMessageRepository$clearAllBadges$1 realMarketingMessageRepository$clearAllBadges$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealMarketingMessageRepository$clearAllBadges$1) {
            realMarketingMessageRepository$clearAllBadges$1 = (RealMarketingMessageRepository$clearAllBadges$1) continuationImpl;
            int i2 = realMarketingMessageRepository$clearAllBadges$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realMarketingMessageRepository$clearAllBadges$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realMarketingMessageRepository$clearAllBadges$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realMarketingMessageRepository$clearAllBadges$1.label;
                boolean z = true;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!isBadgesEnabled()) {
                        return Boolean.FALSE;
                    }
                    ReportMarketingMessageViewedRequest reportMarketingMessageViewedRequest = new ReportMarketingMessageViewedRequest(new ReportMarketingMessageViewedRequest$ViewedTarget$ClearBadges(true));
                    realMarketingMessageRepository$clearAllBadges$1.label = 1;
                    obj = this.service.reportMarketingMessageViewed(reportMarketingMessageViewedRequest, realMarketingMessageRepository$clearAllBadges$1);
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
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    z = false;
                    Timber.Forest.e("Failed to clear all marketing message badges: " + apiResult, new Object[0]);
                }
                return Boolean.valueOf(z);
            }
        }
        realMarketingMessageRepository$clearAllBadges$1 = new RealMarketingMessageRepository$clearAllBadges$1(this, continuationImpl);
        Object obj2 = realMarketingMessageRepository$clearAllBadges$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realMarketingMessageRepository$clearAllBadges$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: getMarketingMessage-bPdJ9CI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1207getMarketingMessagebPdJ9CI(String str, ContinuationImpl continuationImpl) {
        RealMarketingMessageRepository$getMarketingMessage$1 realMarketingMessageRepository$getMarketingMessage$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealMarketingMessageRepository$getMarketingMessage$1) {
            realMarketingMessageRepository$getMarketingMessage$1 = (RealMarketingMessageRepository$getMarketingMessage$1) continuationImpl;
            int i2 = realMarketingMessageRepository$getMarketingMessage$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realMarketingMessageRepository$getMarketingMessage$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realMarketingMessageRepository$getMarketingMessage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realMarketingMessageRepository$getMarketingMessage$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetMarketingMessageRequest getMarketingMessageRequest = new GetMarketingMessageRequest(str, ByteString.EMPTY);
                    realMarketingMessageRepository$getMarketingMessage$1.label = 1;
                    obj = this.service.getMarketingMessage(getMarketingMessageRequest, realMarketingMessageRepository$getMarketingMessage$1);
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
                if (!(apiResult instanceof ApiResult.Failure)) {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    MarketingMessage marketingMessage = ((GetMarketingMessageResponse) ((ApiResult.Success) apiResult).response).marketing_message;
                    if (marketingMessage != null) {
                        Parcelable.Creator<MarketingMessageData> creator = MarketingMessageData.CREATOR;
                        MarketingMessageData create = DimensionKt.create(marketingMessage, isBadgesEnabled());
                        if (create != null) {
                            return create.withRedeemedStatus((Set) this.redeemedOfferTokens.getValue());
                        }
                    }
                }
                return null;
            }
        }
        realMarketingMessageRepository$getMarketingMessage$1 = new RealMarketingMessageRepository$getMarketingMessage$1(this, continuationImpl);
        Object obj2 = realMarketingMessageRepository$getMarketingMessage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realMarketingMessageRepository$getMarketingMessage$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
        return null;
    }

    public final FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 getMarketingMessages() {
        int i = 0;
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(this.allMessages, this.redeemedOfferTokens, new RealMarketingMessageRepository$getMarketingMessages$1(3, null, i), i);
    }

    public final boolean isBadgesEnabled() {
        return ((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$LocalMarketingMessagesBadging.INSTANCE)).enabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: markMessageAsViewed-bPdJ9CI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1208markMessageAsViewedbPdJ9CI(String str, ContinuationImpl continuationImpl) {
        RealMarketingMessageRepository$markMessageAsViewed$1 realMarketingMessageRepository$markMessageAsViewed$1;
        int i;
        String str2;
        ApiResult apiResult;
        StateFlowImpl stateFlowImpl;
        Object value;
        ArrayList arrayList;
        MarketingMessageData.Badge badge;
        if (continuationImpl instanceof RealMarketingMessageRepository$markMessageAsViewed$1) {
            realMarketingMessageRepository$markMessageAsViewed$1 = (RealMarketingMessageRepository$markMessageAsViewed$1) continuationImpl;
            int i2 = realMarketingMessageRepository$markMessageAsViewed$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realMarketingMessageRepository$markMessageAsViewed$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realMarketingMessageRepository$markMessageAsViewed$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realMarketingMessageRepository$markMessageAsViewed$1.label;
                boolean z = true;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!isBadgesEnabled()) {
                        return Boolean.FALSE;
                    }
                    ReportMarketingMessageViewedRequest reportMarketingMessageViewedRequest = new ReportMarketingMessageViewedRequest(new ReportMarketingMessageViewedRequest$ViewedTarget$MarketingMessageTokens(new ReportMarketingMessageViewedRequest.MarketingMessageTokenList(CollectionsKt__CollectionsJVMKt.listOf(str), ByteString.EMPTY)));
                    realMarketingMessageRepository$markMessageAsViewed$1.L$0 = str;
                    realMarketingMessageRepository$markMessageAsViewed$1.label = 1;
                    obj = this.service.reportMarketingMessageViewed(reportMarketingMessageViewedRequest, realMarketingMessageRepository$markMessageAsViewed$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str2 = str;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = realMarketingMessageRepository$markMessageAsViewed$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Timber.Forest.e("Failed to mark message as viewed: " + apiResult, new Object[0]);
                } else if (CollectionsKt.toSet(((ReportMarketingMessageViewedResponse) ((ApiResult.Success) apiResult).response).successfully_viewed_tokens).contains(str2)) {
                    do {
                        stateFlowImpl = this.allMessages;
                        value = stateFlowImpl.getValue();
                        List list = (List) value;
                        if (list != null) {
                            List<MarketingMessageData> list2 = list;
                            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                            for (MarketingMessageData marketingMessageData : list2) {
                                if (Intrinsics.areEqual(marketingMessageData.messageToken, str2)) {
                                    MarketingMessageData.Badge badge2 = marketingMessageData.badge;
                                    if (badge2 != null) {
                                        String str3 = badge2.text;
                                        str3.getClass();
                                        badge = new MarketingMessageData.Badge(true, str3);
                                    } else {
                                        badge = null;
                                    }
                                    marketingMessageData = MarketingMessageData.m1253copyjf4iykI$default(marketingMessageData, null, null, null, null, null, null, badge, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG2);
                                }
                                arrayList.add(marketingMessageData);
                            }
                        } else {
                            arrayList = null;
                        }
                    } while (!stateFlowImpl.compareAndSet(value, arrayList));
                    return Boolean.valueOf(z);
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }
        realMarketingMessageRepository$markMessageAsViewed$1 = new RealMarketingMessageRepository$markMessageAsViewed$1(this, continuationImpl);
        Object obj2 = realMarketingMessageRepository$markMessageAsViewed$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realMarketingMessageRepository$markMessageAsViewed$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refresh(ContinuationImpl continuationImpl) {
        RealMarketingMessageRepository$refresh$1 realMarketingMessageRepository$refresh$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealMarketingMessageRepository$refresh$1) {
            realMarketingMessageRepository$refresh$1 = (RealMarketingMessageRepository$refresh$1) continuationImpl;
            int i2 = realMarketingMessageRepository$refresh$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realMarketingMessageRepository$refresh$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realMarketingMessageRepository$refresh$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realMarketingMessageRepository$refresh$1.label;
                boolean z = true;
                String str = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ListMarketingMessagesRequest listMarketingMessagesRequest = new ListMarketingMessagesRequest(str, 3);
                    realMarketingMessageRepository$refresh$1.label = 1;
                    obj = this.service.listMarketingMessages(listMarketingMessagesRequest, realMarketingMessageRepository$refresh$1);
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
                    List<MarketingMessage> list = ((ListMarketingMessagesResponse) ((ApiResult.Success) apiResult).response).marketing_messages;
                    ArrayList arrayList = new ArrayList();
                    for (MarketingMessage marketingMessage : list) {
                        Parcelable.Creator<MarketingMessageData> creator = MarketingMessageData.CREATOR;
                        MarketingMessageData create = DimensionKt.create(marketingMessage, isBadgesEnabled());
                        if (create != null) {
                            arrayList.add(create);
                        }
                    }
                    StateFlowImpl stateFlowImpl = this.allMessages;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, arrayList);
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    z = false;
                    Timber.Forest.e("Failed to fetch marketing messages: " + apiResult, new Object[0]);
                }
                return Boolean.valueOf(z);
            }
        }
        realMarketingMessageRepository$refresh$1 = new RealMarketingMessageRepository$refresh$1(this, continuationImpl);
        Object obj2 = realMarketingMessageRepository$refresh$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realMarketingMessageRepository$refresh$1.label;
        boolean z2 = true;
        String str2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Boolean.valueOf(z2);
    }
}
