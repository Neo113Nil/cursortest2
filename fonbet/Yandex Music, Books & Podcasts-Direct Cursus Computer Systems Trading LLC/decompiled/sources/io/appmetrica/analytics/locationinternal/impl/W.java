package io.appmetrica.analytics.locationinternal.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class W implements InterfaceC0892m0 {
    public final List a;

    public W(@NonNull List<InterfaceC0895n0> list) {
        this.a = CollectionUtils.unmodifiableListCopy(list);
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.InterfaceC0892m0, io.appmetrica.analytics.locationinternal.impl.InterfaceC0895n0
    @NonNull
    public final i2 a() {
        int[] iArr = new int[i2.values().length];
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            int ordinal = ((InterfaceC0895n0) it.next()).a().ordinal();
            iArr[ordinal] = iArr[ordinal] + 1;
        }
        i2 i2Var = i2.NEW;
        if (iArr[0] > 0) {
            return i2Var;
        }
        return iArr[2] > 0 ? i2.REFRESH : i2.NOT_CHANGED;
    }
}
