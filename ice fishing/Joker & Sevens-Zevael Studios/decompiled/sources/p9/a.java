package p9;

import bc.m;
import c9.b;
import java.util.Set;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements o9.a {
    private final b _prefs;

    public a(b bVar) {
        j.e(bVar, "_prefs");
        this._prefs = bVar;
    }

    @Override // o9.a
    public void cleanInAppMessageClickedClickIds(Set<String> set) {
        Set<String> stringSet;
        if (set != null) {
            Set<String> set2 = set;
            if (set2.isEmpty() || (stringSet = this._prefs.getStringSet("OneSignal", "PREFS_OS_CLICKED_CLICK_IDS_IAMS", null)) == null || stringSet.isEmpty()) {
                return;
            }
            Set<String> h0 = m.h0(stringSet);
            h0.removeAll(set2);
            this._prefs.saveStringSet("OneSignal", "PREFS_OS_CLICKED_CLICK_IDS_IAMS", h0);
        }
    }

    @Override // o9.a
    public void cleanInAppMessageIds(Set<String> set) {
        if (set != null) {
            Set<String> set2 = set;
            if (set2.isEmpty()) {
                return;
            }
            Set<String> stringSet = this._prefs.getStringSet("OneSignal", "PREFS_OS_DISPLAYED_IAMS", null);
            Set<String> stringSet2 = this._prefs.getStringSet("OneSignal", "PREFS_OS_IMPRESSIONED_IAMS", null);
            if (stringSet != null && !stringSet.isEmpty()) {
                Set<String> h0 = m.h0(stringSet);
                h0.removeAll(set2);
                this._prefs.saveStringSet("OneSignal", "PREFS_OS_DISPLAYED_IAMS", h0);
            }
            if (stringSet2 == null || stringSet2.isEmpty()) {
                return;
            }
            Set<String> h02 = m.h0(stringSet2);
            h02.removeAll(set2);
            this._prefs.saveStringSet("OneSignal", "PREFS_OS_IMPRESSIONED_IAMS", h02);
        }
    }

    @Override // o9.a
    public Set<String> getClickedMessagesId() {
        return this._prefs.getStringSet("OneSignal", "PREFS_OS_CLICKED_CLICK_IDS_IAMS", null);
    }

    @Override // o9.a
    public Set<String> getDismissedMessagesId() {
        return this._prefs.getStringSet("OneSignal", "PREFS_OS_DISPLAYED_IAMS", null);
    }

    @Override // o9.a
    public Set<String> getImpressionesMessagesId() {
        return this._prefs.getStringSet("OneSignal", "PREFS_OS_IMPRESSIONED_IAMS", null);
    }

    @Override // o9.a
    public Long getLastTimeInAppDismissed() {
        return this._prefs.getLong("OneSignal", "PREFS_OS_IAM_LAST_DISMISSED_TIME", null);
    }

    @Override // o9.a
    public String getSavedIAMs() {
        return this._prefs.getString("OneSignal", "PREFS_OS_CACHED_IAMS", null);
    }

    @Override // o9.a
    public Set<String> getViewPageImpressionedIds() {
        return this._prefs.getStringSet("OneSignal", "PREFS_OS_PAGE_IMPRESSIONED_IAMS", null);
    }

    @Override // o9.a
    public void setClickedMessagesId(Set<String> set) {
        this._prefs.saveStringSet("OneSignal", "PREFS_OS_CLICKED_CLICK_IDS_IAMS", set);
    }

    @Override // o9.a
    public void setDismissedMessagesId(Set<String> set) {
        this._prefs.saveStringSet("OneSignal", "PREFS_OS_DISPLAYED_IAMS", set);
    }

    @Override // o9.a
    public void setImpressionesMessagesId(Set<String> set) {
        this._prefs.saveStringSet("OneSignal", "PREFS_OS_IMPRESSIONED_IAMS", set);
    }

    @Override // o9.a
    public void setLastTimeInAppDismissed(Long l10) {
        this._prefs.saveLong("OneSignal", "PREFS_OS_IAM_LAST_DISMISSED_TIME", l10);
    }

    @Override // o9.a
    public void setSavedIAMs(String str) {
        this._prefs.saveString("OneSignal", "PREFS_OS_CACHED_IAMS", str);
    }

    @Override // o9.a
    public void setViewPageImpressionedIds(Set<String> set) {
        this._prefs.saveStringSet("OneSignal", "PREFS_OS_PAGE_IMPRESSIONED_IAMS", set);
    }
}
