package com.squareup.cash.observability.backend.internal.network;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.JsonFeatureFlags$MobileObservabilityConfig;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$EnableMobileObservabilityAndroid;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* loaded from: classes.dex */
public abstract class ObservabilityInterceptor implements Interceptor {
    public static final Regex IP_REGEX = new Regex("\\d+\\.\\d+\\.\\d+\\.\\d+");
    public CachedInterceptor cachedInterceptor;
    public final FeatureFlagManager featureFlagManager;
    public final List firstPartyHosts;

    public final class CachedInterceptor {
        public final Interceptor interceptor;
        public final int tracerSampleRate;

        public CachedInterceptor(int i, Interceptor interceptor) {
            interceptor.getClass();
            this.tracerSampleRate = i;
            this.interceptor = interceptor;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CachedInterceptor)) {
                return false;
            }
            CachedInterceptor cachedInterceptor = (CachedInterceptor) obj;
            return this.tracerSampleRate == cachedInterceptor.tracerSampleRate && Intrinsics.areEqual(this.interceptor, cachedInterceptor.interceptor);
        }

        public final int hashCode() {
            return this.interceptor.hashCode() + (Integer.hashCode(this.tracerSampleRate) * 31);
        }

        public final String toString() {
            return "CachedInterceptor(tracerSampleRate=" + this.tracerSampleRate + ", interceptor=" + this.interceptor + ")";
        }
    }

    public ObservabilityInterceptor(FeatureFlagManager featureFlagManager, List list) {
        this.featureFlagManager = featureFlagManager;
        this.firstPartyHosts = list;
    }

    public abstract Interceptor createInterceptor(float f, List list);

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r2 != null) goto L29;
     */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Response intercept(Interceptor.Chain chain) {
        Interceptor createInterceptor;
        LaunchDarklyFeatureFlags$EnableMobileObservabilityAndroid launchDarklyFeatureFlags$EnableMobileObservabilityAndroid = LaunchDarklyFeatureFlags$EnableMobileObservabilityAndroid.INSTANCE;
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) this.featureFlagManager;
        if (((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) realFeatureFlagManager.peekCurrentValue(launchDarklyFeatureFlags$EnableMobileObservabilityAndroid)).enabled()) {
            RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
            Request request = realInterceptorChain.request;
            String str = request.url.host;
            if (!IP_REGEX.matches(str) && !str.equalsIgnoreCase("localhost") && !StringsKt__StringsJVMKt.endsWith(str, ".local", true)) {
                int i = ((JsonFeatureFlags$MobileObservabilityConfig.Config) ((FeatureFlag$JsonFeatureFlag.Options) realFeatureFlagManager.peekCurrentValue(JsonFeatureFlags$MobileObservabilityConfig.INSTANCE)).value).datadogTracerSampleRateAndroid;
                Integer valueOf = Integer.valueOf(i);
                if (i < 0 || i >= 101) {
                    a$$ExternalSyntheticBUOutline0.m$1("tracer sample rate should be between 0..100 inclusive");
                    return null;
                }
                if (1 > i || i >= 101) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    CachedInterceptor cachedInterceptor = this.cachedInterceptor;
                    if (cachedInterceptor != null) {
                        CachedInterceptor cachedInterceptor2 = cachedInterceptor.tracerSampleRate == intValue ? cachedInterceptor : null;
                        if (cachedInterceptor2 != null) {
                            createInterceptor = cachedInterceptor2.interceptor;
                        }
                    }
                    createInterceptor = createInterceptor(intValue, this.firstPartyHosts);
                    this.cachedInterceptor = new CachedInterceptor(intValue, createInterceptor);
                    Response intercept = createInterceptor.intercept(chain);
                    if (intercept != null) {
                        return intercept;
                    }
                }
                return realInterceptorChain.proceed(request);
            }
        }
        this.cachedInterceptor = null;
        RealInterceptorChain realInterceptorChain2 = (RealInterceptorChain) chain;
        return realInterceptorChain2.proceed(realInterceptorChain2.request);
    }
}
