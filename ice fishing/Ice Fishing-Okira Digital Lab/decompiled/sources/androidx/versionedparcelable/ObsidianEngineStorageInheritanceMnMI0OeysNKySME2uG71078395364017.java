package androidx.versionedparcelable;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class ObsidianEngineStorageInheritanceMnMI0OeysNKySME2uG71078395364017 implements SolarMeshAttributeEncryptionP1vGeagnDMpANlA48c51768761876114 {
    public final long ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final DragonRouteDelegateJITXnTHRIslKPbKfxEaJY54603611270972 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
    public final long RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public ObsidianEngineStorageInheritanceMnMI0OeysNKySME2uG71078395364017(int i, int i2, DragonRouteDelegateJITXnTHRIslKPbKfxEaJY54603611270972 dragonRouteDelegateJITXnTHRIslKPbKfxEaJY54603611270972) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = i;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = dragonRouteDelegateJITXnTHRIslKPbKfxEaJY54603611270972;
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = i * 1000000;
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i2 * 1000000;
    }

    @Override // androidx.versionedparcelable.SolarMeshAttributeEncryptionP1vGeagnDMpANlA48c51768761876114
    public final float ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(float f, float f2, float f3, long j) {
        long j2 = j - this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        if (j2 > j3) {
            j2 = j3;
        }
        float ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 == 0 ? 1.0f : j2 / j3);
        return (f2 * ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) + ((1.0f - ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) * f);
    }

    @Override // androidx.versionedparcelable.SolarMeshAttributeEncryptionP1vGeagnDMpANlA48c51768761876114
    public final long AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(float f, float f2, float f3) {
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 + this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    }

    @Override // androidx.versionedparcelable.SolarMeshAttributeEncryptionP1vGeagnDMpANlA48c51768761876114
    public final float RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(float f, float f2, float f3, long j) {
        long j2 = j - this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(f, f2, f3, j4) - ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(f, f2, f3, j4 - 1000000)) * 1000.0f;
    }
}
