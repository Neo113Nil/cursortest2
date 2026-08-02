package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.appmetrica.analytics.rtm.internal.Constants;
import io.grpc.util.b;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Exchanger;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import javax.jmdns.impl.a;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import ru.kinopoisk.sdk.easylogin.internal.C1179p8;

/* loaded from: classes3.dex */
public final class nud implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ nud(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    private final void a() {
        ude udeVar;
        txj txjVar;
        rxj rxjVar;
        double d;
        b bVar = (b) this.d;
        bVar.m = Long.valueOf(bVar.j.x());
        for (qxj qxjVar : ((HashMap) ((b) this.d).g.r).values()) {
            aqd aqdVar = qxjVar.c;
            ((AtomicLong) aqdVar.b).set(0L);
            ((AtomicLong) aqdVar.c).set(0L);
            aqd aqdVar2 = qxjVar.b;
            qxjVar.b = qxjVar.c;
            qxjVar.c = aqdVar2;
        }
        txj txjVar2 = (txj) this.b;
        zc4 zc4Var = (zc4) this.c;
        tde u = yde.u();
        if (txjVar2.e != null) {
            u.a(new rxj(txjVar2, zc4Var, 1));
        }
        if (txjVar2.f != null) {
            u.a(new rxj(txjVar2, zc4Var, 0));
        }
        ude listIterator = u.f().listIterator(0);
        while (listIterator.hasNext()) {
            rxj rxjVar2 = (rxj) listIterator.next();
            b bVar2 = (b) this.d;
            bn7 bn7Var = bVar2.g;
            long longValue = bVar2.m.longValue();
            switch (rxjVar2.a) {
                case 0:
                    udeVar = listIterator;
                    txj txjVar3 = rxjVar2.b;
                    ArrayList A = b.A(bn7Var, txjVar3.f.d.intValue());
                    int size = A.size();
                    sxj sxjVar = txjVar3.f;
                    if (size >= sxjVar.c.intValue() && A.size() != 0) {
                        Iterator it = A.iterator();
                        while (it.hasNext()) {
                            qxj qxjVar2 = (qxj) it.next();
                            if (bn7Var.U() >= txjVar3.d.intValue()) {
                                break;
                            }
                            if (qxjVar2.c() >= sxjVar.d.intValue()) {
                                if (((AtomicLong) qxjVar2.c.c).get() / qxjVar2.c() > sxjVar.a.intValue() / 100.0d) {
                                    rxjVar2.c.J(1, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}", qxjVar2, Double.valueOf(((AtomicLong) qxjVar2.c.c).get() / qxjVar2.c()));
                                    if (new Random().nextInt(100) < sxjVar.b.intValue()) {
                                        qxjVar2.b(longValue);
                                    }
                                }
                            }
                        }
                        break;
                    }
                    break;
                default:
                    txj txjVar4 = rxjVar2.b;
                    ArrayList A2 = b.A(bn7Var, txjVar4.e.d.intValue());
                    int size2 = A2.size();
                    sxj sxjVar2 = txjVar4.e;
                    if (size2 >= sxjVar2.c.intValue() && A2.size() != 0) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = A2.iterator();
                        while (it2.hasNext()) {
                            qxj qxjVar3 = (qxj) it2.next();
                            arrayList.add(Double.valueOf(((AtomicLong) qxjVar3.c.b).get() / qxjVar3.c()));
                            rxjVar2 = rxjVar2;
                        }
                        rxj rxjVar3 = rxjVar2;
                        Iterator it3 = arrayList.iterator();
                        double d2 = 0.0d;
                        double d3 = 0.0d;
                        while (it3.hasNext()) {
                            d3 = ((Double) it3.next()).doubleValue() + d3;
                        }
                        double size3 = d3 / arrayList.size();
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            double doubleValue = ((Double) it4.next()).doubleValue() - size3;
                            d2 = (doubleValue * doubleValue) + d2;
                        }
                        double sqrt = Math.sqrt(d2 / arrayList.size());
                        double intValue = size3 - ((sxjVar2.a.intValue() / 1000.0f) * sqrt);
                        Iterator it5 = A2.iterator();
                        while (it5.hasNext()) {
                            qxj qxjVar4 = (qxj) it5.next();
                            udeVar = listIterator;
                            double d4 = sqrt;
                            if (bn7Var.U() >= txjVar4.d.intValue()) {
                                break;
                            }
                            if (((AtomicLong) qxjVar4.c.b).get() / qxjVar4.c() < intValue) {
                                rxjVar = rxjVar3;
                                d = intValue;
                                txjVar = txjVar4;
                                rxjVar.c.J(1, "SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}", qxjVar4, Double.valueOf(((AtomicLong) qxjVar4.c.b).get() / qxjVar4.c()), Double.valueOf(size3), Double.valueOf(d4), Double.valueOf(d));
                                if (new Random().nextInt(100) < sxjVar2.b.intValue()) {
                                    qxjVar4.b(longValue);
                                }
                            } else {
                                txjVar = txjVar4;
                                rxjVar = rxjVar3;
                                d = intValue;
                            }
                            intValue = d;
                            txjVar4 = txjVar;
                            listIterator = udeVar;
                            rxjVar3 = rxjVar;
                            sqrt = d4;
                        }
                    }
                    udeVar = listIterator;
                    break;
            }
            listIterator = udeVar;
        }
        b bVar3 = (b) this.d;
        bn7 bn7Var2 = bVar3.g;
        Long l = bVar3.m;
        for (qxj qxjVar5 : ((HashMap) bn7Var2.r).values()) {
            if (!qxjVar5.d()) {
                int i = qxjVar5.e;
                qxjVar5.e = i == 0 ? 0 : i - 1;
            }
            if (qxjVar5.d()) {
                if (l.longValue() > Math.min(qxjVar5.a.b.longValue() * qxjVar5.e, Math.max(qxjVar5.a.b.longValue(), qxjVar5.a.c.longValue())) + qxjVar5.d.longValue()) {
                    qxjVar5.e();
                }
            }
        }
    }

    private final void b() {
        uyw uywVar = (uyw) this.b;
        h7x h7xVar = (h7x) this.d;
        if (h7xVar.h > 0) {
            Bundle bundle = h7xVar.i;
            uywVar.e(bundle != null ? bundle.getBundle((String) this.c) : null);
        }
        if (h7xVar.h >= 2) {
            uywVar.i();
        }
        if (h7xVar.h >= 3) {
            uywVar.g();
        }
        if (h7xVar.h >= 4) {
            uywVar.j();
        }
        if (h7xVar.h >= 5) {
            uywVar.f();
        }
    }

    private final void c() {
        int i;
        onx K;
        kq4 kq4Var = (kq4) this.c;
        Intent intent = kq4Var.a;
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("message_id");
        }
        if (TextUtils.isEmpty(stringExtra)) {
            K = ywf.w(null);
        } else {
            Bundle bundle = new Bundle();
            Intent intent2 = kq4Var.a;
            String stringExtra2 = intent2.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent2.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra2);
            Intent intent3 = kq4Var.a;
            Integer valueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
            if (valueOf != null) {
                bundle.putInt("google.product_id", valueOf.intValue());
            }
            Context context = (Context) this.b;
            bundle.putBoolean("supports_message_handled", true);
            anx J = anx.J(context);
            synchronized (J) {
                i = J.a;
                J.a = i + 1;
            }
            K = J.K(new lkx(i, 2, bundle, 0));
        }
        K.b(f48.c, new uiq(18, (CountDownLatch) this.d));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:205|(3:209|(3:213|(2:215|216)(2:218|219)|217)|206)|221|(1:(1:224)(4:225|226|227|228))|232|226|227|228) */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0480, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0481, code lost:
    
        android.util.Log.e("MDNSSearchProvider", "getById error: " + r0.getMessage());
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        OverScroller overScroller;
        dfb dfbVar;
        List w0;
        dfb dfbVar2;
        boolean z;
        Runnable pv7Var;
        p2f p2fVar;
        Runnable runnable;
        noj nojVar;
        moj mojVar;
        Socket socket;
        SSLSession sSLSession;
        Socket socket2;
        ikn iknVar;
        xun xunVar;
        xun xunVar2;
        switch (this.a) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.b;
                oud oudVar = (oud) this.d;
                View view = (View) this.c;
                if (view == null || (overScroller = oudVar.scroller) == null) {
                    return;
                }
                if (!overScroller.computeScrollOffset()) {
                    oudVar.onFlingFinished(coordinatorLayout, view);
                    return;
                } else {
                    oudVar.setHeaderTopBottomOffset(coordinatorLayout, view, oudVar.scroller.getCurrY());
                    view.postOnAnimation(this);
                    return;
                }
            case 1:
                Object obj2 = this.d;
                v7o v7oVar = (v7o) this.c;
                Map map = (Map) this.b;
                long j = -1;
                if (map == null) {
                    if (!(obj2 instanceof Map)) {
                        v7oVar.onSuccess(obj2);
                        return;
                    }
                    try {
                        v7oVar.onSuccess(hw0.a((Map) obj2));
                        return;
                    } catch (NullPointerException unused) {
                        v7oVar.onError(new veb(-1L, "error", "Unexpected response: " + obj2.toString()));
                        return;
                    }
                }
                try {
                    Object obj3 = map.get("code");
                    if (obj3 instanceof String) {
                        j = Long.parseLong((String) obj3);
                    } else if (obj3 instanceof Integer) {
                        j = ((Integer) obj3).intValue();
                    } else if (obj3 instanceof Long) {
                        j = ((Long) obj3).longValue();
                    }
                } catch (Exception unused2) {
                }
                String str = (String) map.get("name");
                v7oVar.onError(new veb(j, str != null ? str : "error", (String) map.get(Constants.KEY_MESSAGE)));
                return;
            case 2:
                ys1 ys1Var = (ys1) this.d;
                try {
                    InetAddress[] allByName = InetAddress.getAllByName((String) this.b);
                    Arrays.sort(allByName, ys1.h);
                    if (allByName == null || allByName.length == 0) {
                        throw new my1("no addresses for host");
                    }
                    ys1Var.c(new x8x(this, allByName, false, 11));
                    return;
                } catch (Exception e) {
                    ys1Var.c(new x8x(this, e, false, 12));
                    return;
                }
            case 3:
                ((f8h) this.d).f.f((bg3) this.b, (s2i) this.c);
                return;
            case 4:
                ((jv7) this.d).t.Q((sgr) this.b, (s2i) this.c);
                return;
            case 5:
                g23 g23Var = ((h23) this.b).b;
                f23 a = g23Var.a();
                try {
                    ((gc8) this.c).p.add((ffg) this.d);
                    return;
                } finally {
                    g23Var.getClass();
                    g23.b(a);
                }
            case 6:
                jb9 jb9Var = (jb9) this.b;
                ViewPager2 viewPager2 = jb9Var.b;
                int width = viewPager2.getOrientation() == 0 ? viewPager2.getWidth() : viewPager2.getHeight();
                ((ii) this.d).invoke(Integer.valueOf(width));
                jb9Var.a = width;
                return;
            case 7:
                if (((wl9) this.b).getActiveTickMarkDrawable() == null && ((wl9) this.b).getInactiveTickMarkDrawable() == null) {
                    return;
                }
                float maxValue = ((wl9) this.b).getMaxValue() - ((wl9) this.b).getMinValue();
                Drawable activeTickMarkDrawable = ((wl9) this.b).getActiveTickMarkDrawable();
                boolean z2 = false;
                int intrinsicWidth = activeTickMarkDrawable != null ? activeTickMarkDrawable.getIntrinsicWidth() : 0;
                if (Math.max(intrinsicWidth, ((wl9) this.b).getInactiveTickMarkDrawable() != null ? r3.getIntrinsicWidth() : 0) * maxValue <= ((wl9) this.b).getWidth() || (dfbVar = ((jl9) this.d).h) == null) {
                    return;
                }
                synchronized (dfbVar.c) {
                    w0 = CollectionsKt.w0(dfbVar.g);
                }
                Iterator it = w0.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.d(((Throwable) it.next()).getMessage(), "Slider ticks overlap each other.")) {
                        z2 = true;
                    }
                }
                if (z2 || (dfbVar2 = ((jl9) this.d).h) == null) {
                    return;
                }
                dfbVar2.e(new Throwable("Slider ticks overlap each other."));
                return;
            case 8:
                Exchanger exchanger = (Exchanger) this.b;
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream((File) this.c), Charsets.UTF_8), RemoteCameraConfig.Notification.ID);
                    try {
                        z = ((oeo) ((jyr) ((wge) this.d).a).getValue()).a(bufferedWriter);
                        bufferedWriter.close();
                    } finally {
                    }
                } catch (IOException unused3) {
                    z = false;
                }
                exchanger.exchange(Boolean.valueOf(z));
                return;
            case 9:
                Exchanger exchanger2 = (Exchanger) this.b;
                ((wge) this.c).a((String) this.d);
                exchanger2.exchange(Unit.a);
                return;
            case 10:
                String str2 = (String) this.d;
                vzm vzmVar = (vzm) Thread.currentThread();
                Context context = (Context) this.b;
                WifiManager.MulticastLock v = rvf.v(context, "MDNSSearchProvider");
                try {
                    p2fVar = new p2f(null, rvf.A(context));
                    pv7Var = null;
                } catch (IOException e2) {
                    e2.printStackTrace();
                    pv7Var = new pv7(23, this, e2);
                    p2fVar = null;
                }
                if (p2fVar != null) {
                    String n = ouj.n(str2, "._samsungmsf._tcp.local.");
                    int i = 2;
                    a aVar = null;
                    while (!vzmVar.a() && aVar == null) {
                        int i2 = i - 1;
                        if (i >= 0 && !Thread.currentThread().isInterrupted()) {
                            a R0 = p2fVar.R0(n, str2, "", false);
                            p2f.X0(R0, 5000L);
                            aVar = R0.j() ? R0 : null;
                            i = i2;
                        }
                    }
                    if (!vzmVar.a()) {
                        if (aVar == null) {
                            pv7Var = new dsd(6, this);
                        } else {
                            runnable = new pv7(24, this, vjp.b(aVar));
                            p2fVar.close();
                            pv7Var = runnable;
                        }
                    }
                    runnable = pv7Var;
                    p2fVar.close();
                    pv7Var = runnable;
                }
                rvf.J(v);
                if (pv7Var != null) {
                    jjo.b(pv7Var);
                    return;
                }
                return;
            case 11:
                j8h j8hVar = (j8h) this.d;
                u76 u76Var = j8hVar.r;
                e8h e8hVar = (e8h) this.b;
                Executor executor = j8hVar.h;
                r76 r76Var = (r76) this.c;
                u76Var.getClass();
                o2g.O(executor, "executor");
                o2g.O(r76Var, "source");
                t76 t76Var = new t76(e8hVar, executor);
                if (((r76) u76Var.b) != r76Var) {
                    executor.execute(e8hVar);
                    return;
                } else {
                    ((ArrayList) u76Var.a).add(t76Var);
                    return;
                }
            case 12:
                r76 r76Var2 = (r76) this.c;
                aeg aegVar = (aeg) this.b;
                a8h a8hVar = (a8h) this.d;
                j8h j8hVar2 = a8hVar.b;
                if (a8hVar != j8hVar2.w) {
                    return;
                }
                j8hVar2.x = aegVar;
                j8hVar2.D.h(aegVar);
                if (r76Var2 != r76.e) {
                    a8hVar.b.N.J(2, "Entering {0} state with picker: {1}", r76Var2, aegVar);
                    a8hVar.b.r.i(r76Var2);
                    return;
                }
                return;
            case 13:
                try {
                    ((CountDownLatch) this.b).await();
                } catch (InterruptedException unused4) {
                    Thread.currentThread().interrupt();
                }
                ikn iknVar2 = new ikn(new loj());
                try {
                    try {
                        noj nojVar2 = (noj) this.d;
                        d6e d6eVar = nojVar2.N;
                        if (d6eVar == null) {
                            socket = nojVar2.A.createSocket(nojVar2.a.getAddress(), ((noj) this.d).a.getPort());
                        } else {
                            SocketAddress socketAddress = d6eVar.a;
                            if (!(socketAddress instanceof InetSocketAddress)) {
                                throw sgr.n.i("Unsupported SocketAddress implementation " + ((noj) this.d).N.a.getClass()).a();
                            }
                            socket = noj.g(nojVar2, d6eVar.b, (InetSocketAddress) socketAddress, d6eVar.c, d6eVar.d);
                        }
                        noj nojVar3 = (noj) this.d;
                        SSLSocketFactory sSLSocketFactory = nojVar3.B;
                        if (sSLSocketFactory != null) {
                            String str3 = nojVar3.b;
                            URI a2 = xqd.a(str3);
                            if (a2.getHost() != null) {
                                str3 = a2.getHost();
                            }
                            SSLSocket a3 = cpj.a(sSLSocketFactory, socket, str3, ((noj) this.d).k(), ((noj) this.d).E);
                            sSLSession = a3.getSession();
                            socket2 = a3;
                        } else {
                            sSLSession = null;
                            socket2 = socket;
                        }
                        socket2.setTcpNoDelay(true);
                        iknVar = new ikn(fxf.U(socket2));
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (tgr e3) {
                    e = e3;
                } catch (Exception e4) {
                    e = e4;
                }
                try {
                    ((ct1) this.c).a(fxf.R(socket2), socket2);
                    noj nojVar4 = (noj) this.d;
                    xu1 xu1Var = nojVar4.u;
                    xu1Var.getClass();
                    yfx yfxVar = new yfx(xu1Var);
                    yfxVar.w(wdp.f, socket2.getRemoteSocketAddress());
                    yfxVar.w(wdp.g, socket2.getLocalSocketAddress());
                    yfxVar.w(wdp.h, sSLSession);
                    yfxVar.w(bkp.e, sSLSession == null ? b9p.a : b9p.b);
                    nojVar4.u = yfxVar.h();
                    noj nojVar5 = (noj) this.d;
                    nojVar5.g.getClass();
                    nojVar5.t = new moj(nojVar5, new zp4(iknVar));
                    synchronized (((noj) this.d).k) {
                        if (sSLSession != null) {
                            try {
                                new l48(sSLSession);
                            } finally {
                            }
                        }
                    }
                    return;
                } catch (tgr e5) {
                    e = e5;
                    iknVar2 = iknVar;
                    ((noj) this.d).r(0, afb.INTERNAL_ERROR, e.a);
                    nojVar = (noj) this.d;
                    nojVar.g.getClass();
                    mojVar = new moj(nojVar, new zp4(iknVar2));
                    nojVar.t = mojVar;
                    return;
                } catch (Exception e6) {
                    e = e6;
                    iknVar2 = iknVar;
                    ((noj) this.d).o(e);
                    nojVar = (noj) this.d;
                    nojVar.g.getClass();
                    mojVar = new moj(nojVar, new zp4(iknVar2));
                    nojVar.t = mojVar;
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    iknVar2 = iknVar;
                    noj nojVar6 = (noj) this.d;
                    nojVar6.g.getClass();
                    nojVar6.t = new moj(nojVar6, new zp4(iknVar2));
                    throw th;
                }
            case 14:
                a();
                return;
            case 15:
                ozn oznVar = (ozn) this.d;
                rb2 rb2Var = (rb2) this.b;
                oznVar.b(rb2Var, (i8s) this.c);
                ((AtomicInteger) oznVar.i.b).set(0);
                double min = Math.min(3600000.0d, Math.pow(oznVar.b, oznVar.a()) * (60000.0d / oznVar.a));
                String str4 = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d)) + " s for report: " + rb2Var.b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str4, null);
                }
                try {
                    Thread.sleep((long) min);
                    return;
                } catch (InterruptedException unused5) {
                    return;
                }
            case 16:
                try {
                    obj = ((dqc) this.b).call();
                } catch (Exception unused6) {
                    obj = null;
                }
                ((Handler) this.d).post(new e8h((eqc) this.c, obj, false, 9));
                return;
            case 17:
                zt3 zt3Var = (zt3) this.b;
                try {
                    x97.D(zt3Var.e.minusKey(d.t0), new lco((ueo) this.c, zt3Var, (veo) this.d, null, 1));
                    return;
                } catch (Throwable th3) {
                    zt3Var.h(th3);
                    return;
                }
            case 18:
                Iterator it2 = ((ArrayList) this.b).iterator();
                while (it2.hasNext()) {
                    try {
                        ((vzm) it2.next()).join();
                    } catch (InterruptedException e7) {
                        e7.printStackTrace();
                    }
                }
                C1179p8 c1179p8 = (C1179p8) this.d;
                Iterator it3 = ((CopyOnWriteArrayList) this.c).iterator();
                veb vebVar = null;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (next instanceof vjp) {
                        c1179p8.onSuccess((vjp) next);
                        return;
                    } else if (vebVar == null && (next instanceof veb)) {
                        vebVar = (veb) next;
                    }
                }
                if (vebVar != null) {
                    c1179p8.onError(vebVar);
                    return;
                }
                return;
            case 19:
                ((vq6) this.d).execute((gyr) this.b);
                return;
            case 20:
                uyw uywVar = (uyw) this.b;
                e3x e3xVar = (e3x) this.d;
                if (e3xVar.b > 0) {
                    Bundle bundle = e3xVar.c;
                    uywVar.e(bundle != null ? bundle.getBundle((String) this.c) : null);
                }
                if (e3xVar.b >= 2) {
                    uywVar.i();
                }
                if (e3xVar.b >= 3) {
                    uywVar.g();
                }
                if (e3xVar.b >= 4) {
                    uywVar.j();
                }
                if (e3xVar.b >= 5) {
                    uywVar.f();
                    return;
                }
                return;
            case 21:
                qz2 qz2Var = (qz2) this.b;
                com.yandex.plus.pay.inapp.google.internal.a aVar2 = (com.yandex.plus.pay.inapp.google.internal.a) this.c;
                psd psdVar = (psd) this.d;
                uz2 uz2Var = b6x.l;
                qz2Var.y(24, 4, uz2Var);
                aVar2.c(uz2Var, psdVar.b);
                return;
            case 22:
                f4x f4xVar = (f4x) this.b;
                HashMap hashMap = f4xVar.i.C;
                String str5 = (String) this.c;
                synchronized (hashMap) {
                    xunVar = (xun) f4xVar.i.C.get(str5);
                }
                if (xunVar != null) {
                    xunVar.o((String) this.d);
                    return;
                } else {
                    h4x.G.b("Discarded message for unknown namespace '%s'", str5);
                    return;
                }
            case 23:
                ((r5x) this.b).D((z6n) this.c, (qtm) this.d);
                return;
            case 24:
                ((r5x) this.b).C((psd) this.c, (com.yandex.plus.pay.inapp.google.internal.a) this.d);
                return;
            case 25:
                ((r5x) this.b).B((fd) this.c, (com.yandex.plus.pay.inapp.google.internal.a) this.d);
                return;
            case 26:
                b();
                return;
            case 27:
                c();
                return;
            default:
                synchronized (((fox) this.b).H) {
                    xunVar2 = (xun) ((fox) this.b).H.get((String) this.c);
                }
                if (xunVar2 != null) {
                    xunVar2.o((String) this.d);
                    return;
                } else {
                    fox.D0.b("Discarded message for unknown namespace '%s'", (String) this.c);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.a) {
            case 19:
                return ((Runnable) this.c).toString() + "(scheduled in SynchronizationContext)";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ nud() {
        this.a = 16;
    }

    public /* synthetic */ nud(View view, Object obj, Object obj2, int i) {
        this.a = i;
        this.c = view;
        this.b = obj;
        this.d = obj2;
    }

    public /* synthetic */ nud(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
