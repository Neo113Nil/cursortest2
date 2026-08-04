package com.gamericefishpro.space.ae;

import com.gamericefishpro.space.gd.b;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.zd.a {
    private final b _prefs;

    public a(b _prefs) {
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        this._prefs = _prefs;
    }

    @Override // com.gamericefishpro.space.zd.a
    public void cleanInAppMessageClickedClickIds(Set<String> set) {
        Set<String> stringSet;
        if (set != null) {
            Set<String> set2 = set;
            if (set2.isEmpty() || (stringSet = this._prefs.getStringSet("OneSignal", "PREFS_OS_CLICKED_CLICK_IDS_IAMS", null)) == null || stringSet.isEmpty()) {
                return;
            }
            LinkedHashSet linkedHashSetN = CollectionsKt.N(stringSet);
            linkedHashSetN.removeAll(set2);
            this._prefs.saveStringSet("OneSignal", "PREFS_OS_CLICKED_CLICK_IDS_IAMS", linkedHashSetN);
        }
    }

    @Override // com.gamericefishpro.space.zd.a
    public void cleanInAppMessageIds(Set<String> set) {
        if (set != null) {
            Set<String> set2 = set;
            if (set2.isEmpty()) {
                return;
            }
            Set<String> stringSet = this._prefs.getStringSet("OneSignal", "PREFS_OS_DISPLAYED_IAMS", null);
            Set<String> stringSet2 = this._prefs.getStringSet("OneSignal", "PREFS_OS_IMPRESSIONED_IAMS", null);
            if (stringSet != null && !stringSet.isEmpty()) {
                LinkedHashSet linkedHashSetN = CollectionsKt.N(stringSet);
                linkedHashSetN.removeAll(set2);
                this._prefs.saveStringSet("OneSignal", "PREFS_OS_DISPLAYED_IAMS", linkedHashSetN);
            }
            if (stringSet2 == null || stringSet2.isEmpty()) {
                return;
            }
            LinkedHashSet linkedHashSetN2 = CollectionsKt.N(stringSet2);
            linkedHashSetN2.removeAll(set2);
            this._prefs.saveStringSet("OneSignal", "PREFS_OS_IMPRESSIONED_IAMS", linkedHashSetN2);
        }
    }

    @Override // com.gamericefishpro.space.zd.a
    public Set<String> getClickedMessagesId() {
        return this._prefs.getStringSet("OneSignal", "PREFS_OS_CLICKED_CLICK_IDS_IAMS", null);
    }

    @Override // com.gamericefishpro.space.zd.a
    public Set<String> getDismissedMessagesId() {
        return this._prefs.getStringSet("OneSignal", "PREFS_OS_DISPLAYED_IAMS", null);
    }

    @Override // com.gamericefishpro.space.zd.a
    public Set<String> getImpressionesMessagesId() {
        return this._prefs.getStringSet("OneSignal", "PREFS_OS_IMPRESSIONED_IAMS", null);
    }

    @Override // com.gamericefishpro.space.zd.a
    public Long getLastTimeInAppDismissed() {
        return this._prefs.getLong("OneSignal", "PREFS_OS_IAM_LAST_DISMISSED_TIME", null);
    }

    @Override // com.gamericefishpro.space.zd.a
    public String getSavedIAMs() {
        return this._prefs.getString("OneSignal", "PREFS_OS_CACHED_IAMS", null);
    }

    @Override // com.gamericefishpro.space.zd.a
    public Set<String> getViewPageImpressionedIds() {
        return this._prefs.getStringSet("OneSignal", "PREFS_OS_PAGE_IMPRESSIONED_IAMS", null);
    }

    @Override // com.gamericefishpro.space.zd.a
    public void setClickedMessagesId(Set<String> set) {
        this._prefs.saveStringSet("OneSignal", "PREFS_OS_CLICKED_CLICK_IDS_IAMS", set);
    }

    @Override // com.gamericefishpro.space.zd.a
    public void setDismissedMessagesId(Set<String> set) {
        this._prefs.saveStringSet("OneSignal", "PREFS_OS_DISPLAYED_IAMS", set);
    }

    @Override // com.gamericefishpro.space.zd.a
    public void setImpressionesMessagesId(Set<String> set) {
        this._prefs.saveStringSet("OneSignal", "PREFS_OS_IMPRESSIONED_IAMS", set);
    }

    @Override // com.gamericefishpro.space.zd.a
    public void setLastTimeInAppDismissed(Long l) {
        this._prefs.saveLong("OneSignal", "PREFS_OS_IAM_LAST_DISMISSED_TIME", l);
    }

    @Override // com.gamericefishpro.space.zd.a
    public void setSavedIAMs(String str) {
        this._prefs.saveString("OneSignal", "PREFS_OS_CACHED_IAMS", str);
    }

    @Override // com.gamericefishpro.space.zd.a
    public void setViewPageImpressionedIds(Set<String> set) {
        this._prefs.saveStringSet("OneSignal", "PREFS_OS_PAGE_IMPRESSIONED_IAMS", set);
    }
}
