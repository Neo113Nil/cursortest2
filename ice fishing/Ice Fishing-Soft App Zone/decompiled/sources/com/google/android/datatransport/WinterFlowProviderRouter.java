package com.google.android.datatransport;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowProviderRouter {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        r1 = r11 - r19.WinterFlowCacheManagerAgent;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        com.google.android.datatransport.WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        r1 = r19.WinterFlowRouterStructure - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005f, code lost:
    
        r1 = r9 - r19.WinterFlowArrayNetwork;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        r1 = r19.WinterFlowHookDataSource - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
    
        com.google.android.datatransport.WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0098, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean WinterFlowArrayNetwork(WinterFlowVersionParser winterFlowVersionParser, WinterFlowVersionParser winterFlowVersionParser2, WinterFlowVersionParser winterFlowVersionParser3, int i) {
        boolean WinterFlowVariableVersionControl = WinterFlowVariableVersionControl(i, winterFlowVersionParser3, winterFlowVersionParser);
        float f = winterFlowVersionParser3.WinterFlowHookDataSource;
        float f2 = winterFlowVersionParser3.WinterFlowArrayNetwork;
        float f3 = winterFlowVersionParser3.WinterFlowRouterStructure;
        float f4 = winterFlowVersionParser3.WinterFlowCacheManagerAgent;
        float f5 = winterFlowVersionParser.WinterFlowArrayNetwork;
        float f6 = winterFlowVersionParser.WinterFlowHookDataSource;
        float f7 = winterFlowVersionParser.WinterFlowCacheManagerAgent;
        float f8 = winterFlowVersionParser.WinterFlowRouterStructure;
        if (!WinterFlowVariableVersionControl && WinterFlowVariableVersionControl(i, winterFlowVersionParser2, winterFlowVersionParser)) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This function should only be used for 2-D focus search");
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void WinterFlowBandwidthObject(Context context) {
        boolean z;
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (WinterFlowFrameworkMechanism.WinterFlowTransactionManagerStrategy(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
            z = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            if (Build.VERSION.SDK_INT < 29) {
                new WinterFlowDebugConfiguration(2, context, new WinterFlowArrayEngine(), z).run();
                return;
            } else {
                WinterFlowHookProcessor.WinterFlowResponseEngine(null);
                return;
            }
        }
        z = true;
        if (Build.VERSION.SDK_INT < 29) {
        }
    }

    public static final Boolean WinterFlowBatchUI(int i, WinterFlowBandwidthTransaction winterFlowBandwidthTransaction, WinterFlowDeploymentWidget winterFlowDeploymentWidget, WinterFlowVersionParser winterFlowVersionParser) {
        int ordinal = winterFlowDeploymentWidget.WinterFlowEncryptionAdapter().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                WinterFlowDeploymentWidget WinterFlowMapperProtocol = WinterFlowCloudStack.WinterFlowMapperProtocol(winterFlowDeploymentWidget);
                if (WinterFlowMapperProtocol == null) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("ActiveParent must have a focusedChild");
                    return null;
                }
                int ordinal2 = WinterFlowMapperProtocol.WinterFlowEncryptionAdapter().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        Boolean WinterFlowBatchUI = WinterFlowBatchUI(i, winterFlowBandwidthTransaction, WinterFlowMapperProtocol, winterFlowVersionParser);
                        if (!WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowBatchUI, Boolean.FALSE)) {
                            return WinterFlowBatchUI;
                        }
                        if (winterFlowVersionParser == null) {
                            if (WinterFlowMapperProtocol.WinterFlowEncryptionAdapter() != WinterFlowProtocolCache.WinterFlowTransactionManagerStrategy) {
                                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            WinterFlowDeploymentWidget WinterFlowVariableBandwidth = WinterFlowCloudStack.WinterFlowVariableBandwidth(WinterFlowMapperProtocol);
                            if (WinterFlowVariableBandwidth == null) {
                                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("ActiveParent must have a focusedChild");
                                return null;
                            }
                            winterFlowVersionParser = WinterFlowCloudStack.WinterFlowRouterAdapter(WinterFlowVariableBandwidth);
                        }
                        return Boolean.valueOf(WinterFlowTransactionAgent(i, winterFlowBandwidthTransaction, winterFlowDeploymentWidget, winterFlowVersionParser));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                            return null;
                        }
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (winterFlowVersionParser == null) {
                    winterFlowVersionParser = WinterFlowCloudStack.WinterFlowRouterAdapter(WinterFlowMapperProtocol);
                }
                return Boolean.valueOf(WinterFlowTransactionAgent(i, winterFlowBandwidthTransaction, winterFlowDeploymentWidget, winterFlowVersionParser));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return winterFlowDeploymentWidget.WinterFlowUserManagerConcurrency().WinterFlowRouterStructure ? (Boolean) winterFlowBandwidthTransaction.WinterFlowUnitTestResponse(winterFlowDeploymentWidget) : winterFlowVersionParser == null ? Boolean.valueOf(WinterFlowResponseEngine(winterFlowDeploymentWidget, i, winterFlowBandwidthTransaction)) : Boolean.valueOf(WinterFlowVariableBandwidth(i, winterFlowBandwidthTransaction, winterFlowDeploymentWidget, winterFlowVersionParser));
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                return null;
            }
        }
        return Boolean.valueOf(WinterFlowResponseEngine(winterFlowDeploymentWidget, i, winterFlowBandwidthTransaction));
    }

    public static float WinterFlowCacheManagerAgent(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    public static final boolean WinterFlowConcurrencyThread(int i, WinterFlowVersionParser winterFlowVersionParser, WinterFlowVersionParser winterFlowVersionParser2) {
        if (i == 3) {
            float f = winterFlowVersionParser2.WinterFlowCacheManagerAgent;
            float f2 = winterFlowVersionParser2.WinterFlowRouterStructure;
            float f3 = winterFlowVersionParser.WinterFlowCacheManagerAgent;
            return (f > f3 || f2 >= f3) && f2 > winterFlowVersionParser.WinterFlowRouterStructure;
        }
        if (i == 4) {
            float f4 = winterFlowVersionParser2.WinterFlowRouterStructure;
            float f5 = winterFlowVersionParser2.WinterFlowCacheManagerAgent;
            float f6 = winterFlowVersionParser.WinterFlowRouterStructure;
            return (f4 < f6 || f5 <= f6) && f5 < winterFlowVersionParser.WinterFlowCacheManagerAgent;
        }
        if (i == 5) {
            float f7 = winterFlowVersionParser2.WinterFlowArrayNetwork;
            float f8 = winterFlowVersionParser2.WinterFlowHookDataSource;
            float f9 = winterFlowVersionParser.WinterFlowArrayNetwork;
            return (f7 > f9 || f8 >= f9) && f8 > winterFlowVersionParser.WinterFlowHookDataSource;
        }
        if (i != 6) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = winterFlowVersionParser2.WinterFlowHookDataSource;
        float f11 = winterFlowVersionParser2.WinterFlowArrayNetwork;
        float f12 = winterFlowVersionParser.WinterFlowHookDataSource;
        return (f10 < f12 || f11 <= f12) && f11 < winterFlowVersionParser.WinterFlowArrayNetwork;
    }

    public static void WinterFlowHookDataSource(StringBuilder sb, Object obj, WinterFlowObjectSession winterFlowObjectSession) {
        if (winterFlowObjectSession != null) {
            sb.append((CharSequence) winterFlowObjectSession.WinterFlowUnitTestResponse(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static final boolean WinterFlowOrchestrationSubsystem(WinterFlowVersionParser winterFlowVersionParser, WinterFlowVersionParser winterFlowVersionParser2, WinterFlowVersionParser winterFlowVersionParser3, int i) {
        if (!WinterFlowConcurrencyThread(i, winterFlowVersionParser, winterFlowVersionParser3)) {
            return false;
        }
        if (WinterFlowConcurrencyThread(i, winterFlowVersionParser2, winterFlowVersionParser3) && !WinterFlowArrayNetwork(winterFlowVersionParser3, winterFlowVersionParser, winterFlowVersionParser2, i)) {
            return !WinterFlowArrayNetwork(winterFlowVersionParser3, winterFlowVersionParser2, winterFlowVersionParser, i) && WinterFlowSingletonPlatform(i, winterFlowVersionParser3, winterFlowVersionParser) < WinterFlowSingletonPlatform(i, winterFlowVersionParser3, winterFlowVersionParser2);
        }
        return true;
    }

    public static final boolean WinterFlowResponseEngine(WinterFlowDeploymentWidget winterFlowDeploymentWidget, int i, WinterFlowObjectSession winterFlowObjectSession) {
        WinterFlowVersionParser winterFlowVersionParser;
        WinterFlowJSON winterFlowJSON = new WinterFlowJSON(new WinterFlowDeploymentWidget[16]);
        WinterFlowUnitTestResponse(winterFlowDeploymentWidget, winterFlowJSON);
        int i2 = winterFlowJSON.WinterFlowUnitTestResponse;
        if (i2 <= 1) {
            WinterFlowDeploymentWidget winterFlowDeploymentWidget2 = (WinterFlowDeploymentWidget) (i2 == 0 ? null : winterFlowJSON.WinterFlowVariableVersionControl[0]);
            if (winterFlowDeploymentWidget2 != null) {
                return ((Boolean) winterFlowObjectSession.WinterFlowUnitTestResponse(winterFlowDeploymentWidget2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                WinterFlowVersionParser WinterFlowRouterAdapter = WinterFlowCloudStack.WinterFlowRouterAdapter(winterFlowDeploymentWidget);
                float f = WinterFlowRouterAdapter.WinterFlowRouterStructure;
                float f2 = WinterFlowRouterAdapter.WinterFlowHookDataSource;
                winterFlowVersionParser = new WinterFlowVersionParser(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This function should only be used for 2-D focus search");
                    return false;
                }
                WinterFlowVersionParser WinterFlowRouterAdapter2 = WinterFlowCloudStack.WinterFlowRouterAdapter(winterFlowDeploymentWidget);
                float f3 = WinterFlowRouterAdapter2.WinterFlowCacheManagerAgent;
                float f4 = WinterFlowRouterAdapter2.WinterFlowArrayNetwork;
                winterFlowVersionParser = new WinterFlowVersionParser(f3, f4, f3, f4);
            }
            WinterFlowDeploymentWidget WinterFlowSyntax = WinterFlowSyntax(winterFlowJSON, winterFlowVersionParser, i);
            if (WinterFlowSyntax != null) {
                return ((Boolean) winterFlowObjectSession.WinterFlowUnitTestResponse(WinterFlowSyntax)).booleanValue();
            }
        }
        return false;
    }

    public static final void WinterFlowRouterRouter(WinterFlowMicroserviceHandler winterFlowMicroserviceHandler, WinterFlowRequestTool winterFlowRequestTool) {
        ArrayList arrayList = winterFlowRequestTool.WinterFlowServiceUtility;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            WinterFlowModuleSubsystem winterFlowModuleSubsystem = (WinterFlowModuleSubsystem) arrayList.get(i);
            if (winterFlowModuleSubsystem instanceof WinterFlowNetworkUnitTest) {
                WinterFlowTestingModule winterFlowTestingModule = new WinterFlowTestingModule();
                WinterFlowNetworkUnitTest winterFlowNetworkUnitTest = (WinterFlowNetworkUnitTest) winterFlowModuleSubsystem;
                winterFlowTestingModule.WinterFlowArrayNetwork = winterFlowNetworkUnitTest.WinterFlowTransactionManagerStrategy;
                winterFlowTestingModule.WinterFlowServiceUtility = true;
                winterFlowTestingModule.WinterFlowCacheManagerAgent();
                winterFlowTestingModule.WinterFlowVariableBandwidth.WinterFlowRouterStructure.setFillType(winterFlowNetworkUnitTest.WinterFlowUnitTestResponse == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                winterFlowTestingModule.WinterFlowCacheManagerAgent();
                winterFlowTestingModule.WinterFlowCacheManagerAgent();
                winterFlowTestingModule.WinterFlowHookDataSource = winterFlowNetworkUnitTest.WinterFlowRouterRouter;
                winterFlowTestingModule.WinterFlowCacheManagerAgent();
                winterFlowTestingModule.WinterFlowCacheManagerAgent = winterFlowNetworkUnitTest.WinterFlowSyntax;
                winterFlowTestingModule.WinterFlowCacheManagerAgent();
                winterFlowTestingModule.WinterFlowUnitTestResponse = winterFlowNetworkUnitTest.WinterFlowResponseEngine;
                winterFlowTestingModule.WinterFlowCacheManagerAgent();
                winterFlowTestingModule.WinterFlowVariableVersionControl = winterFlowNetworkUnitTest.WinterFlowTransactionAgent;
                winterFlowTestingModule.WinterFlowCacheManagerAgent();
                winterFlowTestingModule.WinterFlowTransactionManagerStrategy = winterFlowNetworkUnitTest.WinterFlowServerProtocol;
                winterFlowTestingModule.WinterFlowBandwidthObject = true;
                winterFlowTestingModule.WinterFlowCacheManagerAgent();
                winterFlowTestingModule.WinterFlowRouterRouter = winterFlowNetworkUnitTest.WinterFlowThreadListener;
                winterFlowTestingModule.WinterFlowBandwidthObject = true;
                winterFlowTestingModule.WinterFlowCacheManagerAgent();
                winterFlowTestingModule.WinterFlowSyntax = winterFlowNetworkUnitTest.WinterFlowServiceUtility;
                winterFlowTestingModule.WinterFlowBandwidthObject = true;
                winterFlowTestingModule.WinterFlowCacheManagerAgent();
                winterFlowTestingModule.WinterFlowResponseEngine = winterFlowNetworkUnitTest.WinterFlowBandwidthObject;
                winterFlowTestingModule.WinterFlowBandwidthObject = true;
                winterFlowTestingModule.WinterFlowCacheManagerAgent();
                winterFlowTestingModule.WinterFlowTransactionAgent = winterFlowNetworkUnitTest.WinterFlowOrchestrationSubsystem;
                winterFlowTestingModule.WinterFlowOrchestrationSubsystem = true;
                winterFlowTestingModule.WinterFlowCacheManagerAgent();
                winterFlowTestingModule.WinterFlowServerProtocol = winterFlowNetworkUnitTest.WinterFlowConcurrencyThread;
                winterFlowTestingModule.WinterFlowOrchestrationSubsystem = true;
                winterFlowTestingModule.WinterFlowCacheManagerAgent();
                winterFlowTestingModule.WinterFlowThreadListener = winterFlowNetworkUnitTest.WinterFlowSingletonPlatform;
                winterFlowTestingModule.WinterFlowOrchestrationSubsystem = true;
                winterFlowTestingModule.WinterFlowCacheManagerAgent();
                winterFlowMicroserviceHandler.WinterFlowVariableVersionControl(i, winterFlowTestingModule);
            } else if (winterFlowModuleSubsystem instanceof WinterFlowRequestTool) {
                WinterFlowMicroserviceHandler winterFlowMicroserviceHandler2 = new WinterFlowMicroserviceHandler();
                WinterFlowRequestTool winterFlowRequestTool2 = (WinterFlowRequestTool) winterFlowModuleSubsystem;
                winterFlowMicroserviceHandler2.WinterFlowTransactionAgent = winterFlowRequestTool2.WinterFlowVariableVersionControl;
                winterFlowMicroserviceHandler2.WinterFlowCacheManagerAgent();
                winterFlowMicroserviceHandler2.WinterFlowServerProtocol = winterFlowRequestTool2.WinterFlowTransactionManagerStrategy;
                winterFlowMicroserviceHandler2.WinterFlowVariableBandwidth = true;
                winterFlowMicroserviceHandler2.WinterFlowCacheManagerAgent();
                winterFlowMicroserviceHandler2.WinterFlowBandwidthObject = winterFlowRequestTool2.WinterFlowSyntax;
                winterFlowMicroserviceHandler2.WinterFlowVariableBandwidth = true;
                winterFlowMicroserviceHandler2.WinterFlowCacheManagerAgent();
                winterFlowMicroserviceHandler2.WinterFlowOrchestrationSubsystem = winterFlowRequestTool2.WinterFlowResponseEngine;
                winterFlowMicroserviceHandler2.WinterFlowVariableBandwidth = true;
                winterFlowMicroserviceHandler2.WinterFlowCacheManagerAgent();
                winterFlowMicroserviceHandler2.WinterFlowConcurrencyThread = winterFlowRequestTool2.WinterFlowTransactionAgent;
                winterFlowMicroserviceHandler2.WinterFlowVariableBandwidth = true;
                winterFlowMicroserviceHandler2.WinterFlowCacheManagerAgent();
                winterFlowMicroserviceHandler2.WinterFlowSingletonPlatform = winterFlowRequestTool2.WinterFlowServerProtocol;
                winterFlowMicroserviceHandler2.WinterFlowVariableBandwidth = true;
                winterFlowMicroserviceHandler2.WinterFlowCacheManagerAgent();
                winterFlowMicroserviceHandler2.WinterFlowThreadListener = winterFlowRequestTool2.WinterFlowUnitTestResponse;
                winterFlowMicroserviceHandler2.WinterFlowVariableBandwidth = true;
                winterFlowMicroserviceHandler2.WinterFlowCacheManagerAgent();
                winterFlowMicroserviceHandler2.WinterFlowServiceUtility = winterFlowRequestTool2.WinterFlowRouterRouter;
                winterFlowMicroserviceHandler2.WinterFlowVariableBandwidth = true;
                winterFlowMicroserviceHandler2.WinterFlowCacheManagerAgent();
                winterFlowMicroserviceHandler2.WinterFlowTransactionManagerStrategy = winterFlowRequestTool2.WinterFlowThreadListener;
                winterFlowMicroserviceHandler2.WinterFlowUnitTestResponse = true;
                winterFlowMicroserviceHandler2.WinterFlowCacheManagerAgent();
                WinterFlowRouterRouter(winterFlowMicroserviceHandler2, winterFlowRequestTool2);
                winterFlowMicroserviceHandler.WinterFlowVariableVersionControl(i, winterFlowMicroserviceHandler2);
            }
        }
    }

    public static final long WinterFlowRouterStructure(int i, int i2) {
        if (i < 0 || i2 < 0) {
            WinterFlowWorkerPipeline.WinterFlowRouterStructure("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (i2 & 4294967295L) | (i << 32);
        int i3 = WinterFlowEventProcess.WinterFlowCacheManagerAgent;
        return j;
    }

    public static final Object WinterFlowServerProtocol(WinterFlowDecoratorBackend winterFlowDecoratorBackend, WinterFlowRendererOrchestration winterFlowRendererOrchestration) {
        Object WinterFlowUnitTestResponse = winterFlowDecoratorBackend.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(winterFlowRendererOrchestration);
        if (WinterFlowUnitTestResponse == null) {
            return null;
        }
        return WinterFlowUnitTestResponse;
    }

    public static int WinterFlowServiceUtility(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject(WinterFlowResolverBackend.WinterFlowSyntax("type needs to be >= FIRST and <= LAST, type=", i));
        return 0;
    }

    public static final long WinterFlowSingletonPlatform(int i, WinterFlowVersionParser winterFlowVersionParser, WinterFlowVersionParser winterFlowVersionParser2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = winterFlowVersionParser.WinterFlowRouterStructure;
            f2 = winterFlowVersionParser2.WinterFlowCacheManagerAgent;
        } else if (i == 4) {
            f = winterFlowVersionParser2.WinterFlowRouterStructure;
            f2 = winterFlowVersionParser.WinterFlowCacheManagerAgent;
        } else if (i == 5) {
            f = winterFlowVersionParser.WinterFlowHookDataSource;
            f2 = winterFlowVersionParser2.WinterFlowArrayNetwork;
        } else {
            if (i != 6) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = winterFlowVersionParser2.WinterFlowHookDataSource;
            f2 = winterFlowVersionParser.WinterFlowArrayNetwork;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = (long) f6;
        if (i == 3 || i == 4) {
            float f7 = winterFlowVersionParser.WinterFlowHookDataSource;
            f3 = ((winterFlowVersionParser.WinterFlowArrayNetwork - f7) / 2.0f) + f7;
            f4 = winterFlowVersionParser2.WinterFlowHookDataSource;
            f5 = winterFlowVersionParser2.WinterFlowArrayNetwork;
        } else {
            if (i != 5 && i != 6) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = winterFlowVersionParser.WinterFlowRouterStructure;
            f3 = ((winterFlowVersionParser.WinterFlowCacheManagerAgent - f8) / 2.0f) + f8;
            f4 = winterFlowVersionParser2.WinterFlowRouterStructure;
            f5 = winterFlowVersionParser2.WinterFlowCacheManagerAgent;
        }
        long j2 = (long) (f3 - (((f5 - f4) / 2.0f) + f4));
        return (j2 * j2) + (13 * j * j);
    }

    public static final WinterFlowDeploymentWidget WinterFlowSyntax(WinterFlowJSON winterFlowJSON, WinterFlowVersionParser winterFlowVersionParser, int i) {
        WinterFlowVersionParser WinterFlowArrayNetwork;
        WinterFlowDeploymentWidget winterFlowDeploymentWidget = null;
        if (i == 3) {
            WinterFlowArrayNetwork = winterFlowVersionParser.WinterFlowArrayNetwork((winterFlowVersionParser.WinterFlowCacheManagerAgent - winterFlowVersionParser.WinterFlowRouterStructure) + 1.0f, 0.0f);
        } else if (i == 4) {
            WinterFlowArrayNetwork = winterFlowVersionParser.WinterFlowArrayNetwork(-((winterFlowVersionParser.WinterFlowCacheManagerAgent - winterFlowVersionParser.WinterFlowRouterStructure) + 1.0f), 0.0f);
        } else if (i == 5) {
            WinterFlowArrayNetwork = winterFlowVersionParser.WinterFlowArrayNetwork(0.0f, (winterFlowVersionParser.WinterFlowArrayNetwork - winterFlowVersionParser.WinterFlowHookDataSource) + 1.0f);
        } else {
            if (i != 6) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This function should only be used for 2-D focus search");
                return null;
            }
            WinterFlowArrayNetwork = winterFlowVersionParser.WinterFlowArrayNetwork(0.0f, -((winterFlowVersionParser.WinterFlowArrayNetwork - winterFlowVersionParser.WinterFlowHookDataSource) + 1.0f));
        }
        Object[] objArr = winterFlowJSON.WinterFlowVariableVersionControl;
        int i2 = winterFlowJSON.WinterFlowUnitTestResponse;
        for (int i3 = 0; i3 < i2; i3++) {
            WinterFlowDeploymentWidget winterFlowDeploymentWidget2 = (WinterFlowDeploymentWidget) objArr[i3];
            if (WinterFlowCloudStack.WinterFlowConfigurationSubsystem(winterFlowDeploymentWidget2)) {
                WinterFlowVersionParser WinterFlowRouterAdapter = WinterFlowCloudStack.WinterFlowRouterAdapter(winterFlowDeploymentWidget2);
                if (WinterFlowOrchestrationSubsystem(WinterFlowRouterAdapter, WinterFlowArrayNetwork, winterFlowVersionParser, i)) {
                    winterFlowDeploymentWidget = winterFlowDeploymentWidget2;
                    WinterFlowArrayNetwork = WinterFlowRouterAdapter;
                }
            }
        }
        return winterFlowDeploymentWidget;
    }

    public static final ArrayList WinterFlowThreadListener(Bundle bundle, String str) {
        ArrayList WinterFlowCacheManagerAgent = Build.VERSION.SDK_INT >= 34 ? WinterFlowBackendThreadPool.WinterFlowCacheManagerAgent(bundle, str, WinterFlowEncryptionSubsystem.WinterFlowConfigurationSubsystem(WinterFlowListenerProtocol.WinterFlowRouterStructure(Bundle.class))) : bundle.getParcelableArrayList(str);
        if (WinterFlowCacheManagerAgent != null) {
            return WinterFlowCacheManagerAgent;
        }
        WinterFlowFrameworkMechanism.WinterFlowResponseEngine(str);
        throw null;
    }

    public static final boolean WinterFlowTransactionAgent(int i, WinterFlowBandwidthTransaction winterFlowBandwidthTransaction, WinterFlowDeploymentWidget winterFlowDeploymentWidget, WinterFlowVersionParser winterFlowVersionParser) {
        if (WinterFlowVariableBandwidth(i, winterFlowBandwidthTransaction, winterFlowDeploymentWidget, winterFlowVersionParser)) {
            return true;
        }
        Boolean bool = (Boolean) WinterFlowTestingCloud.WinterFlowPackageIDE(winterFlowDeploymentWidget, i, new WinterFlowController(((WinterFlowHookMechanism) ((WinterFlowSyntaxTransactionManager) WinterFlowCloudStack.WinterFlowTestingNode(winterFlowDeploymentWidget)).getFocusOwner()).WinterFlowTransactionManagerStrategy(), winterFlowDeploymentWidget, winterFlowVersionParser, i, winterFlowBandwidthTransaction, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final int WinterFlowTransactionManagerStrategy(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void WinterFlowUnitTestResponse(WinterFlowDeploymentWidget winterFlowDeploymentWidget, WinterFlowJSON winterFlowJSON) {
        if (!winterFlowDeploymentWidget.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
            WinterFlowViewUtility.WinterFlowHookDataSource("visitChildren called on an unattached node");
        }
        WinterFlowJSON winterFlowJSON2 = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
        WinterFlowUserManagerController winterFlowUserManagerController = winterFlowDeploymentWidget.WinterFlowVariableVersionControl;
        WinterFlowUserManagerController winterFlowUserManagerController2 = winterFlowUserManagerController.WinterFlowResponseEngine;
        if (winterFlowUserManagerController2 == null) {
            WinterFlowCloudStack.WinterFlowArrayNetwork(winterFlowJSON2, winterFlowUserManagerController);
        } else {
            winterFlowJSON2.WinterFlowHookDataSource(winterFlowUserManagerController2);
        }
        while (true) {
            int i = winterFlowJSON2.WinterFlowUnitTestResponse;
            if (i == 0) {
                return;
            }
            WinterFlowUserManagerController winterFlowUserManagerController3 = (WinterFlowUserManagerController) winterFlowJSON2.WinterFlowTransactionAgent(i - 1);
            if ((winterFlowUserManagerController3.WinterFlowRouterRouter & 1024) == 0) {
                WinterFlowCloudStack.WinterFlowArrayNetwork(winterFlowJSON2, winterFlowUserManagerController3);
            } else {
                while (true) {
                    if (winterFlowUserManagerController3 == null) {
                        break;
                    }
                    if ((winterFlowUserManagerController3.WinterFlowUnitTestResponse & 1024) != 0) {
                        WinterFlowJSON winterFlowJSON3 = null;
                        while (winterFlowUserManagerController3 != null) {
                            if (winterFlowUserManagerController3 instanceof WinterFlowDeploymentWidget) {
                                WinterFlowDeploymentWidget winterFlowDeploymentWidget2 = (WinterFlowDeploymentWidget) winterFlowUserManagerController3;
                                if (winterFlowDeploymentWidget2.WinterFlowSingletonPlatform && !WinterFlowCloudStack.WinterFlowSyntaxSubsystem(winterFlowDeploymentWidget2).WinterFlowConfiguration) {
                                    if (winterFlowDeploymentWidget2.WinterFlowUserManagerConcurrency().WinterFlowRouterStructure) {
                                        winterFlowJSON.WinterFlowHookDataSource(winterFlowDeploymentWidget2);
                                    } else {
                                        WinterFlowUnitTestResponse(winterFlowDeploymentWidget2, winterFlowJSON);
                                    }
                                }
                            } else if ((winterFlowUserManagerController3.WinterFlowUnitTestResponse & 1024) != 0 && (winterFlowUserManagerController3 instanceof WinterFlowTestingEntity)) {
                                int i2 = 0;
                                for (WinterFlowUserManagerController winterFlowUserManagerController4 = ((WinterFlowTestingEntity) winterFlowUserManagerController3).WinterFlowBatchUI; winterFlowUserManagerController4 != null; winterFlowUserManagerController4 = winterFlowUserManagerController4.WinterFlowResponseEngine) {
                                    if ((winterFlowUserManagerController4.WinterFlowUnitTestResponse & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            winterFlowUserManagerController3 = winterFlowUserManagerController4;
                                        } else {
                                            if (winterFlowJSON3 == null) {
                                                winterFlowJSON3 = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                            }
                                            if (winterFlowUserManagerController3 != null) {
                                                winterFlowJSON3.WinterFlowHookDataSource(winterFlowUserManagerController3);
                                                winterFlowUserManagerController3 = null;
                                            }
                                            winterFlowJSON3.WinterFlowHookDataSource(winterFlowUserManagerController4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            winterFlowUserManagerController3 = WinterFlowCloudStack.WinterFlowPackageIDE(winterFlowJSON3);
                        }
                    } else {
                        winterFlowUserManagerController3 = winterFlowUserManagerController3.WinterFlowResponseEngine;
                    }
                }
            }
        }
    }

    public static final boolean WinterFlowVariableBandwidth(int i, WinterFlowBandwidthTransaction winterFlowBandwidthTransaction, WinterFlowDeploymentWidget winterFlowDeploymentWidget, WinterFlowVersionParser winterFlowVersionParser) {
        WinterFlowDeploymentWidget WinterFlowSyntax;
        WinterFlowJSON winterFlowJSON = new WinterFlowJSON(new WinterFlowDeploymentWidget[16]);
        if (!winterFlowDeploymentWidget.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
            WinterFlowViewUtility.WinterFlowHookDataSource("visitChildren called on an unattached node");
        }
        WinterFlowJSON winterFlowJSON2 = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
        WinterFlowUserManagerController winterFlowUserManagerController = winterFlowDeploymentWidget.WinterFlowVariableVersionControl;
        WinterFlowUserManagerController winterFlowUserManagerController2 = winterFlowUserManagerController.WinterFlowResponseEngine;
        if (winterFlowUserManagerController2 == null) {
            WinterFlowCloudStack.WinterFlowArrayNetwork(winterFlowJSON2, winterFlowUserManagerController);
        } else {
            winterFlowJSON2.WinterFlowHookDataSource(winterFlowUserManagerController2);
        }
        while (true) {
            int i2 = winterFlowJSON2.WinterFlowUnitTestResponse;
            if (i2 == 0) {
                break;
            }
            WinterFlowUserManagerController winterFlowUserManagerController3 = (WinterFlowUserManagerController) winterFlowJSON2.WinterFlowTransactionAgent(i2 - 1);
            if ((winterFlowUserManagerController3.WinterFlowRouterRouter & 1024) == 0) {
                WinterFlowCloudStack.WinterFlowArrayNetwork(winterFlowJSON2, winterFlowUserManagerController3);
            } else {
                while (true) {
                    if (winterFlowUserManagerController3 == null) {
                        break;
                    }
                    if ((winterFlowUserManagerController3.WinterFlowUnitTestResponse & 1024) != 0) {
                        WinterFlowJSON winterFlowJSON3 = null;
                        while (winterFlowUserManagerController3 != null) {
                            if (winterFlowUserManagerController3 instanceof WinterFlowDeploymentWidget) {
                                WinterFlowDeploymentWidget winterFlowDeploymentWidget2 = (WinterFlowDeploymentWidget) winterFlowUserManagerController3;
                                if (winterFlowDeploymentWidget2.WinterFlowSingletonPlatform) {
                                    winterFlowJSON.WinterFlowHookDataSource(winterFlowDeploymentWidget2);
                                }
                            } else if ((winterFlowUserManagerController3.WinterFlowUnitTestResponse & 1024) != 0 && (winterFlowUserManagerController3 instanceof WinterFlowTestingEntity)) {
                                int i3 = 0;
                                for (WinterFlowUserManagerController winterFlowUserManagerController4 = ((WinterFlowTestingEntity) winterFlowUserManagerController3).WinterFlowBatchUI; winterFlowUserManagerController4 != null; winterFlowUserManagerController4 = winterFlowUserManagerController4.WinterFlowResponseEngine) {
                                    if ((winterFlowUserManagerController4.WinterFlowUnitTestResponse & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            winterFlowUserManagerController3 = winterFlowUserManagerController4;
                                        } else {
                                            if (winterFlowJSON3 == null) {
                                                winterFlowJSON3 = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                            }
                                            if (winterFlowUserManagerController3 != null) {
                                                winterFlowJSON3.WinterFlowHookDataSource(winterFlowUserManagerController3);
                                                winterFlowUserManagerController3 = null;
                                            }
                                            winterFlowJSON3.WinterFlowHookDataSource(winterFlowUserManagerController4);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            winterFlowUserManagerController3 = WinterFlowCloudStack.WinterFlowPackageIDE(winterFlowJSON3);
                        }
                    } else {
                        winterFlowUserManagerController3 = winterFlowUserManagerController3.WinterFlowResponseEngine;
                    }
                }
            }
        }
        while (winterFlowJSON.WinterFlowUnitTestResponse != 0 && (WinterFlowSyntax = WinterFlowSyntax(winterFlowJSON, winterFlowVersionParser, i)) != null) {
            if (WinterFlowSyntax.WinterFlowUserManagerConcurrency().WinterFlowRouterStructure) {
                return ((Boolean) winterFlowBandwidthTransaction.WinterFlowUnitTestResponse(WinterFlowSyntax)).booleanValue();
            }
            if (WinterFlowTransactionAgent(i, winterFlowBandwidthTransaction, WinterFlowSyntax, winterFlowVersionParser)) {
                return true;
            }
            winterFlowJSON.WinterFlowResponseEngine(WinterFlowSyntax);
        }
        return false;
    }

    public static final boolean WinterFlowVariableVersionControl(int i, WinterFlowVersionParser winterFlowVersionParser, WinterFlowVersionParser winterFlowVersionParser2) {
        if (i == 3 || i == 4) {
            return winterFlowVersionParser.WinterFlowArrayNetwork > winterFlowVersionParser2.WinterFlowHookDataSource && winterFlowVersionParser.WinterFlowHookDataSource < winterFlowVersionParser2.WinterFlowArrayNetwork;
        }
        if (i == 5 || i == 6) {
            return winterFlowVersionParser.WinterFlowCacheManagerAgent > winterFlowVersionParser2.WinterFlowRouterStructure && winterFlowVersionParser.WinterFlowRouterStructure < winterFlowVersionParser2.WinterFlowCacheManagerAgent;
        }
        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This function should only be used for 2-D focus search");
        return false;
    }
}
