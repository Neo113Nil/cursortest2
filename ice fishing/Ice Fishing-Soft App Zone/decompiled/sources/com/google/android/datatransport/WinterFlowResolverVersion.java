package com.google.android.datatransport;

import android.os.Looper;
import android.view.Choreographer;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.UUID;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowResolverVersion extends WinterFlowDebugFramework implements WinterFlowObjectUI {
    public static final WinterFlowResolverVersion WinterFlowArrayHelper;
    public static final WinterFlowResolverVersion WinterFlowBackendCacheManager;
    public static final WinterFlowResolverVersion WinterFlowBandwidthObject;
    public static final WinterFlowResolverVersion WinterFlowBatchUI;
    public static final WinterFlowResolverVersion WinterFlowCacheManagerListener;
    public static final WinterFlowResolverVersion WinterFlowCompilerVariable;
    public static final WinterFlowResolverVersion WinterFlowConcurrencyThread;
    public static final WinterFlowResolverVersion WinterFlowConfigurationSubsystem;
    public static final WinterFlowResolverVersion WinterFlowConsumerUserManager;
    public static final WinterFlowResolverVersion WinterFlowEventEmitterController;
    public static final WinterFlowResolverVersion WinterFlowMapperProtocol;
    public static final WinterFlowResolverVersion WinterFlowOrchestrationSubsystem;
    public static final WinterFlowResolverVersion WinterFlowPackageIDE;
    public static final WinterFlowResolverVersion WinterFlowResolverController;
    public static final WinterFlowResolverVersion WinterFlowResponseEngine;
    public static final WinterFlowResolverVersion WinterFlowRouterAdapter;
    public static final WinterFlowResolverVersion WinterFlowRouterRouter;
    public static final WinterFlowResolverVersion WinterFlowSerializerStructure;
    public static final WinterFlowResolverVersion WinterFlowServerProtocol;
    public static final WinterFlowResolverVersion WinterFlowServiceUtility;
    public static final WinterFlowResolverVersion WinterFlowSingletonPlatform;
    public static final WinterFlowResolverVersion WinterFlowSoftwareEngine;
    public static final WinterFlowResolverVersion WinterFlowSoftwareProtocol;
    public static final WinterFlowResolverVersion WinterFlowStrategyTool;
    public static final WinterFlowResolverVersion WinterFlowSyntax;
    public static final WinterFlowResolverVersion WinterFlowThreadListener;
    public static final WinterFlowResolverVersion WinterFlowTransactionAgent;
    public static final WinterFlowResolverVersion WinterFlowUnitTestResponse;
    public static final WinterFlowResolverVersion WinterFlowUserManagerUserManager;
    public static final WinterFlowResolverVersion WinterFlowVariableBandwidth;
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;

    static {
        int i = 0;
        WinterFlowUnitTestResponse = new WinterFlowResolverVersion(i, 0);
        WinterFlowRouterRouter = new WinterFlowResolverVersion(i, 1);
        WinterFlowSyntax = new WinterFlowResolverVersion(i, 2);
        WinterFlowResponseEngine = new WinterFlowResolverVersion(i, 3);
        WinterFlowTransactionAgent = new WinterFlowResolverVersion(i, 4);
        WinterFlowServerProtocol = new WinterFlowResolverVersion(i, 5);
        WinterFlowThreadListener = new WinterFlowResolverVersion(i, 6);
        WinterFlowServiceUtility = new WinterFlowResolverVersion(i, 7);
        WinterFlowBandwidthObject = new WinterFlowResolverVersion(i, 8);
        WinterFlowOrchestrationSubsystem = new WinterFlowResolverVersion(i, 9);
        WinterFlowConcurrencyThread = new WinterFlowResolverVersion(i, 10);
        WinterFlowSingletonPlatform = new WinterFlowResolverVersion(i, 11);
        WinterFlowVariableBandwidth = new WinterFlowResolverVersion(i, 12);
        WinterFlowBatchUI = new WinterFlowResolverVersion(i, 13);
        WinterFlowRouterAdapter = new WinterFlowResolverVersion(i, 14);
        WinterFlowSerializerStructure = new WinterFlowResolverVersion(i, 15);
        WinterFlowMapperProtocol = new WinterFlowResolverVersion(i, 16);
        WinterFlowResolverController = new WinterFlowResolverVersion(i, 17);
        WinterFlowConsumerUserManager = new WinterFlowResolverVersion(i, 18);
        WinterFlowBackendCacheManager = new WinterFlowResolverVersion(i, 19);
        WinterFlowEventEmitterController = new WinterFlowResolverVersion(i, 20);
        WinterFlowArrayHelper = new WinterFlowResolverVersion(i, 21);
        WinterFlowCompilerVariable = new WinterFlowResolverVersion(i, 22);
        WinterFlowConfigurationSubsystem = new WinterFlowResolverVersion(i, 23);
        WinterFlowStrategyTool = new WinterFlowResolverVersion(i, 24);
        WinterFlowCacheManagerListener = new WinterFlowResolverVersion(i, 25);
        WinterFlowPackageIDE = new WinterFlowResolverVersion(i, 26);
        WinterFlowSoftwareProtocol = new WinterFlowResolverVersion(i, 27);
        WinterFlowUserManagerUserManager = new WinterFlowResolverVersion(i, 28);
        WinterFlowSoftwareEngine = new WinterFlowResolverVersion(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowResolverVersion(int i, int i2) {
        super(i);
        this.WinterFlowTransactionManagerStrategy = i2;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        Choreographer choreographer;
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = null;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowUnitTestProvider.WinterFlowRouterStructure("LocalConfiguration");
                throw null;
            case 1:
                WinterFlowUnitTestProvider.WinterFlowRouterStructure("LocalContext");
                throw null;
            case 2:
                WinterFlowUnitTestProvider.WinterFlowRouterStructure("LocalImageVectorCache");
                throw null;
            case 3:
                WinterFlowUnitTestProvider.WinterFlowRouterStructure("LocalResourceIdCache");
                throw null;
            case 4:
                WinterFlowUnitTestProvider.WinterFlowRouterStructure("LocalView");
                throw null;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                return UUID.randomUUID();
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                return Boolean.FALSE;
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                return "DEFAULT_TEST_TAG";
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    WinterFlowCacheDecorator winterFlowCacheDecorator = WinterFlowInheritanceUtility.WinterFlowRouterStructure;
                    choreographer = (Choreographer) WinterFlowQuerySyntax.WinterFlowCacheManagerListener(WinterFlowEventEmitterRepository.WinterFlowRouterStructure, new WinterFlowOrchestrationTesting(2, winterFlowTransactionManagerLayer, 0));
                }
                WinterFlowServerHook winterFlowServerHook = new WinterFlowServerHook(choreographer, WinterFlowServerManager.WinterFlowServiceUtility(Looper.getMainLooper()));
                return WinterFlowTestingCloud.WinterFlowArrayHelper(winterFlowServerHook, winterFlowServerHook.WinterFlowOrchestrationSubsystem);
            case 9:
            case 10:
            case 11:
                return winterFlowAlgorithmSession;
            case 12:
            case 13:
                return null;
            case 14:
                WinterFlowBackendTransactionManager.WinterFlowHookDataSource("LocalAutofillManager");
                throw null;
            case 15:
                WinterFlowBackendTransactionManager.WinterFlowHookDataSource("LocalAutofillTree");
                throw null;
            case 16:
                WinterFlowBackendTransactionManager.WinterFlowHookDataSource("LocalClipboard");
                throw null;
            case 17:
                WinterFlowBackendTransactionManager.WinterFlowHookDataSource("LocalClipboardManager");
                throw null;
            case 18:
                return Boolean.TRUE;
            case 19:
                WinterFlowBackendTransactionManager.WinterFlowHookDataSource("LocalDensity");
                throw null;
            case 20:
                WinterFlowBackendTransactionManager.WinterFlowHookDataSource("LocalFocusManager");
                throw null;
            case 21:
                WinterFlowBackendTransactionManager.WinterFlowHookDataSource("LocalFontFamilyResolver");
                throw null;
            case 22:
                WinterFlowBackendTransactionManager.WinterFlowHookDataSource("LocalFontLoader");
                throw null;
            case 23:
                WinterFlowBackendTransactionManager.WinterFlowHookDataSource("LocalGraphicsContext");
                throw null;
            case 24:
                WinterFlowBackendTransactionManager.WinterFlowHookDataSource("LocalHapticFeedback");
                throw null;
            case 25:
                WinterFlowBackendTransactionManager.WinterFlowHookDataSource("LocalInputManager");
                throw null;
            case 26:
                WinterFlowBackendTransactionManager.WinterFlowHookDataSource("LocalLayoutDirection");
                throw null;
            case 27:
                return null;
            case 28:
                WinterFlowBackendTransactionManager.WinterFlowHookDataSource("LocalProvidableLocaleList");
                throw null;
            default:
                return Boolean.FALSE;
        }
    }
}
