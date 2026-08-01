package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServerFrontend extends WinterFlowFrameworkController implements WinterFlowEventEvent {
    public Object WinterFlowBandwidthObject;
    public final /* synthetic */ Object WinterFlowOrchestrationSubsystem;
    public int WinterFlowResponseEngine;
    public int WinterFlowRouterRouter;
    public long WinterFlowServerProtocol;
    public /* synthetic */ Object WinterFlowServiceUtility;
    public int WinterFlowSyntax;
    public int WinterFlowThreadListener;
    public int WinterFlowTransactionAgent;
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public long[] WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowServerFrontend(Object obj, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i) {
        super(winterFlowTransactionManagerLayer);
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowOrchestrationSubsystem = obj;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        int i = this.WinterFlowTransactionManagerStrategy;
        Object obj2 = this.WinterFlowOrchestrationSubsystem;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowServerFrontend winterFlowServerFrontend = new WinterFlowServerFrontend((WinterFlowJavaScript) obj2, winterFlowTransactionManagerLayer, 0);
                winterFlowServerFrontend.WinterFlowServiceUtility = obj;
                return winterFlowServerFrontend;
            case 1:
                WinterFlowServerFrontend winterFlowServerFrontend2 = new WinterFlowServerFrontend((WinterFlowJavaScript) obj2, winterFlowTransactionManagerLayer, 1);
                winterFlowServerFrontend2.WinterFlowServiceUtility = obj;
                return winterFlowServerFrontend2;
            case 2:
                WinterFlowServerFrontend winterFlowServerFrontend3 = new WinterFlowServerFrontend((WinterFlowRuntimeNetwork) obj2, winterFlowTransactionManagerLayer, 2);
                winterFlowServerFrontend3.WinterFlowServiceUtility = obj;
                return winterFlowServerFrontend3;
            default:
                WinterFlowServerFrontend winterFlowServerFrontend4 = new WinterFlowServerFrontend((WinterFlowCacheManagerGateway) obj2, winterFlowTransactionManagerLayer, 3);
                winterFlowServerFrontend4.WinterFlowServiceUtility = obj;
                return winterFlowServerFrontend4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0084 -> B:7:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006d -> B:16:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006f -> B:8:0x007e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0117 -> B:29:0x0135). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00fe -> B:37:0x013e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0100 -> B:30:0x0111). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01a9 -> B:50:0x01c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0190 -> B:58:0x01d0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0192 -> B:51:0x01a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x023b -> B:71:0x0266). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0221 -> B:79:0x0270). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0223 -> B:72:0x0235). Please report as a decompilation issue!!! */
    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowServiceUtility(Object obj) {
        WinterFlowAPIProcess winterFlowAPIProcess;
        WinterFlowJavaScript winterFlowJavaScript;
        long[] jArr;
        int length;
        int i;
        long j;
        WinterFlowAPIProcess winterFlowAPIProcess2;
        Object[] objArr;
        long[] jArr2;
        int length2;
        int i2;
        long j2;
        WinterFlowAPIProcess winterFlowAPIProcess3;
        Object[] objArr2;
        long[] jArr3;
        int length3;
        int i3;
        long j3;
        long j4;
        char c;
        WinterFlowAPIProcess winterFlowAPIProcess4;
        Object[] objArr3;
        long[] jArr4;
        int length4;
        int i4;
        long j5;
        int i5 = this.WinterFlowTransactionManagerStrategy;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        Object obj2 = this.WinterFlowOrchestrationSubsystem;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        switch (i5) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i6 = this.WinterFlowThreadListener;
                if (i6 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    winterFlowAPIProcess = (WinterFlowAPIProcess) this.WinterFlowServiceUtility;
                    winterFlowJavaScript = (WinterFlowJavaScript) obj2;
                    jArr = winterFlowJavaScript.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure;
                    length = jArr.length - 2;
                    if (length >= 0) {
                        i = 0;
                        j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        }
                        if (i != length) {
                        }
                    }
                } else if (i6 != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    int i7 = this.WinterFlowTransactionAgent;
                    int i8 = this.WinterFlowResponseEngine;
                    long j6 = this.WinterFlowServerProtocol;
                    int i9 = this.WinterFlowSyntax;
                    int i10 = this.WinterFlowRouterRouter;
                    long[] jArr5 = this.WinterFlowUnitTestResponse;
                    WinterFlowJavaScript winterFlowJavaScript2 = (WinterFlowJavaScript) this.WinterFlowBandwidthObject;
                    WinterFlowAPIProcess winterFlowAPIProcess5 = (WinterFlowAPIProcess) this.WinterFlowServiceUtility;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    j6 >>= 8;
                    i7++;
                    if (i7 < i8) {
                        if (i8 == 8) {
                            i = i9;
                            length = i10;
                            jArr = jArr5;
                            winterFlowJavaScript = winterFlowJavaScript2;
                            winterFlowAPIProcess = winterFlowAPIProcess5;
                            if (i != length) {
                                i++;
                                j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    winterFlowAPIProcess5 = winterFlowAPIProcess;
                                    i7 = 0;
                                    jArr5 = jArr;
                                    i8 = 8 - ((~(i - length)) >>> 31);
                                    winterFlowJavaScript2 = winterFlowJavaScript;
                                    i10 = length;
                                    i9 = i;
                                    j6 = j;
                                    if (i7 < i8) {
                                        if ((j6 & 255) < 128) {
                                            int i11 = (i9 << 3) + i7;
                                            WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = winterFlowJavaScript2.WinterFlowTransactionManagerStrategy;
                                            WinterFlowCompilerHook winterFlowCompilerHook = new WinterFlowCompilerHook(1, winterFlowDatabaseSchemaStructure.WinterFlowHookDataSource[i11], winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent[i11]);
                                            this.WinterFlowServiceUtility = winterFlowAPIProcess5;
                                            this.WinterFlowBandwidthObject = winterFlowJavaScript2;
                                            this.WinterFlowUnitTestResponse = jArr5;
                                            this.WinterFlowRouterRouter = i10;
                                            this.WinterFlowSyntax = i9;
                                            this.WinterFlowServerProtocol = j6;
                                            this.WinterFlowResponseEngine = i8;
                                            this.WinterFlowTransactionAgent = i7;
                                            this.WinterFlowThreadListener = 1;
                                            winterFlowAPIProcess5.WinterFlowHookDataSource(winterFlowCompilerHook, this);
                                            break;
                                        }
                                        j6 >>= 8;
                                        i7++;
                                        if (i7 < i8) {
                                        }
                                    }
                                }
                                if (i != length) {
                                }
                            }
                        }
                    }
                }
                break;
            case 1:
                int i12 = this.WinterFlowThreadListener;
                if (i12 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    winterFlowAPIProcess2 = (WinterFlowAPIProcess) this.WinterFlowServiceUtility;
                    WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure2 = ((WinterFlowJavaScript) obj2).WinterFlowTransactionManagerStrategy;
                    objArr = winterFlowDatabaseSchemaStructure2.WinterFlowHookDataSource;
                    jArr2 = winterFlowDatabaseSchemaStructure2.WinterFlowRouterStructure;
                    length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        i2 = 0;
                        j2 = jArr2[i2];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        }
                        if (i2 != length2) {
                        }
                    }
                } else if (i12 != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    int i13 = this.WinterFlowTransactionAgent;
                    int i14 = this.WinterFlowResponseEngine;
                    long j7 = this.WinterFlowServerProtocol;
                    i2 = this.WinterFlowSyntax;
                    int i15 = this.WinterFlowRouterRouter;
                    long[] jArr6 = this.WinterFlowUnitTestResponse;
                    Object[] objArr4 = (Object[]) this.WinterFlowBandwidthObject;
                    WinterFlowAPIProcess winterFlowAPIProcess6 = (WinterFlowAPIProcess) this.WinterFlowServiceUtility;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    j7 >>= 8;
                    i13++;
                    if (i13 < i14) {
                        if (i14 == 8) {
                            length2 = i15;
                            jArr2 = jArr6;
                            objArr = objArr4;
                            winterFlowAPIProcess2 = winterFlowAPIProcess6;
                            if (i2 != length2) {
                                i2++;
                                j2 = jArr2[i2];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    winterFlowAPIProcess6 = winterFlowAPIProcess2;
                                    i13 = 0;
                                    jArr6 = jArr2;
                                    i15 = length2;
                                    i14 = 8 - ((~(i2 - length2)) >>> 31);
                                    objArr4 = objArr;
                                    j7 = j2;
                                    if (i13 < i14) {
                                        if ((j7 & 255) < 128) {
                                            Object obj3 = objArr4[(i2 << 3) + i13];
                                            this.WinterFlowServiceUtility = winterFlowAPIProcess6;
                                            this.WinterFlowBandwidthObject = objArr4;
                                            this.WinterFlowUnitTestResponse = jArr6;
                                            this.WinterFlowRouterRouter = i15;
                                            this.WinterFlowSyntax = i2;
                                            this.WinterFlowServerProtocol = j7;
                                            this.WinterFlowResponseEngine = i14;
                                            this.WinterFlowTransactionAgent = i13;
                                            this.WinterFlowThreadListener = 1;
                                            winterFlowAPIProcess6.WinterFlowHookDataSource(obj3, this);
                                            break;
                                        }
                                        j7 >>= 8;
                                        i13++;
                                        if (i13 < i14) {
                                        }
                                    }
                                }
                                if (i2 != length2) {
                                }
                            }
                        }
                    }
                }
                break;
            case 2:
                int i16 = this.WinterFlowThreadListener;
                if (i16 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    winterFlowAPIProcess3 = (WinterFlowAPIProcess) this.WinterFlowServiceUtility;
                    WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = ((WinterFlowRuntimeNetwork) obj2).WinterFlowVariableVersionControl;
                    objArr2 = winterFlowCacheManagerTransactionManager.WinterFlowHookDataSource;
                    jArr3 = winterFlowCacheManagerTransactionManager.WinterFlowRouterStructure;
                    length3 = jArr3.length - 2;
                    if (length3 >= 0) {
                        i3 = 0;
                        j3 = jArr3[i3];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        }
                        if (i3 != length3) {
                        }
                    }
                } else if (i16 != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    int i17 = this.WinterFlowTransactionAgent;
                    int i18 = this.WinterFlowResponseEngine;
                    long j8 = this.WinterFlowServerProtocol;
                    i3 = this.WinterFlowSyntax;
                    int i19 = this.WinterFlowRouterRouter;
                    long[] jArr7 = this.WinterFlowUnitTestResponse;
                    Object[] objArr5 = (Object[]) this.WinterFlowBandwidthObject;
                    WinterFlowAPIProcess winterFlowAPIProcess7 = (WinterFlowAPIProcess) this.WinterFlowServiceUtility;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    j8 >>= 8;
                    i17++;
                    if (i17 < i18) {
                        if (i18 == 8) {
                            length3 = i19;
                            jArr3 = jArr7;
                            objArr2 = objArr5;
                            winterFlowAPIProcess3 = winterFlowAPIProcess7;
                            if (i3 != length3) {
                                i3++;
                                j3 = jArr3[i3];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    winterFlowAPIProcess7 = winterFlowAPIProcess3;
                                    i17 = 0;
                                    jArr7 = jArr3;
                                    i19 = length3;
                                    i18 = 8 - ((~(i3 - length3)) >>> 31);
                                    objArr5 = objArr2;
                                    j8 = j3;
                                    if (i17 < i18) {
                                        if ((j8 & 255) < 128) {
                                            Object obj4 = objArr5[(i3 << 3) + i17];
                                            this.WinterFlowServiceUtility = winterFlowAPIProcess7;
                                            this.WinterFlowBandwidthObject = objArr5;
                                            this.WinterFlowUnitTestResponse = jArr7;
                                            this.WinterFlowRouterRouter = i19;
                                            this.WinterFlowSyntax = i3;
                                            this.WinterFlowServerProtocol = j8;
                                            this.WinterFlowResponseEngine = i18;
                                            this.WinterFlowTransactionAgent = i17;
                                            this.WinterFlowThreadListener = 1;
                                            winterFlowAPIProcess7.WinterFlowHookDataSource(obj4, this);
                                            break;
                                        }
                                        j8 >>= 8;
                                        i17++;
                                        if (i17 < i18) {
                                        }
                                    }
                                }
                                if (i3 != length3) {
                                }
                            }
                        }
                    }
                }
                break;
            default:
                int i20 = this.WinterFlowThreadListener;
                if (i20 == 0) {
                    j4 = 255;
                    c = 7;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    winterFlowAPIProcess4 = (WinterFlowAPIProcess) this.WinterFlowServiceUtility;
                    WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure3 = (WinterFlowDatabaseSchemaStructure) ((WinterFlowCacheManagerGateway) obj2).WinterFlowTransactionManagerStrategy;
                    objArr3 = winterFlowDatabaseSchemaStructure3.WinterFlowCacheManagerAgent;
                    jArr4 = winterFlowDatabaseSchemaStructure3.WinterFlowRouterStructure;
                    length4 = jArr4.length - 2;
                    if (length4 >= 0) {
                        i4 = 0;
                        j5 = jArr4[i4];
                        if ((((~j5) << c) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        }
                        if (i4 != length4) {
                        }
                    }
                } else if (i20 != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    int i21 = this.WinterFlowTransactionAgent;
                    int i22 = this.WinterFlowResponseEngine;
                    j5 = this.WinterFlowServerProtocol;
                    int i23 = this.WinterFlowSyntax;
                    j4 = 255;
                    int i24 = this.WinterFlowRouterRouter;
                    long[] jArr8 = this.WinterFlowUnitTestResponse;
                    c = 7;
                    Object[] objArr6 = (Object[]) this.WinterFlowBandwidthObject;
                    WinterFlowAPIProcess winterFlowAPIProcess8 = (WinterFlowAPIProcess) this.WinterFlowServiceUtility;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    j5 >>= 8;
                    i21++;
                    if (i21 < i22) {
                        if (i22 == 8) {
                            jArr4 = jArr8;
                            winterFlowAPIProcess4 = winterFlowAPIProcess8;
                            length4 = i24;
                            objArr3 = objArr6;
                            i4 = i23;
                            if (i4 != length4) {
                                i4++;
                                j5 = jArr4[i4];
                                if ((((~j5) << c) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i25 = 8 - ((~(i4 - length4)) >>> 31);
                                    int i26 = length4;
                                    jArr8 = jArr4;
                                    i22 = i25;
                                    i23 = i4;
                                    objArr6 = objArr3;
                                    i24 = i26;
                                    winterFlowAPIProcess8 = winterFlowAPIProcess4;
                                    i21 = 0;
                                    if (i21 < i22) {
                                        if ((j5 & j4) < 128) {
                                            Object obj5 = objArr6[(i23 << 3) + i21];
                                            this.WinterFlowServiceUtility = winterFlowAPIProcess8;
                                            this.WinterFlowBandwidthObject = objArr6;
                                            this.WinterFlowUnitTestResponse = jArr8;
                                            this.WinterFlowRouterRouter = i24;
                                            this.WinterFlowSyntax = i23;
                                            this.WinterFlowServerProtocol = j5;
                                            this.WinterFlowResponseEngine = i22;
                                            this.WinterFlowTransactionAgent = i21;
                                            this.WinterFlowThreadListener = 1;
                                            winterFlowAPIProcess8.WinterFlowHookDataSource(obj5, this);
                                            break;
                                        }
                                        j5 >>= 8;
                                        i21++;
                                        if (i21 < i22) {
                                        }
                                    }
                                }
                                if (i4 != length4) {
                                }
                            }
                        }
                    }
                }
                break;
        }
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowAPIProcess winterFlowAPIProcess = (WinterFlowAPIProcess) obj;
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = (WinterFlowTransactionManagerLayer) obj2;
        switch (i) {
        }
        return ((WinterFlowServerFrontend) WinterFlowServerProtocol(winterFlowTransactionManagerLayer, winterFlowAPIProcess)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
    }
}
