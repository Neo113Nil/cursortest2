package defpackage;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.ref.WeakReference;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.logging.Level;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class yyo implements Runnable {
    public final /* synthetic */ int a;
    public Object b;

    private final void a() {
        synchronized (((tbx) this.b).c) {
            ((spj) ((tbx) this.b).d).e();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:263:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        DatagramSocket datagramSocket;
        f8s c;
        long j;
        a9x a9xVar;
        a8x a8xVar;
        DatagramSocket datagramSocket2 = null;
        WeakReference weakReference = null;
        DatagramSocket datagramSocket3 = null;
        try {
            switch (this.a) {
                case 0:
                    if (((dzo) ((pwe) this.b).a).j != null) {
                        ((dzo) ((pwe) this.b).a).j.onStop();
                        return;
                    }
                    return;
                case 1:
                    x13 x13Var = (x13) ((sfm) this.b).a;
                    sgr i = sgr.f.i("Handshake timeout exceeded");
                    synchronized (x13Var) {
                        x13Var.o(i, true);
                    }
                    return;
                case 2:
                    Iterator it = ((ArrayList) ((ew0) this.b).c).iterator();
                    while (it.hasNext()) {
                        ((vzm) it.next()).b();
                    }
                    return;
                case 3:
                    try {
                        datagramSocket = new DatagramSocket((SocketAddress) null);
                    } catch (Exception e) {
                        e = e;
                    }
                    try {
                        datagramSocket.setReuseAddress(true);
                        datagramSocket.bind(new InetSocketAddress(2014));
                        byte[] bArr = (byte[]) this.b;
                        DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length);
                        InetAddress byName = InetAddress.getByName("255.255.255.255");
                        datagramPacket.setAddress(byName);
                        datagramPacket.setPort(2014);
                        datagramSocket.send(datagramPacket);
                        datagramSocket.close();
                        datagramSocket2 = byName;
                    } catch (Exception e2) {
                        e = e2;
                        datagramSocket3 = datagramSocket;
                        e.printStackTrace();
                        datagramSocket2 = datagramSocket3;
                        if (datagramSocket3 != null) {
                            datagramSocket3.close();
                            datagramSocket2 = datagramSocket3;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        datagramSocket2 = datagramSocket;
                        if (datagramSocket2 != null) {
                            datagramSocket2.close();
                        }
                        throw th;
                    }
                    return;
                case 4:
                    ((StaggeredGridLayoutManager) this.b).g1();
                    return;
                case 5:
                    exr exrVar = (exr) this.b;
                    exrVar.m = true;
                    int progress = exrVar.k.getProgress() + 3;
                    exrVar.n = progress;
                    exrVar.k.setProgress(progress);
                    Timber.d("simulated update with %s", Integer.valueOf(exrVar.n));
                    if (exrVar.n < 150) {
                        n7w.O().postDelayed(exrVar.o, 50L);
                        return;
                    }
                    return;
                case 6:
                    while (true) {
                        m8s m8sVar = (m8s) this.b;
                        synchronized (m8sVar) {
                            c = m8sVar.c();
                        }
                        if (c == null) {
                            return;
                        }
                        l8s l8sVar = c.c;
                        l8sVar.getClass();
                        m8s m8sVar2 = (m8s) this.b;
                        boolean isLoggable = m8s.i.isLoggable(Level.FINE);
                        if (isLoggable) {
                            j = System.nanoTime();
                            swf.v(c, l8sVar, "starting");
                        } else {
                            j = -1;
                        }
                        try {
                            m8s.a(m8sVar2, c);
                            if (isLoggable) {
                                swf.v(c, l8sVar, "finished run in ".concat(swf.D(System.nanoTime() - j)));
                            }
                        } catch (Throwable th2) {
                            try {
                                ((ThreadPoolExecutor) m8sVar2.a.b).execute(this);
                                throw th2;
                            } catch (Throwable th3) {
                                if (isLoggable) {
                                    swf.v(c, l8sVar, "failed a run in ".concat(swf.D(System.nanoTime() - j)));
                                }
                                throw th3;
                            }
                        }
                    }
                case 7:
                    CheckableImageButton checkableImageButton = ((TextInputLayout) this.b).c.g;
                    checkableImageButton.performClick();
                    checkableImageButton.jumpDrawablesToCurrentState();
                    return;
                case 8:
                    ((Toolbar) this.b).v();
                    return;
                case 9:
                    tos tosVar = (tos) this.b;
                    Window.Callback callback = tosVar.b;
                    Menu w = tosVar.w();
                    hxh hxhVar = w instanceof hxh ? (hxh) w : null;
                    if (hxhVar != null) {
                        hxhVar.w();
                    }
                    try {
                        w.clear();
                        if (callback.onCreatePanelMenu(0, w)) {
                            if (!callback.onPreparePanel(0, null, w)) {
                            }
                            if (hxhVar == null) {
                                hxhVar.v();
                                return;
                            }
                            return;
                        }
                        w.clear();
                        if (hxhVar == null) {
                        }
                    } catch (Throwable th4) {
                        if (hxhVar != null) {
                            hxhVar.v();
                        }
                        throw th4;
                    }
                case 10:
                    ((heu) this.b).p(0);
                    return;
                case 11:
                    WeakReference weakReference2 = ((lfu) this.b).a;
                    Set set = bp6.a;
                    if (set.contains(this)) {
                        return;
                    }
                    try {
                        View E = ot0.E((Activity) (set.contains(lfu.class) ? null : weakReference2).get());
                        if (!bp6.a.contains(lfu.class)) {
                            weakReference = weakReference2;
                        }
                        Activity activity = (Activity) weakReference.get();
                        if (E != null && activity != null) {
                            Iterator it2 = nqr.a(E).iterator();
                            while (it2.hasNext()) {
                                View view = (View) it2.next();
                                if (!ogp.x(view)) {
                                    String d = nqr.d(view);
                                    if (d.length() > 0 && d.length() <= 300) {
                                        HashSet hashSet = ofu.e;
                                        String localClassName = activity.getLocalClassName();
                                        localClassName.getClass();
                                        jkl.f(view, E, localClassName);
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    } catch (Exception unused) {
                        return;
                    } catch (Throwable th5) {
                        bp6.a(this, th5);
                        return;
                    }
                case 12:
                    lgu lguVar = (lgu) this.b;
                    lguVar.setScrollState(0);
                    lguVar.r();
                    return;
                case 13:
                    nww nwwVar = (nww) this.b;
                    qmd qmdVar = nwwVar.d;
                    Context context = nwwVar.c;
                    qmdVar.getClass();
                    if (rnd.a.getAndSet(true)) {
                        return;
                    }
                    try {
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                        if (notificationManager != null) {
                            notificationManager.cancel(10436);
                            return;
                        }
                        return;
                    } catch (SecurityException e3) {
                        Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e3);
                        return;
                    }
                case 14:
                    ((axw) this.b).f();
                    return;
                case 15:
                    fo0 fo0Var = ((axw) ((z6n) this.b).b).h;
                    fo0Var.b(fo0Var.getClass().getName().concat(" disconnecting because it was signed out."));
                    return;
                case 16:
                    ((sxw) this.b).n.b(new h66(4));
                    return;
                case 17:
                    dww dwwVar = (dww) this.b;
                    Lock lock = dwwVar.s;
                    lock.lock();
                    try {
                        dww.k(dwwVar);
                        return;
                    } finally {
                        lock.unlock();
                    }
                case 18:
                    jku jkuVar = (jku) this.b;
                    synchronized (jkuVar.a) {
                        try {
                            if (jkuVar.b()) {
                                Log.e("WakeLock", String.valueOf(jkuVar.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                                jkuVar.d();
                                if (jkuVar.b()) {
                                    jkuVar.c = 1;
                                    jkuVar.e();
                                    return;
                                }
                                return;
                            }
                            return;
                        } finally {
                        }
                    }
                case 19:
                    j2x j2xVar = (j2x) this.b;
                    synchronized (j2x.i) {
                        try {
                            if (j2xVar.d()) {
                                j2xVar.f(15);
                                return;
                            }
                            return;
                        } finally {
                        }
                    }
                case 20:
                    rlh rlhVar = (rlh) this.b;
                    qz2 qz2Var = (qz2) rlhVar.c;
                    qz2Var.o(0);
                    uz2 uz2Var = b6x.l;
                    qz2Var.y(24, 6, uz2Var);
                    rlhVar.a(uz2Var);
                    return;
                case 21:
                    List list = ((y7x) this.b).e;
                    if (list == null) {
                        throw null;
                    }
                    list.isEmpty();
                    throw null;
                case 22:
                    t9x t9xVar = (t9x) this.b;
                    if (t9xVar == null || (a9xVar = t9xVar.h) == null) {
                        return;
                    }
                    this.b = null;
                    if (a9xVar.isDone()) {
                        Object obj = t9xVar.a;
                        if (obj == null) {
                            if (a9xVar.isDone()) {
                                if (j8x.f.X(t9xVar, null, j8x.f(a9xVar))) {
                                    j8x.h(t9xVar);
                                    return;
                                }
                                return;
                            }
                            d8x d8xVar = new d8x(t9xVar, a9xVar);
                            if (j8x.f.X(t9xVar, null, d8xVar)) {
                                try {
                                    a9xVar.b(d8xVar, v8x.a);
                                    return;
                                } catch (Throwable th6) {
                                    try {
                                        a8xVar = new a8x(th6);
                                    } catch (Error | Exception unused2) {
                                        a8xVar = a8x.b;
                                    }
                                    j8x.f.X(t9xVar, d8xVar, a8xVar);
                                    return;
                                }
                            }
                            obj = t9xVar.a;
                        }
                        if (obj instanceof z7x) {
                            a9xVar.cancel(((z7x) obj).a);
                            return;
                        }
                        return;
                    }
                    try {
                        ScheduledFuture scheduledFuture = t9xVar.i;
                        t9xVar.i = null;
                        String str = "Timed out";
                        if (scheduledFuture != null) {
                            try {
                                long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                                if (abs > 10) {
                                    str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                                }
                            } catch (Throwable th7) {
                                t9xVar.e(new r9x(str));
                                throw th7;
                            }
                        }
                        t9xVar.e(new r9x(str + ": " + a9xVar.toString()));
                        return;
                    } finally {
                        a9xVar.cancel(true);
                    }
                case 23:
                    a();
                    return;
                case 24:
                    zfx zfxVar = (zfx) this.b;
                    mgx mgxVar = zfxVar.g;
                    if (mgxVar != null) {
                        zfxVar.a.a((ohx) zfxVar.c.b(mgxVar).b(), 223);
                    }
                    zfxVar.e();
                    return;
                case 25:
                    Context context2 = (Context) ((yfx) this.b).b;
                    long j2 = yfx.B(context2).getLong("app_set_id_last_used_time", -1L);
                    long j3 = j2 != -1 ? j2 + 33696000000L : -1L;
                    if (j3 == -1 || System.currentTimeMillis() <= j3) {
                        return;
                    }
                    if (!yfx.B(context2).edit().remove(CommonUrlParts.APP_SET_ID).commit()) {
                        String valueOf = String.valueOf(context2.getPackageName());
                        Log.e("AppSet", valueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(valueOf) : new String("Failed to clear app set ID generated for App "));
                    }
                    if (context2.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                        return;
                    }
                    String valueOf2 = String.valueOf(context2.getPackageName());
                    Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
                    return;
                case 26:
                    ((mmx) this.b).g(false);
                    return;
                default:
                    zix zixVar = (zix) this.b;
                    HashSet hashSet2 = zixVar.f;
                    SharedPreferences sharedPreferences = zixVar.b;
                    HashSet hashSet3 = zixVar.g;
                    if (hashSet2.isEmpty()) {
                        return;
                    }
                    long j4 = true != hashSet3.equals(hashSet2) ? 86400000L : 172800000L;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j5 = zixVar.h;
                    if (j5 == 0 || currentTimeMillis - j5 >= j4) {
                        zix.i.b("Upload the feature usage report.", new Object[0]);
                        xgx m = ygx.m();
                        String str2 = zix.j;
                        m.c();
                        ygx.o((ygx) m.b, str2);
                        String str3 = zixVar.c;
                        m.c();
                        ygx.n((ygx) m.b, str3);
                        ygx ygxVar = (ygx) m.b();
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(hashSet2);
                        tgx m2 = ugx.m();
                        m2.c();
                        ugx.n((ugx) m2.b, arrayList);
                        m2.c();
                        ugx.o((ugx) m2.b, ygxVar);
                        ugx ugxVar = (ugx) m2.b();
                        nhx n = ohx.n();
                        n.c();
                        ohx.q((ohx) n.b, ugxVar);
                        zixVar.a.a((ohx) n.b(), 243);
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        if (!hashSet3.equals(hashSet2)) {
                            hashSet3.clear();
                            hashSet3.addAll(hashSet2);
                            Iterator it3 = hashSet3.iterator();
                            while (it3.hasNext()) {
                                String num = Integer.toString(((rgx) it3.next()).a);
                                String g = f1d.g("feature_usage_timestamp_reported_feature_", num);
                                if (!sharedPreferences.contains(g)) {
                                    g = f1d.g("feature_usage_timestamp_detected_feature_", num);
                                }
                                String g2 = f1d.g("feature_usage_timestamp_reported_feature_", num);
                                if (!TextUtils.equals(g, g2)) {
                                    long j6 = sharedPreferences.getLong(g, 0L);
                                    edit.remove(g);
                                    if (j6 != 0) {
                                        edit.putLong(g2, j6);
                                    }
                                }
                            }
                        }
                        zixVar.h = currentTimeMillis;
                        edit.putLong("feature_usage_last_report_time", currentTimeMillis).apply();
                        return;
                    }
                    return;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    public /* synthetic */ yyo(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
