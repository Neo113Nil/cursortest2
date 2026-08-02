package com.netcetera.threeds.sdk.infrastructure;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public class setVerticalGravity implements setItemsCanFocus {
    private static int ThreeDS2Service = 0;
    private static int ThreeDS2ServiceInstance = 1;
    private final AtomicReference<Boolean> get;
    private final setWeightSum getWarnings;
    private final AtomicReference<setIndeterminateDrawable> initialize;

    public setVerticalGravity(setWeightSum setweightsum, AtomicReference<Boolean> atomicReference, AtomicReference<setIndeterminateDrawable> atomicReference2) {
        this.getWarnings = setweightsum;
        this.get = atomicReference;
        this.initialize = atomicReference2;
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        setVerticalGravity setverticalgravity = new setVerticalGravity((setWeightSum) objArr[0], new AtomicReference(Boolean.FALSE), new AtomicReference((setIndeterminateDrawable) setIndeterminateDrawable.ThreeDS2ServiceInstance(new Object[0], -381530957, 381530957, (int) System.currentTimeMillis())));
        int i = ThreeDS2ServiceInstance;
        int i2 = ((i | 23) << 1) - (i ^ 23);
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 == 0) {
            return setverticalgravity;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setItemsCanFocus
    public synchronized void ThreeDS2ServiceInstance(setIndeterminateDrawable setindeterminatedrawable) {
        int i = ThreeDS2ServiceInstance;
        ThreeDS2Service = ((i & 45) + (i | 45)) % 128;
        this.get.set(Boolean.TRUE);
        this.initialize.set(setindeterminatedrawable);
        int i2 = ThreeDS2ServiceInstance;
        int i3 = i2 & 93;
        int i4 = (i2 | 93) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        ThreeDS2Service = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setItemsCanFocus
    public synchronized String initialize() {
        setIndeterminateDrawable initialize;
        try {
            int i = ThreeDS2ServiceInstance;
            int i2 = (i | 107) << 1;
            int i3 = -(((~i) & 107) | (i & (-108)));
            ThreeDS2Service = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
            if (this.get.get().booleanValue()) {
                int i4 = ThreeDS2ServiceInstance;
                int i5 = ((i4 ^ 97) | (i4 & 97)) << 1;
                int i6 = -(((~i4) & 97) | (i4 & (-98)));
                int i7 = (i5 & i6) + (i6 | i5);
                ThreeDS2Service = i7 % 128;
                int i8 = i7 % 2;
                AtomicReference<setIndeterminateDrawable> atomicReference = this.initialize;
                if (i8 != 0) {
                    atomicReference.get();
                    throw null;
                }
                initialize = atomicReference.get();
                int i9 = ThreeDS2ServiceInstance;
                int i10 = (i9 | 121) << 1;
                int i11 = -(i9 ^ 121);
                ThreeDS2Service = ((i10 & i11) + (i11 | i10)) % 128;
            } else {
                initialize = this.getWarnings.ThreeDS2ServiceInstance().initialize();
                int i12 = ThreeDS2Service;
                int i13 = i12 & 111;
                ThreeDS2ServiceInstance = (i13 + ((i12 ^ 111) | i13)) % 128;
            }
            if (!initialize.ThreeDS2ServiceInstance().booleanValue()) {
                int i14 = ThreeDS2ServiceInstance;
                int i15 = (i14 ^ 98) + ((i14 & 98) << 1);
                ThreeDS2Service = ((i15 ^ (-1)) + (i15 << 1)) % 128;
                throw setTextAlignment.getSchemeEncryptionPublicKeyId.initialize(new Object[0]);
            }
            String str = initialize.get();
            int i16 = ThreeDS2Service;
            int i17 = i16 & 61;
            int i18 = (i17 - (~(-(-((i16 ^ 61) | i17))))) - 1;
            ThreeDS2ServiceInstance = i18 % 128;
            if (i18 % 2 != 0) {
                return str;
            }
            int i19 = 34 / 0;
            return str;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ Object initialize(Object[] objArr, int i, int i2, int i3) {
        return get(objArr);
    }

    public static setItemsCanFocus initialize(setWeightSum setweightsum) {
        return (setItemsCanFocus) initialize(new Object[]{setweightsum}, 406897049, -406897049, (int) System.currentTimeMillis());
    }
}
