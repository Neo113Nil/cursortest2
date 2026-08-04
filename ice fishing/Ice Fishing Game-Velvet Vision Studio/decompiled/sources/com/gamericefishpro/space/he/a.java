package com.gamericefishpro.space.he;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface a extends com.gamericefishpro.space.dc.d {
    boolean evaluateMessageTriggers(com.gamericefishpro.space.qd.a aVar);

    @Override // com.gamericefishpro.space.dc.d
    /* synthetic */ boolean getHasSubscribers();

    boolean isTriggerOnMessage(com.gamericefishpro.space.qd.a aVar, Collection<String> collection);

    boolean messageHasOnlyDynamicTriggers(com.gamericefishpro.space.qd.a aVar);

    @Override // com.gamericefishpro.space.dc.d
    /* synthetic */ void subscribe(Object obj);

    @Override // com.gamericefishpro.space.dc.d
    /* synthetic */ void unsubscribe(Object obj);
}
