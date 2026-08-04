package com.gamericefishpro.space.ng;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements c {
    private final com.gamericefishpro.space.rc.b _configModelStore;
    private final com.gamericefishpro.space.gd.b preferences;

    public f(com.gamericefishpro.space.gd.b preferences, com.gamericefishpro.space.rc.b _configModelStore) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        this.preferences = preferences;
        this._configModelStore = _configModelStore;
    }

    @Override // com.gamericefishpro.space.ng.c
    public void cacheIAMInfluenceType(com.gamericefishpro.space.mg.d influenceType) {
        Intrinsics.checkNotNullParameter(influenceType, "influenceType");
        this.preferences.saveString("OneSignal", e.PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE, influenceType.toString());
    }

    @Override // com.gamericefishpro.space.ng.c
    public void cacheNotificationInfluenceType(com.gamericefishpro.space.mg.d influenceType) {
        Intrinsics.checkNotNullParameter(influenceType, "influenceType");
        this.preferences.saveString("OneSignal", e.PREFS_OS_OUTCOMES_CURRENT_NOTIFICATION_INFLUENCE, influenceType.toString());
    }

    @Override // com.gamericefishpro.space.ng.c
    public void cacheNotificationOpenId(String str) {
        this.preferences.saveString("OneSignal", e.PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN, str);
    }

    @Override // com.gamericefishpro.space.ng.c
    public String getCachedNotificationOpenId() {
        return this.preferences.getString("OneSignal", e.PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN, null);
    }

    @Override // com.gamericefishpro.space.ng.c
    public com.gamericefishpro.space.mg.d getIamCachedInfluenceType() {
        return com.gamericefishpro.space.mg.d.Companion.fromString(this.preferences.getString("OneSignal", e.PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE, com.gamericefishpro.space.mg.d.UNATTRIBUTED.toString()));
    }

    @Override // com.gamericefishpro.space.ng.c
    public int getIamIndirectAttributionWindow() {
        return ((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getInfluenceParams().getIndirectIAMAttributionWindow();
    }

    @Override // com.gamericefishpro.space.ng.c
    public int getIamLimit() {
        return ((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getInfluenceParams().getIamLimit();
    }

    @Override // com.gamericefishpro.space.ng.c
    public JSONArray getLastIAMsReceivedData() {
        String string = this.preferences.getString("OneSignal", e.PREFS_OS_LAST_IAMS_RECEIVED, "[]");
        return string != null ? new JSONArray(string) : new JSONArray();
    }

    @Override // com.gamericefishpro.space.ng.c
    public JSONArray getLastNotificationsReceivedData() {
        String string = this.preferences.getString("OneSignal", e.PREFS_OS_LAST_NOTIFICATIONS_RECEIVED, "[]");
        return string != null ? new JSONArray(string) : new JSONArray();
    }

    @Override // com.gamericefishpro.space.ng.c
    public com.gamericefishpro.space.mg.d getNotificationCachedInfluenceType() {
        return com.gamericefishpro.space.mg.d.Companion.fromString(this.preferences.getString("OneSignal", e.PREFS_OS_OUTCOMES_CURRENT_NOTIFICATION_INFLUENCE, com.gamericefishpro.space.mg.d.UNATTRIBUTED.toString()));
    }

    @Override // com.gamericefishpro.space.ng.c
    public int getNotificationIndirectAttributionWindow() {
        return ((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getInfluenceParams().getIndirectNotificationAttributionWindow();
    }

    @Override // com.gamericefishpro.space.ng.c
    public int getNotificationLimit() {
        return ((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getInfluenceParams().getNotificationLimit();
    }

    @Override // com.gamericefishpro.space.ng.c
    public boolean isDirectInfluenceEnabled() {
        return ((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getInfluenceParams().isDirectEnabled();
    }

    @Override // com.gamericefishpro.space.ng.c
    public boolean isIndirectInfluenceEnabled() {
        return ((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getInfluenceParams().isIndirectEnabled();
    }

    @Override // com.gamericefishpro.space.ng.c
    public boolean isUnattributedInfluenceEnabled() {
        return ((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getInfluenceParams().isUnattributedEnabled();
    }

    @Override // com.gamericefishpro.space.ng.c
    public void saveIAMs(JSONArray iams) {
        Intrinsics.checkNotNullParameter(iams, "iams");
        this.preferences.saveString("OneSignal", e.PREFS_OS_LAST_IAMS_RECEIVED, iams.toString());
    }

    @Override // com.gamericefishpro.space.ng.c
    public void saveNotifications(JSONArray notifications) {
        Intrinsics.checkNotNullParameter(notifications, "notifications");
        this.preferences.saveString("OneSignal", e.PREFS_OS_LAST_NOTIFICATIONS_RECEIVED, notifications.toString());
    }
}
