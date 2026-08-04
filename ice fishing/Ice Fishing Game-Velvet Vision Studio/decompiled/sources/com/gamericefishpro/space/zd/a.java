package com.gamericefishpro.space.zd;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface a {
    void cleanInAppMessageClickedClickIds(Set<String> set);

    void cleanInAppMessageIds(Set<String> set);

    Set<String> getClickedMessagesId();

    Set<String> getDismissedMessagesId();

    Set<String> getImpressionesMessagesId();

    Long getLastTimeInAppDismissed();

    String getSavedIAMs();

    Set<String> getViewPageImpressionedIds();

    void setClickedMessagesId(Set<String> set);

    void setDismissedMessagesId(Set<String> set);

    void setImpressionesMessagesId(Set<String> set);

    void setLastTimeInAppDismissed(Long l);

    void setSavedIAMs(String str);

    void setViewPageImpressionedIds(Set<String> set);
}
