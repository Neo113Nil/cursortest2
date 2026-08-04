package com.gamericefishpro.space.re;

import android.location.Location;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements com.gamericefishpro.space.qe.a {
    @Override // com.gamericefishpro.space.qe.a, com.gamericefishpro.space.dc.d
    public boolean getHasSubscribers() {
        return false;
    }

    @Override // com.gamericefishpro.space.qe.a
    public Location getLastLocation() {
        return null;
    }

    @Override // com.gamericefishpro.space.qe.a
    public Object start(com.gamericefishpro.space.th.a aVar) {
        return Boolean.FALSE;
    }

    @Override // com.gamericefishpro.space.qe.a
    public Object stop(com.gamericefishpro.space.th.a aVar) {
        return Unit.a;
    }

    @Override // com.gamericefishpro.space.qe.a, com.gamericefishpro.space.dc.d
    public void subscribe(com.gamericefishpro.space.qe.b handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
    }

    @Override // com.gamericefishpro.space.qe.a, com.gamericefishpro.space.dc.d
    public void unsubscribe(com.gamericefishpro.space.qe.b handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
    }
}
