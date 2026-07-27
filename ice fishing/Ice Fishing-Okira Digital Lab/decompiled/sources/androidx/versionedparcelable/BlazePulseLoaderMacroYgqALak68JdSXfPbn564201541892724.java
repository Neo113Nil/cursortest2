package androidx.versionedparcelable;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class BlazePulseLoaderMacroYgqALak68JdSXfPbn564201541892724 {
    private volatile AtomicReferenceArray<Object> array;

    public BlazePulseLoaderMacroYgqALak68JdSXfPbn564201541892724(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    public final void ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(int i, MysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671 mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671);
            return;
        }
        int i2 = i + 1;
        int i3 = length * 2;
        if (i2 < i3) {
            i2 = i3;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i2);
        for (int i4 = 0; i4 < length; i4++) {
            atomicReferenceArray2.set(i4, atomicReferenceArray.get(i4));
        }
        atomicReferenceArray2.set(i, mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671);
        this.array = atomicReferenceArray2;
    }

    public final Object AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(int i) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    public final int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() {
        return this.array.length();
    }
}
