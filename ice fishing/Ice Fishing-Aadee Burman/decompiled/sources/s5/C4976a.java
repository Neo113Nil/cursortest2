package s5;

import Q7.q;
import S3.i;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.onesignal.debug.internal.logging.b;
import j4.AbstractC4610d;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r5.InterfaceC4959a;
import t5.d;
import x4.f;

/* renamed from: s5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4976a implements InterfaceC4959a {
    private static final String CHANNEL_PREFIX = "OS_";
    public static final C0258a Companion = new C0258a(null);
    private static final String DEFAULT_CHANNEL_ID = "fcm_fallback_notification_channel";
    private static final String RESTORE_CHANNEL_ID = "restored_OS_notifications";
    private final f _applicationService;
    private final F4.a _languageContext;
    private final Pattern hexPattern;

    /* renamed from: s5.a$a, reason: collision with other inner class name */
    public static final class C0258a {
        public /* synthetic */ C0258a(e eVar) {
            this();
        }

        private C0258a() {
        }
    }

    public C4976a(f _applicationService, F4.a _languageContext) {
        h.e(_applicationService, "_applicationService");
        h.e(_languageContext, "_languageContext");
        this._applicationService = _applicationService;
        this._languageContext = _languageContext;
        this.hexPattern = Pattern.compile("^([A-Fa-f0-9]{8})$");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:0|1|(1:3)(1:65)|4|(1:6)|7|(2:9|(22:11|12|(1:14)|15|(4:17|(1:19)|20|21)|25|(1:27)(1:63)|28|(1:32)|33|(1:35)(1:62)|36|(2:38|(1:40)(2:41|(1:45)))|46|(1:48)(1:61)|49|(1:51)|52|53|54|55|56))|64|12|(0)|15|(0)|25|(0)(0)|28|(2:30|32)|33|(0)(0)|36|(0)|46|(0)(0)|49|(0)|52|53|54|55|56) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015c, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015d, code lost:
    
        r9.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String createChannel(Context context, NotificationManager notificationManager, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        NotificationChannel e9;
        long[] parseVibrationPattern;
        Object opt = jSONObject.opt("chnl");
        if (opt instanceof String) {
            jSONObject2 = new JSONObject((String) opt);
        } else {
            h.c(opt, "null cannot be cast to non-null type org.json.JSONObject");
            jSONObject2 = (JSONObject) opt;
        }
        String str = DEFAULT_CHANNEL_ID;
        String optString = jSONObject2.optString("id", DEFAULT_CHANNEL_ID);
        if (!h.a(optString, "miscellaneous")) {
            str = optString;
        }
        if (jSONObject2.has("langs")) {
            JSONObject jSONObject4 = jSONObject2.getJSONObject("langs");
            String language = this._languageContext.getLanguage();
            if (jSONObject4.has(language)) {
                jSONObject3 = jSONObject4.optJSONObject(language);
                h.b(jSONObject3);
                String optString2 = jSONObject3.optString("nm", "Miscellaneous");
                int priorityToImportance = priorityToImportance(jSONObject.optInt("pri", 6));
                i.u();
                e9 = i.e(priorityToImportance, str, optString2);
                e9.setDescription(jSONObject3.optString("dscr", null));
                if (jSONObject2.has("grp_id")) {
                    String optString3 = jSONObject2.optString("grp_id");
                    String optString4 = jSONObject3.optString("grp_nm");
                    h.d(optString4, "optString(...)");
                    notificationManager.createNotificationChannelGroup(AbstractC4610d.e(optString3, optString4));
                    e9.setGroup(optString3);
                }
                if (jSONObject.has("ledc")) {
                    String optString5 = jSONObject.optString("ledc");
                    if (!this.hexPattern.matcher(optString5).matches()) {
                        b.warn$default("OneSignal LED Color Settings: ARGB Hex value incorrect format (E.g: FF9900FF)", null, 2, null);
                        optString5 = "FFFFFFFF";
                    }
                    try {
                        e9.setLightColor(new BigInteger(optString5, 16).intValue());
                    } catch (Throwable th) {
                        b.warn("Couldn't convert ARGB Hex value to BigInteger:", th);
                    }
                }
                e9.enableLights(jSONObject.optInt("led", 1) != 1);
                if (jSONObject.has("vib_pt") && (parseVibrationPattern = t5.e.INSTANCE.parseVibrationPattern(jSONObject)) != null) {
                    e9.setVibrationPattern(parseVibrationPattern);
                }
                e9.enableVibration(jSONObject.optInt("vib", 1) != 1);
                if (jSONObject.has("sound")) {
                    String optString6 = jSONObject.optString("sound", null);
                    Uri soundUri = t5.e.INSTANCE.getSoundUri(context, optString6);
                    if (soundUri != null) {
                        e9.setSound(soundUri, null);
                    } else if ("null".equals(optString6) || "nil".equals(optString6)) {
                        e9.setSound(null, null);
                    }
                }
                e9.setLockscreenVisibility(jSONObject.optInt("vis", 0));
                e9.setShowBadge(jSONObject.optInt("bdg", 1) != 1);
                e9.setBypassDnd(jSONObject.optInt("bdnd", 0) == 1);
                b.verbose$default("Creating notification channel with channel:\n" + e9, null, 2, null);
                notificationManager.createNotificationChannel(e9);
                h.b(str);
                return str;
            }
        }
        jSONObject3 = jSONObject2;
        h.b(jSONObject3);
        String optString22 = jSONObject3.optString("nm", "Miscellaneous");
        int priorityToImportance2 = priorityToImportance(jSONObject.optInt("pri", 6));
        i.u();
        e9 = i.e(priorityToImportance2, str, optString22);
        e9.setDescription(jSONObject3.optString("dscr", null));
        if (jSONObject2.has("grp_id")) {
        }
        if (jSONObject.has("ledc")) {
        }
        e9.enableLights(jSONObject.optInt("led", 1) != 1);
        if (jSONObject.has("vib_pt")) {
            e9.setVibrationPattern(parseVibrationPattern);
        }
        e9.enableVibration(jSONObject.optInt("vib", 1) != 1);
        if (jSONObject.has("sound")) {
        }
        e9.setLockscreenVisibility(jSONObject.optInt("vis", 0));
        e9.setShowBadge(jSONObject.optInt("bdg", 1) != 1);
        e9.setBypassDnd(jSONObject.optInt("bdnd", 0) == 1);
        b.verbose$default("Creating notification channel with channel:\n" + e9, null, 2, null);
        notificationManager.createNotificationChannel(e9);
        h.b(str);
        return str;
    }

    private final String createDefaultChannel(NotificationManager notificationManager) {
        i.u();
        NotificationChannel w6 = AbstractC4610d.w();
        w6.enableLights(true);
        w6.enableVibration(true);
        notificationManager.createNotificationChannel(w6);
        return DEFAULT_CHANNEL_ID;
    }

    private final String createRestoreChannel(NotificationManager notificationManager) {
        i.u();
        notificationManager.createNotificationChannel(AbstractC4610d.b());
        return RESTORE_CHANNEL_ID;
    }

    private final int priorityToImportance(int i) {
        return t5.f.INSTANCE.toAndroidImportance(i);
    }

    @Override // r5.InterfaceC4959a
    public String createNotificationChannel(d notificationJob) {
        NotificationChannel notificationChannel;
        h.e(notificationJob, "notificationJob");
        if (Build.VERSION.SDK_INT < 26) {
            return DEFAULT_CHANNEL_ID;
        }
        Context appContext = this._applicationService.getAppContext();
        JSONObject jsonPayload = notificationJob.getJsonPayload();
        h.b(jsonPayload);
        NotificationManager notificationManager = t5.e.INSTANCE.getNotificationManager(appContext);
        if (notificationJob.isRestoring()) {
            return createRestoreChannel(notificationManager);
        }
        if (jsonPayload.has("oth_chnl")) {
            String optString = jsonPayload.optString("oth_chnl");
            notificationChannel = notificationManager.getNotificationChannel(optString);
            if (notificationChannel != null) {
                h.b(optString);
                return optString;
            }
        }
        if (!jsonPayload.has("chnl")) {
            return createDefaultChannel(notificationManager);
        }
        try {
            return createChannel(appContext, notificationManager, jsonPayload);
        } catch (JSONException e9) {
            b.error("Could not create notification channel due to JSON payload error!", e9);
            return DEFAULT_CHANNEL_ID;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.List] */
    @Override // r5.InterfaceC4959a
    public void processChannelList(JSONArray jSONArray) {
        String id;
        ?? notificationChannels;
        if (Build.VERSION.SDK_INT < 26 || jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        NotificationManager notificationManager = t5.e.INSTANCE.getNotificationManager(this._applicationService.getAppContext());
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                Context appContext = this._applicationService.getAppContext();
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                h.d(jSONObject, "getJSONObject(...)");
                hashSet.add(createChannel(appContext, notificationManager, jSONObject));
            } catch (JSONException e9) {
                b.error("Could not create notification channel due to JSON payload error!", e9);
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        try {
            notificationChannels = notificationManager.getNotificationChannels();
            h.d(notificationChannels, "getNotificationChannels(...)");
            arrayList = notificationChannels;
        } catch (NullPointerException e10) {
            b.warn$default("Error when trying to delete notification channel: " + e10.getMessage(), null, 2, null);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            id = AbstractC4610d.d(it.next()).getId();
            h.b(id);
            if (q.R(id, CHANNEL_PREFIX) && !hashSet.contains(id)) {
                notificationManager.deleteNotificationChannel(id);
            }
        }
    }
}
