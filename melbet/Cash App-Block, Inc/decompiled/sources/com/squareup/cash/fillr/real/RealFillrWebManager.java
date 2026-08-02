package com.squareup.cash.fillr.real;

import android.app.Activity;
import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.tracing.Trace;
import com.caverock.androidsvg.SVG;
import com.fillr.browsersdk.Fillr;
import com.fillr.browsersdk.model.FillrMapping;
import com.fillr.browsersdk.model.FillrWebView;
import com.fillr.m1;
import com.google.common.base.Joiner;
import com.google.mlkit.vision.text.internal.zzr;
import com.squareup.cash.autofillweb.api.AutofillWebInfo;
import com.squareup.cash.autofillweb.api.AutofillWebManager;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$FillrFieldFocusedV2;
import com.squareup.cash.fillr.api.FillrWebManager$FillrVersions;
import com.squareup.cash.util.money.Moneys$$ExternalSyntheticLambda0;
import com.squareup.cash.webview.android.WebViewProvider;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.sync.Mutex;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealFillrWebManager implements AutofillWebManager {
    public final Activity activity;
    public final SharedFlowImpl address1FieldDetected;
    public final SharedFlowImpl cardFieldDetected;
    public final Application context;
    public final SharedFlowImpl currentFocusedField;
    public boolean enabled;
    public final Lazy fillr$delegate = LazyKt.lazy(new Moneys$$ExternalSyntheticLambda0(8));
    public final DerivedStateFlow fillrFieldFocusedFeature;
    public final Mutex fillrSingletonLock;
    public final SharedFlowImpl infoFieldsDetected;
    public volatile boolean initialized;
    public final SharedFlowImpl lastCapturedValueInfo;
    public final SharedFlowImpl lastDetectCartInfoFlow;
    public Object lockOwner;
    public final SharedFlowImpl loggingFieldsDetected;
    public FillrMapping mapping;
    public final WebViewProvider webViewProvider;

    public RealFillrWebManager(Application application, Activity activity, WebViewProvider webViewProvider, FeatureFlagManager featureFlagManager, Mutex mutex) {
        this.context = application;
        this.activity = activity;
        this.webViewProvider = webViewProvider;
        this.fillrSingletonLock = mutex;
        this.fillrFieldFocusedFeature = Trace.valuesState(featureFlagManager, LaunchDarklyFeatureFlags$FillrFieldFocusedV2.INSTANCE);
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.cardFieldDetected = FlowKt.MutableSharedFlow$default(1, 0, bufferOverflow, 2);
        this.infoFieldsDetected = FlowKt.MutableSharedFlow$default(1, 0, bufferOverflow, 2);
        this.loggingFieldsDetected = FlowKt.MutableSharedFlow$default(1, 0, bufferOverflow, 2);
        this.address1FieldDetected = FlowKt.MutableSharedFlow$default(1, 0, bufferOverflow, 2);
        this.lastCapturedValueInfo = FlowKt.MutableSharedFlow$default(1, 0, bufferOverflow, 2);
        this.lastDetectCartInfoFlow = FlowKt.MutableSharedFlow$default(1, 0, bufferOverflow, 2);
        this.currentFocusedField = FlowKt.MutableSharedFlow$default(1, 0, bufferOverflow, 2);
        this.enabled = true;
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public final Flow getAddress1FieldDetected() {
        return this.address1FieldDetected;
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public final Flow getCardFieldDetected() {
        return this.cardFieldDetected;
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public final Flow getCurrentFocusedField() {
        return this.currentFocusedField;
    }

    public final Fillr getFillr() {
        return (Fillr) this.fillr$delegate.getValue();
    }

    public final FillrWebManager$FillrVersions getFillrVersions() {
        getFillr().getClass();
        String autofillWidgetVersion = Fillr.getAutofillWidgetVersion();
        autofillWidgetVersion.getClass();
        return new FillrWebManager$FillrVersions(autofillWidgetVersion);
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public final Flow getInfoFieldsDetected() {
        return this.infoFieldsDetected;
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public final Flow getLastCapturedValueInfo() {
        return this.lastCapturedValueInfo;
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public final Flow getLoggingFieldsDetected() {
        return this.loggingFieldsDetected;
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public final void handleOnPageFinished(WebView webView) {
        webView.getClass();
        if (this.enabled) {
            try {
                getFillr().onPageFinished(webView);
            } catch (IllegalArgumentException e) {
                Timber.Forest.e(e);
            }
        }
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public final void handleOnPageStarted(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        if (this.enabled) {
            try {
                getFillr().triggerFill(getFillr().getFillrWebView());
            } catch (Exception e) {
                Timber.Forest.e(e);
            }
        }
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public final WebResourceResponse handleShouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (this.enabled) {
            return getFillr().shouldInterceptRequest(webView, webResourceRequest);
        }
        return null;
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public final boolean onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        webView.getClass();
        sslErrorHandler.getClass();
        sslError.getClass();
        if (this.enabled) {
            return getFillr().onReceivedSslError(sslErrorHandler, sslError);
        }
        return false;
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public final void registerWebView(WebView webView) {
        webView.getClass();
        if (this.enabled) {
            if (!this.initialized) {
                synchronized (this) {
                    try {
                        if (!this.initialized) {
                            Object obj = new Object();
                            if (this.fillrSingletonLock.tryLock(obj)) {
                                this.lockOwner = obj;
                            }
                            ApplicationInfo applicationInfo = this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128);
                            applicationInfo.getClass();
                            Bundle bundle = applicationInfo.metaData;
                            if (bundle == null) {
                                Timber.Forest.w("Fillr metadata not found, skipping initialization", new Object[0]);
                            } else {
                                String string2 = bundle.getString("com.squareup.fillr.API_KEY");
                                if (string2 == null) {
                                    Timber.Forest.w("Fillr API key not found, skipping initialization", new Object[0]);
                                } else {
                                    String string3 = bundle.getString("com.squareup.fillr.SECRET_KEY");
                                    if (string3 == null) {
                                        Timber.Forest.w("Fillr secret key not found, skipping initialization", new Object[0]);
                                    } else {
                                        String string4 = bundle.getString("com.squareup.fillr.WIDGET_PASSWORD");
                                        if (string4 == null) {
                                            Timber.Forest.w("Fillr widget password not found, skipping initialization", new Object[0]);
                                        } else {
                                            SVG svg = new SVG(string2, string3, new Joiner(string4, false), false, 20);
                                            m1.getInstance().init(this.context);
                                            Fillr fillr = getFillr();
                                            fillr.initialise(svg, this.activity);
                                            fillr.setFillMode();
                                            fillr.profileDataListener(new RealFillrWebManager$$ExternalSyntheticLambda0(this));
                                            fillr.setCartInformationExtractionListener(new RealFillrWebManager$$ExternalSyntheticLambda0(this));
                                            fillr.captureValueListener(new RealFillrWebManager$$ExternalSyntheticLambda0(this));
                                            if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((Function0) this.fillrFieldFocusedFeature.getValue).invoke()).enabled()) {
                                                fillr.setFormEventListener(new zzr(this, 23));
                                            }
                                            this.initialized = true;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (this.webViewProvider.getShouldSaveWebInstance()) {
                return;
            }
            try {
                getFillr().trackWebView(webView);
            } catch (IllegalArgumentException e) {
                Timber.Forest.e(e);
            }
        }
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public final void setAutofillInfo(AutofillWebInfo autofillWebInfo) {
        if (this.enabled) {
            FillrMapping fillrMapping = this.mapping;
            if (fillrMapping != null) {
                fillrMapping.setProfileData(autofillWebInfo.toDataMap());
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("mapping");
                throw null;
            }
        }
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public final void triggerAutofill() {
        if (this.enabled) {
            try {
                Fillr fillr = getFillr();
                FillrWebView fillrWebView = getFillr().getFillrWebView();
                FillrMapping fillrMapping = this.mapping;
                if (fillrMapping != null) {
                    fillr.performAutofillOnWebView(fillrWebView, fillrMapping);
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("mapping");
                    throw null;
                }
            } catch (Exception e) {
                Timber.Forest.e(e);
            }
        }
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public final void unregisterWebView(WebView webView) {
        webView.getClass();
        if (this.enabled && !this.webViewProvider.getShouldSaveWebInstance()) {
            StateFlowKt.emitOrThrow(this.cardFieldDetected, Boolean.FALSE);
            StateFlowKt.emitOrThrow(this.lastDetectCartInfoFlow, null);
            try {
                getFillr().untrackWebView(webView);
            } catch (IllegalArgumentException e) {
                Timber.Forest.e(e);
            }
        }
    }
}
