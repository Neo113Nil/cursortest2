package androidx.versionedparcelable;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class ObsidianEngineAdapterImmutableEg86pGGEwI1Py6xOZf69792902218449 extends SolarMeshLibrarySchedulerEResabx5PyisRn46h746904294733235 implements RandomAccess {
    public final int LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final Object[] RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public int TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public int YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public ObsidianEngineAdapterImmutableEg86pGGEwI1Py6xOZf69792902218449(int i, Object[] objArr) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = objArr;
        if (i < 0) {
            throw new IllegalArgumentException(MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339("ring buffer filled size should not be negative but it is ", i).toString());
        }
        if (i <= objArr.length) {
            this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = objArr.length;
            this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = i;
        } else {
            StringBuilder ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834 = MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834("ring buffer filled size: ", i, " cannot be larger than the buffer size: ");
            ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.append(objArr.length);
            throw new IllegalArgumentException(ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.toString().toString());
        }
    }

    public final void AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365() {
        if (4 > this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 4, size = " + this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333).toString());
        }
        int i = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        int i2 = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        int i3 = (i + 4) % i2;
        Object[] objArr = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        if (i > i3) {
            Arrays.fill(objArr, i, i2, (Object) null);
            Arrays.fill(objArr, 0, i3, (Object) null);
        } else {
            Arrays.fill(objArr, i, i3, (Object) null);
        }
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = i3;
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 -= 4;
    }

    @Override // androidx.versionedparcelable.DragonRouteStorageLambdaHkyjD6E6nhE2uWRlS477398959758048
    public final int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() {
        return this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
        if (i < 0 || i >= i2) {
            GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480("index: ", i, ", size: ", i2));
            return null;
        }
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867[(this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 + i) % this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119];
    }

    @Override // androidx.versionedparcelable.SolarMeshLibrarySchedulerEResabx5PyisRn46h746904294733235, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new NovaLayerSingletonOverridingQ0j3rSDcDmVz0XCLov42608759685089(this);
    }

    @Override // androidx.versionedparcelable.DragonRouteStorageLambdaHkyjD6E6nhE2uWRlS477398959758048, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int length = objArr.length;
        int i = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
        int i3 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
            if (i5 >= i2 || i3 >= this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // androidx.versionedparcelable.DragonRouteStorageLambdaHkyjD6E6nhE2uWRlS477398959758048, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800()]);
    }
}
