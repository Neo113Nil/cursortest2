package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public class setGravity implements setHorizontalGravity {
    private static int ThreeDS2Service = 0;
    private static int getWarnings = 1;
    private final setSelectionAfterHeaderView get;
    private final AtomicReference<Boolean> initialize;

    public setGravity(setSelectionAfterHeaderView setselectionafterheaderview, AtomicReference<Boolean> atomicReference) {
        this.get = setselectionafterheaderview;
        this.initialize = atomicReference;
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        setGravity setgravity = new setGravity(setSelectionAfterHeaderView.initialize((Context) objArr[0]), new AtomicReference(Boolean.FALSE));
        int i = ThreeDS2Service;
        int i2 = i & 25;
        int i3 = -(-(i | 25));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getWarnings = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
        return setgravity;
    }

    public static /* synthetic */ Object initialize(Object[] objArr, int i, int i2, int i3) {
        return getWarnings(objArr);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setHorizontalGravity
    public void ThreeDS2ServiceInstance(String str) {
        ThreeDS2Service = (getWarnings + 77) % 128;
        if (!oj.get(str)) {
            int i = ThreeDS2Service;
            getWarnings = (((i | 61) << 1) - (((~i) & 61) | (i & (-62)))) % 128;
            return;
        }
        int i2 = ThreeDS2Service + 65;
        getWarnings = i2 % 128;
        int i3 = i2 % 2;
        setSelectionAfterHeaderView setselectionafterheaderview = this.get;
        if (i3 == 0) {
            setselectionafterheaderview.ThreeDS2Service();
            throw null;
        }
        if (!setselectionafterheaderview.ThreeDS2Service()) {
            throw setTextAlignment.ids.initialize(new Object[0]);
        }
        this.initialize.set(Boolean.TRUE);
        throw setTextAlignment.getSchemePublicRootKeys.initialize(new Object[0]);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setHorizontalGravity
    public boolean get() {
        int i = getWarnings;
        int i2 = (-2) - (((i ^ 102) + ((i & 102) << 1)) ^ (-1));
        ThreeDS2Service = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = this.initialize.get();
        if (i3 == 0) {
            return bool.booleanValue();
        }
        bool.booleanValue();
        throw null;
    }

    public static setHorizontalGravity get(Context context) {
        return (setHorizontalGravity) initialize(new Object[]{context}, 1818076086, -1818076086, (int) System.currentTimeMillis());
    }
}
