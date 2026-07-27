package androidx.versionedparcelable;

import java.util.Iterator;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public class XenoGridModuleCoroutineHlUef7a4NJ2VelHlLP95472365912153 implements Iterable, LunarNodeContextRuntimeSCpyKGDYBhqjPXAetg19809747678198 {
    public final int LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final int YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public XenoGridModuleCoroutineHlUef7a4NJ2VelHlLP95472365912153(int i, int i2, int i3) {
        if (i3 == 0) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                int i5 = i % i3;
                int i6 = ((i4 < 0 ? i4 + i3 : i4) - (i5 < 0 ? i5 + i3 : i5)) % i3;
                i2 -= i6 < 0 ? i6 + i3 : i6;
            }
        } else {
            if (i3 >= 0) {
                CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("Step is zero.");
                throw null;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                int i9 = i2 % i7;
                int i10 = ((i8 < 0 ? i8 + i7 : i8) - (i9 < 0 ? i9 + i7 : i9)) % i7;
                i2 += i10 < 0 ? i10 + i7 : i10;
            }
        }
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = i2;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof XenoGridModuleCoroutineHlUef7a4NJ2VelHlLP95472365912153)) {
            return false;
        }
        if (isEmpty() && ((XenoGridModuleCoroutineHlUef7a4NJ2VelHlLP95472365912153) obj).isEmpty()) {
            return true;
        }
        XenoGridModuleCoroutineHlUef7a4NJ2VelHlLP95472365912153 xenoGridModuleCoroutineHlUef7a4NJ2VelHlLP95472365912153 = (XenoGridModuleCoroutineHlUef7a4NJ2VelHlLP95472365912153) obj;
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 == xenoGridModuleCoroutineHlUef7a4NJ2VelHlLP95472365912153.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 && this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 == xenoGridModuleCoroutineHlUef7a4NJ2VelHlLP95472365912153.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 && this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 == xenoGridModuleCoroutineHlUef7a4NJ2VelHlLP95472365912153.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 * 31) + this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) * 31) + this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
    }

    public boolean isEmpty() {
        int i = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        int i2 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        int i3 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        return i2 > 0 ? i3 > i : i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new MysticCacheShimAdapterKvodTn1wUkxoMgzEbf10145788502596(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867, this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        int i2 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        int i3 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
