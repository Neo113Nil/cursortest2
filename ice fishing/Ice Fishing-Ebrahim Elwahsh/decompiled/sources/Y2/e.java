package Y2;

import B1.C0262d;
import B1.q;
import B1.z;
import B2.N;
import B2.RunnableC0272f;
import D.C0298s;
import D.t;
import F3.C;
import I0.j;
import J0.s;
import N1.m;
import Z1.i;
import a.AbstractC0415a;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.IconCompat;
import androidx.emoji2.text.o;
import androidx.emoji2.text.r;
import androidx.emoji2.text.u;
import androidx.emoji2.text.v;
import androidx.lifecycle.AbstractC0508p;
import androidx.lifecycle.AbstractServiceC0516y;
import androidx.lifecycle.C0515x;
import androidx.lifecycle.EnumC0506n;
import androidx.lifecycle.L;
import androidx.lifecycle.O;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.T;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import androidx.work.OverwritingInputMerger;
import b0.C0521a;
import b2.InterfaceC0525b;
import com.anythink.basead.exoplayer.k.A;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.C3112dq;
import com.google.android.gms.internal.ads.C3148eP;
import com.google.firebase.messaging.FirebaseMessagingService;
import e2.C4469b;
import f2.C4498a;
import f2.C4500c;
import f4.AbstractC4514d;
import f4.k;
import f4.l;
import f4.p;
import g1.C4523c;
import h.InterfaceC4543b;
import h.J;
import h0.AbstractC4556b;
import h0.C4555a;
import h0.C4558d;
import h3.h;
import h3.n;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import m.c1;
import org.json.JSONArray;
import org.json.JSONException;
import p7.InterfaceC4864a;
import q2.C4903n;
import s1.InterfaceC4991d;
import u8.w;
import u8.x;
import v1.InterfaceC5117a;
import x0.C5202c;

/* loaded from: classes2.dex */
public final class e implements H2.a, G1.c, h3.c, T.g, V0.a, InterfaceC0525b, InterfaceC4543b, w {

    /* renamed from: x, reason: collision with root package name */
    public static e f3960x;

    /* renamed from: y, reason: collision with root package name */
    public static e f3961y;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3962n;

    /* renamed from: u, reason: collision with root package name */
    public Object f3963u;

    /* renamed from: v, reason: collision with root package name */
    public Object f3964v;

    /* renamed from: w, reason: collision with root package name */
    public Object f3965w;

    public /* synthetic */ e(int i, boolean z8) {
        this.f3962n = i;
    }

    public static void D(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }

    public static final SharedPreferences O(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void P(Context context) {
        if (O(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String valueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(valueOf) : new String("Failed to store app set ID last used time for App "));
        throw new d("Failed to store the app set ID last used time.");
    }

    public static boolean r(Editable editable, KeyEvent keyEvent, boolean z8) {
        v[] vVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (vVarArr = (v[]) editable.getSpans(selectionStart, selectionEnd, v.class)) != null && vVarArr.length > 0) {
                for (v vVar : vVarArr) {
                    int spanStart = editable.getSpanStart(vVar);
                    int spanEnd = editable.getSpanEnd(vVar);
                    if ((z8 && spanStart == selectionStart) || ((!z8 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(83:5|(2:7|(2:9|(2:10|(2:12|(3:14|15|(1:17)(0))(1:18))(1:19)))(0))(0)|20|(80:274|275|(1:24)|25|26|27|(1:29)|271|31|32|(3:246|247|(75:249|(67:251|(1:253)|35|(1:37)|38|(1:40)|41|(2:43|(1:230)(57:47|48|(1:50)|51|(1:53)(2:220|(1:225)(1:224))|(1:55)|56|(1:58)(5:208|(1:210)|211|(1:213)(1:219)|(1:215)(2:216|(1:218)))|59|(1:61)(6:190|(4:193|(2:201|202)(1:199)|200|191)|203|204|(1:206)|207)|62|(1:64)(1:189)|(1:66)|67|(41:185|186|(1:73)|74|(1:76)|77|(35:176|(1:180)|(1:81)|82|(31:171|(1:175)|(1:86)|87|(27:168|(1:170)|(1:91)|92|(23:164|165|(1:96)|97|(3:154|155|(20:157|(1:159)|160|(1:101)|102|(4:139|140|141|(2:143|(14:145|(3:106|(1:111)(1:109)|110)|112|(1:114)|115|(1:117)|118|(1:138)|120|(4:127|128|(1:130)(1:133)|131)|122|(1:124)|125|126)(2:146|147))(2:148|149))|104|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126)(2:161|162))|99|(0)|102|(0)|104|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126)|84|(0)|87|(0)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126)|69|(41:181|182|(0)|74|(0)|77|(0)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126)|71|(0)|74|(0)|77|(0)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126))(1:245)|231|(2:240|241)|(1:239)(1:238)|48|(0)|51|(0)(0)|(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|(0)|67|(0)|69|(0)|71|(0)|74|(0)|77|(0)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126)|254|(70:256|(1:258)|35|(0)|38|(0)|41|(0)(0)|231|(1:233)|240|241|(1:236)|239|48|(0)|51|(0)(0)|(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|(0)|67|(0)|69|(0)|71|(0)|74|(0)|77|(0)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126)(1:267)|259|(3:261|(1:263)(1:265)|264)|266|35|(0)|38|(0)|41|(0)(0)|231|(0)|240|241|(0)|239|48|(0)|51|(0)(0)|(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|(0)|67|(0)|69|(0)|71|(0)|74|(0)|77|(0)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126))|34|35|(0)|38|(0)|41|(0)(0)|231|(0)|240|241|(0)|239|48|(0)|51|(0)(0)|(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|(0)|67|(0)|69|(0)|71|(0)|74|(0)|77|(0)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126)|22|(0)|25|26|27|(0)|271|31|32|(0)|34|35|(0)|38|(0)|41|(0)(0)|231|(0)|240|241|(0)|239|48|(0)|51|(0)(0)|(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|(0)|67|(0)|69|(0)|71|(0)|74|(0)|77|(0)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126) */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x020d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x020e, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x00c5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x00c6, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x05e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x048b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x037c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf A[Catch: NameNotFoundException -> 0x00c5, TRY_LEAVE, TryCatch #5 {NameNotFoundException -> 0x00c5, blocks: (B:27:0x00b9, B:29:0x00bf), top: B:26:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean A() {
        k kVar;
        FirebaseMessagingService firebaseMessagingService;
        j jVar;
        Bundle bundle;
        NotificationChannel notificationChannel;
        String string;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        String packageName;
        PackageManager packageManager;
        String s3;
        String s6;
        String t9;
        int i;
        int i4;
        int i9;
        String t10;
        Uri defaultUri;
        String t11;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        String t12;
        Integer valueOf;
        String t13;
        Integer q6;
        Integer q9;
        Integer q10;
        String t14;
        Long valueOf2;
        JSONArray r9;
        long[] jArr;
        JSONArray r10;
        int[] iArr;
        String t15;
        IconCompat iconCompat;
        boolean z8;
        int i10;
        ApplicationInfo applicationInfo;
        if (((j) this.f3964v).p("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.f3963u;
        if (!((KeyguardManager) firebaseMessagingService2.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService2.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        String t16 = ((j) this.f3964v).t("gcm.n.image");
        if (!TextUtils.isEmpty(t16)) {
            try {
                kVar = new k(new URL(t16));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + t16);
            }
            if (kVar != null) {
                ExecutorService executorService = (ExecutorService) this.f3965w;
                h hVar = new h();
                kVar.f37753u = executorService.submit(new D5.b(19, kVar, hVar));
                kVar.f37754v = hVar.f38206a;
            }
            firebaseMessagingService = (FirebaseMessagingService) this.f3963u;
            jVar = (j) this.f3964v;
            AtomicInteger atomicInteger = AbstractC4514d.f37734a;
            applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
            bundle = Bundle.EMPTY;
            Bundle bundle2 = bundle;
            String t17 = jVar.t("gcm.n.android_channel_id");
            if (Build.VERSION.SDK_INT >= 26) {
                if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                    NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                    if (!TextUtils.isEmpty(t17)) {
                        notificationChannel3 = notificationManager.getNotificationChannel(t17);
                        if (notificationChannel3 == null) {
                            Log.w("FirebaseMessaging", "Notification Channel requested (" + t17 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                        }
                        packageName = firebaseMessagingService.getPackageName();
                        Resources resources = firebaseMessagingService.getResources();
                        packageManager = firebaseMessagingService.getPackageManager();
                        D.v vVar = new D.v(firebaseMessagingService, t17);
                        s3 = jVar.s(resources, packageName, "gcm.n.title");
                        if (!TextUtils.isEmpty(s3)) {
                            vVar.f553e = D.v.b(s3);
                        }
                        s6 = jVar.s(resources, packageName, "gcm.n.body");
                        if (!TextUtils.isEmpty(s6)) {
                            vVar.f554f = D.v.b(s6);
                            t tVar = new t(0);
                            tVar.f548f = D.v.b(s6);
                            vVar.g(tVar);
                        }
                        t9 = jVar.t("gcm.n.icon");
                        if (TextUtils.isEmpty(t9)) {
                            i = 1;
                        } else {
                            i9 = resources.getIdentifier(t9, com.anythink.expressad.foundation.h.k.f19790c, packageName);
                            if ((i9 != 0 && AbstractC4514d.a(resources, i9)) || ((i9 = resources.getIdentifier(t9, "mipmap", packageName)) != 0 && AbstractC4514d.a(resources, i9))) {
                                i = 1;
                                vVar.f569v.icon = i9;
                                t10 = jVar.t("gcm.n.sound2");
                                if (TextUtils.isEmpty(t10)) {
                                    t10 = jVar.t("gcm.n.sound");
                                }
                                if (!TextUtils.isEmpty(t10)) {
                                    defaultUri = null;
                                } else if (com.anythink.core.express.b.a.f17688f.equals(t10) || resources.getIdentifier(t10, "raw", packageName) == 0) {
                                    defaultUri = RingtoneManager.getDefaultUri(2);
                                } else {
                                    defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + t10);
                                }
                                if (defaultUri != null) {
                                    vVar.f(defaultUri);
                                }
                                t11 = jVar.t("gcm.n.click_action");
                                if (TextUtils.isEmpty(t11)) {
                                    launchIntentForPackage = new Intent(t11);
                                    launchIntentForPackage.setPackage(packageName);
                                    launchIntentForPackage.setFlags(268435456);
                                } else {
                                    String t18 = jVar.t("gcm.n.link_android");
                                    if (TextUtils.isEmpty(t18)) {
                                        t18 = jVar.t("gcm.n.link");
                                    }
                                    Uri parse = !TextUtils.isEmpty(t18) ? Uri.parse(t18) : null;
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
                                }
                                AtomicInteger atomicInteger2 = AbstractC4514d.f37734a;
                                if (launchIntentForPackage != null) {
                                    activity = null;
                                } else {
                                    launchIntentForPackage.addFlags(67108864);
                                    Bundle bundle3 = (Bundle) jVar.f1233u;
                                    Bundle bundle4 = new Bundle(bundle3);
                                    for (String str : bundle3.keySet()) {
                                        if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                                            bundle4.remove(str);
                                        }
                                    }
                                    launchIntentForPackage.putExtras(bundle4);
                                    if (jVar.p("google.c.a.e")) {
                                        launchIntentForPackage.putExtra("gcm.n.analytics_data", jVar.v());
                                    }
                                    activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
                                }
                                vVar.f555g = activity;
                                broadcast = jVar.p("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(jVar.v())), 1140850688);
                                if (broadcast != null) {
                                    vVar.f569v.deleteIntent = broadcast;
                                }
                                t12 = jVar.t("gcm.n.color");
                                if (!TextUtils.isEmpty(t12)) {
                                    try {
                                        valueOf = Integer.valueOf(Color.parseColor(t12));
                                    } catch (IllegalArgumentException unused2) {
                                        Log.w("FirebaseMessaging", "Color is invalid: " + t12 + ". Notification will use default color.");
                                    }
                                    if (valueOf != null) {
                                        vVar.f564q = valueOf.intValue();
                                    }
                                    vVar.d(16, !jVar.p("gcm.n.sticky"));
                                    vVar.f562o = jVar.p("gcm.n.local_only");
                                    t13 = jVar.t("gcm.n.ticker");
                                    if (t13 != null) {
                                        vVar.f569v.tickerText = D.v.b(t13);
                                    }
                                    q6 = jVar.q("gcm.n.notification_priority");
                                    if (q6 != null) {
                                        if (q6.intValue() < -2 || q6.intValue() > 2) {
                                            Log.w("FirebaseMessaging", "notificationPriority is invalid " + q6 + ". Skipping setting notificationPriority.");
                                        }
                                        if (q6 != null) {
                                            vVar.f557j = q6.intValue();
                                        }
                                        q9 = jVar.q("gcm.n.visibility");
                                        if (q9 != null) {
                                            if (q9.intValue() < -1 || q9.intValue() > i) {
                                                Log.w("NotificationParams", "visibility is invalid: " + q9 + ". Skipping setting visibility.");
                                            }
                                            if (q9 != null) {
                                                vVar.f565r = q9.intValue();
                                            }
                                            q10 = jVar.q("gcm.n.notification_count");
                                            if (q10 != null) {
                                                if (q10.intValue() < 0) {
                                                    Log.w("FirebaseMessaging", "notificationCount is invalid: " + q10 + ". Skipping setting notificationCount.");
                                                }
                                                if (q10 != null) {
                                                    vVar.i = q10.intValue();
                                                }
                                                t14 = jVar.t("gcm.n.event_time");
                                                if (!TextUtils.isEmpty(t14)) {
                                                    try {
                                                        valueOf2 = Long.valueOf(Long.parseLong(t14));
                                                    } catch (NumberFormatException unused3) {
                                                        Log.w("NotificationParams", "Couldn't parse value of " + j.y("gcm.n.event_time") + "(" + t14 + ") into a long");
                                                    }
                                                    if (valueOf2 != null) {
                                                        vVar.f558k = true;
                                                        vVar.f569v.when = valueOf2.longValue();
                                                    }
                                                    r9 = jVar.r("gcm.n.vibrate_timings");
                                                    if (r9 != null) {
                                                        try {
                                                        } catch (NumberFormatException | JSONException unused4) {
                                                            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + r9 + ". Skipping setting vibrateTimings.");
                                                        }
                                                        if (r9.length() <= 1) {
                                                            throw new JSONException("vibrateTimings have invalid length");
                                                        }
                                                        int length = r9.length();
                                                        jArr = new long[length];
                                                        for (int i11 = 0; i11 < length; i11++) {
                                                            jArr[i11] = r9.optLong(i11);
                                                        }
                                                        if (jArr != null) {
                                                            vVar.f569v.vibrate = jArr;
                                                        }
                                                        r10 = jVar.r("gcm.n.light_settings");
                                                        if (r10 != null) {
                                                            iArr = new int[3];
                                                            try {
                                                            } catch (IllegalArgumentException e6) {
                                                                Log.w("NotificationParams", "LightSettings is invalid: " + r10 + ". " + e6.getMessage() + ". Skipping setting LightSettings");
                                                            } catch (JSONException unused5) {
                                                                Log.w("NotificationParams", "LightSettings is invalid: " + r10 + ". Skipping setting LightSettings");
                                                            }
                                                            if (r10.length() != 3) {
                                                                throw new JSONException("lightSettings don't have all three fields");
                                                            }
                                                            int parseColor = Color.parseColor(r10.optString(0));
                                                            if (parseColor == -16777216) {
                                                                throw new IllegalArgumentException("Transparent color is invalid");
                                                            }
                                                            iArr[0] = parseColor;
                                                            iArr[1] = r10.optInt(1);
                                                            iArr[2] = r10.optInt(2);
                                                            if (iArr != null) {
                                                                int i12 = iArr[0];
                                                                int i13 = iArr[1];
                                                                int i14 = iArr[2];
                                                                Notification notification = vVar.f569v;
                                                                notification.ledARGB = i12;
                                                                notification.ledOnMS = i13;
                                                                notification.ledOffMS = i14;
                                                                notification.flags = ((i13 == 0 || i14 == 0) ? 0 : 1) | ((-2) & notification.flags);
                                                            }
                                                            boolean p6 = jVar.p("gcm.n.default_sound");
                                                            boolean z9 = p6;
                                                            if (jVar.p("gcm.n.default_vibrate_timings")) {
                                                                z9 = (p6 ? 1 : 0) | 2;
                                                            }
                                                            int i15 = z9;
                                                            if (jVar.p("gcm.n.default_light_settings")) {
                                                                i15 = (z9 ? 1 : 0) | 4;
                                                            }
                                                            vVar.c(i15);
                                                            t15 = jVar.t("gcm.n.tag");
                                                            if (TextUtils.isEmpty(t15)) {
                                                                t15 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                                            }
                                                            String str2 = t15;
                                                            if (kVar != null) {
                                                                try {
                                                                    n nVar = kVar.f37754v;
                                                                    O2.w.h(nVar);
                                                                    TimeUnit timeUnit = TimeUnit.SECONDS;
                                                                    Bitmap bitmap = (Bitmap) AbstractC0415a.f(nVar, 5L);
                                                                    vVar.e(bitmap);
                                                                    C0298s c0298s = new C0298s();
                                                                    if (bitmap == null) {
                                                                        iconCompat = null;
                                                                        z8 = true;
                                                                    } else {
                                                                        z8 = true;
                                                                        iconCompat = new IconCompat(1);
                                                                        iconCompat.f4805b = bitmap;
                                                                    }
                                                                    c0298s.f544e = iconCompat;
                                                                    c0298s.f545f = null;
                                                                    c0298s.f546g = z8;
                                                                    vVar.g(c0298s);
                                                                } catch (InterruptedException unused6) {
                                                                    Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                                                                    kVar.close();
                                                                    Thread.currentThread().interrupt();
                                                                } catch (ExecutionException e9) {
                                                                    Log.w("FirebaseMessaging", "Failed to download image: " + e9.getCause());
                                                                } catch (TimeoutException unused7) {
                                                                    Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                                                                    kVar.close();
                                                                }
                                                            }
                                                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                                Log.d("FirebaseMessaging", "Showing notification");
                                                            }
                                                            ((NotificationManager) ((FirebaseMessagingService) this.f3963u).getSystemService("notification")).notify(str2, 0, vVar.a());
                                                            return true;
                                                        }
                                                        iArr = null;
                                                        if (iArr != null) {
                                                        }
                                                        boolean p62 = jVar.p("gcm.n.default_sound");
                                                        boolean z92 = p62;
                                                        if (jVar.p("gcm.n.default_vibrate_timings")) {
                                                        }
                                                        int i152 = z92;
                                                        if (jVar.p("gcm.n.default_light_settings")) {
                                                        }
                                                        vVar.c(i152);
                                                        t15 = jVar.t("gcm.n.tag");
                                                        if (TextUtils.isEmpty(t15)) {
                                                        }
                                                        String str22 = t15;
                                                        if (kVar != null) {
                                                        }
                                                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                        }
                                                        ((NotificationManager) ((FirebaseMessagingService) this.f3963u).getSystemService("notification")).notify(str22, 0, vVar.a());
                                                        return true;
                                                    }
                                                    jArr = null;
                                                    if (jArr != null) {
                                                    }
                                                    r10 = jVar.r("gcm.n.light_settings");
                                                    if (r10 != null) {
                                                    }
                                                    iArr = null;
                                                    if (iArr != null) {
                                                    }
                                                    boolean p622 = jVar.p("gcm.n.default_sound");
                                                    boolean z922 = p622;
                                                    if (jVar.p("gcm.n.default_vibrate_timings")) {
                                                    }
                                                    int i1522 = z922;
                                                    if (jVar.p("gcm.n.default_light_settings")) {
                                                    }
                                                    vVar.c(i1522);
                                                    t15 = jVar.t("gcm.n.tag");
                                                    if (TextUtils.isEmpty(t15)) {
                                                    }
                                                    String str222 = t15;
                                                    if (kVar != null) {
                                                    }
                                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                    }
                                                    ((NotificationManager) ((FirebaseMessagingService) this.f3963u).getSystemService("notification")).notify(str222, 0, vVar.a());
                                                    return true;
                                                }
                                                valueOf2 = null;
                                                if (valueOf2 != null) {
                                                }
                                                r9 = jVar.r("gcm.n.vibrate_timings");
                                                if (r9 != null) {
                                                }
                                                jArr = null;
                                                if (jArr != null) {
                                                }
                                                r10 = jVar.r("gcm.n.light_settings");
                                                if (r10 != null) {
                                                }
                                                iArr = null;
                                                if (iArr != null) {
                                                }
                                                boolean p6222 = jVar.p("gcm.n.default_sound");
                                                boolean z9222 = p6222;
                                                if (jVar.p("gcm.n.default_vibrate_timings")) {
                                                }
                                                int i15222 = z9222;
                                                if (jVar.p("gcm.n.default_light_settings")) {
                                                }
                                                vVar.c(i15222);
                                                t15 = jVar.t("gcm.n.tag");
                                                if (TextUtils.isEmpty(t15)) {
                                                }
                                                String str2222 = t15;
                                                if (kVar != null) {
                                                }
                                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                }
                                                ((NotificationManager) ((FirebaseMessagingService) this.f3963u).getSystemService("notification")).notify(str2222, 0, vVar.a());
                                                return true;
                                            }
                                            q10 = null;
                                            if (q10 != null) {
                                            }
                                            t14 = jVar.t("gcm.n.event_time");
                                            if (!TextUtils.isEmpty(t14)) {
                                            }
                                            valueOf2 = null;
                                            if (valueOf2 != null) {
                                            }
                                            r9 = jVar.r("gcm.n.vibrate_timings");
                                            if (r9 != null) {
                                            }
                                            jArr = null;
                                            if (jArr != null) {
                                            }
                                            r10 = jVar.r("gcm.n.light_settings");
                                            if (r10 != null) {
                                            }
                                            iArr = null;
                                            if (iArr != null) {
                                            }
                                            boolean p62222 = jVar.p("gcm.n.default_sound");
                                            boolean z92222 = p62222;
                                            if (jVar.p("gcm.n.default_vibrate_timings")) {
                                            }
                                            int i152222 = z92222;
                                            if (jVar.p("gcm.n.default_light_settings")) {
                                            }
                                            vVar.c(i152222);
                                            t15 = jVar.t("gcm.n.tag");
                                            if (TextUtils.isEmpty(t15)) {
                                            }
                                            String str22222 = t15;
                                            if (kVar != null) {
                                            }
                                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                            }
                                            ((NotificationManager) ((FirebaseMessagingService) this.f3963u).getSystemService("notification")).notify(str22222, 0, vVar.a());
                                            return true;
                                        }
                                        q9 = null;
                                        if (q9 != null) {
                                        }
                                        q10 = jVar.q("gcm.n.notification_count");
                                        if (q10 != null) {
                                        }
                                        q10 = null;
                                        if (q10 != null) {
                                        }
                                        t14 = jVar.t("gcm.n.event_time");
                                        if (!TextUtils.isEmpty(t14)) {
                                        }
                                        valueOf2 = null;
                                        if (valueOf2 != null) {
                                        }
                                        r9 = jVar.r("gcm.n.vibrate_timings");
                                        if (r9 != null) {
                                        }
                                        jArr = null;
                                        if (jArr != null) {
                                        }
                                        r10 = jVar.r("gcm.n.light_settings");
                                        if (r10 != null) {
                                        }
                                        iArr = null;
                                        if (iArr != null) {
                                        }
                                        boolean p622222 = jVar.p("gcm.n.default_sound");
                                        boolean z922222 = p622222;
                                        if (jVar.p("gcm.n.default_vibrate_timings")) {
                                        }
                                        int i1522222 = z922222;
                                        if (jVar.p("gcm.n.default_light_settings")) {
                                        }
                                        vVar.c(i1522222);
                                        t15 = jVar.t("gcm.n.tag");
                                        if (TextUtils.isEmpty(t15)) {
                                        }
                                        String str222222 = t15;
                                        if (kVar != null) {
                                        }
                                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                                        }
                                        ((NotificationManager) ((FirebaseMessagingService) this.f3963u).getSystemService("notification")).notify(str222222, 0, vVar.a());
                                        return true;
                                    }
                                    q6 = null;
                                    if (q6 != null) {
                                    }
                                    q9 = jVar.q("gcm.n.visibility");
                                    if (q9 != null) {
                                    }
                                    q9 = null;
                                    if (q9 != null) {
                                    }
                                    q10 = jVar.q("gcm.n.notification_count");
                                    if (q10 != null) {
                                    }
                                    q10 = null;
                                    if (q10 != null) {
                                    }
                                    t14 = jVar.t("gcm.n.event_time");
                                    if (!TextUtils.isEmpty(t14)) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                    }
                                    r9 = jVar.r("gcm.n.vibrate_timings");
                                    if (r9 != null) {
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    r10 = jVar.r("gcm.n.light_settings");
                                    if (r10 != null) {
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    boolean p6222222 = jVar.p("gcm.n.default_sound");
                                    boolean z9222222 = p6222222;
                                    if (jVar.p("gcm.n.default_vibrate_timings")) {
                                    }
                                    int i15222222 = z9222222;
                                    if (jVar.p("gcm.n.default_light_settings")) {
                                    }
                                    vVar.c(i15222222);
                                    t15 = jVar.t("gcm.n.tag");
                                    if (TextUtils.isEmpty(t15)) {
                                    }
                                    String str2222222 = t15;
                                    if (kVar != null) {
                                    }
                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    }
                                    ((NotificationManager) ((FirebaseMessagingService) this.f3963u).getSystemService("notification")).notify(str2222222, 0, vVar.a());
                                    return true;
                                }
                                i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                                if (i10 != 0) {
                                    try {
                                        valueOf = Integer.valueOf(E.b.a(firebaseMessagingService, i10));
                                    } catch (Resources.NotFoundException unused8) {
                                        Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                                    }
                                    if (valueOf != null) {
                                    }
                                    vVar.d(16, !jVar.p("gcm.n.sticky"));
                                    vVar.f562o = jVar.p("gcm.n.local_only");
                                    t13 = jVar.t("gcm.n.ticker");
                                    if (t13 != null) {
                                    }
                                    q6 = jVar.q("gcm.n.notification_priority");
                                    if (q6 != null) {
                                    }
                                    q6 = null;
                                    if (q6 != null) {
                                    }
                                    q9 = jVar.q("gcm.n.visibility");
                                    if (q9 != null) {
                                    }
                                    q9 = null;
                                    if (q9 != null) {
                                    }
                                    q10 = jVar.q("gcm.n.notification_count");
                                    if (q10 != null) {
                                    }
                                    q10 = null;
                                    if (q10 != null) {
                                    }
                                    t14 = jVar.t("gcm.n.event_time");
                                    if (!TextUtils.isEmpty(t14)) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                    }
                                    r9 = jVar.r("gcm.n.vibrate_timings");
                                    if (r9 != null) {
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    r10 = jVar.r("gcm.n.light_settings");
                                    if (r10 != null) {
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    boolean p62222222 = jVar.p("gcm.n.default_sound");
                                    boolean z92222222 = p62222222;
                                    if (jVar.p("gcm.n.default_vibrate_timings")) {
                                    }
                                    int i152222222 = z92222222;
                                    if (jVar.p("gcm.n.default_light_settings")) {
                                    }
                                    vVar.c(i152222222);
                                    t15 = jVar.t("gcm.n.tag");
                                    if (TextUtils.isEmpty(t15)) {
                                    }
                                    String str22222222 = t15;
                                    if (kVar != null) {
                                    }
                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    }
                                    ((NotificationManager) ((FirebaseMessagingService) this.f3963u).getSystemService("notification")).notify(str22222222, 0, vVar.a());
                                    return true;
                                }
                                valueOf = null;
                                if (valueOf != null) {
                                }
                                vVar.d(16, !jVar.p("gcm.n.sticky"));
                                vVar.f562o = jVar.p("gcm.n.local_only");
                                t13 = jVar.t("gcm.n.ticker");
                                if (t13 != null) {
                                }
                                q6 = jVar.q("gcm.n.notification_priority");
                                if (q6 != null) {
                                }
                                q6 = null;
                                if (q6 != null) {
                                }
                                q9 = jVar.q("gcm.n.visibility");
                                if (q9 != null) {
                                }
                                q9 = null;
                                if (q9 != null) {
                                }
                                q10 = jVar.q("gcm.n.notification_count");
                                if (q10 != null) {
                                }
                                q10 = null;
                                if (q10 != null) {
                                }
                                t14 = jVar.t("gcm.n.event_time");
                                if (!TextUtils.isEmpty(t14)) {
                                }
                                valueOf2 = null;
                                if (valueOf2 != null) {
                                }
                                r9 = jVar.r("gcm.n.vibrate_timings");
                                if (r9 != null) {
                                }
                                jArr = null;
                                if (jArr != null) {
                                }
                                r10 = jVar.r("gcm.n.light_settings");
                                if (r10 != null) {
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                                boolean p622222222 = jVar.p("gcm.n.default_sound");
                                boolean z922222222 = p622222222;
                                if (jVar.p("gcm.n.default_vibrate_timings")) {
                                }
                                int i1522222222 = z922222222;
                                if (jVar.p("gcm.n.default_light_settings")) {
                                }
                                vVar.c(i1522222222);
                                t15 = jVar.t("gcm.n.tag");
                                if (TextUtils.isEmpty(t15)) {
                                }
                                String str222222222 = t15;
                                if (kVar != null) {
                                }
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                }
                                ((NotificationManager) ((FirebaseMessagingService) this.f3963u).getSystemService("notification")).notify(str222222222, 0, vVar.a());
                                return true;
                            }
                            i = 1;
                            Log.w("FirebaseMessaging", "Icon resource " + t9 + " not found. Notification will use default icon.");
                        }
                        i4 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                        if (i4 != 0 || !AbstractC4514d.a(resources, i4)) {
                            i4 = packageManager.getApplicationInfo(packageName, 0).icon;
                        }
                        i9 = (i4 == 0 && AbstractC4514d.a(resources, i4)) ? i4 : 17301651;
                        vVar.f569v.icon = i9;
                        t10 = jVar.t("gcm.n.sound2");
                        if (TextUtils.isEmpty(t10)) {
                        }
                        if (!TextUtils.isEmpty(t10)) {
                        }
                        if (defaultUri != null) {
                        }
                        t11 = jVar.t("gcm.n.click_action");
                        if (TextUtils.isEmpty(t11)) {
                        }
                        AtomicInteger atomicInteger22 = AbstractC4514d.f37734a;
                        if (launchIntentForPackage != null) {
                        }
                        vVar.f555g = activity;
                        if (jVar.p("google.c.a.e")) {
                        }
                        if (broadcast != null) {
                        }
                        t12 = jVar.t("gcm.n.color");
                        if (!TextUtils.isEmpty(t12)) {
                        }
                        i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i10 != 0) {
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        vVar.d(16, !jVar.p("gcm.n.sticky"));
                        vVar.f562o = jVar.p("gcm.n.local_only");
                        t13 = jVar.t("gcm.n.ticker");
                        if (t13 != null) {
                        }
                        q6 = jVar.q("gcm.n.notification_priority");
                        if (q6 != null) {
                        }
                        q6 = null;
                        if (q6 != null) {
                        }
                        q9 = jVar.q("gcm.n.visibility");
                        if (q9 != null) {
                        }
                        q9 = null;
                        if (q9 != null) {
                        }
                        q10 = jVar.q("gcm.n.notification_count");
                        if (q10 != null) {
                        }
                        q10 = null;
                        if (q10 != null) {
                        }
                        t14 = jVar.t("gcm.n.event_time");
                        if (!TextUtils.isEmpty(t14)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        r9 = jVar.r("gcm.n.vibrate_timings");
                        if (r9 != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        r10 = jVar.r("gcm.n.light_settings");
                        if (r10 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean p6222222222 = jVar.p("gcm.n.default_sound");
                        boolean z9222222222 = p6222222222;
                        if (jVar.p("gcm.n.default_vibrate_timings")) {
                        }
                        int i15222222222 = z9222222222;
                        if (jVar.p("gcm.n.default_light_settings")) {
                        }
                        vVar.c(i15222222222);
                        t15 = jVar.t("gcm.n.tag");
                        if (TextUtils.isEmpty(t15)) {
                        }
                        String str2222222222 = t15;
                        if (kVar != null) {
                        }
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                        }
                        ((NotificationManager) ((FirebaseMessagingService) this.f3963u).getSystemService("notification")).notify(str2222222222, 0, vVar.a());
                        return true;
                    }
                    t17 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(t17)) {
                        notificationChannel2 = notificationManager.getNotificationChannel(t17);
                        if (notificationChannel2 == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        packageName = firebaseMessagingService.getPackageName();
                        Resources resources2 = firebaseMessagingService.getResources();
                        packageManager = firebaseMessagingService.getPackageManager();
                        D.v vVar2 = new D.v(firebaseMessagingService, t17);
                        s3 = jVar.s(resources2, packageName, "gcm.n.title");
                        if (!TextUtils.isEmpty(s3)) {
                        }
                        s6 = jVar.s(resources2, packageName, "gcm.n.body");
                        if (!TextUtils.isEmpty(s6)) {
                        }
                        t9 = jVar.t("gcm.n.icon");
                        if (TextUtils.isEmpty(t9)) {
                        }
                        i4 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                        if (i4 != 0) {
                        }
                        i4 = packageManager.getApplicationInfo(packageName, 0).icon;
                        if (i4 == 0) {
                        }
                        vVar2.f569v.icon = i9;
                        t10 = jVar.t("gcm.n.sound2");
                        if (TextUtils.isEmpty(t10)) {
                        }
                        if (!TextUtils.isEmpty(t10)) {
                        }
                        if (defaultUri != null) {
                        }
                        t11 = jVar.t("gcm.n.click_action");
                        if (TextUtils.isEmpty(t11)) {
                        }
                        AtomicInteger atomicInteger222 = AbstractC4514d.f37734a;
                        if (launchIntentForPackage != null) {
                        }
                        vVar2.f555g = activity;
                        if (jVar.p("google.c.a.e")) {
                        }
                        if (broadcast != null) {
                        }
                        t12 = jVar.t("gcm.n.color");
                        if (!TextUtils.isEmpty(t12)) {
                        }
                        i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i10 != 0) {
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        vVar2.d(16, !jVar.p("gcm.n.sticky"));
                        vVar2.f562o = jVar.p("gcm.n.local_only");
                        t13 = jVar.t("gcm.n.ticker");
                        if (t13 != null) {
                        }
                        q6 = jVar.q("gcm.n.notification_priority");
                        if (q6 != null) {
                        }
                        q6 = null;
                        if (q6 != null) {
                        }
                        q9 = jVar.q("gcm.n.visibility");
                        if (q9 != null) {
                        }
                        q9 = null;
                        if (q9 != null) {
                        }
                        q10 = jVar.q("gcm.n.notification_count");
                        if (q10 != null) {
                        }
                        q10 = null;
                        if (q10 != null) {
                        }
                        t14 = jVar.t("gcm.n.event_time");
                        if (!TextUtils.isEmpty(t14)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        r9 = jVar.r("gcm.n.vibrate_timings");
                        if (r9 != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        r10 = jVar.r("gcm.n.light_settings");
                        if (r10 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean p62222222222 = jVar.p("gcm.n.default_sound");
                        boolean z92222222222 = p62222222222;
                        if (jVar.p("gcm.n.default_vibrate_timings")) {
                        }
                        int i152222222222 = z92222222222;
                        if (jVar.p("gcm.n.default_light_settings")) {
                        }
                        vVar2.c(i152222222222);
                        t15 = jVar.t("gcm.n.tag");
                        if (TextUtils.isEmpty(t15)) {
                        }
                        String str22222222222 = t15;
                        if (kVar != null) {
                        }
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                        }
                        ((NotificationManager) ((FirebaseMessagingService) this.f3963u).getSystemService("notification")).notify(str22222222222, 0, vVar2.a());
                        return true;
                    }
                    Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    notificationChannel = notificationManager.getNotificationChannel("fcm_fallback_notification_channel");
                    if (notificationChannel == null) {
                        int identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", com.anythink.expressad.foundation.h.k.f19794g, firebaseMessagingService.getPackageName());
                        if (identifier == 0) {
                            Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = "Misc";
                        } else {
                            string = firebaseMessagingService.getString(identifier);
                        }
                        notificationManager.createNotificationChannel(A.h(string));
                    }
                    t17 = "fcm_fallback_notification_channel";
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources22 = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    D.v vVar22 = new D.v(firebaseMessagingService, t17);
                    s3 = jVar.s(resources22, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(s3)) {
                    }
                    s6 = jVar.s(resources22, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(s6)) {
                    }
                    t9 = jVar.t("gcm.n.icon");
                    if (TextUtils.isEmpty(t9)) {
                    }
                    i4 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i4 != 0) {
                    }
                    i4 = packageManager.getApplicationInfo(packageName, 0).icon;
                    if (i4 == 0) {
                    }
                    vVar22.f569v.icon = i9;
                    t10 = jVar.t("gcm.n.sound2");
                    if (TextUtils.isEmpty(t10)) {
                    }
                    if (!TextUtils.isEmpty(t10)) {
                    }
                    if (defaultUri != null) {
                    }
                    t11 = jVar.t("gcm.n.click_action");
                    if (TextUtils.isEmpty(t11)) {
                    }
                    AtomicInteger atomicInteger2222 = AbstractC4514d.f37734a;
                    if (launchIntentForPackage != null) {
                    }
                    vVar22.f555g = activity;
                    if (jVar.p("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    t12 = jVar.t("gcm.n.color");
                    if (!TextUtils.isEmpty(t12)) {
                    }
                    i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i10 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    vVar22.d(16, !jVar.p("gcm.n.sticky"));
                    vVar22.f562o = jVar.p("gcm.n.local_only");
                    t13 = jVar.t("gcm.n.ticker");
                    if (t13 != null) {
                    }
                    q6 = jVar.q("gcm.n.notification_priority");
                    if (q6 != null) {
                    }
                    q6 = null;
                    if (q6 != null) {
                    }
                    q9 = jVar.q("gcm.n.visibility");
                    if (q9 != null) {
                    }
                    q9 = null;
                    if (q9 != null) {
                    }
                    q10 = jVar.q("gcm.n.notification_count");
                    if (q10 != null) {
                    }
                    q10 = null;
                    if (q10 != null) {
                    }
                    t14 = jVar.t("gcm.n.event_time");
                    if (!TextUtils.isEmpty(t14)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    r9 = jVar.r("gcm.n.vibrate_timings");
                    if (r9 != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    r10 = jVar.r("gcm.n.light_settings");
                    if (r10 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean p622222222222 = jVar.p("gcm.n.default_sound");
                    boolean z922222222222 = p622222222222;
                    if (jVar.p("gcm.n.default_vibrate_timings")) {
                    }
                    int i1522222222222 = z922222222222;
                    if (jVar.p("gcm.n.default_light_settings")) {
                    }
                    vVar22.c(i1522222222222);
                    t15 = jVar.t("gcm.n.tag");
                    if (TextUtils.isEmpty(t15)) {
                    }
                    String str222222222222 = t15;
                    if (kVar != null) {
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                    }
                    ((NotificationManager) ((FirebaseMessagingService) this.f3963u).getSystemService("notification")).notify(str222222222222, 0, vVar22.a());
                    return true;
                }
            }
            t17 = null;
            packageName = firebaseMessagingService.getPackageName();
            Resources resources222 = firebaseMessagingService.getResources();
            packageManager = firebaseMessagingService.getPackageManager();
            D.v vVar222 = new D.v(firebaseMessagingService, t17);
            s3 = jVar.s(resources222, packageName, "gcm.n.title");
            if (!TextUtils.isEmpty(s3)) {
            }
            s6 = jVar.s(resources222, packageName, "gcm.n.body");
            if (!TextUtils.isEmpty(s6)) {
            }
            t9 = jVar.t("gcm.n.icon");
            if (TextUtils.isEmpty(t9)) {
            }
            i4 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i4 != 0) {
            }
            i4 = packageManager.getApplicationInfo(packageName, 0).icon;
            if (i4 == 0) {
            }
            vVar222.f569v.icon = i9;
            t10 = jVar.t("gcm.n.sound2");
            if (TextUtils.isEmpty(t10)) {
            }
            if (!TextUtils.isEmpty(t10)) {
            }
            if (defaultUri != null) {
            }
            t11 = jVar.t("gcm.n.click_action");
            if (TextUtils.isEmpty(t11)) {
            }
            AtomicInteger atomicInteger22222 = AbstractC4514d.f37734a;
            if (launchIntentForPackage != null) {
            }
            vVar222.f555g = activity;
            if (jVar.p("google.c.a.e")) {
            }
            if (broadcast != null) {
            }
            t12 = jVar.t("gcm.n.color");
            if (!TextUtils.isEmpty(t12)) {
            }
            i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i10 != 0) {
            }
            valueOf = null;
            if (valueOf != null) {
            }
            vVar222.d(16, !jVar.p("gcm.n.sticky"));
            vVar222.f562o = jVar.p("gcm.n.local_only");
            t13 = jVar.t("gcm.n.ticker");
            if (t13 != null) {
            }
            q6 = jVar.q("gcm.n.notification_priority");
            if (q6 != null) {
            }
            q6 = null;
            if (q6 != null) {
            }
            q9 = jVar.q("gcm.n.visibility");
            if (q9 != null) {
            }
            q9 = null;
            if (q9 != null) {
            }
            q10 = jVar.q("gcm.n.notification_count");
            if (q10 != null) {
            }
            q10 = null;
            if (q10 != null) {
            }
            t14 = jVar.t("gcm.n.event_time");
            if (!TextUtils.isEmpty(t14)) {
            }
            valueOf2 = null;
            if (valueOf2 != null) {
            }
            r9 = jVar.r("gcm.n.vibrate_timings");
            if (r9 != null) {
            }
            jArr = null;
            if (jArr != null) {
            }
            r10 = jVar.r("gcm.n.light_settings");
            if (r10 != null) {
            }
            iArr = null;
            if (iArr != null) {
            }
            boolean p6222222222222 = jVar.p("gcm.n.default_sound");
            boolean z9222222222222 = p6222222222222;
            if (jVar.p("gcm.n.default_vibrate_timings")) {
            }
            int i15222222222222 = z9222222222222;
            if (jVar.p("gcm.n.default_light_settings")) {
            }
            vVar222.c(i15222222222222);
            t15 = jVar.t("gcm.n.tag");
            if (TextUtils.isEmpty(t15)) {
            }
            String str2222222222222 = t15;
            if (kVar != null) {
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
            }
            ((NotificationManager) ((FirebaseMessagingService) this.f3963u).getSystemService("notification")).notify(str2222222222222, 0, vVar222.a());
            return true;
        }
        kVar = null;
        if (kVar != null) {
        }
        firebaseMessagingService = (FirebaseMessagingService) this.f3963u;
        jVar = (j) this.f3964v;
        AtomicInteger atomicInteger3 = AbstractC4514d.f37734a;
        applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
        if (applicationInfo != null) {
        }
        bundle = Bundle.EMPTY;
        Bundle bundle22 = bundle;
        String t172 = jVar.t("gcm.n.android_channel_id");
        if (Build.VERSION.SDK_INT >= 26) {
        }
        t172 = null;
        packageName = firebaseMessagingService.getPackageName();
        Resources resources2222 = firebaseMessagingService.getResources();
        packageManager = firebaseMessagingService.getPackageManager();
        D.v vVar2222 = new D.v(firebaseMessagingService, t172);
        s3 = jVar.s(resources2222, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(s3)) {
        }
        s6 = jVar.s(resources2222, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(s6)) {
        }
        t9 = jVar.t("gcm.n.icon");
        if (TextUtils.isEmpty(t9)) {
        }
        i4 = bundle22.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i4 != 0) {
        }
        i4 = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i4 == 0) {
        }
        vVar2222.f569v.icon = i9;
        t10 = jVar.t("gcm.n.sound2");
        if (TextUtils.isEmpty(t10)) {
        }
        if (!TextUtils.isEmpty(t10)) {
        }
        if (defaultUri != null) {
        }
        t11 = jVar.t("gcm.n.click_action");
        if (TextUtils.isEmpty(t11)) {
        }
        AtomicInteger atomicInteger222222 = AbstractC4514d.f37734a;
        if (launchIntentForPackage != null) {
        }
        vVar2222.f555g = activity;
        if (jVar.p("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        t12 = jVar.t("gcm.n.color");
        if (!TextUtils.isEmpty(t12)) {
        }
        i10 = bundle22.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i10 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        vVar2222.d(16, !jVar.p("gcm.n.sticky"));
        vVar2222.f562o = jVar.p("gcm.n.local_only");
        t13 = jVar.t("gcm.n.ticker");
        if (t13 != null) {
        }
        q6 = jVar.q("gcm.n.notification_priority");
        if (q6 != null) {
        }
        q6 = null;
        if (q6 != null) {
        }
        q9 = jVar.q("gcm.n.visibility");
        if (q9 != null) {
        }
        q9 = null;
        if (q9 != null) {
        }
        q10 = jVar.q("gcm.n.notification_count");
        if (q10 != null) {
        }
        q10 = null;
        if (q10 != null) {
        }
        t14 = jVar.t("gcm.n.event_time");
        if (!TextUtils.isEmpty(t14)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        r9 = jVar.r("gcm.n.vibrate_timings");
        if (r9 != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        r10 = jVar.r("gcm.n.light_settings");
        if (r10 != null) {
        }
        iArr = null;
        if (iArr != null) {
        }
        boolean p62222222222222 = jVar.p("gcm.n.default_sound");
        boolean z92222222222222 = p62222222222222;
        if (jVar.p("gcm.n.default_vibrate_timings")) {
        }
        int i152222222222222 = z92222222222222;
        if (jVar.p("gcm.n.default_light_settings")) {
        }
        vVar2222.c(i152222222222222);
        t15 = jVar.t("gcm.n.tag");
        if (TextUtils.isEmpty(t15)) {
        }
        String str22222222222222 = t15;
        if (kVar != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.f3963u).getSystemService("notification")).notify(str22222222222222, 0, vVar2222.a());
        return true;
    }

    public boolean B(CharSequence charSequence, int i, int i4, u uVar) {
        if ((uVar.f4918c & 3) == 0) {
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) this.f3965w;
            C0521a b9 = uVar.b();
            int a9 = b9.a(8);
            if (a9 != 0) {
                ((ByteBuffer) b9.f2231w).getShort(a9 + b9.f2228n);
            }
            dVar.getClass();
            ThreadLocal threadLocal = androidx.emoji2.text.d.f4877b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i4) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = dVar.f4878a;
            String sb2 = sb.toString();
            int i9 = G.h.f1155a;
            boolean a10 = G.f.a(textPaint, sb2);
            int i10 = uVar.f4918c & 4;
            uVar.f4918c = a10 ? i10 | 2 : i10 | 1;
        }
        return (uVar.f4918c & 3) == 2;
    }

    /* JADX WARN: Finally extract failed */
    public boolean C() {
        switch (this.f3962n) {
            case 1:
                ByteBuffer c4 = N1.b.c((ByteBuffer) this.f3963u);
                C3112dq c3112dq = (C3112dq) this.f3965w;
                if (c4 == null) {
                    return false;
                }
                ArrayList arrayList = (ArrayList) this.f3964v;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    try {
                        if (((InterfaceC4991d) arrayList.get(i)).e(c4, c3112dq)) {
                            return true;
                        }
                    } finally {
                    }
                }
                return false;
            case 2:
                z zVar = (z) ((com.bumptech.glide.load.data.g) this.f3963u).f23580u;
                zVar.reset();
                C3112dq c3112dq2 = (C3112dq) this.f3964v;
                zVar.mark(5242880);
                ArrayList arrayList2 = (ArrayList) this.f3965w;
                int size2 = arrayList2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    try {
                        boolean b9 = ((InterfaceC4991d) arrayList2.get(i4)).b(zVar, c3112dq2);
                        zVar.reset();
                        if (b9) {
                            return true;
                        }
                    } catch (Throwable th) {
                        zVar.reset();
                        throw th;
                    }
                }
                return false;
            default:
                com.bumptech.glide.load.data.g gVar = (com.bumptech.glide.load.data.g) this.f3965w;
                C3112dq c3112dq3 = (C3112dq) this.f3963u;
                ArrayList arrayList3 = (ArrayList) this.f3964v;
                int size3 = arrayList3.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    InterfaceC4991d interfaceC4991d = (InterfaceC4991d) arrayList3.get(i9);
                    z zVar2 = null;
                    try {
                        z zVar3 = new z(new FileInputStream(gVar.d().getFileDescriptor()), c3112dq3);
                        try {
                            boolean b10 = interfaceC4991d.b(zVar3, c3112dq3);
                            zVar3.b();
                            gVar.d();
                            if (b10) {
                                return true;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            zVar2 = zVar3;
                            if (zVar2 != null) {
                                zVar2.b();
                            }
                            gVar.d();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                return false;
        }
    }

    public void E(EnumC0506n enumC0506n) {
        Q q6 = (Q) this.f3965w;
        if (q6 != null) {
            q6.run();
        }
        Q q9 = new Q((C0515x) this.f3963u, enumC0506n);
        this.f3965w = q9;
        ((Handler) this.f3964v).postAtFrontOfQueue(q9);
    }

    public Object F(CharSequence charSequence, int i, int i4, int i9, boolean z8, o oVar) {
        int i10;
        char c4;
        C3148eP c3148eP = new C3148eP((r) ((p) this.f3964v).f37765w);
        int codePointAt = Character.codePointAt(charSequence, i);
        boolean z9 = true;
        int i11 = 0;
        int i12 = i;
        loop0: while (true) {
            i10 = i12;
            while (i12 < i4 && i11 < i9 && z9) {
                SparseArray sparseArray = ((r) c3148eP.f30349b).f4909a;
                r rVar = sparseArray == null ? null : (r) sparseArray.get(codePointAt);
                if (c3148eP.f30351d == 2) {
                    if (rVar != null) {
                        c3148eP.f30349b = rVar;
                        c3148eP.f30353f++;
                    } else {
                        if (codePointAt == 65038) {
                            c3148eP.a();
                        } else if (codePointAt != 65039) {
                            r rVar2 = (r) c3148eP.f30349b;
                            if (rVar2.f4910b != null) {
                                if (c3148eP.f30353f != 1) {
                                    c3148eP.f30350c = rVar2;
                                    c3148eP.a();
                                } else if (c3148eP.b()) {
                                    c3148eP.f30350c = (r) c3148eP.f30349b;
                                    c3148eP.a();
                                } else {
                                    c3148eP.a();
                                }
                                c4 = 3;
                            } else {
                                c3148eP.a();
                            }
                        }
                        c4 = 1;
                    }
                    c4 = 2;
                } else if (rVar == null) {
                    c3148eP.a();
                    c4 = 1;
                } else {
                    c3148eP.f30351d = 2;
                    c3148eP.f30349b = rVar;
                    c3148eP.f30353f = 1;
                    c4 = 2;
                }
                c3148eP.f30352e = codePointAt;
                if (c4 == 1) {
                    i12 = Character.charCount(Character.codePointAt(charSequence, i10)) + i10;
                    if (i12 < i4) {
                        codePointAt = Character.codePointAt(charSequence, i12);
                    }
                } else if (c4 == 2) {
                    int charCount = Character.charCount(codePointAt) + i12;
                    if (charCount < i4) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i12 = charCount;
                } else if (c4 == 3) {
                    if (z8 || !B(charSequence, i10, i12, ((r) c3148eP.f30350c).f4910b)) {
                        z9 = oVar.f(charSequence, i10, i12, ((r) c3148eP.f30350c).f4910b);
                        i11++;
                    }
                }
            }
        }
        if (c3148eP.f30351d == 2 && ((r) c3148eP.f30349b).f4910b != null && ((c3148eP.f30353f > 1 || c3148eP.b()) && i11 < i9 && z9 && (z8 || !B(charSequence, i10, i12, ((r) c3148eP.f30349b).f4910b)))) {
            oVar.f(charSequence, i10, i12, ((r) c3148eP.f30349b).f4910b);
        }
        return oVar.getResult();
    }

    public boolean G(Object obj) {
        if (obj instanceof O1.b) {
            ((O1.b) obj).b().f2346a = true;
        }
        ((O1.c) this.f3964v).f(obj);
        return ((N.d) this.f3965w).c(obj);
    }

    public void H(Collection workSpecs) {
        kotlin.jvm.internal.h.e(workSpecs, "workSpecs");
        synchronized (this.f3965w) {
            try {
                for (P0.b bVar : (P0.b[]) this.f3964v) {
                    if (bVar.f2683e != null) {
                        bVar.f2683e = null;
                        bVar.d(null, bVar.f2682d);
                    }
                }
                for (P0.b bVar2 : (P0.b[]) this.f3964v) {
                    bVar2.c(workSpecs);
                }
                for (P0.b bVar3 : (P0.b[]) this.f3964v) {
                    if (bVar3.f2683e != this) {
                        bVar3.f2683e = this;
                        bVar3.d(this, bVar3.f2682d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void I() {
        synchronized (this.f3965w) {
            for (P0.b bVar : (P0.b[]) this.f3964v) {
                ArrayList arrayList = bVar.f2680b;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    bVar.f2679a.b(bVar);
                }
            }
        }
    }

    public void J(W1.a aVar) {
        B1.w wVar = new B1.w(22);
        i iVar = (i) this.f3963u;
        W1.c cVar = (W1.c) this.f3964v;
        Z1.o oVar = (Z1.o) this.f3965w;
        W1.d dVar = W1.d.f3419n;
        e a9 = i.a();
        a9.K(iVar.f4225a);
        a9.f3965w = dVar;
        a9.f3964v = iVar.f4226b;
        i p6 = a9.p();
        C4903n c4903n = new C4903n(2);
        c4903n.f40106z = new HashMap();
        c4903n.f40104x = Long.valueOf(oVar.f4238a.a());
        c4903n.f40105y = Long.valueOf(oVar.f4239b.a());
        c4903n.f40101u = "FCM_CLIENT_EVENT_LOGGING";
        g4.e eVar = aVar.f3415a;
        e eVar2 = l.f37755a;
        eVar2.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            eVar2.s(eVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        c4903n.f40103w = new Z1.k(cVar, byteArrayOutputStream.toByteArray());
        c4903n.f40102v = null;
        Z1.h c4 = c4903n.c();
        C4469b c4469b = (C4469b) oVar.f4240c;
        c4469b.getClass();
        c4469b.f37321b.execute(new a7.b(c4469b, p6, wVar, c4));
    }

    public void K(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f3963u = str;
    }

    public void L(long j9) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        kotlin.jvm.internal.h.e(timeUnit, "timeUnit");
        ((S0.p) this.f3964v).f2926g = timeUnit.toMillis(j9);
        if (Long.MAX_VALUE - System.currentTimeMillis() <= ((S0.p) this.f3964v).f2926g) {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    @Override // H2.a
    public n a() {
        h hVar = new h();
        ((ExecutorService) this.f3965w).execute(new RunnableC0272f(23, this, hVar));
        return hVar.f38206a;
    }

    @Override // T.g
    public Uri b() {
        return (Uri) this.f3963u;
    }

    @Override // u8.w
    public x c() {
        return (u8.r) this.f3964v;
    }

    @Override // h.InterfaceC4543b
    public boolean d() {
        return true;
    }

    @Override // T.g
    public Uri f() {
        return (Uri) this.f3965w;
    }

    @Override // G1.c
    public u1.x g(u1.x xVar, s1.h hVar) {
        Drawable drawable = (Drawable) xVar.get();
        if (drawable instanceof BitmapDrawable) {
            return ((G1.a) this.f3964v).g(C0262d.b(((BitmapDrawable) drawable).getBitmap(), (InterfaceC5117a) this.f3963u), hVar);
        }
        if (drawable instanceof F1.b) {
            return ((G1.e) this.f3965w).g(xVar, hVar);
        }
        return null;
    }

    @Override // p7.InterfaceC4864a
    public Object get() {
        switch (this.f3962n) {
            case 19:
                return new Z1.o(new L2.i(19), new C3.e(), (e2.c) ((N) this.f3963u).get(), (f2.i) ((c1) this.f3964v).get(), (f2.j) ((S0.n) this.f3965w).get());
            default:
                return new C4500c((Context) ((C4523c) this.f3963u).f37856u, (g2.d) ((InterfaceC4864a) this.f3964v).get(), (C4498a) ((L2.i) this.f3965w).get());
        }
    }

    @Override // T.g
    public ClipDescription getDescription() {
        return (ClipDescription) this.f3964v;
    }

    @Override // T.g
    public Object h() {
        return null;
    }

    @Override // u8.w
    public u8.v j() {
        return (u8.p) this.f3965w;
    }

    @Override // h.InterfaceC4543b
    public Context k() {
        return ((Toolbar) this.f3963u).getContext();
    }

    public Object l() {
        Object a9 = ((N.d) this.f3965w).a();
        if (a9 == null) {
            a9 = ((O1.a) this.f3963u).f();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + a9.getClass());
            }
        }
        if (a9 instanceof O1.b) {
            ((O1.b) a9).b().f2346a = false;
        }
        return a9;
    }

    public boolean m(String workSpecId) {
        P0.b bVar;
        boolean z8;
        kotlin.jvm.internal.h.e(workSpecId, "workSpecId");
        synchronized (this.f3965w) {
            try {
                P0.b[] bVarArr = (P0.b[]) this.f3964v;
                int length = bVarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        bVar = null;
                        break;
                    }
                    bVar = bVarArr[i];
                    bVar.getClass();
                    Object obj = bVar.f2682d;
                    if (obj != null && bVar.b(obj) && bVar.f2681c.contains(workSpecId)) {
                        break;
                    }
                    i++;
                }
                if (bVar != null) {
                    s.d().a(O0.c.f2344a, "Work " + workSpecId + " constrained by " + bVar.getClass().getSimpleName());
                }
                z8 = bVar == null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z8;
    }

    public J0.t n() {
        J0.t tVar = new J0.t((UUID) this.f3963u, (S0.p) this.f3964v, (LinkedHashSet) this.f3965w);
        J0.d dVar = ((S0.p) this.f3964v).f2928j;
        boolean z8 = !dVar.f1306h.isEmpty() || dVar.f1302d || dVar.f1300b || dVar.f1301c;
        S0.p pVar = (S0.p) this.f3964v;
        if (pVar.f2935q) {
            if (z8) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (pVar.f2926g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        UUID randomUUID = UUID.randomUUID();
        kotlin.jvm.internal.h.d(randomUUID, "randomUUID()");
        this.f3963u = randomUUID;
        String uuid = randomUUID.toString();
        kotlin.jvm.internal.h.d(uuid, "id.toString()");
        S0.p other = (S0.p) this.f3964v;
        kotlin.jvm.internal.h.e(other, "other");
        int i = other.f2921b;
        String str = other.f2923d;
        J0.h hVar = new J0.h(other.f2924e);
        J0.h hVar2 = new J0.h(other.f2925f);
        long j9 = other.f2926g;
        J0.d other2 = other.f2928j;
        kotlin.jvm.internal.h.e(other2, "other");
        this.f3964v = new S0.p(uuid, i, other.f2922c, str, hVar, hVar2, j9, other.f2927h, other.i, new J0.d(other2.f1299a, other2.f1300b, other2.f1301c, other2.f1302d, other2.f1303e, other2.f1304f, other2.f1305g, other2.f1306h), other.f2929k, other.f2930l, other.f2931m, other.f2932n, other.f2933o, other.f2934p, other.f2935q, other.f2936r, other.f2937s, 524288, 0);
        return tVar;
    }

    @Override // h3.c
    public void o(n nVar) {
        K2.b bVar = (K2.b) this.f3963u;
        String str = (String) this.f3964v;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f3965w;
        synchronized (bVar.f1568a) {
            bVar.f1568a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public i p() {
        String str = ((String) this.f3963u) == null ? " backendName" : "";
        if (((W1.d) this.f3965w) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new i((String) this.f3963u, (byte[]) this.f3964v, (W1.d) this.f3965w);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r0 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bitmap q(BitmapFactory.Options options) {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3;
        switch (this.f3962n) {
            case 1:
                return q.c(new N1.a(N1.b.c((ByteBuffer) this.f3963u)), options, this);
            case 2:
                z zVar = (z) ((com.bumptech.glide.load.data.g) this.f3963u).f23580u;
                zVar.reset();
                return q.c(zVar, options, this);
            default:
                FileDescriptor fileDescriptor = ((com.bumptech.glide.load.data.g) this.f3965w).d().getFileDescriptor();
                Bitmap bitmap = null;
                if (Build.VERSION.SDK_INT != 34 || !q.a(options) || !q.d(this)) {
                    return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                }
                Bitmap.Config config4 = options.inPreferredConfig;
                config = Bitmap.Config.HARDWARE;
                N1.g.a("", config4 == config);
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                try {
                    Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                    if (decodeFileDescriptor != null) {
                        try {
                            bitmap = q.e(decodeFileDescriptor);
                        } catch (Throwable th) {
                            th = th;
                            bitmap = decodeFileDescriptor;
                            if (bitmap != null) {
                                bitmap.recycle();
                            }
                            config2 = Bitmap.Config.HARDWARE;
                            options.inPreferredConfig = config2;
                            throw th;
                        }
                    }
                    decodeFileDescriptor.recycle();
                    config3 = Bitmap.Config.HARDWARE;
                    options.inPreferredConfig = config3;
                    return bitmap;
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
        }
    }

    public void s(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f3964v;
        HashMap hashMap2 = (HashMap) this.f3963u;
        U3.f fVar = new U3.f(byteArrayOutputStream, hashMap2, hashMap, (T3.a) this.f3965w);
        R3.d dVar = (R3.d) hashMap2.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
        } else {
            throw new R3.b("No encoder for " + obj.getClass());
        }
    }

    public S t(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return x(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // h.InterfaceC4543b
    public Drawable u() {
        return (Drawable) this.f3964v;
    }

    @Override // h.InterfaceC4543b
    public void v(int i) {
        Toolbar toolbar = (Toolbar) this.f3963u;
        if (i == 0) {
            toolbar.setNavigationContentDescription((CharSequence) this.f3965w);
        } else {
            toolbar.setNavigationContentDescription(i);
        }
    }

    @Override // h.InterfaceC4543b
    public void w(j.a aVar, int i) {
        ((Toolbar) this.f3963u).setNavigationIcon(aVar);
        v(i);
    }

    public S x(Class cls, String key) {
        S viewModel;
        kotlin.jvm.internal.h.e(key, "key");
        X x3 = (X) this.f3963u;
        x3.getClass();
        LinkedHashMap linkedHashMap = x3.f5265a;
        S s3 = (S) linkedHashMap.get(key);
        boolean isInstance = cls.isInstance(s3);
        V v6 = (V) this.f3964v;
        if (!isInstance) {
            C4558d c4558d = new C4558d((AbstractC4556b) this.f3965w);
            c4558d.f38143a.put(T.f5261b, key);
            try {
                viewModel = v6.b(cls, c4558d);
            } catch (AbstractMethodError unused) {
                viewModel = v6.a(cls);
            }
            kotlin.jvm.internal.h.e(viewModel, "viewModel");
            S s6 = (S) linkedHashMap.put(key, viewModel);
            if (s6 != null) {
                s6.onCleared();
            }
            return viewModel;
        }
        O o9 = v6 instanceof O ? (O) v6 : null;
        if (o9 != null) {
            kotlin.jvm.internal.h.b(s3);
            AbstractC0508p abstractC0508p = o9.f5247d;
            if (abstractC0508p != null) {
                C5202c c5202c = o9.f5248e;
                kotlin.jvm.internal.h.b(c5202c);
                L.a(s3, c5202c, abstractC0508p);
            }
        }
        kotlin.jvm.internal.h.c(s3, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return s3;
    }

    public ImageHeaderParser$ImageType y() {
        switch (this.f3962n) {
            case 1:
                return S0.f.l((ArrayList) this.f3964v, N1.b.c((ByteBuffer) this.f3963u));
            case 2:
                z zVar = (z) ((com.bumptech.glide.load.data.g) this.f3963u).f23580u;
                zVar.reset();
                return S0.f.k((ArrayList) this.f3965w, zVar, (C3112dq) this.f3964v);
            default:
                com.bumptech.glide.load.data.g gVar = (com.bumptech.glide.load.data.g) this.f3965w;
                C3112dq c3112dq = (C3112dq) this.f3963u;
                ArrayList arrayList = (ArrayList) this.f3964v;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC4991d interfaceC4991d = (InterfaceC4991d) arrayList.get(i);
                    z zVar2 = null;
                    try {
                        z zVar3 = new z(new FileInputStream(gVar.d().getFileDescriptor()), c3112dq);
                        try {
                            ImageHeaderParser$ImageType d2 = interfaceC4991d.d(zVar3);
                            zVar3.b();
                            gVar.d();
                            if (d2 != ImageHeaderParser$ImageType.UNKNOWN) {
                                return d2;
                            }
                        } catch (Throwable th) {
                            th = th;
                            zVar2 = zVar3;
                            if (zVar2 != null) {
                                zVar2.b();
                            }
                            gVar.d();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public File z(Context context) {
        ((W3.e) this.f3964v).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("pl_droidsonroids_gif"));
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i) {
        this.f3962n = i;
        this.f3963u = obj;
        this.f3964v = obj2;
        this.f3965w = obj3;
    }

    public e(Context context) {
        this.f3962n = 0;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f3964v = newSingleThreadScheduledExecutor;
        this.f3965w = Executors.newSingleThreadExecutor();
        this.f3963u = context;
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(new C(11, this), 0L, 86400L, TimeUnit.SECONDS);
    }

    public e(List list) {
        this.f3962n = 20;
        this.f3965w = list;
        this.f3963u = new ArrayList(list.size());
        this.f3964v = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ((ArrayList) this.f3963u).add(new a1.n((List) ((e1.f) list.get(i)).f37263b.f37200u));
            ((ArrayList) this.f3964v).add(((e1.f) list.get(i)).f37264c.a());
        }
    }

    public e(AbstractServiceC0516y abstractServiceC0516y) {
        this.f3962n = 22;
        this.f3963u = new C0515x(abstractServiceC0516y);
        this.f3964v = new Handler();
    }

    public e(S0.i iVar) {
        this.f3962n = 29;
        this.f3963u = iVar;
        this.f3964v = u8.b.b((v8.d) iVar.f2903w);
        v8.c cVar = (v8.c) iVar.f2904x;
        kotlin.jvm.internal.h.e(cVar, "<this>");
        this.f3965w = new u8.p(cVar);
    }

    public e(i iVar, W1.c cVar, com.anythink.core.common.n.b.A a9, Z1.o oVar) {
        this.f3962n = 18;
        this.f3963u = iVar;
        this.f3964v = cVar;
        this.f3965w = oVar;
    }

    public e(ExecutorService executorService) {
        this.f3962n = 15;
        this.f3964v = new Handler(Looper.getMainLooper());
        this.f3965w = new N2.A(1, this);
        this.f3963u = new T0.l(executorService);
    }

    public e(X store, V factory, AbstractC4556b defaultCreationExtras) {
        this.f3962n = 23;
        kotlin.jvm.internal.h.e(store, "store");
        kotlin.jvm.internal.h.e(factory, "factory");
        kotlin.jvm.internal.h.e(defaultCreationExtras, "defaultCreationExtras");
        this.f3963u = store;
        this.f3964v = factory;
        this.f3965w = defaultCreationExtras;
    }

    private final void M() {
    }

    private final void N() {
    }

    @Override // T.g
    public void e() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(X store, V v6) {
        this(store, v6, C4555a.f38142b);
        this.f3962n = 23;
        kotlin.jvm.internal.h.e(store, "store");
    }

    public e(Class cls) {
        this.f3962n = 5;
        UUID randomUUID = UUID.randomUUID();
        kotlin.jvm.internal.h.d(randomUUID, "randomUUID()");
        this.f3963u = randomUUID;
        String uuid = ((UUID) this.f3963u).toString();
        kotlin.jvm.internal.h.d(uuid, "id.toString()");
        this.f3964v = new S0.p(uuid, 0, cls.getName(), null, null, null, 0L, 0L, 0L, null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 1048570, 0);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(r7.t.z(1));
        linkedHashSet.add(strArr[0]);
        this.f3965w = linkedHashSet;
        ((S0.p) this.f3964v).f2923d = OverwritingInputMerger.class.getName();
    }

    public e(Context context, LocationManager locationManager) {
        this.f3962n = 28;
        this.f3965w = new J();
        this.f3963u = context;
        this.f3964v = locationManager;
    }

    public e(p trackers, O0.b bVar) {
        this.f3962n = 9;
        kotlin.jvm.internal.h.e(trackers, "trackers");
        Q0.f tracker = (Q0.f) trackers.f37763u;
        kotlin.jvm.internal.h.e(tracker, "tracker");
        P0.a aVar = new P0.a(tracker, 0);
        Q0.a tracker2 = (Q0.a) trackers.f37764v;
        kotlin.jvm.internal.h.e(tracker2, "tracker");
        P0.a aVar2 = new P0.a(tracker2, 1);
        Q0.f tracker3 = (Q0.f) trackers.f37766x;
        kotlin.jvm.internal.h.e(tracker3, "tracker");
        P0.a aVar3 = new P0.a(tracker3, 4);
        Q0.f tracker4 = (Q0.f) trackers.f37765w;
        kotlin.jvm.internal.h.e(tracker4, "tracker");
        P0.a aVar4 = new P0.a(tracker4, 2);
        kotlin.jvm.internal.h.e(tracker4, "tracker");
        P0.a aVar5 = new P0.a(tracker4, 3);
        kotlin.jvm.internal.h.e(tracker4, "tracker");
        P0.d dVar = new P0.d(tracker4);
        kotlin.jvm.internal.h.e(tracker4, "tracker");
        P0.b[] bVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, dVar, new P0.c(tracker4)};
        this.f3963u = bVar;
        this.f3964v = bVarArr;
        this.f3965w = new Object();
    }

    public e(p pVar, W3.e eVar, androidx.emoji2.text.d dVar, Set set) {
        this.f3962n = 21;
        this.f3963u = eVar;
        this.f3964v = pVar;
        this.f3965w = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            F(str, 0, str.length(), 1, true, new C2.b(str));
        }
    }

    public e(N.d dVar, O1.a aVar, O1.c cVar) {
        this.f3962n = 10;
        this.f3965w = dVar;
        this.f3963u = aVar;
        this.f3964v = cVar;
    }

    public e(m mVar, ArrayList arrayList, C3112dq c3112dq) {
        this.f3962n = 2;
        N1.g.c(c3112dq, "Argument must not be null");
        this.f3964v = c3112dq;
        N1.g.c(arrayList, "Argument must not be null");
        this.f3965w = arrayList;
        this.f3963u = new com.bumptech.glide.load.data.g(mVar, c3112dq);
    }

    public e(int i) {
        this.f3962n = i;
        switch (i) {
            case 12:
                W3.e eVar = new W3.e(7);
                L2.i iVar = new L2.i(7);
                this.f3963u = new HashSet();
                this.f3964v = eVar;
                this.f3965w = iVar;
                break;
            default:
                List list = Collections.EMPTY_LIST;
                this.f3963u = list;
                this.f3964v = list;
                break;
        }
    }

    public e(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, C3112dq c3112dq) {
        this.f3962n = 3;
        N1.g.c(c3112dq, "Argument must not be null");
        this.f3963u = c3112dq;
        N1.g.c(arrayList, "Argument must not be null");
        this.f3964v = arrayList;
        this.f3965w = new com.bumptech.glide.load.data.g(parcelFileDescriptor);
    }

    public e(Matcher matcher, String input) {
        this.f3962n = 8;
        kotlin.jvm.internal.h.e(input, "input");
        this.f3963u = matcher;
        this.f3964v = new M7.h(this);
    }

    public e(Toolbar toolbar) {
        this.f3962n = 27;
        this.f3963u = toolbar;
        this.f3964v = toolbar.getNavigationIcon();
        this.f3965w = toolbar.getNavigationContentDescription();
    }
}
