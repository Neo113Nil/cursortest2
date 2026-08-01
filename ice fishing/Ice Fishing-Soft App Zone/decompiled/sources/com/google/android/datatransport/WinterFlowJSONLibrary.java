package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowJSONLibrary extends WinterFlowDecoratorResponse {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final WinterFlowJSONLibrary DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile WinterFlowTestingView PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        WinterFlowJSONLibrary winterFlowJSONLibrary = new WinterFlowJSONLibrary();
        DEFAULT_INSTANCE = winterFlowJSONLibrary;
        WinterFlowDecoratorResponse.WinterFlowResponseEngine(WinterFlowJSONLibrary.class, winterFlowJSONLibrary);
    }

    public static WinterFlowResolverVersionControl WinterFlowSerializerStructure() {
        return (WinterFlowResolverVersionControl) ((WinterFlowProtocolBackend) DEFAULT_INSTANCE.WinterFlowCacheManagerAgent(5));
    }

    public static WinterFlowJSONLibrary WinterFlowServiceUtility() {
        return DEFAULT_INSTANCE;
    }

    public final void WinterFlowArrayHelper(long j) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j);
    }

    public final void WinterFlowBackendCacheManager(float f) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f);
    }

    public final double WinterFlowBandwidthObject() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final WinterFlowNetworkTransaction WinterFlowBatchUI() {
        return this.valueCase_ == 6 ? (WinterFlowNetworkTransaction) this.value_ : WinterFlowNetworkTransaction.WinterFlowThreadListener();
    }

    @Override // com.google.android.datatransport.WinterFlowDecoratorResponse
    public final Object WinterFlowCacheManagerAgent(int i) {
        WinterFlowTestingView winterFlowTestingView;
        switch (WinterFlowResolverBackend.WinterFlowRouterAdapter(i)) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new WinterFlowAdapterManager(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", WinterFlowNetworkTransaction.class});
            case 3:
                return new WinterFlowJSONLibrary();
            case 4:
                return new WinterFlowResolverVersionControl(DEFAULT_INSTANCE);
            case STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                WinterFlowTestingView winterFlowTestingView2 = PARSER;
                if (winterFlowTestingView2 != null) {
                    return winterFlowTestingView2;
                }
                synchronized (WinterFlowJSONLibrary.class) {
                    try {
                        winterFlowTestingView = PARSER;
                        if (winterFlowTestingView == null) {
                            winterFlowTestingView = new WinterFlowRouterWorker();
                            PARSER = winterFlowTestingView;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return winterFlowTestingView;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void WinterFlowCompilerVariable(String str) {
        this.valueCase_ = 5;
        this.value_ = str;
    }

    public final int WinterFlowConcurrencyThread() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final void WinterFlowConfigurationSubsystem(WinterFlowNetworkTransaction winterFlowNetworkTransaction) {
        this.value_ = winterFlowNetworkTransaction;
        this.valueCase_ = 6;
    }

    public final void WinterFlowConsumerUserManager(double d) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d);
    }

    public final void WinterFlowEventEmitterController(int i) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i);
    }

    public final void WinterFlowMapperProtocol(boolean z) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z);
    }

    public final float WinterFlowOrchestrationSubsystem() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final void WinterFlowResolverController(WinterFlowMicroserviceCloud winterFlowMicroserviceCloud) {
        this.valueCase_ = 8;
        this.value_ = winterFlowMicroserviceCloud;
    }

    public final int WinterFlowRouterAdapter() {
        switch (this.valueCase_) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case STRING_FIELD_NUMBER /* 5 */:
                return 5;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                return 6;
            case DOUBLE_FIELD_NUMBER /* 7 */:
                return 7;
            case BYTES_FIELD_NUMBER /* 8 */:
                return 8;
            default:
                return 0;
        }
    }

    public final boolean WinterFlowServerProtocol() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final long WinterFlowSingletonPlatform() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final WinterFlowMicroserviceCloud WinterFlowThreadListener() {
        return this.valueCase_ == 8 ? (WinterFlowMicroserviceCloud) this.value_ : WinterFlowMicroserviceCloud.WinterFlowUnitTestResponse;
    }

    public final String WinterFlowVariableBandwidth() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }
}
