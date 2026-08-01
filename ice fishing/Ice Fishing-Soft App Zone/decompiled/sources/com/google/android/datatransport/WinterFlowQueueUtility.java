package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowQueueUtility extends WinterFlowDecoratorResponse {
    private static final WinterFlowQueueUtility DEFAULT_INSTANCE;
    private static volatile WinterFlowTestingView PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private WinterFlowAlgorithmManager preferences_ = WinterFlowAlgorithmManager.WinterFlowTransactionManagerStrategy;

    static {
        WinterFlowQueueUtility winterFlowQueueUtility = new WinterFlowQueueUtility();
        DEFAULT_INSTANCE = winterFlowQueueUtility;
        WinterFlowDecoratorResponse.WinterFlowResponseEngine(WinterFlowQueueUtility.class, winterFlowQueueUtility);
    }

    public static WinterFlowQueueUtility WinterFlowBandwidthObject(FileInputStream fileInputStream) {
        WinterFlowQueueUtility winterFlowQueueUtility = DEFAULT_INSTANCE;
        WinterFlowRefactoringNetwork winterFlowRefactoringNetwork = new WinterFlowRefactoringNetwork(fileInputStream);
        WinterFlowExceptionProtocol WinterFlowRouterStructure = WinterFlowExceptionProtocol.WinterFlowRouterStructure();
        WinterFlowDecoratorResponse WinterFlowSyntax = winterFlowQueueUtility.WinterFlowSyntax();
        try {
            WinterFlowRequestCompiler winterFlowRequestCompiler = WinterFlowRequestCompiler.WinterFlowCacheManagerAgent;
            winterFlowRequestCompiler.getClass();
            WinterFlowServerSyntax WinterFlowRouterStructure2 = winterFlowRequestCompiler.WinterFlowRouterStructure(WinterFlowSyntax.getClass());
            WinterFlowProviderEntity winterFlowProviderEntity = (WinterFlowProviderEntity) winterFlowRefactoringNetwork.WinterFlowTransactionManagerStrategy;
            if (winterFlowProviderEntity == null) {
                winterFlowProviderEntity = new WinterFlowProviderEntity(winterFlowRefactoringNetwork);
            }
            WinterFlowRouterStructure2.WinterFlowSyntax(WinterFlowSyntax, winterFlowProviderEntity, WinterFlowRouterStructure);
            WinterFlowRouterStructure2.WinterFlowArrayNetwork(WinterFlowSyntax);
            if (WinterFlowDecoratorResponse.WinterFlowTransactionManagerStrategy(WinterFlowSyntax, true)) {
                return (WinterFlowQueueUtility) WinterFlowSyntax;
            }
            throw new WinterFlowRouterAgent(new WinterFlowVariableThreadPool().getMessage());
        } catch (WinterFlowRouterAgent e) {
            if (e.WinterFlowVariableVersionControl) {
                throw new WinterFlowRouterAgent(e.getMessage(), e);
            }
            throw e;
        } catch (WinterFlowVariableThreadPool e2) {
            throw new WinterFlowRouterAgent(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof WinterFlowRouterAgent) {
                throw ((WinterFlowRouterAgent) e3.getCause());
            }
            throw new WinterFlowRouterAgent(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof WinterFlowRouterAgent) {
                throw ((WinterFlowRouterAgent) e4.getCause());
            }
            throw e4;
        }
    }

    public static WinterFlowIDEStrategy WinterFlowServiceUtility() {
        return (WinterFlowIDEStrategy) ((WinterFlowProtocolBackend) DEFAULT_INSTANCE.WinterFlowCacheManagerAgent(5));
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
                return new WinterFlowAdapterManager(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", WinterFlowSyntaxJSON.WinterFlowRouterStructure});
            case 3:
                return new WinterFlowQueueUtility();
            case 4:
                return new WinterFlowIDEStrategy(DEFAULT_INSTANCE);
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                WinterFlowTestingView winterFlowTestingView2 = PARSER;
                if (winterFlowTestingView2 != null) {
                    return winterFlowTestingView2;
                }
                synchronized (WinterFlowQueueUtility.class) {
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

    public final Map WinterFlowServerProtocol() {
        return Collections.unmodifiableMap(this.preferences_);
    }

    public final WinterFlowAlgorithmManager WinterFlowThreadListener() {
        WinterFlowAlgorithmManager winterFlowAlgorithmManager = this.preferences_;
        if (winterFlowAlgorithmManager.WinterFlowVariableVersionControl) {
            return winterFlowAlgorithmManager;
        }
        WinterFlowAlgorithmManager WinterFlowHookDataSource = winterFlowAlgorithmManager.WinterFlowHookDataSource();
        this.preferences_ = WinterFlowHookDataSource;
        return WinterFlowHookDataSource;
    }
}
