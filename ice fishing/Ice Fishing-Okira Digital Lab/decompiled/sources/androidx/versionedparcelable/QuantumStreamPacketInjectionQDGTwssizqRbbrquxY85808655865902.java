package androidx.versionedparcelable;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class QuantumStreamPacketInjectionQDGTwssizqRbbrquxY85808655865902 implements JadeCircuitInterpreterFilterXiwDG4bLUsOdbjkQ0x27532840472715 {
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = 1;

    @Override // androidx.versionedparcelable.JadeCircuitInterpreterFilterXiwDG4bLUsOdbjkQ0x27532840472715
    public final void TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(int i, AxiomCoreContainerFactoryVXzJMkyufLYYJp8iJR87064821634718 axiomCoreContainerFactoryVXzJMkyufLYYJp8iJR87064821634718, int[] iArr, int[] iArr2) {
        int i2 = 0;
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i3 = 0;
                for (int i4 : iArr) {
                    i3 += i4;
                }
                int i5 = i - i3;
                int length = iArr.length;
                int i6 = 0;
                while (i2 < length) {
                    int i7 = iArr[i2];
                    iArr2[i6] = i5;
                    i5 += i7;
                    i2++;
                    i6++;
                }
                break;
            default:
                int length2 = iArr.length;
                int i8 = 0;
                int i9 = 0;
                while (i2 < length2) {
                    int i10 = iArr[i2];
                    iArr2[i8] = i9;
                    i9 += i10;
                    i2++;
                    i8++;
                }
                break;
        }
    }

    public final String toString() {
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
