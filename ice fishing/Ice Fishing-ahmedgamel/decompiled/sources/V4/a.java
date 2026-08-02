package V4;

import J4.b;
import java.util.Set;
import kotlin.jvm.internal.h;
import v7.AbstractC5119j;

/* loaded from: classes2.dex */
public final class a implements U4.a {
    private final b _prefs;

    public a(b _prefs) {
        h.e(_prefs, "_prefs");
        this._prefs = _prefs;
    }

    @Override // U4.a
    public void cleanInAppMessageClickedClickIds(Set<String> set) {
        Set<String> stringSet;
        if (set == null || set.isEmpty() || (stringSet = this._prefs.getStringSet(com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", null)) == null || stringSet.isEmpty()) {
            return;
        }
        Set<String> M8 = AbstractC5119j.M(stringSet);
        M8.removeAll(set);
        this._prefs.saveStringSet(com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", M8);
    }

    @Override // U4.a
    public void cleanInAppMessageIds(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        Set<String> stringSet = this._prefs.getStringSet(com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_DISPLAYED_IAMS", null);
        Set<String> stringSet2 = this._prefs.getStringSet(com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_IMPRESSIONED_IAMS", null);
        if (stringSet != null && !stringSet.isEmpty()) {
            Set<String> M8 = AbstractC5119j.M(stringSet);
            M8.removeAll(set);
            this._prefs.saveStringSet(com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_DISPLAYED_IAMS", M8);
        }
        if (stringSet2 == null || stringSet2.isEmpty()) {
            return;
        }
        Set<String> M9 = AbstractC5119j.M(stringSet2);
        M9.removeAll(set);
        this._prefs.saveStringSet(com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_IMPRESSIONED_IAMS", M9);
    }

    @Override // U4.a
    public Set<String> getClickedMessagesId() {
        return this._prefs.getStringSet(com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", null);
    }

    @Override // U4.a
    public Set<String> getDismissedMessagesId() {
        return this._prefs.getStringSet(com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_DISPLAYED_IAMS", null);
    }

    @Override // U4.a
    public Set<String> getImpressionesMessagesId() {
        return this._prefs.getStringSet(com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_IMPRESSIONED_IAMS", null);
    }

    @Override // U4.a
    public Long getLastTimeInAppDismissed() {
        return this._prefs.getLong(com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_IAM_LAST_DISMISSED_TIME", null);
    }

    @Override // U4.a
    public String getSavedIAMs() {
        return this._prefs.getString(com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_CACHED_IAMS", null);
    }

    @Override // U4.a
    public Set<String> getViewPageImpressionedIds() {
        return this._prefs.getStringSet(com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_PAGE_IMPRESSIONED_IAMS", null);
    }

    @Override // U4.a
    public void setClickedMessagesId(Set<String> set) {
        this._prefs.saveStringSet(com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", set);
    }

    @Override // U4.a
    public void setDismissedMessagesId(Set<String> set) {
        this._prefs.saveStringSet(com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_DISPLAYED_IAMS", set);
    }

    @Override // U4.a
    public void setImpressionesMessagesId(Set<String> set) {
        this._prefs.saveStringSet(com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_IMPRESSIONED_IAMS", set);
    }

    @Override // U4.a
    public void setLastTimeInAppDismissed(Long l9) {
        this._prefs.saveLong(com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_IAM_LAST_DISMISSED_TIME", l9);
    }

    @Override // U4.a
    public void setSavedIAMs(String str) {
        this._prefs.saveString(com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_CACHED_IAMS", str);
    }

    @Override // U4.a
    public void setViewPageImpressionedIds(Set<String> set) {
        this._prefs.saveStringSet(com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_PAGE_IMPRESSIONED_IAMS", set);
    }
}
