package com.gamericefishpro.space.jh;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface b extends com.gamericefishpro.space.dc.d {
    void addEmailSubscription(String str);

    void addOrUpdatePushSubscriptionToken(String str, f fVar);

    void addSmsSubscription(String str);

    @Override // com.gamericefishpro.space.dc.d
    /* synthetic */ boolean getHasSubscribers();

    d getPushSubscriptionModel();

    c getSubscriptions();

    void removeEmailSubscription(String str);

    void removeSmsSubscription(String str);

    void setSubscriptions(c cVar);

    @Override // com.gamericefishpro.space.dc.d
    /* synthetic */ void subscribe(Object obj);

    @Override // com.gamericefishpro.space.dc.d
    /* synthetic */ void unsubscribe(Object obj);
}
