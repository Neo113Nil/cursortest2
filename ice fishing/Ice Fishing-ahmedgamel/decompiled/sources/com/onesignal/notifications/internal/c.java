package com.onesignal.notifications.internal;

import D.v;
import com.anythink.basead.exoplayer.k.o;
import i5.C4593a;
import i5.InterfaceC4594b;
import i5.InterfaceC4595c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c implements InterfaceC4595c {
    private List<? extends InterfaceC4594b> actionButtons;
    private JSONObject additionalData;
    private int androidNotificationId;
    private C4593a backgroundImageLayout;
    private String bigPicture;
    private String body;
    private String collapseId;
    private final com.onesignal.common.threading.f displayWaiter;
    private String fromProjectNumber;
    private String groupKey;
    private String groupMessage;
    private List<c> groupedNotifications;
    private String largeIcon;
    private String launchURL;
    private String ledColor;
    private int lockScreenVisibility;
    private v notificationExtender;
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

    public static final class a implements InterfaceC4594b {
        private final String icon;
        private final String id;
        private final String text;

        public a() {
            this(null, null, null, 7, null);
        }

        @Override // i5.InterfaceC4594b
        public String getIcon() {
            return this.icon;
        }

        @Override // i5.InterfaceC4594b
        public String getId() {
            return this.id;
        }

        @Override // i5.InterfaceC4594b
        public String getText() {
            return this.text;
        }

        public final JSONObject toJSONObject() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", getId());
                jSONObject.put(o.f9232c, getText());
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

        public /* synthetic */ a(String str, String str2, String str3, int i, kotlin.jvm.internal.e eVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(JSONObject payload, K4.a time) {
        this(null, payload, 0, time);
        kotlin.jvm.internal.h.e(payload, "payload");
        kotlin.jvm.internal.h.e(time, "time");
    }

    private final void initPayloadData(JSONObject jSONObject, K4.a aVar) {
        try {
            JSONObject customJSONObject = t5.e.INSTANCE.getCustomJSONObject(jSONObject);
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
            setNotificationId(com.onesignal.common.e.safeString(customJSONObject, "i"));
            setTemplateId(com.onesignal.common.e.safeString(customJSONObject, "ti"));
            setTemplateName(com.onesignal.common.e.safeString(customJSONObject, "tn"));
            String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.h.d(jSONObject2, "toString(...)");
            setRawPayload(jSONObject2);
            setAdditionalData(com.onesignal.common.e.safeJSONObject(customJSONObject, "a"));
            setLaunchURL(com.onesignal.common.e.safeString(customJSONObject, "u"));
            setBody(com.onesignal.common.e.safeString(jSONObject, "alert"));
            setTitle(com.onesignal.common.e.safeString(jSONObject, "title"));
            setSmallIcon(com.onesignal.common.e.safeString(jSONObject, "sicon"));
            setBigPicture(com.onesignal.common.e.safeString(jSONObject, "bicon"));
            setLargeIcon(com.onesignal.common.e.safeString(jSONObject, "licon"));
            setSound(com.onesignal.common.e.safeString(jSONObject, "sound"));
            setGroupKey(com.onesignal.common.e.safeString(jSONObject, "grp"));
            setGroupMessage(com.onesignal.common.e.safeString(jSONObject, "grp_msg"));
            setSmallIconAccentColor(com.onesignal.common.e.safeString(jSONObject, "bgac"));
            setLedColor(com.onesignal.common.e.safeString(jSONObject, "ledc"));
            String safeString = com.onesignal.common.e.safeString(jSONObject, "vis");
            if (safeString != null) {
                setLockScreenVisibility(Integer.parseInt(safeString));
            }
            setFromProjectNumber(com.onesignal.common.e.safeString(jSONObject, "from"));
            setPriority(jSONObject.optInt("pri", 0));
            String safeString2 = com.onesignal.common.e.safeString(jSONObject, "collapse_key");
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
            kotlin.jvm.internal.h.b(additionalData);
            if (additionalData.has("actionButtons")) {
                JSONObject additionalData2 = getAdditionalData();
                kotlin.jvm.internal.h.b(additionalData2);
                JSONArray jSONArray = additionalData2.getJSONArray("actionButtons");
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    kotlin.jvm.internal.h.b(jSONObject);
                    arrayList.add(new a(com.onesignal.common.e.safeString(jSONObject, "id"), com.onesignal.common.e.safeString(jSONObject, o.f9232c), com.onesignal.common.e.safeString(jSONObject, "icon")));
                }
                setActionButtons(arrayList);
                JSONObject additionalData3 = getAdditionalData();
                kotlin.jvm.internal.h.b(additionalData3);
                additionalData3.remove("actionId");
                JSONObject additionalData4 = getAdditionalData();
                kotlin.jvm.internal.h.b(additionalData4);
                additionalData4.remove("actionButtons");
            }
        }
    }

    private final void setBackgroundImageLayoutFromData(JSONObject jSONObject) {
        String safeString = com.onesignal.common.e.safeString(jSONObject, "bg_img");
        if (safeString != null) {
            JSONObject jSONObject2 = new JSONObject(safeString);
            setBackgroundImageLayout(new C4593a(com.onesignal.common.e.safeString(jSONObject2, "img"), com.onesignal.common.e.safeString(jSONObject2, "tc"), com.onesignal.common.e.safeString(jSONObject2, "bc")));
        }
    }

    @Override // i5.InterfaceC4595c, i5.InterfaceC4596d
    public void display() {
        this.displayWaiter.wake(Boolean.TRUE);
    }

    @Override // i5.InterfaceC4595c, i5.InterfaceC4597e, i5.InterfaceC4598f, i5.InterfaceC4596d
    public List<InterfaceC4594b> getActionButtons() {
        return this.actionButtons;
    }

    @Override // i5.InterfaceC4595c, i5.InterfaceC4597e, i5.InterfaceC4598f, i5.InterfaceC4596d
    public JSONObject getAdditionalData() {
        return this.additionalData;
    }

    @Override // i5.InterfaceC4595c, i5.InterfaceC4597e, i5.InterfaceC4598f, i5.InterfaceC4596d
    public int getAndroidNotificationId() {
        return this.androidNotificationId;
    }

    @Override // i5.InterfaceC4595c, i5.InterfaceC4597e, i5.InterfaceC4598f, i5.InterfaceC4596d
    public C4593a getBackgroundImageLayout() {
        return this.backgroundImageLayout;
    }

    @Override // i5.InterfaceC4595c, i5.InterfaceC4597e, i5.InterfaceC4598f, i5.InterfaceC4596d
    public String getBigPicture() {
        return this.bigPicture;
    }

    @Override // i5.InterfaceC4595c, i5.InterfaceC4597e, i5.InterfaceC4598f, i5.InterfaceC4596d
    public String getBody() {
        return this.body;
    }

    @Override // i5.InterfaceC4595c, i5.InterfaceC4597e, i5.InterfaceC4598f, i5.InterfaceC4596d
    public String getCollapseId() {
        return this.collapseId;
    }

    public final com.onesignal.common.threading.f getDisplayWaiter() {
        return this.displayWaiter;
    }

    @Override // i5.InterfaceC4595c, i5.InterfaceC4597e, i5.InterfaceC4598f, i5.InterfaceC4596d
    public String getFromProjectNumber() {
        return this.fromProjectNumber;
    }

    @Override // i5.InterfaceC4595c, i5.InterfaceC4597e, i5.InterfaceC4598f, i5.InterfaceC4596d
    public String getGroupKey() {
        return this.groupKey;
    }

    @Override // i5.InterfaceC4595c, i5.InterfaceC4597e, i5.InterfaceC4598f, i5.InterfaceC4596d
    public String getGroupMessage() {
        return this.groupMessage;
    }

    @Override // i5.InterfaceC4595c, i5.InterfaceC4597e, i5.InterfaceC4598f, i5.InterfaceC4596d
    public List<c> getGroupedNotifications() {
        return this.groupedNotifications;
    }

    @Override // i5.InterfaceC4595c, i5.InterfaceC4597e, i5.InterfaceC4598f, i5.InterfaceC4596d
    public String getLargeIcon() {
        return this.largeIcon;
    }

    @Override // i5.InterfaceC4595c, i5.InterfaceC4597e, i5.InterfaceC4598f, i5.InterfaceC4596d
    public String getLaunchURL() {
        return this.launchURL;
    }

    @Override // i5.InterfaceC4595c, i5.InterfaceC4597e, i5.InterfaceC4598f, i5.InterfaceC4596d
    public String getLedColor() {
        return this.ledColor;
    }

    @Override // i5.InterfaceC4595c, i5.InterfaceC4597e, i5.InterfaceC4598f, i5.InterfaceC4596d
    public int getLockScreenVisibility() {
        return this.lockScreenVisibility;
    }

    public final v getNotificationExtender() {
        return null;
    }

    @Override // i5.InterfaceC4595c, i5.InterfaceC4597e, i5.InterfaceC4598f, i5.InterfaceC4596d
    public String getNotificationId() {
        return this.notificationId;
    }

    @Override // i5.InterfaceC4595c, i5.InterfaceC4597e, i5.InterfaceC4598f, i5.InterfaceC4596d
    public int getPriority() {
        return this.priority;
    }

    @Override // i5.InterfaceC4595c, i5.InterfaceC4597e, i5.InterfaceC4598f, i5.InterfaceC4596d
    public String getRawPayload() {
        return this.rawPayload;
    }

    @Override // i5.InterfaceC4595c, i5.InterfaceC4597e, i5.InterfaceC4598f, i5.InterfaceC4596d
    public long getSentTime() {
        return this.sentTime;
    }

    @Override // i5.InterfaceC4595c, i5.InterfaceC4597e, i5.InterfaceC4598f, i5.InterfaceC4596d
    public String getSmallIcon() {
        return this.smallIcon;
    }

    @Override // i5.InterfaceC4595c, i5.InterfaceC4597e, i5.InterfaceC4598f, i5.InterfaceC4596d
    public String getSmallIconAccentColor() {
        return this.smallIconAccentColor;
    }

    @Override // i5.InterfaceC4595c, i5.InterfaceC4597e, i5.InterfaceC4598f, i5.InterfaceC4596d
    public String getSound() {
        return this.sound;
    }

    @Override // i5.InterfaceC4595c, i5.InterfaceC4597e, i5.InterfaceC4598f, i5.InterfaceC4596d
    public String getTemplateId() {
        return this.templateId;
    }

    @Override // i5.InterfaceC4595c, i5.InterfaceC4597e, i5.InterfaceC4598f, i5.InterfaceC4596d
    public String getTemplateName() {
        return this.templateName;
    }

    @Override // i5.InterfaceC4595c, i5.InterfaceC4597e, i5.InterfaceC4598f, i5.InterfaceC4596d
    public String getTitle() {
        return this.title;
    }

    @Override // i5.InterfaceC4595c, i5.InterfaceC4597e, i5.InterfaceC4598f, i5.InterfaceC4596d
    public int getTtl() {
        return this.ttl;
    }

    public final boolean hasNotificationId() {
        return getAndroidNotificationId() != 0;
    }

    public void setActionButtons(List<? extends InterfaceC4594b> list) {
        this.actionButtons = list;
    }

    public void setAdditionalData(JSONObject jSONObject) {
        this.additionalData = jSONObject;
    }

    public void setAndroidNotificationId(int i) {
        this.androidNotificationId = i;
    }

    public void setBackgroundImageLayout(C4593a c4593a) {
        this.backgroundImageLayout = c4593a;
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
        kotlin.jvm.internal.h.e(str, "<set-?>");
        this.rawPayload = str;
    }

    public void setSentTime(long j6) {
        this.sentTime = j6;
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
                kotlin.jvm.internal.h.b(groupedNotifications);
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
                List<InterfaceC4594b> actionButtons = getActionButtons();
                kotlin.jvm.internal.h.b(actionButtons);
                for (InterfaceC4594b interfaceC4594b : actionButtons) {
                    kotlin.jvm.internal.h.c(interfaceC4594b, "null cannot be cast to non-null type com.onesignal.notifications.internal.Notification.ActionButton");
                    jSONArray2.put(((a) interfaceC4594b).toJSONObject());
                }
                jSONObject.put("actionButtons", jSONArray2);
            }
            jSONObject.put("rawPayload", getRawPayload());
            return jSONObject;
        } catch (JSONException e9) {
            e9.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return "OSNotification{notificationExtender=null, groupedNotifications=" + getGroupedNotifications() + ", androidNotificationId=" + getAndroidNotificationId() + ", notificationId='" + getNotificationId() + "', templateName='" + getTemplateName() + "', templateId='" + getTemplateId() + "', title='" + getTitle() + "', body='" + getBody() + "', additionalData=" + getAdditionalData() + ", smallIcon='" + getSmallIcon() + "', largeIcon='" + getLargeIcon() + "', bigPicture='" + getBigPicture() + "', smallIconAccentColor='" + getSmallIconAccentColor() + "', launchURL='" + getLaunchURL() + "', sound='" + getSound() + "', ledColor='" + getLedColor() + "', lockScreenVisibility=" + getLockScreenVisibility() + ", groupKey='" + getGroupKey() + "', groupMessage='" + getGroupMessage() + "', actionButtons=" + getActionButtons() + ", fromProjectNumber='" + getFromProjectNumber() + "', backgroundImageLayout=" + getBackgroundImageLayout() + ", collapseId='" + getCollapseId() + "', priority=" + getPriority() + ", rawPayload='" + getRawPayload() + "'}";
    }

    public c(List<c> list, JSONObject jsonPayload, int i, K4.a time) {
        kotlin.jvm.internal.h.e(jsonPayload, "jsonPayload");
        kotlin.jvm.internal.h.e(time, "time");
        this.displayWaiter = new com.onesignal.common.threading.f();
        this.lockScreenVisibility = 1;
        this.rawPayload = "";
        initPayloadData(jsonPayload, time);
        setGroupedNotifications(list);
        setAndroidNotificationId(i);
    }

    @Override // i5.InterfaceC4595c, i5.InterfaceC4597e
    public void setExtender(v vVar) {
    }

    public final void setNotificationExtender(v vVar) {
    }
}
