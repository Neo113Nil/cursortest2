package androidx.versionedparcelable;

import java.util.ListIterator;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class CosmicForgeGenericNormalizationQ3hHEcohu5Iruuji3L95140235969308 extends ArcticByteBinaryCompressionKwZmbP1ar0amViYotf74728707286763 implements ListIterator {
    public final /* synthetic */ SolarMeshLibrarySchedulerEResabx5PyisRn46h746904294733235 TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CosmicForgeGenericNormalizationQ3hHEcohu5Iruuji3L95140235969308(SolarMeshLibrarySchedulerEResabx5PyisRn46h746904294733235 solarMeshLibrarySchedulerEResabx5PyisRn46h746904294733235, int i) {
        super(0, solarMeshLibrarySchedulerEResabx5PyisRn46h746904294733235);
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = solarMeshLibrarySchedulerEResabx5PyisRn46h746904294733235;
        int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = solarMeshLibrarySchedulerEResabx5PyisRn46h746904294733235.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
        if (i < 0 || i > ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
            GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480("index: ", i, ", size: ", ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800));
            throw null;
        }
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339();
            return null;
        }
        int i = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 - 1;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = i;
        return this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
