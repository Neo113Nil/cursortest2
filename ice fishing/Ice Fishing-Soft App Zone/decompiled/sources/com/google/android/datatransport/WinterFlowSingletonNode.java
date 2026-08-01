package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSingletonNode implements Iterable, WinterFlowLoaderProcess {
    public static final WinterFlowSingletonNode WinterFlowSyntax = new WinterFlowSingletonNode(0, 0, 0, null);
    public final long[] WinterFlowRouterRouter;
    public final long WinterFlowTransactionManagerStrategy;
    public final long WinterFlowUnitTestResponse;
    public final long WinterFlowVariableVersionControl;

    public WinterFlowSingletonNode(long j, long j2, long j3, long[] jArr) {
        this.WinterFlowVariableVersionControl = j;
        this.WinterFlowTransactionManagerStrategy = j2;
        this.WinterFlowUnitTestResponse = j3;
        this.WinterFlowRouterRouter = jArr;
    }

    public final boolean WinterFlowArrayNetwork(long j) {
        long[] jArr;
        long j2 = j - this.WinterFlowUnitTestResponse;
        return (WinterFlowManagerRequest.WinterFlowRouterAdapter(j2, 0L) < 0 || WinterFlowManagerRequest.WinterFlowRouterAdapter(j2, 64L) >= 0) ? (WinterFlowManagerRequest.WinterFlowRouterAdapter(j2, 64L) < 0 || WinterFlowManagerRequest.WinterFlowRouterAdapter(j2, 128L) >= 0) ? WinterFlowManagerRequest.WinterFlowRouterAdapter(j2, 0L) <= 0 && (jArr = this.WinterFlowRouterRouter) != null && WinterFlowProviderRouter.WinterFlowTransactionManagerStrategy(jArr, j) >= 0 : ((1 << (((int) j2) + (-64))) & this.WinterFlowVariableVersionControl) != 0 : ((1 << ((int) j2)) & this.WinterFlowTransactionManagerStrategy) != 0;
    }

    public final WinterFlowSingletonNode WinterFlowCacheManagerAgent(long j) {
        long[] jArr;
        int WinterFlowTransactionManagerStrategy;
        long[] jArr2;
        long j2 = j - this.WinterFlowUnitTestResponse;
        if (WinterFlowManagerRequest.WinterFlowRouterAdapter(j2, 0L) >= 0 && WinterFlowManagerRequest.WinterFlowRouterAdapter(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.WinterFlowTransactionManagerStrategy;
            if ((j4 & j3) != 0) {
                return new WinterFlowSingletonNode(this.WinterFlowVariableVersionControl, j4 & (~j3), this.WinterFlowUnitTestResponse, this.WinterFlowRouterRouter);
            }
        } else if (WinterFlowManagerRequest.WinterFlowRouterAdapter(j2, 64L) >= 0 && WinterFlowManagerRequest.WinterFlowRouterAdapter(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.WinterFlowVariableVersionControl;
            if ((j6 & j5) != 0) {
                return new WinterFlowSingletonNode(j6 & (~j5), this.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse, this.WinterFlowRouterRouter);
            }
        } else if (WinterFlowManagerRequest.WinterFlowRouterAdapter(j2, 0L) < 0 && (jArr = this.WinterFlowRouterRouter) != null && (WinterFlowTransactionManagerStrategy = WinterFlowProviderRouter.WinterFlowTransactionManagerStrategy(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (WinterFlowTransactionManagerStrategy > 0) {
                    WinterFlowProtocolPipeline.WinterFlowFrontendBackend(jArr, jArr3, 0, 0, WinterFlowTransactionManagerStrategy);
                }
                if (WinterFlowTransactionManagerStrategy < i) {
                    WinterFlowProtocolPipeline.WinterFlowFrontendBackend(jArr, jArr3, WinterFlowTransactionManagerStrategy, WinterFlowTransactionManagerStrategy + 1, length);
                }
                jArr2 = jArr3;
            }
            return new WinterFlowSingletonNode(this.WinterFlowVariableVersionControl, this.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse, jArr2);
        }
        return this;
    }

    public final WinterFlowSingletonNode WinterFlowRouterStructure(WinterFlowSingletonNode winterFlowSingletonNode) {
        long[] jArr;
        WinterFlowSingletonNode winterFlowSingletonNode2 = this;
        WinterFlowSingletonNode winterFlowSingletonNode3 = WinterFlowSyntax;
        if (winterFlowSingletonNode == winterFlowSingletonNode3) {
            return winterFlowSingletonNode2;
        }
        if (winterFlowSingletonNode2 == winterFlowSingletonNode3) {
            return winterFlowSingletonNode3;
        }
        long j = winterFlowSingletonNode.WinterFlowUnitTestResponse;
        long j2 = winterFlowSingletonNode.WinterFlowUnitTestResponse;
        long[] jArr2 = winterFlowSingletonNode.WinterFlowRouterRouter;
        long j3 = winterFlowSingletonNode.WinterFlowTransactionManagerStrategy;
        long j4 = winterFlowSingletonNode.WinterFlowVariableVersionControl;
        long j5 = winterFlowSingletonNode2.WinterFlowUnitTestResponse;
        if (j == j5 && jArr2 == (jArr = winterFlowSingletonNode2.WinterFlowRouterRouter)) {
            return new WinterFlowSingletonNode(winterFlowSingletonNode2.WinterFlowVariableVersionControl & (~j4), winterFlowSingletonNode2.WinterFlowTransactionManagerStrategy & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                winterFlowSingletonNode2 = winterFlowSingletonNode2.WinterFlowCacheManagerAgent(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    winterFlowSingletonNode2 = winterFlowSingletonNode2.WinterFlowCacheManagerAgent(i + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    winterFlowSingletonNode2 = winterFlowSingletonNode2.WinterFlowCacheManagerAgent(i2 + j2 + 64);
                }
            }
        }
        return winterFlowSingletonNode2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x012e, code lost:
    
        if (r5 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0130, code lost:
    
        r0 = (com.google.android.datatransport.WinterFlowLoaderEntity) r5.WinterFlowVariableVersionControl;
        r3 = r0.WinterFlowHookDataSource;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0136, code lost:
    
        if (r3 != 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0138, code lost:
    
        r0 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014a, code lost:
    
        if (r0 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014d, code lost:
    
        r28 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015b, code lost:
    
        return new com.google.android.datatransport.WinterFlowSingletonNode(r22, r24, r26, r28).WinterFlowTransactionManagerStrategy(r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013b, code lost:
    
        r4 = new long[r3];
        r0 = r0.WinterFlowRouterStructure;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0140, code lost:
    
        if (r6 >= r3) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0142, code lost:
    
        r4[r6] = r0[r6];
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0149, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0150, code lost:
    
        r28 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WinterFlowSingletonNode WinterFlowTransactionManagerStrategy(long j) {
        long[] jArr;
        long j2;
        long j3;
        int i;
        WinterFlowLoaderEntity winterFlowLoaderEntity;
        long j4 = this.WinterFlowUnitTestResponse;
        long j5 = j - j4;
        long j6 = 0;
        int WinterFlowRouterAdapter = WinterFlowManagerRequest.WinterFlowRouterAdapter(j5, 0L);
        long j7 = this.WinterFlowTransactionManagerStrategy;
        if (WinterFlowRouterAdapter < 0 || WinterFlowManagerRequest.WinterFlowRouterAdapter(j5, 64L) >= 0) {
            int WinterFlowRouterAdapter2 = WinterFlowManagerRequest.WinterFlowRouterAdapter(j5, 64L);
            long j8 = this.WinterFlowVariableVersionControl;
            int i2 = 64;
            if (WinterFlowRouterAdapter2 < 0 || WinterFlowManagerRequest.WinterFlowRouterAdapter(j5, 128L) >= 0) {
                int WinterFlowRouterAdapter3 = WinterFlowManagerRequest.WinterFlowRouterAdapter(j5, 128L);
                long[] jArr2 = this.WinterFlowRouterRouter;
                if (WinterFlowRouterAdapter3 < 0) {
                    if (jArr2 == null) {
                        return new WinterFlowSingletonNode(this.WinterFlowVariableVersionControl, this.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse, new long[]{j});
                    }
                    int WinterFlowTransactionManagerStrategy = WinterFlowProviderRouter.WinterFlowTransactionManagerStrategy(jArr2, j);
                    if (WinterFlowTransactionManagerStrategy < 0) {
                        int i3 = -(WinterFlowTransactionManagerStrategy + 1);
                        int length = jArr2.length;
                        long[] jArr3 = new long[length + 1];
                        WinterFlowProtocolPipeline.WinterFlowFrontendBackend(jArr2, jArr3, 0, 0, i3);
                        WinterFlowProtocolPipeline.WinterFlowFrontendBackend(jArr2, jArr3, i3 + 1, i3, length);
                        jArr3[i3] = j;
                        return new WinterFlowSingletonNode(this.WinterFlowVariableVersionControl, this.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse, jArr3);
                    }
                } else if (!WinterFlowArrayNetwork(j)) {
                    long j9 = ((j + 1) / 64) * 64;
                    if (WinterFlowManagerRequest.WinterFlowRouterAdapter(j9, 0L) < 0) {
                        j9 = 9223372036854775680L;
                    }
                    long j10 = j8;
                    WinterFlowNodeSerializer winterFlowNodeSerializer = null;
                    while (true) {
                        if (WinterFlowManagerRequest.WinterFlowRouterAdapter(j4, j9) >= 0) {
                            jArr = null;
                            j2 = j4;
                            j3 = j7;
                            break;
                        }
                        if (j7 != j6) {
                            if (winterFlowNodeSerializer == null) {
                                winterFlowNodeSerializer = new WinterFlowNodeSerializer();
                                if (jArr2 != null) {
                                    long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
                                    jArr = null;
                                    winterFlowLoaderEntity = new WinterFlowLoaderEntity(copyOf.length);
                                    int i4 = winterFlowLoaderEntity.WinterFlowHookDataSource;
                                    if (i4 < 0) {
                                        WinterFlowCompilerMechanism.WinterFlowTransactionAgent("");
                                        throw null;
                                    }
                                    j3 = j6;
                                    if (copyOf.length != 0) {
                                        int length2 = copyOf.length + i4;
                                        long[] jArr4 = winterFlowLoaderEntity.WinterFlowRouterStructure;
                                        if (jArr4.length < length2) {
                                            jArr4 = Arrays.copyOf(jArr4, Math.max(length2, (jArr4.length * 3) / 2));
                                            winterFlowLoaderEntity.WinterFlowRouterStructure = jArr4;
                                        }
                                        int i5 = winterFlowLoaderEntity.WinterFlowHookDataSource;
                                        if (i4 != i5) {
                                            WinterFlowProtocolPipeline.WinterFlowFrontendBackend(jArr4, jArr4, copyOf.length + i4, i4, i5);
                                        }
                                        WinterFlowProtocolPipeline.WinterFlowFrontendBackend(copyOf, jArr4, i4, 0, copyOf.length);
                                        winterFlowLoaderEntity.WinterFlowHookDataSource += copyOf.length;
                                    }
                                } else {
                                    j3 = j6;
                                    jArr = null;
                                    winterFlowLoaderEntity = new WinterFlowLoaderEntity();
                                }
                                winterFlowNodeSerializer.WinterFlowVariableVersionControl = winterFlowLoaderEntity;
                            } else {
                                j3 = j6;
                                jArr = null;
                            }
                            i = i2;
                            for (int i6 = 0; i6 < i; i6++) {
                                if (((1 << i6) & j7) != j3) {
                                    ((WinterFlowLoaderEntity) winterFlowNodeSerializer.WinterFlowVariableVersionControl).WinterFlowRouterStructure(i6 + j4);
                                }
                            }
                        } else {
                            j3 = j6;
                            i = i2;
                            jArr = null;
                        }
                        if (j10 == j3) {
                            j2 = j9;
                            break;
                        }
                        j4 += 64;
                        i2 = i;
                        j7 = j10;
                        j6 = j3;
                        j10 = j6;
                    }
                }
            } else {
                long j11 = 1 << (((int) j5) - 64);
                if ((j8 & j11) == 0) {
                    return new WinterFlowSingletonNode(j8 | j11, this.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse, this.WinterFlowRouterRouter);
                }
            }
        } else {
            long j12 = 1 << ((int) j5);
            if ((j7 & j12) == 0) {
                return new WinterFlowSingletonNode(this.WinterFlowVariableVersionControl, j7 | j12, this.WinterFlowUnitTestResponse, this.WinterFlowRouterRouter);
            }
        }
        return this;
    }

    public final WinterFlowSingletonNode WinterFlowVariableVersionControl(WinterFlowSingletonNode winterFlowSingletonNode) {
        WinterFlowSingletonNode winterFlowSingletonNode2;
        long[] jArr;
        WinterFlowSingletonNode winterFlowSingletonNode3 = this;
        WinterFlowSingletonNode winterFlowSingletonNode4 = WinterFlowSyntax;
        if (winterFlowSingletonNode == winterFlowSingletonNode4) {
            return winterFlowSingletonNode3;
        }
        if (winterFlowSingletonNode3 == winterFlowSingletonNode4) {
            return winterFlowSingletonNode;
        }
        long j = winterFlowSingletonNode.WinterFlowUnitTestResponse;
        long j2 = winterFlowSingletonNode.WinterFlowUnitTestResponse;
        long[] jArr2 = winterFlowSingletonNode.WinterFlowRouterRouter;
        long j3 = winterFlowSingletonNode.WinterFlowTransactionManagerStrategy;
        long j4 = winterFlowSingletonNode.WinterFlowVariableVersionControl;
        long j5 = winterFlowSingletonNode3.WinterFlowUnitTestResponse;
        long j6 = winterFlowSingletonNode3.WinterFlowTransactionManagerStrategy;
        long j7 = winterFlowSingletonNode3.WinterFlowVariableVersionControl;
        if (j == j5 && jArr2 == (jArr = winterFlowSingletonNode3.WinterFlowRouterRouter)) {
            return new WinterFlowSingletonNode(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = winterFlowSingletonNode3.WinterFlowRouterRouter;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    winterFlowSingletonNode3 = winterFlowSingletonNode3.WinterFlowTransactionManagerStrategy(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        winterFlowSingletonNode3 = winterFlowSingletonNode3.WinterFlowTransactionManagerStrategy(i2 + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        winterFlowSingletonNode3 = winterFlowSingletonNode3.WinterFlowTransactionManagerStrategy(i + j2 + 64);
                    }
                    i++;
                }
            }
            return winterFlowSingletonNode3;
        }
        if (jArr3 != null) {
            winterFlowSingletonNode2 = winterFlowSingletonNode;
            for (long j9 : jArr3) {
                winterFlowSingletonNode2 = winterFlowSingletonNode2.WinterFlowTransactionManagerStrategy(j9);
            }
        } else {
            winterFlowSingletonNode2 = winterFlowSingletonNode;
        }
        long j10 = winterFlowSingletonNode3.WinterFlowUnitTestResponse;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    winterFlowSingletonNode2 = winterFlowSingletonNode2.WinterFlowTransactionManagerStrategy(i3 + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    winterFlowSingletonNode2 = winterFlowSingletonNode2.WinterFlowTransactionManagerStrategy(i + j10 + 64);
                }
                i++;
            }
        }
        return winterFlowSingletonNode2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return WinterFlowConfigurationException.WinterFlowVariableVersionControl(new WinterFlowScriptSoftware(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(WinterFlowModuleThread.WinterFlowModuleAgent(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
