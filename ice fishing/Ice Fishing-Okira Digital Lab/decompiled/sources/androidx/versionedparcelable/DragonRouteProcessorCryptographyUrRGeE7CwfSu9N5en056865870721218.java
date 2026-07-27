package androidx.versionedparcelable;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class DragonRouteProcessorCryptographyUrRGeE7CwfSu9N5en056865870721218 extends MysticCacheMiddlewareValidationK0eKCvAbZWfuY3GE3C11344960906867 {
    public static DragonRouteProcessorCryptographyUrRGeE7CwfSu9N5en056865870721218 ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;

    public final boolean LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(int i) {
        if (i <= 0 || ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495().charAt(i - 1) == '\n') {
            return false;
        }
        return i == ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495().length() || ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495().charAt(i) == '\n';
    }

    @Override // androidx.versionedparcelable.MysticCacheMiddlewareValidationK0eKCvAbZWfuY3GE3C11344960906867
    public final int[] ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(int i) {
        int length = ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495().charAt(i) == '\n' && (ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495().charAt(i) == '\n' || (i != 0 && ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(i2)) {
            i2++;
        }
        return AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return null;
     */
    @Override // androidx.versionedparcelable.MysticCacheMiddlewareValidationK0eKCvAbZWfuY3GE3C11344960906867
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(int i) {
        int length = ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495().charAt(i - 1) == '\n' && !LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(i)) {
            i--;
        }
        int i2 = i - 1;
        while (i2 > 0 && (ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495().charAt(i2) == '\n' || (i2 != 0 && ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(i2, i);
    }
}
