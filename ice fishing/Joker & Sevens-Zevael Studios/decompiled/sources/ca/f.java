package ca;

import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public interface f {
    List<b> getActionButtons();

    JSONObject getAdditionalData();

    int getAndroidNotificationId();

    a getBackgroundImageLayout();

    String getBigPicture();

    String getBody();

    String getCollapseId();

    String getFromProjectNumber();

    String getGroupKey();

    String getGroupMessage();

    List<f> getGroupedNotifications();

    String getLargeIcon();

    String getLaunchURL();

    String getLedColor();

    int getLockScreenVisibility();

    String getNotificationId();

    int getPriority();

    String getRawPayload();

    long getSentTime();

    String getSmallIcon();

    String getSmallIconAccentColor();

    String getSound();

    String getTemplateId();

    String getTemplateName();

    String getTitle();

    int getTtl();
}
