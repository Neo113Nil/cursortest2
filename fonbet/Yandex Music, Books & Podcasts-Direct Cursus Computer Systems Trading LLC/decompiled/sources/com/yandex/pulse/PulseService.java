package com.yandex.pulse;

import android.content.Context;
import android.net.TrafficStats;
import android.os.AsyncTask;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.pulse.ApplicationStatusMonitor;
import com.yandex.pulse.PulseService;
import com.yandex.pulse.histogram.ComponentHistograms;
import com.yandex.pulse.metrics.MetricsService;
import defpackage.ezf;
import defpackage.i1n;
import defpackage.j1n;
import defpackage.jj4;
import defpackage.k1n;
import defpackage.kw0;
import defpackage.lh;
import defpackage.lum;
import defpackage.o4t;
import defpackage.o8g;
import defpackage.rfh;
import defpackage.sfh;
import defpackage.suh;
import defpackage.u13;
import defpackage.uo7;
import defpackage.xav;
import defpackage.xq0;
import defpackage.xsm;
import defpackage.ysm;
import defpackage.zav;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\u0018\u0000 \\2\u00020\u0001:\u0003]\\^B\u0019\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BI\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001d¢\u0006\u0004\b \u0010\u001fJ\u001d\u0010$\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u001dH\u0002¢\u0006\u0004\b*\u0010\u001fJ\u000f\u0010+\u001a\u00020\u001dH\u0002¢\u0006\u0004\b+\u0010\u001fJ\u0017\u0010.\u001a\u00020-2\u0006\u0010\u0014\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001dH\u0002¢\u0006\u0004\b0\u0010\u001fJ\u000f\u00101\u001a\u00020\u001dH\u0002¢\u0006\u0004\b1\u0010\u001fJ\u0017\u00103\u001a\u0002022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b5\u00106R\u0016\u00108\u001a\u0004\u0018\u0001078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010:R\u0016\u0010<\u001a\u0004\u0018\u00010;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010DR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010HR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0003\u0010IR\u0016\u0010J\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010P\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010QR\u0014\u0010U\u001a\u00020O8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR$\u0010W\u001a\u00020-2\u0006\u0010V\u001a\u00020-8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0014\u0010[\u001a\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010X¨\u0006_"}, d2 = {"Lcom/yandex/pulse/PulseService;", "", "Landroid/content/Context;", "context", "Lcom/yandex/pulse/ServiceParams;", "serviceParams", "<init>", "(Landroid/content/Context;Lcom/yandex/pulse/ServiceParams;)V", "Lcom/yandex/pulse/metrics/MetricsService;", "metricsService", "Lcom/yandex/pulse/PowerStateChangeDetector;", "powerStateChangeDetector", "Lsfh;", "measurementScheduler", "Lkw0;", "applicationMonitor", "Lysm;", "processMonitor", "(Landroid/content/Context;Lcom/yandex/pulse/ServiceParams;Lcom/yandex/pulse/metrics/MetricsService;Lcom/yandex/pulse/PowerStateChangeDetector;Lsfh;Lkw0;Lysm;)V", "Lcom/yandex/pulse/ApplicationParams;", "params", "Lcom/yandex/pulse/histogram/ComponentHistograms;", "registerApp", "(Lcom/yandex/pulse/ApplicationParams;)Lcom/yandex/pulse/histogram/ComponentHistograms;", "", "libraryName", "Lcom/yandex/pulse/LibraryParams;", "registerLib", "(Ljava/lang/String;Lcom/yandex/pulse/LibraryParams;)Lcom/yandex/pulse/histogram/ComponentHistograms;", "", "onSuspend", "()V", "onResume", "", "powerState", "chargingSource", "onPowerStateChanged", "(II)V", "Landroid/os/Message;", "msg", "handleMessage", "(Landroid/os/Message;)V", "onAppNotIdleImpl", "resetMeasurement", "Lcom/yandex/pulse/ProcessCpuMonitoringParams;", "", "changeMeasurementIntervals", "(Lcom/yandex/pulse/ProcessCpuMonitoringParams;)Z", "scheduleMeasurement", "restartMeasurement", "Ljava/util/concurrent/Executor;", "getBackgroundExecutor", "(Lcom/yandex/pulse/ServiceParams;)Ljava/util/concurrent/Executor;", "setPowerState", "(I)V", "Lcom/yandex/pulse/ApplicationStatusMonitor;", "applicationStatusMonitor", "Lcom/yandex/pulse/ApplicationStatusMonitor;", "Lcom/yandex/pulse/metrics/MetricsService;", "Landroid/os/HandlerThread;", "handlerThread", "Landroid/os/HandlerThread;", "Lzav;", "handler", "Lzav;", "Lxav;", "handlerCallback", "Lxav;", "Lsfh;", "Lkw0;", "processCpuMonitor", "Lysm;", "Lcom/yandex/pulse/PowerStateChangeDetector;", "Landroid/content/Context;", "backgroundExecutor", "Ljava/util/concurrent/Executor;", "Lcom/yandex/pulse/MeasurementBroadcasterImpl;", "measurementBroadcaster", "Lcom/yandex/pulse/MeasurementBroadcasterImpl;", "", "foregroundMeasurementInterval", "J", "backgroundMeasurementInterval", "getMeasurementInterval", "()J", "measurementInterval", Constants.KEY_VALUE, "isForeground", "()Z", "setForeground", "(Z)V", "isCharging", "Companion", "i1n", "j1n", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class PulseService {
    private static final int MSG_INIT = 0;
    private static final int MSG_INIT_APP = 5;
    private static final int MSG_ON_APP_NO_IDLE = 1;
    private static final int MSG_ON_CHANGE_POWER_STATE = 4;
    private static final int MSG_ON_RESUME = 3;
    private static final int MSG_ON_SUSPEND = 2;
    private static PulseService pulseService;
    private kw0 applicationMonitor;
    private final ApplicationStatusMonitor applicationStatusMonitor;
    private Executor backgroundExecutor;
    private long backgroundMeasurementInterval;
    private Context context;
    private long foregroundMeasurementInterval;

    @NotNull
    private final zav handler;

    @Keep
    @NotNull
    private final xav handlerCallback;
    private final HandlerThread handlerThread;

    @NotNull
    private final MeasurementBroadcasterImpl measurementBroadcaster;
    private sfh measurementScheduler;

    @NotNull
    private final MetricsService metricsService;
    private PowerStateChangeDetector powerStateChangeDetector;
    private ysm processCpuMonitor;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long INITIAL_DELAY_MS = 2000;
    private static final long FOREGROUND_MEASUREMENT_INTERVAL = 60000;
    private static final long BACKGROUND_MEASUREMENT_INTERVAL = 3600000;
    private static final long CHANGE_POWER_STATE_DELAY = 60000;

    @NotNull
    private static final MeasurementListenersHolder measurementListenersHolder = new MeasurementListenersHolder();

    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0003R\u001a\u0010\u001b\u001a\u00020\u00178FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0014\u0010#\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001eR\u0014\u0010%\u001a\u00020$8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020$8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010)\u001a\u00020$8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010&R\u0014\u0010*\u001a\u00020$8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010&R\u0014\u0010+\u001a\u00020$8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010&R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/yandex/pulse/PulseService$Companion;", "", "<init>", "()V", "Lcom/yandex/pulse/ApplicationParams;", "params", "Lcom/yandex/pulse/histogram/ComponentHistograms;", "registerApplication", "(Lcom/yandex/pulse/ApplicationParams;)Lcom/yandex/pulse/histogram/ComponentHistograms;", "", "libraryName", "Lcom/yandex/pulse/LibraryParams;", "registerLibrary", "(Ljava/lang/String;Lcom/yandex/pulse/LibraryParams;)Lcom/yandex/pulse/histogram/ComponentHistograms;", "Landroid/content/Context;", "context", "Lcom/yandex/pulse/ServiceParams;", "serviceParams", "", "startService", "(Landroid/content/Context;Lcom/yandex/pulse/ServiceParams;)Z", "", "onAppNotIdle", "Lrfh;", "getMeasurementRegistrant", "()Lrfh;", "getMeasurementRegistrant$annotations", "measurementRegistrant", "", "CHANGE_POWER_STATE_DELAY", "J", "getCHANGE_POWER_STATE_DELAY", "()J", "BACKGROUND_MEASUREMENT_INTERVAL", "FOREGROUND_MEASUREMENT_INTERVAL", "INITIAL_DELAY_MS", "", "MSG_INIT", "I", "MSG_INIT_APP", "MSG_ON_APP_NO_IDLE", "MSG_ON_CHANGE_POWER_STATE", "MSG_ON_RESUME", "MSG_ON_SUSPEND", "Lcom/yandex/pulse/MeasurementListenersHolder;", "measurementListenersHolder", "Lcom/yandex/pulse/MeasurementListenersHolder;", "Lcom/yandex/pulse/PulseService;", "pulseService", "Lcom/yandex/pulse/PulseService;", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getMeasurementRegistrant$annotations() {
        }

        public final long getCHANGE_POWER_STATE_DELAY() {
            return PulseService.CHANGE_POWER_STATE_DELAY;
        }

        @NotNull
        public final rfh getMeasurementRegistrant() {
            return PulseService.measurementListenersHolder;
        }

        public final void onAppNotIdle() {
            PulseService pulseService = PulseService.pulseService;
            if (pulseService != null) {
                pulseService.onAppNotIdleImpl();
            }
        }

        @NotNull
        public final ComponentHistograms registerApplication(@NotNull ApplicationParams params) {
            params.getClass();
            if (PulseService.pulseService == null) {
                xq0.q("PulseService is not started");
                return null;
            }
            PulseService pulseService = PulseService.pulseService;
            pulseService.getClass();
            return pulseService.registerApp(params);
        }

        @NotNull
        public final ComponentHistograms registerLibrary(@NotNull String libraryName, @NotNull LibraryParams params) {
            libraryName.getClass();
            params.getClass();
            if (PulseService.pulseService == null) {
                xq0.q("PulseService is not started");
                return null;
            }
            PulseService pulseService = PulseService.pulseService;
            pulseService.getClass();
            return pulseService.registerLib(libraryName, params);
        }

        public final boolean startService(@NotNull Context context, @NotNull ServiceParams serviceParams) {
            context.getClass();
            serviceParams.getClass();
            if (PulseService.pulseService != null) {
                return false;
            }
            PulseService.pulseService = new PulseService(context, serviceParams, null);
            return true;
        }

        private Companion() {
        }
    }

    private PulseService(Context context, ServiceParams serviceParams) {
        uo7 uo7Var = new uo7(5, this);
        this.handlerCallback = uo7Var;
        this.foregroundMeasurementInterval = FOREGROUND_MEASUREMENT_INTERVAL;
        this.backgroundMeasurementInterval = BACKGROUND_MEASUREMENT_INTERVAL;
        setForeground(!serviceParams.applicationStatusMonitor.isSuspended());
        ApplicationStatusMonitor applicationStatusMonitor = serviceParams.applicationStatusMonitor;
        this.applicationStatusMonitor = applicationStatusMonitor;
        applicationStatusMonitor.setCallback(new ApplicationStatusMonitor.ApplicationStatusCallback() { // from class: com.yandex.pulse.PulseService.1
            @Override // com.yandex.pulse.ApplicationStatusMonitor.ApplicationStatusCallback
            public void onResume() {
                PulseService.this.onResume();
            }

            @Override // com.yandex.pulse.ApplicationStatusMonitor.ApplicationStatusCallback
            public void onSuspend() {
                PulseService.this.onSuspend();
            }
        });
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.context = applicationContext;
        Executor backgroundExecutor = getBackgroundExecutor(serviceParams);
        this.backgroundExecutor = backgroundExecutor;
        Context context2 = this.context;
        if (context2 == null) {
            Intrinsics.j("context");
            throw null;
        }
        if (backgroundExecutor == null) {
            Intrinsics.j("backgroundExecutor");
            throw null;
        }
        this.metricsService = new MetricsService(context2, backgroundExecutor, new DefaultMetricsLogUploaderClient(backgroundExecutor, serviceParams.uploadURL, serviceParams.enableLogging), serviceParams.enableLogging);
        this.measurementBroadcaster = new MeasurementBroadcasterImpl(measurementListenersHolder);
        HandlerThread handlerThread = new HandlerThread("PulseService", 10);
        handlerThread.start();
        this.handlerThread = handlerThread;
        Looper looper = handlerThread.getLooper();
        looper.getClass();
        zav zavVar = new zav(looper, uo7Var);
        this.handler = zavVar;
        Context context3 = this.context;
        if (context3 == null) {
            Intrinsics.j("context");
            throw null;
        }
        Executor executor = this.backgroundExecutor;
        if (executor == null) {
            Intrinsics.j("backgroundExecutor");
            throw null;
        }
        applicationStatusMonitor.isSuspended();
        zavVar.obtainMessage(0, new j1n(context3, executor)).sendToTarget();
    }

    private final boolean changeMeasurementIntervals(ProcessCpuMonitoringParams params) {
        long j = this.foregroundMeasurementInterval;
        long j2 = params.foregroundIntervalMilliseconds;
        boolean z = (j == j2 && this.backgroundMeasurementInterval == params.backgroundIntervalMilliseconds) ? false : true;
        this.foregroundMeasurementInterval = j2;
        this.backgroundMeasurementInterval = params.backgroundIntervalMilliseconds;
        return z;
    }

    private final Executor getBackgroundExecutor(ServiceParams serviceParams) {
        final Executor executor = serviceParams.backgroundExecutor;
        if (executor == null) {
            executor = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        return new Executor() { // from class: h1n
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                PulseService.m17getBackgroundExecutor$lambda4$lambda3(executor, this, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getBackgroundExecutor$lambda-4$lambda-3, reason: not valid java name */
    public static final void m17getBackgroundExecutor$lambda4$lambda3(Executor executor, PulseService pulseService2, Runnable runnable) {
        pulseService2.getClass();
        try {
            executor.execute(runnable);
        } catch (Throwable unused) {
            pulseService2.handler.post(runnable);
        }
    }

    private final long getMeasurementInterval() {
        return isForeground() ? this.foregroundMeasurementInterval : this.backgroundMeasurementInterval;
    }

    @NotNull
    public static final rfh getMeasurementRegistrant() {
        return INSTANCE.getMeasurementRegistrant();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleMessage(Message msg) {
        int i = msg.what;
        if (i == 0) {
            Object obj = msg.obj;
            if (obj == null) {
                jj4.j("null cannot be cast to non-null type com.yandex.pulse.PulseService.ServiceInitParams");
                return;
            }
            j1n j1nVar = (j1n) obj;
            this.metricsService.initializeAndStartService(isForeground());
            if (this.powerStateChangeDetector == null) {
                this.powerStateChangeDetector = new PowerStateChangeDetector(j1nVar.a, new k1n(this), true);
            }
            PowerStateChangeDetector powerStateChangeDetector = this.powerStateChangeDetector;
            powerStateChangeDetector.getClass();
            powerStateChangeDetector.register();
            PowerStateChangeDetector powerStateChangeDetector2 = this.powerStateChangeDetector;
            powerStateChangeDetector2.getClass();
            setPowerState(powerStateChangeDetector2.getLastKnownPowerState());
            if (this.measurementScheduler == null) {
                this.measurementScheduler = new sfh();
            }
            if (this.applicationMonitor == null) {
                sfh sfhVar = this.measurementScheduler;
                sfhVar.getClass();
                this.applicationMonitor = new kw0(sfhVar);
            }
            kw0 kw0Var = this.applicationMonitor;
            kw0Var.getClass();
            boolean isForeground = isForeground();
            lh lhVar = kw0Var.a;
            lhVar.b = isForeground;
            lhVar.c = 0;
            long uptimeMillis = SystemClock.uptimeMillis();
            lhVar.d = uptimeMillis;
            lhVar.e = uptimeMillis;
            lum lumVar = kw0Var.b;
            o4t o4tVar = (o4t) lumVar.a;
            int i2 = o4tVar.c;
            o4tVar.e = TrafficStats.getUidRxBytes(i2);
            o4tVar.f = TrafficStats.getUidTxBytes(i2);
            o4tVar.d = SystemClock.uptimeMillis();
            sfh sfhVar2 = (sfh) lumVar.b;
            xsm xsmVar = (xsm) lumVar.c;
            ArrayList arrayList = sfhVar2.a;
            if (!arrayList.contains(xsmVar)) {
                arrayList.add(xsmVar);
            }
            scheduleMeasurement();
            return;
        }
        if (i == 1) {
            this.metricsService.onApplicationNotIdle();
            return;
        }
        if (i == 2) {
            if (isForeground()) {
                setForeground(false);
                kw0 kw0Var2 = this.applicationMonitor;
                if (kw0Var2 != null) {
                    lh lhVar2 = kw0Var2.a;
                    if (lhVar2.b) {
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        lhVar2.b(uptimeMillis2);
                        lhVar2.a(uptimeMillis2);
                        lhVar2.b = false;
                    }
                }
                this.metricsService.onAppEnterBackground();
                restartMeasurement();
                return;
            }
            return;
        }
        if (i == 3) {
            if (isForeground()) {
                return;
            }
            setForeground(true);
            kw0 kw0Var3 = this.applicationMonitor;
            if (kw0Var3 != null) {
                lh lhVar3 = kw0Var3.a;
                if (!lhVar3.b) {
                    long uptimeMillis3 = SystemClock.uptimeMillis();
                    lhVar3.b(uptimeMillis3);
                    lhVar3.a(uptimeMillis3);
                    lhVar3.b = true;
                }
            }
            this.metricsService.onAppEnterForeground();
            restartMeasurement();
            return;
        }
        if (i == 4) {
            boolean isCharging = isCharging();
            setPowerState(msg.arg1);
            if (isCharging != isCharging()) {
                restartMeasurement();
                return;
            }
            return;
        }
        if (i != 5) {
            return;
        }
        Object obj2 = msg.obj;
        if (obj2 == null) {
            jj4.j("null cannot be cast to non-null type com.yandex.pulse.PulseService.ApplicationInitParams");
            return;
        }
        i1n i1nVar = (i1n) obj2;
        if (this.processCpuMonitor == null) {
            Context context = i1nVar.a;
            sfh sfhVar3 = this.measurementScheduler;
            sfhVar3.getClass();
            this.processCpuMonitor = new ysm(context, sfhVar3, i1nVar.b, i1nVar.c, this.measurementBroadcaster);
        }
        ysm ysmVar = this.processCpuMonitor;
        ysmVar.getClass();
        sfh sfhVar4 = ysmVar.d;
        xsm xsmVar2 = ysmVar.j;
        ArrayList arrayList2 = sfhVar4.a;
        if (!arrayList2.contains(xsmVar2)) {
            arrayList2.add(xsmVar2);
        }
        if (i1nVar.d) {
            restartMeasurement();
        }
    }

    private final boolean isCharging() {
        return ezf.b;
    }

    private final boolean isForeground() {
        return ezf.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAppNotIdleImpl() {
        this.handler.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: registerApp$lambda-0, reason: not valid java name */
    public static final ComponentHistograms m18registerApp$lambda0(PulseService pulseService2, ApplicationParams applicationParams) {
        pulseService2.getClass();
        applicationParams.getClass();
        return pulseService2.metricsService.registerApplication(applicationParams);
    }

    @NotNull
    public static final ComponentHistograms registerApplication(@NotNull ApplicationParams applicationParams) {
        return INSTANCE.registerApplication(applicationParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: registerLib$lambda-1, reason: not valid java name */
    public static final ComponentHistograms m19registerLib$lambda1(PulseService pulseService2, String str, LibraryParams libraryParams) {
        pulseService2.getClass();
        str.getClass();
        libraryParams.getClass();
        return pulseService2.metricsService.registerLibrary(str, libraryParams);
    }

    @NotNull
    public static final ComponentHistograms registerLibrary(@NotNull String str, @NotNull LibraryParams libraryParams) {
        return INSTANCE.registerLibrary(str, libraryParams);
    }

    private final void resetMeasurement() {
        sfh sfhVar = this.measurementScheduler;
        sfhVar.getClass();
        sfhVar.a();
    }

    private final void restartMeasurement() {
        resetMeasurement();
        scheduleMeasurement();
    }

    private final void scheduleMeasurement() {
        sfh sfhVar = this.measurementScheduler;
        sfhVar.getClass();
        long j = INITIAL_DELAY_MS;
        long measurementInterval = getMeasurementInterval();
        sfhVar.a();
        sfhVar.c = measurementInterval;
        sfhVar.b.start(j);
    }

    private final void setForeground(boolean z) {
        ezf.a = z;
    }

    private final void setPowerState(int powerState) {
        ezf.b = powerState == 2 || powerState == 3;
    }

    public static final boolean startService(@NotNull Context context, @NotNull ServiceParams serviceParams) {
        return INSTANCE.startService(context, serviceParams);
    }

    public final void onPowerStateChanged(int powerState, int chargingSource) {
        this.handler.removeMessages(4);
        Message obtainMessage = this.handler.obtainMessage(4, powerState, chargingSource);
        obtainMessage.getClass();
        this.handler.sendMessageDelayed(obtainMessage, CHANGE_POWER_STATE_DELAY);
    }

    public final void onResume() {
        this.handler.sendEmptyMessage(3);
    }

    public final void onSuspend() {
        this.handler.sendEmptyMessage(2);
    }

    @NotNull
    public final ComponentHistograms registerApp(@NotNull ApplicationParams params) {
        params.getClass();
        ComponentHistograms componentHistograms = (ComponentHistograms) o8g.F(this.handler, new suh(11, this, params));
        ProcessCpuMonitoringParams processCpuMonitoringParams = params.processCpuMonitoringParams;
        if (processCpuMonitoringParams == null) {
            return componentHistograms;
        }
        boolean changeMeasurementIntervals = changeMeasurementIntervals(processCpuMonitoringParams);
        zav zavVar = this.handler;
        Context context = this.context;
        if (context == null) {
            Intrinsics.j("context");
            throw null;
        }
        Executor executor = this.backgroundExecutor;
        if (executor != null) {
            zavVar.obtainMessage(5, new i1n(context, executor, params.processCpuMonitoringParams, changeMeasurementIntervals)).sendToTarget();
            return componentHistograms;
        }
        Intrinsics.j("backgroundExecutor");
        throw null;
    }

    @NotNull
    public final ComponentHistograms registerLib(@NotNull String libraryName, @NotNull LibraryParams params) {
        libraryName.getClass();
        params.getClass();
        return (ComponentHistograms) o8g.F(this.handler, new u13(14, this, libraryName, params));
    }

    public /* synthetic */ PulseService(Context context, ServiceParams serviceParams, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, serviceParams);
    }

    public PulseService(@NotNull Context context, @NotNull ServiceParams serviceParams, @NotNull MetricsService metricsService, PowerStateChangeDetector powerStateChangeDetector, sfh sfhVar, kw0 kw0Var, ysm ysmVar) {
        context.getClass();
        serviceParams.getClass();
        metricsService.getClass();
        uo7 uo7Var = new uo7(5, this);
        this.handlerCallback = uo7Var;
        this.foregroundMeasurementInterval = FOREGROUND_MEASUREMENT_INTERVAL;
        this.backgroundMeasurementInterval = BACKGROUND_MEASUREMENT_INTERVAL;
        setForeground(true);
        Executor backgroundExecutor = getBackgroundExecutor(serviceParams);
        this.metricsService = metricsService;
        this.powerStateChangeDetector = powerStateChangeDetector;
        this.measurementScheduler = sfhVar;
        this.applicationMonitor = kw0Var;
        this.processCpuMonitor = ysmVar;
        this.measurementBroadcaster = new MeasurementBroadcasterImpl(measurementListenersHolder);
        this.applicationStatusMonitor = null;
        this.handlerThread = null;
        zav zavVar = new zav(uo7Var);
        this.handler = zavVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        zavVar.obtainMessage(0, new j1n(applicationContext, backgroundExecutor)).sendToTarget();
    }
}
