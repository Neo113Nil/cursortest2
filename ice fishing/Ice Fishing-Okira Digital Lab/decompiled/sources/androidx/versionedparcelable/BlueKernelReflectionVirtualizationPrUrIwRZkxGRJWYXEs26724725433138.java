package androidx.versionedparcelable;

import java.util.Arrays;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class BlueKernelReflectionVirtualizationPrUrIwRZkxGRJWYXEs26724725433138 {
    public int AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public int[] ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public BlueKernelReflectionVirtualizationPrUrIwRZkxGRJWYXEs26724725433138() {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new int[10];
    }

    public void ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(int i) {
        int[] iArr = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = iArr;
        }
        int i2 = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = i2 + 1;
        iArr[i2] = i;
    }

    public int AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365() {
        int[] iArr = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        int i = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 - 1;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = i;
        return iArr[i];
    }

    public void LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(int i, int i2, int i3, int i4) {
        int i5 = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        int[] iArr = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        int i6 = i5 + 4;
        if (i6 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = iArr;
        }
        iArr[i5] = i;
        iArr[i5 + 1] = i2;
        iArr[i5 + 2] = i3;
        iArr[i5 + 3] = i4;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = i6;
    }

    public int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(int i) {
        int i2 = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 - 1;
        return i2 >= 0 ? this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800[i2] : i;
    }

    public void RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(int i, int i2, int i3) {
        int i4 = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        int[] iArr = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        int i5 = i4 + 3;
        if (i5 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = iArr;
        }
        iArr[i4] = i + i3;
        iArr[i4 + 1] = i2 + i3;
        iArr[i4 + 2] = i3;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = i5;
    }

    public void TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(int i, int i2) {
        int[] iArr = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
    }

    public void YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(i3, i4);
                }
            }
            TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(i3 + 3, i2);
            YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(i, i3);
            YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(i3 + 6, i2);
        }
    }

    public BlueKernelReflectionVirtualizationPrUrIwRZkxGRJWYXEs26724725433138(int i) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new int[i];
    }
}
