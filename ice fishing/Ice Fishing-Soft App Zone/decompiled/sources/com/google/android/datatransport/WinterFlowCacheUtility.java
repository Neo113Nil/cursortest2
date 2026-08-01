package com.google.android.datatransport;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCacheUtility implements WinterFlowCacheManagerFunction, WinterFlowRendererProvider, WinterFlowDeserializationParser, WinterFlowInterfaceScript, WinterFlowDebugModule, WinterFlowAPIRefactoring, WinterFlowDeserializationComponent, WinterFlowFrontendDeserialization, WinterFlowFunctionCacheManager, WinterFlowTransactionDecorator, WinterFlowListenerSubsystem {
    public static WinterFlowCacheUtility WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;
    public static final WinterFlowInvokerConsumer WinterFlowUnitTestResponse = new WinterFlowInvokerConsumer(-1.0f, -1.0f);
    public static final WinterFlowInvokerConsumer WinterFlowRouterRouter = new WinterFlowInvokerConsumer(0.0f, -1.0f);
    public static final WinterFlowInvokerConsumer WinterFlowSyntax = new WinterFlowInvokerConsumer(1.0f, -1.0f);
    public static final WinterFlowInvokerConsumer WinterFlowResponseEngine = new WinterFlowInvokerConsumer(-1.0f, 0.0f);
    public static final WinterFlowInvokerConsumer WinterFlowTransactionAgent = new WinterFlowInvokerConsumer(0.0f, 0.0f);
    public static final WinterFlowInvokerConsumer WinterFlowServerProtocol = new WinterFlowInvokerConsumer(1.0f, 0.0f);
    public static final WinterFlowInvokerConsumer WinterFlowThreadListener = new WinterFlowInvokerConsumer(-1.0f, 1.0f);
    public static final WinterFlowInvokerConsumer WinterFlowServiceUtility = new WinterFlowInvokerConsumer(0.0f, 1.0f);
    public static final WinterFlowInvokerConsumer WinterFlowBandwidthObject = new WinterFlowInvokerConsumer(1.0f, 1.0f);
    public static final WinterFlowProviderPackage WinterFlowOrchestrationSubsystem = new WinterFlowProviderPackage(-1.0f);
    public static final WinterFlowProviderPackage WinterFlowConcurrencyThread = new WinterFlowProviderPackage(0.0f);
    public static final WinterFlowConfigurationPipeline WinterFlowSingletonPlatform = new WinterFlowConfigurationPipeline(-1.0f);
    public static final WinterFlowConfigurationPipeline WinterFlowVariableBandwidth = new WinterFlowConfigurationPipeline(0.0f);
    public static final WinterFlowCacheUtility WinterFlowBatchUI = new WinterFlowCacheUtility(2);
    public static final WinterFlowCacheUtility WinterFlowRouterAdapter = new WinterFlowCacheUtility(3);
    public static final WinterFlowCompilerMechanism WinterFlowSerializerStructure = new WinterFlowCompilerMechanism(4);
    public static final /* synthetic */ WinterFlowCacheUtility WinterFlowMapperProtocol = new WinterFlowCacheUtility(5);
    public static final WinterFlowCacheUtility WinterFlowResolverController = new WinterFlowCacheUtility(6);
    public static final WinterFlowCacheUtility WinterFlowConsumerUserManager = new WinterFlowCacheUtility(7);
    public static final WinterFlowCacheUtility WinterFlowBackendCacheManager = new WinterFlowCacheUtility(8);
    public static final WinterFlowCacheManagerConfiguration WinterFlowEventEmitterController = WinterFlowCacheManagerConfiguration.WinterFlowVariableVersionControl;
    public static final WinterFlowResolverNetwork WinterFlowArrayHelper = new WinterFlowResolverNetwork(1.0f, 1.0f);
    public static final WinterFlowCacheUtility WinterFlowCompilerVariable = new WinterFlowCacheUtility(9);
    public static final WinterFlowCacheUtility WinterFlowConfigurationSubsystem = new WinterFlowCacheUtility(10);
    public static final WinterFlowCacheUtility WinterFlowStrategyTool = new WinterFlowCacheUtility(11);
    public static final WinterFlowCacheUtility WinterFlowCacheManagerListener = new WinterFlowCacheUtility(12);
    public static final /* synthetic */ WinterFlowCacheUtility WinterFlowPackageIDE = new WinterFlowCacheUtility(13);
    public static final /* synthetic */ WinterFlowCacheUtility WinterFlowSoftwareProtocol = new WinterFlowCacheUtility(14);
    public static final WinterFlowCacheUtility WinterFlowUserManagerUserManager = new WinterFlowCacheUtility(15);
    public static final WinterFlowCacheUtility WinterFlowSoftwareEngine = new WinterFlowCacheUtility(16);
    public static final WinterFlowCacheUtility WinterFlowSyntaxSubsystem = new WinterFlowCacheUtility(18);
    public static final WinterFlowCacheUtility WinterFlowTestingNode = new WinterFlowCacheUtility(19);
    public static final WinterFlowCacheUtility WinterFlowCompilerHandler = new WinterFlowCacheUtility(20);
    public static final WinterFlowCacheUtility WinterFlowFrontendBackend = new WinterFlowCacheUtility(21);

    public /* synthetic */ WinterFlowCacheUtility(int i) {
        this.WinterFlowVariableVersionControl = i;
    }

    public static WinterFlowExceptionTool WinterFlowBandwidthObject(PackageInfo packageInfo, WinterFlowExceptionTool... winterFlowExceptionToolArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        WinterFlowIDEAgent winterFlowIDEAgent = new WinterFlowIDEAgent(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < winterFlowExceptionToolArr.length; i++) {
            if (winterFlowExceptionToolArr[i].equals(winterFlowIDEAgent)) {
                return winterFlowExceptionToolArr[i];
            }
        }
        return null;
    }

    public static WinterFlowDataSourceSerializer WinterFlowServerProtocol(FileInputStream fileInputStream) {
        byte[] bArr;
        try {
            WinterFlowQueueUtility WinterFlowBandwidthObject2 = WinterFlowQueueUtility.WinterFlowBandwidthObject(fileInputStream);
            WinterFlowDataSourceSerializer winterFlowDataSourceSerializer = new WinterFlowDataSourceSerializer(false);
            WinterFlowEventEmitterMapper[] winterFlowEventEmitterMapperArr = (WinterFlowEventEmitterMapper[]) Arrays.copyOf(new WinterFlowEventEmitterMapper[0], 0);
            winterFlowDataSourceSerializer.WinterFlowHookDataSource();
            if (winterFlowEventEmitterMapperArr.length > 0) {
                WinterFlowEventEmitterMapper winterFlowEventEmitterMapper = winterFlowEventEmitterMapperArr[0];
                throw null;
            }
            Map WinterFlowServerProtocol2 = WinterFlowBandwidthObject2.WinterFlowServerProtocol();
            WinterFlowServerProtocol2.getClass();
            for (Map.Entry entry : WinterFlowServerProtocol2.entrySet()) {
                String str = (String) entry.getKey();
                WinterFlowJSONLibrary winterFlowJSONLibrary = (WinterFlowJSONLibrary) entry.getValue();
                str.getClass();
                winterFlowJSONLibrary.getClass();
                int WinterFlowRouterAdapter2 = winterFlowJSONLibrary.WinterFlowRouterAdapter();
                switch (WinterFlowRouterAdapter2 == 0 ? -1 : WinterFlowUserManagerService.WinterFlowRouterStructure[WinterFlowResolverBackend.WinterFlowRouterAdapter(WinterFlowRouterAdapter2)]) {
                    case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                        throw new WinterFlowProcessorCloud("Value case is null.", null);
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    default:
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                        return null;
                    case 1:
                        winterFlowDataSourceSerializer.WinterFlowArrayNetwork(new WinterFlowNetworkFramework(str), Boolean.valueOf(winterFlowJSONLibrary.WinterFlowServerProtocol()));
                        break;
                    case 2:
                        winterFlowDataSourceSerializer.WinterFlowArrayNetwork(new WinterFlowNetworkFramework(str), Float.valueOf(winterFlowJSONLibrary.WinterFlowOrchestrationSubsystem()));
                        break;
                    case 3:
                        winterFlowDataSourceSerializer.WinterFlowArrayNetwork(new WinterFlowNetworkFramework(str), Double.valueOf(winterFlowJSONLibrary.WinterFlowBandwidthObject()));
                        break;
                    case 4:
                        winterFlowDataSourceSerializer.WinterFlowArrayNetwork(new WinterFlowNetworkFramework(str), Integer.valueOf(winterFlowJSONLibrary.WinterFlowConcurrencyThread()));
                        break;
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        winterFlowDataSourceSerializer.WinterFlowArrayNetwork(new WinterFlowNetworkFramework(str), Long.valueOf(winterFlowJSONLibrary.WinterFlowSingletonPlatform()));
                        break;
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        WinterFlowNetworkFramework winterFlowNetworkFramework = new WinterFlowNetworkFramework(str);
                        String WinterFlowVariableBandwidth2 = winterFlowJSONLibrary.WinterFlowVariableBandwidth();
                        WinterFlowVariableBandwidth2.getClass();
                        winterFlowDataSourceSerializer.WinterFlowArrayNetwork(winterFlowNetworkFramework, WinterFlowVariableBandwidth2);
                        break;
                    case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                        WinterFlowNetworkFramework winterFlowNetworkFramework2 = new WinterFlowNetworkFramework(str);
                        WinterFlowXMLDecorator WinterFlowServiceUtility2 = winterFlowJSONLibrary.WinterFlowBatchUI().WinterFlowServiceUtility();
                        WinterFlowServiceUtility2.getClass();
                        winterFlowDataSourceSerializer.WinterFlowArrayNetwork(winterFlowNetworkFramework2, WinterFlowSerializerUtility.WinterFlowDatabaseSchemaUtility(WinterFlowServiceUtility2));
                        break;
                    case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                        WinterFlowNetworkFramework winterFlowNetworkFramework3 = new WinterFlowNetworkFramework(str);
                        WinterFlowMicroserviceCloud WinterFlowThreadListener2 = winterFlowJSONLibrary.WinterFlowThreadListener();
                        int size = WinterFlowThreadListener2.size();
                        if (size == 0) {
                            bArr = WinterFlowMapperConcurrency.WinterFlowHookDataSource;
                        } else {
                            byte[] bArr2 = new byte[size];
                            WinterFlowThreadListener2.WinterFlowVariableVersionControl(size, bArr2);
                            bArr = bArr2;
                        }
                        bArr.getClass();
                        winterFlowDataSourceSerializer.WinterFlowArrayNetwork(winterFlowNetworkFramework3, bArr);
                        break;
                    case 9:
                        throw new WinterFlowProcessorCloud("Value not set.", null);
                }
            }
            return new WinterFlowDataSourceSerializer(new LinkedHashMap(winterFlowDataSourceSerializer.WinterFlowRouterStructure()), true);
        } catch (WinterFlowRouterAgent e) {
            throw new WinterFlowProcessorCloud("Unable to parse preferences proto.", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f7, code lost:
    
        r6 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean WinterFlowServiceUtility(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo;
        WinterFlowRuntimeModule winterFlowRuntimeModule;
        SigningInfo signingInfo;
        WinterFlowRuntimeModule winterFlowRuntimeModule2;
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        Signature[] signingCertificateHistory2;
        int i;
        if (packageInfo != null) {
            boolean z = (("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) && ((applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 129) == 0)) ? false : true;
            try {
                winterFlowRuntimeModule = z ? WinterFlowProxyController.WinterFlowCacheManagerAgent : WinterFlowProxyController.WinterFlowHookDataSource;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] bArr = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        bArr = signatureArr[0].toByteArray();
                    }
                    if (bArr != null) {
                        WinterFlowWebsocket winterFlowWebsocket = WinterFlowRuntimeBandwidth.WinterFlowTransactionManagerStrategy;
                        Object[] objArr = {bArr};
                        WinterFlowMicroserviceWidget.WinterFlowTransactionAgent(1, objArr);
                        winterFlowRuntimeModule2 = new WinterFlowRuntimeModule(1, objArr);
                    } else {
                        WinterFlowWebsocket winterFlowWebsocket2 = WinterFlowRuntimeBandwidth.WinterFlowTransactionManagerStrategy;
                        winterFlowRuntimeModule2 = WinterFlowRuntimeModule.WinterFlowSyntax;
                    }
                } else {
                    if (i2 < 28) {
                        throw new IllegalStateException();
                    }
                    signingInfo = packageInfo.signingInfo;
                    if (signingInfo != null) {
                        hasMultipleSigners = signingInfo.hasMultipleSigners();
                        if (!hasMultipleSigners) {
                            signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                            if (signingCertificateHistory != null) {
                                WinterFlowWebsocket winterFlowWebsocket3 = WinterFlowRuntimeBandwidth.WinterFlowTransactionManagerStrategy;
                                Object[] objArr2 = new Object[4];
                                signingCertificateHistory2 = signingInfo.getSigningCertificateHistory();
                                int length = signingCertificateHistory2.length;
                                int i3 = 0;
                                int i4 = 0;
                                while (i3 < length) {
                                    byte[] byteArray = signingCertificateHistory2[i3].toByteArray();
                                    byteArray.getClass();
                                    int length2 = objArr2.length;
                                    int i5 = i4 + 1;
                                    if (i5 < 0) {
                                        throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                                    }
                                    if (i5 <= length2) {
                                        i = length2;
                                    } else {
                                        i = (length2 >> 1) + length2 + 1;
                                        if (i < i5) {
                                            int highestOneBit = Integer.highestOneBit(i4);
                                            i = highestOneBit + highestOneBit;
                                        }
                                        if (i < 0) {
                                            i = Integer.MAX_VALUE;
                                        }
                                    }
                                    if (i > length2) {
                                        objArr2 = Arrays.copyOf(objArr2, i);
                                    }
                                    objArr2[i4] = byteArray;
                                    i3++;
                                    i4 = i5;
                                }
                                winterFlowRuntimeModule2 = i4 == 0 ? WinterFlowRuntimeModule.WinterFlowSyntax : new WinterFlowRuntimeModule(i4, objArr2);
                            }
                        }
                    }
                    WinterFlowWebsocket winterFlowWebsocket4 = WinterFlowRuntimeBandwidth.WinterFlowTransactionManagerStrategy;
                    winterFlowRuntimeModule2 = WinterFlowRuntimeModule.WinterFlowSyntax;
                }
            } catch (IllegalArgumentException unused) {
                if ((z ? WinterFlowBandwidthObject(packageInfo, WinterFlowProxyController.WinterFlowRouterStructure) : WinterFlowBandwidthObject(packageInfo, WinterFlowProxyController.WinterFlowRouterStructure[0])) != null) {
                }
            }
            if (winterFlowRuntimeModule2.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            WinterFlowRuntimeBandwidth WinterFlowTransactionManagerStrategy2 = winterFlowRuntimeModule2.WinterFlowTransactionManagerStrategy();
            int size = WinterFlowTransactionManagerStrategy2.size();
            int i6 = 0;
            while (i6 < size) {
                byte[] bArr2 = (byte[]) WinterFlowTransactionManagerStrategy2.get(i6);
                WinterFlowWebsocket listIterator = winterFlowRuntimeModule.listIterator(0);
                do {
                    int i7 = i6 + 1;
                    if (listIterator.hasNext()) {
                    }
                } while (!Arrays.equals(bArr2, (byte[]) listIterator.next()));
                return true;
            }
        }
        return false;
    }

    public static void WinterFlowThreadListener(Object obj, WinterFlowWorkerEngine winterFlowWorkerEngine) {
        WinterFlowDecoratorResponse WinterFlowRouterStructure;
        Map WinterFlowRouterStructure2 = ((WinterFlowDataSourceSerializer) obj).WinterFlowRouterStructure();
        WinterFlowIDEStrategy WinterFlowServiceUtility2 = WinterFlowQueueUtility.WinterFlowServiceUtility();
        for (Map.Entry entry : WinterFlowRouterStructure2.entrySet()) {
            WinterFlowNetworkFramework winterFlowNetworkFramework = (WinterFlowNetworkFramework) entry.getKey();
            Object value = entry.getValue();
            String str = winterFlowNetworkFramework.WinterFlowRouterStructure;
            if (value instanceof Boolean) {
                WinterFlowResolverVersionControl WinterFlowSerializerStructure2 = WinterFlowJSONLibrary.WinterFlowSerializerStructure();
                boolean booleanValue = ((Boolean) value).booleanValue();
                WinterFlowSerializerStructure2.WinterFlowCacheManagerAgent();
                ((WinterFlowJSONLibrary) WinterFlowSerializerStructure2.WinterFlowTransactionManagerStrategy).WinterFlowMapperProtocol(booleanValue);
                WinterFlowRouterStructure = WinterFlowSerializerStructure2.WinterFlowRouterStructure();
            } else if (value instanceof Float) {
                WinterFlowResolverVersionControl WinterFlowSerializerStructure3 = WinterFlowJSONLibrary.WinterFlowSerializerStructure();
                float floatValue = ((Number) value).floatValue();
                WinterFlowSerializerStructure3.WinterFlowCacheManagerAgent();
                ((WinterFlowJSONLibrary) WinterFlowSerializerStructure3.WinterFlowTransactionManagerStrategy).WinterFlowBackendCacheManager(floatValue);
                WinterFlowRouterStructure = WinterFlowSerializerStructure3.WinterFlowRouterStructure();
            } else if (value instanceof Double) {
                WinterFlowResolverVersionControl WinterFlowSerializerStructure4 = WinterFlowJSONLibrary.WinterFlowSerializerStructure();
                double doubleValue = ((Number) value).doubleValue();
                WinterFlowSerializerStructure4.WinterFlowCacheManagerAgent();
                ((WinterFlowJSONLibrary) WinterFlowSerializerStructure4.WinterFlowTransactionManagerStrategy).WinterFlowConsumerUserManager(doubleValue);
                WinterFlowRouterStructure = WinterFlowSerializerStructure4.WinterFlowRouterStructure();
            } else if (value instanceof Integer) {
                WinterFlowResolverVersionControl WinterFlowSerializerStructure5 = WinterFlowJSONLibrary.WinterFlowSerializerStructure();
                int intValue = ((Number) value).intValue();
                WinterFlowSerializerStructure5.WinterFlowCacheManagerAgent();
                ((WinterFlowJSONLibrary) WinterFlowSerializerStructure5.WinterFlowTransactionManagerStrategy).WinterFlowEventEmitterController(intValue);
                WinterFlowRouterStructure = WinterFlowSerializerStructure5.WinterFlowRouterStructure();
            } else if (value instanceof Long) {
                WinterFlowResolverVersionControl WinterFlowSerializerStructure6 = WinterFlowJSONLibrary.WinterFlowSerializerStructure();
                long longValue = ((Number) value).longValue();
                WinterFlowSerializerStructure6.WinterFlowCacheManagerAgent();
                ((WinterFlowJSONLibrary) WinterFlowSerializerStructure6.WinterFlowTransactionManagerStrategy).WinterFlowArrayHelper(longValue);
                WinterFlowRouterStructure = WinterFlowSerializerStructure6.WinterFlowRouterStructure();
            } else if (value instanceof String) {
                WinterFlowResolverVersionControl WinterFlowSerializerStructure7 = WinterFlowJSONLibrary.WinterFlowSerializerStructure();
                WinterFlowSerializerStructure7.WinterFlowCacheManagerAgent();
                ((WinterFlowJSONLibrary) WinterFlowSerializerStructure7.WinterFlowTransactionManagerStrategy).WinterFlowCompilerVariable((String) value);
                WinterFlowRouterStructure = WinterFlowSerializerStructure7.WinterFlowRouterStructure();
            } else if (value instanceof Set) {
                WinterFlowResolverVersionControl WinterFlowSerializerStructure8 = WinterFlowJSONLibrary.WinterFlowSerializerStructure();
                WinterFlowTestingSystem WinterFlowBandwidthObject2 = WinterFlowNetworkTransaction.WinterFlowBandwidthObject();
                WinterFlowBandwidthObject2.WinterFlowCacheManagerAgent();
                ((WinterFlowNetworkTransaction) WinterFlowBandwidthObject2.WinterFlowTransactionManagerStrategy).WinterFlowServerProtocol((Set) value);
                WinterFlowSerializerStructure8.WinterFlowCacheManagerAgent();
                ((WinterFlowJSONLibrary) WinterFlowSerializerStructure8.WinterFlowTransactionManagerStrategy).WinterFlowConfigurationSubsystem((WinterFlowNetworkTransaction) WinterFlowBandwidthObject2.WinterFlowRouterStructure());
                WinterFlowRouterStructure = WinterFlowSerializerStructure8.WinterFlowRouterStructure();
            } else {
                if (!(value instanceof byte[])) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                    return;
                }
                WinterFlowResolverVersionControl WinterFlowSerializerStructure9 = WinterFlowJSONLibrary.WinterFlowSerializerStructure();
                byte[] bArr = (byte[]) value;
                WinterFlowMicroserviceCloud WinterFlowArrayNetwork = WinterFlowMicroserviceCloud.WinterFlowArrayNetwork(bArr, 0, bArr.length);
                WinterFlowSerializerStructure9.WinterFlowCacheManagerAgent();
                ((WinterFlowJSONLibrary) WinterFlowSerializerStructure9.WinterFlowTransactionManagerStrategy).WinterFlowResolverController(WinterFlowArrayNetwork);
                WinterFlowRouterStructure = WinterFlowSerializerStructure9.WinterFlowRouterStructure();
            }
            WinterFlowServiceUtility2.getClass();
            str.getClass();
            WinterFlowServiceUtility2.WinterFlowCacheManagerAgent();
            ((WinterFlowQueueUtility) WinterFlowServiceUtility2.WinterFlowTransactionManagerStrategy).WinterFlowThreadListener().put(str, (WinterFlowJSONLibrary) WinterFlowRouterStructure);
        }
        WinterFlowQueueUtility winterFlowQueueUtility = (WinterFlowQueueUtility) WinterFlowServiceUtility2.WinterFlowRouterStructure();
        int WinterFlowRouterStructure3 = winterFlowQueueUtility.WinterFlowRouterStructure(null);
        Logger logger = WinterFlowSessionManagerSingleton.WinterFlowTransactionManagerStrategy;
        if (WinterFlowRouterStructure3 > 4096) {
            WinterFlowRouterStructure3 = 4096;
        }
        WinterFlowSessionManagerSingleton winterFlowSessionManagerSingleton = new WinterFlowSessionManagerSingleton(winterFlowWorkerEngine, WinterFlowRouterStructure3);
        winterFlowQueueUtility.WinterFlowHookDataSource(winterFlowSessionManagerSingleton);
        if (winterFlowSessionManagerSingleton.WinterFlowArrayNetwork > 0) {
            winterFlowSessionManagerSingleton.WinterFlowTransactionAgent();
        }
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationParser
    public long WinterFlowArrayNetwork() {
        return 9205357640488583168L;
    }

    @Override // com.google.android.datatransport.WinterFlowListenerSubsystem
    public byte[] WinterFlowCacheManagerAgent(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationParser
    public WinterFlowConcurrencyParser WinterFlowHookDataSource() {
        return WinterFlowArrayHelper;
    }

    @Override // com.google.android.datatransport.WinterFlowAPIRefactoring
    public boolean WinterFlowResponseEngine(Object obj, Object obj2) {
        return false;
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionDecorator
    public void WinterFlowRouterRouter(int i, WinterFlowNodeException winterFlowNodeException, int[] iArr, int[] iArr2) {
        WinterFlowInvokerComponent.WinterFlowUIMiddleware(i, iArr, iArr2, false);
    }

    @Override // com.google.android.datatransport.WinterFlowFunctionCacheManager, com.google.android.datatransport.WinterFlowTransactionDecorator
    public float WinterFlowRouterStructure() {
        return 0.0f;
    }

    @Override // com.google.android.datatransport.WinterFlowCacheManagerFunction
    public Rect WinterFlowSyntax(Activity activity) {
        switch (this.WinterFlowVariableVersionControl) {
            case 2:
                Rect rect = new Rect();
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                defaultDisplay.getRectSize(rect);
                if (!activity.isInMultiWindowMode()) {
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int i = rect.bottom + dimensionPixelSize;
                    if (i == point.y) {
                        rect.bottom = i;
                    } else {
                        int i2 = rect.right + dimensionPixelSize;
                        if (i2 == point.x) {
                            rect.right = i2;
                        }
                    }
                }
                return rect;
            default:
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                    invoke.getClass();
                    return new Rect((Rect) invoke);
                } catch (Exception e) {
                    if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                        throw e;
                    }
                    WinterFlowCacheManagerFunction.WinterFlowRouterStructure.getClass();
                    return WinterFlowSessionManagerProcess.WinterFlowUnitTestResponse.WinterFlowSyntax(activity);
                }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowAPIRefactoring
    public void WinterFlowTransactionAgent(WinterFlowCacheManagerGateway winterFlowCacheManagerGateway) {
        winterFlowCacheManagerGateway.clear();
    }

    @Override // com.google.android.datatransport.WinterFlowFunctionCacheManager
    public void WinterFlowTransactionManagerStrategy(WinterFlowNodeException winterFlowNodeException, int i, int[] iArr, WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration, int[] iArr2) {
        if (winterFlowCacheManagerConfiguration == WinterFlowCacheManagerConfiguration.WinterFlowVariableVersionControl) {
            WinterFlowInvokerComponent.WinterFlowUIMiddleware(i, iArr, iArr2, false);
        } else {
            WinterFlowInvokerComponent.WinterFlowUIMiddleware(i, iArr, iArr2, true);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowInterfaceScript
    public Object WinterFlowUnitTestResponse(WinterFlowRequestEngine winterFlowRequestEngine) {
        switch (this.WinterFlowVariableVersionControl) {
            case 10:
                Object WinterFlowVariableVersionControl = winterFlowRequestEngine.WinterFlowVariableVersionControl(new WinterFlowValidatorProcess(WinterFlowNetworkEvent.class, Executor.class));
                WinterFlowVariableVersionControl.getClass();
                return WinterFlowTestingCloud.WinterFlowConcurrencyThread((Executor) WinterFlowVariableVersionControl);
            default:
                Object WinterFlowVariableVersionControl2 = winterFlowRequestEngine.WinterFlowVariableVersionControl(new WinterFlowValidatorProcess(WinterFlowConsumerException.class, Executor.class));
                WinterFlowVariableVersionControl2.getClass();
                return WinterFlowTestingCloud.WinterFlowConcurrencyThread((Executor) WinterFlowVariableVersionControl2);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationComponent
    public WinterFlowThreadPoolStructure WinterFlowVariableVersionControl(ContextWrapper contextWrapper, WinterFlowMicroserviceBandwidth winterFlowMicroserviceBandwidth) {
        Context context = contextWrapper;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                context = contextWrapper;
                break;
            }
            if ((context instanceof Activity) || (context instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper2 = (ContextWrapper) context;
            if (contextWrapper2.getBaseContext() == null) {
                break;
            }
            context = contextWrapper2.getBaseContext();
            context.getClass();
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            WinterFlowCacheManagerFunction.WinterFlowRouterStructure.getClass();
            int i = Build.VERSION.SDK_INT;
            return new WinterFlowThreadPoolStructure(new WinterFlowParserWebsocket((i >= 30 ? WinterFlowJavaProcessor.WinterFlowVariableVersionControl : i >= 29 ? WinterFlowRouterAdapter : i >= 28 ? WinterFlowSessionManagerProcess.WinterFlowUnitTestResponse : WinterFlowBatchUI).WinterFlowSyntax(activity)), winterFlowMicroserviceBandwidth.WinterFlowResponseEngine(activity));
        }
        if (!(context instanceof InputMethodService) && !(context instanceof Application)) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = contextWrapper.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new WinterFlowThreadPoolStructure(new Rect(0, 0, point.x, point.y), winterFlowMicroserviceBandwidth.WinterFlowResponseEngine(contextWrapper));
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationParser
    public WinterFlowCacheManagerConfiguration getLayoutDirection() {
        return WinterFlowEventEmitterController;
    }

    public String toString() {
        switch (this.WinterFlowVariableVersionControl) {
            case 27:
                return "Arrangement#SpaceBetween";
            default:
                return super.toString();
        }
    }
}
