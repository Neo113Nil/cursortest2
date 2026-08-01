package com.google.android.datatransport;

import com.icewinter.flow.winter.icecatch.db.AppDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowGatewaySession {
    public static final String[] WinterFlowServerProtocol = {"INSERT", "UPDATE", "DELETE"};
    public final boolean WinterFlowArrayNetwork;
    public final LinkedHashMap WinterFlowCacheManagerAgent;
    public final LinkedHashMap WinterFlowHookDataSource;
    public final WinterFlowSerializerComponent WinterFlowRouterRouter;
    public final AppDatabase_Impl WinterFlowRouterStructure;
    public final WinterFlowHandlerStructure WinterFlowSyntax;
    public final String[] WinterFlowUnitTestResponse;
    public final WinterFlowFrameworkCache WinterFlowVariableVersionControl;
    public final AtomicBoolean WinterFlowResponseEngine = new AtomicBoolean(false);
    public WinterFlowObjectUI WinterFlowTransactionAgent = new WinterFlowDeploymentEngine(8);
    public final LinkedHashMap WinterFlowTransactionManagerStrategy = new LinkedHashMap();

    public WinterFlowGatewaySession(AppDatabase_Impl appDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z, WinterFlowFrameworkCache winterFlowFrameworkCache) {
        String str;
        this.WinterFlowRouterStructure = appDatabase_Impl;
        this.WinterFlowHookDataSource = linkedHashMap;
        this.WinterFlowCacheManagerAgent = linkedHashMap2;
        this.WinterFlowArrayNetwork = z;
        this.WinterFlowVariableVersionControl = winterFlowFrameworkCache;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            this.WinterFlowTransactionManagerStrategy.put(lowerCase, Integer.valueOf(i));
            String str3 = (String) this.WinterFlowHookDataSource.get(strArr[i]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                str.getClass();
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.WinterFlowUnitTestResponse = strArr2;
        for (Map.Entry entry : this.WinterFlowHookDataSource.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase2 = str4.toLowerCase(locale2);
            lowerCase2.getClass();
            if (this.WinterFlowTransactionManagerStrategy.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase3.getClass();
                LinkedHashMap linkedHashMap3 = this.WinterFlowTransactionManagerStrategy;
                linkedHashMap3.put(lowerCase3, WinterFlowDataSourceUtility.WinterFlowCompilerDataSource(linkedHashMap3, lowerCase2));
            }
        }
        this.WinterFlowRouterRouter = new WinterFlowSerializerComponent(this.WinterFlowUnitTestResponse.length);
        this.WinterFlowSyntax = new WinterFlowHandlerStructure(this.WinterFlowUnitTestResponse.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.google.android.datatransport.WinterFlowJavaDeployment] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0089 -> B:10:0x008c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowArrayNetwork(WinterFlowRequestProvider winterFlowRequestProvider, int i, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowAlgorithmSingleton winterFlowAlgorithmSingleton;
        int i2;
        String str;
        int i3;
        WinterFlowRequestProvider winterFlowRequestProvider2;
        int i4;
        String[] strArr;
        if (winterFlowOrchestrationCompiler instanceof WinterFlowAlgorithmSingleton) {
            winterFlowAlgorithmSingleton = (WinterFlowAlgorithmSingleton) winterFlowOrchestrationCompiler;
            int i5 = winterFlowAlgorithmSingleton.WinterFlowBandwidthObject;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                winterFlowAlgorithmSingleton.WinterFlowBandwidthObject = i5 - Integer.MIN_VALUE;
                Object obj = winterFlowAlgorithmSingleton.WinterFlowThreadListener;
                i2 = winterFlowAlgorithmSingleton.WinterFlowBandwidthObject;
                if (i2 != 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    str = this.WinterFlowUnitTestResponse[i];
                    i3 = 3;
                    winterFlowRequestProvider2 = winterFlowRequestProvider;
                    i4 = 0;
                    strArr = WinterFlowServerProtocol;
                    if (i4 < i3) {
                    }
                } else {
                    if (i2 != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = winterFlowAlgorithmSingleton.WinterFlowServerProtocol;
                    i4 = winterFlowAlgorithmSingleton.WinterFlowTransactionAgent;
                    String[] strArr2 = winterFlowAlgorithmSingleton.WinterFlowResponseEngine;
                    str = winterFlowAlgorithmSingleton.WinterFlowSyntax;
                    ?? r3 = winterFlowAlgorithmSingleton.WinterFlowRouterRouter;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    strArr = strArr2;
                    winterFlowRequestProvider2 = r3;
                    i4++;
                    if (i4 < i3) {
                        String str2 = "DROP TRIGGER IF EXISTS `" + ("room_table_modification_trigger_" + str + '_' + strArr[i4]) + '`';
                        winterFlowAlgorithmSingleton.WinterFlowRouterRouter = winterFlowRequestProvider2;
                        winterFlowAlgorithmSingleton.WinterFlowSyntax = str;
                        winterFlowAlgorithmSingleton.WinterFlowResponseEngine = strArr;
                        winterFlowAlgorithmSingleton.WinterFlowTransactionAgent = i4;
                        winterFlowAlgorithmSingleton.WinterFlowServerProtocol = i3;
                        winterFlowAlgorithmSingleton.WinterFlowBandwidthObject = 1;
                        Object WinterFlowResponseEngine = WinterFlowNodeVersion.WinterFlowResponseEngine(winterFlowRequestProvider2, str2, winterFlowAlgorithmSingleton);
                        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                        if (WinterFlowResponseEngine == winterFlowListenerJava) {
                            return winterFlowListenerJava;
                        }
                        i4++;
                        if (i4 < i3) {
                            return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                        }
                    }
                }
            }
        }
        winterFlowAlgorithmSingleton = new WinterFlowAlgorithmSingleton(this, winterFlowOrchestrationCompiler);
        Object obj2 = winterFlowAlgorithmSingleton.WinterFlowThreadListener;
        i2 = winterFlowAlgorithmSingleton.WinterFlowBandwidthObject;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e1, code lost:
    
        if (com.google.android.datatransport.WinterFlowNodeVersion.WinterFlowResponseEngine(r7, r15, r0) == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e3, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        if (r15 == r4) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r13v5, types: [com.google.android.datatransport.WinterFlowJavaDeployment] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00e1 -> B:11:0x00e4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowCacheManagerAgent(WinterFlowRequestProvider winterFlowRequestProvider, int i, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowAdapterSession winterFlowAdapterSession;
        int i2;
        WinterFlowRequestProvider winterFlowRequestProvider2;
        int i3;
        int i4;
        String[] strArr;
        WinterFlowJavaDeployment winterFlowJavaDeployment;
        int i5;
        String str;
        if (winterFlowOrchestrationCompiler instanceof WinterFlowAdapterSession) {
            winterFlowAdapterSession = (WinterFlowAdapterSession) winterFlowOrchestrationCompiler;
            int i6 = winterFlowAdapterSession.WinterFlowOrchestrationSubsystem;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                winterFlowAdapterSession.WinterFlowOrchestrationSubsystem = i6 - Integer.MIN_VALUE;
                Object obj = winterFlowAdapterSession.WinterFlowServiceUtility;
                i2 = winterFlowAdapterSession.WinterFlowOrchestrationSubsystem;
                WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                if (i2 != 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    winterFlowAdapterSession.WinterFlowRouterRouter = winterFlowRequestProvider;
                    winterFlowAdapterSession.WinterFlowTransactionAgent = i;
                    winterFlowAdapterSession.WinterFlowOrchestrationSubsystem = 1;
                    Object WinterFlowResponseEngine = WinterFlowNodeVersion.WinterFlowResponseEngine(winterFlowRequestProvider, "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)", winterFlowAdapterSession);
                    winterFlowRequestProvider2 = winterFlowRequestProvider;
                } else if (i2 == 1) {
                    i = winterFlowAdapterSession.WinterFlowTransactionAgent;
                    ?? r13 = winterFlowAdapterSession.WinterFlowRouterRouter;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    winterFlowRequestProvider2 = r13;
                } else {
                    if (i2 != 2) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5 = winterFlowAdapterSession.WinterFlowThreadListener;
                    i4 = winterFlowAdapterSession.WinterFlowServerProtocol;
                    i3 = winterFlowAdapterSession.WinterFlowTransactionAgent;
                    strArr = winterFlowAdapterSession.WinterFlowResponseEngine;
                    str = winterFlowAdapterSession.WinterFlowSyntax;
                    winterFlowJavaDeployment = winterFlowAdapterSession.WinterFlowRouterRouter;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    i4++;
                    if (i4 >= i5) {
                        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                    }
                    String str2 = strArr[i4];
                    String str3 = "CREATE " + (this.WinterFlowArrayNetwork ? "TEMP" : "") + " TRIGGER IF NOT EXISTS `" + ("room_table_modification_trigger_" + str + '_' + str2) + "` AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i3 + " AND invalidated = 0; END";
                    winterFlowAdapterSession.WinterFlowRouterRouter = winterFlowJavaDeployment;
                    winterFlowAdapterSession.WinterFlowSyntax = str;
                    winterFlowAdapterSession.WinterFlowResponseEngine = strArr;
                    winterFlowAdapterSession.WinterFlowTransactionAgent = i3;
                    winterFlowAdapterSession.WinterFlowServerProtocol = i4;
                    winterFlowAdapterSession.WinterFlowThreadListener = i5;
                    winterFlowAdapterSession.WinterFlowOrchestrationSubsystem = 2;
                }
                String str4 = this.WinterFlowUnitTestResponse[i];
                i3 = i;
                i4 = 0;
                strArr = WinterFlowServerProtocol;
                winterFlowJavaDeployment = winterFlowRequestProvider2;
                i5 = 3;
                str = str4;
                if (i4 >= i5) {
                }
            }
        }
        winterFlowAdapterSession = new WinterFlowAdapterSession(this, winterFlowOrchestrationCompiler);
        Object obj2 = winterFlowAdapterSession.WinterFlowServiceUtility;
        i2 = winterFlowAdapterSession.WinterFlowOrchestrationSubsystem;
        WinterFlowListenerJava winterFlowListenerJava2 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        if (i2 != 0) {
        }
        String str42 = this.WinterFlowUnitTestResponse[i];
        i3 = i;
        i4 = 0;
        strArr = WinterFlowServerProtocol;
        winterFlowJavaDeployment = winterFlowRequestProvider2;
        i5 = 3;
        str = str42;
        if (i4 >= i5) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007d A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:11:0x0025, B:12:0x0072, B:14:0x007d, B:17:0x00b3, B:19:0x0089, B:20:0x008b, B:22:0x0098, B:24:0x00a2, B:26:0x00a8, B:27:0x00a6, B:30:0x00ad), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowHookDataSource(WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowValidatorLayer winterFlowValidatorLayer;
        int i;
        WinterFlowAlgorithmArray winterFlowAlgorithmArray;
        Set set;
        Object value;
        int[] iArr;
        if (winterFlowOrchestrationCompiler instanceof WinterFlowValidatorLayer) {
            winterFlowValidatorLayer = (WinterFlowValidatorLayer) winterFlowOrchestrationCompiler;
            int i2 = winterFlowValidatorLayer.WinterFlowTransactionAgent;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                winterFlowValidatorLayer.WinterFlowTransactionAgent = i2 - Integer.MIN_VALUE;
                Object obj = winterFlowValidatorLayer.WinterFlowSyntax;
                i = winterFlowValidatorLayer.WinterFlowTransactionAgent;
                WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = null;
                int i3 = 1;
                if (i != 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    AppDatabase_Impl appDatabase_Impl = this.WinterFlowRouterStructure;
                    WinterFlowAlgorithmArray winterFlowAlgorithmArray2 = appDatabase_Impl.WinterFlowUnitTestResponse;
                    boolean WinterFlowThreadListener = winterFlowAlgorithmArray2.WinterFlowThreadListener();
                    WinterFlowCacheTool winterFlowCacheTool = WinterFlowCacheTool.WinterFlowVariableVersionControl;
                    if (!WinterFlowThreadListener) {
                        return winterFlowCacheTool;
                    }
                    try {
                        if (!this.WinterFlowResponseEngine.compareAndSet(true, false)) {
                            winterFlowAlgorithmArray2.WinterFlowStrategyTool();
                            return winterFlowCacheTool;
                        }
                        if (!((Boolean) this.WinterFlowTransactionAgent.WinterFlowRouterStructure()).booleanValue()) {
                            winterFlowAlgorithmArray2.WinterFlowStrategyTool();
                            return winterFlowCacheTool;
                        }
                        WinterFlowDatabaseSchemaAgent winterFlowDatabaseSchemaAgent = new WinterFlowDatabaseSchemaAgent(this, winterFlowTransactionManagerLayer, i3);
                        winterFlowValidatorLayer.WinterFlowRouterRouter = winterFlowAlgorithmArray2;
                        winterFlowValidatorLayer.WinterFlowTransactionAgent = 1;
                        obj = appDatabase_Impl.WinterFlowResponseEngine(false, winterFlowDatabaseSchemaAgent, winterFlowValidatorLayer);
                        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                        if (obj == winterFlowListenerJava) {
                            return winterFlowListenerJava;
                        }
                        winterFlowAlgorithmArray = winterFlowAlgorithmArray2;
                    } catch (Throwable th) {
                        th = th;
                        winterFlowAlgorithmArray = winterFlowAlgorithmArray2;
                        winterFlowAlgorithmArray.WinterFlowStrategyTool();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    winterFlowAlgorithmArray = winterFlowValidatorLayer.WinterFlowRouterRouter;
                    try {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        winterFlowAlgorithmArray.WinterFlowStrategyTool();
                        throw th;
                    }
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    WinterFlowHandlerStructure winterFlowHandlerStructure = this.WinterFlowSyntax;
                    set.getClass();
                    if (!set.isEmpty()) {
                        WinterFlowHandlerPlatform winterFlowHandlerPlatform = winterFlowHandlerStructure.WinterFlowRouterStructure;
                        do {
                            value = winterFlowHandlerPlatform.getValue();
                            int[] iArr2 = (int[]) value;
                            int length = iArr2.length;
                            iArr = new int[length];
                            for (int i4 = 0; i4 < length; i4++) {
                                iArr[i4] = set.contains(Integer.valueOf(i4)) ? iArr2[i4] + 1 : iArr2[i4];
                            }
                        } while (!winterFlowHandlerPlatform.WinterFlowSyntax(value, iArr));
                    }
                    this.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(set);
                }
                winterFlowAlgorithmArray.WinterFlowStrategyTool();
                return set;
            }
        }
        winterFlowValidatorLayer = new WinterFlowValidatorLayer(this, winterFlowOrchestrationCompiler);
        Object obj2 = winterFlowValidatorLayer.WinterFlowSyntax;
        i = winterFlowValidatorLayer.WinterFlowTransactionAgent;
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer2 = null;
        int i32 = 1;
        if (i != 0) {
        }
        set = (Set) obj2;
        if (!set.isEmpty()) {
        }
        winterFlowAlgorithmArray.WinterFlowStrategyTool();
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r4 == r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowRouterStructure(WinterFlowJavaDeployment winterFlowJavaDeployment, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowVariableSession winterFlowVariableSession;
        int i;
        Set set;
        if (winterFlowOrchestrationCompiler instanceof WinterFlowVariableSession) {
            winterFlowVariableSession = (WinterFlowVariableSession) winterFlowOrchestrationCompiler;
            int i2 = winterFlowVariableSession.WinterFlowTransactionAgent;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                winterFlowVariableSession.WinterFlowTransactionAgent = i2 - Integer.MIN_VALUE;
                Object obj = winterFlowVariableSession.WinterFlowSyntax;
                i = winterFlowVariableSession.WinterFlowTransactionAgent;
                WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                if (i != 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowSessionManagerAgent winterFlowSessionManagerAgent = new WinterFlowSessionManagerAgent(27);
                    winterFlowVariableSession.WinterFlowRouterRouter = winterFlowJavaDeployment;
                    winterFlowVariableSession.WinterFlowTransactionAgent = 1;
                    obj = winterFlowJavaDeployment.WinterFlowRouterStructure("SELECT * FROM room_table_modification_log WHERE invalidated = 1", winterFlowSessionManagerAgent, winterFlowVariableSession);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Set set2 = (Set) winterFlowVariableSession.WinterFlowRouterRouter;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        return set2;
                    }
                    winterFlowJavaDeployment = (WinterFlowJavaDeployment) winterFlowVariableSession.WinterFlowRouterRouter;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    winterFlowVariableSession.WinterFlowRouterRouter = set;
                    winterFlowVariableSession.WinterFlowTransactionAgent = 2;
                    if (WinterFlowNodeVersion.WinterFlowResponseEngine(winterFlowJavaDeployment, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", winterFlowVariableSession) == winterFlowListenerJava) {
                        return winterFlowListenerJava;
                    }
                }
                return set;
            }
        }
        winterFlowVariableSession = new WinterFlowVariableSession(this, winterFlowOrchestrationCompiler);
        Object obj2 = winterFlowVariableSession.WinterFlowSyntax;
        i = winterFlowVariableSession.WinterFlowTransactionAgent;
        WinterFlowListenerJava winterFlowListenerJava2 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        if (i != 0) {
        }
        set = (Set) obj2;
        if (!set.isEmpty()) {
        }
        return set;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowVariableVersionControl(WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowQueryWidget winterFlowQueryWidget;
        int i;
        WinterFlowAlgorithmArray winterFlowAlgorithmArray;
        if (winterFlowOrchestrationCompiler instanceof WinterFlowQueryWidget) {
            winterFlowQueryWidget = (WinterFlowQueryWidget) winterFlowOrchestrationCompiler;
            int i2 = winterFlowQueryWidget.WinterFlowTransactionAgent;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                winterFlowQueryWidget.WinterFlowTransactionAgent = i2 - Integer.MIN_VALUE;
                Object obj = winterFlowQueryWidget.WinterFlowSyntax;
                i = winterFlowQueryWidget.WinterFlowTransactionAgent;
                WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = null;
                if (i != 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    AppDatabase_Impl appDatabase_Impl = this.WinterFlowRouterStructure;
                    WinterFlowAlgorithmArray winterFlowAlgorithmArray2 = appDatabase_Impl.WinterFlowUnitTestResponse;
                    if (winterFlowAlgorithmArray2.WinterFlowThreadListener()) {
                        try {
                            WinterFlowMapperJava winterFlowMapperJava = new WinterFlowMapperJava(this, winterFlowTransactionManagerLayer, 18);
                            winterFlowQueryWidget.WinterFlowRouterRouter = winterFlowAlgorithmArray2;
                            winterFlowQueryWidget.WinterFlowTransactionAgent = 1;
                            Object WinterFlowResponseEngine = appDatabase_Impl.WinterFlowResponseEngine(false, winterFlowMapperJava, winterFlowQueryWidget);
                            WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                            if (WinterFlowResponseEngine == winterFlowListenerJava) {
                                return winterFlowListenerJava;
                            }
                            winterFlowAlgorithmArray = winterFlowAlgorithmArray2;
                        } catch (Throwable th) {
                            th = th;
                            winterFlowAlgorithmArray = winterFlowAlgorithmArray2;
                            winterFlowAlgorithmArray.WinterFlowStrategyTool();
                            throw th;
                        }
                    }
                    return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                }
                if (i != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                winterFlowAlgorithmArray = winterFlowQueryWidget.WinterFlowRouterRouter;
                try {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                } catch (Throwable th2) {
                    th = th2;
                    winterFlowAlgorithmArray.WinterFlowStrategyTool();
                    throw th;
                }
                winterFlowAlgorithmArray.WinterFlowStrategyTool();
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            }
        }
        winterFlowQueryWidget = new WinterFlowQueryWidget(this, winterFlowOrchestrationCompiler);
        Object obj2 = winterFlowQueryWidget.WinterFlowSyntax;
        i = winterFlowQueryWidget.WinterFlowTransactionAgent;
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer2 = null;
        if (i != 0) {
        }
        winterFlowAlgorithmArray.WinterFlowStrategyTool();
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }
}
