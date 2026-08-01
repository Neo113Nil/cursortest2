package com.google.android.datatransport;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCacheTransaction {
    public static final Set WinterFlowArrayNetwork;
    public static final String WinterFlowCacheManagerAgent;
    public static final WinterFlowCacheTransaction WinterFlowTransactionManagerStrategy;
    public static final WinterFlowCacheTransaction WinterFlowVariableVersionControl;
    public final String WinterFlowHookDataSource;
    public final String WinterFlowRouterStructure;

    static {
        String WinterFlowRouterRouter = WinterFlowPackageProcess.WinterFlowRouterRouter("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        WinterFlowCacheManagerAgent = WinterFlowRouterRouter;
        String WinterFlowRouterRouter2 = WinterFlowPackageProcess.WinterFlowRouterRouter("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String WinterFlowRouterRouter3 = WinterFlowPackageProcess.WinterFlowRouterRouter("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        WinterFlowArrayNetwork = Collections.unmodifiableSet(new HashSet(Arrays.asList(new WinterFlowFrontendCache("proto"), new WinterFlowFrontendCache("json"))));
        WinterFlowVariableVersionControl = new WinterFlowCacheTransaction(WinterFlowRouterRouter, null);
        WinterFlowTransactionManagerStrategy = new WinterFlowCacheTransaction(WinterFlowRouterRouter2, WinterFlowRouterRouter3);
    }

    public WinterFlowCacheTransaction(String str, String str2) {
        this.WinterFlowRouterStructure = str;
        this.WinterFlowHookDataSource = str2;
    }

    public static WinterFlowCacheTransaction WinterFlowRouterStructure(byte[] bArr) {
        String str = new String(bArr, Charset.forName(Constants.ENCODING));
        if (!str.startsWith("1$")) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Version marker missing from extras");
            return null;
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Missing endpoint in CCTDestination extras");
            return null;
        }
        String str3 = split[1];
        return new WinterFlowCacheTransaction(str2, str3.isEmpty() ? null : str3);
    }
}
