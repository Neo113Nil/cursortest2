package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Comparator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowParserPlatform implements Comparator {
    public final /* synthetic */ Comparator WinterFlowHookDataSource;
    public final /* synthetic */ int WinterFlowRouterStructure = 1;

    public WinterFlowParserPlatform(WinterFlowParserPlatform winterFlowParserPlatform) {
        this.WinterFlowHookDataSource = winterFlowParserPlatform;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.WinterFlowRouterStructure;
        Comparator comparator = this.WinterFlowHookDataSource;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int compare = comparator.compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                return WinterFlowSchedulerStructure.WinterFlowFrameworkTransaction.compare(((WinterFlowProcessorSystem) obj).WinterFlowCacheManagerAgent, ((WinterFlowProcessorSystem) obj2).WinterFlowCacheManagerAgent);
            default:
                int compare2 = ((WinterFlowParserPlatform) comparator).compare(obj, obj2);
                return compare2 != 0 ? compare2 : Integer.valueOf(((WinterFlowProcessorSystem) obj).WinterFlowTransactionManagerStrategy).compareTo(Integer.valueOf(((WinterFlowProcessorSystem) obj2).WinterFlowTransactionManagerStrategy));
        }
    }

    public WinterFlowParserPlatform(Comparator comparator) {
        this.WinterFlowHookDataSource = comparator;
    }
}
