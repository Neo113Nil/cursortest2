package androidx.versionedparcelable;

import java.util.List;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class WhiteFieldMapperRepositoryZsjQqa0rnDMRl5kIaX17789811958190 {
    public static final void AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static String ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(List list, String str, TitanCloudAsyncProxyPEMV3JKPvjZfSRvKkh63833371754750 titanCloudAsyncProxyPEMV3JKPvjZfSRvKkh63833371754750, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str2 = (i & 2) != 0 ? "" : "[\n\t";
        String str3 = (i & 4) == 0 ? "\n]" : "";
        if ((i & 32) != 0) {
            titanCloudAsyncProxyPEMV3JKPvjZfSRvKkh63833371754750 = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            if (titanCloudAsyncProxyPEMV3JKPvjZfSRvKkh63833371754750 != null) {
                sb.append((CharSequence) titanCloudAsyncProxyPEMV3JKPvjZfSRvKkh63833371754750.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }
}
