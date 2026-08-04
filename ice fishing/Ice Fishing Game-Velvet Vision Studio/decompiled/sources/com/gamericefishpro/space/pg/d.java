package com.gamericefishpro.space.pg;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface d {
    Object cleanCachedUniqueOutcomeEventNotifications(com.gamericefishpro.space.th.a aVar);

    Object deleteOldOutcomeEvent(f fVar, com.gamericefishpro.space.th.a aVar);

    Object getAllEventsToSend(com.gamericefishpro.space.th.a aVar);

    Object getNotCachedUniqueInfluencesForOutcome(String str, List<com.gamericefishpro.space.mg.b> list, com.gamericefishpro.space.th.a aVar);

    Object saveOutcomeEvent(f fVar, com.gamericefishpro.space.th.a aVar);

    Object saveUniqueOutcomeEventParams(f fVar, com.gamericefishpro.space.th.a aVar);
}
