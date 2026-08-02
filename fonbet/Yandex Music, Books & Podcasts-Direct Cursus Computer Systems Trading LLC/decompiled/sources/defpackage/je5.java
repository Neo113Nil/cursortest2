package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.d0;
import androidx.core.app.f0;
import com.connectsdk.service.airplay.PListParser;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public abstract class je5 {
    public static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX WARN: Can't wrap try/catch for region: R(74:0|1|2|3|(1:5)|226|7|8|(3:202|203|(70:205|(63:207|(1:209)|11|(1:13)|14|(1:16)|17|(54:19|(1:188)|23|(1:25)|26|(1:28)(2:178|(1:183)(1:182))|(1:30)|31|(1:33)(5:166|(1:168)|169|(1:171)(1:177)|(1:173)(2:174|(1:176)))|34|(1:36)(6:145|(4:148|(2:155|156)(1:158)|157|146)|161|162|(1:164)|165)|37|(1:39)(1:144)|(1:41)|42|(37:140|141|(1:48)|49|(1:51)|52|(31:131|(1:135)|(1:56)|57|(27:126|(1:130)|(1:61)|62|(23:123|(1:125)|(1:66)|67|(19:119|120|(1:71)|72|(3:109|110|(16:112|(1:114)|115|(1:76)|77|(4:94|95|96|(2:98|(10:100|(1:81)|82|(1:84)|85|(1:87)|88|(1:90)|91|92)(2:101|102))(2:103|104))|79|(0)|82|(0)|85|(0)|88|(0)|91|92)(2:116|117))|74|(0)|77|(0)|79|(0)|82|(0)|85|(0)|88|(0)|91|92)|69|(0)|72|(0)|74|(0)|77|(0)|79|(0)|82|(0)|85|(0)|88|(0)|91|92)|64|(0)|67|(0)|69|(0)|72|(0)|74|(0)|77|(0)|79|(0)|82|(0)|85|(0)|88|(0)|91|92)|59|(0)|62|(0)|64|(0)|67|(0)|69|(0)|72|(0)|74|(0)|77|(0)|79|(0)|82|(0)|85|(0)|88|(0)|91|92)|54|(0)|57|(0)|59|(0)|62|(0)|64|(0)|67|(0)|69|(0)|72|(0)|74|(0)|77|(0)|79|(0)|82|(0)|85|(0)|88|(0)|91|92)|44|(37:136|137|(0)|49|(0)|52|(0)|54|(0)|57|(0)|59|(0)|62|(0)|64|(0)|67|(0)|69|(0)|72|(0)|74|(0)|77|(0)|79|(0)|82|(0)|85|(0)|88|(0)|91|92)|46|(0)|49|(0)|52|(0)|54|(0)|57|(0)|59|(0)|62|(0)|64|(0)|67|(0)|69|(0)|72|(0)|74|(0)|77|(0)|79|(0)|82|(0)|85|(0)|88|(0)|91|92)|189|(2:197|198)|(1:196)|23|(0)|26|(0)(0)|(0)|31|(0)(0)|34|(0)(0)|37|(0)(0)|(0)|42|(0)|44|(0)|46|(0)|49|(0)|52|(0)|54|(0)|57|(0)|59|(0)|62|(0)|64|(0)|67|(0)|69|(0)|72|(0)|74|(0)|77|(0)|79|(0)|82|(0)|85|(0)|88|(0)|91|92)|210|(66:212|(1:214)|11|(0)|14|(0)|17|(0)|189|(1:191)|197|198|(1:194)|196|23|(0)|26|(0)(0)|(0)|31|(0)(0)|34|(0)(0)|37|(0)(0)|(0)|42|(0)|44|(0)|46|(0)|49|(0)|52|(0)|54|(0)|57|(0)|59|(0)|62|(0)|64|(0)|67|(0)|69|(0)|72|(0)|74|(0)|77|(0)|79|(0)|82|(0)|85|(0)|88|(0)|91|92)(1:222)|215|(3:217|(1:219)(1:221)|220)|11|(0)|14|(0)|17|(0)|189|(0)|197|198|(0)|196|23|(0)|26|(0)(0)|(0)|31|(0)(0)|34|(0)(0)|37|(0)(0)|(0)|42|(0)|44|(0)|46|(0)|49|(0)|52|(0)|54|(0)|57|(0)|59|(0)|62|(0)|64|(0)|67|(0)|69|(0)|72|(0)|74|(0)|77|(0)|79|(0)|82|(0)|85|(0)|88|(0)|91|92))|10|11|(0)|14|(0)|17|(0)|189|(0)|197|198|(0)|196|23|(0)|26|(0)(0)|(0)|31|(0)(0)|34|(0)(0)|37|(0)(0)|(0)|42|(0)|44|(0)|46|(0)|49|(0)|52|(0)|54|(0)|57|(0)|59|(0)|62|(0)|64|(0)|67|(0)|69|(0)|72|(0)|74|(0)|77|(0)|79|(0)|82|(0)|85|(0)|88|(0)|91|92) */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x015c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x015d, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r0 != null) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0416 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0461  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static le3 a(FirebaseMessagingService firebaseMessagingService, h4b h4bVar) {
        Bundle bundle;
        String string;
        String packageName;
        PackageManager packageManager;
        CharSequence r;
        CharSequence r2;
        String s;
        int i;
        String s2;
        Uri defaultUri;
        String s3;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        String s4;
        Integer valueOf;
        String s5;
        Integer k;
        Integer k2;
        Integer k3;
        String s6;
        Long valueOf2;
        JSONArray l;
        long[] jArr;
        JSONArray l2;
        int[] iArr;
        String s7;
        int i2;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
        }
        bundle = Bundle.EMPTY;
        Bundle bundle2 = bundle;
        String s8 = h4bVar.s("gcm.n.android_channel_id");
        if (Build.VERSION.SDK_INT >= 26) {
            if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                if (!TextUtils.isEmpty(s8)) {
                    if (notificationManager.getNotificationChannel(s8) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel requested (" + s8 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                    }
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    f0 f0Var = new f0(firebaseMessagingService, s8);
                    r = h4bVar.r(resources, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(r)) {
                        f0Var.e(r);
                    }
                    r2 = h4bVar.r(resources, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(r2)) {
                        f0Var.d(r2);
                        d0 d0Var = new d0();
                        d0Var.b = f0.c(r2);
                        f0Var.k(d0Var);
                    }
                    s = h4bVar.s("gcm.n.icon");
                    if (!TextUtils.isEmpty(s)) {
                        i = resources.getIdentifier(s, "drawable", packageName);
                        if ((i == 0 || !b(resources, i)) && ((i = resources.getIdentifier(s, "mipmap", packageName)) == 0 || !b(resources, i))) {
                            Log.w("FirebaseMessaging", "Icon resource " + s + " not found. Notification will use default icon.");
                        }
                        f0Var.K.icon = i;
                        s2 = h4bVar.s("gcm.n.sound2");
                        if (TextUtils.isEmpty(s2)) {
                            s2 = h4bVar.s("gcm.n.sound");
                        }
                        if (TextUtils.isEmpty(s2)) {
                            defaultUri = null;
                        } else if ("default".equals(s2) || resources.getIdentifier(s2, "raw", packageName) == 0) {
                            defaultUri = RingtoneManager.getDefaultUri(2);
                        } else {
                            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + s2);
                        }
                        if (defaultUri != null) {
                            f0Var.j(defaultUri);
                        }
                        s3 = h4bVar.s("gcm.n.click_action");
                        if (TextUtils.isEmpty(s3)) {
                            String s9 = h4bVar.s("gcm.n.link_android");
                            if (TextUtils.isEmpty(s9)) {
                                s9 = h4bVar.s("gcm.n.link");
                            }
                            Uri parse = !TextUtils.isEmpty(s9) ? Uri.parse(s9) : null;
                            if (parse != null) {
                                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                                launchIntentForPackage.setPackage(packageName);
                                launchIntentForPackage.setData(parse);
                            } else {
                                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                                if (launchIntentForPackage == null) {
                                    Log.w("FirebaseMessaging", "No activity found to launch app");
                                }
                            }
                        } else {
                            launchIntentForPackage = new Intent(s3);
                            launchIntentForPackage.setPackage(packageName);
                            launchIntentForPackage.setFlags(268435456);
                        }
                        AtomicInteger atomicInteger = a;
                        if (launchIntentForPackage == null) {
                            activity = null;
                        } else {
                            launchIntentForPackage.addFlags(67108864);
                            Bundle bundle3 = (Bundle) h4bVar.a;
                            Bundle bundle4 = new Bundle(bundle3);
                            for (String str : bundle3.keySet()) {
                                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                                    bundle4.remove(str);
                                }
                            }
                            launchIntentForPackage.putExtras(bundle4);
                            if (h4bVar.j("google.c.a.e")) {
                                launchIntentForPackage.putExtra("gcm.n.analytics_data", h4bVar.V());
                            }
                            activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
                        }
                        f0Var.g = activity;
                        broadcast = !h4bVar.j("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(h4bVar.V())), 1140850688);
                        if (broadcast != null) {
                            f0Var.K.deleteIntent = broadcast;
                        }
                        s4 = h4bVar.s("gcm.n.color");
                        if (!TextUtils.isEmpty(s4)) {
                            try {
                                valueOf = Integer.valueOf(Color.parseColor(s4));
                            } catch (IllegalArgumentException unused) {
                                Log.w("FirebaseMessaging", "Color is invalid: " + s4 + ". Notification will use default color.");
                            }
                            if (valueOf != null) {
                                f0Var.A = valueOf.intValue();
                            }
                            f0Var.g(16, !h4bVar.j("gcm.n.sticky"));
                            f0Var.v = h4bVar.j("gcm.n.local_only");
                            s5 = h4bVar.s("gcm.n.ticker");
                            if (s5 != null) {
                                f0Var.K.tickerText = f0.c(s5);
                            }
                            k = h4bVar.k("gcm.n.notification_priority");
                            if (k != null) {
                                if (k.intValue() < -2 || k.intValue() > 2) {
                                    Log.w("FirebaseMessaging", "notificationPriority is invalid " + k + ". Skipping setting notificationPriority.");
                                }
                                if (k != null) {
                                    f0Var.k = k.intValue();
                                }
                                k2 = h4bVar.k("gcm.n.visibility");
                                if (k2 != null) {
                                    if (k2.intValue() < -1 || k2.intValue() > 1) {
                                        Log.w("NotificationParams", "visibility is invalid: " + k2 + ". Skipping setting visibility.");
                                    }
                                    if (k2 != null) {
                                        f0Var.B = k2.intValue();
                                    }
                                    k3 = h4bVar.k("gcm.n.notification_count");
                                    if (k3 != null) {
                                        if (k3.intValue() < 0) {
                                            Log.w("FirebaseMessaging", "notificationCount is invalid: " + k3 + ". Skipping setting notificationCount.");
                                        }
                                        if (k3 != null) {
                                            f0Var.j = k3.intValue();
                                        }
                                        s6 = h4bVar.s("gcm.n.event_time");
                                        if (!TextUtils.isEmpty(s6)) {
                                            try {
                                                valueOf2 = Long.valueOf(Long.parseLong(s6));
                                            } catch (NumberFormatException unused2) {
                                                Log.w("NotificationParams", "Couldn't parse value of " + h4b.Y("gcm.n.event_time") + "(" + s6 + ") into a long");
                                            }
                                            if (valueOf2 != null) {
                                                f0Var.l = true;
                                                f0Var.K.when = valueOf2.longValue();
                                            }
                                            l = h4bVar.l("gcm.n.vibrate_timings");
                                            if (l != null) {
                                                try {
                                                } catch (NumberFormatException | JSONException unused3) {
                                                    Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + l + ". Skipping setting vibrateTimings.");
                                                }
                                                if (l.length() <= 1) {
                                                    throw new JSONException("vibrateTimings have invalid length");
                                                }
                                                int length = l.length();
                                                jArr = new long[length];
                                                for (int i3 = 0; i3 < length; i3++) {
                                                    jArr[i3] = l.optLong(i3);
                                                }
                                                if (jArr != null) {
                                                    f0Var.K.vibrate = jArr;
                                                }
                                                l2 = h4bVar.l("gcm.n.light_settings");
                                                if (l2 != null) {
                                                    int[] iArr2 = new int[3];
                                                    try {
                                                    } catch (IllegalArgumentException e2) {
                                                        Log.w("NotificationParams", "LightSettings is invalid: " + l2 + ". " + e2.getMessage() + ". Skipping setting LightSettings");
                                                    } catch (JSONException unused4) {
                                                        Log.w("NotificationParams", "LightSettings is invalid: " + l2 + ". Skipping setting LightSettings");
                                                    }
                                                    if (l2.length() != 3) {
                                                        throw new JSONException("lightSettings don't have all three fields");
                                                    }
                                                    int parseColor = Color.parseColor(l2.optString(0));
                                                    if (parseColor == -16777216) {
                                                        throw new IllegalArgumentException("Transparent color is invalid");
                                                    }
                                                    iArr2[0] = parseColor;
                                                    iArr2[1] = l2.optInt(1);
                                                    iArr2[2] = l2.optInt(2);
                                                    iArr = iArr2;
                                                    if (iArr != null) {
                                                        f0Var.i(iArr[0], iArr[1], iArr[2]);
                                                    }
                                                    boolean j = h4bVar.j("gcm.n.default_sound");
                                                    boolean z = j;
                                                    if (h4bVar.j("gcm.n.default_vibrate_timings")) {
                                                        z = (j ? 1 : 0) | 2;
                                                    }
                                                    int i4 = z;
                                                    if (h4bVar.j("gcm.n.default_light_settings")) {
                                                        i4 = (z ? 1 : 0) | 4;
                                                    }
                                                    f0Var.f(i4);
                                                    s7 = h4bVar.s("gcm.n.tag");
                                                    if (TextUtils.isEmpty(s7)) {
                                                        s7 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                                    }
                                                    return new le3(f0Var, s7);
                                                }
                                                iArr = null;
                                                if (iArr != null) {
                                                }
                                                boolean j2 = h4bVar.j("gcm.n.default_sound");
                                                boolean z2 = j2;
                                                if (h4bVar.j("gcm.n.default_vibrate_timings")) {
                                                }
                                                int i42 = z2;
                                                if (h4bVar.j("gcm.n.default_light_settings")) {
                                                }
                                                f0Var.f(i42);
                                                s7 = h4bVar.s("gcm.n.tag");
                                                if (TextUtils.isEmpty(s7)) {
                                                }
                                                return new le3(f0Var, s7);
                                            }
                                            jArr = null;
                                            if (jArr != null) {
                                            }
                                            l2 = h4bVar.l("gcm.n.light_settings");
                                            if (l2 != null) {
                                            }
                                            iArr = null;
                                            if (iArr != null) {
                                            }
                                            boolean j22 = h4bVar.j("gcm.n.default_sound");
                                            boolean z22 = j22;
                                            if (h4bVar.j("gcm.n.default_vibrate_timings")) {
                                            }
                                            int i422 = z22;
                                            if (h4bVar.j("gcm.n.default_light_settings")) {
                                            }
                                            f0Var.f(i422);
                                            s7 = h4bVar.s("gcm.n.tag");
                                            if (TextUtils.isEmpty(s7)) {
                                            }
                                            return new le3(f0Var, s7);
                                        }
                                        valueOf2 = null;
                                        if (valueOf2 != null) {
                                        }
                                        l = h4bVar.l("gcm.n.vibrate_timings");
                                        if (l != null) {
                                        }
                                        jArr = null;
                                        if (jArr != null) {
                                        }
                                        l2 = h4bVar.l("gcm.n.light_settings");
                                        if (l2 != null) {
                                        }
                                        iArr = null;
                                        if (iArr != null) {
                                        }
                                        boolean j222 = h4bVar.j("gcm.n.default_sound");
                                        boolean z222 = j222;
                                        if (h4bVar.j("gcm.n.default_vibrate_timings")) {
                                        }
                                        int i4222 = z222;
                                        if (h4bVar.j("gcm.n.default_light_settings")) {
                                        }
                                        f0Var.f(i4222);
                                        s7 = h4bVar.s("gcm.n.tag");
                                        if (TextUtils.isEmpty(s7)) {
                                        }
                                        return new le3(f0Var, s7);
                                    }
                                    k3 = null;
                                    if (k3 != null) {
                                    }
                                    s6 = h4bVar.s("gcm.n.event_time");
                                    if (!TextUtils.isEmpty(s6)) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                    }
                                    l = h4bVar.l("gcm.n.vibrate_timings");
                                    if (l != null) {
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    l2 = h4bVar.l("gcm.n.light_settings");
                                    if (l2 != null) {
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    boolean j2222 = h4bVar.j("gcm.n.default_sound");
                                    boolean z2222 = j2222;
                                    if (h4bVar.j("gcm.n.default_vibrate_timings")) {
                                    }
                                    int i42222 = z2222;
                                    if (h4bVar.j("gcm.n.default_light_settings")) {
                                    }
                                    f0Var.f(i42222);
                                    s7 = h4bVar.s("gcm.n.tag");
                                    if (TextUtils.isEmpty(s7)) {
                                    }
                                    return new le3(f0Var, s7);
                                }
                                k2 = null;
                                if (k2 != null) {
                                }
                                k3 = h4bVar.k("gcm.n.notification_count");
                                if (k3 != null) {
                                }
                                k3 = null;
                                if (k3 != null) {
                                }
                                s6 = h4bVar.s("gcm.n.event_time");
                                if (!TextUtils.isEmpty(s6)) {
                                }
                                valueOf2 = null;
                                if (valueOf2 != null) {
                                }
                                l = h4bVar.l("gcm.n.vibrate_timings");
                                if (l != null) {
                                }
                                jArr = null;
                                if (jArr != null) {
                                }
                                l2 = h4bVar.l("gcm.n.light_settings");
                                if (l2 != null) {
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                                boolean j22222 = h4bVar.j("gcm.n.default_sound");
                                boolean z22222 = j22222;
                                if (h4bVar.j("gcm.n.default_vibrate_timings")) {
                                }
                                int i422222 = z22222;
                                if (h4bVar.j("gcm.n.default_light_settings")) {
                                }
                                f0Var.f(i422222);
                                s7 = h4bVar.s("gcm.n.tag");
                                if (TextUtils.isEmpty(s7)) {
                                }
                                return new le3(f0Var, s7);
                            }
                            k = null;
                            if (k != null) {
                            }
                            k2 = h4bVar.k("gcm.n.visibility");
                            if (k2 != null) {
                            }
                            k2 = null;
                            if (k2 != null) {
                            }
                            k3 = h4bVar.k("gcm.n.notification_count");
                            if (k3 != null) {
                            }
                            k3 = null;
                            if (k3 != null) {
                            }
                            s6 = h4bVar.s("gcm.n.event_time");
                            if (!TextUtils.isEmpty(s6)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            l = h4bVar.l("gcm.n.vibrate_timings");
                            if (l != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            l2 = h4bVar.l("gcm.n.light_settings");
                            if (l2 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean j222222 = h4bVar.j("gcm.n.default_sound");
                            boolean z222222 = j222222;
                            if (h4bVar.j("gcm.n.default_vibrate_timings")) {
                            }
                            int i4222222 = z222222;
                            if (h4bVar.j("gcm.n.default_light_settings")) {
                            }
                            f0Var.f(i4222222);
                            s7 = h4bVar.s("gcm.n.tag");
                            if (TextUtils.isEmpty(s7)) {
                            }
                            return new le3(f0Var, s7);
                        }
                        i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i2 != 0) {
                            try {
                                valueOf = Integer.valueOf(firebaseMessagingService.getColor(i2));
                            } catch (Resources.NotFoundException unused5) {
                                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                            }
                            if (valueOf != null) {
                            }
                            f0Var.g(16, !h4bVar.j("gcm.n.sticky"));
                            f0Var.v = h4bVar.j("gcm.n.local_only");
                            s5 = h4bVar.s("gcm.n.ticker");
                            if (s5 != null) {
                            }
                            k = h4bVar.k("gcm.n.notification_priority");
                            if (k != null) {
                            }
                            k = null;
                            if (k != null) {
                            }
                            k2 = h4bVar.k("gcm.n.visibility");
                            if (k2 != null) {
                            }
                            k2 = null;
                            if (k2 != null) {
                            }
                            k3 = h4bVar.k("gcm.n.notification_count");
                            if (k3 != null) {
                            }
                            k3 = null;
                            if (k3 != null) {
                            }
                            s6 = h4bVar.s("gcm.n.event_time");
                            if (!TextUtils.isEmpty(s6)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            l = h4bVar.l("gcm.n.vibrate_timings");
                            if (l != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            l2 = h4bVar.l("gcm.n.light_settings");
                            if (l2 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean j2222222 = h4bVar.j("gcm.n.default_sound");
                            boolean z2222222 = j2222222;
                            if (h4bVar.j("gcm.n.default_vibrate_timings")) {
                            }
                            int i42222222 = z2222222;
                            if (h4bVar.j("gcm.n.default_light_settings")) {
                            }
                            f0Var.f(i42222222);
                            s7 = h4bVar.s("gcm.n.tag");
                            if (TextUtils.isEmpty(s7)) {
                            }
                            return new le3(f0Var, s7);
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        f0Var.g(16, !h4bVar.j("gcm.n.sticky"));
                        f0Var.v = h4bVar.j("gcm.n.local_only");
                        s5 = h4bVar.s("gcm.n.ticker");
                        if (s5 != null) {
                        }
                        k = h4bVar.k("gcm.n.notification_priority");
                        if (k != null) {
                        }
                        k = null;
                        if (k != null) {
                        }
                        k2 = h4bVar.k("gcm.n.visibility");
                        if (k2 != null) {
                        }
                        k2 = null;
                        if (k2 != null) {
                        }
                        k3 = h4bVar.k("gcm.n.notification_count");
                        if (k3 != null) {
                        }
                        k3 = null;
                        if (k3 != null) {
                        }
                        s6 = h4bVar.s("gcm.n.event_time");
                        if (!TextUtils.isEmpty(s6)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        l = h4bVar.l("gcm.n.vibrate_timings");
                        if (l != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        l2 = h4bVar.l("gcm.n.light_settings");
                        if (l2 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean j22222222 = h4bVar.j("gcm.n.default_sound");
                        boolean z22222222 = j22222222;
                        if (h4bVar.j("gcm.n.default_vibrate_timings")) {
                        }
                        int i422222222 = z22222222;
                        if (h4bVar.j("gcm.n.default_light_settings")) {
                        }
                        f0Var.f(i422222222);
                        s7 = h4bVar.s("gcm.n.tag");
                        if (TextUtils.isEmpty(s7)) {
                        }
                        return new le3(f0Var, s7);
                    }
                    i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i != 0 || !b(resources, i)) {
                        i = packageManager.getApplicationInfo(packageName, 0).icon;
                    }
                    if (i != 0 || !b(resources, i)) {
                        i = 17301651;
                    }
                    f0Var.K.icon = i;
                    s2 = h4bVar.s("gcm.n.sound2");
                    if (TextUtils.isEmpty(s2)) {
                    }
                    if (TextUtils.isEmpty(s2)) {
                    }
                    if (defaultUri != null) {
                    }
                    s3 = h4bVar.s("gcm.n.click_action");
                    if (TextUtils.isEmpty(s3)) {
                    }
                    AtomicInteger atomicInteger2 = a;
                    if (launchIntentForPackage == null) {
                    }
                    f0Var.g = activity;
                    if (!h4bVar.j("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    s4 = h4bVar.s("gcm.n.color");
                    if (!TextUtils.isEmpty(s4)) {
                    }
                    i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i2 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    f0Var.g(16, !h4bVar.j("gcm.n.sticky"));
                    f0Var.v = h4bVar.j("gcm.n.local_only");
                    s5 = h4bVar.s("gcm.n.ticker");
                    if (s5 != null) {
                    }
                    k = h4bVar.k("gcm.n.notification_priority");
                    if (k != null) {
                    }
                    k = null;
                    if (k != null) {
                    }
                    k2 = h4bVar.k("gcm.n.visibility");
                    if (k2 != null) {
                    }
                    k2 = null;
                    if (k2 != null) {
                    }
                    k3 = h4bVar.k("gcm.n.notification_count");
                    if (k3 != null) {
                    }
                    k3 = null;
                    if (k3 != null) {
                    }
                    s6 = h4bVar.s("gcm.n.event_time");
                    if (!TextUtils.isEmpty(s6)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    l = h4bVar.l("gcm.n.vibrate_timings");
                    if (l != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    l2 = h4bVar.l("gcm.n.light_settings");
                    if (l2 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean j222222222 = h4bVar.j("gcm.n.default_sound");
                    boolean z222222222 = j222222222;
                    if (h4bVar.j("gcm.n.default_vibrate_timings")) {
                    }
                    int i4222222222 = z222222222;
                    if (h4bVar.j("gcm.n.default_light_settings")) {
                    }
                    f0Var.f(i4222222222);
                    s7 = h4bVar.s("gcm.n.tag");
                    if (TextUtils.isEmpty(s7)) {
                    }
                    return new le3(f0Var, s7);
                }
                s8 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (!TextUtils.isEmpty(s8)) {
                    if (notificationManager.getNotificationChannel(s8) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources2 = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    f0 f0Var2 = new f0(firebaseMessagingService, s8);
                    r = h4bVar.r(resources2, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(r)) {
                    }
                    r2 = h4bVar.r(resources2, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(r2)) {
                    }
                    s = h4bVar.s("gcm.n.icon");
                    if (!TextUtils.isEmpty(s)) {
                    }
                    i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i != 0) {
                    }
                    i = packageManager.getApplicationInfo(packageName, 0).icon;
                    if (i != 0) {
                    }
                    i = 17301651;
                    f0Var2.K.icon = i;
                    s2 = h4bVar.s("gcm.n.sound2");
                    if (TextUtils.isEmpty(s2)) {
                    }
                    if (TextUtils.isEmpty(s2)) {
                    }
                    if (defaultUri != null) {
                    }
                    s3 = h4bVar.s("gcm.n.click_action");
                    if (TextUtils.isEmpty(s3)) {
                    }
                    AtomicInteger atomicInteger22 = a;
                    if (launchIntentForPackage == null) {
                    }
                    f0Var2.g = activity;
                    if (!h4bVar.j("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    s4 = h4bVar.s("gcm.n.color");
                    if (!TextUtils.isEmpty(s4)) {
                    }
                    i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i2 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    f0Var2.g(16, !h4bVar.j("gcm.n.sticky"));
                    f0Var2.v = h4bVar.j("gcm.n.local_only");
                    s5 = h4bVar.s("gcm.n.ticker");
                    if (s5 != null) {
                    }
                    k = h4bVar.k("gcm.n.notification_priority");
                    if (k != null) {
                    }
                    k = null;
                    if (k != null) {
                    }
                    k2 = h4bVar.k("gcm.n.visibility");
                    if (k2 != null) {
                    }
                    k2 = null;
                    if (k2 != null) {
                    }
                    k3 = h4bVar.k("gcm.n.notification_count");
                    if (k3 != null) {
                    }
                    k3 = null;
                    if (k3 != null) {
                    }
                    s6 = h4bVar.s("gcm.n.event_time");
                    if (!TextUtils.isEmpty(s6)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    l = h4bVar.l("gcm.n.vibrate_timings");
                    if (l != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    l2 = h4bVar.l("gcm.n.light_settings");
                    if (l2 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean j2222222222 = h4bVar.j("gcm.n.default_sound");
                    boolean z2222222222 = j2222222222;
                    if (h4bVar.j("gcm.n.default_vibrate_timings")) {
                    }
                    int i42222222222 = z2222222222;
                    if (h4bVar.j("gcm.n.default_light_settings")) {
                    }
                    f0Var2.f(i42222222222);
                    s7 = h4bVar.s("gcm.n.tag");
                    if (TextUtils.isEmpty(s7)) {
                    }
                    return new le3(f0Var2, s7);
                }
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                s8 = "fcm_fallback_notification_channel";
                if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                    int identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", PListParser.TAG_STRING, firebaseMessagingService.getPackageName());
                    if (identifier == 0) {
                        Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                        string = "Misc";
                    } else {
                        string = firebaseMessagingService.getString(identifier);
                    }
                    notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                }
                packageName = firebaseMessagingService.getPackageName();
                Resources resources22 = firebaseMessagingService.getResources();
                packageManager = firebaseMessagingService.getPackageManager();
                f0 f0Var22 = new f0(firebaseMessagingService, s8);
                r = h4bVar.r(resources22, packageName, "gcm.n.title");
                if (!TextUtils.isEmpty(r)) {
                }
                r2 = h4bVar.r(resources22, packageName, "gcm.n.body");
                if (!TextUtils.isEmpty(r2)) {
                }
                s = h4bVar.s("gcm.n.icon");
                if (!TextUtils.isEmpty(s)) {
                }
                i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                if (i != 0) {
                }
                i = packageManager.getApplicationInfo(packageName, 0).icon;
                if (i != 0) {
                }
                i = 17301651;
                f0Var22.K.icon = i;
                s2 = h4bVar.s("gcm.n.sound2");
                if (TextUtils.isEmpty(s2)) {
                }
                if (TextUtils.isEmpty(s2)) {
                }
                if (defaultUri != null) {
                }
                s3 = h4bVar.s("gcm.n.click_action");
                if (TextUtils.isEmpty(s3)) {
                }
                AtomicInteger atomicInteger222 = a;
                if (launchIntentForPackage == null) {
                }
                f0Var22.g = activity;
                if (!h4bVar.j("google.c.a.e")) {
                }
                if (broadcast != null) {
                }
                s4 = h4bVar.s("gcm.n.color");
                if (!TextUtils.isEmpty(s4)) {
                }
                i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i2 != 0) {
                }
                valueOf = null;
                if (valueOf != null) {
                }
                f0Var22.g(16, !h4bVar.j("gcm.n.sticky"));
                f0Var22.v = h4bVar.j("gcm.n.local_only");
                s5 = h4bVar.s("gcm.n.ticker");
                if (s5 != null) {
                }
                k = h4bVar.k("gcm.n.notification_priority");
                if (k != null) {
                }
                k = null;
                if (k != null) {
                }
                k2 = h4bVar.k("gcm.n.visibility");
                if (k2 != null) {
                }
                k2 = null;
                if (k2 != null) {
                }
                k3 = h4bVar.k("gcm.n.notification_count");
                if (k3 != null) {
                }
                k3 = null;
                if (k3 != null) {
                }
                s6 = h4bVar.s("gcm.n.event_time");
                if (!TextUtils.isEmpty(s6)) {
                }
                valueOf2 = null;
                if (valueOf2 != null) {
                }
                l = h4bVar.l("gcm.n.vibrate_timings");
                if (l != null) {
                }
                jArr = null;
                if (jArr != null) {
                }
                l2 = h4bVar.l("gcm.n.light_settings");
                if (l2 != null) {
                }
                iArr = null;
                if (iArr != null) {
                }
                boolean j22222222222 = h4bVar.j("gcm.n.default_sound");
                boolean z22222222222 = j22222222222;
                if (h4bVar.j("gcm.n.default_vibrate_timings")) {
                }
                int i422222222222 = z22222222222;
                if (h4bVar.j("gcm.n.default_light_settings")) {
                }
                f0Var22.f(i422222222222);
                s7 = h4bVar.s("gcm.n.tag");
                if (TextUtils.isEmpty(s7)) {
                }
                return new le3(f0Var22, s7);
            }
        }
        s8 = null;
        packageName = firebaseMessagingService.getPackageName();
        Resources resources222 = firebaseMessagingService.getResources();
        packageManager = firebaseMessagingService.getPackageManager();
        f0 f0Var222 = new f0(firebaseMessagingService, s8);
        r = h4bVar.r(resources222, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(r)) {
        }
        r2 = h4bVar.r(resources222, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(r2)) {
        }
        s = h4bVar.s("gcm.n.icon");
        if (!TextUtils.isEmpty(s)) {
        }
        i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i != 0) {
        }
        i = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i != 0) {
        }
        i = 17301651;
        f0Var222.K.icon = i;
        s2 = h4bVar.s("gcm.n.sound2");
        if (TextUtils.isEmpty(s2)) {
        }
        if (TextUtils.isEmpty(s2)) {
        }
        if (defaultUri != null) {
        }
        s3 = h4bVar.s("gcm.n.click_action");
        if (TextUtils.isEmpty(s3)) {
        }
        AtomicInteger atomicInteger2222 = a;
        if (launchIntentForPackage == null) {
        }
        f0Var222.g = activity;
        if (!h4bVar.j("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        s4 = h4bVar.s("gcm.n.color");
        if (!TextUtils.isEmpty(s4)) {
        }
        i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i2 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        f0Var222.g(16, !h4bVar.j("gcm.n.sticky"));
        f0Var222.v = h4bVar.j("gcm.n.local_only");
        s5 = h4bVar.s("gcm.n.ticker");
        if (s5 != null) {
        }
        k = h4bVar.k("gcm.n.notification_priority");
        if (k != null) {
        }
        k = null;
        if (k != null) {
        }
        k2 = h4bVar.k("gcm.n.visibility");
        if (k2 != null) {
        }
        k2 = null;
        if (k2 != null) {
        }
        k3 = h4bVar.k("gcm.n.notification_count");
        if (k3 != null) {
        }
        k3 = null;
        if (k3 != null) {
        }
        s6 = h4bVar.s("gcm.n.event_time");
        if (!TextUtils.isEmpty(s6)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        l = h4bVar.l("gcm.n.vibrate_timings");
        if (l != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        l2 = h4bVar.l("gcm.n.light_settings");
        if (l2 != null) {
        }
        iArr = null;
        if (iArr != null) {
        }
        boolean j222222222222 = h4bVar.j("gcm.n.default_sound");
        boolean z222222222222 = j222222222222;
        if (h4bVar.j("gcm.n.default_vibrate_timings")) {
        }
        int i4222222222222 = z222222222222;
        if (h4bVar.j("gcm.n.default_light_settings")) {
        }
        f0Var222.f(i4222222222222);
        s7 = h4bVar.s("gcm.n.tag");
        if (TextUtils.isEmpty(s7)) {
        }
        return new le3(f0Var222, s7);
    }

    public static boolean b(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i + ", treating it as an invalid icon");
            return false;
        }
    }
}
