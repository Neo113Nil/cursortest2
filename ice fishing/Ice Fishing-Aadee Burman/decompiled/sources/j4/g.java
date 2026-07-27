package j4;

import D.C0299s;
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
import com.google.android.gms.internal.ads.C3381j1;
import com.google.firebase.messaging.FirebaseMessagingService;
import g1.C4522b;
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
import l.C4648e;
import m.C4710s;
import m.Q;
import org.json.JSONArray;
import org.json.JSONException;
import s1.InterfaceC4967b;
import t0.AbstractC5003S;
import w.C5139d;
import w.C5140e;
import x.C5164b;

/* loaded from: classes2.dex */
public final class g implements y8.w {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f38403n;

    /* renamed from: u, reason: collision with root package name */
    public Object f38404u;

    /* renamed from: v, reason: collision with root package name */
    public Object f38405v;

    /* renamed from: w, reason: collision with root package name */
    public Object f38406w;

    public /* synthetic */ g(int i) {
        this.f38403n = i;
    }

    public static g r(Context context, AttributeSet attributeSet, int[] iArr) {
        return new g(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static g s(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new g(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public void a(View view, int i, boolean z3) {
        RecyclerView recyclerView = (RecyclerView) ((C4648e) this.f38404u).f38761u;
        int childCount = i < 0 ? recyclerView.getChildCount() : l(i);
        ((C3381j1) this.f38405v).f(childCount, z3);
        if (z3) {
            p(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.I(view);
    }

    public void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z3) {
        RecyclerView recyclerView = (RecyclerView) ((C4648e) this.f38404u).f38761u;
        int childCount = i < 0 ? recyclerView.getChildCount() : l(i);
        ((C3381j1) this.f38405v).f(childCount, z3);
        if (z3) {
            p(view);
        }
        AbstractC5003S I8 = RecyclerView.I(view);
        if (I8 != null) {
            if (!I8.j() && !I8.o()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + I8 + recyclerView.y());
            }
            I8.f40598j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void c(int i) {
        AbstractC5003S I8;
        int l9 = l(i);
        ((C3381j1) this.f38405v).n(l9);
        RecyclerView recyclerView = (RecyclerView) ((C4648e) this.f38404u).f38761u;
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
        return (y8.r) this.f38405v;
    }

    @Override // y8.w
    public y8.v e() {
        return (y8.p) this.f38406w;
    }

    public View f(int i) {
        return ((RecyclerView) ((C4648e) this.f38404u).f38761u).getChildAt(l(i));
    }

    public int g() {
        return ((RecyclerView) ((C4648e) this.f38404u).f38761u).getChildCount() - ((ArrayList) this.f38406w).size();
    }

    public ColorStateList h(int i) {
        int resourceId;
        ColorStateList c9;
        TypedArray typedArray = (TypedArray) this.f38405v;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (c9 = E.e.c((Context) this.f38404u, resourceId)) == null) ? typedArray.getColorStateList(i) : c9;
    }

    public Drawable i(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f38405v;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : com.bumptech.glide.g.e((Context) this.f38404u, resourceId);
    }

    public Drawable j(int i) {
        int resourceId;
        Drawable d2;
        if (!((TypedArray) this.f38405v).hasValue(i) || (resourceId = ((TypedArray) this.f38405v).getResourceId(i, 0)) == 0) {
            return null;
        }
        C4710s a9 = C4710s.a();
        Context context = (Context) this.f38404u;
        synchronized (a9) {
            d2 = a9.f39223a.d(context, resourceId, true);
        }
        return d2;
    }

    public Typeface k(int i, int i6, Q q8) {
        int resourceId = ((TypedArray) this.f38405v).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f38406w) == null) {
            this.f38406w = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f38406w;
        ThreadLocal threadLocal = F.q.f879a;
        Context context = (Context) this.f38404u;
        if (context.isRestricted()) {
            return null;
        }
        return F.q.b(context, resourceId, typedValue, i6, q8, true, false);
    }

    public int l(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((C4648e) this.f38404u).f38761u).getChildCount();
        int i6 = i;
        while (i6 < childCount) {
            C3381j1 c3381j1 = (C3381j1) this.f38405v;
            int c9 = i - (i6 - c3381j1.c(i6));
            if (c9 == 0) {
                while (c3381j1.e(i6)) {
                    i6++;
                }
                return i6;
            }
            i6 += c9;
        }
        return -1;
    }

    public View m(int i) {
        return ((RecyclerView) ((C4648e) this.f38404u).f38761u).getChildAt(i);
    }

    public int n() {
        return ((RecyclerView) ((C4648e) this.f38404u).f38761u).getChildCount();
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
        C4522b c4522b;
        Bundle bundle;
        NotificationChannel notificationChannel;
        String string;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        String packageName;
        PackageManager packageManager;
        String I8;
        String I9;
        String J;
        int i;
        int i6;
        int i9;
        String J2;
        Uri defaultUri;
        String J8;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        String J9;
        Integer valueOf;
        String J10;
        Integer G7;
        Integer G8;
        Integer G9;
        String J11;
        Long valueOf2;
        JSONArray H8;
        long[] jArr;
        JSONArray H9;
        int[] iArr;
        String J12;
        IconCompat iconCompat;
        boolean z3;
        int i10;
        ApplicationInfo applicationInfo;
        if (((C4522b) this.f38406w).E("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.f38405v;
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
        String J13 = ((C4522b) this.f38406w).J("gcm.n.image");
        if (!TextUtils.isEmpty(J13)) {
            try {
                mVar = new m(new URL(J13));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + J13);
            }
            if (mVar != null) {
                ExecutorService executorService = (ExecutorService) this.f38404u;
                j3.h hVar = new j3.h();
                mVar.f38424u = executorService.submit(new F.n(20, mVar, hVar));
                mVar.f38425v = hVar.f38358a;
            }
            firebaseMessagingService = (FirebaseMessagingService) this.f38405v;
            c4522b = (C4522b) this.f38406w;
            AtomicInteger atomicInteger = e.f38401a;
            applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
            bundle = Bundle.EMPTY;
            Bundle bundle2 = bundle;
            String J14 = c4522b.J("gcm.n.android_channel_id");
            if (Build.VERSION.SDK_INT >= 26) {
                if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                    NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                    if (!TextUtils.isEmpty(J14)) {
                        notificationChannel3 = notificationManager.getNotificationChannel(J14);
                        if (notificationChannel3 == null) {
                            Log.w("FirebaseMessaging", "Notification Channel requested (" + J14 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                        }
                        packageName = firebaseMessagingService.getPackageName();
                        Resources resources = firebaseMessagingService.getResources();
                        packageManager = firebaseMessagingService.getPackageManager();
                        D.v vVar = new D.v(firebaseMessagingService, J14);
                        I8 = c4522b.I(resources, packageName, "gcm.n.title");
                        if (!TextUtils.isEmpty(I8)) {
                            vVar.f498e = D.v.b(I8);
                        }
                        I9 = c4522b.I(resources, packageName, "gcm.n.body");
                        if (!TextUtils.isEmpty(I9)) {
                            vVar.f499f = D.v.b(I9);
                            D.t tVar = new D.t(0);
                            tVar.f493f = D.v.b(I9);
                            vVar.g(tVar);
                        }
                        J = c4522b.J("gcm.n.icon");
                        if (TextUtils.isEmpty(J)) {
                            i = 1;
                        } else {
                            i9 = resources.getIdentifier(J, com.anythink.expressad.foundation.h.k.f19632c, packageName);
                            if ((i9 != 0 && e.a(resources, i9)) || ((i9 = resources.getIdentifier(J, "mipmap", packageName)) != 0 && e.a(resources, i9))) {
                                i = 1;
                                vVar.f514v.icon = i9;
                                J2 = c4522b.J("gcm.n.sound2");
                                if (TextUtils.isEmpty(J2)) {
                                    J2 = c4522b.J("gcm.n.sound");
                                }
                                if (!TextUtils.isEmpty(J2)) {
                                    defaultUri = null;
                                } else if (com.anythink.core.express.b.a.f17530f.equals(J2) || resources.getIdentifier(J2, "raw", packageName) == 0) {
                                    defaultUri = RingtoneManager.getDefaultUri(2);
                                } else {
                                    defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + J2);
                                }
                                if (defaultUri != null) {
                                    vVar.f(defaultUri);
                                }
                                J8 = c4522b.J("gcm.n.click_action");
                                if (TextUtils.isEmpty(J8)) {
                                    launchIntentForPackage = new Intent(J8);
                                    launchIntentForPackage.setPackage(packageName);
                                    launchIntentForPackage.setFlags(268435456);
                                } else {
                                    String J15 = c4522b.J("gcm.n.link_android");
                                    if (TextUtils.isEmpty(J15)) {
                                        J15 = c4522b.J("gcm.n.link");
                                    }
                                    Uri parse = !TextUtils.isEmpty(J15) ? Uri.parse(J15) : null;
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
                                AtomicInteger atomicInteger2 = e.f38401a;
                                if (launchIntentForPackage != null) {
                                    activity = null;
                                } else {
                                    launchIntentForPackage.addFlags(67108864);
                                    Bundle bundle3 = (Bundle) c4522b.f37625u;
                                    Bundle bundle4 = new Bundle(bundle3);
                                    for (String str : bundle3.keySet()) {
                                        if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                                            bundle4.remove(str);
                                        }
                                    }
                                    launchIntentForPackage.putExtras(bundle4);
                                    if (c4522b.E("google.c.a.e")) {
                                        launchIntentForPackage.putExtra("gcm.n.analytics_data", c4522b.R());
                                    }
                                    activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
                                }
                                vVar.f500g = activity;
                                broadcast = c4522b.E("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(c4522b.R())), 1140850688);
                                if (broadcast != null) {
                                    vVar.f514v.deleteIntent = broadcast;
                                }
                                J9 = c4522b.J("gcm.n.color");
                                if (!TextUtils.isEmpty(J9)) {
                                    try {
                                        valueOf = Integer.valueOf(Color.parseColor(J9));
                                    } catch (IllegalArgumentException unused2) {
                                        Log.w("FirebaseMessaging", "Color is invalid: " + J9 + ". Notification will use default color.");
                                    }
                                    if (valueOf != null) {
                                        vVar.f509q = valueOf.intValue();
                                    }
                                    vVar.d(16, !c4522b.E("gcm.n.sticky"));
                                    vVar.f507o = c4522b.E("gcm.n.local_only");
                                    J10 = c4522b.J("gcm.n.ticker");
                                    if (J10 != null) {
                                        vVar.f514v.tickerText = D.v.b(J10);
                                    }
                                    G7 = c4522b.G("gcm.n.notification_priority");
                                    if (G7 != null) {
                                        if (G7.intValue() < -2 || G7.intValue() > 2) {
                                            Log.w("FirebaseMessaging", "notificationPriority is invalid " + G7 + ". Skipping setting notificationPriority.");
                                        }
                                        if (G7 != null) {
                                            vVar.f502j = G7.intValue();
                                        }
                                        G8 = c4522b.G("gcm.n.visibility");
                                        if (G8 != null) {
                                            if (G8.intValue() < -1 || G8.intValue() > i) {
                                                Log.w("NotificationParams", "visibility is invalid: " + G8 + ". Skipping setting visibility.");
                                            }
                                            if (G8 != null) {
                                                vVar.f510r = G8.intValue();
                                            }
                                            G9 = c4522b.G("gcm.n.notification_count");
                                            if (G9 != null) {
                                                if (G9.intValue() < 0) {
                                                    Log.w("FirebaseMessaging", "notificationCount is invalid: " + G9 + ". Skipping setting notificationCount.");
                                                }
                                                if (G9 != null) {
                                                    vVar.i = G9.intValue();
                                                }
                                                J11 = c4522b.J("gcm.n.event_time");
                                                if (!TextUtils.isEmpty(J11)) {
                                                    try {
                                                        valueOf2 = Long.valueOf(Long.parseLong(J11));
                                                    } catch (NumberFormatException unused3) {
                                                        Log.w("NotificationParams", "Couldn't parse value of " + C4522b.U("gcm.n.event_time") + "(" + J11 + ") into a long");
                                                    }
                                                    if (valueOf2 != null) {
                                                        vVar.f503k = true;
                                                        vVar.f514v.when = valueOf2.longValue();
                                                    }
                                                    H8 = c4522b.H("gcm.n.vibrate_timings");
                                                    if (H8 != null) {
                                                        try {
                                                        } catch (NumberFormatException | JSONException unused4) {
                                                            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + H8 + ". Skipping setting vibrateTimings.");
                                                        }
                                                        if (H8.length() <= 1) {
                                                            throw new JSONException("vibrateTimings have invalid length");
                                                        }
                                                        int length = H8.length();
                                                        jArr = new long[length];
                                                        for (int i11 = 0; i11 < length; i11++) {
                                                            jArr[i11] = H8.optLong(i11);
                                                        }
                                                        if (jArr != null) {
                                                            vVar.f514v.vibrate = jArr;
                                                        }
                                                        H9 = c4522b.H("gcm.n.light_settings");
                                                        if (H9 != null) {
                                                            iArr = new int[3];
                                                            try {
                                                            } catch (IllegalArgumentException e9) {
                                                                Log.w("NotificationParams", "LightSettings is invalid: " + H9 + ". " + e9.getMessage() + ". Skipping setting LightSettings");
                                                            } catch (JSONException unused5) {
                                                                Log.w("NotificationParams", "LightSettings is invalid: " + H9 + ". Skipping setting LightSettings");
                                                            }
                                                            if (H9.length() != 3) {
                                                                throw new JSONException("lightSettings don't have all three fields");
                                                            }
                                                            int parseColor = Color.parseColor(H9.optString(0));
                                                            if (parseColor == -16777216) {
                                                                throw new IllegalArgumentException("Transparent color is invalid");
                                                            }
                                                            iArr[0] = parseColor;
                                                            iArr[1] = H9.optInt(1);
                                                            iArr[2] = H9.optInt(2);
                                                            if (iArr != null) {
                                                                int i12 = iArr[0];
                                                                int i13 = iArr[1];
                                                                int i14 = iArr[2];
                                                                Notification notification = vVar.f514v;
                                                                notification.ledARGB = i12;
                                                                notification.ledOnMS = i13;
                                                                notification.ledOffMS = i14;
                                                                notification.flags = ((i13 == 0 || i14 == 0) ? 0 : 1) | ((-2) & notification.flags);
                                                            }
                                                            boolean E8 = c4522b.E("gcm.n.default_sound");
                                                            boolean z6 = E8;
                                                            if (c4522b.E("gcm.n.default_vibrate_timings")) {
                                                                z6 = (E8 ? 1 : 0) | 2;
                                                            }
                                                            int i15 = z6;
                                                            if (c4522b.E("gcm.n.default_light_settings")) {
                                                                i15 = (z6 ? 1 : 0) | 4;
                                                            }
                                                            vVar.c(i15);
                                                            J12 = c4522b.J("gcm.n.tag");
                                                            if (TextUtils.isEmpty(J12)) {
                                                                J12 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                                            }
                                                            String str2 = J12;
                                                            if (mVar != null) {
                                                                try {
                                                                    j3.m mVar2 = mVar.f38425v;
                                                                    P2.w.h(mVar2);
                                                                    TimeUnit timeUnit = TimeUnit.SECONDS;
                                                                    Bitmap bitmap = (Bitmap) S0.f.c(mVar2, 5L);
                                                                    vVar.e(bitmap);
                                                                    C0299s c0299s = new C0299s();
                                                                    if (bitmap == null) {
                                                                        iconCompat = null;
                                                                        z3 = true;
                                                                    } else {
                                                                        z3 = true;
                                                                        iconCompat = new IconCompat(1);
                                                                        iconCompat.f4690b = bitmap;
                                                                    }
                                                                    c0299s.f489e = iconCompat;
                                                                    c0299s.f490f = null;
                                                                    c0299s.f491g = z3;
                                                                    vVar.g(c0299s);
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
                                                            ((NotificationManager) ((FirebaseMessagingService) this.f38405v).getSystemService("notification")).notify(str2, 0, vVar.a());
                                                            return true;
                                                        }
                                                        iArr = null;
                                                        if (iArr != null) {
                                                        }
                                                        boolean E82 = c4522b.E("gcm.n.default_sound");
                                                        boolean z62 = E82;
                                                        if (c4522b.E("gcm.n.default_vibrate_timings")) {
                                                        }
                                                        int i152 = z62;
                                                        if (c4522b.E("gcm.n.default_light_settings")) {
                                                        }
                                                        vVar.c(i152);
                                                        J12 = c4522b.J("gcm.n.tag");
                                                        if (TextUtils.isEmpty(J12)) {
                                                        }
                                                        String str22 = J12;
                                                        if (mVar != null) {
                                                        }
                                                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                        }
                                                        ((NotificationManager) ((FirebaseMessagingService) this.f38405v).getSystemService("notification")).notify(str22, 0, vVar.a());
                                                        return true;
                                                    }
                                                    jArr = null;
                                                    if (jArr != null) {
                                                    }
                                                    H9 = c4522b.H("gcm.n.light_settings");
                                                    if (H9 != null) {
                                                    }
                                                    iArr = null;
                                                    if (iArr != null) {
                                                    }
                                                    boolean E822 = c4522b.E("gcm.n.default_sound");
                                                    boolean z622 = E822;
                                                    if (c4522b.E("gcm.n.default_vibrate_timings")) {
                                                    }
                                                    int i1522 = z622;
                                                    if (c4522b.E("gcm.n.default_light_settings")) {
                                                    }
                                                    vVar.c(i1522);
                                                    J12 = c4522b.J("gcm.n.tag");
                                                    if (TextUtils.isEmpty(J12)) {
                                                    }
                                                    String str222 = J12;
                                                    if (mVar != null) {
                                                    }
                                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                    }
                                                    ((NotificationManager) ((FirebaseMessagingService) this.f38405v).getSystemService("notification")).notify(str222, 0, vVar.a());
                                                    return true;
                                                }
                                                valueOf2 = null;
                                                if (valueOf2 != null) {
                                                }
                                                H8 = c4522b.H("gcm.n.vibrate_timings");
                                                if (H8 != null) {
                                                }
                                                jArr = null;
                                                if (jArr != null) {
                                                }
                                                H9 = c4522b.H("gcm.n.light_settings");
                                                if (H9 != null) {
                                                }
                                                iArr = null;
                                                if (iArr != null) {
                                                }
                                                boolean E8222 = c4522b.E("gcm.n.default_sound");
                                                boolean z6222 = E8222;
                                                if (c4522b.E("gcm.n.default_vibrate_timings")) {
                                                }
                                                int i15222 = z6222;
                                                if (c4522b.E("gcm.n.default_light_settings")) {
                                                }
                                                vVar.c(i15222);
                                                J12 = c4522b.J("gcm.n.tag");
                                                if (TextUtils.isEmpty(J12)) {
                                                }
                                                String str2222 = J12;
                                                if (mVar != null) {
                                                }
                                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                }
                                                ((NotificationManager) ((FirebaseMessagingService) this.f38405v).getSystemService("notification")).notify(str2222, 0, vVar.a());
                                                return true;
                                            }
                                            G9 = null;
                                            if (G9 != null) {
                                            }
                                            J11 = c4522b.J("gcm.n.event_time");
                                            if (!TextUtils.isEmpty(J11)) {
                                            }
                                            valueOf2 = null;
                                            if (valueOf2 != null) {
                                            }
                                            H8 = c4522b.H("gcm.n.vibrate_timings");
                                            if (H8 != null) {
                                            }
                                            jArr = null;
                                            if (jArr != null) {
                                            }
                                            H9 = c4522b.H("gcm.n.light_settings");
                                            if (H9 != null) {
                                            }
                                            iArr = null;
                                            if (iArr != null) {
                                            }
                                            boolean E82222 = c4522b.E("gcm.n.default_sound");
                                            boolean z62222 = E82222;
                                            if (c4522b.E("gcm.n.default_vibrate_timings")) {
                                            }
                                            int i152222 = z62222;
                                            if (c4522b.E("gcm.n.default_light_settings")) {
                                            }
                                            vVar.c(i152222);
                                            J12 = c4522b.J("gcm.n.tag");
                                            if (TextUtils.isEmpty(J12)) {
                                            }
                                            String str22222 = J12;
                                            if (mVar != null) {
                                            }
                                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                            }
                                            ((NotificationManager) ((FirebaseMessagingService) this.f38405v).getSystemService("notification")).notify(str22222, 0, vVar.a());
                                            return true;
                                        }
                                        G8 = null;
                                        if (G8 != null) {
                                        }
                                        G9 = c4522b.G("gcm.n.notification_count");
                                        if (G9 != null) {
                                        }
                                        G9 = null;
                                        if (G9 != null) {
                                        }
                                        J11 = c4522b.J("gcm.n.event_time");
                                        if (!TextUtils.isEmpty(J11)) {
                                        }
                                        valueOf2 = null;
                                        if (valueOf2 != null) {
                                        }
                                        H8 = c4522b.H("gcm.n.vibrate_timings");
                                        if (H8 != null) {
                                        }
                                        jArr = null;
                                        if (jArr != null) {
                                        }
                                        H9 = c4522b.H("gcm.n.light_settings");
                                        if (H9 != null) {
                                        }
                                        iArr = null;
                                        if (iArr != null) {
                                        }
                                        boolean E822222 = c4522b.E("gcm.n.default_sound");
                                        boolean z622222 = E822222;
                                        if (c4522b.E("gcm.n.default_vibrate_timings")) {
                                        }
                                        int i1522222 = z622222;
                                        if (c4522b.E("gcm.n.default_light_settings")) {
                                        }
                                        vVar.c(i1522222);
                                        J12 = c4522b.J("gcm.n.tag");
                                        if (TextUtils.isEmpty(J12)) {
                                        }
                                        String str222222 = J12;
                                        if (mVar != null) {
                                        }
                                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                                        }
                                        ((NotificationManager) ((FirebaseMessagingService) this.f38405v).getSystemService("notification")).notify(str222222, 0, vVar.a());
                                        return true;
                                    }
                                    G7 = null;
                                    if (G7 != null) {
                                    }
                                    G8 = c4522b.G("gcm.n.visibility");
                                    if (G8 != null) {
                                    }
                                    G8 = null;
                                    if (G8 != null) {
                                    }
                                    G9 = c4522b.G("gcm.n.notification_count");
                                    if (G9 != null) {
                                    }
                                    G9 = null;
                                    if (G9 != null) {
                                    }
                                    J11 = c4522b.J("gcm.n.event_time");
                                    if (!TextUtils.isEmpty(J11)) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                    }
                                    H8 = c4522b.H("gcm.n.vibrate_timings");
                                    if (H8 != null) {
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    H9 = c4522b.H("gcm.n.light_settings");
                                    if (H9 != null) {
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    boolean E8222222 = c4522b.E("gcm.n.default_sound");
                                    boolean z6222222 = E8222222;
                                    if (c4522b.E("gcm.n.default_vibrate_timings")) {
                                    }
                                    int i15222222 = z6222222;
                                    if (c4522b.E("gcm.n.default_light_settings")) {
                                    }
                                    vVar.c(i15222222);
                                    J12 = c4522b.J("gcm.n.tag");
                                    if (TextUtils.isEmpty(J12)) {
                                    }
                                    String str2222222 = J12;
                                    if (mVar != null) {
                                    }
                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    }
                                    ((NotificationManager) ((FirebaseMessagingService) this.f38405v).getSystemService("notification")).notify(str2222222, 0, vVar.a());
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
                                    vVar.d(16, !c4522b.E("gcm.n.sticky"));
                                    vVar.f507o = c4522b.E("gcm.n.local_only");
                                    J10 = c4522b.J("gcm.n.ticker");
                                    if (J10 != null) {
                                    }
                                    G7 = c4522b.G("gcm.n.notification_priority");
                                    if (G7 != null) {
                                    }
                                    G7 = null;
                                    if (G7 != null) {
                                    }
                                    G8 = c4522b.G("gcm.n.visibility");
                                    if (G8 != null) {
                                    }
                                    G8 = null;
                                    if (G8 != null) {
                                    }
                                    G9 = c4522b.G("gcm.n.notification_count");
                                    if (G9 != null) {
                                    }
                                    G9 = null;
                                    if (G9 != null) {
                                    }
                                    J11 = c4522b.J("gcm.n.event_time");
                                    if (!TextUtils.isEmpty(J11)) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                    }
                                    H8 = c4522b.H("gcm.n.vibrate_timings");
                                    if (H8 != null) {
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    H9 = c4522b.H("gcm.n.light_settings");
                                    if (H9 != null) {
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    boolean E82222222 = c4522b.E("gcm.n.default_sound");
                                    boolean z62222222 = E82222222;
                                    if (c4522b.E("gcm.n.default_vibrate_timings")) {
                                    }
                                    int i152222222 = z62222222;
                                    if (c4522b.E("gcm.n.default_light_settings")) {
                                    }
                                    vVar.c(i152222222);
                                    J12 = c4522b.J("gcm.n.tag");
                                    if (TextUtils.isEmpty(J12)) {
                                    }
                                    String str22222222 = J12;
                                    if (mVar != null) {
                                    }
                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    }
                                    ((NotificationManager) ((FirebaseMessagingService) this.f38405v).getSystemService("notification")).notify(str22222222, 0, vVar.a());
                                    return true;
                                }
                                valueOf = null;
                                if (valueOf != null) {
                                }
                                vVar.d(16, !c4522b.E("gcm.n.sticky"));
                                vVar.f507o = c4522b.E("gcm.n.local_only");
                                J10 = c4522b.J("gcm.n.ticker");
                                if (J10 != null) {
                                }
                                G7 = c4522b.G("gcm.n.notification_priority");
                                if (G7 != null) {
                                }
                                G7 = null;
                                if (G7 != null) {
                                }
                                G8 = c4522b.G("gcm.n.visibility");
                                if (G8 != null) {
                                }
                                G8 = null;
                                if (G8 != null) {
                                }
                                G9 = c4522b.G("gcm.n.notification_count");
                                if (G9 != null) {
                                }
                                G9 = null;
                                if (G9 != null) {
                                }
                                J11 = c4522b.J("gcm.n.event_time");
                                if (!TextUtils.isEmpty(J11)) {
                                }
                                valueOf2 = null;
                                if (valueOf2 != null) {
                                }
                                H8 = c4522b.H("gcm.n.vibrate_timings");
                                if (H8 != null) {
                                }
                                jArr = null;
                                if (jArr != null) {
                                }
                                H9 = c4522b.H("gcm.n.light_settings");
                                if (H9 != null) {
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                                boolean E822222222 = c4522b.E("gcm.n.default_sound");
                                boolean z622222222 = E822222222;
                                if (c4522b.E("gcm.n.default_vibrate_timings")) {
                                }
                                int i1522222222 = z622222222;
                                if (c4522b.E("gcm.n.default_light_settings")) {
                                }
                                vVar.c(i1522222222);
                                J12 = c4522b.J("gcm.n.tag");
                                if (TextUtils.isEmpty(J12)) {
                                }
                                String str222222222 = J12;
                                if (mVar != null) {
                                }
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                }
                                ((NotificationManager) ((FirebaseMessagingService) this.f38405v).getSystemService("notification")).notify(str222222222, 0, vVar.a());
                                return true;
                            }
                            i = 1;
                            Log.w("FirebaseMessaging", "Icon resource " + J + " not found. Notification will use default icon.");
                        }
                        i6 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                        if (i6 != 0 || !e.a(resources, i6)) {
                            i6 = packageManager.getApplicationInfo(packageName, 0).icon;
                        }
                        i9 = (i6 == 0 && e.a(resources, i6)) ? i6 : 17301651;
                        vVar.f514v.icon = i9;
                        J2 = c4522b.J("gcm.n.sound2");
                        if (TextUtils.isEmpty(J2)) {
                        }
                        if (!TextUtils.isEmpty(J2)) {
                        }
                        if (defaultUri != null) {
                        }
                        J8 = c4522b.J("gcm.n.click_action");
                        if (TextUtils.isEmpty(J8)) {
                        }
                        AtomicInteger atomicInteger22 = e.f38401a;
                        if (launchIntentForPackage != null) {
                        }
                        vVar.f500g = activity;
                        if (c4522b.E("google.c.a.e")) {
                        }
                        if (broadcast != null) {
                        }
                        J9 = c4522b.J("gcm.n.color");
                        if (!TextUtils.isEmpty(J9)) {
                        }
                        i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i10 != 0) {
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        vVar.d(16, !c4522b.E("gcm.n.sticky"));
                        vVar.f507o = c4522b.E("gcm.n.local_only");
                        J10 = c4522b.J("gcm.n.ticker");
                        if (J10 != null) {
                        }
                        G7 = c4522b.G("gcm.n.notification_priority");
                        if (G7 != null) {
                        }
                        G7 = null;
                        if (G7 != null) {
                        }
                        G8 = c4522b.G("gcm.n.visibility");
                        if (G8 != null) {
                        }
                        G8 = null;
                        if (G8 != null) {
                        }
                        G9 = c4522b.G("gcm.n.notification_count");
                        if (G9 != null) {
                        }
                        G9 = null;
                        if (G9 != null) {
                        }
                        J11 = c4522b.J("gcm.n.event_time");
                        if (!TextUtils.isEmpty(J11)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        H8 = c4522b.H("gcm.n.vibrate_timings");
                        if (H8 != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        H9 = c4522b.H("gcm.n.light_settings");
                        if (H9 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean E8222222222 = c4522b.E("gcm.n.default_sound");
                        boolean z6222222222 = E8222222222;
                        if (c4522b.E("gcm.n.default_vibrate_timings")) {
                        }
                        int i15222222222 = z6222222222;
                        if (c4522b.E("gcm.n.default_light_settings")) {
                        }
                        vVar.c(i15222222222);
                        J12 = c4522b.J("gcm.n.tag");
                        if (TextUtils.isEmpty(J12)) {
                        }
                        String str2222222222 = J12;
                        if (mVar != null) {
                        }
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                        }
                        ((NotificationManager) ((FirebaseMessagingService) this.f38405v).getSystemService("notification")).notify(str2222222222, 0, vVar.a());
                        return true;
                    }
                    J14 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(J14)) {
                        notificationChannel2 = notificationManager.getNotificationChannel(J14);
                        if (notificationChannel2 == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        packageName = firebaseMessagingService.getPackageName();
                        Resources resources2 = firebaseMessagingService.getResources();
                        packageManager = firebaseMessagingService.getPackageManager();
                        D.v vVar2 = new D.v(firebaseMessagingService, J14);
                        I8 = c4522b.I(resources2, packageName, "gcm.n.title");
                        if (!TextUtils.isEmpty(I8)) {
                        }
                        I9 = c4522b.I(resources2, packageName, "gcm.n.body");
                        if (!TextUtils.isEmpty(I9)) {
                        }
                        J = c4522b.J("gcm.n.icon");
                        if (TextUtils.isEmpty(J)) {
                        }
                        i6 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                        if (i6 != 0) {
                        }
                        i6 = packageManager.getApplicationInfo(packageName, 0).icon;
                        if (i6 == 0) {
                        }
                        vVar2.f514v.icon = i9;
                        J2 = c4522b.J("gcm.n.sound2");
                        if (TextUtils.isEmpty(J2)) {
                        }
                        if (!TextUtils.isEmpty(J2)) {
                        }
                        if (defaultUri != null) {
                        }
                        J8 = c4522b.J("gcm.n.click_action");
                        if (TextUtils.isEmpty(J8)) {
                        }
                        AtomicInteger atomicInteger222 = e.f38401a;
                        if (launchIntentForPackage != null) {
                        }
                        vVar2.f500g = activity;
                        if (c4522b.E("google.c.a.e")) {
                        }
                        if (broadcast != null) {
                        }
                        J9 = c4522b.J("gcm.n.color");
                        if (!TextUtils.isEmpty(J9)) {
                        }
                        i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i10 != 0) {
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        vVar2.d(16, !c4522b.E("gcm.n.sticky"));
                        vVar2.f507o = c4522b.E("gcm.n.local_only");
                        J10 = c4522b.J("gcm.n.ticker");
                        if (J10 != null) {
                        }
                        G7 = c4522b.G("gcm.n.notification_priority");
                        if (G7 != null) {
                        }
                        G7 = null;
                        if (G7 != null) {
                        }
                        G8 = c4522b.G("gcm.n.visibility");
                        if (G8 != null) {
                        }
                        G8 = null;
                        if (G8 != null) {
                        }
                        G9 = c4522b.G("gcm.n.notification_count");
                        if (G9 != null) {
                        }
                        G9 = null;
                        if (G9 != null) {
                        }
                        J11 = c4522b.J("gcm.n.event_time");
                        if (!TextUtils.isEmpty(J11)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        H8 = c4522b.H("gcm.n.vibrate_timings");
                        if (H8 != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        H9 = c4522b.H("gcm.n.light_settings");
                        if (H9 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean E82222222222 = c4522b.E("gcm.n.default_sound");
                        boolean z62222222222 = E82222222222;
                        if (c4522b.E("gcm.n.default_vibrate_timings")) {
                        }
                        int i152222222222 = z62222222222;
                        if (c4522b.E("gcm.n.default_light_settings")) {
                        }
                        vVar2.c(i152222222222);
                        J12 = c4522b.J("gcm.n.tag");
                        if (TextUtils.isEmpty(J12)) {
                        }
                        String str22222222222 = J12;
                        if (mVar != null) {
                        }
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                        }
                        ((NotificationManager) ((FirebaseMessagingService) this.f38405v).getSystemService("notification")).notify(str22222222222, 0, vVar2.a());
                        return true;
                    }
                    Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    notificationChannel = notificationManager.getNotificationChannel("fcm_fallback_notification_channel");
                    if (notificationChannel == null) {
                        int identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", com.anythink.expressad.foundation.h.k.f19636g, firebaseMessagingService.getPackageName());
                        if (identifier == 0) {
                            Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = "Misc";
                        } else {
                            string = firebaseMessagingService.getString(identifier);
                        }
                        notificationManager.createNotificationChannel(com.anythink.core.common.n.b.A.g(string));
                    }
                    J14 = "fcm_fallback_notification_channel";
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources22 = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    D.v vVar22 = new D.v(firebaseMessagingService, J14);
                    I8 = c4522b.I(resources22, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(I8)) {
                    }
                    I9 = c4522b.I(resources22, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(I9)) {
                    }
                    J = c4522b.J("gcm.n.icon");
                    if (TextUtils.isEmpty(J)) {
                    }
                    i6 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i6 != 0) {
                    }
                    i6 = packageManager.getApplicationInfo(packageName, 0).icon;
                    if (i6 == 0) {
                    }
                    vVar22.f514v.icon = i9;
                    J2 = c4522b.J("gcm.n.sound2");
                    if (TextUtils.isEmpty(J2)) {
                    }
                    if (!TextUtils.isEmpty(J2)) {
                    }
                    if (defaultUri != null) {
                    }
                    J8 = c4522b.J("gcm.n.click_action");
                    if (TextUtils.isEmpty(J8)) {
                    }
                    AtomicInteger atomicInteger2222 = e.f38401a;
                    if (launchIntentForPackage != null) {
                    }
                    vVar22.f500g = activity;
                    if (c4522b.E("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    J9 = c4522b.J("gcm.n.color");
                    if (!TextUtils.isEmpty(J9)) {
                    }
                    i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i10 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    vVar22.d(16, !c4522b.E("gcm.n.sticky"));
                    vVar22.f507o = c4522b.E("gcm.n.local_only");
                    J10 = c4522b.J("gcm.n.ticker");
                    if (J10 != null) {
                    }
                    G7 = c4522b.G("gcm.n.notification_priority");
                    if (G7 != null) {
                    }
                    G7 = null;
                    if (G7 != null) {
                    }
                    G8 = c4522b.G("gcm.n.visibility");
                    if (G8 != null) {
                    }
                    G8 = null;
                    if (G8 != null) {
                    }
                    G9 = c4522b.G("gcm.n.notification_count");
                    if (G9 != null) {
                    }
                    G9 = null;
                    if (G9 != null) {
                    }
                    J11 = c4522b.J("gcm.n.event_time");
                    if (!TextUtils.isEmpty(J11)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    H8 = c4522b.H("gcm.n.vibrate_timings");
                    if (H8 != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    H9 = c4522b.H("gcm.n.light_settings");
                    if (H9 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean E822222222222 = c4522b.E("gcm.n.default_sound");
                    boolean z622222222222 = E822222222222;
                    if (c4522b.E("gcm.n.default_vibrate_timings")) {
                    }
                    int i1522222222222 = z622222222222;
                    if (c4522b.E("gcm.n.default_light_settings")) {
                    }
                    vVar22.c(i1522222222222);
                    J12 = c4522b.J("gcm.n.tag");
                    if (TextUtils.isEmpty(J12)) {
                    }
                    String str222222222222 = J12;
                    if (mVar != null) {
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                    }
                    ((NotificationManager) ((FirebaseMessagingService) this.f38405v).getSystemService("notification")).notify(str222222222222, 0, vVar22.a());
                    return true;
                }
            }
            J14 = null;
            packageName = firebaseMessagingService.getPackageName();
            Resources resources222 = firebaseMessagingService.getResources();
            packageManager = firebaseMessagingService.getPackageManager();
            D.v vVar222 = new D.v(firebaseMessagingService, J14);
            I8 = c4522b.I(resources222, packageName, "gcm.n.title");
            if (!TextUtils.isEmpty(I8)) {
            }
            I9 = c4522b.I(resources222, packageName, "gcm.n.body");
            if (!TextUtils.isEmpty(I9)) {
            }
            J = c4522b.J("gcm.n.icon");
            if (TextUtils.isEmpty(J)) {
            }
            i6 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i6 != 0) {
            }
            i6 = packageManager.getApplicationInfo(packageName, 0).icon;
            if (i6 == 0) {
            }
            vVar222.f514v.icon = i9;
            J2 = c4522b.J("gcm.n.sound2");
            if (TextUtils.isEmpty(J2)) {
            }
            if (!TextUtils.isEmpty(J2)) {
            }
            if (defaultUri != null) {
            }
            J8 = c4522b.J("gcm.n.click_action");
            if (TextUtils.isEmpty(J8)) {
            }
            AtomicInteger atomicInteger22222 = e.f38401a;
            if (launchIntentForPackage != null) {
            }
            vVar222.f500g = activity;
            if (c4522b.E("google.c.a.e")) {
            }
            if (broadcast != null) {
            }
            J9 = c4522b.J("gcm.n.color");
            if (!TextUtils.isEmpty(J9)) {
            }
            i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i10 != 0) {
            }
            valueOf = null;
            if (valueOf != null) {
            }
            vVar222.d(16, !c4522b.E("gcm.n.sticky"));
            vVar222.f507o = c4522b.E("gcm.n.local_only");
            J10 = c4522b.J("gcm.n.ticker");
            if (J10 != null) {
            }
            G7 = c4522b.G("gcm.n.notification_priority");
            if (G7 != null) {
            }
            G7 = null;
            if (G7 != null) {
            }
            G8 = c4522b.G("gcm.n.visibility");
            if (G8 != null) {
            }
            G8 = null;
            if (G8 != null) {
            }
            G9 = c4522b.G("gcm.n.notification_count");
            if (G9 != null) {
            }
            G9 = null;
            if (G9 != null) {
            }
            J11 = c4522b.J("gcm.n.event_time");
            if (!TextUtils.isEmpty(J11)) {
            }
            valueOf2 = null;
            if (valueOf2 != null) {
            }
            H8 = c4522b.H("gcm.n.vibrate_timings");
            if (H8 != null) {
            }
            jArr = null;
            if (jArr != null) {
            }
            H9 = c4522b.H("gcm.n.light_settings");
            if (H9 != null) {
            }
            iArr = null;
            if (iArr != null) {
            }
            boolean E8222222222222 = c4522b.E("gcm.n.default_sound");
            boolean z6222222222222 = E8222222222222;
            if (c4522b.E("gcm.n.default_vibrate_timings")) {
            }
            int i15222222222222 = z6222222222222;
            if (c4522b.E("gcm.n.default_light_settings")) {
            }
            vVar222.c(i15222222222222);
            J12 = c4522b.J("gcm.n.tag");
            if (TextUtils.isEmpty(J12)) {
            }
            String str2222222222222 = J12;
            if (mVar != null) {
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
            }
            ((NotificationManager) ((FirebaseMessagingService) this.f38405v).getSystemService("notification")).notify(str2222222222222, 0, vVar222.a());
            return true;
        }
        mVar = null;
        if (mVar != null) {
        }
        firebaseMessagingService = (FirebaseMessagingService) this.f38405v;
        c4522b = (C4522b) this.f38406w;
        AtomicInteger atomicInteger3 = e.f38401a;
        applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
        if (applicationInfo != null) {
        }
        bundle = Bundle.EMPTY;
        Bundle bundle22 = bundle;
        String J142 = c4522b.J("gcm.n.android_channel_id");
        if (Build.VERSION.SDK_INT >= 26) {
        }
        J142 = null;
        packageName = firebaseMessagingService.getPackageName();
        Resources resources2222 = firebaseMessagingService.getResources();
        packageManager = firebaseMessagingService.getPackageManager();
        D.v vVar2222 = new D.v(firebaseMessagingService, J142);
        I8 = c4522b.I(resources2222, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(I8)) {
        }
        I9 = c4522b.I(resources2222, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(I9)) {
        }
        J = c4522b.J("gcm.n.icon");
        if (TextUtils.isEmpty(J)) {
        }
        i6 = bundle22.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i6 != 0) {
        }
        i6 = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i6 == 0) {
        }
        vVar2222.f514v.icon = i9;
        J2 = c4522b.J("gcm.n.sound2");
        if (TextUtils.isEmpty(J2)) {
        }
        if (!TextUtils.isEmpty(J2)) {
        }
        if (defaultUri != null) {
        }
        J8 = c4522b.J("gcm.n.click_action");
        if (TextUtils.isEmpty(J8)) {
        }
        AtomicInteger atomicInteger222222 = e.f38401a;
        if (launchIntentForPackage != null) {
        }
        vVar2222.f500g = activity;
        if (c4522b.E("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        J9 = c4522b.J("gcm.n.color");
        if (!TextUtils.isEmpty(J9)) {
        }
        i10 = bundle22.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i10 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        vVar2222.d(16, !c4522b.E("gcm.n.sticky"));
        vVar2222.f507o = c4522b.E("gcm.n.local_only");
        J10 = c4522b.J("gcm.n.ticker");
        if (J10 != null) {
        }
        G7 = c4522b.G("gcm.n.notification_priority");
        if (G7 != null) {
        }
        G7 = null;
        if (G7 != null) {
        }
        G8 = c4522b.G("gcm.n.visibility");
        if (G8 != null) {
        }
        G8 = null;
        if (G8 != null) {
        }
        G9 = c4522b.G("gcm.n.notification_count");
        if (G9 != null) {
        }
        G9 = null;
        if (G9 != null) {
        }
        J11 = c4522b.J("gcm.n.event_time");
        if (!TextUtils.isEmpty(J11)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        H8 = c4522b.H("gcm.n.vibrate_timings");
        if (H8 != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        H9 = c4522b.H("gcm.n.light_settings");
        if (H9 != null) {
        }
        iArr = null;
        if (iArr != null) {
        }
        boolean E82222222222222 = c4522b.E("gcm.n.default_sound");
        boolean z62222222222222 = E82222222222222;
        if (c4522b.E("gcm.n.default_vibrate_timings")) {
        }
        int i152222222222222 = z62222222222222;
        if (c4522b.E("gcm.n.default_light_settings")) {
        }
        vVar2222.c(i152222222222222);
        J12 = c4522b.J("gcm.n.tag");
        if (TextUtils.isEmpty(J12)) {
        }
        String str22222222222222 = J12;
        if (mVar != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.f38405v).getSystemService("notification")).notify(str22222222222222, 0, vVar2222.a());
        return true;
    }

    public void p(View view) {
        ((ArrayList) this.f38406w).add(view);
        C4648e c4648e = (C4648e) this.f38404u;
        AbstractC5003S I8 = RecyclerView.I(view);
        if (I8 != null) {
            int i = I8.f40605q;
            View view2 = I8.f40590a;
            if (i != -1) {
                I8.f40604p = i;
            } else {
                WeakHashMap weakHashMap = X.f2054a;
                I8.f40604p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = (RecyclerView) c4648e.f38761u;
            if (recyclerView.L()) {
                I8.f40605q = 4;
                recyclerView.f5252V0.add(I8);
            } else {
                WeakHashMap weakHashMap2 = X.f2054a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public boolean q(int i, C5139d c5139d, z.f fVar) {
        int[] iArr = c5139d.f41529p0;
        int i6 = iArr[0];
        C5164b c5164b = (C5164b) this.f38405v;
        c5164b.f41695a = i6;
        c5164b.f41696b = iArr[1];
        c5164b.f41697c = c5139d.q();
        c5164b.f41698d = c5139d.k();
        c5164b.i = false;
        c5164b.f41703j = i;
        boolean z3 = c5164b.f41695a == 3;
        boolean z6 = c5164b.f41696b == 3;
        boolean z9 = z3 && c5139d.f41497W > 0.0f;
        boolean z10 = z6 && c5139d.f41497W > 0.0f;
        int[] iArr2 = c5139d.f41533t;
        if (z9 && iArr2[0] == 4) {
            c5164b.f41695a = 1;
        }
        if (z10 && iArr2[1] == 4) {
            c5164b.f41696b = 1;
        }
        fVar.b(c5139d, c5164b);
        c5139d.O(c5164b.f41699e);
        c5139d.L(c5164b.f41700f);
        c5139d.f41480E = c5164b.f41702h;
        c5139d.I(c5164b.f41701g);
        c5164b.f41703j = 0;
        return c5164b.i;
    }

    public void t() {
        ((TypedArray) this.f38405v).recycle();
    }

    public String toString() {
        switch (this.f38403n) {
            case 3:
                return ((C3381j1) this.f38405v).toString() + ", hidden list:" + ((ArrayList) this.f38406w).size();
            default:
                return super.toString();
        }
    }

    public void u(C5140e c5140e, int i, int i6, int i9) {
        c5140e.getClass();
        int i10 = c5140e.f41503b0;
        int i11 = c5140e.f41505c0;
        c5140e.f41503b0 = 0;
        c5140e.f41505c0 = 0;
        c5140e.O(i6);
        c5140e.L(i9);
        if (i10 < 0) {
            c5140e.f41503b0 = 0;
        } else {
            c5140e.f41503b0 = i10;
        }
        if (i11 < 0) {
            c5140e.f41505c0 = 0;
        } else {
            c5140e.f41505c0 = i11;
        }
        C5140e c5140e2 = (C5140e) this.f38406w;
        c5140e2.f41554t0 = i;
        c5140e2.U();
    }

    public void v(View view) {
        if (((ArrayList) this.f38406w).remove(view)) {
            C4648e c4648e = (C4648e) this.f38404u;
            AbstractC5003S I8 = RecyclerView.I(view);
            if (I8 != null) {
                int i = I8.f40604p;
                RecyclerView recyclerView = (RecyclerView) c4648e.f38761u;
                if (recyclerView.L()) {
                    I8.f40605q = i;
                    recyclerView.f5252V0.add(I8);
                } else {
                    WeakHashMap weakHashMap = X.f2054a;
                    I8.f40590a.setImportantForAccessibility(i);
                }
                I8.f40604p = 0;
            }
        }
    }

    public void w(C5140e c5140e) {
        ArrayList arrayList = (ArrayList) this.f38404u;
        arrayList.clear();
        int size = c5140e.f41551q0.size();
        for (int i = 0; i < size; i++) {
            C5139d c5139d = (C5139d) c5140e.f41551q0.get(i);
            int[] iArr = c5139d.f41529p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c5139d);
            }
        }
        c5140e.f41553s0.f41707b = true;
    }

    public void x(String str, double d2, double d9) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i = 0;
        while (true) {
            arrayList = (ArrayList) this.f38404u;
            int size = arrayList.size();
            arrayList2 = (ArrayList) this.f38405v;
            arrayList3 = (ArrayList) this.f38406w;
            if (i >= size) {
                break;
            }
            double doubleValue = ((Double) arrayList3.get(i)).doubleValue();
            double doubleValue2 = ((Double) arrayList2.get(i)).doubleValue();
            if (d2 < doubleValue || (doubleValue == d2 && d9 < doubleValue2)) {
                break;
            } else {
                i++;
            }
        }
        arrayList.add(i, str);
        arrayList3.add(i, Double.valueOf(d2));
        arrayList2.add(i, Double.valueOf(d9));
    }

    public g() {
        this.f38403n = 8;
        this.f38404u = new ArrayList();
        this.f38405v = new ArrayList();
        this.f38406w = new ArrayList();
    }

    public g(InterfaceC4967b interfaceC4967b, Object obj, s1.h hVar) {
        this.f38403n = 5;
        this.f38404u = interfaceC4967b;
        this.f38405v = obj;
        this.f38406w = hVar;
    }

    public g(S0.n nVar) {
        this.f38403n = 2;
        this.f38404u = nVar;
        this.f38405v = y8.b.b((z8.d) nVar.f2804w);
        z8.c cVar = (z8.c) nVar.f2805x;
        kotlin.jvm.internal.h.e(cVar, "<this>");
        this.f38406w = new y8.p(cVar);
    }

    public g(C4648e c4648e) {
        this.f38403n = 3;
        this.f38404u = c4648e;
        this.f38405v = new C3381j1(8);
        this.f38406w = new ArrayList();
    }

    public g(FirebaseMessagingService firebaseMessagingService, C4522b c4522b, ExecutorService executorService) {
        this.f38403n = 0;
        this.f38404u = executorService;
        this.f38405v = firebaseMessagingService;
        this.f38406w = c4522b;
    }

    public g(Context context, TypedArray typedArray) {
        this.f38403n = 1;
        this.f38404u = context;
        this.f38405v = typedArray;
    }

    public g(C5140e c5140e) {
        this.f38403n = 9;
        this.f38404u = new ArrayList();
        this.f38405v = new C5164b();
        this.f38406w = c5140e;
    }

    public g(u1.l lVar, J1.f fVar, u1.p pVar) {
        this.f38403n = 7;
        this.f38406w = lVar;
        this.f38405v = fVar;
        this.f38404u = pVar;
    }
}
