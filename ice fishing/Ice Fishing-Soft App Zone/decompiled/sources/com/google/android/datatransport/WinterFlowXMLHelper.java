package com.google.android.datatransport;

import android.util.Base64;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowXMLHelper {
    public final List WinterFlowArrayNetwork;
    public final String WinterFlowCacheManagerAgent;
    public final String WinterFlowHookDataSource;
    public final String WinterFlowRouterStructure;
    public final String WinterFlowTransactionManagerStrategy;
    public final String WinterFlowUnitTestResponse;
    public final String WinterFlowVariableVersionControl;

    public WinterFlowXMLHelper(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.WinterFlowRouterStructure = str;
        str2.getClass();
        this.WinterFlowHookDataSource = str2;
        this.WinterFlowCacheManagerAgent = str3;
        list.getClass();
        this.WinterFlowArrayNetwork = list;
        this.WinterFlowVariableVersionControl = str4;
        this.WinterFlowTransactionManagerStrategy = str5;
        StringBuilder sb = new StringBuilder(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        sb.append("-");
        sb.append(str4);
        if (str5 != null) {
            int length = str5.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                int codePointAt = str5.codePointAt(i);
                if (!Character.isWhitespace(codePointAt)) {
                    sb.append("-VF");
                    break;
                }
                i += Character.charCount(codePointAt);
            }
        }
        this.WinterFlowUnitTestResponse = sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontRequest {mProviderAuthority: " + this.WinterFlowRouterStructure + ", mProviderPackage: " + this.WinterFlowHookDataSource + ", mQuery: " + this.WinterFlowCacheManagerAgent + ", mSystemFont: " + this.WinterFlowVariableVersionControl + ", mVariationSettings: " + this.WinterFlowTransactionManagerStrategy + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.WinterFlowArrayNetwork;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
