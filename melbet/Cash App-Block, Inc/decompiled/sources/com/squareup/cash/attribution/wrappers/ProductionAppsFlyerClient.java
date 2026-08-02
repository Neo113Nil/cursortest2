package com.squareup.cash.attribution.wrappers;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.deeplink.DeepLinkResult;
import com.squareup.cash.attribution.ConversionListener;
import com.squareup.cash.attribution.DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0;
import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.util.network.impl.AndroidConnectivityManager;
import java.lang.ref.WeakReference;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import okhttp3.ConnectionPool;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class ProductionAppsFlyerClient implements AppsFlyerClient {
    public static final Set EXPECTED_START_ERROR_CODES = ArraysKt___ArraysKt.toSet(new Integer[]{10, 11, 40});
    public WeakReference activity;
    public final Analytics analytics;

    /* renamed from: app, reason: collision with root package name */
    public final Application f1049app;
    public final ConnectionPool appsFlyerDeepLinkValidator;
    public String appsFlyerId;
    public final Lazy appsFlyerLib$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new RealBrazeManager$$ExternalSyntheticLambda0(this, 6));
    public final AndroidConnectivityManager connectivityManager;
    public final DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0 deferredDeepLinkEmitter;
    public final ErrorReporter errorReporter;
    public boolean hasStarted;
    public final boolean isDebug;
    public final ConversionListener listener;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public Long timestampOnInitialization;

    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DeepLinkResult.Error.values().length];
            try {
                iArr[DeepLinkResult.Error.TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeepLinkResult.Error.NETWORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeepLinkResult.Error.HTTP_STATUS_CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DeepLinkResult.Error.DEVELOPER_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DeepLinkResult.Error.UNEXPECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DeepLinkResult.Status.values().length];
            try {
                iArr2[DeepLinkResult.Status.FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DeepLinkResult.Status.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[DeepLinkResult.Status.NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public ProductionAppsFlyerClient(Application application, boolean z, DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0 deferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0, Analytics analytics, AndroidConnectivityManager androidConnectivityManager, ConnectionPool connectionPool, ErrorReporter errorReporter, SampleStrategy sampleStrategy) {
        this.f1049app = application;
        this.isDebug = z;
        this.deferredDeepLinkEmitter = deferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0;
        this.analytics = analytics;
        this.connectivityManager = androidConnectivityManager;
        this.appsFlyerDeepLinkValidator = connectionPool;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
        this.listener = new ConversionListener(analytics);
    }

    public final Context getActiveContext() {
        Activity activity;
        WeakReference weakReference = this.activity;
        if (weakReference != null && (activity = (Activity) weakReference.get()) != null) {
            return activity;
        }
        Context applicationContext = this.f1049app.getApplicationContext();
        applicationContext.getClass();
        return applicationContext;
    }

    public final AppsFlyerLib getAppsFlyerLib() {
        Object value = this.appsFlyerLib$delegate.getValue();
        value.getClass();
        return (AppsFlyerLib) value;
    }

    public final void onIncomingIntentForDeepLink(Intent intent) {
        if (intent != null) {
            Timber.Forest.i(Recorder$$ExternalSyntheticOutline2.m("Perform AppsFlyer deep link ", TransactorKt.redactUrl(String.valueOf(intent.getData()))), new Object[0]);
            getAppsFlyerLib().performOnDeepLinking(intent, getActiveContext());
        }
    }
}
