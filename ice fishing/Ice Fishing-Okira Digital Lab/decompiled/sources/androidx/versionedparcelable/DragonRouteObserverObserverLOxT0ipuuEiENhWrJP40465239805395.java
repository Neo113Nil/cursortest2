package androidx.versionedparcelable;

import java.io.Serializable;
import java.util.RandomAccess;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class DragonRouteObserverObserverLOxT0ipuuEiENhWrJP40465239805395 extends SolarMeshLibrarySchedulerEResabx5PyisRn46h746904294733235 implements ObsidianEngineHeuristicSchedulerNXbqZKxrfNYqwetyOv71255095461834, RandomAccess, Serializable {
    public final Enum[] RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public DragonRouteObserverObserverLOxT0ipuuEiENhWrJP40465239805395(Enum[] enumArr) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = enumArr;
    }

    @Override // androidx.versionedparcelable.DragonRouteStorageLambdaHkyjD6E6nhE2uWRlS477398959758048
    public final int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() {
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018 A[RETURN] */
    @Override // androidx.versionedparcelable.DragonRouteStorageLambdaHkyjD6E6nhE2uWRlS477398959758048, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        Enum r2;
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (ordinal >= 0) {
            Enum[] enumArr = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
            if (ordinal < enumArr.length) {
                r2 = enumArr[ordinal];
                return r2 != r3;
            }
        }
        r2 = null;
        if (r2 != r3) {
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480("index: ", i, ", size: ", length));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001a A[RETURN] */
    @Override // androidx.versionedparcelable.SolarMeshLibrarySchedulerEResabx5PyisRn46h746904294733235, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int indexOf(Object obj) {
        Enum r3;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int ordinal = r4.ordinal();
        if (ordinal >= 0) {
            Enum[] enumArr = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
            if (ordinal < enumArr.length) {
                r3 = enumArr[ordinal];
                if (r3 != r4) {
                    return ordinal;
                }
                return -1;
            }
        }
        r3 = null;
        if (r3 != r4) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001a A[RETURN] */
    @Override // androidx.versionedparcelable.SolarMeshLibrarySchedulerEResabx5PyisRn46h746904294733235, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int lastIndexOf(Object obj) {
        Enum r3;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int ordinal = r4.ordinal();
        if (ordinal >= 0) {
            Enum[] enumArr = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
            if (ordinal < enumArr.length) {
                r3 = enumArr[ordinal];
                if (r3 != r4) {
                    return ordinal;
                }
                return -1;
            }
        }
        r3 = null;
        if (r3 != r4) {
        }
    }
}
