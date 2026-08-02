package com.google.android.libraries.places.internal;

import com.android.volley.Response;
import com.google.common.base.Ascii;
import com.google.common.util.concurrent.AbstractFuture;

/* loaded from: classes4.dex */
public final class zzckj extends AbstractFuture {
    public final zzbpa zza;

    public zzckj(zzbpa zzbpaVar) {
        this.zza = zzbpaVar;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void interruptTask() {
        this.zza.zze("GrpcFuture was cancelled", null);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final String pendingToString() {
        Response stringHelper = Ascii.toStringHelper(this);
        stringHelper.add(this.zza, "clientCall");
        return stringHelper.toString();
    }
}
