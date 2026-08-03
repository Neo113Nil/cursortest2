package ma;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import com.onesignal.debug.internal.logging.b;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import na.d;
import na.e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pc.j;
import q8.f;
import xc.h;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements la.a {
    private static final String CHANNEL_PREFIX = "OS_";
    public static final C0076a Companion = new C0076a(null);
    private static final String DEFAULT_CHANNEL_ID = "fcm_fallback_notification_channel";
    private static final String RESTORE_CHANNEL_ID = "restored_OS_notifications";
    private final f _applicationService;
    private final x8.a _languageContext;
    private final Pattern hexPattern;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: ma.a$a, reason: collision with other inner class name */
    public static final class C0076a {
        public /* synthetic */ C0076a(pc.f fVar) {
            this();
        }

        private C0076a() {
        }
    }

    public a(f fVar, x8.a aVar) {
        j.e(fVar, "_applicationService");
        j.e(aVar, "_languageContext");
        this._applicationService = fVar;
        this._languageContext = aVar;
        this.hexPattern = Pattern.compile("^([A-Fa-f0-9]{8})$");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:0|1|(1:3)(1:65)|4|(1:6)|7|(2:9|(22:11|12|(1:14)|15|(4:17|(1:19)|20|21)|25|(1:27)(1:63)|28|(1:32)|33|(1:35)(1:62)|36|(2:38|(1:40)(2:41|(1:45)))|46|(1:48)(1:61)|49|(1:51)|52|53|54|55|56))|64|12|(0)|15|(0)|25|(0)(0)|28|(2:30|32)|33|(0)(0)|36|(0)|46|(0)(0)|49|(0)|52|53|54|55|56) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015b, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015c, code lost:
    
        r9.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String createChannel(Context context, NotificationManager notificationManager, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        NotificationChannel notificationChannel;
        long[] parseVibrationPattern;
        Object opt = jSONObject.opt("chnl");
        if (opt instanceof String) {
            jSONObject2 = new JSONObject((String) opt);
        } else {
            j.c(opt, "null cannot be cast to non-null type org.json.JSONObject");
            jSONObject2 = (JSONObject) opt;
        }
        String str = DEFAULT_CHANNEL_ID;
        String optString = jSONObject2.optString("id", DEFAULT_CHANNEL_ID);
        if (!j.a(optString, "miscellaneous")) {
            str = optString;
        }
        if (jSONObject2.has("langs")) {
            JSONObject jSONObject4 = jSONObject2.getJSONObject("langs");
            String language = this._languageContext.getLanguage();
            if (jSONObject4.has(language)) {
                jSONObject3 = jSONObject4.optJSONObject(language);
                j.b(jSONObject3);
                notificationChannel = new NotificationChannel(str, jSONObject3.optString("nm", "Miscellaneous"), priorityToImportance(jSONObject.optInt("pri", 6)));
                notificationChannel.setDescription(jSONObject3.optString("dscr", null));
                if (jSONObject2.has("grp_id")) {
                    String optString2 = jSONObject2.optString("grp_id");
                    String optString3 = jSONObject3.optString("grp_nm");
                    j.d(optString3, "payloadWithText.optString(\"grp_nm\")");
                    notificationManager.createNotificationChannelGroup(new NotificationChannelGroup(optString2, optString3));
                    notificationChannel.setGroup(optString2);
                }
                if (jSONObject.has("ledc")) {
                    String optString4 = jSONObject.optString("ledc");
                    if (!this.hexPattern.matcher(optString4).matches()) {
                        b.warn$default("OneSignal LED Color Settings: ARGB Hex value incorrect format (E.g: FF9900FF)", null, 2, null);
                        optString4 = "FFFFFFFF";
                    }
                    try {
                        notificationChannel.setLightColor(new BigInteger(optString4, 16).intValue());
                    } catch (Throwable th) {
                        b.error("Couldn't convert ARGB Hex value to BigInteger:", th);
                    }
                }
                notificationChannel.enableLights(jSONObject.optInt("led", 1) != 1);
                if (jSONObject.has("vib_pt") && (parseVibrationPattern = e.INSTANCE.parseVibrationPattern(jSONObject)) != null) {
                    notificationChannel.setVibrationPattern(parseVibrationPattern);
                }
                notificationChannel.enableVibration(jSONObject.optInt("vib", 1) != 1);
                if (jSONObject.has("sound")) {
                    String optString5 = jSONObject.optString("sound", null);
                    Uri soundUri = e.INSTANCE.getSoundUri(context, optString5);
                    if (soundUri != null) {
                        notificationChannel.setSound(soundUri, null);
                    } else if ("null".equals(optString5) || "nil".equals(optString5)) {
                        notificationChannel.setSound(null, null);
                    }
                }
                notificationChannel.setLockscreenVisibility(jSONObject.optInt("vis", 0));
                notificationChannel.setShowBadge(jSONObject.optInt("bdg", 1) != 1);
                notificationChannel.setBypassDnd(jSONObject.optInt("bdnd", 0) == 1);
                b.verbose$default("Creating notification channel with channel:\n" + notificationChannel, null, 2, null);
                notificationManager.createNotificationChannel(notificationChannel);
                j.d(str, "channelId");
                return str;
            }
        }
        jSONObject3 = jSONObject2;
        j.b(jSONObject3);
        notificationChannel = new NotificationChannel(str, jSONObject3.optString("nm", "Miscellaneous"), priorityToImportance(jSONObject.optInt("pri", 6)));
        notificationChannel.setDescription(jSONObject3.optString("dscr", null));
        if (jSONObject2.has("grp_id")) {
        }
        if (jSONObject.has("ledc")) {
        }
        notificationChannel.enableLights(jSONObject.optInt("led", 1) != 1);
        if (jSONObject.has("vib_pt")) {
            notificationChannel.setVibrationPattern(parseVibrationPattern);
        }
        notificationChannel.enableVibration(jSONObject.optInt("vib", 1) != 1);
        if (jSONObject.has("sound")) {
        }
        notificationChannel.setLockscreenVisibility(jSONObject.optInt("vis", 0));
        notificationChannel.setShowBadge(jSONObject.optInt("bdg", 1) != 1);
        notificationChannel.setBypassDnd(jSONObject.optInt("bdnd", 0) == 1);
        b.verbose$default("Creating notification channel with channel:\n" + notificationChannel, null, 2, null);
        notificationManager.createNotificationChannel(notificationChannel);
        j.d(str, "channelId");
        return str;
    }

    private final String createDefaultChannel(NotificationManager notificationManager) {
        NotificationChannel notificationChannel = new NotificationChannel(DEFAULT_CHANNEL_ID, "Miscellaneous", 3);
        notificationChannel.enableLights(true);
        notificationChannel.enableVibration(true);
        notificationManager.createNotificationChannel(notificationChannel);
        return DEFAULT_CHANNEL_ID;
    }

    private final String createRestoreChannel(NotificationManager notificationManager) {
        notificationManager.createNotificationChannel(new NotificationChannel(RESTORE_CHANNEL_ID, "Restored", 2));
        return RESTORE_CHANNEL_ID;
    }

    private final int priorityToImportance(int i10) {
        if (i10 > 9) {
            return 5;
        }
        if (i10 > 7) {
            return 4;
        }
        if (i10 > 5) {
            return 3;
        }
        if (i10 > 3) {
            return 2;
        }
        return i10 > 1 ? 1 : 0;
    }

    @Override // la.a
    public String createNotificationChannel(d dVar) {
        j.e(dVar, "notificationJob");
        Context appContext = this._applicationService.getAppContext();
        JSONObject jsonPayload = dVar.getJsonPayload();
        j.b(jsonPayload);
        NotificationManager notificationManager = e.INSTANCE.getNotificationManager(appContext);
        if (dVar.isRestoring()) {
            return createRestoreChannel(notificationManager);
        }
        if (jsonPayload.has("oth_chnl")) {
            String optString = jsonPayload.optString("oth_chnl");
            if (notificationManager.getNotificationChannel(optString) != null) {
                j.d(optString, "otherChannel");
                return optString;
            }
        }
        if (!jsonPayload.has("chnl")) {
            return createDefaultChannel(notificationManager);
        }
        try {
            return createChannel(appContext, notificationManager, jsonPayload);
        } catch (JSONException e10) {
            b.error("Could not create notification channel due to JSON payload error!", e10);
            return DEFAULT_CHANNEL_ID;
        }
    }

    @Override // la.a
    public void processChannelList(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        NotificationManager notificationManager = e.INSTANCE.getNotificationManager(this._applicationService.getAppContext());
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            try {
                Context appContext = this._applicationService.getAppContext();
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                j.d(jSONObject, "list.getJSONObject(i)");
                hashSet.add(createChannel(appContext, notificationManager, jSONObject));
            } catch (JSONException e10) {
                b.error("Could not create notification channel due to JSON payload error!", e10);
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        List<NotificationChannel> arrayList = new ArrayList<>();
        try {
            List<NotificationChannel> notificationChannels = notificationManager.getNotificationChannels();
            j.d(notificationChannels, "notificationManager.notificationChannels");
            arrayList = notificationChannels;
        } catch (NullPointerException e11) {
            b.error$default("Error when trying to delete notification channel: " + e11.getMessage(), null, 2, null);
        }
        Iterator<NotificationChannel> it = arrayList.iterator();
        while (it.hasNext()) {
            String id2 = it.next().getId();
            j.d(id2, "id");
            if (h.x(id2, CHANNEL_PREFIX) && !hashSet.contains(id2)) {
                notificationManager.deleteNotificationChannel(id2);
            }
        }
    }
}
