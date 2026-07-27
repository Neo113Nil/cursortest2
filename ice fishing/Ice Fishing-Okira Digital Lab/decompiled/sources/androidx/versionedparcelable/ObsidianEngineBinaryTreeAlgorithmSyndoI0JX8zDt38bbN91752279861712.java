package androidx.versionedparcelable;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class ObsidianEngineBinaryTreeAlgorithmSyndoI0JX8zDt38bbN91752279861712 implements Collection {
    public final /* synthetic */ BlazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public ObsidianEngineBinaryTreeAlgorithmSyndoI0JX8zDt38bbN91752279861712(BlazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995 blazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = blazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new IronMatrixLibraryCryptographyPr65CzYfS06S2et7fw76736161618216(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        BlazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995 blazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = blazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(obj);
        if (ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 < 0) {
            return false;
        }
        blazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        BlazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995 blazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        int i = blazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(blazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(i2))) {
                blazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        BlazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995 blazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        int i = blazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(blazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(i2))) {
                blazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        BlazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995 blazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        int i = blazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = blazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        BlazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995 blazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        int i = blazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = blazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(i2);
        }
        return objArr;
    }
}
