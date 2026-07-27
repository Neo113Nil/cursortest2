package androidx.versionedparcelable;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class CrimsonRouteCompressionReflectionYPI0RBwovwlqLSThOm14925231793195 implements HeliosRuntimeConstructorAPILc4Cju6MwWtqpy13Zh59478735005769 {
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public /* synthetic */ CrimsonRouteCompressionReflectionYPI0RBwovwlqLSThOm14925231793195(int i) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
    }

    @Override // androidx.versionedparcelable.HeliosRuntimeConstructorAPILc4Cju6MwWtqpy13Zh59478735005769
    public final void ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(SolarMeshHandlerMutexHh7aZZaEt5oqfOHtG819236442583306 solarMeshHandlerMutexHh7aZZaEt5oqfOHtG819236442583306, int i, int[] iArr, HeliosRuntimeVariableInheritanceMn6y0Y6u9gAylmwc5F75136047155422 heliosRuntimeVariableInheritanceMn6y0Y6u9gAylmwc5F75136047155422, int[] iArr2) {
        int i2 = 0;
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i2 < length) {
                    int i5 = iArr[i2];
                    iArr2[i3] = i4;
                    i4 += i5;
                    i2++;
                    i3++;
                }
                break;
            case 1:
                int i6 = 0;
                for (int i7 : iArr) {
                    i6 += i7;
                }
                int length2 = iArr.length;
                int i8 = i - i6;
                int i9 = 0;
                while (i2 < length2) {
                    int i10 = iArr[i2];
                    iArr2[i9] = i8;
                    i8 += i10;
                    i2++;
                    i9++;
                }
                break;
            default:
                if (heliosRuntimeVariableInheritanceMn6y0Y6u9gAylmwc5F75136047155422 == HeliosRuntimeVariableInheritanceMn6y0Y6u9gAylmwc5F75136047155422.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
                    int length3 = iArr.length;
                    int i11 = 0;
                    int i12 = 0;
                    while (i2 < length3) {
                        int i13 = iArr[i2];
                        iArr2[i11] = i12;
                        i12 += i13;
                        i2++;
                        i11++;
                    }
                    break;
                } else {
                    int length4 = iArr.length;
                    int i14 = 0;
                    while (i2 < length4) {
                        i14 += iArr[i2];
                        i2++;
                    }
                    int i15 = i - i14;
                    int length5 = iArr.length;
                    while (true) {
                        length5--;
                        if (-1 >= length5) {
                            break;
                        } else {
                            int i16 = iArr[length5];
                            iArr2[length5] = i15;
                            i15 += i16;
                        }
                    }
                }
        }
    }

    public final String toString() {
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            default:
                return "Arrangement#Start";
        }
    }
}
