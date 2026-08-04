package com.gamericefishpro.space.xd;

import com.gamericefishpro.space.qd.c;
import com.gamericefishpro.space.qd.g;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface a {
    void onMessageActionOccurredOnMessage(com.gamericefishpro.space.qd.a aVar, c cVar);

    void onMessageActionOccurredOnPreview(com.gamericefishpro.space.qd.a aVar, c cVar);

    void onMessagePageChanged(com.gamericefishpro.space.qd.a aVar, g gVar);

    void onMessageWasDismissed(com.gamericefishpro.space.qd.a aVar);

    void onMessageWasDisplayed(com.gamericefishpro.space.qd.a aVar);

    void onMessageWillDismiss(com.gamericefishpro.space.qd.a aVar);

    void onMessageWillDisplay(com.gamericefishpro.space.qd.a aVar);
}
