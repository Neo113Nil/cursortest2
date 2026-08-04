package com.gamericefishpro.space.n9;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g3 extends com.gamericefishpro.space.i9.x implements j0 {
    public final /* synthetic */ AtomicReference d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(o3 o3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.d = atomicReference;
    }

    @Override // com.gamericefishpro.space.i9.x
    public final boolean E(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(a4.CREATOR);
        com.gamericefishpro.space.i9.y.d(parcel);
        t(arrayListCreateTypedArrayList);
        return true;
    }

    @Override // com.gamericefishpro.space.n9.j0
    public final void t(List list) {
        AtomicReference atomicReference = this.d;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
