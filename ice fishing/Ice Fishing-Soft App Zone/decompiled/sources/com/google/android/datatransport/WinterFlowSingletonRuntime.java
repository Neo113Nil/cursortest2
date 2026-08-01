package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowSingletonRuntime {
    public static final WinterFlowPipelineHelper WinterFlowRouterStructure = new WinterFlowPipelineHelper(0, new WinterFlowArrayHelper(9));

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WinterFlowHookDataSource(final String str, WinterFlowMapperManager winterFlowMapperManager, final long j, final long j2, WinterFlowObjectHook winterFlowObjectHook, long j3, WinterFlowThreadPoolEventEmitter winterFlowThreadPoolEventEmitter, long j4, int i, boolean z, int i2, int i3, WinterFlowEncryptionServer winterFlowEncryptionServer, WinterFlowResolverLibrary winterFlowResolverLibrary, final int i4, final int i5) {
        String str2;
        int i6;
        WinterFlowMapperManager winterFlowMapperManager2;
        int i7;
        WinterFlowObjectHook winterFlowObjectHook2;
        int i8;
        int i9;
        WinterFlowThreadPoolEventEmitter winterFlowThreadPoolEventEmitter2;
        final long j5;
        final int i10;
        final boolean z2;
        final int i11;
        final WinterFlowEncryptionServer winterFlowEncryptionServer2;
        final WinterFlowObjectHook winterFlowObjectHook3;
        final WinterFlowMapperManager winterFlowMapperManager3;
        final WinterFlowThreadPoolEventEmitter winterFlowThreadPoolEventEmitter3;
        final long j6;
        final int i12;
        WinterFlowStackEngine WinterFlowConcurrencyThread;
        WinterFlowMapperManager winterFlowMapperManager4;
        WinterFlowEncryptionServer winterFlowEncryptionServer3;
        WinterFlowObjectHook winterFlowObjectHook4;
        long j7;
        long j8;
        boolean z3;
        int i13;
        int i14;
        int i15;
        long j9;
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(1809465675);
        char c = 2;
        if ((i4 & 6) == 0) {
            str2 = str;
            i6 = (winterFlowResolverLibrary.WinterFlowVariableVersionControl(str2) ? 4 : 2) | i4;
        } else {
            str2 = str;
            i6 = i4;
        }
        int i16 = i5 & 2;
        if (i16 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            winterFlowMapperManager2 = winterFlowMapperManager;
            i6 |= winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowMapperManager2) ? 32 : 16;
            if ((i4 & 384) == 0) {
                i6 |= winterFlowResolverLibrary.WinterFlowArrayNetwork(j) ? 256 : 128;
            }
            int i17 = i6 | 3072;
            if ((i4 & 24576) == 0) {
                i17 |= winterFlowResolverLibrary.WinterFlowArrayNetwork(j2) ? 16384 : 8192;
            }
            int i18 = 196608 | i17;
            i7 = i5 & 64;
            if (i7 == 0) {
                i18 = 1769472 | i17;
            } else if ((1572864 & i4) == 0) {
                winterFlowObjectHook2 = winterFlowObjectHook;
                i18 |= winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowObjectHook2) ? 1048576 : 524288;
                i8 = i18 | 918552576;
                i9 = i5 & 1024;
                if (i9 != 0) {
                    c = 6;
                    winterFlowThreadPoolEventEmitter2 = winterFlowThreadPoolEventEmitter;
                } else {
                    winterFlowThreadPoolEventEmitter2 = winterFlowThreadPoolEventEmitter;
                    if (winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowThreadPoolEventEmitter2)) {
                        c = 4;
                    }
                }
                if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i8 & 1, (i8 & 306783379) == 306783378 || (4793491 & (c | 28080)) != 4793490)) {
                    winterFlowResolverLibrary.WinterFlowProxyStructure();
                    if ((i4 & 1) == 0 || winterFlowResolverLibrary.WinterFlowResolverController()) {
                        winterFlowMapperManager4 = i16 != 0 ? WinterFlowValidatorComponent.WinterFlowRouterStructure : winterFlowMapperManager2;
                        if (i7 != 0) {
                            winterFlowObjectHook2 = null;
                        }
                        long j10 = WinterFlowOrchestrationPlatform.WinterFlowCacheManagerAgent;
                        if (i9 != 0) {
                            winterFlowThreadPoolEventEmitter2 = null;
                        }
                        winterFlowEncryptionServer3 = (WinterFlowEncryptionServer) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowRouterStructure);
                        winterFlowObjectHook4 = winterFlowObjectHook2;
                        j7 = j10;
                        j8 = j7;
                        z3 = true;
                        i13 = 1;
                        i14 = Integer.MAX_VALUE;
                        i15 = 1;
                    } else {
                        winterFlowResolverLibrary.WinterFlowQueueService();
                        j7 = j3;
                        j8 = j4;
                        i15 = i;
                        i14 = i2;
                        winterFlowEncryptionServer3 = winterFlowEncryptionServer;
                        winterFlowObjectHook4 = winterFlowObjectHook2;
                        winterFlowMapperManager4 = winterFlowMapperManager2;
                        z3 = z;
                        i13 = i3;
                    }
                    WinterFlowThreadPoolEventEmitter winterFlowThreadPoolEventEmitter4 = winterFlowThreadPoolEventEmitter2;
                    winterFlowResolverLibrary.WinterFlowOrchestrationSubsystem();
                    winterFlowResolverLibrary.WinterFlowCompilerDataSource(-565217106);
                    if (j != 16) {
                        j9 = j;
                    } else {
                        winterFlowResolverLibrary.WinterFlowCompilerDataSource(-565216333);
                        long WinterFlowHookDataSource = winterFlowEncryptionServer3.WinterFlowHookDataSource();
                        if (WinterFlowHookDataSource == 16) {
                            WinterFlowHookDataSource = ((WinterFlowInheritanceSubsystem) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowSoftwareLayer.WinterFlowRouterStructure)).WinterFlowRouterStructure;
                        }
                        winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                        j9 = WinterFlowHookDataSource;
                    }
                    winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                    int i19 = i15;
                    boolean z4 = z3;
                    int i20 = i14;
                    int i21 = i13;
                    WinterFlowManagerRequest.WinterFlowHookDataSource(str2, winterFlowMapperManager4, WinterFlowEncryptionServer.WinterFlowCacheManagerAgent(winterFlowEncryptionServer3, j9, j2, winterFlowObjectHook4, j7, winterFlowThreadPoolEventEmitter4 != null ? winterFlowThreadPoolEventEmitter4.WinterFlowRouterStructure : 0, j8, 16609104), i19, z4, i20, i21, winterFlowResolverLibrary, (i8 & 126) | 14380032 | ((i8 << 18) & 1879048192));
                    z2 = z4;
                    winterFlowThreadPoolEventEmitter3 = winterFlowThreadPoolEventEmitter4;
                    i12 = i20;
                    i10 = i19;
                    winterFlowObjectHook3 = winterFlowObjectHook4;
                    j6 = j7;
                    i11 = i21;
                    winterFlowEncryptionServer2 = winterFlowEncryptionServer3;
                    j5 = j8;
                    winterFlowMapperManager3 = winterFlowMapperManager4;
                } else {
                    winterFlowResolverLibrary.WinterFlowQueueService();
                    j5 = j4;
                    i10 = i;
                    z2 = z;
                    i11 = i3;
                    winterFlowEncryptionServer2 = winterFlowEncryptionServer;
                    winterFlowObjectHook3 = winterFlowObjectHook2;
                    winterFlowMapperManager3 = winterFlowMapperManager2;
                    winterFlowThreadPoolEventEmitter3 = winterFlowThreadPoolEventEmitter2;
                    j6 = j3;
                    i12 = i2;
                }
                WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
                if (WinterFlowConcurrencyThread != null) {
                    WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowEventEvent() { // from class: com.google.android.datatransport.WinterFlowRepositoryCompiler
                        @Override // com.google.android.datatransport.WinterFlowEventEvent
                        public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int WinterFlowResponseEngine = WinterFlowConfigurationException.WinterFlowResponseEngine(i4 | 1);
                            WinterFlowSingletonRuntime.WinterFlowHookDataSource(str, winterFlowMapperManager3, j, j2, winterFlowObjectHook3, j6, winterFlowThreadPoolEventEmitter3, j5, i10, z2, i12, i11, winterFlowEncryptionServer2, (WinterFlowResolverLibrary) obj, WinterFlowResponseEngine, i5);
                            return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                        }
                    };
                    return;
                }
                return;
            }
            winterFlowObjectHook2 = winterFlowObjectHook;
            i8 = i18 | 918552576;
            i9 = i5 & 1024;
            if (i9 != 0) {
            }
            if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i8 & 1, (i8 & 306783379) == 306783378 || (4793491 & (c | 28080)) != 4793490)) {
            }
            WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
            if (WinterFlowConcurrencyThread != null) {
            }
        }
        winterFlowMapperManager2 = winterFlowMapperManager;
        if ((i4 & 384) == 0) {
        }
        int i172 = i6 | 3072;
        if ((i4 & 24576) == 0) {
        }
        int i182 = 196608 | i172;
        i7 = i5 & 64;
        if (i7 == 0) {
        }
        winterFlowObjectHook2 = winterFlowObjectHook;
        i8 = i182 | 918552576;
        i9 = i5 & 1024;
        if (i9 != 0) {
        }
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i8 & 1, (i8 & 306783379) == 306783378 || (4793491 & (c | 28080)) != 4793490)) {
        }
        WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
        }
    }

    public static final void WinterFlowRouterStructure(WinterFlowEncryptionServer winterFlowEncryptionServer, WinterFlowEventTool winterFlowEventTool, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(15327438);
        int i2 = (winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowEncryptionServer) ? 4 : 2) | i | (winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowEventTool) ? 32 : 16);
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i2 & 1, (i2 & 19) != 18)) {
            WinterFlowProtocolEntity winterFlowProtocolEntity = WinterFlowRouterStructure;
            WinterFlowEncryptionServer winterFlowEncryptionServer2 = (WinterFlowEncryptionServer) winterFlowResolverLibrary.WinterFlowSyntax(winterFlowProtocolEntity);
            winterFlowEncryptionServer2.getClass();
            if (winterFlowEncryptionServer != null && !winterFlowEncryptionServer.equals(WinterFlowEncryptionServer.WinterFlowArrayNetwork)) {
                winterFlowEncryptionServer2 = new WinterFlowEncryptionServer(winterFlowEncryptionServer2.WinterFlowRouterStructure.WinterFlowCacheManagerAgent(winterFlowEncryptionServer.WinterFlowRouterStructure), winterFlowEncryptionServer2.WinterFlowHookDataSource.WinterFlowRouterStructure(winterFlowEncryptionServer.WinterFlowHookDataSource));
            }
            WinterFlowHandlerWebsocket.WinterFlowHookDataSource(winterFlowProtocolEntity.WinterFlowRouterStructure(winterFlowEncryptionServer2), winterFlowEventTool, winterFlowResolverLibrary, (i2 & 112) | 8);
        } else {
            winterFlowResolverLibrary.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowAPIVersionControl(i, 11, winterFlowEncryptionServer, winterFlowEventTool);
        }
    }
}
