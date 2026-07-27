package androidx.versionedparcelable;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class CrimsonRouteCacheChannelSvHMys1PmtuLoD9IIX59748306732600 implements List, JadeCircuitForeachStreamGKt0bOuRmc5jaHOCiH87569307149111 {
    public final List LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public int TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public final int YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public /* synthetic */ CrimsonRouteCacheChannelSvHMys1PmtuLoD9IIX59748306732600(List list, int i, int i2, int i3) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i3;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = list;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = i;
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        int i3 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        List list = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                list.add(i + i3, obj);
                this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333++;
                break;
            default:
                list.add(i + i3, obj);
                this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333++;
                break;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        int i3 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        List list = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                collection.getClass();
                list.addAll(i + i3, collection);
                this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = collection.size() + this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                if (collection.size() > 0) {
                    break;
                }
                break;
            default:
                list.addAll(i + i3, collection);
                int size = collection.size();
                this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 += size;
                if (size > 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        List list = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        int i2 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i3 = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 - 1;
                if (i2 <= i3) {
                    while (true) {
                        list.remove(i3);
                        if (i3 != i2) {
                            i3--;
                        }
                    }
                }
                this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = i2;
                break;
            default:
                int i4 = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 - 1;
                if (i2 <= i4) {
                    while (true) {
                        list.remove(i4);
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = i2;
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        List list = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        int i2 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i3 = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                while (i2 < i3) {
                    if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(list.get(i2), obj)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                break;
            default:
                int i4 = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                while (i2 < i4) {
                    if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(list.get(i2), obj)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                collection.getClass();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        int i3 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        List list = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                NovaLayerResourceSyntaxAOxoVvV45udRQy0hmP42120637269487.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(i, this);
                break;
            default:
                VertexLinkValidationProxyIQ6RhY7ooTBzpOgoqr55167179769983.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(i, this);
                break;
        }
        return list.get(i + i3);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        List list = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        int i2 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i3 = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                for (int i4 = i2; i4 < i3; i4++) {
                    if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(list.get(i4), obj)) {
                        return i4 - i2;
                    }
                }
                return -1;
            default:
                int i5 = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                for (int i6 = i2; i6 < i5; i6++) {
                    if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(list.get(i6), obj)) {
                        return i6 - i2;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 == this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) {
                }
                break;
            default:
                if (this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 == this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new MysticCacheFloatingPointReducerTjN36VKOz7Wi96z46h14561638880681(this, 0, 0);
            default:
                return new MysticCacheFloatingPointReducerTjN36VKOz7Wi96z46h14561638880681(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        List list = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        int i2 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i3 = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 - 1;
                if (i2 <= i3) {
                    while (!YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(list.get(i3), obj)) {
                        if (i3 == i2) {
                            break;
                        } else {
                            i3--;
                        }
                    }
                    break;
                }
                break;
            default:
                int i4 = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 - 1;
                if (i2 <= i4) {
                    while (!YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(list.get(i4), obj)) {
                        if (i4 == i2) {
                            break;
                        } else {
                            i4--;
                        }
                    }
                    break;
                }
                break;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new MysticCacheFloatingPointReducerTjN36VKOz7Wi96z46h14561638880681(this, 0, 0);
            default:
                return new MysticCacheFloatingPointReducerTjN36VKOz7Wi96z46h14561638880681(this, 0, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        int i2 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        List list = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i3 = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                while (i2 < i3) {
                    if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(list.get(i2), obj)) {
                        list.remove(i2);
                        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333--;
                        break;
                    } else {
                        i2++;
                    }
                }
                break;
            default:
                int i4 = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                while (i2 < i4) {
                    if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(list.get(i2), obj)) {
                        list.remove(i2);
                        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333--;
                        break;
                    } else {
                        i2++;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                collection.getClass();
                int i = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                if (i != this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333) {
                    break;
                }
                break;
            default:
                int i2 = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                if (i2 != this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        int i2 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        List list = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                collection.getClass();
                int i3 = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                int i4 = i3 - 1;
                if (i2 <= i4) {
                    while (true) {
                        if (!collection.contains(list.get(i4))) {
                            list.remove(i4);
                            this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333--;
                        }
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                if (i3 != this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333) {
                    break;
                }
                break;
            default:
                int i5 = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                int i6 = i5 - 1;
                if (i2 <= i6) {
                    while (true) {
                        if (!collection.contains(list.get(i6))) {
                            list.remove(i6);
                            this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333--;
                        }
                        if (i6 != i2) {
                            i6--;
                        }
                    }
                }
                if (i5 != this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        int i3 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        List list = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                NovaLayerResourceSyntaxAOxoVvV45udRQy0hmP42120637269487.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(i, this);
                break;
            default:
                VertexLinkValidationProxyIQ6RhY7ooTBzpOgoqr55167179769983.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(i, this);
                break;
        }
        return list.set(i + i3, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                i = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                i2 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                break;
            default:
                i = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                i2 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                break;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                NovaLayerResourceSyntaxAOxoVvV45udRQy0hmP42120637269487.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(this, i, i2);
                return new CrimsonRouteCacheChannelSvHMys1PmtuLoD9IIX59748306732600(this, i, i2, 0);
            default:
                VertexLinkValidationProxyIQ6RhY7ooTBzpOgoqr55167179769983.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(this, i, i2);
                return new CrimsonRouteCacheChannelSvHMys1PmtuLoD9IIX59748306732600(this, i, i2, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                objArr.getClass();
                break;
        }
        return XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
        }
        return XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.HeliosRuntimeClassProviderFABQ5d2rErfEnvDVi231062942123295(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new MysticCacheFloatingPointReducerTjN36VKOz7Wi96z46h14561638880681(this, i, 0);
            default:
                return new MysticCacheFloatingPointReducerTjN36VKOz7Wi96z46h14561638880681(this, i, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        List list = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i2 = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = i2 + 1;
                list.add(i2, obj);
                break;
            default:
                int i3 = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = i3 + 1;
                list.add(i3, obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        List list = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                collection.getClass();
                list.addAll(this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333, collection);
                this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = collection.size() + this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                if (collection.size() > 0) {
                    break;
                }
                break;
            default:
                list.addAll(this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333, collection);
                int size = collection.size();
                this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 += size;
                if (size > 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        int i3 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        List list = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                NovaLayerResourceSyntaxAOxoVvV45udRQy0hmP42120637269487.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(i, this);
                this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333--;
                return list.remove(i + i3);
            default:
                VertexLinkValidationProxyIQ6RhY7ooTBzpOgoqr55167179769983.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(i, this);
                this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333--;
                return list.remove(i + i3);
        }
    }
}
