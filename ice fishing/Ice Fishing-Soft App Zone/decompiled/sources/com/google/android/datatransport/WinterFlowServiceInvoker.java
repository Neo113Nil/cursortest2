package com.google.android.datatransport;

import java.util.HashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServiceInvoker {
    public WinterFlowLibraryCache WinterFlowCacheManagerAgent;
    public Object WinterFlowHookDataSource;
    public boolean WinterFlowResponseEngine;
    public final WinterFlowObjectSession WinterFlowRouterStructure;
    public int WinterFlowTransactionAgent;
    public int WinterFlowArrayNetwork = -1;
    public final WinterFlowDatabaseSchemaStructure WinterFlowVariableVersionControl = WinterFlowHookProcessor.WinterFlowRouterRouter();
    public final WinterFlowDatabaseSchemaStructure WinterFlowTransactionManagerStrategy = new WinterFlowDatabaseSchemaStructure();
    public final WinterFlowCacheManagerTransactionManager WinterFlowUnitTestResponse = new WinterFlowCacheManagerTransactionManager();
    public final WinterFlowJSON WinterFlowRouterRouter = new WinterFlowJSON(new WinterFlowPipelineWidget[16]);
    public final WinterFlowResponseConsumer WinterFlowSyntax = new WinterFlowResponseConsumer(1, this);
    public final WinterFlowDatabaseSchemaStructure WinterFlowServerProtocol = WinterFlowHookProcessor.WinterFlowRouterRouter();
    public final HashMap WinterFlowThreadListener = new HashMap();

    public WinterFlowServiceInvoker(WinterFlowObjectSession winterFlowObjectSession) {
        this.WinterFlowRouterStructure = winterFlowObjectSession;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void WinterFlowArrayNetwork() {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        boolean z;
        long j3;
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = this.WinterFlowTransactionManagerStrategy;
        long[] jArr3 = winterFlowDatabaseSchemaStructure.WinterFlowRouterStructure;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j4 = jArr3[i2];
            char c2 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j4 & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        c = c2;
                        Object obj = winterFlowDatabaseSchemaStructure.WinterFlowHookDataSource[i6];
                        j2 = j5;
                        WinterFlowLibraryCache winterFlowLibraryCache = (WinterFlowLibraryCache) winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent[i6];
                        obj.getClass();
                        boolean WinterFlowBatchUI = ((WinterFlowUnitTestHandler) obj).WinterFlowBatchUI();
                        if (!WinterFlowBatchUI) {
                            Object[] objArr = winterFlowLibraryCache.WinterFlowHookDataSource;
                            int[] iArr = winterFlowLibraryCache.WinterFlowCacheManagerAgent;
                            long[] jArr4 = winterFlowLibraryCache.WinterFlowRouterStructure;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j4;
                                int i8 = 0;
                                while (true) {
                                    long j6 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    z = WinterFlowBatchUI;
                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j6 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                j3 = j6;
                                                Object obj2 = objArr[i11];
                                                int i12 = iArr[i11];
                                                WinterFlowCacheManagerAgent(obj, obj2);
                                            } else {
                                                j3 = j6;
                                            }
                                            j6 = j3 >> i7;
                                        }
                                        if (i9 != i7) {
                                            break;
                                        }
                                    }
                                    if (i8 == length2) {
                                        break;
                                    }
                                    i8++;
                                    WinterFlowBatchUI = z;
                                    jArr4 = jArr5;
                                    i7 = 8;
                                }
                                if (!z) {
                                    winterFlowDatabaseSchemaStructure.WinterFlowServerProtocol(i6);
                                }
                                i = 8;
                            }
                        }
                        jArr2 = jArr3;
                        j = j4;
                        z = WinterFlowBatchUI;
                        if (!z) {
                        }
                        i = 8;
                    } else {
                        jArr2 = jArr3;
                        j = j4;
                        c = c2;
                        j2 = j5;
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                    j4 = j >> i;
                    c2 = c;
                    j5 = j2;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i4 != i3) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            jArr3 = jArr;
        }
    }

    public final void WinterFlowCacheManagerAgent(Object obj, Object obj2) {
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = this.WinterFlowVariableVersionControl;
        WinterFlowHookProcessor.WinterFlowBandwidthObject(winterFlowDatabaseSchemaStructure, obj2, obj);
        if (!(obj2 instanceof WinterFlowPipelineWidget) || winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent(obj2)) {
            return;
        }
        WinterFlowHookProcessor.WinterFlowOrchestrationSubsystem(this.WinterFlowServerProtocol, obj2);
        this.WinterFlowThreadListener.remove(obj2);
    }

    public final void WinterFlowHookDataSource(Object obj, int i, Object obj2, WinterFlowLibraryCache winterFlowLibraryCache) {
        int i2;
        if (this.WinterFlowTransactionAgent > 0) {
            return;
        }
        int WinterFlowCacheManagerAgent = winterFlowLibraryCache.WinterFlowCacheManagerAgent(obj);
        if (WinterFlowCacheManagerAgent < 0) {
            WinterFlowCacheManagerAgent = ~WinterFlowCacheManagerAgent;
            i2 = -1;
        } else {
            i2 = winterFlowLibraryCache.WinterFlowCacheManagerAgent[WinterFlowCacheManagerAgent];
        }
        winterFlowLibraryCache.WinterFlowHookDataSource[WinterFlowCacheManagerAgent] = obj;
        winterFlowLibraryCache.WinterFlowCacheManagerAgent[WinterFlowCacheManagerAgent] = i;
        if ((obj instanceof WinterFlowPipelineWidget) && i2 != i) {
            WinterFlowRuntimeFrontend WinterFlowSyntax = ((WinterFlowPipelineWidget) obj).WinterFlowSyntax();
            this.WinterFlowThreadListener.put(obj, WinterFlowSyntax.WinterFlowTransactionManagerStrategy);
            WinterFlowLibraryCache winterFlowLibraryCache2 = WinterFlowSyntax.WinterFlowVariableVersionControl;
            WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = this.WinterFlowServerProtocol;
            WinterFlowHookProcessor.WinterFlowOrchestrationSubsystem(winterFlowDatabaseSchemaStructure, obj);
            Object[] objArr = winterFlowLibraryCache2.WinterFlowHookDataSource;
            long[] jArr = winterFlowLibraryCache2.WinterFlowRouterStructure;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                WinterFlowOrchestrationTool winterFlowOrchestrationTool = (WinterFlowOrchestrationTool) objArr[(i3 << 3) + i5];
                                if (winterFlowOrchestrationTool instanceof WinterFlowThreadVersionControl) {
                                    ((WinterFlowThreadVersionControl) winterFlowOrchestrationTool).WinterFlowUnitTestResponse(2);
                                }
                                WinterFlowHookProcessor.WinterFlowCacheManagerAgent(winterFlowDatabaseSchemaStructure, winterFlowOrchestrationTool, obj);
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof WinterFlowThreadVersionControl) {
                ((WinterFlowThreadVersionControl) obj).WinterFlowUnitTestResponse(2);
            }
            WinterFlowHookProcessor.WinterFlowCacheManagerAgent(this.WinterFlowVariableVersionControl, obj, obj2);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final boolean WinterFlowRouterStructure(java.util.Set r46) {
        /*
            Method dump skipped, instructions count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.WinterFlowServiceInvoker.WinterFlowRouterStructure(java.util.Set):boolean");
    }
}
