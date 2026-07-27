package androidx.versionedparcelable;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class MysticCacheFloatingPointReducerTjN36VKOz7Wi96z46h14561638880681 implements ListIterator, LunarNodeContextRuntimeSCpyKGDYBhqjPXAetg19809747678198 {
    public final List LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public int YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public MysticCacheFloatingPointReducerTjN36VKOz7Wi96z46h14561638880681(List list, int i, int i2) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i2;
        switch (i2) {
            case 1:
                this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = list;
                this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = i;
                break;
            default:
                this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = list;
                this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = i - 1;
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        List list = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i2 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 + 1;
                this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = i2;
                list.add(i2, obj);
                break;
            default:
                list.add(this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170, obj);
                this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170++;
                break;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        List list = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 < list.size() - 1) {
                    break;
                }
                break;
            default:
                if (this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 < list.size()) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 >= 0) {
                }
                break;
            default:
                if (this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        List list = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i2 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 + 1;
                this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = i2;
                return list.get(i2);
            default:
                int i3 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = i3 + 1;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 + 1;
            default:
                return this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        List list = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i2 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = i2 - 1;
                return list.get(i2);
            default:
                int i3 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 - 1;
                this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = i3;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
            default:
                return this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        List list = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                list.remove(this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170--;
                break;
            default:
                int i2 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 - 1;
                this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = i2;
                list.remove(i2);
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        List list = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                list.set(this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170, obj);
                break;
            default:
                list.set(this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170, obj);
                break;
        }
    }
}
