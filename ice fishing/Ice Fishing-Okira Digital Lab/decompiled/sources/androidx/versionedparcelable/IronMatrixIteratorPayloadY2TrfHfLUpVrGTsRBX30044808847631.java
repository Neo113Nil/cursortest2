package androidx.versionedparcelable;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class IronMatrixIteratorPayloadY2TrfHfLUpVrGTsRBX30044808847631 {
    public static final void ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(int[] iArr, int i, int i2) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final int AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119() {
        throw new ConcurrentModificationException();
    }

    public static final int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(ArrayList arrayList, int i, int i2) {
        int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(arrayList, i, i2);
        return RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 >= 0 ? RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 : -(RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 + 1);
    }

    public static final int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((PhotonFrameAlgorithmEncryptionHKTgfptBq9gM5tCjSm83794243281885) arrayList.get(i4)).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            if (i5 < 0) {
                i5 += i2;
            }
            int RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598 = YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598(i5, i);
            if (RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598 < 0) {
                i3 = i4 + 1;
            } else {
                if (RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }
}
