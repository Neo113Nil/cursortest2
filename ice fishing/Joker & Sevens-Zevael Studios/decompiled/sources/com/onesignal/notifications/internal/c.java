package com.onesignal.notifications.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x2.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements ca.c {
    private List<? extends ca.b> actionButtons;
    private JSONObject additionalData;
    private int androidNotificationId;
    private ca.a backgroundImageLayout;
    private String bigPicture;
    private String body;
    private String collapseId;
    private final com.onesignal.common.threading.d displayWaiter;
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

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a implements ca.b {
        private final String icon;

        /* renamed from: id, reason: collision with root package name */
        private final String f1478id;
        private final String text;

        public a() {
            this(null, null, null, 7, null);
        }

        @Override // ca.b
        public String getIcon() {
            return this.icon;
        }

        @Override // ca.b
        public String getId() {
            return this.f1478id;
        }

        @Override // ca.b
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
            this.f1478id = str;
            this.text = str2;
            this.icon = str3;
        }

        public /* synthetic */ a(String str, String str2, String str3, int i10, pc.f fVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(JSONObject jSONObject, e9.a aVar) {
        this(null, jSONObject, 0, aVar);
        pc.j.e(jSONObject, "payload");
        pc.j.e(aVar, bb.e.TIME);
    }

    private final void initPayloadData(JSONObject jSONObject, e9.a aVar) {
        try {
            JSONObject customJSONObject = na.e.INSTANCE.getCustomJSONObject(jSONObject);
            long currentTimeMillis = aVar.getCurrentTimeMillis();
            if (jSONObject.has("google.ttl")) {
                setSentTime(jSONObject.optLong("google.sent_time", currentTimeMillis) / 1000);
                setTtl(jSONObject.optInt("google.ttl", 259200));
            } else if (jSONObject.has(com.onesignal.notifications.bridges.a.HMS_TTL_KEY)) {
                setSentTime(jSONObject.optLong(com.onesignal.notifications.bridges.a.HMS_SENT_TIME_KEY, currentTimeMillis) / 1000);
                setTtl(jSONObject.optInt(com.onesignal.notifications.bridges.a.HMS_TTL_KEY, 259200));
            } else {
                setSentTime(currentTimeMillis / 1000);
                setTtl(259200);
            }
            setNotificationId(com.onesignal.common.f.safeString(customJSONObject, "i"));
            setTemplateId(com.onesignal.common.f.safeString(customJSONObject, "ti"));
            setTemplateName(com.onesignal.common.f.safeString(customJSONObject, "tn"));
            String jSONObject2 = jSONObject.toString();
            pc.j.d(jSONObject2, "currentJsonPayload.toString()");
            setRawPayload(jSONObject2);
            setAdditionalData(com.onesignal.common.f.safeJSONObject(customJSONObject, ka.a.PUSH_ADDITIONAL_DATA_KEY));
            setLaunchURL(com.onesignal.common.f.safeString(customJSONObject, "u"));
            setBody(com.onesignal.common.f.safeString(jSONObject, "alert"));
            setTitle(com.onesignal.common.f.safeString(jSONObject, "title"));
            setSmallIcon(com.onesignal.common.f.safeString(jSONObject, "sicon"));
            setBigPicture(com.onesignal.common.f.safeString(jSONObject, "bicon"));
            setLargeIcon(com.onesignal.common.f.safeString(jSONObject, "licon"));
            setSound(com.onesignal.common.f.safeString(jSONObject, "sound"));
            setGroupKey(com.onesignal.common.f.safeString(jSONObject, "grp"));
            setGroupMessage(com.onesignal.common.f.safeString(jSONObject, "grp_msg"));
            setSmallIconAccentColor(com.onesignal.common.f.safeString(jSONObject, "bgac"));
            setLedColor(com.onesignal.common.f.safeString(jSONObject, "ledc"));
            String safeString = com.onesignal.common.f.safeString(jSONObject, "vis");
            if (safeString != null) {
                setLockScreenVisibility(Integer.parseInt(safeString));
            }
            setFromProjectNumber(com.onesignal.common.f.safeString(jSONObject, "from"));
            setPriority(jSONObject.optInt("pri", 0));
            String safeString2 = com.onesignal.common.f.safeString(jSONObject, "collapse_key");
            if (!"do_not_collapse".equals(safeString2)) {
                setCollapseId(safeString2);
            }
            try {
                setActionButtonsFromData();
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.error("Error assigning OSNotificationReceivedEvent.actionButtons values!", th);
            }
            try {
                setBackgroundImageLayoutFromData(jSONObject);
            } catch (Throwable th2) {
                com.onesignal.debug.internal.logging.b.error("Error assigning OSNotificationReceivedEvent.backgroundImageLayout values!", th2);
            }
        } catch (Throwable th3) {
            com.onesignal.debug.internal.logging.b.error("Error assigning OSNotificationReceivedEvent payload values!", th3);
        }
    }

    private final void setActionButtonsFromData() {
        if (getAdditionalData() != null) {
            JSONObject additionalData = getAdditionalData();
            pc.j.b(additionalData);
            if (additionalData.has("actionButtons")) {
                JSONObject additionalData2 = getAdditionalData();
                pc.j.b(additionalData2);
                JSONArray jSONArray = additionalData2.getJSONArray("actionButtons");
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    pc.j.d(jSONObject, "jsonActionButton");
                    arrayList.add(new a(com.onesignal.common.f.safeString(jSONObject, "id"), com.onesignal.common.f.safeString(jSONObject, "text"), com.onesignal.common.f.safeString(jSONObject, "icon")));
                }
                setActionButtons(arrayList);
                JSONObject additionalData3 = getAdditionalData();
                pc.j.b(additionalData3);
                additionalData3.remove("actionId");
                JSONObject additionalData4 = getAdditionalData();
                pc.j.b(additionalData4);
                additionalData4.remove("actionButtons");
            }
        }
    }

    private final void setBackgroundImageLayoutFromData(JSONObject jSONObject) {
        String safeString = com.onesignal.common.f.safeString(jSONObject, "bg_img");
        if (safeString != null) {
            JSONObject jSONObject2 = new JSONObject(safeString);
            setBackgroundImageLayout(new ca.a(com.onesignal.common.f.safeString(jSONObject2, "img"), com.onesignal.common.f.safeString(jSONObject2, "tc"), com.onesignal.common.f.safeString(jSONObject2, "bc")));
        }
    }

    @Override // ca.c, ca.d
    public void display() {
        this.displayWaiter.wake(Boolean.TRUE);
    }

    @Override // ca.c, ca.e, ca.f, ca.d
    public List<ca.b> getActionButtons() {
        return this.actionButtons;
    }

    @Override // ca.c, ca.e, ca.f, ca.d
    public JSONObject getAdditionalData() {
        return this.additionalData;
    }

    @Override // ca.c, ca.e, ca.f, ca.d
    public int getAndroidNotificationId() {
        return this.androidNotificationId;
    }

    @Override // ca.c, ca.e, ca.f, ca.d
    public ca.a getBackgroundImageLayout() {
        return this.backgroundImageLayout;
    }

    @Override // ca.c, ca.e, ca.f, ca.d
    public String getBigPicture() {
        return this.bigPicture;
    }

    @Override // ca.c, ca.e, ca.f, ca.d
    public String getBody() {
        return this.body;
    }

    @Override // ca.c, ca.e, ca.f, ca.d
    public String getCollapseId() {
        return this.collapseId;
    }

    public final com.onesignal.common.threading.d getDisplayWaiter() {
        return this.displayWaiter;
    }

    @Override // ca.c, ca.e, ca.f, ca.d
    public String getFromProjectNumber() {
        return this.fromProjectNumber;
    }

    @Override // ca.c, ca.e, ca.f, ca.d
    public String getGroupKey() {
        return this.groupKey;
    }

    @Override // ca.c, ca.e, ca.f, ca.d
    public String getGroupMessage() {
        return this.groupMessage;
    }

    @Override // ca.c, ca.e, ca.f, ca.d
    public List<c> getGroupedNotifications() {
        return this.groupedNotifications;
    }

    @Override // ca.c, ca.e, ca.f, ca.d
    public String getLargeIcon() {
        return this.largeIcon;
    }

    @Override // ca.c, ca.e, ca.f, ca.d
    public String getLaunchURL() {
        return this.launchURL;
    }

    @Override // ca.c, ca.e, ca.f, ca.d
    public String getLedColor() {
        return this.ledColor;
    }

    @Override // ca.c, ca.e, ca.f, ca.d
    public int getLockScreenVisibility() {
        return this.lockScreenVisibility;
    }

    public final j getNotificationExtender() {
        return null;
    }

    @Override // ca.c, ca.e, ca.f, ca.d
    public String getNotificationId() {
        return this.notificationId;
    }

    @Override // ca.c, ca.e, ca.f, ca.d
    public int getPriority() {
        return this.priority;
    }

    @Override // ca.c, ca.e, ca.f, ca.d
    public String getRawPayload() {
        return this.rawPayload;
    }

    @Override // ca.c, ca.e, ca.f, ca.d
    public long getSentTime() {
        return this.sentTime;
    }

    @Override // ca.c, ca.e, ca.f, ca.d
    public String getSmallIcon() {
        return this.smallIcon;
    }

    @Override // ca.c, ca.e, ca.f, ca.d
    public String getSmallIconAccentColor() {
        return this.smallIconAccentColor;
    }

    @Override // ca.c, ca.e, ca.f, ca.d
    public String getSound() {
        return this.sound;
    }

    @Override // ca.c, ca.e, ca.f, ca.d
    public String getTemplateId() {
        return this.templateId;
    }

    @Override // ca.c, ca.e, ca.f, ca.d
    public String getTemplateName() {
        return this.templateName;
    }

    @Override // ca.c, ca.e, ca.f, ca.d
    public String getTitle() {
        return this.title;
    }

    @Override // ca.c, ca.e, ca.f, ca.d
    public int getTtl() {
        return this.ttl;
    }

    public final boolean hasNotificationId() {
        return getAndroidNotificationId() != 0;
    }

    public void setActionButtons(List<? extends ca.b> list) {
        this.actionButtons = list;
    }

    public void setAdditionalData(JSONObject jSONObject) {
        this.additionalData = jSONObject;
    }

    public void setAndroidNotificationId(int i10) {
        this.androidNotificationId = i10;
    }

    public void setBackgroundImageLayout(ca.a aVar) {
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

    public void setLockScreenVisibility(int i10) {
        this.lockScreenVisibility = i10;
    }

    public void setNotificationId(String str) {
        this.notificationId = str;
    }

    public void setPriority(int i10) {
        this.priority = i10;
    }

    public void setRawPayload(String str) {
        pc.j.e(str, "<set-?>");
        this.rawPayload = str;
    }

    public void setSentTime(long j3) {
        this.sentTime = j3;
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

    public void setTtl(int i10) {
        this.ttl = i10;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("androidNotificationId", getAndroidNotificationId());
            JSONArray jSONArray = new JSONArray();
            if (getGroupedNotifications() != null) {
                List<c> groupedNotifications = getGroupedNotifications();
                pc.j.b(groupedNotifications);
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
                List<ca.b> actionButtons = getActionButtons();
                pc.j.b(actionButtons);
                for (ca.b bVar : actionButtons) {
                    pc.j.c(bVar, "null cannot be cast to non-null type com.onesignal.notifications.internal.Notification.ActionButton");
                    jSONArray2.put(((a) bVar).toJSONObject());
                }
                jSONObject.put("actionButtons", jSONArray2);
            }
            jSONObject.put("rawPayload", getRawPayload());
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return "OSNotification{notificationExtender=null, groupedNotifications=" + getGroupedNotifications() + ", androidNotificationId=" + getAndroidNotificationId() + ", notificationId='" + getNotificationId() + "', templateName='" + getTemplateName() + "', templateId='" + getTemplateId() + "', title='" + getTitle() + "', body='" + getBody() + "', additionalData=" + getAdditionalData() + ", smallIcon='" + getSmallIcon() + "', largeIcon='" + getLargeIcon() + "', bigPicture='" + getBigPicture() + "', smallIconAccentColor='" + getSmallIconAccentColor() + "', launchURL='" + getLaunchURL() + "', sound='" + getSound() + "', ledColor='" + getLedColor() + "', lockScreenVisibility=" + getLockScreenVisibility() + ", groupKey='" + getGroupKey() + "', groupMessage='" + getGroupMessage() + "', actionButtons=" + getActionButtons() + ", fromProjectNumber='" + getFromProjectNumber() + "', backgroundImageLayout=" + getBackgroundImageLayout() + ", collapseId='" + getCollapseId() + "', priority=" + getPriority() + ", rawPayload='" + getRawPayload() + "'}";
    }

    public c(List<c> list, JSONObject jSONObject, int i10, e9.a aVar) {
        pc.j.e(jSONObject, "jsonPayload");
        pc.j.e(aVar, bb.e.TIME);
        this.displayWaiter = new com.onesignal.common.threading.d();
        this.lockScreenVisibility = 1;
        this.rawPayload = "";
        initPayloadData(jSONObject, aVar);
        setGroupedNotifications(list);
        setAndroidNotificationId(i10);
    }

    @Override // ca.c, ca.e
    public void setExtender(j jVar) {
    }

    public final void setNotificationExtender(j jVar) {
    }
}
