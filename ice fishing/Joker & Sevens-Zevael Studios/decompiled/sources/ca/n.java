package ca;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public interface n {
    /* renamed from: addClickListener */
    void mo26addClickListener(h hVar);

    /* renamed from: addForegroundLifecycleListener */
    void mo27addForegroundLifecycleListener(j jVar);

    /* renamed from: addPermissionObserver */
    void mo28addPermissionObserver(o oVar);

    /* renamed from: clearAllNotifications */
    void mo29clearAllNotifications();

    /* renamed from: getCanRequestPermission */
    boolean mo30getCanRequestPermission();

    /* renamed from: getPermission */
    boolean mo31getPermission();

    /* renamed from: removeClickListener */
    void mo32removeClickListener(h hVar);

    /* renamed from: removeForegroundLifecycleListener */
    void mo33removeForegroundLifecycleListener(j jVar);

    /* renamed from: removeGroupedNotifications */
    void mo34removeGroupedNotifications(String str);

    /* renamed from: removeNotification */
    void mo35removeNotification(int i10);

    /* renamed from: removePermissionObserver */
    void mo36removePermissionObserver(o oVar);

    Object requestPermission(boolean z10, fc.d dVar);
}
