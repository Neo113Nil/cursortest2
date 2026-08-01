package com.google.android.datatransport;

import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowLibraryCache {
    public int WinterFlowArrayNetwork;
    public int[] WinterFlowCacheManagerAgent;
    public Object[] WinterFlowHookDataSource;
    public long[] WinterFlowRouterStructure;
    public int WinterFlowTransactionManagerStrategy;
    public int WinterFlowVariableVersionControl;

    public WinterFlowLibraryCache(int i) {
        this.WinterFlowRouterStructure = WinterFlowDatabaseSchemaUtility.WinterFlowRouterStructure;
        this.WinterFlowHookDataSource = WinterFlowHandlerWebsocket.WinterFlowUnitTestResponse;
        this.WinterFlowCacheManagerAgent = WinterFlowConfigurationUtility.WinterFlowRouterStructure;
        if (i >= 0) {
            WinterFlowVariableVersionControl(WinterFlowDatabaseSchemaUtility.WinterFlowArrayNetwork(i));
        } else {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int WinterFlowArrayNetwork(Object obj) {
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.WinterFlowArrayNetwork;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.WinterFlowRouterStructure;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowHookDataSource[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    public final int WinterFlowCacheManagerAgent(Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i2 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.WinterFlowArrayNetwork;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.WinterFlowRouterStructure;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
            long j5 = i5;
            int i11 = i5;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i7 + (Long.numberOfTrailingZeros(j7) >> 3)) & i6;
                int i12 = i2;
                if (WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowHookDataSource[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i2 = i12;
            }
            int i13 = i2;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int WinterFlowHookDataSource = WinterFlowHookDataSource(i4);
                long j8 = 255;
                if (this.WinterFlowTransactionManagerStrategy != 0 || ((this.WinterFlowRouterStructure[WinterFlowHookDataSource >> 3] >> ((WinterFlowHookDataSource & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i14 = this.WinterFlowArrayNetwork;
                    if (i14 > 8) {
                        int i15 = 8;
                        if (Long.compareUnsigned(this.WinterFlowVariableVersionControl * 32, i14 * 25) <= 0) {
                            long[] jArr4 = this.WinterFlowRouterStructure;
                            int i16 = this.WinterFlowArrayNetwork;
                            Object[] objArr2 = this.WinterFlowHookDataSource;
                            int[] iArr = this.WinterFlowCacheManagerAgent;
                            j3 = 128;
                            int i17 = (i16 + 7) >> 3;
                            int i18 = 0;
                            while (i18 < i17) {
                                long j9 = j8;
                                long j10 = jArr4[i18] & (-9187201950435737472L);
                                jArr4[i18] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i18++;
                                i15 = i15;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i19 = i15;
                            int WinterFlowCompilerDataSource = WinterFlowProtocolPipeline.WinterFlowCompilerDataSource(jArr4);
                            int i20 = WinterFlowCompilerDataSource - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i20] = (jArr4[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[WinterFlowCompilerDataSource] = jArr4[0];
                            int i21 = 0;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j12 = (jArr4[i22] >> i23) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj2 = objArr2[i21];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i13;
                                    int i24 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int WinterFlowHookDataSource2 = WinterFlowHookDataSource(i24);
                                    int i25 = i24 & i16;
                                    long j13 = j11;
                                    if (((WinterFlowHookDataSource2 - i25) & i16) / 8 == ((i21 - i25) & i16) / i19) {
                                        jArr4[i22] = ((r8 & 127) << i23) | (jArr4[i22] & (~(j << i23)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i21++;
                                        i19 = i19;
                                        j11 = j13;
                                    } else {
                                        int i26 = i19;
                                        int i27 = WinterFlowHookDataSource2 >> 3;
                                        long j14 = jArr4[i27];
                                        int i28 = (WinterFlowHookDataSource2 & 7) << 3;
                                        if (((j14 >> i28) & j) == 128) {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((~(j << i28)) & j14) | ((r8 & 127) << i28);
                                            jArr4[i22] = (jArr4[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[WinterFlowHookDataSource2] = objArr[i21];
                                            objArr[i21] = null;
                                            iArr[WinterFlowHookDataSource2] = iArr[i21];
                                            iArr[i21] = 0;
                                        } else {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((r8 & 127) << i28) | ((~(j << i28)) & j14);
                                            Object obj3 = objArr[WinterFlowHookDataSource2];
                                            objArr[WinterFlowHookDataSource2] = objArr[i21];
                                            objArr[i21] = obj3;
                                            int i29 = iArr[WinterFlowHookDataSource2];
                                            iArr[WinterFlowHookDataSource2] = iArr[i21];
                                            iArr[i21] = i29;
                                            i21--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i21++;
                                        i16 = i;
                                        i19 = i26;
                                        j11 = j13;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            this.WinterFlowTransactionManagerStrategy = WinterFlowDatabaseSchemaUtility.WinterFlowRouterStructure(this.WinterFlowArrayNetwork) - this.WinterFlowVariableVersionControl;
                            WinterFlowHookDataSource = WinterFlowHookDataSource(i4);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int WinterFlowHookDataSource3 = WinterFlowDatabaseSchemaUtility.WinterFlowHookDataSource(this.WinterFlowArrayNetwork);
                    long[] jArr5 = this.WinterFlowRouterStructure;
                    Object[] objArr3 = this.WinterFlowHookDataSource;
                    int[] iArr2 = this.WinterFlowCacheManagerAgent;
                    int i30 = this.WinterFlowArrayNetwork;
                    WinterFlowVariableVersionControl(WinterFlowHookDataSource3);
                    long[] jArr6 = this.WinterFlowRouterStructure;
                    Object[] objArr4 = this.WinterFlowHookDataSource;
                    int[] iArr3 = this.WinterFlowCacheManagerAgent;
                    int i31 = this.WinterFlowArrayNetwork;
                    int i32 = 0;
                    while (i32 < i30) {
                        if (((jArr5[i32 >> 3] >> ((i32 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i32];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i13;
                            int i33 = hashCode3 ^ (hashCode3 << 16);
                            int WinterFlowHookDataSource4 = WinterFlowHookDataSource(i33 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j15 = i33 & 127;
                            int i34 = WinterFlowHookDataSource4 >> 3;
                            int i35 = (WinterFlowHookDataSource4 & 7) << 3;
                            long j16 = (jArr[i34] & (~(255 << i35))) | (j15 << i35);
                            jArr[i34] = j16;
                            jArr[(((WinterFlowHookDataSource4 - 7) & i31) + (i31 & 7)) >> 3] = j16;
                            objArr4[WinterFlowHookDataSource4] = obj4;
                            iArr3[WinterFlowHookDataSource4] = iArr2[i32];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i32++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    WinterFlowHookDataSource = WinterFlowHookDataSource(i4);
                }
                this.WinterFlowVariableVersionControl++;
                int i36 = this.WinterFlowTransactionManagerStrategy;
                long[] jArr7 = this.WinterFlowRouterStructure;
                int i37 = WinterFlowHookDataSource >> 3;
                long j17 = jArr7[i37];
                int i38 = (WinterFlowHookDataSource & 7) << 3;
                this.WinterFlowTransactionManagerStrategy = i36 - (((j17 >> i38) & j) == j3 ? 1 : 0);
                int i39 = this.WinterFlowArrayNetwork;
                long j18 = (j17 & (~(j << i38))) | (j2 << i38);
                jArr7[i37] = j18;
                jArr7[(((WinterFlowHookDataSource - 7) & i39) + (i39 & 7)) >> 3] = j18;
                return ~WinterFlowHookDataSource;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
            i2 = i13;
        }
    }

    public final int WinterFlowHookDataSource(int i) {
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

    public final void WinterFlowRouterStructure() {
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
        WinterFlowProtocolPipeline.WinterFlowProxyStructure(this.WinterFlowHookDataSource, 0, this.WinterFlowArrayNetwork);
        this.WinterFlowTransactionManagerStrategy = WinterFlowDatabaseSchemaUtility.WinterFlowRouterStructure(this.WinterFlowArrayNetwork) - this.WinterFlowVariableVersionControl;
    }

    public final void WinterFlowTransactionManagerStrategy(int i) {
        this.WinterFlowVariableVersionControl--;
        long[] jArr = this.WinterFlowRouterStructure;
        int i2 = this.WinterFlowArrayNetwork;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.WinterFlowHookDataSource[i] = null;
    }

    public final void WinterFlowUnitTestResponse(int i, Object obj) {
        int WinterFlowCacheManagerAgent = WinterFlowCacheManagerAgent(obj);
        if (WinterFlowCacheManagerAgent < 0) {
            WinterFlowCacheManagerAgent = ~WinterFlowCacheManagerAgent;
        }
        this.WinterFlowHookDataSource[WinterFlowCacheManagerAgent] = obj;
        this.WinterFlowCacheManagerAgent[WinterFlowCacheManagerAgent] = i;
    }

    public final void WinterFlowVariableVersionControl(int i) {
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
        this.WinterFlowHookDataSource = new Object[max];
        this.WinterFlowCacheManagerAgent = new int[max];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WinterFlowLibraryCache)) {
            return false;
        }
        WinterFlowLibraryCache winterFlowLibraryCache = (WinterFlowLibraryCache) obj;
        if (winterFlowLibraryCache.WinterFlowVariableVersionControl != this.WinterFlowVariableVersionControl) {
            return false;
        }
        Object[] objArr = this.WinterFlowHookDataSource;
        int[] iArr = this.WinterFlowCacheManagerAgent;
        long[] jArr = this.WinterFlowRouterStructure;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            int i5 = iArr[i4];
                            int WinterFlowArrayNetwork = winterFlowLibraryCache.WinterFlowArrayNetwork(obj2);
                            if (WinterFlowArrayNetwork < 0 || i5 != winterFlowLibraryCache.WinterFlowCacheManagerAgent[WinterFlowArrayNetwork]) {
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = this.WinterFlowHookDataSource;
        int[] iArr = this.WinterFlowCacheManagerAgent;
        long[] jArr = this.WinterFlowRouterStructure;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        Object obj = objArr[i5];
                        i2 += Integer.hashCode(iArr[i5]) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i == length) {
                return i2;
            }
            i++;
        }
    }

    public final String toString() {
        if (this.WinterFlowVariableVersionControl == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.WinterFlowHookDataSource;
        int[] iArr = this.WinterFlowCacheManagerAgent;
        long[] jArr = this.WinterFlowRouterStructure;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            Object obj = objArr[i5];
                            int i6 = iArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i6);
                            i2++;
                            if (i2 < this.WinterFlowVariableVersionControl) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ WinterFlowLibraryCache() {
        this(6);
    }
}
