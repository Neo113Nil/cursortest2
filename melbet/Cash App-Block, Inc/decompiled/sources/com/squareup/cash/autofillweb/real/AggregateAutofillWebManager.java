package com.squareup.cash.autofillweb.real;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.zxing.BinaryBitmap;
import com.squareup.cash.autofillweb.api.AutofillWebInfo;
import com.squareup.cash.autofillweb.api.AutofillWebManager;
import com.squareup.cash.autofillweb.api.CashFillConfig;
import com.squareup.cash.fillr.real.RealFillrWebManager;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.scannerview.SizeMap;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes5.dex */
public final class AggregateAutofillWebManager implements AutofillWebManager {
    public final Flow address1FieldDetected;
    public final AutofillWebManager autofillWebManager;
    public final Flow cardFieldDetected;
    public final CashFillConfig cashFillConfig;
    public StandaloneCoroutine cashFillFieldLoggingJob;
    public final ArrayList cashFillFieldsDetectedCalls;
    public final RealCashFillJsStore cashFillJsStore;
    public final CoroutineScope coroutineScope;
    public final Flow currentFocusedField;
    public final SizeMap fieldDetectionLogger;
    public StandaloneCoroutine fillrFieldLoggingJob;
    public final ArrayList fillrFieldsDetectedCalls;
    public final RealFillrWebManager fillrManager;
    public final Flow infoFieldsDetected;
    public final Flow lastCapturedValueInfo;
    public String lastLoadedUrl;
    public final Flow loggingFieldsDetected;

    public AggregateAutofillWebManager(CashFillConfig cashFillConfig, RealCashFillJsStore realCashFillJsStore, RealFillrWebManager realFillrWebManager, AutofillWebManager autofillWebManager, CoroutineScope coroutineScope, SizeMap sizeMap) {
        Flow flow = realFillrWebManager.currentFocusedField;
        Flow flow2 = realFillrWebManager.lastCapturedValueInfo;
        Flow flow3 = realFillrWebManager.address1FieldDetected;
        Flow flow4 = realFillrWebManager.loggingFieldsDetected;
        Flow flow5 = realFillrWebManager.infoFieldsDetected;
        Flow flow6 = realFillrWebManager.cardFieldDetected;
        this.cashFillConfig = cashFillConfig;
        this.cashFillJsStore = realCashFillJsStore;
        this.fillrManager = realFillrWebManager;
        this.autofillWebManager = autofillWebManager;
        this.coroutineScope = coroutineScope;
        this.fieldDetectionLogger = sizeMap;
        this.cashFillFieldsDetectedCalls = new ArrayList();
        this.fillrFieldsDetectedCalls = new ArrayList();
        CashFillConfig.Disabled disabled = CashFillConfig.Disabled.INSTANCE;
        boolean equals = cashFillConfig.equals(disabled);
        CashFillConfig.Spectator spectator = CashFillConfig.Spectator.INSTANCE;
        CashFillConfig.Enabled enabled = CashFillConfig.Enabled.INSTANCE;
        if (!equals) {
            if (cashFillConfig.equals(enabled)) {
                flow6 = autofillWebManager.getCardFieldDetected();
            } else if (!cashFillConfig.equals(spectator)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
        }
        this.cardFieldDetected = flow6;
        if (!cashFillConfig.equals(disabled)) {
            if (cashFillConfig.equals(enabled)) {
                flow5 = autofillWebManager.getInfoFieldsDetected();
            } else if (!cashFillConfig.equals(spectator)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
        }
        this.infoFieldsDetected = flow5;
        if (!cashFillConfig.equals(disabled)) {
            if (cashFillConfig.equals(enabled)) {
                flow4 = autofillWebManager.getLoggingFieldsDetected();
            } else if (!cashFillConfig.equals(spectator)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
        }
        this.loggingFieldsDetected = flow4;
        if (!cashFillConfig.equals(disabled)) {
            if (cashFillConfig.equals(enabled)) {
                flow3 = autofillWebManager.getAddress1FieldDetected();
            } else if (!cashFillConfig.equals(spectator)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
        }
        this.address1FieldDetected = flow3;
        if (!cashFillConfig.equals(disabled)) {
            if (cashFillConfig.equals(enabled)) {
                flow2 = autofillWebManager.getLastCapturedValueInfo();
            } else if (!cashFillConfig.equals(spectator)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
        }
        this.lastCapturedValueInfo = flow2;
        if (!cashFillConfig.equals(disabled)) {
            if (cashFillConfig.equals(enabled)) {
                flow = autofillWebManager.getCurrentFocusedField();
            } else if (!cashFillConfig.equals(spectator)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
        }
        this.currentFocusedField = flow;
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
        CashFillConfig.Disabled disabled = CashFillConfig.Disabled.INSTANCE;
        CashFillConfig cashFillConfig = this.cashFillConfig;
        boolean equals = cashFillConfig.equals(disabled);
        RealFillrWebManager realFillrWebManager = this.fillrManager;
        if (equals) {
            realFillrWebManager.handleOnPageFinished(webView);
            return;
        }
        boolean equals2 = cashFillConfig.equals(CashFillConfig.Enabled.INSTANCE);
        AutofillWebManager autofillWebManager = this.autofillWebManager;
        if (equals2) {
            autofillWebManager.handleOnPageFinished(webView);
            realFillrWebManager.handleOnPageFinished(webView);
        } else if (!cashFillConfig.equals(CashFillConfig.Spectator.INSTANCE)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        } else {
            autofillWebManager.handleOnPageFinished(webView);
            realFillrWebManager.handleOnPageFinished(webView);
        }
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public final void handleOnPageStarted(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        logFieldDetectionComparison();
        this.lastLoadedUrl = str;
        CashFillConfig.Disabled disabled = CashFillConfig.Disabled.INSTANCE;
        CashFillConfig cashFillConfig = this.cashFillConfig;
        boolean equals = cashFillConfig.equals(disabled);
        RealFillrWebManager realFillrWebManager = this.fillrManager;
        if (equals) {
            realFillrWebManager.handleOnPageStarted(webView, str);
            return;
        }
        boolean equals2 = cashFillConfig.equals(CashFillConfig.Enabled.INSTANCE);
        AutofillWebManager autofillWebManager = this.autofillWebManager;
        if (equals2) {
            realFillrWebManager.handleOnPageStarted(webView, str);
            autofillWebManager.handleOnPageStarted(webView, str);
        } else if (!cashFillConfig.equals(CashFillConfig.Spectator.INSTANCE)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        } else {
            autofillWebManager.handleOnPageStarted(webView, str);
            realFillrWebManager.handleOnPageStarted(webView, str);
        }
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public final WebResourceResponse handleShouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        CashFillConfig.Disabled disabled = CashFillConfig.Disabled.INSTANCE;
        CashFillConfig cashFillConfig = this.cashFillConfig;
        boolean equals = cashFillConfig.equals(disabled);
        RealFillrWebManager realFillrWebManager = this.fillrManager;
        if (equals) {
            return realFillrWebManager.handleShouldInterceptRequest(webView, webResourceRequest);
        }
        boolean equals2 = cashFillConfig.equals(CashFillConfig.Enabled.INSTANCE);
        AutofillWebManager autofillWebManager = this.autofillWebManager;
        if (equals2) {
            realFillrWebManager.handleShouldInterceptRequest(webView, webResourceRequest);
            return autofillWebManager.handleShouldInterceptRequest(webView, webResourceRequest);
        }
        if (cashFillConfig.equals(CashFillConfig.Spectator.INSTANCE)) {
            autofillWebManager.handleShouldInterceptRequest(webView, webResourceRequest);
            return realFillrWebManager.handleShouldInterceptRequest(webView, webResourceRequest);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public final void logFieldDetectionComparison() {
        ArrayList arrayList = this.cashFillFieldsDetectedCalls;
        List list = CollectionsKt.toList(arrayList);
        ArrayList arrayList2 = this.fillrFieldsDetectedCalls;
        List list2 = CollectionsKt.toList(arrayList2);
        String str = this.lastLoadedUrl;
        String str2 = this.cashFillJsStore.version;
        RealFillrWebManager realFillrWebManager = this.fillrManager;
        realFillrWebManager.getFillrVersions();
        String str3 = realFillrWebManager.getFillrVersions().widgetVersion;
        list.getClass();
        str2.getClass();
        list2.getClass();
        str3.getClass();
        SizeMap sizeMap = this.fieldDetectionLogger;
        ((RealObservabilityManager) sizeMap.mRatios).addAction(new BinaryBitmap(str, list, str2, list2, str3, sizeMap));
        arrayList.clear();
        arrayList2.clear();
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public final boolean onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        webView.getClass();
        sslErrorHandler.getClass();
        sslError.getClass();
        CashFillConfig.Disabled disabled = CashFillConfig.Disabled.INSTANCE;
        CashFillConfig cashFillConfig = this.cashFillConfig;
        boolean equals = cashFillConfig.equals(disabled);
        RealFillrWebManager realFillrWebManager = this.fillrManager;
        if (equals) {
            return realFillrWebManager.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
        boolean equals2 = cashFillConfig.equals(CashFillConfig.Enabled.INSTANCE);
        AutofillWebManager autofillWebManager = this.autofillWebManager;
        if (equals2) {
            realFillrWebManager.onReceivedSslError(webView, sslErrorHandler, sslError);
            return autofillWebManager.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
        if (cashFillConfig.equals(CashFillConfig.Spectator.INSTANCE)) {
            autofillWebManager.onReceivedSslError(webView, sslErrorHandler, sslError);
            return realFillrWebManager.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return false;
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public final void registerWebView(WebView webView) {
        webView.getClass();
        CashFillConfig.Disabled disabled = CashFillConfig.Disabled.INSTANCE;
        CashFillConfig cashFillConfig = this.cashFillConfig;
        boolean equals = cashFillConfig.equals(disabled);
        RealFillrWebManager realFillrWebManager = this.fillrManager;
        if (equals) {
            realFillrWebManager.registerWebView(webView);
            return;
        }
        boolean equals2 = cashFillConfig.equals(CashFillConfig.Enabled.INSTANCE);
        AutofillWebManager autofillWebManager = this.autofillWebManager;
        if (equals2) {
            startFieldLoggingJob();
            autofillWebManager.registerWebView(webView);
            realFillrWebManager.registerWebView(webView);
        } else {
            if (!cashFillConfig.equals(CashFillConfig.Spectator.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            startFieldLoggingJob();
            autofillWebManager.registerWebView(webView);
            realFillrWebManager.registerWebView(webView);
        }
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public final void setAutofillInfo(AutofillWebInfo autofillWebInfo) {
        CashFillConfig.Disabled disabled = CashFillConfig.Disabled.INSTANCE;
        CashFillConfig cashFillConfig = this.cashFillConfig;
        boolean equals = cashFillConfig.equals(disabled);
        RealFillrWebManager realFillrWebManager = this.fillrManager;
        if (equals) {
            realFillrWebManager.setAutofillInfo(autofillWebInfo);
            return;
        }
        boolean equals2 = cashFillConfig.equals(CashFillConfig.Enabled.INSTANCE);
        AutofillWebManager autofillWebManager = this.autofillWebManager;
        if (equals2) {
            autofillWebManager.setAutofillInfo(autofillWebInfo);
            realFillrWebManager.setAutofillInfo(autofillWebInfo);
        } else if (!cashFillConfig.equals(CashFillConfig.Spectator.INSTANCE)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        } else {
            autofillWebManager.setAutofillInfo(autofillWebInfo);
            realFillrWebManager.setAutofillInfo(autofillWebInfo);
        }
    }

    public final void startFieldLoggingJob() {
        Continuation continuation = null;
        AggregateAutofillWebManager$startFieldLoggingJob$1 aggregateAutofillWebManager$startFieldLoggingJob$1 = new AggregateAutofillWebManager$startFieldLoggingJob$1(this, continuation, 0);
        CoroutineScope coroutineScope = this.coroutineScope;
        this.fillrFieldLoggingJob = JobKt.launch$default(coroutineScope, null, null, aggregateAutofillWebManager$startFieldLoggingJob$1, 3);
        this.cashFillFieldLoggingJob = JobKt.launch$default(coroutineScope, null, null, new AggregateAutofillWebManager$startFieldLoggingJob$1(this, continuation, 1), 3);
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public final void triggerAutofill() {
        CashFillConfig.Disabled disabled = CashFillConfig.Disabled.INSTANCE;
        CashFillConfig cashFillConfig = this.cashFillConfig;
        boolean equals = cashFillConfig.equals(disabled);
        RealFillrWebManager realFillrWebManager = this.fillrManager;
        if (equals) {
            realFillrWebManager.triggerAutofill();
            return;
        }
        if (cashFillConfig.equals(CashFillConfig.Enabled.INSTANCE)) {
            this.autofillWebManager.triggerAutofill();
        } else if (cashFillConfig.equals(CashFillConfig.Spectator.INSTANCE)) {
            realFillrWebManager.triggerAutofill();
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public final void unregisterWebView(WebView webView) {
        webView.getClass();
        logFieldDetectionComparison();
        CashFillConfig.Disabled disabled = CashFillConfig.Disabled.INSTANCE;
        CashFillConfig cashFillConfig = this.cashFillConfig;
        boolean equals = cashFillConfig.equals(disabled);
        RealFillrWebManager realFillrWebManager = this.fillrManager;
        if (equals) {
            realFillrWebManager.unregisterWebView(webView);
        } else {
            boolean equals2 = cashFillConfig.equals(CashFillConfig.Enabled.INSTANCE);
            AutofillWebManager autofillWebManager = this.autofillWebManager;
            if (equals2) {
                autofillWebManager.unregisterWebView(webView);
                realFillrWebManager.unregisterWebView(webView);
            } else if (!cashFillConfig.equals(CashFillConfig.Spectator.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            } else {
                autofillWebManager.unregisterWebView(webView);
                realFillrWebManager.unregisterWebView(webView);
            }
        }
        StandaloneCoroutine standaloneCoroutine = this.fillrFieldLoggingJob;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancel(null);
        }
        this.fillrFieldLoggingJob = null;
        StandaloneCoroutine standaloneCoroutine2 = this.cashFillFieldLoggingJob;
        if (standaloneCoroutine2 != null) {
            standaloneCoroutine2.cancel(null);
        }
        this.cashFillFieldLoggingJob = null;
    }
}
