package bo.app;

import android.app.Activity;
import android.app.ApplicationExitInfo;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.animation.BoundsAnimation$animate$1;
import androidx.media3.common.Player;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.CodecParameters;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda4;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.source.MediaSource$MediaPeriodId;
import androidx.media3.exoplayer.source.ProgressiveMediaPeriod;
import androidx.media3.exoplayer.video.DefaultVideoSink;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.extractor.SeekMap;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.media3.ui.PlayerView;
import androidx.room.TransactionExecutor;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.controllers.BaseConstraintController$track$1$listener$1;
import androidx.work.impl.constraints.trackers.BatteryNotLowTracker;
import androidx.work.impl.model.WorkGenerationalId;
import app.cash.zipline.CallResult;
import coil3.svg.internal.AndroidSvg;
import com.appsflyer.internal.AFa1ySDK;
import com.appsflyer.internal.AFh1mSDK;
import com.appsflyer.internal.AFj1sSDK;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$open$2;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.storage.EventBatchWriter;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.configuration.Configuration;
import com.datadog.android.core.internal.CoreFeature;
import com.datadog.android.core.internal.CoreFeature$stop$2;
import com.datadog.android.core.internal.DatadogCore;
import com.datadog.android.core.internal.SdkFeature;
import com.datadog.android.core.internal.persistence.AsyncEventWriteScope;
import com.datadog.android.core.internal.time.DatadogNtpEndpoint;
import com.datadog.android.core.internal.time.KronosTimeProvider;
import com.datadog.android.internal.system.BuildSdkVersionProvider$Companion$DEFAULT$1;
import com.datadog.android.internal.telemetry.InternalTelemetryEvent;
import com.datadog.android.ndk.internal.DatadogNdkCrashHandler$readCrashData$2;
import com.datadog.android.ndk.internal.NdkCrashLog;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.internal.DatadogLateCrashReporter;
import com.datadog.android.rum.internal.LateCrashReporter;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.RumFeature$onInitialize$1;
import com.datadog.android.rum.internal.domain.RumContext;
import com.datadog.android.rum.internal.domain.scope.RumSessionScope;
import com.datadog.android.rum.internal.monitor.DatadogRumMonitor;
import com.datadog.android.rum.internal.utils.WriteOperation$submit$1$1;
import com.datadog.android.rum.tracking.ActivityViewTrackingStrategy;
import com.fillr.browsersdk.model.FillrWebView;
import com.fillr.browsersdk.model.FillrWidget;
import com.fillr.n;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.android.material.datepicker.UtcDates;
import com.google.android.material.textfield.TextInputLayout;
import com.google.common.collect.ImmutableCollection;
import com.google.common.util.concurrent.CombinedFuture;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.gson.JsonObject;
import com.google.mlkit.vision.text.internal.zzr;
import com.google.zxing.BinaryBitmap;
import com.lyft.kronos.DefaultParam;
import com.lyft.kronos.internal.KronosClockImpl;
import com.lyft.kronos.internal.ntp.DnsResolverImpl;
import com.lyft.kronos.internal.ntp.SntpClient;
import com.lyft.kronos.internal.ntp.SntpServiceImpl;
import com.squareup.cash.R;
import com.stripe.hcaptcha.HCaptcha;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes3.dex */
public final /* synthetic */ class q4$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ q4$$ExternalSyntheticLambda0(CombinedFuture combinedFuture, int i, ListenableFuture listenableFuture) {
        this.$r8$classId = 28;
        this.f$0 = combinedFuture;
        this.f$1 = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context createDeviceProtectedStorageContext;
        switch (this.$r8$classId) {
            case 0:
                q4.a((Bitmap) this.f$0, (ImageView) this.f$1);
                return;
            case 1:
                ((ProgressiveMediaPeriod) this.f$0).setSeekMap((SeekMap) this.f$1);
                return;
            case 2:
                ((DefaultVideoSink) ((CallResult) this.f$0).serviceNames).listener.onVideoSizeChanged((VideoSize) this.f$1);
                return;
            case 3:
                AndroidSvg androidSvg = (AndroidSvg) this.f$0;
                CodecParameters codecParameters = (CodecParameters) this.f$1;
                ExoPlayerImpl.ComponentListener componentListener = (ExoPlayerImpl.ComponentListener) androidSvg.renderOptions;
                String str = Util.DEVICE_DEBUG_INFO;
                CallResult.access$2000(ExoPlayerImpl.this.videoListenerManager, codecParameters);
                return;
            case 4:
                AndroidSvg androidSvg2 = (AndroidSvg) this.f$0;
                VideoSize videoSize = (VideoSize) this.f$1;
                ExoPlayerImpl.ComponentListener componentListener2 = (ExoPlayerImpl.ComponentListener) androidSvg2.renderOptions;
                String str2 = Util.DEVICE_DEBUG_INFO;
                ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
                exoPlayerImpl.videoSize = videoSize;
                exoPlayerImpl.listeners.sendEvent(25, new ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda4(videoSize));
                return;
            case 5:
                AndroidSvg androidSvg3 = (AndroidSvg) this.f$0;
                DecoderCounters decoderCounters = (DecoderCounters) this.f$1;
                synchronized (decoderCounters) {
                }
                ExoPlayerImpl.ComponentListener componentListener3 = (ExoPlayerImpl.ComponentListener) androidSvg3.renderOptions;
                String str3 = Util.DEVICE_DEBUG_INFO;
                DefaultAnalyticsCollector defaultAnalyticsCollector = ExoPlayerImpl.this.analyticsCollector;
                AnalyticsListener.EventTime generateEventTime = defaultAnalyticsCollector.generateEventTime((MediaSource$MediaPeriodId) defaultAnalyticsCollector.mediaPeriodQueueTracker.f);
                defaultAnalyticsCollector.sendEvent(generateEventTime, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1, new ExoPlayerImplInternal$$ExternalSyntheticLambda2(generateEventTime, decoderCounters));
                return;
            case 6:
                SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) this.f$0;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f$1;
                SurfaceTexture surfaceTexture2 = sphericalGLSurfaceView.surfaceTexture;
                Surface surface = sphericalGLSurfaceView.surface;
                Surface surface2 = new Surface(surfaceTexture);
                sphericalGLSurfaceView.surfaceTexture = surfaceTexture;
                sphericalGLSurfaceView.surface = surface2;
                Iterator it = sphericalGLSurfaceView.videoSurfaceListeners.iterator();
                while (it.hasNext()) {
                    ExoPlayerImpl.this.setVideoOutputInternal(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 7:
                PlayerView playerView = (PlayerView) this.f$1;
                Bitmap bitmap = (Bitmap) this.f$0;
                int i = PlayerView.$r8$clinit;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(playerView.getResources(), bitmap);
                ImageView imageView = playerView.imageView;
                if (imageView != null) {
                    imageView.setImageDrawable(bitmapDrawable);
                    playerView.updateImageViewAspectRatio();
                }
                Player player = playerView.player;
                if (player != null) {
                    ExoPlayerImpl exoPlayerImpl2 = (ExoPlayerImpl) player;
                    if (exoPlayerImpl2.isCommandAvailable(30) && exoPlayerImpl2.getCurrentTracks().isTypeSelected(2)) {
                        return;
                    }
                }
                if (imageView != null) {
                    imageView.setVisibility(0);
                    playerView.updateImageViewAspectRatio();
                }
                View view = playerView.shutterView;
                if (view != null) {
                    view.setVisibility(0);
                    return;
                }
                return;
            case 8:
                Runnable runnable = (Runnable) this.f$0;
                TransactionExecutor transactionExecutor = (TransactionExecutor) this.f$1;
                try {
                    runnable.run();
                    return;
                } finally {
                    transactionExecutor.scheduleNext();
                }
            case 9:
                Processor processor = (Processor) this.f$0;
                WorkGenerationalId workGenerationalId = (WorkGenerationalId) this.f$1;
                synchronized (processor.mLock) {
                    try {
                        Iterator it2 = processor.mOuterListeners.iterator();
                        while (it2.hasNext()) {
                            ((ExecutionListener) it2.next()).onExecuted(workGenerationalId, false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 10:
                List list = (List) this.f$0;
                BatteryNotLowTracker batteryNotLowTracker = (BatteryNotLowTracker) this.f$1;
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    ((BaseConstraintController$track$1$listener$1) it3.next()).onConstraintChanged(batteryNotLowTracker.currentState);
                }
                return;
            case 11:
                WorkManagerImpl workManagerImpl = (WorkManagerImpl) this.f$0;
                String uuid = ((UUID) this.f$1).toString();
                uuid.getClass();
                Trace.cancel(workManagerImpl, uuid);
                return;
            case 12:
                ((AFa1ySDK) this.f$0).getCurrencyIso4217Code((AFh1mSDK) this.f$1);
                return;
            case 13:
                ((AFj1sSDK) this.f$0).getMonetizationNetwork((Runnable) this.f$1);
                return;
            case 14:
                DefaultInAppMessageViewWrapper$open$2.onLayoutChange$lambda$1((DefaultInAppMessageViewWrapper) this.f$0, (ViewGroup) this.f$1);
                return;
            case 15:
                CoreFeature coreFeature = (CoreFeature) this.f$0;
                Context context = (Context) this.f$1;
                InternalLogger internalLogger = coreFeature.internalLogger;
                if (((BuildSdkVersionProvider$Companion$DEFAULT$1) coreFeature.buildSdkVersionProvider).isAtLeastN && (createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext()) != null) {
                    context = createDeviceProtectedStorageContext;
                }
                List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new DatadogNtpEndpoint[]{DatadogNtpEndpoint.NTP_0, DatadogNtpEndpoint.NTP_1, DatadogNtpEndpoint.NTP_2, DatadogNtpEndpoint.NTP_3});
                int i2 = 10;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOf, 10));
                Iterator it4 = listOf.iterator();
                while (it4.hasNext()) {
                    arrayList.add(((DatadogNtpEndpoint) it4.next()).host);
                }
                n.b bVar = new n.b(internalLogger);
                long j = DefaultParam.TIMEOUT_MS;
                long j2 = DefaultParam.MAX_NTP_RESPONSE_TIME_MS;
                context.getClass();
                com.fillr.e eVar = new com.fillr.e();
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.lyft.kronos.shared_preferences", 0);
                sharedPreferences.getClass();
                SntpServiceImpl sntpServiceImpl = new SntpServiceImpl(new SntpClient(eVar, new DnsResolverImpl(), new DnsResolverImpl()), eVar, new BinaryBitmap(i2, new zzr(sharedPreferences), eVar), bVar, arrayList, j, 300000L, 1800000L, j2);
                KronosClockImpl kronosClockImpl = new KronosClockImpl(sntpServiceImpl, eVar);
                try {
                    sntpServiceImpl.syncInBackground();
                } catch (IllegalStateException e) {
                    DBUtil.log$default(coreFeature.internalLogger, 5, InternalLogger.Target.MAINTAINER, CoreFeature$stop$2.INSTANCE$2, e, false, 48);
                }
                coreFeature.timeProvider = new KronosTimeProvider(kronosClockImpl, internalLogger);
                coreFeature.kronosClock = kronosClockImpl;
                return;
            case 16:
                DatadogCore datadogCore = (DatadogCore) this.f$0;
                UUID uuid2 = (UUID) this.f$1;
                datadogCore.getCoreFeature$dd_sdk_android_core_release().userInfoProvider.setAnonymousId(uuid2 != null ? uuid2.toString() : null);
                return;
            case 17:
                DatadogCore datadogCore2 = (DatadogCore) this.f$0;
                Configuration configuration = (Configuration) this.f$1;
                SdkFeature feature = datadogCore2.getFeature("rum");
                if (feature == null) {
                    return;
                }
                boolean z = configuration.crashReportsEnabled;
                Configuration.Core core = configuration.coreConfig;
                feature.sendEvent(new InternalTelemetryEvent.Configuration(z, Thread$State$EnumUnboxingLocalUtility.getWindowDurationMs(core.batchSize), Thread$State$EnumUnboxingLocalUtility.getBaseStepMs(core.uploadFrequency), false, Thread$State$EnumUnboxingLocalUtility.getMaxBatchesPerUploadJob(core.batchProcessingLevel)));
                return;
            case 18:
                AsyncEventWriteScope asyncEventWriteScope = (AsyncEventWriteScope) this.f$0;
                Function1 function1 = (Function1) this.f$1;
                synchronized (asyncEventWriteScope.featureWriteLock) {
                    function1.invoke((EventBatchWriter) asyncEventWriteScope.writer);
                }
                return;
            case 19:
                HCaptcha hCaptcha = (HCaptcha) this.f$0;
                DatadogCore datadogCore3 = (DatadogCore) this.f$1;
                NdkCrashLog ndkCrashLog = (NdkCrashLog) hCaptcha.captchaVerifier;
                if (ndkCrashLog != null) {
                    JsonObject jsonObject = (JsonObject) hCaptcha.internalConfig;
                    String str4 = ndkCrashLog.signalName;
                    String format2 = String.format(Locale.US, "NDK crash detected with signal: %s", Arrays.copyOf(new Object[]{str4}, 1));
                    if (jsonObject != null) {
                        SdkFeature feature2 = datadogCore3.getFeature("rum");
                        if (feature2 != null) {
                            feature2.sendEvent(MapsKt__MapsKt.mapOf(new Pair("type", "ndk_crash"), new Pair("sourceType", (String) hCaptcha.onOpenListeners), new Pair("timestamp", Long.valueOf(ndkCrashLog.timestamp)), new Pair("timeSinceAppStartMs", ndkCrashLog.timeSinceAppStartMs), new Pair("signalName", str4), new Pair("stacktrace", ndkCrashLog.stacktrace), new Pair("message", format2), new Pair("lastViewEvent", jsonObject)));
                        } else {
                            DBUtil.log$default((InternalLogger) hCaptcha.onSuccessListeners, 3, InternalLogger.Target.USER, DatadogNdkCrashHandler$readCrashData$2.INSTANCE$1, null, false, 56);
                        }
                    }
                    hCaptcha.internalConfig = null;
                    hCaptcha.captchaVerifier = null;
                    return;
                }
                return;
            case 20:
                RumFeature rumFeature = (RumFeature) this.f$0;
                ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) this.f$1;
                InternalSdkCore internalSdkCore = rumFeature.sdkCore;
                internalSdkCore.getClass();
                JsonObject lastViewEvent = internalSdkCore.getLastViewEvent();
                if (lastViewEvent != null) {
                    ((DatadogLateCrashReporter) ((LateCrashReporter) rumFeature.lateCrashEventHandler$delegate.getValue())).handleAnrCrash(applicationExitInfo, lastViewEvent, rumFeature.dataWriter);
                    return;
                } else {
                    DBUtil.log$default(internalSdkCore.getInternalLogger(), 3, InternalLogger.Target.USER, RumFeature$onInitialize$1.INSTANCE$8, null, false, 56);
                    return;
                }
            case 21:
                DatadogRumMonitor datadogRumMonitor = (DatadogRumMonitor) this.f$0;
                BoundsAnimation$animate$1 boundsAnimation$animate$1 = (BoundsAnimation$animate$1) this.f$1;
                RumSessionScope activeSession = datadogRumMonitor.rootScope.getActiveSession();
                if (activeSession != null) {
                    RumContext rumContext = activeSession.getRumContext();
                    String str5 = rumContext.sessionId;
                    if (rumContext.sessionState != 1 && !Intrinsics.areEqual(str5, RumContext.NULL_UUID)) {
                        r4 = str5;
                    }
                }
                boundsAnimation$animate$1.invoke(r4);
                return;
            case 22:
                ActivityViewTrackingStrategy activityViewTrackingStrategy = (ActivityViewTrackingStrategy) this.f$0;
                Activity activity = (Activity) this.f$1;
                InternalLogger internalLogger$dd_sdk_android_rum_release = activityViewTrackingStrategy.getInternalLogger$dd_sdk_android_rum_release();
                try {
                    RumMonitor rumMonitor = activityViewTrackingStrategy.getRumMonitor();
                    if (rumMonitor != null) {
                        EmptyMap emptyMap = EmptyMap.INSTANCE;
                        emptyMap.getClass();
                        rumMonitor.stopView(emptyMap, activity);
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    DBUtil.log$default(internalLogger$dd_sdk_android_rum_release, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), WriteOperation$submit$1$1.INSTANCE$1, e2, 48);
                    return;
                }
            case 23:
                FillrWebView fillrWebView = (FillrWebView) this.f$0;
                FillrWidget.WidgetType widgetType = (FillrWidget.WidgetType) this.f$1;
                if (fillrWebView.viewId == null && com.fillr.n1.getInstance() != null) {
                    fillrWebView.viewId = com.fillr.n1.getInstance().getWebviewReference(fillrWebView);
                }
                fillrWebView.loadJavascript("!function(e){var i=!1;i=!(\"undefined\"==typeof PopWidgetInterface&&\"MOBILE\"==e||\"undefined\"==typeof FillrCartInformationExtractionInterface&&\"CART_SCRAPER\"==e),\"undefined\"!=typeof FillrAndroidWidget&&\"MOBILE\"==e&&FillrAndroidWidget.injectFillrAndroidWidget(true),\"undefined\"!=typeof FillrAndroidWidgetCS&&\"CART_SCRAPER\"==e&&FillrAndroidWidgetCS.injectFillrAndroidCartScraper(i)}('" + widgetType.toString() + "');");
                return;
            case 24:
                ((FillrWebView) this.f$0).loadJavascript((String) this.f$1);
                return;
            case 25:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f$0;
                JobParameters jobParameters = (JobParameters) this.f$1;
                int i3 = JobInfoSchedulerService.$r8$clinit;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 26:
                MaterialButton materialButton = (MaterialButton) this.f$0;
                Runnable runnable2 = (Runnable) this.f$1;
                int[] iArr = MaterialButton.CHECKABLE_STATE_SET;
                runnable2.run();
                LinearLayout.LayoutParams layoutParams = materialButton.originalLayoutParams;
                if (layoutParams != null) {
                    materialButton.setLayoutParams(layoutParams);
                    materialButton.originalLayoutParams = null;
                    materialButton.originalWidth = -2.1474836E9f;
                }
                materialButton.requestLayout();
                return;
            case 27:
                SingleDateSelector.AnonymousClass1 anonymousClass1 = (SingleDateSelector.AnonymousClass1) this.f$0;
                String str6 = (String) this.f$1;
                TextInputLayout textInputLayout = anonymousClass1.textInputLayout;
                SimpleDateFormat simpleDateFormat = anonymousClass1.dateFormat;
                Context context2 = textInputLayout.getContext();
                textInputLayout.setError(Boxes$$ExternalSyntheticOutline1.m$1(context2.getString(R.string.mtrl_picker_invalid_format), "\n", String.format(context2.getString(R.string.mtrl_picker_invalid_format_use), str6.replace(' ', (char) 160)), "\n", String.format(context2.getString(R.string.mtrl_picker_invalid_format_example), simpleDateFormat.format(new Date(UtcDates.getTodayCalendar().getTimeInMillis())).replace(' ', (char) 160))));
                SingleDateSelector singleDateSelector = SingleDateSelector.this;
                anonymousClass1.val$dateTextInput.getError();
                singleDateSelector.getClass();
                anonymousClass1.val$listener.onIncompleteSelectionChanged();
                return;
            case 28:
                ((CombinedFuture) this.f$0).processAllMustSucceedDoneFuture((ListenableFuture) this.f$1);
                return;
            default:
                ((CombinedFuture) this.f$0).decrementCountAndMaybeComplete((ImmutableCollection) this.f$1);
                return;
        }
    }

    public /* synthetic */ q4$$ExternalSyntheticLambda0(PlayerView playerView, Bitmap bitmap) {
        this.$r8$classId = 7;
        this.f$1 = playerView;
        this.f$0 = bitmap;
    }

    public /* synthetic */ q4$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
