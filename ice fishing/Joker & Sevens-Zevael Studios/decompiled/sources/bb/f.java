package bb;

import org.json.JSONArray;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f implements c {
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final c9.b preferences;

    public f(c9.b bVar, com.onesignal.core.internal.config.b bVar2) {
        j.e(bVar, "preferences");
        j.e(bVar2, "_configModelStore");
        this.preferences = bVar;
        this._configModelStore = bVar2;
    }

    @Override // bb.c
    public void cacheIAMInfluenceType(ab.d dVar) {
        j.e(dVar, "influenceType");
        this.preferences.saveString("OneSignal", e.PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE, dVar.toString());
    }

    @Override // bb.c
    public void cacheNotificationInfluenceType(ab.d dVar) {
        j.e(dVar, "influenceType");
        this.preferences.saveString("OneSignal", e.PREFS_OS_OUTCOMES_CURRENT_NOTIFICATION_INFLUENCE, dVar.toString());
    }

    @Override // bb.c
    public void cacheNotificationOpenId(String str) {
        this.preferences.saveString("OneSignal", e.PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN, str);
    }

    @Override // bb.c
    public String getCachedNotificationOpenId() {
        return this.preferences.getString("OneSignal", e.PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN, null);
    }

    @Override // bb.c
    public ab.d getIamCachedInfluenceType() {
        return ab.d.Companion.fromString(this.preferences.getString("OneSignal", e.PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE, ab.d.UNATTRIBUTED.toString()));
    }

    @Override // bb.c
    public int getIamIndirectAttributionWindow() {
        return ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getInfluenceParams().getIndirectIAMAttributionWindow();
    }

    @Override // bb.c
    public int getIamLimit() {
        return ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getInfluenceParams().getIamLimit();
    }

    @Override // bb.c
    public JSONArray getLastIAMsReceivedData() {
        String string = this.preferences.getString("OneSignal", e.PREFS_OS_LAST_IAMS_RECEIVED, "[]");
        return string != null ? new JSONArray(string) : new JSONArray();
    }

    @Override // bb.c
    public JSONArray getLastNotificationsReceivedData() {
        String string = this.preferences.getString("OneSignal", e.PREFS_OS_LAST_NOTIFICATIONS_RECEIVED, "[]");
        return string != null ? new JSONArray(string) : new JSONArray();
    }

    @Override // bb.c
    public ab.d getNotificationCachedInfluenceType() {
        return ab.d.Companion.fromString(this.preferences.getString("OneSignal", e.PREFS_OS_OUTCOMES_CURRENT_NOTIFICATION_INFLUENCE, ab.d.UNATTRIBUTED.toString()));
    }

    @Override // bb.c
    public int getNotificationIndirectAttributionWindow() {
        return ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getInfluenceParams().getIndirectNotificationAttributionWindow();
    }

    @Override // bb.c
    public int getNotificationLimit() {
        return ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getInfluenceParams().getNotificationLimit();
    }

    @Override // bb.c
    public boolean isDirectInfluenceEnabled() {
        return ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getInfluenceParams().isDirectEnabled();
    }

    @Override // bb.c
    public boolean isIndirectInfluenceEnabled() {
        return ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getInfluenceParams().isIndirectEnabled();
    }

    @Override // bb.c
    public boolean isUnattributedInfluenceEnabled() {
        return ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getInfluenceParams().isUnattributedEnabled();
    }

    @Override // bb.c
    public void saveIAMs(JSONArray jSONArray) {
        j.e(jSONArray, "iams");
        this.preferences.saveString("OneSignal", e.PREFS_OS_LAST_IAMS_RECEIVED, jSONArray.toString());
    }

    @Override // bb.c
    public void saveNotifications(JSONArray jSONArray) {
        j.e(jSONArray, "notifications");
        this.preferences.saveString("OneSignal", e.PREFS_OS_LAST_NOTIFICATIONS_RECEIVED, jSONArray.toString());
    }
}
