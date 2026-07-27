package androidx.versionedparcelable;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public class ArcticByteBinaryCompressionKwZmbP1ar0amViYotf74728707286763 implements Iterator, LunarNodeContextRuntimeSCpyKGDYBhqjPXAetg19809747678198 {
    public int LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final Object YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public /* synthetic */ ArcticByteBinaryCompressionKwZmbP1ar0amViYotf74728707286763(int i, Object obj) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        Object obj = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 < ((SolarMeshLibrarySchedulerEResabx5PyisRn46h746904294733235) obj).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800()) {
                    break;
                }
                break;
            default:
                if (this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 < ((Object[]) obj).length) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        Object obj = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!hasNext()) {
                    CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339();
                    return null;
                }
                int i2 = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = i2 + 1;
                return ((SolarMeshLibrarySchedulerEResabx5PyisRn46h746904294733235) obj).get(i2);
            default:
                try {
                    int i3 = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                    this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119--;
                    throw new NoSuchElementException(e.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
