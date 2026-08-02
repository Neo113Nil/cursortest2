package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.view.View;

/* loaded from: classes5.dex */
public abstract class bs<T extends View> {
    private static int getWarnings = 0;
    private static int initialize = 1;
    private T get;

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        bs bsVar = (bs) objArr[0];
        int i = getWarnings;
        int i2 = i & 75;
        int i3 = i | 75;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        initialize = i4 % 128;
        if (i4 % 2 == 0) {
            bsVar.get = null;
            bsVar.ThreeDS2Service();
            int i5 = 16 / 0;
        } else {
            bsVar.get = null;
            bsVar.ThreeDS2Service();
        }
        int i6 = getWarnings;
        int i7 = i6 & 11;
        int i8 = ((i6 ^ 11) | i7) << 1;
        int i9 = -((i6 | 11) & (~i7));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        initialize = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 4 / 0;
        }
        return null;
    }

    public void ThreeDS2Service() {
        int i = getWarnings;
        int i2 = i & 67;
        int i3 = -(-((i ^ 67) | i2));
        initialize = ((i2 & i3) + (i3 | i2)) % 128;
    }

    public T ThreeDS2ServiceInstance() {
        int i = getWarnings;
        int i2 = i ^ 115;
        int i3 = ((i & 115) | i2) << 1;
        int i4 = -i2;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        initialize = i5 % 128;
        int i6 = i5 % 2;
        T t = this.get;
        if (i6 != 0) {
            return t;
        }
        throw null;
    }

    public T get(Context context) {
        int i = getWarnings;
        int i2 = (i & (-108)) | ((~i) & 107);
        int i3 = -(-((i & 107) << 1));
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        initialize = i4;
        if (this.get == null) {
            int i5 = ((i4 ^ 79) | (i4 & 79)) << 1;
            int i6 = -((i4 & (-80)) | ((~i4) & 79));
            getWarnings = ((i5 ^ i6) + ((i5 & i6) << 1)) % 128;
            this.get = initialize(context);
            int i7 = getWarnings;
            int i8 = (i7 & 102) + (i7 | 102);
            initialize = ((i8 ^ (-1)) + (i8 << 1)) % 128;
        }
        T t = this.get;
        int i9 = getWarnings;
        int i10 = (i9 ^ 33) + ((i9 & 33) << 1);
        initialize = i10 % 128;
        if (i10 % 2 != 0) {
            return t;
        }
        throw null;
    }

    public abstract T initialize(Context context);

    public final void initialize() {
        initialize(new Object[]{this}, 130025777, -130025777, System.identityHashCode(this));
    }

    public static /* synthetic */ Object initialize(Object[] objArr, int i, int i2, int i3) {
        return getWarnings(objArr);
    }
}
