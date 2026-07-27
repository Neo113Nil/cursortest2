package androidx.versionedparcelable;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class VertexLinkOperatorAggregationGAXQwc2SMIB2UQvBFu18813641235301 extends SolarMeshLibrarySchedulerEResabx5PyisRn46h746904294733235 {
    public abstract VertexLinkOperatorAggregationGAXQwc2SMIB2UQvBFu18813641235301 ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(Object obj);

    public abstract VertexLinkOperatorAggregationGAXQwc2SMIB2UQvBFu18813641235301 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(int i, Object obj);

    public abstract VertexLinkOperatorAggregationGAXQwc2SMIB2UQvBFu18813641235301 BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(int i, Object obj);

    public abstract CrimsonRouteChannelValidationQuDzYRQJqthfRn0iSd45744956352241 LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119();

    public VertexLinkOperatorAggregationGAXQwc2SMIB2UQvBFu18813641235301 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(Collection collection) {
        CrimsonRouteChannelValidationQuDzYRQJqthfRn0iSd45744956352241 LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119();
        LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.addAll(collection);
        return LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495();
    }

    public abstract VertexLinkOperatorAggregationGAXQwc2SMIB2UQvBFu18813641235301 TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(int i);

    public abstract VertexLinkOperatorAggregationGAXQwc2SMIB2UQvBFu18813641235301 YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(LunarNodeClosureValidationOfuyTp2Ok1Sw6vUIRZ71666421638180 lunarNodeClosureValidationOfuyTp2Ok1Sw6vUIRZ71666421638180);

    @Override // androidx.versionedparcelable.DragonRouteStorageLambdaHkyjD6E6nhE2uWRlS477398959758048, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // androidx.versionedparcelable.DragonRouteStorageLambdaHkyjD6E6nhE2uWRlS477398959758048, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.versionedparcelable.SolarMeshLibrarySchedulerEResabx5PyisRn46h746904294733235, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // androidx.versionedparcelable.SolarMeshLibrarySchedulerEResabx5PyisRn46h746904294733235, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // androidx.versionedparcelable.SolarMeshLibrarySchedulerEResabx5PyisRn46h746904294733235, java.util.List
    public final List subList(int i, int i2) {
        return new HeliosRuntimeSchedulerRuntimeHeg7c73UXtXQP2C7CA74277792616205(this, i, i2);
    }
}
