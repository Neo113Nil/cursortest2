package l4;

import O.X;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.C3404j1;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import l.C4659e;
import m.C4723s;
import m.Q;
import org.json.JSONArray;
import org.json.JSONException;
import t0.AbstractC5000P;
import u1.InterfaceC5063b;
import w.C5130e;
import x.C5163b;

/* loaded from: classes2.dex */
public final class g implements y8.w {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f38915n;

    /* renamed from: u, reason: collision with root package name */
    public Object f38916u;

    /* renamed from: v, reason: collision with root package name */
    public Object f38917v;

    /* renamed from: w, reason: collision with root package name */
    public Object f38918w;

    public /* synthetic */ g(int i) {
        this.f38915n = i;
    }

    public static g r(Context context, AttributeSet attributeSet, int[] iArr) {
        return new g(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static g s(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new g(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public void a(View view, int i, boolean z6) {
        RecyclerView recyclerView = (RecyclerView) ((C4659e) this.f38916u).f38688u;
        int childCount = i < 0 ? recyclerView.getChildCount() : l(i);
        ((C3404j1) this.f38917v).g(childCount, z6);
        if (z6) {
            p(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.I(view);
    }

    public void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z6) {
        RecyclerView recyclerView = (RecyclerView) ((C4659e) this.f38916u).f38688u;
        int childCount = i < 0 ? recyclerView.getChildCount() : l(i);
        ((C3404j1) this.f38917v).g(childCount, z6);
        if (z6) {
            p(view);
        }
        AbstractC5000P I8 = RecyclerView.I(view);
        if (I8 != null) {
            if (!I8.j() && !I8.o()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + I8 + recyclerView.y());
            }
            I8.f40651j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void c(int i) {
        AbstractC5000P I8;
        int l9 = l(i);
        ((C3404j1) this.f38917v).k(l9);
        RecyclerView recyclerView = (RecyclerView) ((C4659e) this.f38916u).f38688u;
        View childAt = recyclerView.getChildAt(l9);
        if (childAt != null && (I8 = RecyclerView.I(childAt)) != null) {
            if (I8.j() && !I8.o()) {
                throw new IllegalArgumentException("called detach on an already detached child " + I8 + recyclerView.y());
            }
            I8.a(256);
        }
        recyclerView.detachViewFromParent(l9);
    }

    @Override // y8.w
    public y8.x d() {
        return (y8.r) this.f38917v;
    }

    public View e(int i) {
        return ((RecyclerView) ((C4659e) this.f38916u).f38688u).getChildAt(l(i));
    }

    public int f() {
        return ((RecyclerView) ((C4659e) this.f38916u).f38688u).getChildCount() - ((ArrayList) this.f38918w).size();
    }

    @Override // y8.w
    public y8.v g() {
        return (y8.p) this.f38918w;
    }

    public ColorStateList h(int i) {
        int resourceId;
        ColorStateList c9;
        TypedArray typedArray = (TypedArray) this.f38917v;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (c9 = E.e.c((Context) this.f38916u, resourceId)) == null) ? typedArray.getColorStateList(i) : c9;
    }

    public Drawable i(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f38917v;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : com.bumptech.glide.g.h((Context) this.f38916u, resourceId);
    }

    public Drawable j(int i) {
        int resourceId;
        Drawable d9;
        if (!((TypedArray) this.f38917v).hasValue(i) || (resourceId = ((TypedArray) this.f38917v).getResourceId(i, 0)) == 0) {
            return null;
        }
        C4723s a9 = C4723s.a();
        Context context = (Context) this.f38916u;
        synchronized (a9) {
            d9 = a9.f39292a.d(context, resourceId, true);
        }
        return d9;
    }

    public Typeface k(int i, int i4, Q q8) {
        int resourceId = ((TypedArray) this.f38917v).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f38918w) == null) {
            this.f38918w = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f38918w;
        ThreadLocal threadLocal = F.q.f942a;
        Context context = (Context) this.f38916u;
        if (context.isRestricted()) {
            return null;
        }
        return F.q.b(context, resourceId, typedValue, i4, q8, true, false);
    }

    public int l(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((C4659e) this.f38916u).f38688u).getChildCount();
        int i4 = i;
        while (i4 < childCount) {
            C3404j1 c3404j1 = (C3404j1) this.f38917v;
            int d9 = i - (i4 - c3404j1.d(i4));
            if (d9 == 0) {
                while (c3404j1.f(i4)) {
                    i4++;
                }
                return i4;
            }
            i4 += d9;
        }
        return -1;
    }

    public View m(int i) {
        return ((RecyclerView) ((C4659e) this.f38916u).f38688u).getChildAt(i);
    }

    public int n() {
        return ((RecyclerView) ((C4659e) this.f38916u).f38688u).getChildCount();
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
    public boolean o() {
        m mVar;
        FirebaseMessagingService firebaseMessagingService;
        C4659e c4659e;
        Bundle bundle;
        NotificationChannel notificationChannel;
        String string;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        String packageName;
        PackageManager packageManager;
        String w3;
        String w6;
        String x9;
        int i;
        int i4;
        int i6;
        String x10;
        Uri defaultUri;
        String x11;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        String x12;
        Integer valueOf;
        String x13;
        Integer u6;
        Integer u9;
        Integer u10;
        String x14;
        Long valueOf2;
        JSONArray v9;
        long[] jArr;
        JSONArray v10;
        int[] iArr;
        String x15;
        IconCompat iconCompat;
        boolean z6;
        int i9;
        ApplicationInfo applicationInfo;
        if (((C4659e) this.f38918w).t("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.f38917v;
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
        String x16 = ((C4659e) this.f38918w).x("gcm.n.image");
        if (!TextUtils.isEmpty(x16)) {
            try {
                mVar = new m(new URL(x16));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + x16);
            }
            if (mVar != null) {
                ExecutorService executorService = (ExecutorService) this.f38916u;
                l3.h hVar = new l3.h();
                mVar.f38936u = executorService.submit(new F.n(20, mVar, hVar));
                mVar.f38937v = hVar.f38870a;
            }
            firebaseMessagingService = (FirebaseMessagingService) this.f38917v;
            c4659e = (C4659e) this.f38918w;
            AtomicInteger atomicInteger = e.f38913a;
            applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
            bundle = Bundle.EMPTY;
            Bundle bundle2 = bundle;
            String x17 = c4659e.x("gcm.n.android_channel_id");
            if (Build.VERSION.SDK_INT >= 26) {
                if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                    NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                    if (!TextUtils.isEmpty(x17)) {
                        notificationChannel3 = notificationManager.getNotificationChannel(x17);
                        if (notificationChannel3 == null) {
                            Log.w("FirebaseMessaging", "Notification Channel requested (" + x17 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                        }
                        packageName = firebaseMessagingService.getPackageName();
                        Resources resources = firebaseMessagingService.getResources();
                        packageManager = firebaseMessagingService.getPackageManager();
                        D.u uVar = new D.u(firebaseMessagingService, x17);
                        w3 = c4659e.w(resources, packageName, "gcm.n.title");
                        if (!TextUtils.isEmpty(w3)) {
                            uVar.f393e = D.u.b(w3);
                        }
                        w6 = c4659e.w(resources, packageName, "gcm.n.body");
                        if (!TextUtils.isEmpty(w6)) {
                            uVar.f394f = D.u.b(w6);
                            D.s sVar = new D.s(0);
                            sVar.f388f = D.u.b(w6);
                            uVar.g(sVar);
                        }
                        x9 = c4659e.x("gcm.n.icon");
                        if (TextUtils.isEmpty(x9)) {
                            i = 1;
                        } else {
                            i6 = resources.getIdentifier(x9, com.anythink.expressad.foundation.h.k.f20419c, packageName);
                            if ((i6 != 0 && e.a(resources, i6)) || ((i6 = resources.getIdentifier(x9, "mipmap", packageName)) != 0 && e.a(resources, i6))) {
                                i = 1;
                                uVar.f409v.icon = i6;
                                x10 = c4659e.x("gcm.n.sound2");
                                if (TextUtils.isEmpty(x10)) {
                                    x10 = c4659e.x("gcm.n.sound");
                                }
                                if (!TextUtils.isEmpty(x10)) {
                                    defaultUri = null;
                                } else if (com.anythink.core.express.b.a.f18317f.equals(x10) || resources.getIdentifier(x10, "raw", packageName) == 0) {
                                    defaultUri = RingtoneManager.getDefaultUri(2);
                                } else {
                                    defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + x10);
                                }
                                if (defaultUri != null) {
                                    uVar.f(defaultUri);
                                }
                                x11 = c4659e.x("gcm.n.click_action");
                                if (TextUtils.isEmpty(x11)) {
                                    launchIntentForPackage = new Intent(x11);
                                    launchIntentForPackage.setPackage(packageName);
                                    launchIntentForPackage.setFlags(268435456);
                                } else {
                                    String x18 = c4659e.x("gcm.n.link_android");
                                    if (TextUtils.isEmpty(x18)) {
                                        x18 = c4659e.x("gcm.n.link");
                                    }
                                    Uri parse = !TextUtils.isEmpty(x18) ? Uri.parse(x18) : null;
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
                                AtomicInteger atomicInteger2 = e.f38913a;
                                if (launchIntentForPackage != null) {
                                    activity = null;
                                } else {
                                    launchIntentForPackage.addFlags(67108864);
                                    Bundle bundle3 = (Bundle) c4659e.f38688u;
                                    Bundle bundle4 = new Bundle(bundle3);
                                    for (String str : bundle3.keySet()) {
                                        if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                                            bundle4.remove(str);
                                        }
                                    }
                                    launchIntentForPackage.putExtras(bundle4);
                                    if (c4659e.t("google.c.a.e")) {
                                        launchIntentForPackage.putExtra("gcm.n.analytics_data", c4659e.z());
                                    }
                                    activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
                                }
                                uVar.f395g = activity;
                                broadcast = c4659e.t("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(c4659e.z())), 1140850688);
                                if (broadcast != null) {
                                    uVar.f409v.deleteIntent = broadcast;
                                }
                                x12 = c4659e.x("gcm.n.color");
                                if (!TextUtils.isEmpty(x12)) {
                                    try {
                                        valueOf = Integer.valueOf(Color.parseColor(x12));
                                    } catch (IllegalArgumentException unused2) {
                                        Log.w("FirebaseMessaging", "Color is invalid: " + x12 + ". Notification will use default color.");
                                    }
                                    if (valueOf != null) {
                                        uVar.f404q = valueOf.intValue();
                                    }
                                    uVar.d(16, !c4659e.t("gcm.n.sticky"));
                                    uVar.f402o = c4659e.t("gcm.n.local_only");
                                    x13 = c4659e.x("gcm.n.ticker");
                                    if (x13 != null) {
                                        uVar.f409v.tickerText = D.u.b(x13);
                                    }
                                    u6 = c4659e.u("gcm.n.notification_priority");
                                    if (u6 != null) {
                                        if (u6.intValue() < -2 || u6.intValue() > 2) {
                                            Log.w("FirebaseMessaging", "notificationPriority is invalid " + u6 + ". Skipping setting notificationPriority.");
                                        }
                                        if (u6 != null) {
                                            uVar.f397j = u6.intValue();
                                        }
                                        u9 = c4659e.u("gcm.n.visibility");
                                        if (u9 != null) {
                                            if (u9.intValue() < -1 || u9.intValue() > i) {
                                                Log.w("NotificationParams", "visibility is invalid: " + u9 + ". Skipping setting visibility.");
                                            }
                                            if (u9 != null) {
                                                uVar.f405r = u9.intValue();
                                            }
                                            u10 = c4659e.u("gcm.n.notification_count");
                                            if (u10 != null) {
                                                if (u10.intValue() < 0) {
                                                    Log.w("FirebaseMessaging", "notificationCount is invalid: " + u10 + ". Skipping setting notificationCount.");
                                                }
                                                if (u10 != null) {
                                                    uVar.i = u10.intValue();
                                                }
                                                x14 = c4659e.x("gcm.n.event_time");
                                                if (!TextUtils.isEmpty(x14)) {
                                                    try {
                                                        valueOf2 = Long.valueOf(Long.parseLong(x14));
                                                    } catch (NumberFormatException unused3) {
                                                        Log.w("NotificationParams", "Couldn't parse value of " + C4659e.B("gcm.n.event_time") + "(" + x14 + ") into a long");
                                                    }
                                                    if (valueOf2 != null) {
                                                        uVar.f398k = true;
                                                        uVar.f409v.when = valueOf2.longValue();
                                                    }
                                                    v9 = c4659e.v("gcm.n.vibrate_timings");
                                                    if (v9 != null) {
                                                        try {
                                                        } catch (NumberFormatException | JSONException unused4) {
                                                            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + v9 + ". Skipping setting vibrateTimings.");
                                                        }
                                                        if (v9.length() <= 1) {
                                                            throw new JSONException("vibrateTimings have invalid length");
                                                        }
                                                        int length = v9.length();
                                                        jArr = new long[length];
                                                        for (int i10 = 0; i10 < length; i10++) {
                                                            jArr[i10] = v9.optLong(i10);
                                                        }
                                                        if (jArr != null) {
                                                            uVar.f409v.vibrate = jArr;
                                                        }
                                                        v10 = c4659e.v("gcm.n.light_settings");
                                                        if (v10 != null) {
                                                            iArr = new int[3];
                                                            try {
                                                            } catch (IllegalArgumentException e9) {
                                                                Log.w("NotificationParams", "LightSettings is invalid: " + v10 + ". " + e9.getMessage() + ". Skipping setting LightSettings");
                                                            } catch (JSONException unused5) {
                                                                Log.w("NotificationParams", "LightSettings is invalid: " + v10 + ". Skipping setting LightSettings");
                                                            }
                                                            if (v10.length() != 3) {
                                                                throw new JSONException("lightSettings don't have all three fields");
                                                            }
                                                            int parseColor = Color.parseColor(v10.optString(0));
                                                            if (parseColor == -16777216) {
                                                                throw new IllegalArgumentException("Transparent color is invalid");
                                                            }
                                                            iArr[0] = parseColor;
                                                            iArr[1] = v10.optInt(1);
                                                            iArr[2] = v10.optInt(2);
                                                            if (iArr != null) {
                                                                int i11 = iArr[0];
                                                                int i12 = iArr[1];
                                                                int i13 = iArr[2];
                                                                Notification notification = uVar.f409v;
                                                                notification.ledARGB = i11;
                                                                notification.ledOnMS = i12;
                                                                notification.ledOffMS = i13;
                                                                notification.flags = ((i12 == 0 || i13 == 0) ? 0 : 1) | ((-2) & notification.flags);
                                                            }
                                                            boolean t6 = c4659e.t("gcm.n.default_sound");
                                                            boolean z9 = t6;
                                                            if (c4659e.t("gcm.n.default_vibrate_timings")) {
                                                                z9 = (t6 ? 1 : 0) | 2;
                                                            }
                                                            int i14 = z9;
                                                            if (c4659e.t("gcm.n.default_light_settings")) {
                                                                i14 = (z9 ? 1 : 0) | 4;
                                                            }
                                                            uVar.c(i14);
                                                            x15 = c4659e.x("gcm.n.tag");
                                                            if (TextUtils.isEmpty(x15)) {
                                                                x15 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                                            }
                                                            String str2 = x15;
                                                            if (mVar != null) {
                                                                try {
                                                                    l3.m mVar2 = mVar.f38937v;
                                                                    R2.w.h(mVar2);
                                                                    TimeUnit timeUnit = TimeUnit.SECONDS;
                                                                    Bitmap bitmap = (Bitmap) com.bumptech.glide.d.e(mVar2, 5L);
                                                                    uVar.e(bitmap);
                                                                    D.r rVar = new D.r();
                                                                    if (bitmap == null) {
                                                                        iconCompat = null;
                                                                        z6 = true;
                                                                    } else {
                                                                        z6 = true;
                                                                        iconCompat = new IconCompat(1);
                                                                        iconCompat.f4658b = bitmap;
                                                                    }
                                                                    rVar.f384e = iconCompat;
                                                                    rVar.f385f = null;
                                                                    rVar.f386g = z6;
                                                                    uVar.g(rVar);
                                                                } catch (InterruptedException unused6) {
                                                                    Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                                                                    mVar.close();
                                                                    Thread.currentThread().interrupt();
                                                                } catch (ExecutionException e10) {
                                                                    Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
                                                                } catch (TimeoutException unused7) {
                                                                    Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                                                                    mVar.close();
                                                                }
                                                            }
                                                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                                Log.d("FirebaseMessaging", "Showing notification");
                                                            }
                                                            ((NotificationManager) ((FirebaseMessagingService) this.f38917v).getSystemService("notification")).notify(str2, 0, uVar.a());
                                                            return true;
                                                        }
                                                        iArr = null;
                                                        if (iArr != null) {
                                                        }
                                                        boolean t62 = c4659e.t("gcm.n.default_sound");
                                                        boolean z92 = t62;
                                                        if (c4659e.t("gcm.n.default_vibrate_timings")) {
                                                        }
                                                        int i142 = z92;
                                                        if (c4659e.t("gcm.n.default_light_settings")) {
                                                        }
                                                        uVar.c(i142);
                                                        x15 = c4659e.x("gcm.n.tag");
                                                        if (TextUtils.isEmpty(x15)) {
                                                        }
                                                        String str22 = x15;
                                                        if (mVar != null) {
                                                        }
                                                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                        }
                                                        ((NotificationManager) ((FirebaseMessagingService) this.f38917v).getSystemService("notification")).notify(str22, 0, uVar.a());
                                                        return true;
                                                    }
                                                    jArr = null;
                                                    if (jArr != null) {
                                                    }
                                                    v10 = c4659e.v("gcm.n.light_settings");
                                                    if (v10 != null) {
                                                    }
                                                    iArr = null;
                                                    if (iArr != null) {
                                                    }
                                                    boolean t622 = c4659e.t("gcm.n.default_sound");
                                                    boolean z922 = t622;
                                                    if (c4659e.t("gcm.n.default_vibrate_timings")) {
                                                    }
                                                    int i1422 = z922;
                                                    if (c4659e.t("gcm.n.default_light_settings")) {
                                                    }
                                                    uVar.c(i1422);
                                                    x15 = c4659e.x("gcm.n.tag");
                                                    if (TextUtils.isEmpty(x15)) {
                                                    }
                                                    String str222 = x15;
                                                    if (mVar != null) {
                                                    }
                                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                    }
                                                    ((NotificationManager) ((FirebaseMessagingService) this.f38917v).getSystemService("notification")).notify(str222, 0, uVar.a());
                                                    return true;
                                                }
                                                valueOf2 = null;
                                                if (valueOf2 != null) {
                                                }
                                                v9 = c4659e.v("gcm.n.vibrate_timings");
                                                if (v9 != null) {
                                                }
                                                jArr = null;
                                                if (jArr != null) {
                                                }
                                                v10 = c4659e.v("gcm.n.light_settings");
                                                if (v10 != null) {
                                                }
                                                iArr = null;
                                                if (iArr != null) {
                                                }
                                                boolean t6222 = c4659e.t("gcm.n.default_sound");
                                                boolean z9222 = t6222;
                                                if (c4659e.t("gcm.n.default_vibrate_timings")) {
                                                }
                                                int i14222 = z9222;
                                                if (c4659e.t("gcm.n.default_light_settings")) {
                                                }
                                                uVar.c(i14222);
                                                x15 = c4659e.x("gcm.n.tag");
                                                if (TextUtils.isEmpty(x15)) {
                                                }
                                                String str2222 = x15;
                                                if (mVar != null) {
                                                }
                                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                }
                                                ((NotificationManager) ((FirebaseMessagingService) this.f38917v).getSystemService("notification")).notify(str2222, 0, uVar.a());
                                                return true;
                                            }
                                            u10 = null;
                                            if (u10 != null) {
                                            }
                                            x14 = c4659e.x("gcm.n.event_time");
                                            if (!TextUtils.isEmpty(x14)) {
                                            }
                                            valueOf2 = null;
                                            if (valueOf2 != null) {
                                            }
                                            v9 = c4659e.v("gcm.n.vibrate_timings");
                                            if (v9 != null) {
                                            }
                                            jArr = null;
                                            if (jArr != null) {
                                            }
                                            v10 = c4659e.v("gcm.n.light_settings");
                                            if (v10 != null) {
                                            }
                                            iArr = null;
                                            if (iArr != null) {
                                            }
                                            boolean t62222 = c4659e.t("gcm.n.default_sound");
                                            boolean z92222 = t62222;
                                            if (c4659e.t("gcm.n.default_vibrate_timings")) {
                                            }
                                            int i142222 = z92222;
                                            if (c4659e.t("gcm.n.default_light_settings")) {
                                            }
                                            uVar.c(i142222);
                                            x15 = c4659e.x("gcm.n.tag");
                                            if (TextUtils.isEmpty(x15)) {
                                            }
                                            String str22222 = x15;
                                            if (mVar != null) {
                                            }
                                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                            }
                                            ((NotificationManager) ((FirebaseMessagingService) this.f38917v).getSystemService("notification")).notify(str22222, 0, uVar.a());
                                            return true;
                                        }
                                        u9 = null;
                                        if (u9 != null) {
                                        }
                                        u10 = c4659e.u("gcm.n.notification_count");
                                        if (u10 != null) {
                                        }
                                        u10 = null;
                                        if (u10 != null) {
                                        }
                                        x14 = c4659e.x("gcm.n.event_time");
                                        if (!TextUtils.isEmpty(x14)) {
                                        }
                                        valueOf2 = null;
                                        if (valueOf2 != null) {
                                        }
                                        v9 = c4659e.v("gcm.n.vibrate_timings");
                                        if (v9 != null) {
                                        }
                                        jArr = null;
                                        if (jArr != null) {
                                        }
                                        v10 = c4659e.v("gcm.n.light_settings");
                                        if (v10 != null) {
                                        }
                                        iArr = null;
                                        if (iArr != null) {
                                        }
                                        boolean t622222 = c4659e.t("gcm.n.default_sound");
                                        boolean z922222 = t622222;
                                        if (c4659e.t("gcm.n.default_vibrate_timings")) {
                                        }
                                        int i1422222 = z922222;
                                        if (c4659e.t("gcm.n.default_light_settings")) {
                                        }
                                        uVar.c(i1422222);
                                        x15 = c4659e.x("gcm.n.tag");
                                        if (TextUtils.isEmpty(x15)) {
                                        }
                                        String str222222 = x15;
                                        if (mVar != null) {
                                        }
                                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                                        }
                                        ((NotificationManager) ((FirebaseMessagingService) this.f38917v).getSystemService("notification")).notify(str222222, 0, uVar.a());
                                        return true;
                                    }
                                    u6 = null;
                                    if (u6 != null) {
                                    }
                                    u9 = c4659e.u("gcm.n.visibility");
                                    if (u9 != null) {
                                    }
                                    u9 = null;
                                    if (u9 != null) {
                                    }
                                    u10 = c4659e.u("gcm.n.notification_count");
                                    if (u10 != null) {
                                    }
                                    u10 = null;
                                    if (u10 != null) {
                                    }
                                    x14 = c4659e.x("gcm.n.event_time");
                                    if (!TextUtils.isEmpty(x14)) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                    }
                                    v9 = c4659e.v("gcm.n.vibrate_timings");
                                    if (v9 != null) {
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    v10 = c4659e.v("gcm.n.light_settings");
                                    if (v10 != null) {
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    boolean t6222222 = c4659e.t("gcm.n.default_sound");
                                    boolean z9222222 = t6222222;
                                    if (c4659e.t("gcm.n.default_vibrate_timings")) {
                                    }
                                    int i14222222 = z9222222;
                                    if (c4659e.t("gcm.n.default_light_settings")) {
                                    }
                                    uVar.c(i14222222);
                                    x15 = c4659e.x("gcm.n.tag");
                                    if (TextUtils.isEmpty(x15)) {
                                    }
                                    String str2222222 = x15;
                                    if (mVar != null) {
                                    }
                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    }
                                    ((NotificationManager) ((FirebaseMessagingService) this.f38917v).getSystemService("notification")).notify(str2222222, 0, uVar.a());
                                    return true;
                                }
                                i9 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                                if (i9 != 0) {
                                    try {
                                        valueOf = Integer.valueOf(E.b.a(firebaseMessagingService, i9));
                                    } catch (Resources.NotFoundException unused8) {
                                        Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                                    }
                                    if (valueOf != null) {
                                    }
                                    uVar.d(16, !c4659e.t("gcm.n.sticky"));
                                    uVar.f402o = c4659e.t("gcm.n.local_only");
                                    x13 = c4659e.x("gcm.n.ticker");
                                    if (x13 != null) {
                                    }
                                    u6 = c4659e.u("gcm.n.notification_priority");
                                    if (u6 != null) {
                                    }
                                    u6 = null;
                                    if (u6 != null) {
                                    }
                                    u9 = c4659e.u("gcm.n.visibility");
                                    if (u9 != null) {
                                    }
                                    u9 = null;
                                    if (u9 != null) {
                                    }
                                    u10 = c4659e.u("gcm.n.notification_count");
                                    if (u10 != null) {
                                    }
                                    u10 = null;
                                    if (u10 != null) {
                                    }
                                    x14 = c4659e.x("gcm.n.event_time");
                                    if (!TextUtils.isEmpty(x14)) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                    }
                                    v9 = c4659e.v("gcm.n.vibrate_timings");
                                    if (v9 != null) {
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    v10 = c4659e.v("gcm.n.light_settings");
                                    if (v10 != null) {
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    boolean t62222222 = c4659e.t("gcm.n.default_sound");
                                    boolean z92222222 = t62222222;
                                    if (c4659e.t("gcm.n.default_vibrate_timings")) {
                                    }
                                    int i142222222 = z92222222;
                                    if (c4659e.t("gcm.n.default_light_settings")) {
                                    }
                                    uVar.c(i142222222);
                                    x15 = c4659e.x("gcm.n.tag");
                                    if (TextUtils.isEmpty(x15)) {
                                    }
                                    String str22222222 = x15;
                                    if (mVar != null) {
                                    }
                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    }
                                    ((NotificationManager) ((FirebaseMessagingService) this.f38917v).getSystemService("notification")).notify(str22222222, 0, uVar.a());
                                    return true;
                                }
                                valueOf = null;
                                if (valueOf != null) {
                                }
                                uVar.d(16, !c4659e.t("gcm.n.sticky"));
                                uVar.f402o = c4659e.t("gcm.n.local_only");
                                x13 = c4659e.x("gcm.n.ticker");
                                if (x13 != null) {
                                }
                                u6 = c4659e.u("gcm.n.notification_priority");
                                if (u6 != null) {
                                }
                                u6 = null;
                                if (u6 != null) {
                                }
                                u9 = c4659e.u("gcm.n.visibility");
                                if (u9 != null) {
                                }
                                u9 = null;
                                if (u9 != null) {
                                }
                                u10 = c4659e.u("gcm.n.notification_count");
                                if (u10 != null) {
                                }
                                u10 = null;
                                if (u10 != null) {
                                }
                                x14 = c4659e.x("gcm.n.event_time");
                                if (!TextUtils.isEmpty(x14)) {
                                }
                                valueOf2 = null;
                                if (valueOf2 != null) {
                                }
                                v9 = c4659e.v("gcm.n.vibrate_timings");
                                if (v9 != null) {
                                }
                                jArr = null;
                                if (jArr != null) {
                                }
                                v10 = c4659e.v("gcm.n.light_settings");
                                if (v10 != null) {
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                                boolean t622222222 = c4659e.t("gcm.n.default_sound");
                                boolean z922222222 = t622222222;
                                if (c4659e.t("gcm.n.default_vibrate_timings")) {
                                }
                                int i1422222222 = z922222222;
                                if (c4659e.t("gcm.n.default_light_settings")) {
                                }
                                uVar.c(i1422222222);
                                x15 = c4659e.x("gcm.n.tag");
                                if (TextUtils.isEmpty(x15)) {
                                }
                                String str222222222 = x15;
                                if (mVar != null) {
                                }
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                }
                                ((NotificationManager) ((FirebaseMessagingService) this.f38917v).getSystemService("notification")).notify(str222222222, 0, uVar.a());
                                return true;
                            }
                            i = 1;
                            Log.w("FirebaseMessaging", "Icon resource " + x9 + " not found. Notification will use default icon.");
                        }
                        i4 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                        if (i4 != 0 || !e.a(resources, i4)) {
                            i4 = packageManager.getApplicationInfo(packageName, 0).icon;
                        }
                        i6 = (i4 == 0 && e.a(resources, i4)) ? i4 : 17301651;
                        uVar.f409v.icon = i6;
                        x10 = c4659e.x("gcm.n.sound2");
                        if (TextUtils.isEmpty(x10)) {
                        }
                        if (!TextUtils.isEmpty(x10)) {
                        }
                        if (defaultUri != null) {
                        }
                        x11 = c4659e.x("gcm.n.click_action");
                        if (TextUtils.isEmpty(x11)) {
                        }
                        AtomicInteger atomicInteger22 = e.f38913a;
                        if (launchIntentForPackage != null) {
                        }
                        uVar.f395g = activity;
                        if (c4659e.t("google.c.a.e")) {
                        }
                        if (broadcast != null) {
                        }
                        x12 = c4659e.x("gcm.n.color");
                        if (!TextUtils.isEmpty(x12)) {
                        }
                        i9 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i9 != 0) {
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        uVar.d(16, !c4659e.t("gcm.n.sticky"));
                        uVar.f402o = c4659e.t("gcm.n.local_only");
                        x13 = c4659e.x("gcm.n.ticker");
                        if (x13 != null) {
                        }
                        u6 = c4659e.u("gcm.n.notification_priority");
                        if (u6 != null) {
                        }
                        u6 = null;
                        if (u6 != null) {
                        }
                        u9 = c4659e.u("gcm.n.visibility");
                        if (u9 != null) {
                        }
                        u9 = null;
                        if (u9 != null) {
                        }
                        u10 = c4659e.u("gcm.n.notification_count");
                        if (u10 != null) {
                        }
                        u10 = null;
                        if (u10 != null) {
                        }
                        x14 = c4659e.x("gcm.n.event_time");
                        if (!TextUtils.isEmpty(x14)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        v9 = c4659e.v("gcm.n.vibrate_timings");
                        if (v9 != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        v10 = c4659e.v("gcm.n.light_settings");
                        if (v10 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean t6222222222 = c4659e.t("gcm.n.default_sound");
                        boolean z9222222222 = t6222222222;
                        if (c4659e.t("gcm.n.default_vibrate_timings")) {
                        }
                        int i14222222222 = z9222222222;
                        if (c4659e.t("gcm.n.default_light_settings")) {
                        }
                        uVar.c(i14222222222);
                        x15 = c4659e.x("gcm.n.tag");
                        if (TextUtils.isEmpty(x15)) {
                        }
                        String str2222222222 = x15;
                        if (mVar != null) {
                        }
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                        }
                        ((NotificationManager) ((FirebaseMessagingService) this.f38917v).getSystemService("notification")).notify(str2222222222, 0, uVar.a());
                        return true;
                    }
                    x17 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(x17)) {
                        notificationChannel2 = notificationManager.getNotificationChannel(x17);
                        if (notificationChannel2 == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        packageName = firebaseMessagingService.getPackageName();
                        Resources resources2 = firebaseMessagingService.getResources();
                        packageManager = firebaseMessagingService.getPackageManager();
                        D.u uVar2 = new D.u(firebaseMessagingService, x17);
                        w3 = c4659e.w(resources2, packageName, "gcm.n.title");
                        if (!TextUtils.isEmpty(w3)) {
                        }
                        w6 = c4659e.w(resources2, packageName, "gcm.n.body");
                        if (!TextUtils.isEmpty(w6)) {
                        }
                        x9 = c4659e.x("gcm.n.icon");
                        if (TextUtils.isEmpty(x9)) {
                        }
                        i4 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                        if (i4 != 0) {
                        }
                        i4 = packageManager.getApplicationInfo(packageName, 0).icon;
                        if (i4 == 0) {
                        }
                        uVar2.f409v.icon = i6;
                        x10 = c4659e.x("gcm.n.sound2");
                        if (TextUtils.isEmpty(x10)) {
                        }
                        if (!TextUtils.isEmpty(x10)) {
                        }
                        if (defaultUri != null) {
                        }
                        x11 = c4659e.x("gcm.n.click_action");
                        if (TextUtils.isEmpty(x11)) {
                        }
                        AtomicInteger atomicInteger222 = e.f38913a;
                        if (launchIntentForPackage != null) {
                        }
                        uVar2.f395g = activity;
                        if (c4659e.t("google.c.a.e")) {
                        }
                        if (broadcast != null) {
                        }
                        x12 = c4659e.x("gcm.n.color");
                        if (!TextUtils.isEmpty(x12)) {
                        }
                        i9 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i9 != 0) {
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        uVar2.d(16, !c4659e.t("gcm.n.sticky"));
                        uVar2.f402o = c4659e.t("gcm.n.local_only");
                        x13 = c4659e.x("gcm.n.ticker");
                        if (x13 != null) {
                        }
                        u6 = c4659e.u("gcm.n.notification_priority");
                        if (u6 != null) {
                        }
                        u6 = null;
                        if (u6 != null) {
                        }
                        u9 = c4659e.u("gcm.n.visibility");
                        if (u9 != null) {
                        }
                        u9 = null;
                        if (u9 != null) {
                        }
                        u10 = c4659e.u("gcm.n.notification_count");
                        if (u10 != null) {
                        }
                        u10 = null;
                        if (u10 != null) {
                        }
                        x14 = c4659e.x("gcm.n.event_time");
                        if (!TextUtils.isEmpty(x14)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        v9 = c4659e.v("gcm.n.vibrate_timings");
                        if (v9 != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        v10 = c4659e.v("gcm.n.light_settings");
                        if (v10 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean t62222222222 = c4659e.t("gcm.n.default_sound");
                        boolean z92222222222 = t62222222222;
                        if (c4659e.t("gcm.n.default_vibrate_timings")) {
                        }
                        int i142222222222 = z92222222222;
                        if (c4659e.t("gcm.n.default_light_settings")) {
                        }
                        uVar2.c(i142222222222);
                        x15 = c4659e.x("gcm.n.tag");
                        if (TextUtils.isEmpty(x15)) {
                        }
                        String str22222222222 = x15;
                        if (mVar != null) {
                        }
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                        }
                        ((NotificationManager) ((FirebaseMessagingService) this.f38917v).getSystemService("notification")).notify(str22222222222, 0, uVar2.a());
                        return true;
                    }
                    Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    notificationChannel = notificationManager.getNotificationChannel("fcm_fallback_notification_channel");
                    if (notificationChannel == null) {
                        int identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", com.anythink.expressad.foundation.h.k.f20423g, firebaseMessagingService.getPackageName());
                        if (identifier == 0) {
                            Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = "Misc";
                        } else {
                            string = firebaseMessagingService.getString(identifier);
                        }
                        notificationManager.createNotificationChannel(com.anythink.core.common.n.b.B.g(string));
                    }
                    x17 = "fcm_fallback_notification_channel";
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources22 = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    D.u uVar22 = new D.u(firebaseMessagingService, x17);
                    w3 = c4659e.w(resources22, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(w3)) {
                    }
                    w6 = c4659e.w(resources22, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(w6)) {
                    }
                    x9 = c4659e.x("gcm.n.icon");
                    if (TextUtils.isEmpty(x9)) {
                    }
                    i4 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i4 != 0) {
                    }
                    i4 = packageManager.getApplicationInfo(packageName, 0).icon;
                    if (i4 == 0) {
                    }
                    uVar22.f409v.icon = i6;
                    x10 = c4659e.x("gcm.n.sound2");
                    if (TextUtils.isEmpty(x10)) {
                    }
                    if (!TextUtils.isEmpty(x10)) {
                    }
                    if (defaultUri != null) {
                    }
                    x11 = c4659e.x("gcm.n.click_action");
                    if (TextUtils.isEmpty(x11)) {
                    }
                    AtomicInteger atomicInteger2222 = e.f38913a;
                    if (launchIntentForPackage != null) {
                    }
                    uVar22.f395g = activity;
                    if (c4659e.t("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    x12 = c4659e.x("gcm.n.color");
                    if (!TextUtils.isEmpty(x12)) {
                    }
                    i9 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i9 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    uVar22.d(16, !c4659e.t("gcm.n.sticky"));
                    uVar22.f402o = c4659e.t("gcm.n.local_only");
                    x13 = c4659e.x("gcm.n.ticker");
                    if (x13 != null) {
                    }
                    u6 = c4659e.u("gcm.n.notification_priority");
                    if (u6 != null) {
                    }
                    u6 = null;
                    if (u6 != null) {
                    }
                    u9 = c4659e.u("gcm.n.visibility");
                    if (u9 != null) {
                    }
                    u9 = null;
                    if (u9 != null) {
                    }
                    u10 = c4659e.u("gcm.n.notification_count");
                    if (u10 != null) {
                    }
                    u10 = null;
                    if (u10 != null) {
                    }
                    x14 = c4659e.x("gcm.n.event_time");
                    if (!TextUtils.isEmpty(x14)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    v9 = c4659e.v("gcm.n.vibrate_timings");
                    if (v9 != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    v10 = c4659e.v("gcm.n.light_settings");
                    if (v10 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean t622222222222 = c4659e.t("gcm.n.default_sound");
                    boolean z922222222222 = t622222222222;
                    if (c4659e.t("gcm.n.default_vibrate_timings")) {
                    }
                    int i1422222222222 = z922222222222;
                    if (c4659e.t("gcm.n.default_light_settings")) {
                    }
                    uVar22.c(i1422222222222);
                    x15 = c4659e.x("gcm.n.tag");
                    if (TextUtils.isEmpty(x15)) {
                    }
                    String str222222222222 = x15;
                    if (mVar != null) {
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                    }
                    ((NotificationManager) ((FirebaseMessagingService) this.f38917v).getSystemService("notification")).notify(str222222222222, 0, uVar22.a());
                    return true;
                }
            }
            x17 = null;
            packageName = firebaseMessagingService.getPackageName();
            Resources resources222 = firebaseMessagingService.getResources();
            packageManager = firebaseMessagingService.getPackageManager();
            D.u uVar222 = new D.u(firebaseMessagingService, x17);
            w3 = c4659e.w(resources222, packageName, "gcm.n.title");
            if (!TextUtils.isEmpty(w3)) {
            }
            w6 = c4659e.w(resources222, packageName, "gcm.n.body");
            if (!TextUtils.isEmpty(w6)) {
            }
            x9 = c4659e.x("gcm.n.icon");
            if (TextUtils.isEmpty(x9)) {
            }
            i4 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i4 != 0) {
            }
            i4 = packageManager.getApplicationInfo(packageName, 0).icon;
            if (i4 == 0) {
            }
            uVar222.f409v.icon = i6;
            x10 = c4659e.x("gcm.n.sound2");
            if (TextUtils.isEmpty(x10)) {
            }
            if (!TextUtils.isEmpty(x10)) {
            }
            if (defaultUri != null) {
            }
            x11 = c4659e.x("gcm.n.click_action");
            if (TextUtils.isEmpty(x11)) {
            }
            AtomicInteger atomicInteger22222 = e.f38913a;
            if (launchIntentForPackage != null) {
            }
            uVar222.f395g = activity;
            if (c4659e.t("google.c.a.e")) {
            }
            if (broadcast != null) {
            }
            x12 = c4659e.x("gcm.n.color");
            if (!TextUtils.isEmpty(x12)) {
            }
            i9 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i9 != 0) {
            }
            valueOf = null;
            if (valueOf != null) {
            }
            uVar222.d(16, !c4659e.t("gcm.n.sticky"));
            uVar222.f402o = c4659e.t("gcm.n.local_only");
            x13 = c4659e.x("gcm.n.ticker");
            if (x13 != null) {
            }
            u6 = c4659e.u("gcm.n.notification_priority");
            if (u6 != null) {
            }
            u6 = null;
            if (u6 != null) {
            }
            u9 = c4659e.u("gcm.n.visibility");
            if (u9 != null) {
            }
            u9 = null;
            if (u9 != null) {
            }
            u10 = c4659e.u("gcm.n.notification_count");
            if (u10 != null) {
            }
            u10 = null;
            if (u10 != null) {
            }
            x14 = c4659e.x("gcm.n.event_time");
            if (!TextUtils.isEmpty(x14)) {
            }
            valueOf2 = null;
            if (valueOf2 != null) {
            }
            v9 = c4659e.v("gcm.n.vibrate_timings");
            if (v9 != null) {
            }
            jArr = null;
            if (jArr != null) {
            }
            v10 = c4659e.v("gcm.n.light_settings");
            if (v10 != null) {
            }
            iArr = null;
            if (iArr != null) {
            }
            boolean t6222222222222 = c4659e.t("gcm.n.default_sound");
            boolean z9222222222222 = t6222222222222;
            if (c4659e.t("gcm.n.default_vibrate_timings")) {
            }
            int i14222222222222 = z9222222222222;
            if (c4659e.t("gcm.n.default_light_settings")) {
            }
            uVar222.c(i14222222222222);
            x15 = c4659e.x("gcm.n.tag");
            if (TextUtils.isEmpty(x15)) {
            }
            String str2222222222222 = x15;
            if (mVar != null) {
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
            }
            ((NotificationManager) ((FirebaseMessagingService) this.f38917v).getSystemService("notification")).notify(str2222222222222, 0, uVar222.a());
            return true;
        }
        mVar = null;
        if (mVar != null) {
        }
        firebaseMessagingService = (FirebaseMessagingService) this.f38917v;
        c4659e = (C4659e) this.f38918w;
        AtomicInteger atomicInteger3 = e.f38913a;
        applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
        if (applicationInfo != null) {
        }
        bundle = Bundle.EMPTY;
        Bundle bundle22 = bundle;
        String x172 = c4659e.x("gcm.n.android_channel_id");
        if (Build.VERSION.SDK_INT >= 26) {
        }
        x172 = null;
        packageName = firebaseMessagingService.getPackageName();
        Resources resources2222 = firebaseMessagingService.getResources();
        packageManager = firebaseMessagingService.getPackageManager();
        D.u uVar2222 = new D.u(firebaseMessagingService, x172);
        w3 = c4659e.w(resources2222, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(w3)) {
        }
        w6 = c4659e.w(resources2222, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(w6)) {
        }
        x9 = c4659e.x("gcm.n.icon");
        if (TextUtils.isEmpty(x9)) {
        }
        i4 = bundle22.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i4 != 0) {
        }
        i4 = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i4 == 0) {
        }
        uVar2222.f409v.icon = i6;
        x10 = c4659e.x("gcm.n.sound2");
        if (TextUtils.isEmpty(x10)) {
        }
        if (!TextUtils.isEmpty(x10)) {
        }
        if (defaultUri != null) {
        }
        x11 = c4659e.x("gcm.n.click_action");
        if (TextUtils.isEmpty(x11)) {
        }
        AtomicInteger atomicInteger222222 = e.f38913a;
        if (launchIntentForPackage != null) {
        }
        uVar2222.f395g = activity;
        if (c4659e.t("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        x12 = c4659e.x("gcm.n.color");
        if (!TextUtils.isEmpty(x12)) {
        }
        i9 = bundle22.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i9 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        uVar2222.d(16, !c4659e.t("gcm.n.sticky"));
        uVar2222.f402o = c4659e.t("gcm.n.local_only");
        x13 = c4659e.x("gcm.n.ticker");
        if (x13 != null) {
        }
        u6 = c4659e.u("gcm.n.notification_priority");
        if (u6 != null) {
        }
        u6 = null;
        if (u6 != null) {
        }
        u9 = c4659e.u("gcm.n.visibility");
        if (u9 != null) {
        }
        u9 = null;
        if (u9 != null) {
        }
        u10 = c4659e.u("gcm.n.notification_count");
        if (u10 != null) {
        }
        u10 = null;
        if (u10 != null) {
        }
        x14 = c4659e.x("gcm.n.event_time");
        if (!TextUtils.isEmpty(x14)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        v9 = c4659e.v("gcm.n.vibrate_timings");
        if (v9 != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        v10 = c4659e.v("gcm.n.light_settings");
        if (v10 != null) {
        }
        iArr = null;
        if (iArr != null) {
        }
        boolean t62222222222222 = c4659e.t("gcm.n.default_sound");
        boolean z92222222222222 = t62222222222222;
        if (c4659e.t("gcm.n.default_vibrate_timings")) {
        }
        int i142222222222222 = z92222222222222;
        if (c4659e.t("gcm.n.default_light_settings")) {
        }
        uVar2222.c(i142222222222222);
        x15 = c4659e.x("gcm.n.tag");
        if (TextUtils.isEmpty(x15)) {
        }
        String str22222222222222 = x15;
        if (mVar != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.f38917v).getSystemService("notification")).notify(str22222222222222, 0, uVar2222.a());
        return true;
    }

    public void p(View view) {
        ((ArrayList) this.f38918w).add(view);
        C4659e c4659e = (C4659e) this.f38916u;
        AbstractC5000P I8 = RecyclerView.I(view);
        if (I8 != null) {
            int i = I8.f40658q;
            View view2 = I8.f40643a;
            if (i != -1) {
                I8.f40657p = i;
            } else {
                WeakHashMap weakHashMap = X.f2142a;
                I8.f40657p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = (RecyclerView) c4659e.f38688u;
            if (recyclerView.L()) {
                I8.f40658q = 4;
                recyclerView.f5209Q0.add(I8);
            } else {
                WeakHashMap weakHashMap2 = X.f2142a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public boolean q(int i, C5130e c5130e, z.f fVar) {
        int[] iArr = c5130e.f41311p0;
        int i4 = iArr[0];
        C5163b c5163b = (C5163b) this.f38917v;
        c5163b.f41753a = i4;
        c5163b.f41754b = iArr[1];
        c5163b.f41755c = c5130e.q();
        c5163b.f41756d = c5130e.k();
        c5163b.i = false;
        c5163b.f41761j = i;
        boolean z6 = c5163b.f41753a == 3;
        boolean z9 = c5163b.f41754b == 3;
        boolean z10 = z6 && c5130e.f41279W > 0.0f;
        boolean z11 = z9 && c5130e.f41279W > 0.0f;
        int[] iArr2 = c5130e.f41315t;
        if (z10 && iArr2[0] == 4) {
            c5163b.f41753a = 1;
        }
        if (z11 && iArr2[1] == 4) {
            c5163b.f41754b = 1;
        }
        fVar.b(c5130e, c5163b);
        c5130e.O(c5163b.f41757e);
        c5130e.L(c5163b.f41758f);
        c5130e.f41262E = c5163b.f41760h;
        c5130e.I(c5163b.f41759g);
        c5163b.f41761j = 0;
        return c5163b.i;
    }

    public void t() {
        ((TypedArray) this.f38917v).recycle();
    }

    public String toString() {
        switch (this.f38915n) {
            case 3:
                return ((C3404j1) this.f38917v).toString() + ", hidden list:" + ((ArrayList) this.f38918w).size();
            default:
                return super.toString();
        }
    }

    public void u(w.f fVar, int i, int i4, int i6) {
        fVar.getClass();
        int i9 = fVar.f41285b0;
        int i10 = fVar.f41287c0;
        fVar.f41285b0 = 0;
        fVar.f41287c0 = 0;
        fVar.O(i4);
        fVar.L(i6);
        if (i9 < 0) {
            fVar.f41285b0 = 0;
        } else {
            fVar.f41285b0 = i9;
        }
        if (i10 < 0) {
            fVar.f41287c0 = 0;
        } else {
            fVar.f41287c0 = i10;
        }
        w.f fVar2 = (w.f) this.f38918w;
        fVar2.f41336t0 = i;
        fVar2.U();
    }

    public void v(View view) {
        if (((ArrayList) this.f38918w).remove(view)) {
            C4659e c4659e = (C4659e) this.f38916u;
            AbstractC5000P I8 = RecyclerView.I(view);
            if (I8 != null) {
                int i = I8.f40657p;
                RecyclerView recyclerView = (RecyclerView) c4659e.f38688u;
                if (recyclerView.L()) {
                    I8.f40658q = i;
                    recyclerView.f5209Q0.add(I8);
                } else {
                    WeakHashMap weakHashMap = X.f2142a;
                    I8.f40643a.setImportantForAccessibility(i);
                }
                I8.f40657p = 0;
            }
        }
    }

    public void w(w.f fVar) {
        ArrayList arrayList = (ArrayList) this.f38916u;
        arrayList.clear();
        int size = fVar.f41333q0.size();
        for (int i = 0; i < size; i++) {
            C5130e c5130e = (C5130e) fVar.f41333q0.get(i);
            int[] iArr = c5130e.f41311p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c5130e);
            }
        }
        fVar.f41335s0.f41765b = true;
    }

    public void x(String str, double d9, double d10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i = 0;
        while (true) {
            arrayList = (ArrayList) this.f38916u;
            int size = arrayList.size();
            arrayList2 = (ArrayList) this.f38917v;
            arrayList3 = (ArrayList) this.f38918w;
            if (i >= size) {
                break;
            }
            double doubleValue = ((Double) arrayList3.get(i)).doubleValue();
            double doubleValue2 = ((Double) arrayList2.get(i)).doubleValue();
            if (d9 < doubleValue || (doubleValue == d9 && d10 < doubleValue2)) {
                break;
            } else {
                i++;
            }
        }
        arrayList.add(i, str);
        arrayList3.add(i, Double.valueOf(d9));
        arrayList2.add(i, Double.valueOf(d10));
    }

    public g() {
        this.f38915n = 8;
        this.f38916u = new ArrayList();
        this.f38917v = new ArrayList();
        this.f38918w = new ArrayList();
    }

    public g(InterfaceC5063b interfaceC5063b, Object obj, u1.h hVar) {
        this.f38915n = 5;
        this.f38916u = interfaceC5063b;
        this.f38917v = obj;
        this.f38918w = hVar;
    }

    public g(S0.n nVar) {
        this.f38915n = 2;
        this.f38916u = nVar;
        this.f38917v = y8.b.b((z8.d) nVar.f2933w);
        z8.c cVar = (z8.c) nVar.f2934x;
        kotlin.jvm.internal.h.e(cVar, "<this>");
        this.f38918w = new y8.p(cVar);
    }

    public g(C4659e c4659e) {
        this.f38915n = 3;
        this.f38916u = c4659e;
        this.f38917v = new C3404j1(8);
        this.f38918w = new ArrayList();
    }

    public g(FirebaseMessagingService firebaseMessagingService, C4659e c4659e, ExecutorService executorService) {
        this.f38915n = 0;
        this.f38916u = executorService;
        this.f38917v = firebaseMessagingService;
        this.f38918w = c4659e;
    }

    public g(Context context, TypedArray typedArray) {
        this.f38915n = 1;
        this.f38916u = context;
        this.f38917v = typedArray;
    }

    public g(w.f fVar) {
        this.f38915n = 9;
        this.f38916u = new ArrayList();
        this.f38917v = new C5163b();
        this.f38918w = fVar;
    }

    public g(w1.k kVar, L1.f fVar, w1.o oVar) {
        this.f38915n = 7;
        this.f38918w = kVar;
        this.f38917v = fVar;
        this.f38916u = oVar;
    }
}
