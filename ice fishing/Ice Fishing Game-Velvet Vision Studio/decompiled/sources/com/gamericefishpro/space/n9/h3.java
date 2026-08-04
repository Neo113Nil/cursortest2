package com.gamericefishpro.space.n9;

import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h3 extends com.gamericefishpro.space.i9.x implements l0 {
    public final /* synthetic */ AtomicReference d;
    public final /* synthetic */ o3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(o3 o3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.d = atomicReference;
        this.e = o3Var;
    }

    @Override // com.gamericefishpro.space.i9.x
    public final boolean E(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        f4 f4Var = (f4) com.gamericefishpro.space.i9.y.a(parcel, f4.CREATOR);
        com.gamericefishpro.space.i9.y.d(parcel);
        x(f4Var);
        return true;
    }

    @Override // com.gamericefishpro.space.n9.l0
    public final void x(f4 f4Var) {
        AtomicReference atomicReference = this.d;
        synchronized (atomicReference) {
            v0 v0Var = ((r1) this.e.d).y;
            r1.l(v0Var);
            v0Var.G.b(Integer.valueOf(f4Var.d.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(f4Var);
            atomicReference.notifyAll();
        }
    }
}
