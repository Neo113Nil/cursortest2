package defpackage;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.database.SQLException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Path;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.c0;
import androidx.core.app.f0;
import androidx.core.graphics.drawable.IconCompat;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.firebase.messaging.FirebaseMessagingService;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginApi;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginMode;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginRequest;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class es6 implements x7o, hra, p7q, rct, yva, b9l, l0c, qce, qyd, w5g, ice {
    public Object a;
    public Object b;
    public Object c;

    public es6(int i) {
        switch (i) {
            case 5:
                this.a = gld.e(e.c(a4g.n(), dm6.b).plus(new im6("DefaultPlaybackEventsHandler")));
                x0q b = y0q.b(0, 16, null, 5);
                this.b = b;
                this.c = b;
                break;
            case 24:
                this.a = new v8a(0, nyd.a);
                this.b = new v8a(0, grb.A);
                new v8a(0, pyd.a);
                this.c = new v8a(0, oyd.a);
                break;
            default:
                this.a = new Object();
                break;
        }
    }

    public static tl7 K(cnh cnhVar) {
        zm7 zm7Var = new zm7();
        Uri uri = cnhVar.b;
        z0j z0jVar = new z0j(uri == null ? null : uri.toString(), cnhVar.f, zm7Var);
        cee ceeVar = cnhVar.c;
        hee heeVar = ceeVar.a;
        if (heeVar == null) {
            heeVar = ceeVar.b();
            ceeVar.a = heeVar;
        }
        xkt it = heeVar.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) z0jVar.e)) {
                ((HashMap) z0jVar.e).put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        UUID uuid = un3.a;
        klx klxVar = new klx(19);
        UUID uuid2 = cnhVar.a;
        kac kacVar = xvc.d;
        uuid2.getClass();
        boolean z = cnhVar.d;
        boolean z2 = cnhVar.e;
        int[] Y = zc4.Y(cnhVar.g);
        for (int i : Y) {
            boolean z3 = true;
            if (i != 2 && i != 1) {
                z3 = false;
            }
            vq1.v(z3);
        }
        tl7 tl7Var = new tl7(uuid2, kacVar, z0jVar, hashMap, z, (int[]) Y.clone(), z2, klxVar, 300000L);
        byte[] bArr = cnhVar.h;
        byte[] copyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        vq1.A(tl7Var.m.isEmpty());
        tl7Var.v = 0;
        tl7Var.w = copyOf;
        return tl7Var;
    }

    @Override // defpackage.b9l
    public Object A(long j, kdl kdlVar, iol iolVar) {
        Object L = L(new n8l(O(), j, kdlVar), iolVar);
        return L == nm6.a ? L : Unit.a;
    }

    @Override // defpackage.b9l
    public Object B(h4q h4qVar, lol lolVar) {
        Object L = L(new p8l(O(), h4qVar), lolVar);
        return L == nm6.a ? L : Unit.a;
    }

    @Override // defpackage.b9l
    public Object C(long j, mpl mplVar, w8l w8lVar) {
        Object L = L(new r8l(O(), j, mplVar), w8lVar);
        return L == nm6.a ? L : Unit.a;
    }

    @Override // defpackage.b9l
    public Object D(z11 z11Var) {
        Object L = L(new t8l(O()), z11Var);
        return L == nm6.a ? L : Unit.a;
    }

    @Override // defpackage.l0c
    public int F() {
        return ((ExtendedFloatingActionButton) this.c).y0;
    }

    @Override // defpackage.qce
    public void G(rce rceVar, bqr bqrVar) {
        x97.y((mm6) this.a, null, null, new i0d(bqrVar, (aqi) this.b, null, 0), 3);
        ((aqi) this.c).setValue(Boolean.TRUE);
    }

    @Override // defpackage.rct
    public void H(qas qasVar) {
        wl9 wl9Var = (wl9) this.a;
        wl9Var.b.a(new dl9((jl9) this.b, (e23) this.c, wl9Var, qasVar));
    }

    @Override // defpackage.ice
    public ImageHeaderParser$ImageType I() {
        List list = (List) this.c;
        non nonVar = (non) ((g8c) this.a).a;
        nonVar.reset();
        return lxe.t(list, nonVar, (z98) this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
    
        if (r15.a(r1) != r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (r15 == r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object J(Collection collection, String str, cvl cvlVar, oq oqVar, cg6 cg6Var) {
        qka qkaVar;
        int i;
        if (cg6Var instanceof qka) {
            qkaVar = (qka) cg6Var;
            int i2 = qkaVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qkaVar.l = i2 - Integer.MIN_VALUE;
                Object obj = qkaVar.j;
                Object obj2 = nm6.a;
                i = qkaVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    wka wkaVar = (wka) this.a;
                    String str2 = (str == null || !collection.contains(str)) ? null : str;
                    qkaVar.l = 1;
                    Object V = x97.V(dm6.b, new w5q(((yka) wkaVar).c, collection, str2, cvlVar, oqVar, null), qkaVar);
                    if (V != obj2) {
                        V = Unit.a;
                    }
                    if (V != obj2) {
                        V = Unit.a;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                e6q e6qVar = (e6q) this.b;
                qkaVar.l = 2;
            }
        }
        qkaVar = new qka(this, cg6Var);
        Object obj3 = qkaVar.j;
        Object obj22 = nm6.a;
        i = qkaVar.l;
        if (i != 0) {
        }
        e6q e6qVar2 = (e6q) this.b;
        qkaVar.l = 2;
    }

    public Object L(u8l u8lVar, Continuation continuation) {
        Object V = x97.V(l8j.c, new f98(this, u8lVar, (Continuation) null, 20), continuation);
        return V == nm6.a ? V : Unit.a;
    }

    public h4b M() {
        File filesDir = ((Context) this.a).getFilesDir();
        filesDir.getClass();
        return new h4b(new File(new File(filesDir, "experiments2"), "forced.txt"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x017b, code lost:
    
        if (((java.lang.System.currentTimeMillis() / 1000) - r0.getLong("timestamp")) >= r0.getLong("lifetime")) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x024b  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object N(String str, String str2) {
        sin sinVar;
        hdg hdgVar;
        hdg hdgVar2;
        JSONObject data;
        hdg hdgVar3;
        pir pirVar = (pir) ((vx6) this.a).d;
        dfb dfbVar = (dfb) this.b;
        String str3 = (String) this.c;
        pirVar.getClass();
        jyr jyrVar = pirVar.a;
        ii8 y = men.y(str2);
        ?? r7 = 39;
        if (y == null) {
            dfbVar.d(new RuntimeException(ouj.k('\'', "Failed to get stored value '", str), new IllegalArgumentException(ouj.k('\'', "Unknown scope '", str2))));
            hdgVar2 = null;
            hdgVar3 = null;
        } else {
            String concat = "stored_value_".concat(str);
            int ordinal = y.ordinal();
            int i = 1;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    b6e.s();
                    return null;
                }
                concat = "card_" + str3 + '_' + concat;
            }
            rin rinVar = (rin) jyrVar.getValue();
            List c = t75.c(concat);
            ConcurrentHashMap concurrentHashMap = rinVar.b;
            if (c.isEmpty()) {
                sinVar = sin.c;
            } else {
                List<String> list = c;
                LinkedHashSet z0 = CollectionsKt.z0(list);
                ArrayList arrayList = new ArrayList(c.size());
                for (String str4 : list) {
                    pin pinVar = (pin) concurrentHashMap.get(str4);
                    if (pinVar != null) {
                        arrayList.add(pinVar);
                        z0.remove(str4);
                    }
                }
                if (z0.isEmpty()) {
                    sinVar = new sin(arrayList, c5b.a);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    dn9 dn9Var = rinVar.a;
                    String str5 = "Read raw jsons with ids: " + z0;
                    ArrayList arrayList3 = new ArrayList();
                    List list2 = c5b.a;
                    try {
                        list2 = dn9Var.k(z0);
                    } catch (SQLException e) {
                        arrayList3.add(dn9.t(dn9Var, e, str5));
                    } catch (IllegalStateException e2) {
                        arrayList3.add(dn9.t(dn9Var, e2, str5));
                    }
                    List<pin> list3 = list2;
                    arrayList2.addAll(rin.a(arrayList3));
                    sin sinVar2 = new sin(list3, arrayList2);
                    for (pin pinVar2 : list3) {
                        concurrentHashMap.put(pinVar2.getId(), pinVar2);
                    }
                    sinVar = new sin(CollectionsKt.g0(sinVar2.a, arrayList), sinVar2.b);
                }
            }
            Iterator it = sinVar.b.iterator();
            while (it.hasNext()) {
                dfbVar.a((qin) it.next());
            }
            pin pinVar3 = (pin) CollectionsKt.firstOrNull(sinVar.a);
            if (pinVar3 == null || (data = pinVar3.getData()) == null) {
                hdgVar = null;
            } else {
                if (data.has("timestamp") && data.has("lifetime")) {
                }
                if (!data.has("expiration_time") || System.currentTimeMillis() < data.getLong("expiration_time")) {
                    try {
                        String string = data.getString("type");
                        int y2 = gdg.y(string);
                        try {
                            if (y2 == 0) {
                                hdgVar = null;
                                dfbVar.d(new oir("Stored value '" + str + "' declaration failed because of unknown type '" + string + '\'', null, 2));
                            } else {
                                hdgVar3 = null;
                                hdgVar2 = pir.a(data, str, y2);
                            }
                        } catch (JSONException e3) {
                            e = e3;
                            StringBuilder u = ouj.u("Stored value '", str, "' declaration failed: ");
                            u.append(e.getMessage());
                            dfbVar.d(new oir(u.toString(), e));
                            hdgVar = r7;
                            hdgVar2 = hdgVar;
                            hdgVar3 = hdgVar;
                            if (hdgVar2 == null) {
                            }
                        }
                    } catch (JSONException e4) {
                        e = e4;
                        r7 = 0;
                    }
                }
                rin rinVar2 = (rin) jyrVar.getValue();
                r23 r23Var = new r23(concat, 10);
                dn9 dn9Var2 = rinVar2.a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                uiq uiqVar = (uiq) dn9Var2.c;
                yhr[] yhrVarArr = {new zhr(i, new lj0(25, dn9Var2, r23Var, linkedHashSet))};
                uiqVar.getClass();
                uiqVar.A(1, (yhr[]) Arrays.copyOf(yhrVarArr, 1));
                rin.a(uiqVar.A(2, new zhr(0, linkedHashSet)).a);
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    rinVar2.b.remove((String) it2.next());
                }
                hdgVar2 = null;
                hdgVar3 = null;
            }
            hdgVar2 = hdgVar;
            hdgVar3 = hdgVar;
        }
        return hdgVar2 == null ? hdgVar2.Y() : hdgVar3;
    }

    public n7q O() {
        n7q n7qVar = (n7q) this.c;
        Object value = ((vdr) this.a).getValue();
        d6l d6lVar = value instanceof d6l ? (d6l) value : null;
        n7q n7qVar2 = d6lVar != null ? d6lVar.a : null;
        return Intrinsics.d(n7qVar.b(), n7qVar2 != null ? n7qVar2.b() : null) ? n7qVar2 : n7qVar;
    }

    public Map P() {
        ReentrantLock reentrantLock = (ReentrantLock) this.b;
        reentrantLock.lock();
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
            if (linkedHashMap != null) {
                return linkedHashMap;
            }
            LinkedHashMap W = M().W();
            this.c = W;
            return W;
        } catch (IOException e) {
            ssg.a(7, null, "Failed to load forced experiments from file.", e);
            this.c = null;
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            return e5bVar;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void Q(gzk gzkVar) {
        gzkVar.getClass();
        x97.y((mm6) this.a, null, pm6.d, new bv6(this, gzkVar, null, 22), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean R() {
        pbe pbeVar;
        IconCompat iconCompat;
        if (((h4b) this.c).j("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.b;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
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
        String s = ((h4b) this.c).s("gcm.n.image");
        if (!TextUtils.isEmpty(s)) {
            try {
                pbeVar = new pbe(new URL(s));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + s);
            }
            if (pbeVar != null) {
                ExecutorService executorService = (ExecutorService) this.a;
                i8s i8sVar = new i8s();
                pbeVar.b = executorService.submit(new juc(6, pbeVar, i8sVar));
                pbeVar.c = i8sVar.a;
            }
            le3 a = je5.a((FirebaseMessagingService) this.b, (h4b) this.c);
            f0 f0Var = (f0) a.a;
            if (pbeVar != null) {
                try {
                    onx onxVar = pbeVar.c;
                    y1g.G(onxVar);
                    Bitmap bitmap = (Bitmap) ywf.o(onxVar, 5L, TimeUnit.SECONDS);
                    f0Var.h(bitmap);
                    c0 c0Var = new c0();
                    if (bitmap == null) {
                        iconCompat = null;
                    } else {
                        iconCompat = new IconCompat(1);
                        iconCompat.b = bitmap;
                    }
                    c0Var.b = iconCompat;
                    c0Var.c = null;
                    c0Var.d = true;
                    f0Var.k(c0Var);
                } catch (InterruptedException unused2) {
                    Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                    pbeVar.close();
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e) {
                    Log.w("FirebaseMessaging", "Failed to download image: " + e.getCause());
                } catch (TimeoutException unused3) {
                    Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                    pbeVar.close();
                }
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Showing notification");
            }
            ((NotificationManager) ((FirebaseMessagingService) this.b).getSystemService("notification")).notify((String) a.b, 0, ((f0) a.a).b());
            return true;
        }
        pbeVar = null;
        if (pbeVar != null) {
        }
        le3 a2 = je5.a((FirebaseMessagingService) this.b, (h4b) this.c);
        f0 f0Var2 = (f0) a2.a;
        if (pbeVar != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.b).getSystemService("notification")).notify((String) a2.b, 0, ((f0) a2.a).b());
        return true;
    }

    public void S(float[] fArr) {
        RectF rectF = (RectF) this.b;
        View view = ((tp8) this.c).b;
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        Path path = (Path) this.a;
        path.reset();
        path.addRoundRect(rectF, (float[]) fArr.clone(), Path.Direction.CW);
        path.close();
    }

    public JSONObject T(oy6 oy6Var) {
        tc1 tc1Var = (tc1) this.c;
        JSONObject a = ((br1) this.b).a("cvv_screen.json");
        JSONArray jSONArray = a.getJSONObject("card").getJSONArray("variables");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (Intrinsics.d(jSONObject.getString("name"), "screen_title")) {
                jSONObject.put(Constants.KEY_VALUE, tc1Var.b(R.string.paymentsdk_prebuilt_cvv_screen_title));
            }
            if (Intrinsics.d(jSONObject.getString("name"), "disableButtonText")) {
                jSONObject.put(Constants.KEY_VALUE, tc1Var.b(R.string.paymentsdk_divkit_input_cvv_code));
            }
            if (Intrinsics.d(jSONObject.getString("name"), "enableButtonText")) {
                jSONObject.put(Constants.KEY_VALUE, tc1Var.b(R.string.paymentsdk_prebuilt_confirm_cvv));
            }
            if (Intrinsics.d(jSONObject.getString("name"), "card_title")) {
                jSONObject.put(Constants.KEY_VALUE, oy6Var.a + " •• " + oy6Var.b);
            }
        }
        return a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void U(i0b i0bVar) {
        uya uyaVar = (uya) this.a;
        hn5 hn5Var = (hn5) this.b;
        Object easyLoginRequest = new EasyLoginRequest(EasyLoginMode.FastConnection);
        hn5Var.getClass();
        sya syaVar = hn5Var instanceof sya ? (sya) hn5Var : null;
        h0b h0bVar = syaVar != null ? (h0b) ((np2) syaVar).s.getValue() : null;
        if (Intrinsics.d(h0bVar, f0b.a)) {
            hn5Var.startActivity(((EasyLoginApi) uyaVar.b.getValue()).startEasyLoginActivity().createIntent(hn5Var, easyLoginRequest));
            return;
        }
        if (h0bVar instanceof g0b) {
            p0b p0bVar = (p0b) this.c;
            p0bVar.d = true;
            p0bVar.c = p0b.a((List) p0bVar.a.b().a.getValue());
            ((g0b) h0bVar).a.a(easyLoginRequest);
            return;
        }
        if (h0bVar != null) {
            b6e.s();
            return;
        }
        ssg.a(7, "EasyLoginHelperImpl", "Can't extract launcher for easy login " + hn5Var.getClass(), null);
        hn5Var.startActivity(((EasyLoginApi) uyaVar.b.getValue()).startEasyLoginActivity().createIntent(hn5Var, easyLoginRequest));
    }

    @Override // defpackage.l0c
    public int a() {
        int i = ((ExtendedFloatingActionButton) this.c).G0;
        return i == -1 ? ((xiu) this.a).a() : (i == 0 || i == -2) ? ((ExtendedFloatingActionButton) ((rp7) this.b).a).getMeasuredHeight() : i;
    }

    @Override // defpackage.yva
    public void b(String str) {
        str.getClass();
        ((pi5) this.b).d((String) this.a, str);
    }

    @Override // defpackage.l0c
    public int c() {
        int i = ((ExtendedFloatingActionButton) this.c).F0;
        return i == -1 ? ((xiu) this.a).c() : (i == 0 || i == -2) ? ((rp7) this.b).c() : i;
    }

    @Override // defpackage.rct
    public void d(Object obj) {
        ((wl9) this.a).t(((Long) obj) != null ? Float.valueOf(r4.longValue()) : null, false, true);
    }

    @Override // defpackage.b9l
    public Object e(long j, long j2, kol kolVar) {
        Object L = L(new o8l(O(), j, j2), kolVar);
        return L == nm6.a ? L : Unit.a;
    }

    @Override // defpackage.b9l
    public Object f(long j, col colVar) {
        Object L = L(new s8l(O(), j), colVar);
        return L == nm6.a ? L : Unit.a;
    }

    @Override // defpackage.yva
    public void g() {
        ((nnk) this.c).d();
    }

    @Override // defpackage.yva
    public void h() {
        ((pi5) this.b).e((String) this.a);
        ((nnk) this.c).F();
    }

    @Override // defpackage.l0c
    public int i() {
        return ((ExtendedFloatingActionButton) this.c).z0;
    }

    @Override // defpackage.b9l
    public Object j(long j, v8l v8lVar) {
        Object L = L(new r8l(O(), j, zol.a), v8lVar);
        return L == nm6.a ? L : Unit.a;
    }

    @Override // defpackage.b9l
    public Object k(eol eolVar) {
        Object L = L(new k8l(O()), eolVar);
        return L == nm6.a ? L : Unit.a;
    }

    @Override // defpackage.b9l
    public Object l(n4q n4qVar, mol molVar) {
        Object L = L(new q8l(O(), n4qVar), molVar);
        return L == nm6.a ? L : Unit.a;
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        return null;
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        szuVar.getClass();
        int ordinal = hdg.W(szuVar.a).ordinal();
        if (ordinal == 0) {
            return (e0g) this.c;
        }
        if (ordinal == 1) {
            return (e0g) this.a;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.ice
    public Bitmap o(BitmapFactory.Options options) {
        non nonVar = (non) ((g8c) this.a).a;
        nonVar.reset();
        return BitmapFactory.decodeStream(nonVar, null, options);
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        Uri uri;
        String uri2;
        List list = (List) obj;
        list.getClass();
        List list2 = (List) this.a;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            Object obj2 = null;
            if (!it.hasNext()) {
                cno cnoVar = (cno) this.b;
                r7o r7oVar = z7o.b;
                cnoVar.resumeWith(q27.a((q27) this.c, arrayList, null, 254));
                return;
            }
            p27 p27Var = (p27) it.next();
            String str = p27Var.a;
            String str2 = p27Var.g;
            okr[] okrVarArr = okr.a;
            if (str.equals("sbp_token") && str2 != null) {
                String str3 = p27Var.e;
                em2 em2Var = em2.SBERBANK;
                if (StringsKt.M(str3, "unknown", false)) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (StringsKt.M(((gl2) next).b, str2, false)) {
                            obj2 = next;
                            break;
                        }
                    }
                    gl2 gl2Var = (gl2) obj2;
                    if (gl2Var != null && (uri = gl2Var.g) != null && (uri2 = uri.toString()) != null) {
                        p27Var = p27.a(p27Var, uri2);
                    }
                }
            }
            arrayList.add(p27Var);
        }
    }

    @Override // defpackage.b9l
    public Object p(zgl zglVar, cg6 cg6Var) {
        Object L = L(new m8l(O(), zglVar.a, zglVar.b), cg6Var);
        return L == nm6.a ? L : Unit.a;
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        return (e0g) this.b;
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        e0g e0gVar = (e0g) this.a;
        maqVar.getClass();
        if (maqVar instanceof jbq) {
            int ordinal = avf.J(((jbq) maqVar).b).ordinal();
            if (ordinal == 0) {
                return (e0g) this.c;
            }
            if (ordinal == 1) {
                return e0gVar;
            }
            b6e.s();
            return null;
        }
        if (maqVar instanceof eaq) {
            return (e0g) this.b;
        }
        if (maqVar instanceof vaq) {
            return e0gVar;
        }
        if (maqVar instanceof raq) {
            return e0gVar;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.ice
    public void r() {
        non nonVar = (non) ((g8c) this.a).a;
        synchronized (nonVar) {
            nonVar.c = nonVar.a.length;
        }
    }

    @Override // defpackage.w5g
    public void s(String str) {
        qzc qzcVar = (qzc) this.a;
        qr1 qr1Var = (qr1) this.c;
        try {
            String trim = str.trim();
            if (((String) this.b) == null) {
                this.b = trim;
                return;
            }
            if (!TextUtils.isEmpty(trim)) {
                qzcVar.getClass();
                if (trim != null) {
                    String[] split = trim.trim().split(StringUtils.PROCESS_POSTFIX_DELIMITER, 2);
                    if (split.length == 2) {
                        qzcVar.b(split[0].trim(), split[1].trim());
                        return;
                    } else {
                        qzcVar.b(split[0].trim(), "");
                        return;
                    }
                }
                return;
            }
            String[] split2 = ((String) this.b).split(StringUtil.SPACE, 3);
            if (split2.length < 2) {
                throw new Exception(new IOException("Not HTTP"));
            }
            nr1 nr1Var = qr1Var.f;
            nr1Var.i = qzcVar;
            String str2 = split2[0];
            nr1Var.l = str2;
            nr1Var.k = Integer.parseInt(split2[1]);
            qr1Var.f.m = split2.length == 3 ? split2[2] : "";
            qr1Var.h.r(null);
            dt1 dt1Var = qr1Var.f.h;
            if (dt1Var == null) {
                return;
            }
            qr1Var.f.f("HEAD".equalsIgnoreCase(qr1Var.b.a) ? x7e.i(dt1Var.a(), null) : vq2.F(dt1Var, kzm.a(str2), qzcVar));
        } catch (Exception e) {
            qr1Var.h.r(e);
        }
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        t1qVar.getClass();
        m1q m1qVar = t1qVar.c;
        if (m1qVar instanceof c2q) {
            return (e0g) this.a;
        }
        if (m1qVar instanceof j1q) {
            return (e0g) this.b;
        }
        if (m1qVar instanceof e2q) {
            return null;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        return (e0g) this.c;
    }

    @Override // defpackage.hra
    public gra v(onh onhVar) {
        tl7 tl7Var;
        onhVar.b.getClass();
        cnh cnhVar = onhVar.b.c;
        if (cnhVar == null) {
            return gra.a;
        }
        synchronized (this.a) {
            try {
                if (!cnhVar.equals((cnh) this.b)) {
                    this.b = cnhVar;
                    this.c = K(cnhVar);
                }
                tl7Var = (tl7) this.c;
                tl7Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return tl7Var;
    }

    @Override // defpackage.l0c
    public ViewGroup.LayoutParams w() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.c;
        int i = extendedFloatingActionButton.F0;
        if (i == 0) {
            i = -2;
        }
        int i2 = extendedFloatingActionButton.G0;
        return new ViewGroup.LayoutParams(i, i2 != 0 ? i2 : -2);
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        ((bfk) obj).getClass();
        cno cnoVar = (cno) this.b;
        r7o r7oVar = z7o.b;
        cnoVar.resumeWith((q27) this.c);
    }

    @Override // defpackage.ice
    public int y() {
        List list = (List) this.c;
        non nonVar = (non) ((g8c) this.a).a;
        nonVar.reset();
        return lxe.r(list, nonVar, (z98) this.b);
    }

    @Override // defpackage.b9l
    public Object z(long j, col colVar) {
        Object L = L(new j8l(O(), j), colVar);
        return L == nm6.a ? L : Unit.a;
    }

    @Override // defpackage.qce
    public void E(rce rceVar, pgb pgbVar) {
    }

    public es6(wka wkaVar, e6q e6qVar, mm6 mm6Var) {
        e6qVar.getClass();
        this.a = wkaVar;
        this.b = e6qVar;
        this.c = men.g(Integer.MAX_VALUE, 6, null);
        x97.y(mm6Var, null, null, new f98(this, null, 13), 3);
    }

    public es6(Context context, int i) {
        switch (i) {
            case 18:
                this.a = context;
                this.b = new ReentrantLock();
                break;
            default:
                this.a = context;
                this.b = btf.b(new yg6(17, this));
                break;
        }
    }

    public /* synthetic */ es6(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public es6(vx1... vx1VarArr) {
        cgq cgqVar = new cgq();
        k3r k3rVar = new k3r();
        k3rVar.c = 1.0f;
        k3rVar.d = 1.0f;
        tx1 tx1Var = tx1.e;
        k3rVar.e = tx1Var;
        k3rVar.f = tx1Var;
        k3rVar.g = tx1Var;
        k3rVar.h = tx1Var;
        ByteBuffer byteBuffer = vx1.a;
        k3rVar.k = byteBuffer;
        k3rVar.l = byteBuffer.asShortBuffer();
        k3rVar.m = byteBuffer;
        k3rVar.b = -1;
        vx1[] vx1VarArr2 = new vx1[vx1VarArr.length + 2];
        this.a = vx1VarArr2;
        System.arraycopy(vx1VarArr, 0, vx1VarArr2, 0, vx1VarArr.length);
        this.b = cgqVar;
        this.c = k3rVar;
        vx1VarArr2[vx1VarArr.length] = cgqVar;
        vx1VarArr2[vx1VarArr.length + 1] = k3rVar;
    }

    public es6(q7b q7bVar, jlq jlqVar, g8b g8bVar) {
        this.c = q7bVar;
        this.b = jlqVar;
        this.a = g8bVar;
    }
}
