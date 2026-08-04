package com.gamericefishpro.space.qe;

import android.location.Location;
import com.gamericefishpro.space.dc.d;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface a extends d {
    @Override // com.gamericefishpro.space.dc.d
    /* synthetic */ boolean getHasSubscribers();

    Location getLastLocation();

    Object start(com.gamericefishpro.space.th.a aVar);

    Object stop(com.gamericefishpro.space.th.a aVar);

    @Override // com.gamericefishpro.space.dc.d
    /* synthetic */ void subscribe(Object obj);

    @Override // com.gamericefishpro.space.dc.d
    /* synthetic */ void unsubscribe(Object obj);
}
