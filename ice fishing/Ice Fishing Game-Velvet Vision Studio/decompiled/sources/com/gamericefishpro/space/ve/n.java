package com.gamericefishpro.space.ve;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface n {
    /* JADX INFO: renamed from: addClickListener */
    void mo26addClickListener(h hVar);

    /* JADX INFO: renamed from: addForegroundLifecycleListener */
    void mo27addForegroundLifecycleListener(j jVar);

    /* JADX INFO: renamed from: addPermissionObserver */
    void mo28addPermissionObserver(o oVar);

    /* JADX INFO: renamed from: clearAllNotifications */
    void mo29clearAllNotifications();

    /* JADX INFO: renamed from: getCanRequestPermission */
    boolean mo30getCanRequestPermission();

    /* JADX INFO: renamed from: getPermission */
    boolean mo31getPermission();

    /* JADX INFO: renamed from: removeClickListener */
    void mo32removeClickListener(h hVar);

    /* JADX INFO: renamed from: removeForegroundLifecycleListener */
    void mo33removeForegroundLifecycleListener(j jVar);

    /* JADX INFO: renamed from: removeGroupedNotifications */
    void mo34removeGroupedNotifications(String str);

    /* JADX INFO: renamed from: removeNotification */
    void mo35removeNotification(int i);

    /* JADX INFO: renamed from: removePermissionObserver */
    void mo36removePermissionObserver(o oVar);

    Object requestPermission(boolean z, com.gamericefishpro.space.th.a aVar);
}
