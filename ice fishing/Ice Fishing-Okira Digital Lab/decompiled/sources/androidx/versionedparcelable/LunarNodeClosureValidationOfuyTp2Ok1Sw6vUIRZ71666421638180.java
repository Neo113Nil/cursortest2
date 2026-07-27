package androidx.versionedparcelable;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final /* synthetic */ class LunarNodeClosureValidationOfuyTp2Ok1Sw6vUIRZ71666421638180 implements DragonRouteMultithreadingControllerJZnCtXJgzUmpVbAfL848868216870865 {
    public final /* synthetic */ Collection LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public /* synthetic */ LunarNodeClosureValidationOfuyTp2Ok1Sw6vUIRZ71666421638180(int i, Collection collection) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = collection;
    }

    @Override // androidx.versionedparcelable.DragonRouteMultithreadingControllerJZnCtXJgzUmpVbAfL848868216870865
    public final Object UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(Object obj) {
        boolean contains;
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        Collection<?> collection = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                contains = collection.contains(obj);
                break;
            case 1:
                contains = collection.contains(obj);
                break;
            default:
                contains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(contains);
    }
}
