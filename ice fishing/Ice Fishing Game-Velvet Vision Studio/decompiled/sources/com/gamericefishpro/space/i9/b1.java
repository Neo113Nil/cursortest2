package com.gamericefishpro.space.i9;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends x implements n0 {
    public final /* synthetic */ com.gamericefishpro.space.va.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(w0 w0Var, com.gamericefishpro.space.va.a aVar) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.d = aVar;
    }

    @Override // com.gamericefishpro.space.i9.x
    public final boolean E(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        b();
        return true;
    }

    @Override // com.gamericefishpro.space.i9.n0
    public final void b() {
        this.d.run();
    }
}
