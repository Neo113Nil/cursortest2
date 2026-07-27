package kotlin.text;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class CatchingFishPayPalRoomRealm {
    private volatile AtomicReferenceArray<Object> array;

    public CatchingFishPayPalRoomRealm(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    public final void CatchingFishCoroutine(int i, CatchingFishRetrofitGlide catchingFishRetrofitGlide) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, catchingFishRetrofitGlide);
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
        atomicReferenceArray2.set(i, catchingFishRetrofitGlide);
        this.array = atomicReferenceArray2;
    }

    public final int CatchingFishParcelableFAB() {
        return this.array.length();
    }

    public final Object CatchingFishSnackbar(int i) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }
}
