package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowAdapterManager {
    public final int WinterFlowArrayNetwork;
    public final Object[] WinterFlowCacheManagerAgent;
    public final String WinterFlowHookDataSource;
    public final WinterFlowHookBackend WinterFlowRouterStructure;

    public WinterFlowAdapterManager(WinterFlowDecoratorResponse winterFlowDecoratorResponse, String str, Object[] objArr) {
        this.WinterFlowRouterStructure = winterFlowDecoratorResponse;
        this.WinterFlowHookDataSource = str;
        this.WinterFlowCacheManagerAgent = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.WinterFlowArrayNetwork = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.WinterFlowArrayNetwork = i | (charAt2 << i2);
                return;
            } else {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    public final int WinterFlowRouterStructure() {
        int i = this.WinterFlowArrayNetwork;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
