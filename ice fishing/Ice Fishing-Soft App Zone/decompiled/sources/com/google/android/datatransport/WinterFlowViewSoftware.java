package com.google.android.datatransport;

import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowViewSoftware extends WinterFlowJSONAdapter {
    public int WinterFlowTransactionManagerStrategy;

    public WinterFlowViewSoftware(int i) {
        this.WinterFlowRouterStructure = WinterFlowDatabaseSchemaUtility.WinterFlowRouterStructure;
        this.WinterFlowHookDataSource = WinterFlowConfigurationUtility.WinterFlowRouterStructure;
        this.WinterFlowCacheManagerAgent = WinterFlowHandlerWebsocket.WinterFlowUnitTestResponse;
        if (i >= 0) {
            WinterFlowTransactionManagerStrategy(WinterFlowDatabaseSchemaUtility.WinterFlowArrayNetwork(i));
        } else {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int WinterFlowArrayNetwork(int i) {
        long j;
        long j2;
        int i2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        Object[] objArr;
        int i3;
        int i4 = -862048943;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.WinterFlowArrayNetwork;
        int i9 = i6 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr3 = this.WinterFlowRouterStructure;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            int i13 = 1;
            long j4 = ((jArr3[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr3[i11] >>> i12);
            long j5 = i7;
            int i14 = i10;
            int i15 = 0;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j7) >> 3)) & i8;
                int i16 = i4;
                int i17 = i15;
                if (this.WinterFlowHookDataSource[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i4 = i16;
                i15 = i17;
            }
            int i18 = i4;
            int i19 = i15;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int WinterFlowVariableVersionControl = WinterFlowVariableVersionControl(i6);
                long j8 = 255;
                if (this.WinterFlowTransactionManagerStrategy != 0 || ((this.WinterFlowRouterStructure[WinterFlowVariableVersionControl >> 3] >> ((WinterFlowVariableVersionControl & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i20 = this.WinterFlowArrayNetwork;
                    if (i20 > 8) {
                        j3 = 128;
                        if (Long.compareUnsigned(this.WinterFlowVariableVersionControl * 32, i20 * 25) <= 0) {
                            long[] jArr4 = this.WinterFlowRouterStructure;
                            int i21 = this.WinterFlowArrayNetwork;
                            int[] iArr2 = this.WinterFlowHookDataSource;
                            Object[] objArr2 = this.WinterFlowCacheManagerAgent;
                            int i22 = (i21 + 7) >> 3;
                            int i23 = i19;
                            while (i23 < i22) {
                                long j9 = j8;
                                long j10 = jArr4[i23] & (-9187201950435737472L);
                                jArr4[i23] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i23++;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int WinterFlowCompilerDataSource = WinterFlowProtocolPipeline.WinterFlowCompilerDataSource(jArr4);
                            int i24 = WinterFlowCompilerDataSource - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i24] = (jArr4[i24] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[WinterFlowCompilerDataSource] = jArr4[i19];
                            int i25 = i19;
                            while (i25 != i21) {
                                int i26 = i25 >> 3;
                                int i27 = (i25 & 7) << 3;
                                long j12 = (jArr4[i26] >> i27) & j;
                                if (j12 != 128 && j12 == 254) {
                                    int hashCode2 = Integer.hashCode(iArr2[i25]) * i18;
                                    int i28 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int WinterFlowVariableVersionControl2 = WinterFlowVariableVersionControl(i28);
                                    int i29 = i28 & i21;
                                    if (((WinterFlowVariableVersionControl2 - i29) & i21) / 8 == ((i25 - i29) & i21) / 8) {
                                        long j13 = j11;
                                        jArr4[i26] = ((r8 & 127) << i27) | ((~(j << i27)) & jArr4[i26]);
                                        jArr4[jArr4.length - i13] = (jArr4[i19] & j13) | Long.MIN_VALUE;
                                        i25++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i30 = WinterFlowVariableVersionControl2 >> 3;
                                        long j15 = jArr4[i30];
                                        int i31 = (WinterFlowVariableVersionControl2 & 7) << 3;
                                        if (((j15 >> i31) & j) == 128) {
                                            i3 = i13;
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr4[i30] = ((~(j << i31)) & j15) | ((r8 & 127) << i31);
                                            jArr4[i26] = (jArr4[i26] & (~(j << i27))) | (128 << i27);
                                            iArr[WinterFlowVariableVersionControl2] = iArr[i25];
                                            iArr[i25] = i19;
                                            objArr[WinterFlowVariableVersionControl2] = objArr[i25];
                                            objArr[i25] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            i3 = i13;
                                            jArr4[i30] = ((r8 & 127) << i31) | ((~(j << i31)) & j15);
                                            int i32 = iArr[WinterFlowVariableVersionControl2];
                                            iArr[WinterFlowVariableVersionControl2] = iArr[i25];
                                            iArr[i25] = i32;
                                            Object obj = objArr[WinterFlowVariableVersionControl2];
                                            objArr[WinterFlowVariableVersionControl2] = objArr[i25];
                                            objArr[i25] = obj;
                                            i25--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i19] & j14) | Long.MIN_VALUE;
                                        i25++;
                                        j11 = j14;
                                        i13 = i3;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i25++;
                                }
                            }
                            i2 = i13;
                            this.WinterFlowTransactionManagerStrategy = WinterFlowDatabaseSchemaUtility.WinterFlowRouterStructure(this.WinterFlowArrayNetwork) - this.WinterFlowVariableVersionControl;
                            WinterFlowVariableVersionControl = WinterFlowVariableVersionControl(i6);
                        }
                    } else {
                        j3 = 128;
                    }
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    int WinterFlowHookDataSource = WinterFlowDatabaseSchemaUtility.WinterFlowHookDataSource(this.WinterFlowArrayNetwork);
                    long[] jArr5 = this.WinterFlowRouterStructure;
                    int[] iArr3 = this.WinterFlowHookDataSource;
                    Object[] objArr3 = this.WinterFlowCacheManagerAgent;
                    int i33 = this.WinterFlowArrayNetwork;
                    WinterFlowTransactionManagerStrategy(WinterFlowHookDataSource);
                    long[] jArr6 = this.WinterFlowRouterStructure;
                    int[] iArr4 = this.WinterFlowHookDataSource;
                    Object[] objArr4 = this.WinterFlowCacheManagerAgent;
                    int i34 = this.WinterFlowArrayNetwork;
                    int i35 = i19;
                    while (i35 < i33) {
                        if (((jArr5[i35 >> 3] >> ((i35 & 7) << 3)) & 255) < j3) {
                            int i36 = iArr3[i35];
                            int hashCode3 = Integer.hashCode(i36) * i18;
                            int i37 = hashCode3 ^ (hashCode3 << 16);
                            int WinterFlowVariableVersionControl3 = WinterFlowVariableVersionControl(i37 >>> 7);
                            long j16 = i37 & 127;
                            int i38 = WinterFlowVariableVersionControl3 >> 3;
                            int i39 = (WinterFlowVariableVersionControl3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j17 = (jArr6[i38] & (~(255 << i39))) | (j16 << i39);
                            jArr[i38] = j17;
                            jArr[(((WinterFlowVariableVersionControl3 - 7) & i34) + (i34 & 7)) >> 3] = j17;
                            iArr4[WinterFlowVariableVersionControl3] = i36;
                            objArr4[WinterFlowVariableVersionControl3] = objArr3[i35];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i35++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    WinterFlowVariableVersionControl = WinterFlowVariableVersionControl(i6);
                }
                this.WinterFlowVariableVersionControl++;
                int i40 = this.WinterFlowTransactionManagerStrategy;
                long[] jArr7 = this.WinterFlowRouterStructure;
                int i41 = WinterFlowVariableVersionControl >> 3;
                long j18 = jArr7[i41];
                int i42 = (WinterFlowVariableVersionControl & 7) << 3;
                if (((j18 >> i42) & j) != j3) {
                    i2 = i19;
                }
                this.WinterFlowTransactionManagerStrategy = i40 - i2;
                int i43 = this.WinterFlowArrayNetwork;
                long j19 = (j18 & (~(j << i42))) | (j2 << i42);
                jArr7[i41] = j19;
                jArr7[(((WinterFlowVariableVersionControl - 7) & i43) + (i43 & 7)) >> 3] = j19;
                return WinterFlowVariableVersionControl;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i18;
        }
    }

    public final void WinterFlowCacheManagerAgent() {
        this.WinterFlowVariableVersionControl = 0;
        long[] jArr = this.WinterFlowRouterStructure;
        if (jArr != WinterFlowDatabaseSchemaUtility.WinterFlowRouterStructure) {
            WinterFlowProtocolPipeline.WinterFlowConfiguration(jArr, -9187201950435737472L);
            long[] jArr2 = this.WinterFlowRouterStructure;
            int i = this.WinterFlowArrayNetwork;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        WinterFlowProtocolPipeline.WinterFlowProxyStructure(this.WinterFlowCacheManagerAgent, 0, this.WinterFlowArrayNetwork);
        this.WinterFlowTransactionManagerStrategy = WinterFlowDatabaseSchemaUtility.WinterFlowRouterStructure(this.WinterFlowArrayNetwork) - this.WinterFlowVariableVersionControl;
    }

    public final void WinterFlowRouterRouter(int i, Object obj) {
        int WinterFlowArrayNetwork = WinterFlowArrayNetwork(i);
        this.WinterFlowHookDataSource[WinterFlowArrayNetwork] = i;
        this.WinterFlowCacheManagerAgent[WinterFlowArrayNetwork] = obj;
    }

    public final void WinterFlowTransactionManagerStrategy(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, WinterFlowDatabaseSchemaUtility.WinterFlowCacheManagerAgent(i)) : 0;
        this.WinterFlowArrayNetwork = max;
        if (max == 0) {
            jArr = WinterFlowDatabaseSchemaUtility.WinterFlowRouterStructure;
        } else {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.WinterFlowRouterStructure = jArr;
        int i3 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.WinterFlowTransactionManagerStrategy = WinterFlowDatabaseSchemaUtility.WinterFlowRouterStructure(this.WinterFlowArrayNetwork) - this.WinterFlowVariableVersionControl;
        this.WinterFlowHookDataSource = new int[max];
        this.WinterFlowCacheManagerAgent = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowUnitTestResponse(int i) {
        int i2;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.WinterFlowArrayNetwork;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.WinterFlowRouterStructure;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.WinterFlowHookDataSource[i2] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        if (i2 < 0) {
            return null;
        }
        this.WinterFlowVariableVersionControl--;
        long[] jArr2 = this.WinterFlowRouterStructure;
        int i10 = this.WinterFlowArrayNetwork;
        int i11 = i2 >> 3;
        int i12 = (i2 & 7) << 3;
        long j4 = (jArr2[i11] & (~(255 << i12))) | (254 << i12);
        jArr2[i11] = j4;
        jArr2[(((i2 - 7) & i10) + (i10 & 7)) >> 3] = j4;
        Object[] objArr = this.WinterFlowCacheManagerAgent;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    public final int WinterFlowVariableVersionControl(int i) {
        int i2 = this.WinterFlowArrayNetwork;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.WinterFlowRouterStructure;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public /* synthetic */ WinterFlowViewSoftware() {
        this(6);
    }
}
