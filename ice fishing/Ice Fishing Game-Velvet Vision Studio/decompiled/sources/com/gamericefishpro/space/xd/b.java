package com.gamericefishpro.space.xd;

import com.gamericefishpro.space.dc.d;
import com.gamericefishpro.space.qd.c;
import com.gamericefishpro.space.qd.g;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface b extends d {
    @Override // com.gamericefishpro.space.dc.d
    /* synthetic */ boolean getHasSubscribers();

    void messageActionOccurredOnMessage(com.gamericefishpro.space.qd.a aVar, c cVar);

    void messageActionOccurredOnPreview(com.gamericefishpro.space.qd.a aVar, c cVar);

    void messagePageChanged(com.gamericefishpro.space.qd.a aVar, g gVar);

    void messageWasDismissed(com.gamericefishpro.space.qd.a aVar);

    void messageWasDisplayed(com.gamericefishpro.space.qd.a aVar);

    void messageWillDismiss(com.gamericefishpro.space.qd.a aVar);

    void messageWillDisplay(com.gamericefishpro.space.qd.a aVar);

    @Override // com.gamericefishpro.space.dc.d
    /* synthetic */ void subscribe(Object obj);

    @Override // com.gamericefishpro.space.dc.d
    /* synthetic */ void unsubscribe(Object obj);
}
