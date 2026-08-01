package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowNetworkTransaction extends WinterFlowDecoratorResponse {
    private static final WinterFlowNetworkTransaction DEFAULT_INSTANCE;
    private static volatile WinterFlowTestingView PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private WinterFlowXMLDecorator strings_ = WinterFlowSerializerValidator.WinterFlowRouterRouter;

    static {
        WinterFlowNetworkTransaction winterFlowNetworkTransaction = new WinterFlowNetworkTransaction();
        DEFAULT_INSTANCE = winterFlowNetworkTransaction;
        WinterFlowDecoratorResponse.WinterFlowResponseEngine(WinterFlowNetworkTransaction.class, winterFlowNetworkTransaction);
    }

    public static WinterFlowTestingSystem WinterFlowBandwidthObject() {
        return (WinterFlowTestingSystem) ((WinterFlowProtocolBackend) DEFAULT_INSTANCE.WinterFlowCacheManagerAgent(5));
    }

    public static WinterFlowNetworkTransaction WinterFlowThreadListener() {
        return DEFAULT_INSTANCE;
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
                return new WinterFlowAdapterManager(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new WinterFlowNetworkTransaction();
            case 4:
                return new WinterFlowTestingSystem(DEFAULT_INSTANCE);
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                WinterFlowTestingView winterFlowTestingView2 = PARSER;
                if (winterFlowTestingView2 != null) {
                    return winterFlowTestingView2;
                }
                synchronized (WinterFlowNetworkTransaction.class) {
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

    public final void WinterFlowServerProtocol(Iterable iterable) {
        WinterFlowXMLDecorator winterFlowXMLDecorator = this.strings_;
        boolean z = ((WinterFlowSerializerValidator) winterFlowXMLDecorator).WinterFlowVariableVersionControl;
        WinterFlowXMLDecorator winterFlowXMLDecorator2 = winterFlowXMLDecorator;
        if (!z) {
            WinterFlowSerializerValidator winterFlowSerializerValidator = (WinterFlowSerializerValidator) winterFlowXMLDecorator;
            int i = winterFlowSerializerValidator.WinterFlowUnitTestResponse;
            WinterFlowSerializerValidator WinterFlowArrayNetwork = winterFlowSerializerValidator.WinterFlowArrayNetwork(i == 0 ? 10 : i * 2);
            this.strings_ = WinterFlowArrayNetwork;
            winterFlowXMLDecorator2 = WinterFlowArrayNetwork;
        }
        Charset charset = WinterFlowMapperConcurrency.WinterFlowRouterStructure;
        if (iterable instanceof WinterFlowQueueNetwork) {
            ((WinterFlowQueueNetwork) iterable).WinterFlowHookDataSource();
            WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
            return;
        }
        if (iterable instanceof WinterFlowServerVersionControl) {
            ((WinterFlowSerializerValidator) winterFlowXMLDecorator2).addAll((Collection) iterable);
            return;
        }
        if ((winterFlowXMLDecorator2 instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) winterFlowXMLDecorator2).ensureCapacity(((Collection) iterable).size() + ((WinterFlowSerializerValidator) winterFlowXMLDecorator2).WinterFlowUnitTestResponse);
        }
        WinterFlowSerializerValidator winterFlowSerializerValidator2 = (WinterFlowSerializerValidator) winterFlowXMLDecorator2;
        int i2 = winterFlowSerializerValidator2.WinterFlowUnitTestResponse;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (winterFlowSerializerValidator2.WinterFlowUnitTestResponse - i2) + " is null.";
                for (int i3 = winterFlowSerializerValidator2.WinterFlowUnitTestResponse - 1; i3 >= i2; i3--) {
                    winterFlowSerializerValidator2.remove(i3);
                }
                WinterFlowCompilerMechanism.WinterFlowTransactionManagerStrategy(str);
                return;
            }
            winterFlowSerializerValidator2.add(obj);
        }
    }

    public final WinterFlowXMLDecorator WinterFlowServiceUtility() {
        return this.strings_;
    }
}
