package androidx.versionedparcelable;

import java.util.Arrays;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class ObsidianEngineRouterPrefixHBeaapzQCGbthVZXXN71765915739771 {
    public int AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public long[] ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public ObsidianEngineRouterPrefixHBeaapzQCGbthVZXXN71765915739771(int i) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = i == 0 ? NovaLayerOperatorServiceWckaen920NggX6F7Ou20602831666775.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 : new long[i];
    }

    public final void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(long j) {
        int i = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 + 1;
        long[] jArr = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (jArr.length < i) {
            this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        int i2 = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        jArr2[i2] = j;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ObsidianEngineRouterPrefixHBeaapzQCGbthVZXXN71765915739771) {
            ObsidianEngineRouterPrefixHBeaapzQCGbthVZXXN71765915739771 obsidianEngineRouterPrefixHBeaapzQCGbthVZXXN71765915739771 = (ObsidianEngineRouterPrefixHBeaapzQCGbthVZXXN71765915739771) obj;
            int i = obsidianEngineRouterPrefixHBeaapzQCGbthVZXXN71765915739771.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
            int i2 = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
            if (i == i2) {
                long[] jArr = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                long[] jArr2 = obsidianEngineRouterPrefixHBeaapzQCGbthVZXXN71765915739771.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                DragonRouteFunctionFilterVYkGtIFe9rTqxUqnzp24914659461482 VertexLinkProviderDependencyKKfth2vVCV2iqzAPu071258294892353 = DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.VertexLinkProviderDependencyKKfth2vVCV2iqzAPu071258294892353(0, i2);
                int i3 = VertexLinkProviderDependencyKKfth2vVCV2iqzAPu071258294892353.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                int i4 = VertexLinkProviderDependencyKKfth2vVCV2iqzAPu071258294892353.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        int i = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Long.hashCode(jArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        int i = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j);
            i2++;
        }
        return sb.toString();
    }
}
