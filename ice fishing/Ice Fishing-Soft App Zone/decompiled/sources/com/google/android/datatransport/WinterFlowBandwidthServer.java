package com.google.android.datatransport;

import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBandwidthServer {
    public Object WinterFlowCacheManagerAgent;
    public Object WinterFlowHookDataSource;
    public int WinterFlowRouterStructure;

    public void WinterFlowCacheManagerAgent(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, int i7) {
        long[] jArr = (long[]) this.WinterFlowHookDataSource;
        int i8 = this.WinterFlowRouterStructure;
        int i9 = i8 + 3;
        this.WinterFlowRouterStructure = i9;
        int length = jArr.length;
        if (length <= i9) {
            int max = Math.max(length * 2, i9);
            this.WinterFlowHookDataSource = Arrays.copyOf(jArr, max);
            this.WinterFlowCacheManagerAgent = Arrays.copyOf((long[]) this.WinterFlowCacheManagerAgent, max);
        }
        long[] jArr2 = (long[]) this.WinterFlowHookDataSource;
        jArr2[i8] = (i2 << 32) | (i3 & 4294967295L);
        jArr2[i8 + 1] = (i4 << 32) | (i5 & 4294967295L);
        int i10 = i6 & 33554431;
        jArr2[i8 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (Math.min(0, 1023) << 50) | (i10 << 25) | (i & 33554431);
        if (i6 < 0) {
            return;
        }
        for (int i11 = i7 != -1 ? i7 : i8 - 3; i11 >= 0; i11 -= 3) {
            int i12 = i11 + 2;
            long j = jArr2[i12];
            if ((((int) j) & 33554431) == i10) {
                int i13 = (i8 - i11) / 3;
                int i14 = WinterFlowDeserializationTool.WinterFlowHookDataSource;
                jArr2[i12] = (Math.min(i13, 1023) << 50) | (j & (-1151795604700004353L));
                return;
            }
        }
    }

    public int WinterFlowHookDataSource(Object obj) {
        WinterFlowLibraryCache winterFlowLibraryCache = (WinterFlowLibraryCache) this.WinterFlowHookDataSource;
        int WinterFlowArrayNetwork = winterFlowLibraryCache.WinterFlowArrayNetwork(obj);
        if (WinterFlowArrayNetwork >= 0) {
            return winterFlowLibraryCache.WinterFlowCacheManagerAgent[WinterFlowArrayNetwork];
        }
        return -1;
    }

    public WinterFlowModuleSyntax WinterFlowRouterStructure(int i) {
        if (i < 0 || i >= this.WinterFlowRouterStructure) {
            StringBuilder WinterFlowThreadListener = WinterFlowResolverBackend.WinterFlowThreadListener("Index ", i, ", size ");
            WinterFlowThreadListener.append(this.WinterFlowRouterStructure);
            WinterFlowValidatorConsumer.WinterFlowArrayNetwork(WinterFlowThreadListener.toString());
        }
        WinterFlowModuleSyntax winterFlowModuleSyntax = (WinterFlowModuleSyntax) this.WinterFlowCacheManagerAgent;
        if (winterFlowModuleSyntax != null) {
            int i2 = winterFlowModuleSyntax.WinterFlowRouterStructure;
            if (i < winterFlowModuleSyntax.WinterFlowHookDataSource + i2 && i2 <= i) {
                return winterFlowModuleSyntax;
            }
        }
        WinterFlowJSON winterFlowJSON = (WinterFlowJSON) this.WinterFlowHookDataSource;
        WinterFlowModuleSyntax winterFlowModuleSyntax2 = (WinterFlowModuleSyntax) winterFlowJSON.WinterFlowVariableVersionControl[WinterFlowManagerRequest.WinterFlowServiceUtility(i, winterFlowJSON)];
        this.WinterFlowCacheManagerAgent = winterFlowModuleSyntax2;
        return winterFlowModuleSyntax2;
    }

    public void WinterFlowTransactionManagerStrategy(int i, int i2, long j) {
        int i3;
        char c;
        char c2;
        long[] jArr = (long[]) this.WinterFlowHookDataSource;
        long[] jArr2 = (long[]) this.WinterFlowCacheManagerAgent;
        jArr2[0] = j;
        int i4 = 1;
        while (i4 > 0) {
            i4--;
            long j2 = jArr2[i4];
            int i5 = 33554431;
            int i6 = ((int) j2) & 33554431;
            char c3 = 25;
            int i7 = ((int) (j2 >> 25)) & 33554431;
            char c4 = '2';
            int i8 = ((int) (j2 >> 50)) & 1023;
            int i9 = i8 == 1023 ? this.WinterFlowRouterStructure : (i8 * 3) + i7;
            if (i7 < 0) {
                return;
            }
            while (i7 < jArr.length - 2 && i7 < i9) {
                int i10 = i7 + 2;
                long j3 = jArr[i10];
                if ((((int) (j3 >> c3)) & i5) == i6) {
                    long j4 = jArr[i7];
                    int i11 = i7 + 1;
                    i3 = i5;
                    c = c3;
                    long j5 = jArr[i11];
                    c2 = c4;
                    jArr[i7] = ((((int) j4) + i2) & 4294967295L) | ((((int) (j4 >> 32)) + i) << 32);
                    jArr[i11] = ((((int) j5) + i2) & 4294967295L) | ((((int) (j5 >> 32)) + i) << 32);
                    jArr[i10] = (((j3 >> 63) & 1) << 60) | j3;
                    if ((((int) (j3 >> c2)) & 1023) > 0) {
                        int i12 = WinterFlowDeserializationTool.WinterFlowHookDataSource;
                        jArr2[i4] = ((-1125899873288193L) & j3) | (((i7 + 3) & i3) << c);
                        i4++;
                    }
                } else {
                    i3 = i5;
                    c = c3;
                    c2 = c4;
                }
                i7 += 3;
                i5 = i3;
                c3 = c;
                c4 = c2;
            }
        }
    }

    public void WinterFlowUnitTestResponse(int i, WinterFlowVersionEngine winterFlowVersionEngine) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.WinterFlowHookDataSource;
        int i3 = this.WinterFlowRouterStructure;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 33554431) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                winterFlowVersionEngine.WinterFlowTransactionAgent(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }

    public void WinterFlowVariableVersionControl(int i, boolean z) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.WinterFlowHookDataSource;
        int i3 = this.WinterFlowRouterStructure;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            int i5 = i4 + 2;
            long j = jArr[i5];
            if ((((int) j) & 33554431) == i2) {
                long j2 = 8070450532247928831L & j;
                long j3 = z ? 1L : 0L;
                jArr[i5] = j2 | (1152921504606846976L * j3) | (j3 * Long.MIN_VALUE);
                return;
            }
        }
    }
}
