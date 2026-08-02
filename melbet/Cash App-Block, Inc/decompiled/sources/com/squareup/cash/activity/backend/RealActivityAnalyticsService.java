package com.squareup.cash.activity.backend;

import androidx.biometric.CryptoObjectUtils;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.n;
import com.squareup.cash.activity.analytics.ActivityAnalyticsService;
import com.squareup.cash.activity.analytics.ActivityCdfMappingsKt;
import com.squareup.cash.appmessages.OnDemandMessageAnalyticsData;
import com.squareup.cash.arcade.MotionKt$$ExternalSyntheticLambda0;
import com.squareup.cash.cdf.ActivityItemOrigin;
import com.squareup.cash.cdf.AppMessageFormat;
import com.squareup.cash.cdf.PaymentOrientation;
import com.squareup.cash.cdf.PaymentRole;
import com.squareup.cash.cdf.QABItemOrigin;
import com.squareup.cash.cdf.QABItemType;
import com.squareup.cash.cdf.activityhistory.ActivityHistorySelectQABItem;
import com.squareup.cash.cdf.activityhistory.ActivityHistoryTapItem;
import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.cash.history.analytics.LoadTimeClock$Factory$Impl;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.transfers.backend.api.ScheduledReloadsManager;
import com.squareup.cash.treehouse.activity.ActivityDataBridge;
import com.squareup.protos.cash.activity.api.v1.ActivityItemType;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.ui.PaymentState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealActivityAnalyticsService implements ActivityAnalyticsService {
    public final ActivityDataBridge activityDataBridge;
    public final Analytics analyticsService;
    public final LoadTimeClock loadTimeClock;
    public String queryToken;
    public String searchFlowToken;
    public final Lazy activityFlowToken$delegate = LazyKt.lazy(new MotionKt$$ExternalSyntheticLambda0(this));
    public boolean isFirstView = true;

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider activityDataBridge;
        public final Provider analyticsService;
        public final Provider loadTimeClockFactory;
        public final LambdaProvider uuidGenerator;

        public /* synthetic */ MetroFactory(Provider provider, LambdaProvider lambdaProvider, Provider provider2, Factory factory, int i) {
            this.$r8$classId = i;
            this.analyticsService = provider;
            this.uuidGenerator = lambdaProvider;
            this.activityDataBridge = provider2;
            this.loadTimeClockFactory = factory;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.loadTimeClockFactory;
            Provider provider2 = this.activityDataBridge;
            LambdaProvider lambdaProvider = this.uuidGenerator;
            Provider provider3 = this.analyticsService;
            switch (i) {
                case 0:
                    Analytics analytics = (Analytics) provider3.invoke();
                    RealUuidGenerator realUuidGenerator = (RealUuidGenerator) lambdaProvider.lambda.invoke();
                    ActivityDataBridge activityDataBridge = (ActivityDataBridge) provider2.invoke();
                    LoadTimeClock$Factory$Impl loadTimeClock$Factory$Impl = (LoadTimeClock$Factory$Impl) provider.invoke();
                    analytics.getClass();
                    realUuidGenerator.getClass();
                    activityDataBridge.getClass();
                    loadTimeClock$Factory$Impl.getClass();
                    return new RealActivityAnalyticsService(analytics, realUuidGenerator, activityDataBridge, loadTimeClock$Factory$Impl);
                default:
                    LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) provider3.invoke();
                    AndroidStringManager androidStringManager = (AndroidStringManager) lambdaProvider.lambda.invoke();
                    ScheduledReloadsManager scheduledReloadsManager = (ScheduledReloadsManager) provider2.invoke();
                    RealInstrumentManager realInstrumentManager = (RealInstrumentManager) provider.invoke();
                    factory.getClass();
                    androidStringManager.getClass();
                    scheduledReloadsManager.getClass();
                    realInstrumentManager.getClass();
                    return new n(factory, androidStringManager, scheduledReloadsManager, realInstrumentManager);
            }
        }
    }

    public RealActivityAnalyticsService(Analytics analytics, RealUuidGenerator realUuidGenerator, ActivityDataBridge activityDataBridge, LoadTimeClock$Factory$Impl loadTimeClock$Factory$Impl) {
        this.analyticsService = analytics;
        this.activityDataBridge = activityDataBridge;
        this.loadTimeClock = loadTimeClock$Factory$Impl.create(false);
    }

    public static AppMessageFormat toCdf(OnDemandMessageAnalyticsData.Format format2) {
        int ordinal = format2.ordinal();
        if (ordinal == 0) {
            return AppMessageFormat.CARD;
        }
        if (ordinal == 1) {
            return AppMessageFormat.INLINE_V2;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public final String getActivityFlowToken() {
        return (String) this.activityFlowToken$delegate.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (r6.setNativeQueryToken(r7, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (r6.setNativeSearchFlowToken(r8, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        if (r6.setNativeActivityFlowToken(r8, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setTreehouseAnalyticsTokens(ContinuationImpl continuationImpl) {
        RealActivityAnalyticsService$setTreehouseAnalyticsTokens$1 realActivityAnalyticsService$setTreehouseAnalyticsTokens$1;
        int i;
        if (continuationImpl instanceof RealActivityAnalyticsService$setTreehouseAnalyticsTokens$1) {
            realActivityAnalyticsService$setTreehouseAnalyticsTokens$1 = (RealActivityAnalyticsService$setTreehouseAnalyticsTokens$1) continuationImpl;
            int i2 = realActivityAnalyticsService$setTreehouseAnalyticsTokens$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realActivityAnalyticsService$setTreehouseAnalyticsTokens$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realActivityAnalyticsService$setTreehouseAnalyticsTokens$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realActivityAnalyticsService$setTreehouseAnalyticsTokens$1.label;
                ActivityDataBridge activityDataBridge = this.activityDataBridge;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String activityFlowToken = getActivityFlowToken();
                    realActivityAnalyticsService$setTreehouseAnalyticsTokens$1.label = 1;
                } else if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    String str = this.queryToken;
                    realActivityAnalyticsService$setTreehouseAnalyticsTokens$1.label = 3;
                }
                String str2 = this.searchFlowToken;
                realActivityAnalyticsService$setTreehouseAnalyticsTokens$1.label = 2;
            }
        }
        realActivityAnalyticsService$setTreehouseAnalyticsTokens$1 = new RealActivityAnalyticsService$setTreehouseAnalyticsTokens$1(this, continuationImpl);
        Object obj2 = realActivityAnalyticsService$setTreehouseAnalyticsTokens$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realActivityAnalyticsService$setTreehouseAnalyticsTokens$1.label;
        ActivityDataBridge activityDataBridge2 = this.activityDataBridge;
        if (i != 0) {
        }
        String str22 = this.searchFlowToken;
        realActivityAnalyticsService$setTreehouseAnalyticsTokens$1.label = 2;
    }

    public final void trackItemTap(PaymentHistoryActivityItem paymentHistoryActivityItem, ActivityItemOrigin activityItemOrigin, int i, ActivityAnalyticsService.TapElement tapElement) {
        activityItemOrigin.getClass();
        String str = paymentHistoryActivityItem.getUiPayment().token;
        if (str == null) {
            str = "";
        }
        Boolean valueOf = Boolean.valueOf(CryptoObjectUtils.isPending(paymentHistoryActivityItem));
        Boolean valueOf2 = Boolean.valueOf(paymentHistoryActivityItem.isBadged());
        Role role = paymentHistoryActivityItem.getUiPayment().role;
        PaymentRole cdfPaymentRole = role != null ? ActivityCdfMappingsKt.toCdfPaymentRole(role) : null;
        Orientation orientation = paymentHistoryActivityItem.getUiPayment().orientation;
        PaymentOrientation cdfPaymentOrientation = orientation != null ? ActivityCdfMappingsKt.toCdfPaymentOrientation(orientation) : null;
        PaymentState state = paymentHistoryActivityItem.getState();
        com.squareup.cash.cdf.PaymentState cdfPaymentState = state != null ? ActivityCdfMappingsKt.toCdfPaymentState(state) : null;
        String activityFlowToken = getActivityFlowToken();
        String str2 = this.searchFlowToken;
        String str3 = this.queryToken;
        ActivityItemType itemType = ActivityItemKt.getItemType(paymentHistoryActivityItem);
        this.analyticsService.track(new ActivityHistoryTapItem(str, valueOf, valueOf2, cdfPaymentRole, cdfPaymentOrientation, cdfPaymentState, activityItemOrigin, activityFlowToken, str2, str3, itemType != null ? itemType.toString() : null, CryptoObjectUtils.getUiCounterparty(paymentHistoryActivityItem).id, Integer.valueOf(i), tapElement.label), null);
    }

    public final void trackSelectQabItem(QABItemType qABItemType, String str, QABItemOrigin qABItemOrigin) {
        this.analyticsService.track(new ActivityHistorySelectQABItem(qABItemType, qABItemOrigin, Boolean.FALSE, getActivityFlowToken(), str), null);
    }
}
