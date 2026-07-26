package android.content.Context;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLicensingAuroraGamma3507 {
    private volatile AtomicReferenceArray<Object> array;

    public FrostHunterLicensingAuroraGamma3507(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    public final int FrostHunterAlphaAnimationNeoCosmos5761() {
        return this.array.length();
    }

    public final void FrostHunterBundlePulseFusionHero2475(int i, FrostHunterCountDownTimerOlympianPhoenix8555 frostHunterCountDownTimerOlympianPhoenix8555) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, frostHunterCountDownTimerOlympianPhoenix8555);
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
        atomicReferenceArray2.set(i, frostHunterCountDownTimerOlympianPhoenix8555);
        this.array = atomicReferenceArray2;
    }

    public final Object FrostHunterConstraintSetCloneMasterUltraRogue2633(int i) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }
}
