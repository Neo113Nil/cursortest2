package com.gamericefishpro.space.ye;

import com.gamericefishpro.space.r3.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements com.gamericefishpro.space.ve.c {
    private List<? extends com.gamericefishpro.space.ve.b> actionButtons;
    private JSONObject additionalData;
    private int androidNotificationId;
    private com.gamericefishpro.space.ve.a backgroundImageLayout;
    private String bigPicture;
    private String body;
    private String collapseId;
    private final com.gamericefishpro.space.ic.d displayWaiter;
    private String fromProjectNumber;
    private String groupKey;
    private String groupMessage;
    private List<c> groupedNotifications;
    private String largeIcon;
    private String launchURL;
    private String ledColor;
    private int lockScreenVisibility;
    private j notificationExtender;
    private String notificationId;
    private int priority;
    private String rawPayload;
    private long sentTime;
    private String smallIcon;
    private String smallIconAccentColor;
    private String sound;
    private String templateId;
    private String templateName;
    private String title;
    private int ttl;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a implements com.gamericefishpro.space.ve.b {
        private final String icon;
        private final String id;
        private final String text;

        public a() {
            this(null, null, null, 7, null);
        }

        @Override // com.gamericefishpro.space.ve.b
        public String getIcon() {
            return this.icon;
        }

        @Override // com.gamericefishpro.space.ve.b
        public String getId() {
            return this.id;
        }

        @Override // com.gamericefishpro.space.ve.b
        public String getText() {
            return this.text;
        }

        public final JSONObject toJSONObject() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", getId());
                jSONObject.put("text", getText());
                jSONObject.put("icon", getIcon());
                return jSONObject;
            } catch (Throwable th) {
                th.printStackTrace();
                return jSONObject;
            }
        }

        public a(String str, String str2, String str3) {
            this.id = str;
            this.text = str2;
            this.icon = str3;
        }

        public /* synthetic */ a(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(JSONObject payload, com.gamericefishpro.space.kd.a time) {
        this(null, payload, 0, time);
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(time, "time");
    }

    private final void initPayloadData(JSONObject jSONObject, com.gamericefishpro.space.kd.a aVar) {
        try {
            JSONObject customJSONObject = com.gamericefishpro.space.mf.e.INSTANCE.getCustomJSONObject(jSONObject);
            long currentTimeMillis = aVar.getCurrentTimeMillis();
            if (jSONObject.has("google.ttl")) {
                setSentTime(jSONObject.optLong("google.sent_time", currentTimeMillis) / ((long) 1000));
                setTtl(jSONObject.optInt("google.ttl", 259200));
            } else if (jSONObject.has(com.gamericefishpro.space.xe.a.HMS_TTL_KEY)) {
                setSentTime(jSONObject.optLong(com.gamericefishpro.space.xe.a.HMS_SENT_TIME_KEY, currentTimeMillis) / ((long) 1000));
                setTtl(jSONObject.optInt(com.gamericefishpro.space.xe.a.HMS_TTL_KEY, 259200));
            } else {
                setSentTime(currentTimeMillis / ((long) 1000));
                setTtl(259200);
            }
            setNotificationId(com.gamericefishpro.space.yb.d.safeString(customJSONObject, "i"));
            setTemplateId(com.gamericefishpro.space.yb.d.safeString(customJSONObject, "ti"));
            setTemplateName(com.gamericefishpro.space.yb.d.safeString(customJSONObject, "tn"));
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            setRawPayload(string);
            setAdditionalData(com.gamericefishpro.space.yb.d.safeJSONObject(customJSONObject, com.gamericefishpro.space.jf.a.PUSH_ADDITIONAL_DATA_KEY));
            setLaunchURL(com.gamericefishpro.space.yb.d.safeString(customJSONObject, "u"));
            setBody(com.gamericefishpro.space.yb.d.safeString(jSONObject, "alert"));
            setTitle(com.gamericefishpro.space.yb.d.safeString(jSONObject, "title"));
            setSmallIcon(com.gamericefishpro.space.yb.d.safeString(jSONObject, "sicon"));
            setBigPicture(com.gamericefishpro.space.yb.d.safeString(jSONObject, "bicon"));
            setLargeIcon(com.gamericefishpro.space.yb.d.safeString(jSONObject, "licon"));
            setSound(com.gamericefishpro.space.yb.d.safeString(jSONObject, "sound"));
            setGroupKey(com.gamericefishpro.space.yb.d.safeString(jSONObject, "grp"));
            setGroupMessage(com.gamericefishpro.space.yb.d.safeString(jSONObject, "grp_msg"));
            setSmallIconAccentColor(com.gamericefishpro.space.yb.d.safeString(jSONObject, "bgac"));
            setLedColor(com.gamericefishpro.space.yb.d.safeString(jSONObject, "ledc"));
            String strSafeString = com.gamericefishpro.space.yb.d.safeString(jSONObject, "vis");
            if (strSafeString != null) {
                setLockScreenVisibility(Integer.parseInt(strSafeString));
            }
            setFromProjectNumber(com.gamericefishpro.space.yb.d.safeString(jSONObject, "from"));
            setPriority(jSONObject.optInt("pri", 0));
            String strSafeString2 = com.gamericefishpro.space.yb.d.safeString(jSONObject, "collapse_key");
            if (!"do_not_collapse".equals(strSafeString2)) {
                setCollapseId(strSafeString2);
            }
            try {
                setActionButtonsFromData();
            } catch (Throwable th) {
                com.gamericefishpro.space.od.b.error("Error assigning OSNotificationReceivedEvent.actionButtons values!", th);
            }
            try {
                setBackgroundImageLayoutFromData(jSONObject);
            } catch (Throwable th2) {
                com.gamericefishpro.space.od.b.error("Error assigning OSNotificationReceivedEvent.backgroundImageLayout values!", th2);
            }
        } catch (Throwable th3) {
            com.gamericefishpro.space.od.b.error("Error assigning OSNotificationReceivedEvent payload values!", th3);
        }
    }

    private final void setActionButtonsFromData() throws JSONException {
        if (getAdditionalData() != null) {
            JSONObject additionalData = getAdditionalData();
            Intrinsics.b(additionalData);
            if (additionalData.has("actionButtons")) {
                JSONObject additionalData2 = getAdditionalData();
                Intrinsics.b(additionalData2);
                JSONArray jSONArray = additionalData2.getJSONArray("actionButtons");
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    Intrinsics.b(jSONObject);
                    arrayList.add(new a(com.gamericefishpro.space.yb.d.safeString(jSONObject, "id"), com.gamericefishpro.space.yb.d.safeString(jSONObject, "text"), com.gamericefishpro.space.yb.d.safeString(jSONObject, "icon")));
                }
                setActionButtons(arrayList);
                JSONObject additionalData3 = getAdditionalData();
                Intrinsics.b(additionalData3);
                additionalData3.remove("actionId");
                JSONObject additionalData4 = getAdditionalData();
                Intrinsics.b(additionalData4);
                additionalData4.remove("actionButtons");
            }
        }
    }

    private final void setBackgroundImageLayoutFromData(JSONObject jSONObject) {
        String strSafeString = com.gamericefishpro.space.yb.d.safeString(jSONObject, "bg_img");
        if (strSafeString != null) {
            JSONObject jSONObject2 = new JSONObject(strSafeString);
            setBackgroundImageLayout(new com.gamericefishpro.space.ve.a(com.gamericefishpro.space.yb.d.safeString(jSONObject2, "img"), com.gamericefishpro.space.yb.d.safeString(jSONObject2, "tc"), com.gamericefishpro.space.yb.d.safeString(jSONObject2, "bc")));
        }
    }

    @Override // com.gamericefishpro.space.ve.c, com.gamericefishpro.space.ve.d
    public void display() {
        this.displayWaiter.wake(Boolean.TRUE);
    }

    @Override // com.gamericefishpro.space.ve.c, com.gamericefishpro.space.ve.e, com.gamericefishpro.space.ve.f, com.gamericefishpro.space.ve.d
    public List<com.gamericefishpro.space.ve.b> getActionButtons() {
        return this.actionButtons;
    }

    @Override // com.gamericefishpro.space.ve.c, com.gamericefishpro.space.ve.e, com.gamericefishpro.space.ve.f, com.gamericefishpro.space.ve.d
    public JSONObject getAdditionalData() {
        return this.additionalData;
    }

    @Override // com.gamericefishpro.space.ve.c, com.gamericefishpro.space.ve.e, com.gamericefishpro.space.ve.f, com.gamericefishpro.space.ve.d
    public int getAndroidNotificationId() {
        return this.androidNotificationId;
    }

    @Override // com.gamericefishpro.space.ve.c, com.gamericefishpro.space.ve.e, com.gamericefishpro.space.ve.f, com.gamericefishpro.space.ve.d
    public com.gamericefishpro.space.ve.a getBackgroundImageLayout() {
        return this.backgroundImageLayout;
    }

    @Override // com.gamericefishpro.space.ve.c, com.gamericefishpro.space.ve.e, com.gamericefishpro.space.ve.f, com.gamericefishpro.space.ve.d
    public String getBigPicture() {
        return this.bigPicture;
    }

    @Override // com.gamericefishpro.space.ve.c, com.gamericefishpro.space.ve.e, com.gamericefishpro.space.ve.f, com.gamericefishpro.space.ve.d
    public String getBody() {
        return this.body;
    }

    @Override // com.gamericefishpro.space.ve.c, com.gamericefishpro.space.ve.e, com.gamericefishpro.space.ve.f, com.gamericefishpro.space.ve.d
    public String getCollapseId() {
        return this.collapseId;
    }

    public final com.gamericefishpro.space.ic.d getDisplayWaiter() {
        return this.displayWaiter;
    }

    @Override // com.gamericefishpro.space.ve.c, com.gamericefishpro.space.ve.e, com.gamericefishpro.space.ve.f, com.gamericefishpro.space.ve.d
    public String getFromProjectNumber() {
        return this.fromProjectNumber;
    }

    @Override // com.gamericefishpro.space.ve.c, com.gamericefishpro.space.ve.e, com.gamericefishpro.space.ve.f, com.gamericefishpro.space.ve.d
    public String getGroupKey() {
        return this.groupKey;
    }

    @Override // com.gamericefishpro.space.ve.c, com.gamericefishpro.space.ve.e, com.gamericefishpro.space.ve.f, com.gamericefishpro.space.ve.d
    public String getGroupMessage() {
        return this.groupMessage;
    }

    @Override // com.gamericefishpro.space.ve.c, com.gamericefishpro.space.ve.e, com.gamericefishpro.space.ve.f, com.gamericefishpro.space.ve.d
    public List<c> getGroupedNotifications() {
        return this.groupedNotifications;
    }

    @Override // com.gamericefishpro.space.ve.c, com.gamericefishpro.space.ve.e, com.gamericefishpro.space.ve.f, com.gamericefishpro.space.ve.d
    public String getLargeIcon() {
        return this.largeIcon;
    }

    @Override // com.gamericefishpro.space.ve.c, com.gamericefishpro.space.ve.e, com.gamericefishpro.space.ve.f, com.gamericefishpro.space.ve.d
    public String getLaunchURL() {
        return this.launchURL;
    }

    @Override // com.gamericefishpro.space.ve.c, com.gamericefishpro.space.ve.e, com.gamericefishpro.space.ve.f, com.gamericefishpro.space.ve.d
    public String getLedColor() {
        return this.ledColor;
    }

    @Override // com.gamericefishpro.space.ve.c, com.gamericefishpro.space.ve.e, com.gamericefishpro.space.ve.f, com.gamericefishpro.space.ve.d
    public int getLockScreenVisibility() {
        return this.lockScreenVisibility;
    }

    public final j getNotificationExtender() {
        return null;
    }

    @Override // com.gamericefishpro.space.ve.c, com.gamericefishpro.space.ve.e, com.gamericefishpro.space.ve.f, com.gamericefishpro.space.ve.d
    public String getNotificationId() {
        return this.notificationId;
    }

    @Override // com.gamericefishpro.space.ve.c, com.gamericefishpro.space.ve.e, com.gamericefishpro.space.ve.f, com.gamericefishpro.space.ve.d
    public int getPriority() {
        return this.priority;
    }

    @Override // com.gamericefishpro.space.ve.c, com.gamericefishpro.space.ve.e, com.gamericefishpro.space.ve.f, com.gamericefishpro.space.ve.d
    public String getRawPayload() {
        return this.rawPayload;
    }

    @Override // com.gamericefishpro.space.ve.c, com.gamericefishpro.space.ve.e, com.gamericefishpro.space.ve.f, com.gamericefishpro.space.ve.d
    public long getSentTime() {
        return this.sentTime;
    }

    @Override // com.gamericefishpro.space.ve.c, com.gamericefishpro.space.ve.e, com.gamericefishpro.space.ve.f, com.gamericefishpro.space.ve.d
    public String getSmallIcon() {
        return this.smallIcon;
    }

    @Override // com.gamericefishpro.space.ve.c, com.gamericefishpro.space.ve.e, com.gamericefishpro.space.ve.f, com.gamericefishpro.space.ve.d
    public String getSmallIconAccentColor() {
        return this.smallIconAccentColor;
    }

    @Override // com.gamericefishpro.space.ve.c, com.gamericefishpro.space.ve.e, com.gamericefishpro.space.ve.f, com.gamericefishpro.space.ve.d
    public String getSound() {
        return this.sound;
    }

    @Override // com.gamericefishpro.space.ve.c, com.gamericefishpro.space.ve.e, com.gamericefishpro.space.ve.f, com.gamericefishpro.space.ve.d
    public String getTemplateId() {
        return this.templateId;
    }

    @Override // com.gamericefishpro.space.ve.c, com.gamericefishpro.space.ve.e, com.gamericefishpro.space.ve.f, com.gamericefishpro.space.ve.d
    public String getTemplateName() {
        return this.templateName;
    }

    @Override // com.gamericefishpro.space.ve.c, com.gamericefishpro.space.ve.e, com.gamericefishpro.space.ve.f, com.gamericefishpro.space.ve.d
    public String getTitle() {
        return this.title;
    }

    @Override // com.gamericefishpro.space.ve.c, com.gamericefishpro.space.ve.e, com.gamericefishpro.space.ve.f, com.gamericefishpro.space.ve.d
    public int getTtl() {
        return this.ttl;
    }

    public final boolean hasNotificationId() {
        return getAndroidNotificationId() != 0;
    }

    public void setActionButtons(List<? extends com.gamericefishpro.space.ve.b> list) {
        this.actionButtons = list;
    }

    public void setAdditionalData(JSONObject jSONObject) {
        this.additionalData = jSONObject;
    }

    public void setAndroidNotificationId(int i) {
        this.androidNotificationId = i;
    }

    public void setBackgroundImageLayout(com.gamericefishpro.space.ve.a aVar) {
        this.backgroundImageLayout = aVar;
    }

    public void setBigPicture(String str) {
        this.bigPicture = str;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setCollapseId(String str) {
        this.collapseId = str;
    }

    public void setFromProjectNumber(String str) {
        this.fromProjectNumber = str;
    }

    public void setGroupKey(String str) {
        this.groupKey = str;
    }

    public void setGroupMessage(String str) {
        this.groupMessage = str;
    }

    public void setGroupedNotifications(List<c> list) {
        this.groupedNotifications = list;
    }

    public void setLargeIcon(String str) {
        this.largeIcon = str;
    }

    public void setLaunchURL(String str) {
        this.launchURL = str;
    }

    public void setLedColor(String str) {
        this.ledColor = str;
    }

    public void setLockScreenVisibility(int i) {
        this.lockScreenVisibility = i;
    }

    public void setNotificationId(String str) {
        this.notificationId = str;
    }

    public void setPriority(int i) {
        this.priority = i;
    }

    public void setRawPayload(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rawPayload = str;
    }

    public void setSentTime(long j) {
        this.sentTime = j;
    }

    public void setSmallIcon(String str) {
        this.smallIcon = str;
    }

    public void setSmallIconAccentColor(String str) {
        this.smallIconAccentColor = str;
    }

    public void setSound(String str) {
        this.sound = str;
    }

    public void setTemplateId(String str) {
        this.templateId = str;
    }

    public void setTemplateName(String str) {
        this.templateName = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTtl(int i) {
        this.ttl = i;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("androidNotificationId", getAndroidNotificationId());
            JSONArray jSONArray = new JSONArray();
            if (getGroupedNotifications() != null) {
                List<c> groupedNotifications = getGroupedNotifications();
                Intrinsics.b(groupedNotifications);
                Iterator<c> it = groupedNotifications.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().toJSONObject());
                }
            }
            jSONObject.put("groupedNotifications", jSONArray);
            jSONObject.put("notificationId", getNotificationId());
            jSONObject.put("templateName", getTemplateName());
            jSONObject.put("templateId", getTemplateId());
            jSONObject.put("title", getTitle());
            jSONObject.put("body", getBody());
            jSONObject.put("smallIcon", getSmallIcon());
            jSONObject.put("largeIcon", getLargeIcon());
            jSONObject.put("bigPicture", getBigPicture());
            jSONObject.put("smallIconAccentColor", getSmallIconAccentColor());
            jSONObject.put("launchURL", getLaunchURL());
            jSONObject.put("sound", getSound());
            jSONObject.put("ledColor", getLedColor());
            jSONObject.put("lockScreenVisibility", getLockScreenVisibility());
            jSONObject.put("groupKey", getGroupKey());
            jSONObject.put("groupMessage", getGroupMessage());
            jSONObject.put("fromProjectNumber", getFromProjectNumber());
            jSONObject.put("collapseId", getCollapseId());
            jSONObject.put("priority", getPriority());
            if (getAdditionalData() != null) {
                jSONObject.put("additionalData", getAdditionalData());
            }
            if (getActionButtons() != null) {
                JSONArray jSONArray2 = new JSONArray();
                List<com.gamericefishpro.space.ve.b> actionButtons = getActionButtons();
                Intrinsics.b(actionButtons);
                for (com.gamericefishpro.space.ve.b bVar : actionButtons) {
                    Intrinsics.c(bVar, "null cannot be cast to non-null type com.onesignal.notifications.internal.Notification.ActionButton");
                    jSONArray2.put(((a) bVar).toJSONObject());
                }
                jSONObject.put("actionButtons", jSONArray2);
            }
            jSONObject.put("rawPayload", getRawPayload());
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return "OSNotification{notificationExtender=null, groupedNotifications=" + getGroupedNotifications() + ", androidNotificationId=" + getAndroidNotificationId() + ", notificationId='" + getNotificationId() + "', templateName='" + getTemplateName() + "', templateId='" + getTemplateId() + "', title='" + getTitle() + "', body='" + getBody() + "', additionalData=" + getAdditionalData() + ", smallIcon='" + getSmallIcon() + "', largeIcon='" + getLargeIcon() + "', bigPicture='" + getBigPicture() + "', smallIconAccentColor='" + getSmallIconAccentColor() + "', launchURL='" + getLaunchURL() + "', sound='" + getSound() + "', ledColor='" + getLedColor() + "', lockScreenVisibility=" + getLockScreenVisibility() + ", groupKey='" + getGroupKey() + "', groupMessage='" + getGroupMessage() + "', actionButtons=" + getActionButtons() + ", fromProjectNumber='" + getFromProjectNumber() + "', backgroundImageLayout=" + getBackgroundImageLayout() + ", collapseId='" + getCollapseId() + "', priority=" + getPriority() + ", rawPayload='" + getRawPayload() + "'}";
    }

    public c(List<c> list, JSONObject jsonPayload, int i, com.gamericefishpro.space.kd.a time) {
        Intrinsics.checkNotNullParameter(jsonPayload, "jsonPayload");
        Intrinsics.checkNotNullParameter(time, "time");
        this.displayWaiter = new com.gamericefishpro.space.ic.d();
        this.lockScreenVisibility = 1;
        this.rawPayload = "";
        initPayloadData(jsonPayload, time);
        setGroupedNotifications(list);
        setAndroidNotificationId(i);
    }

    @Override // com.gamericefishpro.space.ve.c, com.gamericefishpro.space.ve.e
    public void setExtender(j jVar) {
    }

    public final void setNotificationExtender(j jVar) {
    }
}
