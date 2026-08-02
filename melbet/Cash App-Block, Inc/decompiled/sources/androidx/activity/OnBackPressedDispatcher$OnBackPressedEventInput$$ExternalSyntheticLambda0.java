package androidx.activity;

import android.content.Context;
import android.net.NetworkInfo;
import android.net.Uri;
import android.view.View;
import androidx.compose.foundation.layout.Arrangement$SpacingAlignmentCalculator;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.metrics.performance.FrameDataApi24;
import androidx.metrics.performance.JankStats;
import androidx.room.TransactorKt;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.EventListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.TopicsSubscriber;
import com.squareup.cash.appmessages.views.TooltipAppMessageView;
import com.squareup.cash.attribution.ConversionListener;
import com.squareup.cash.attribution.DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0;
import com.squareup.cash.attribution.wrappers.AppsFlyerClient;
import com.squareup.cash.attribution.wrappers.InvalidAppsFlyerDeepLinkDomain;
import com.squareup.cash.attribution.wrappers.ProductionAppsFlyerClient;
import com.squareup.cash.cdf.appsflyerdeeplink.AppsFlyerDeepLinkFetchComplete;
import com.squareup.cash.cdf.appsflyerdeeplink.AppsFlyerDeepLinkValidationComplete;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.interaction.UiInteractionLatencyAnalyzer;
import com.squareup.cash.performance.JankStatsAggregator;
import com.squareup.cash.performance.JankStatsAggregatorKt;
import com.squareup.cash.ui.gcm.SandboxedCashWorkerFactoryProvider;
import com.squareup.cash.util.network.impl.AndroidConnectivityManager;
import com.squareup.util.coil.DatadogCoilEventListener;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import okhttp3.ConnectionPool;
import okhttp3.internal.connection.Exchange;
import papa.InteractionEngine;
import papa.InteractionResult;
import papa.InteractionUpdated;
import retrofit2.OkHttpCall;
import timber.log.Timber;

/* loaded from: classes.dex */
public final /* synthetic */ class OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 implements Arrangement$SpacingAlignmentCalculator, SupportSQLiteOpenHelper.Factory, EventListener.Factory, OnSuccessListener, SandboxedCashWorkerFactoryProvider, AccessibilityViewCommand, DeepLinkListener, JankStats.OnFrameListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.compose.foundation.layout.Arrangement$SpacingAlignmentCalculator
    public int align(int i, LayoutDirection layoutDirection) {
        return ((BiasAlignment.Horizontal) this.f$0).align(0, i, layoutDirection);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public SupportSQLiteOpenHelper create(Exchange exchange) {
        Context context = (Context) this.f$0;
        String str = (String) exchange.finder;
        SupportSQLiteOpenHelper.Callback callback = (SupportSQLiteOpenHelper.Callback) exchange.codec;
        callback.getClass();
        if (str != null && str.length() != 0) {
            return new FrameworkSQLiteOpenHelper(context, str, callback, true, true);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a7, code lost:
    
        if (r7 != false) goto L96;
     */
    @Override // com.appsflyer.deeplink.DeepLinkListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDeepLinking(DeepLinkResult deepLinkResult) {
        AppsFlyerDeepLinkFetchComplete.NetworkStatus networkStatus;
        String deepLinkValue;
        AppsFlyerDeepLinkFetchComplete.ErrorType errorType;
        AppsFlyerDeepLinkFetchComplete.ErrorType errorType2;
        ProductionAppsFlyerClient productionAppsFlyerClient = (ProductionAppsFlyerClient) this.f$0;
        deepLinkResult.getClass();
        AndroidConnectivityManager androidConnectivityManager = productionAppsFlyerClient.connectivityManager;
        ConversionListener conversionListener = productionAppsFlyerClient.listener;
        Analytics analytics = productionAppsFlyerClient.analytics;
        NetworkInfo activeNetworkInfo = androidConnectivityManager.connectivityManager.getActiveNetworkInfo();
        boolean z = true;
        if ((activeNetworkInfo != null ? activeNetworkInfo.getTypeName() : null) == null) {
            networkStatus = AppsFlyerDeepLinkFetchComplete.NetworkStatus.OFFLINE;
        } else {
            NetworkInfo activeNetworkInfo2 = androidConnectivityManager.connectivityManager.getActiveNetworkInfo();
            networkStatus = (activeNetworkInfo2 != null && activeNetworkInfo2.isConnected() && activeNetworkInfo2.getType() == 1) ? AppsFlyerDeepLinkFetchComplete.NetworkStatus.WIFI : AppsFlyerDeepLinkFetchComplete.NetworkStatus.CELLULAR;
        }
        AppsFlyerDeepLinkFetchComplete.NetworkStatus networkStatus2 = networkStatus;
        long currentTimeMillis = System.currentTimeMillis();
        int i = ProductionAppsFlyerClient.WhenMappings.$EnumSwitchMapping$1[deepLinkResult.getStatus().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                Timber.Forest.i("AppsFlyer deferred deeplink not found.", new Object[0]);
                AppsFlyerDeepLinkFetchComplete.ResultStatus resultStatus = AppsFlyerDeepLinkFetchComplete.ResultStatus.NOT_FOUND;
                Long l = productionAppsFlyerClient.timestampOnInitialization;
                analytics.track(new AppsFlyerDeepLinkFetchComplete(resultStatus, null, networkStatus2, l != null ? Long.valueOf(currentTimeMillis - l.longValue()) : null, null, productionAppsFlyerClient.appsFlyerId), null);
                conversionListener.getClass();
                return;
            }
            DeepLinkResult.Error error = deepLinkResult.getError();
            int i2 = error == null ? -1 : ProductionAppsFlyerClient.WhenMappings.$EnumSwitchMapping$0[error.ordinal()];
            if (i2 != -1) {
                if (i2 == 1) {
                    errorType2 = AppsFlyerDeepLinkFetchComplete.ErrorType.TIME_OUT;
                } else if (i2 == 2) {
                    errorType2 = AppsFlyerDeepLinkFetchComplete.ErrorType.NETWORK;
                } else if (i2 == 3) {
                    errorType2 = AppsFlyerDeepLinkFetchComplete.ErrorType.HTTP_STATUS_CODE;
                } else if (i2 == 4) {
                    errorType2 = AppsFlyerDeepLinkFetchComplete.ErrorType.DEVELOPER_ERROR;
                } else {
                    if (i2 != 5) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    errorType2 = AppsFlyerDeepLinkFetchComplete.ErrorType.UNEXPECTED;
                }
                errorType = errorType2;
            } else {
                errorType = null;
            }
            DeepLink deepLink = deepLinkResult.getDeepLink();
            String deepLinkValue2 = deepLink != null ? deepLink.getDeepLinkValue() : null;
            AppsFlyerDeepLinkFetchComplete.ResultStatus resultStatus2 = AppsFlyerDeepLinkFetchComplete.ResultStatus.ERROR;
            Long l2 = productionAppsFlyerClient.timestampOnInitialization;
            analytics.track(new AppsFlyerDeepLinkFetchComplete(resultStatus2, errorType, networkStatus2, l2 != null ? Long.valueOf(currentTimeMillis - l2.longValue()) : null, deepLinkValue2 != null ? TransactorKt.redactUrl(deepLinkValue2) : null, productionAppsFlyerClient.appsFlyerId), null);
            return;
        }
        DeepLink deepLink2 = deepLinkResult.getDeepLink();
        String stringValue = deepLink2 != null ? deepLink2.getStringValue("link") : null;
        DeepLink deepLink3 = deepLinkResult.getDeepLink();
        if (deepLink3 != null && (deepLinkValue = deepLink3.getDeepLinkValue()) != null) {
            stringValue = deepLinkValue;
        } else if (stringValue == null || !Intrinsics.areEqual(Uri.parse(stringValue).getScheme(), "https")) {
            stringValue = null;
        }
        Timber.Forest.i("AppsFlyer handling deferred deeplink. result=" + deepLinkResult.getDeepLink(), new Object[0]);
        AppsFlyerDeepLinkFetchComplete.ResultStatus resultStatus3 = AppsFlyerDeepLinkFetchComplete.ResultStatus.FOUND;
        Long l3 = productionAppsFlyerClient.timestampOnInitialization;
        analytics.track(new AppsFlyerDeepLinkFetchComplete(resultStatus3, null, networkStatus2, l3 != null ? Long.valueOf(currentTimeMillis - l3.longValue()) : null, stringValue != null ? TransactorKt.redactUrl(stringValue) : null, productionAppsFlyerClient.appsFlyerId), null);
        if (stringValue != null) {
            List list = (List) productionAppsFlyerClient.appsFlyerDeepLinkValidator.delegate;
            Uri parse = Uri.parse(stringValue);
            String decode = URLDecoder.decode(stringValue, "utf-8");
            AppsFlyerClient.Companion.getClass();
            if (!CollectionsKt.contains(AppsFlyerClient.Companion.getHOSTS(), parse.getHost())) {
                decode.getClass();
                boolean hostEndsWithDomain = ConnectionPool.hostEndsWithDomain(Uri.parse(decode).getHost(), list);
                boolean hostEndsWithDomain2 = ConnectionPool.hostEndsWithDomain(parse.getHost(), list);
                if (hostEndsWithDomain) {
                }
            }
            z = false;
            analytics.track(new AppsFlyerDeepLinkValidationComplete(Boolean.valueOf(z), TransactorKt.redactUrl(stringValue), productionAppsFlyerClient.appsFlyerId), null);
            if (z) {
                DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0 deferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0 = productionAppsFlyerClient.deferredDeepLinkEmitter;
                DeepLink deepLink4 = deepLinkResult.getDeepLink();
                deferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0.defer(new com.squareup.cash.attribution.deeplink.DeepLink(stringValue, deepLink4 != null ? deepLink4.getStringValue("deep_link_sub1") : null, productionAppsFlyerClient.appsFlyerId));
            } else {
                productionAppsFlyerClient.errorReporter.report(new InvalidAppsFlyerDeepLinkDomain(Uri.parse(stringValue).getHost()), productionAppsFlyerClient.oneErrorPerAppSessionStrategy);
            }
        }
        conversionListener.getClass();
    }

    @Override // androidx.metrics.performance.JankStats.OnFrameListener
    public void onFrame(FrameDataApi24 frameDataApi24) {
        JankStatsAggregator jankStatsAggregator = (JankStatsAggregator) this.f$0;
        long frameStartNanos = frameDataApi24.getFrameStartNanos() / 1000000;
        JankStatsAggregator.FrameMetricsBuffer frameMetricsBuffer = jankStatsAggregator.frameMetricsBuffer;
        LinkedHashMap linkedHashMap = jankStatsAggregator.screenLastAlertTime;
        boolean isJank = frameDataApi24.isJank();
        long[] jArr = frameMetricsBuffer.timestamps;
        int i = frameMetricsBuffer.writeIndex;
        jArr[i] = frameStartNanos;
        frameMetricsBuffer.jankFlags[i] = isJank;
        frameMetricsBuffer.writeIndex = (i + 1) % jArr.length;
        int i2 = frameMetricsBuffer.size;
        if (i2 < jArr.length) {
            frameMetricsBuffer.size = i2 + 1;
        }
        if (!frameDataApi24.isJank()) {
            jankStatsAggregator.consecutiveJankyFrames = 0;
            return;
        }
        jankStatsAggregator.consecutiveJankyFrames++;
        int i3 = jankStatsAggregator.currentScreenId;
        if (jankStatsAggregator.shouldMonitorProduction) {
            Long l = (Long) linkedHashMap.get(Integer.valueOf(i3));
            if (frameStartNanos - (l != null ? l.longValue() : 0L) >= 30000) {
                long j = frameStartNanos - 1000;
                int i4 = frameMetricsBuffer.size;
                long[] jArr2 = frameMetricsBuffer.timestamps;
                int i5 = 0;
                for (int i6 = 0; i6 < i4; i6++) {
                    if (jArr2[i6] > j) {
                        i5++;
                    }
                }
                int i7 = frameMetricsBuffer.size;
                int i8 = 0;
                for (int i9 = 0; i9 < i7; i9++) {
                    if (jArr2[i9] > j && frameMetricsBuffer.jankFlags[i9]) {
                        i8++;
                    }
                }
                double d = i5 >= 30 ? (i8 / i5) * 100.0d : 0.0d;
                int i10 = jankStatsAggregator.consecutiveJankyFrames;
                JankStatsAggregator.JankMetrics jankMetrics = new JankStatsAggregator.JankMetrics(i5, i8, d, i10, i10 >= 3 || (i5 >= 30 && d >= 15.0d));
                if (jankMetrics.getHasSignificantJank()) {
                    long j2 = frameStartNanos - jankStatsAggregator.lastScreenTransitionTime;
                    boolean z = j2 < 750;
                    String str = j2 < 100 ? jankStatsAggregator.previousScreenName : jankStatsAggregator.currentScreenName;
                    linkedHashMap.put(Integer.valueOf(jankStatsAggregator.currentScreenId), Long.valueOf(frameStartNanos));
                    LinkedHashMap mutableMapOf = MapsKt__MapsKt.mutableMapOf(new Pair("screen", JankStatsAggregatorKt.access$simplifyTag(str)), new Pair("consecutive_janky_frames", Integer.valueOf(jankMetrics.getConsecutiveJankyFrames())), new Pair("jank_percentage", String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(jankMetrics.getJankPercentage())}, 1))));
                    if (z) {
                        mutableMapOf.put("during_transition", Boolean.TRUE);
                        mutableMapOf.put("ms_since_transition", Long.valueOf(j2));
                        mutableMapOf.put("transition_from_screen", JankStatsAggregatorKt.access$simplifyTag(jankStatsAggregator.previousScreenName));
                    }
                    jankStatsAggregator.observabilityManager.logEvent("android_ui_jank_detected", mutableMapOf);
                }
            }
        }
    }

    public void onInteractionUpdate(InteractionUpdated interactionUpdated) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 10:
                new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(new ConnectionPool((UiInteractionLatencyAnalyzer) obj), 12).onInteractionUpdate(interactionUpdated);
                break;
            default:
                ConnectionPool connectionPool = (ConnectionPool) obj;
                if (!(interactionUpdated instanceof InteractionUpdated.CanceledOnTimeout)) {
                    if (!(interactionUpdated instanceof InteractionUpdated.CanceledOnEvent)) {
                        if (interactionUpdated instanceof InteractionUpdated.FrameRendered) {
                            InteractionUpdated.FrameRendered frameRendered = (InteractionUpdated.FrameRendered) interactionUpdated;
                            InteractionEngine.RealRunningInteraction realRunningInteraction = frameRendered.interaction;
                            connectionPool.onInteractionResult(new InteractionResult.Finished(new OkHttpCall.AnonymousClass1(realRunningInteraction.interactionTrigger, realRunningInteraction.sentEvents), frameRendered.frameRenderedUptime));
                            break;
                        }
                    } else {
                        InteractionUpdated.CanceledOnEvent canceledOnEvent = (InteractionUpdated.CanceledOnEvent) interactionUpdated;
                        InteractionEngine.RealRunningInteraction realRunningInteraction2 = canceledOnEvent.interaction;
                        connectionPool.onInteractionResult(new InteractionResult.Canceled(new OkHttpCall.AnonymousClass1(realRunningInteraction2.interactionTrigger, realRunningInteraction2.sentEvents), canceledOnEvent.reason, canceledOnEvent.event.uptime));
                        break;
                    }
                } else {
                    InteractionUpdated.CanceledOnTimeout canceledOnTimeout = (InteractionUpdated.CanceledOnTimeout) interactionUpdated;
                    InteractionEngine.RealRunningInteraction realRunningInteraction3 = canceledOnTimeout.interaction;
                    OkHttpCall.AnonymousClass1 anonymousClass1 = new OkHttpCall.AnonymousClass1(realRunningInteraction3.interactionTrigger, realRunningInteraction3.sentEvents);
                    Duration.Companion companion = Duration.Companion;
                    connectionPool.onInteractionResult(new InteractionResult.Canceled(anonymousClass1, "Timeout after " + ((Object) Duration.m4177toStringimpl(canceledOnTimeout.timeout)), DurationKt.toDuration(System.nanoTime(), DurationUnit.NANOSECONDS)));
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((FirebaseMessaging) this.f$0).lambda$new$3((TopicsSubscriber) obj);
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean perform(View view) {
        TooltipAppMessageView tooltipAppMessageView = (TooltipAppMessageView) this.f$0;
        view.getClass();
        tooltipAppMessageView.tooltipContainer.animateOut();
        return true;
    }

    @Override // coil3.EventListener.Factory
    public EventListener create() {
        return (DatadogCoilEventListener) this.f$0;
    }
}
