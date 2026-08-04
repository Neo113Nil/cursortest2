package com.gamericefishpro.space.r5;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.t0.q1;
import com.gamericefishpro.space.t0.s2;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements OnCompleteListener, com.gamericefishpro.space.x6.a {
    public final /* synthetic */ int d;
    public Object e;
    public Object i;
    public Object v;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = obj;
        this.i = obj2;
        this.v = obj3;
    }

    public static boolean c(Editable editable, KeyEvent keyEvent, boolean z) {
        com.gamericefishpro.space.s4.w[] wVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (wVarArr = (com.gamericefishpro.space.s4.w[]) editable.getSpans(selectionStart, selectionEnd, com.gamericefishpro.space.s4.w.class)) != null && wVarArr.length > 0) {
                for (com.gamericefishpro.space.s4.w wVar : wVarArr) {
                    int spanStart = editable.getSpanStart(wVar);
                    int spanEnd = editable.getSpanEnd(wVar);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = ((u) this.e).a;
        int childCount = i < 0 ? recyclerView.getChildCount() : g(i);
        ((com.gamericefishpro.space.n9.r0) this.i).g(childCount, z);
        if (z) {
            l(view);
        }
        RecyclerView.s(view);
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void d(int i) {
        int iG = g(i);
        ((com.gamericefishpro.space.n9.r0) this.i).i(iG);
        RecyclerView recyclerView = ((u) this.e).a;
        View childAt = recyclerView.getChildAt(iG);
        if (childAt != null) {
            RecyclerView.s(childAt);
        }
        recyclerView.detachViewFromParent(iG);
    }

    public View e(int i) {
        return ((u) this.e).a.getChildAt(g(i));
    }

    public int f() {
        return ((u) this.e).a.getChildCount() - ((ArrayList) this.v).size();
    }

    public int g(int i) {
        com.gamericefishpro.space.n9.r0 r0Var = (com.gamericefishpro.space.n9.r0) this.i;
        if (i < 0) {
            return -1;
        }
        int childCount = ((u) this.e).a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int iC = i - (i2 - r0Var.c(i2));
            if (iC == 0) {
                while (r0Var.f(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iC;
        }
        return -1;
    }

    public View h(int i) {
        return ((u) this.e).a.getChildAt(i);
    }

    public int i() {
        return ((u) this.e).a.getChildCount();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0247  */
    /* JADX WARN: Code duplicated, block: B:105:0x0272  */
    /* JADX WARN: Code duplicated, block: B:107:0x0278  */
    /* JADX WARN: Code duplicated, block: B:110:0x0287  */
    /* JADX WARN: Code duplicated, block: B:111:0x0295  */
    /* JADX WARN: Code duplicated, block: B:113:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:116:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:117:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:120:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:122:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:125:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:126:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:129:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:135:0x0310  */
    /* JADX WARN: Code duplicated, block: B:139:0x031e  */
    /* JADX WARN: Code duplicated, block: B:143:0x0337  */
    /* JADX WARN: Code duplicated, block: B:144:0x0339  */
    /* JADX WARN: Code duplicated, block: B:146:0x0367  */
    /* JADX WARN: Code duplicated, block: B:152:0x0396  */
    /* JADX WARN: Code duplicated, block: B:157:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:159:0x03af  */
    /* JADX WARN: Code duplicated, block: B:162:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:165:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:166:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:172:0x040b  */
    /* JADX WARN: Code duplicated, block: B:175:0x041b  */
    /* JADX WARN: Code duplicated, block: B:176:0x041d  */
    /* JADX WARN: Code duplicated, block: B:182:0x0445  */
    /* JADX WARN: Code duplicated, block: B:185:0x0453  */
    /* JADX WARN: Code duplicated, block: B:186:0x0455  */
    /* JADX WARN: Code duplicated, block: B:188:0x045b  */
    /* JADX WARN: Code duplicated, block: B:190:0x0474  */
    /* JADX WARN: Code duplicated, block: B:196:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:198:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:201:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:204:0x04d0 A[Catch: NumberFormatException | JSONException -> 0x04ea, TryCatch #10 {NumberFormatException | JSONException -> 0x04ea, blocks: (B:202:0x04c9, B:204:0x04d0, B:206:0x04d9, B:207:0x04e2, B:208:0x04e9), top: B:274:0x04c9 }] */
    /* JADX WARN: Code duplicated, block: B:206:0x04d9 A[Catch: NumberFormatException | JSONException -> 0x04ea, LOOP:1: B:205:0x04d7->B:206:0x04d9, LOOP_END, TryCatch #10 {NumberFormatException | JSONException -> 0x04ea, blocks: (B:202:0x04c9, B:204:0x04d0, B:206:0x04d9, B:207:0x04e2, B:208:0x04e9), top: B:274:0x04c9 }] */
    /* JADX WARN: Code duplicated, block: B:207:0x04e2 A[Catch: NumberFormatException | JSONException -> 0x04ea, TryCatch #10 {NumberFormatException | JSONException -> 0x04ea, blocks: (B:202:0x04c9, B:204:0x04d0, B:206:0x04d9, B:207:0x04e2, B:208:0x04e9), top: B:274:0x04c9 }] */
    /* JADX WARN: Code duplicated, block: B:211:0x0503  */
    /* JADX WARN: Code duplicated, block: B:214:0x0513  */
    /* JADX WARN: Code duplicated, block: B:215:0x0515  */
    /* JADX WARN: Code duplicated, block: B:218:0x051e A[Catch: IllegalArgumentException -> 0x053b, JSONException -> 0x056c, TryCatch #12 {IllegalArgumentException -> 0x053b, JSONException -> 0x056c, blocks: (B:216:0x0518, B:218:0x051e, B:220:0x052a, B:223:0x053d, B:224:0x0544, B:225:0x0545, B:226:0x054c), top: B:277:0x0518 }] */
    /* JADX WARN: Code duplicated, block: B:220:0x052a A[Catch: IllegalArgumentException -> 0x053b, JSONException -> 0x056c, TryCatch #12 {IllegalArgumentException -> 0x053b, JSONException -> 0x056c, blocks: (B:216:0x0518, B:218:0x051e, B:220:0x052a, B:223:0x053d, B:224:0x0544, B:225:0x0545, B:226:0x054c), top: B:277:0x0518 }] */
    /* JADX WARN: Code duplicated, block: B:223:0x053d A[Catch: IllegalArgumentException -> 0x053b, JSONException -> 0x056c, TryCatch #12 {IllegalArgumentException -> 0x053b, JSONException -> 0x056c, blocks: (B:216:0x0518, B:218:0x051e, B:220:0x052a, B:223:0x053d, B:224:0x0544, B:225:0x0545, B:226:0x054c), top: B:277:0x0518 }] */
    /* JADX WARN: Code duplicated, block: B:225:0x0545 A[Catch: IllegalArgumentException -> 0x053b, JSONException -> 0x056c, TryCatch #12 {IllegalArgumentException -> 0x053b, JSONException -> 0x056c, blocks: (B:216:0x0518, B:218:0x051e, B:220:0x052a, B:223:0x053d, B:224:0x0544, B:225:0x0545, B:226:0x054c), top: B:277:0x0518 }] */
    /* JADX WARN: Code duplicated, block: B:230:0x0581  */
    /* JADX WARN: Code duplicated, block: B:234:0x0599  */
    /* JADX WARN: Code duplicated, block: B:238:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:241:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:245:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:250:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:251:0x05fd A[Catch: ExecutionException -> 0x0611, TimeoutException -> 0x0613, InterruptedException -> 0x061c, TryCatch #11 {InterruptedException -> 0x061c, ExecutionException -> 0x0611, TimeoutException -> 0x0613, blocks: (B:248:0x05e1, B:252:0x0605, B:251:0x05fd), top: B:278:0x05e1 }] */
    /* JADX WARN: Code duplicated, block: B:264:0x039e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x0377 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x0486 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x04c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x05e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0128  */
    /* JADX WARN: Code duplicated, block: B:51:0x012f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0135  */
    /* JADX WARN: Code duplicated, block: B:55:0x0142  */
    /* JADX WARN: Code duplicated, block: B:57:0x0154  */
    /* JADX WARN: Code duplicated, block: B:58:0x015c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0238  */
    /* JADX WARN: Code duplicated, block: B:99:0x0245  */
    /* JADX WARN: Instruction removed from duplicated block: B:188:0x045b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:245:0x05cb, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v183 */
    /* JADX WARN: Type inference failed for: r0v184 */
    public boolean j() {
        com.gamericefishpro.space.tb.n nVar;
        Bundle bundle;
        int identifier;
        String strU;
        Uri defaultUri;
        String strU2;
        String strU3;
        Uri uri;
        Intent launchIntentForPackage;
        Bundle bundle2;
        PendingIntent activity;
        PendingIntent broadcast;
        String strU4;
        Integer numValueOf;
        String strU5;
        Integer numQ;
        Integer numQ2;
        Integer numQ3;
        String strU6;
        Long lValueOf;
        JSONArray jSONArrayR;
        int length;
        long[] jArr;
        int i;
        JSONArray jSONArrayR2;
        int[] iArr;
        int color;
        boolean zP;
        ?? r0;
        int i2;
        String strU7;
        Bitmap bitmap;
        IconCompat iconCompat;
        boolean z;
        int i3;
        int i4;
        int i5;
        int identifier2;
        String string;
        int i6 = 1;
        if (((com.gamericefishpro.space.m.d) this.v).p("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.i;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        String strU8 = ((com.gamericefishpro.space.m.d) this.v).u("gcm.n.image");
        if (TextUtils.isEmpty(strU8)) {
            nVar = null;
        } else {
            try {
                nVar = new com.gamericefishpro.space.tb.n(new URL(strU8));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + strU8);
                nVar = null;
            }
        }
        if (nVar != null) {
            ExecutorService executorService = (ExecutorService) this.e;
            com.gamericefishpro.space.r9.h hVar = new com.gamericefishpro.space.r9.h();
            nVar.e = executorService.submit(new com.gamericefishpro.space.bb.h(14, nVar, hVar));
            nVar.i = hVar.a;
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.i;
        com.gamericefishpro.space.m.d dVar = (com.gamericefishpro.space.m.d) this.v;
        AtomicInteger atomicInteger = com.gamericefishpro.space.tb.e.a;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
        }
        Bundle bundle3 = bundle;
        String strU9 = dVar.u("gcm.n.android_channel_id");
        try {
            if (firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 0).targetSdkVersion < 26) {
                strU9 = null;
            } else {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService2.getSystemService(NotificationManager.class);
                if (TextUtils.isEmpty(strU9)) {
                    strU9 = bundle3.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(strU9)) {
                        Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    } else if (notificationManager.getNotificationChannel(strU9) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    strU9 = "fcm_fallback_notification_channel";
                    if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                        identifier2 = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                        if (identifier2 == 0) {
                            Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = "Misc";
                        } else {
                            string = firebaseMessagingService2.getString(identifier2);
                        }
                        notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                    }
                } else if (notificationManager.getNotificationChannel(strU9) == null) {
                    Log.w("FirebaseMessaging", "Notification Channel requested (" + strU9 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                    strU9 = bundle3.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(strU9)) {
                        Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    } else if (notificationManager.getNotificationChannel(strU9) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    strU9 = "fcm_fallback_notification_channel";
                    if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                        identifier2 = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                        if (identifier2 == 0) {
                            Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = "Misc";
                        } else {
                            string = firebaseMessagingService2.getString(identifier2);
                        }
                        notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        AtomicInteger atomicInteger2 = com.gamericefishpro.space.tb.e.a;
        String packageName = firebaseMessagingService2.getPackageName();
        Resources resources = firebaseMessagingService2.getResources();
        PackageManager packageManager = firebaseMessagingService2.getPackageManager();
        com.gamericefishpro.space.r3.i iVar = new com.gamericefishpro.space.r3.i(firebaseMessagingService2, strU9);
        String strS = dVar.s(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strS)) {
            iVar.e = com.gamericefishpro.space.r3.i.b(strS);
        }
        String strS2 = dVar.s(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strS2)) {
            iVar.f = com.gamericefishpro.space.r3.i.b(strS2);
            com.gamericefishpro.space.r3.g gVar = new com.gamericefishpro.space.r3.g(0);
            gVar.f = com.gamericefishpro.space.r3.i.b(strS2);
            iVar.g(gVar);
        }
        String strU10 = dVar.u("gcm.n.icon");
        if (!TextUtils.isEmpty(strU10)) {
            identifier = resources.getIdentifier(strU10, "drawable", packageName);
            if ((identifier == 0 || !com.gamericefishpro.space.tb.e.a(resources, identifier)) && ((identifier = resources.getIdentifier(strU10, "mipmap", packageName)) == 0 || !com.gamericefishpro.space.tb.e.a(resources, identifier))) {
                Log.w("FirebaseMessaging", "Icon resource " + strU10 + " not found. Notification will use default icon.");
            } else {
                i6 = 1;
            }
            iVar.v.icon = identifier;
            strU = dVar.u("gcm.n.sound2");
            if (TextUtils.isEmpty(strU)) {
                strU = dVar.u("gcm.n.sound");
            }
            if (TextUtils.isEmpty(strU)) {
                defaultUri = null;
            } else if (!"default".equals(strU) || resources.getIdentifier(strU, "raw", packageName) == 0) {
                defaultUri = RingtoneManager.getDefaultUri(2);
            } else {
                defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strU);
            }
            if (defaultUri != null) {
                iVar.f(defaultUri);
            }
            strU2 = dVar.u("gcm.n.click_action");
            if (TextUtils.isEmpty(strU2)) {
                strU3 = dVar.u("gcm.n.link_android");
                if (TextUtils.isEmpty(strU3)) {
                    strU3 = dVar.u("gcm.n.link");
                }
                if (TextUtils.isEmpty(strU3)) {
                    uri = null;
                } else {
                    uri = Uri.parse(strU3);
                }
                if (uri != null) {
                    launchIntentForPackage = new Intent("android.intent.action.VIEW");
                    launchIntentForPackage.setPackage(packageName);
                    launchIntentForPackage.setData(uri);
                } else {
                    launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                    if (launchIntentForPackage == null) {
                        Log.w("FirebaseMessaging", "No activity found to launch app");
                    }
                }
            } else {
                launchIntentForPackage = new Intent(strU2);
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setFlags(268435456);
            }
            if (launchIntentForPackage == null) {
                activity = null;
            } else {
                launchIntentForPackage.addFlags(67108864);
                Bundle bundle4 = (Bundle) dVar.e;
                bundle2 = new Bundle(bundle4);
                for (String str : bundle4.keySet()) {
                    if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                        bundle2.remove(str);
                    }
                }
                launchIntentForPackage.putExtras(bundle2);
                if (dVar.p("google.c.a.e")) {
                    launchIntentForPackage.putExtra("gcm.n.analytics_data", dVar.z());
                }
                activity = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
            }
            iVar.g = activity;
            if (dVar.p("google.c.a.e")) {
                broadcast = PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService2.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(dVar.z())), 1140850688);
            } else {
                broadcast = null;
            }
            if (broadcast != null) {
                iVar.v.deleteIntent = broadcast;
            }
            strU4 = dVar.u("gcm.n.color");
            if (TextUtils.isEmpty(strU4)) {
                i5 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i5 != 0) {
                    numValueOf = Integer.valueOf(firebaseMessagingService2.getColor(i5));
                } else {
                    numValueOf = null;
                }
            } else {
                try {
                    numValueOf = Integer.valueOf(Color.parseColor(strU4));
                } catch (IllegalArgumentException unused3) {
                    Log.w("FirebaseMessaging", "Color is invalid: " + strU4 + ". Notification will use default color.");
                    i5 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i5 != 0) {
                        try {
                            numValueOf = Integer.valueOf(firebaseMessagingService2.getColor(i5));
                        } catch (Resources.NotFoundException unused4) {
                            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                            numValueOf = null;
                        }
                    } else {
                        numValueOf = null;
                    }
                }
            }
            if (numValueOf != null) {
                iVar.q = numValueOf.intValue();
            }
            iVar.d(16, !dVar.p("gcm.n.sticky"));
            iVar.o = dVar.p("gcm.n.local_only");
            strU5 = dVar.u("gcm.n.ticker");
            if (strU5 != null) {
                iVar.v.tickerText = com.gamericefishpro.space.r3.i.b(strU5);
            }
            numQ = dVar.q("gcm.n.notification_priority");
            if (numQ == null) {
                numQ = null;
            } else if (numQ.intValue() >= -2 || numQ.intValue() > 2) {
                Log.w("FirebaseMessaging", "notificationPriority is invalid " + numQ + ". Skipping setting notificationPriority.");
                numQ = null;
            }
            if (numQ != null) {
                iVar.j = numQ.intValue();
            }
            numQ2 = dVar.q("gcm.n.visibility");
            if (numQ2 == null) {
                numQ2 = null;
            } else if (numQ2.intValue() >= -1 || numQ2.intValue() > i6) {
                Log.w("NotificationParams", "visibility is invalid: " + numQ2 + ". Skipping setting visibility.");
                numQ2 = null;
            }
            if (numQ2 != null) {
                iVar.r = numQ2.intValue();
            }
            numQ3 = dVar.q("gcm.n.notification_count");
            if (numQ3 != null) {
                numQ3 = null;
            } else if (numQ3.intValue() < 0) {
                Log.w("FirebaseMessaging", "notificationCount is invalid: " + numQ3 + ". Skipping setting notificationCount.");
                numQ3 = null;
            }
            if (numQ3 != null) {
                iVar.i = numQ3.intValue();
            }
            strU6 = dVar.u("gcm.n.event_time");
            if (TextUtils.isEmpty(strU6)) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(Long.parseLong(strU6));
                } catch (NumberFormatException unused5) {
                    Log.w("NotificationParams", "Couldn't parse value of " + com.gamericefishpro.space.m.d.C("gcm.n.event_time") + "(" + strU6 + ") into a long");
                    lValueOf = null;
                }
            }
            if (lValueOf != null) {
                iVar.k = true;
                iVar.v.when = lValueOf.longValue();
            }
            jSONArrayR = dVar.r("gcm.n.vibrate_timings");
            if (jSONArrayR == null) {
                jArr = null;
            } else {
                try {
                    if (jSONArrayR.length() > 1) {
                        throw new JSONException("vibrateTimings have invalid length");
                    }
                    length = jSONArrayR.length();
                    jArr = new long[length];
                    for (i = 0; i < length; i++) {
                        jArr[i] = jSONArrayR.optLong(i);
                    }
                } catch (NumberFormatException | JSONException unused6) {
                    Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayR + ". Skipping setting vibrateTimings.");
                    jArr = null;
                }
            }
            if (jArr != null) {
                iVar.v.vibrate = jArr;
            }
            jSONArrayR2 = dVar.r("gcm.n.light_settings");
            if (jSONArrayR2 == null) {
                iArr = null;
            } else {
                iArr = new int[3];
                try {
                    if (jSONArrayR2.length() == 3) {
                        throw new JSONException("lightSettings don't have all three fields");
                    }
                    color = Color.parseColor(jSONArrayR2.optString(0));
                    if (color != -16777216) {
                        throw new IllegalArgumentException("Transparent color is invalid");
                    }
                    iArr[0] = color;
                    iArr[1] = jSONArrayR2.optInt(1);
                    iArr[2] = jSONArrayR2.optInt(2);
                } catch (IllegalArgumentException e2) {
                    Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayR2 + ". " + e2.getMessage() + ". Skipping setting LightSettings");
                    iArr = null;
                } catch (JSONException unused7) {
                    Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayR2 + ". Skipping setting LightSettings");
                    iArr = null;
                }
            }
            if (iArr != null) {
                int i7 = iArr[0];
                i3 = iArr[1];
                int i8 = iArr[2];
                Notification notification = iVar.v;
                notification.ledARGB = i7;
                notification.ledOnMS = i3;
                notification.ledOffMS = i8;
                if (i3 != 0 || i8 == 0) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
                notification.flags = i4 | ((-2) & notification.flags);
            }
            zP = dVar.p("gcm.n.default_sound");
            r0 = zP;
            if (dVar.p("gcm.n.default_vibrate_timings")) {
                r0 = (zP ? 1 : 0) | 2;
            }
            i2 = r0;
            if (dVar.p("gcm.n.default_light_settings")) {
                i2 = (r0 == true ? 1 : 0) | 4;
            }
            iVar.c(i2);
            strU7 = dVar.u("gcm.n.tag");
            if (TextUtils.isEmpty(strU7)) {
                strU7 = "FCM-Notification:" + SystemClock.uptimeMillis();
            }
            String str2 = strU7;
            if (nVar != null) {
                try {
                    com.gamericefishpro.space.r9.o oVar = nVar.i;
                    com.gamericefishpro.space.v8.c0.g(oVar);
                    bitmap = (Bitmap) com.gamericefishpro.space.d9.h.k(oVar, 5L, TimeUnit.SECONDS);
                    iVar.e(bitmap);
                    com.gamericefishpro.space.r3.f fVar = new com.gamericefishpro.space.r3.f();
                    if (bitmap == null) {
                        iconCompat = null;
                        z = true;
                    } else {
                        z = true;
                        iconCompat = new IconCompat(1);
                        iconCompat.b = bitmap;
                    }
                    fVar.e = iconCompat;
                    fVar.f = null;
                    fVar.g = z;
                    iVar.g(fVar);
                } catch (InterruptedException unused8) {
                    Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                    nVar.close();
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e3) {
                    Log.w("FirebaseMessaging", "Failed to download image: " + e3.getCause());
                } catch (TimeoutException unused9) {
                    Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                    nVar.close();
                }
            }
            Log.isLoggable("FirebaseMessaging", 3);
            ((NotificationManager) ((FirebaseMessagingService) this.i).getSystemService("notification")).notify(str2, 0, iVar.a());
            return true;
        }
        int i9 = bundle3.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i9 == 0 || !com.gamericefishpro.space.tb.e.a(resources, i9)) {
            try {
                i9 = packageManager.getApplicationInfo(packageName, 0).icon;
            } catch (PackageManager.NameNotFoundException e4) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e4);
            }
        }
        identifier = (i9 == 0 || !com.gamericefishpro.space.tb.e.a(resources, i9)) ? 17301651 : i9;
        iVar.v.icon = identifier;
        strU = dVar.u("gcm.n.sound2");
        if (TextUtils.isEmpty(strU)) {
            strU = dVar.u("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strU)) {
            defaultUri = null;
        } else if ("default".equals(strU)) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = RingtoneManager.getDefaultUri(2);
        }
        if (defaultUri != null) {
            iVar.f(defaultUri);
        }
        strU2 = dVar.u("gcm.n.click_action");
        if (TextUtils.isEmpty(strU2)) {
            launchIntentForPackage = new Intent(strU2);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        } else {
            strU3 = dVar.u("gcm.n.link_android");
            if (TextUtils.isEmpty(strU3)) {
                strU3 = dVar.u("gcm.n.link");
            }
            if (TextUtils.isEmpty(strU3)) {
                uri = Uri.parse(strU3);
            } else {
                uri = null;
            }
            if (uri != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uri);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
            }
        }
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle5 = (Bundle) dVar.e;
            bundle2 = new Bundle(bundle5);
            while (r13.hasNext()) {
                if (str.startsWith("google.c.")) {
                    bundle2.remove(str);
                } else {
                    bundle2.remove(str);
                }
            }
            launchIntentForPackage.putExtras(bundle2);
            if (dVar.p("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", dVar.z());
            }
            activity = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
        }
        iVar.g = activity;
        if (dVar.p("google.c.a.e")) {
            broadcast = null;
        } else {
            broadcast = PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService2.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(dVar.z())), 1140850688);
        }
        if (broadcast != null) {
            iVar.v.deleteIntent = broadcast;
        }
        strU4 = dVar.u("gcm.n.color");
        if (TextUtils.isEmpty(strU4)) {
            numValueOf = Integer.valueOf(Color.parseColor(strU4));
        } else {
            i5 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i5 != 0) {
                numValueOf = Integer.valueOf(firebaseMessagingService2.getColor(i5));
            } else {
                numValueOf = null;
            }
        }
        if (numValueOf != null) {
            iVar.q = numValueOf.intValue();
        }
        iVar.d(16, !dVar.p("gcm.n.sticky"));
        iVar.o = dVar.p("gcm.n.local_only");
        strU5 = dVar.u("gcm.n.ticker");
        if (strU5 != null) {
            iVar.v.tickerText = com.gamericefishpro.space.r3.i.b(strU5);
        }
        numQ = dVar.q("gcm.n.notification_priority");
        if (numQ == null) {
            if (numQ.intValue() >= -2) {
            }
            Log.w("FirebaseMessaging", "notificationPriority is invalid " + numQ + ". Skipping setting notificationPriority.");
            numQ = null;
        } else {
            numQ = null;
        }
        if (numQ != null) {
            iVar.j = numQ.intValue();
        }
        numQ2 = dVar.q("gcm.n.visibility");
        if (numQ2 == null) {
            if (numQ2.intValue() >= -1) {
            }
            Log.w("NotificationParams", "visibility is invalid: " + numQ2 + ". Skipping setting visibility.");
            numQ2 = null;
        } else {
            numQ2 = null;
        }
        if (numQ2 != null) {
            iVar.r = numQ2.intValue();
        }
        numQ3 = dVar.q("gcm.n.notification_count");
        if (numQ3 != null) {
            numQ3 = null;
        } else if (numQ3.intValue() < 0) {
            Log.w("FirebaseMessaging", "notificationCount is invalid: " + numQ3 + ". Skipping setting notificationCount.");
            numQ3 = null;
        }
        if (numQ3 != null) {
            iVar.i = numQ3.intValue();
        }
        strU6 = dVar.u("gcm.n.event_time");
        if (TextUtils.isEmpty(strU6)) {
            lValueOf = Long.valueOf(Long.parseLong(strU6));
        } else {
            lValueOf = null;
        }
        if (lValueOf != null) {
            iVar.k = true;
            iVar.v.when = lValueOf.longValue();
        }
        jSONArrayR = dVar.r("gcm.n.vibrate_timings");
        if (jSONArrayR == null) {
            jArr = null;
        } else {
            if (jSONArrayR.length() > 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            length = jSONArrayR.length();
            jArr = new long[length];
            while (i < length) {
                jArr[i] = jSONArrayR.optLong(i);
            }
        }
        if (jArr != null) {
            iVar.v.vibrate = jArr;
        }
        jSONArrayR2 = dVar.r("gcm.n.light_settings");
        if (jSONArrayR2 == null) {
            iArr = null;
        } else {
            iArr = new int[3];
            if (jSONArrayR2.length() == 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            color = Color.parseColor(jSONArrayR2.optString(0));
            if (color != -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayR2.optInt(1);
            iArr[2] = jSONArrayR2.optInt(2);
        }
        if (iArr != null) {
            int i10 = iArr[0];
            i3 = iArr[1];
            int i11 = iArr[2];
            Notification notification2 = iVar.v;
            notification2.ledARGB = i10;
            notification2.ledOnMS = i3;
            notification2.ledOffMS = i11;
            if (i3 != 0) {
                i4 = 0;
            } else {
                i4 = 0;
            }
            notification2.flags = i4 | ((-2) & notification2.flags);
        }
        zP = dVar.p("gcm.n.default_sound");
        r0 = zP;
        if (dVar.p("gcm.n.default_vibrate_timings")) {
            r0 = (zP ? 1 : 0) | 2;
        }
        i2 = r0;
        if (dVar.p("gcm.n.default_light_settings")) {
            i2 = (r0 == true ? 1 : 0) | 4;
        }
        iVar.c(i2);
        strU7 = dVar.u("gcm.n.tag");
        if (TextUtils.isEmpty(strU7)) {
            strU7 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        String str3 = strU7;
        if (nVar != null) {
            com.gamericefishpro.space.r9.o oVar2 = nVar.i;
            com.gamericefishpro.space.v8.c0.g(oVar2);
            bitmap = (Bitmap) com.gamericefishpro.space.d9.h.k(oVar2, 5L, TimeUnit.SECONDS);
            iVar.e(bitmap);
            com.gamericefishpro.space.r3.f fVar2 = new com.gamericefishpro.space.r3.f();
            if (bitmap == null) {
                iconCompat = null;
                z = true;
            } else {
                z = true;
                iconCompat = new IconCompat(1);
                iconCompat.b = bitmap;
            }
            fVar2.e = iconCompat;
            fVar2.f = null;
            fVar2.g = z;
            iVar.g(fVar2);
        }
        Log.isLoggable("FirebaseMessaging", 3);
        ((NotificationManager) ((FirebaseMessagingService) this.i).getSystemService("notification")).notify(str3, 0, iVar.a());
        return true;
    }

    public boolean k(CharSequence charSequence, int i, int i2, com.gamericefishpro.space.s4.v vVar) {
        if ((vVar.c & 3) == 0) {
            com.gamericefishpro.space.s4.g gVar = (com.gamericefishpro.space.s4.g) this.v;
            com.gamericefishpro.space.t4.a aVarB = vVar.b();
            int iA = aVarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) aVarB.v).getShort(iA + aVarB.d);
            }
            com.gamericefishpro.space.s4.c cVar = (com.gamericefishpro.space.s4.c) gVar;
            cVar.getClass();
            ThreadLocal threadLocal = com.gamericefishpro.space.s4.c.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = cVar.a;
            String string = sb.toString();
            int i3 = com.gamericefishpro.space.u3.c.a;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i4 = vVar.c & 4;
            vVar.c = zHasGlyph ? i4 | 2 : i4 | 1;
        }
        return (vVar.c & 3) == 2;
    }

    public void l(View view) {
        ((ArrayList) this.v).add(view);
        RecyclerView.s(view);
    }

    public boolean m() {
        if (((s2) this.e).getValue() != this.v) {
            return true;
        }
        b bVar = (b) this.i;
        return bVar != null && bVar.m();
    }

    public void n(com.gamericefishpro.space.z4.o oVar) {
        com.gamericefishpro.space.z4.r0 r0Var = (com.gamericefishpro.space.z4.r0) this.v;
        if (r0Var != null) {
            r0Var.run();
        }
        com.gamericefishpro.space.z4.r0 r0Var2 = new com.gamericefishpro.space.z4.r0((com.gamericefishpro.space.z4.w) this.e, oVar);
        this.v = r0Var2;
        ((Handler) this.i).postAtFrontOfQueue(r0Var2);
    }

    public Object o(CharSequence charSequence, int i, int i2, int i3, boolean z, com.gamericefishpro.space.s4.o oVar) {
        int i4;
        char c;
        com.gamericefishpro.space.s4.p pVar = new com.gamericefishpro.space.s4.p((com.gamericefishpro.space.s4.s) ((com.gamericefishpro.space.tb.s) this.i).i);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zA = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (true) {
                if (iCharCount < i2 && i5 < i3 && zA) {
                    SparseArray sparseArray = pVar.c.a;
                    com.gamericefishpro.space.s4.s sVar = sparseArray == null ? null : (com.gamericefishpro.space.s4.s) sparseArray.get(iCodePointAt);
                    if (pVar.a == 2) {
                        if (sVar != null) {
                            pVar.c = sVar;
                            pVar.f++;
                        } else {
                            if (iCodePointAt == 65038) {
                                pVar.a();
                            } else if (iCodePointAt != 65039) {
                                com.gamericefishpro.space.s4.s sVar2 = pVar.c;
                                if (sVar2.b != null) {
                                    if (pVar.f != 1) {
                                        pVar.d = sVar2;
                                        pVar.a();
                                    } else if (pVar.b()) {
                                        pVar.d = pVar.c;
                                        pVar.a();
                                    } else {
                                        pVar.a();
                                    }
                                    c = 3;
                                } else {
                                    pVar.a();
                                }
                            }
                            c = 1;
                        }
                        c = 2;
                    } else if (sVar == null) {
                        pVar.a();
                        c = 1;
                    } else {
                        pVar.a = 2;
                        pVar.c = sVar;
                        pVar.f = 1;
                        c = 2;
                    }
                    pVar.e = iCodePointAt;
                    if (c == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                        if (iCharCount >= i2) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c == 3) {
                        if (!z && k(charSequence, i4, iCharCount, pVar.d.b)) {
                            break;
                        }
                        zA = oVar.a(charSequence, i4, iCharCount, pVar.d.b);
                        i5++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (pVar.a == 2 && pVar.c.b != null && ((pVar.f > 1 || pVar.b()) && i5 < i3 && zA && (z || !k(charSequence, i4, iCharCount, pVar.c.b)))) {
            oVar.a(charSequence, i4, iCharCount, pVar.c.b);
        }
        return oVar.getResult();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        com.gamericefishpro.space.r8.b bVar = (com.gamericefishpro.space.r8.b) this.e;
        String str = (String) this.i;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.v;
        synchronized (bVar.a) {
            bVar.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public void p(View view) {
        if (((ArrayList) this.v).remove(view)) {
            RecyclerView.s(view);
        }
    }

    public String toString() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((com.gamericefishpro.space.n9.r0) this.i).toString() + ", hidden list:" + ((ArrayList) this.v).size();
            case 4:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.e);
                sb.append('{');
                com.gamericefishpro.space.u6.s sVar = (com.gamericefishpro.space.u6.s) ((com.gamericefishpro.space.u6.s) this.i).i;
                String str = "";
                while (sVar != null) {
                    Object obj = sVar.e;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    sVar = (com.gamericefishpro.space.u6.s) sVar.i;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public b(q1 q1Var) {
        this.d = 3;
        this.e = new com.gamericefishpro.space.b1.a(0);
        this.i = new com.gamericefishpro.space.b1.d(0);
        this.v = new com.gamericefishpro.space.e.e(9, this, q1Var);
    }

    public b(com.gamericefishpro.space.z4.x provider) {
        this.d = 12;
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.e = new com.gamericefishpro.space.z4.w(provider);
        this.i = new Handler(Looper.getMainLooper());
    }

    public b(ExecutorService executorService) {
        this.d = 9;
        this.i = new Handler(Looper.getMainLooper());
        this.v = new com.gamericefishpro.space.c8.p(3, this);
        this.e = new com.gamericefishpro.space.s5.y(executorService, 1);
    }

    public b(int i) {
        this.d = i;
        switch (i) {
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                this.v = new com.gamericefishpro.space.u4.b();
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                this.e = new WeakHashMap();
                this.i = new WeakHashMap();
                this.v = new WeakHashMap();
                break;
        }
    }

    public b(u uVar) {
        this.d = 0;
        this.e = uVar;
        this.i = new com.gamericefishpro.space.n9.r0();
        this.v = new ArrayList();
    }

    public b(FirebaseMessagingService firebaseMessagingService, com.gamericefishpro.space.m.d dVar, ExecutorService executorService) {
        this.d = 5;
        this.e = executorService;
        this.i = firebaseMessagingService;
        this.v = dVar;
    }

    public b(com.gamericefishpro.space.tb.s sVar, com.gamericefishpro.space.n9.z zVar, com.gamericefishpro.space.s4.c cVar, Set set) {
        this.d = 2;
        this.e = zVar;
        this.i = sVar;
        this.v = cVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            o(str, 0, str.length(), 1, true, new com.gamericefishpro.space.d6.a(str, 1));
        }
    }

    public b(String str) {
        this.d = 4;
        com.gamericefishpro.space.u6.s sVar = new com.gamericefishpro.space.u6.s(13, false);
        this.i = sVar;
        this.v = sVar;
        this.e = str;
    }

    public b(com.gamericefishpro.space.u2.q qVar, b bVar) {
        this.d = 10;
        this.e = qVar;
        this.i = bVar;
        this.v = qVar.d;
    }
}
