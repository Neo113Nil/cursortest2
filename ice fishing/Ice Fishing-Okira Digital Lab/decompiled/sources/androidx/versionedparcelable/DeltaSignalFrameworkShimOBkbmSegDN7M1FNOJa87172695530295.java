package androidx.versionedparcelable;

import android.util.Base64;
import java.util.List;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class DeltaSignalFrameworkShimOBkbmSegDN7M1FNOJa87172695530295 {
    public final String ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final String AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final String LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final String ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
    public final List RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final String YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public DeltaSignalFrameworkShimOBkbmSegDN7M1FNOJa87172695530295(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = str;
        str2.getClass();
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = str2;
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = str3;
        list.getClass();
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = list;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = str4;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = str5;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        sb.append("-");
        sb.append(str4);
        sb.append("-");
        sb.append(str5);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 + ", mProviderPackage: " + this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 + ", mQuery: " + this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 + ", mSystemFont: " + this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 + ", mVariationSettings: " + this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
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
