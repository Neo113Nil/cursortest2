package com.gamericefishpro.space.lc;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface f {
    void addActivityLifecycleHandler(d dVar);

    void addApplicationLifecycleHandler(e eVar);

    Context getAppContext();

    Activity getCurrent();

    b getEntryState();

    boolean isInForeground();

    void removeActivityLifecycleHandler(d dVar);

    void removeApplicationLifecycleHandler(e eVar);

    void setEntryState(b bVar);

    Object waitUntilActivityReady(com.gamericefishpro.space.th.a aVar);

    Object waitUntilSystemConditionsAvailable(com.gamericefishpro.space.th.a aVar);
}
