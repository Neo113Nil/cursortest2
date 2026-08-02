package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Looper;
import android.util.Log;
import android.webkit.WebView;
import c3.AbstractC0549a;
import java.net.HttpURLConnection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.qw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3830qw implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34208n;

    /* renamed from: u, reason: collision with root package name */
    public Object f34209u;

    public /* synthetic */ RunnableC3830qw() {
        this.f34208n = 11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        P3.a aVar;
        Object obj;
        int i = 10;
        boolean z6 = true;
        char c9 = 1;
        boolean z9 = true;
        switch (this.f34208n) {
            case 0:
                ((WebView) this.f34209u).destroy();
                return;
            case 1:
                S0.c cVar = ((C4099vw) this.f34209u).f35537e;
                cVar.getClass();
                AsyncTaskC4207xw asyncTaskC4207xw = new AsyncTaskC4207xw(cVar);
                C4297ze c4297ze = (C4297ze) cVar.f2903v;
                asyncTaskC4207xw.f35685a = c4297ze;
                ArrayDeque arrayDeque = (ArrayDeque) c4297ze.f36134v;
                arrayDeque.add(asyncTaskC4207xw);
                if (((AbstractAsyncTaskC4153ww) c4297ze.f36135w) == null) {
                    AbstractAsyncTaskC4153ww abstractAsyncTaskC4153ww = (AbstractAsyncTaskC4153ww) arrayDeque.poll();
                    c4297ze.f36135w = abstractAsyncTaskC4153ww;
                    if (abstractAsyncTaskC4153ww != null) {
                        abstractAsyncTaskC4153ww.executeOnExecutor((ThreadPoolExecutor) c4297ze.f36133u, new Object[0]);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                BinderC3293gx binderC3293gx = new BinderC3293gx();
                Log.d("GASS", "Clearcut logging disabled");
                ((l3.h) this.f34209u).b(new C3131dx(binderC3293gx));
                return;
            case 3:
                ((HttpURLConnection) this.f34209u).disconnect();
                return;
            case 4:
                C4048uz c4048uz = (C4048uz) this.f34209u;
                Cz cz = (Cz) c4048uz.f35379a.f();
                long j6 = c4048uz.f35383e;
                if (j6 <= 0) {
                    cz.a();
                    return;
                } else {
                    cz.getClass();
                    cz.f25029e.a(new RunnableC3830qw(5, cz), j6);
                    return;
                }
            case 5:
                ((Cz) this.f34209u).a();
                return;
            case 6:
                C3629nA c3629nA = (C3629nA) this.f34209u;
                c3629nA.getClass();
                P3.a b9 = ((C3383ig) c3629nA.f33480d).b(new Ts(i, c3629nA));
                c3629nA.f33479c.e(53, b9);
                c3629nA.f33483g = b9;
                return;
            case 7:
                C3683oA c3683oA = (C3683oA) this.f34209u;
                c3683oA.getClass();
                Q0.h hVar = new Q0.h(c3683oA);
                try {
                    Object systemService = c3683oA.f33650a.getSystemService("connectivity");
                    if (systemService == null) {
                        throw null;
                    }
                    ((ConnectivityManager) systemService).registerDefaultNetworkCallback(hVar);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 8:
                C3898sA c3898sA = (C3898sA) this.f34209u;
                c3898sA.getClass();
                D7 d72 = new D7(c3898sA);
                try {
                    Object systemService2 = c3898sA.f34670a.getSystemService("appops");
                    if (systemService2 == null) {
                        throw null;
                    }
                    ((AppOpsManager) systemService2).startWatchingActive(C3898sA.f34669g, c3898sA.f34671b, d72);
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 9:
                C2618Hq c2618Hq = ((GA) this.f34209u).f25730n;
                ((C3956tE) c2618Hq.f26135w).a("unlinkToDeath", new Object[0]);
                InterfaceC4222yA interfaceC4222yA = (InterfaceC4222yA) c2618Hq.f26131C;
                interfaceC4222yA.getClass();
                ((AbstractC0549a) interfaceC4222yA).f5722u.unlinkToDeath((HA) c2618Hq.f26129A, 0);
                c2618Hq.f26131C = null;
                c2618Hq.f26132n = false;
                return;
            case 10:
                C2618Hq c2618Hq2 = (C2618Hq) this.f34209u;
                if (((InterfaceC4222yA) c2618Hq2.f26131C) != null) {
                    ((C3956tE) c2618Hq2.f26135w).a("Unbind from service.", new Object[0]);
                    Context context = (Context) c2618Hq2.f26133u;
                    GA ga = (GA) c2618Hq2.f26130B;
                    ga.getClass();
                    context.unbindService(ga);
                    c2618Hq2.f26132n = false;
                    c2618Hq2.f26131C = null;
                    c2618Hq2.f26130B = null;
                    ArrayList arrayList = (ArrayList) c2618Hq2.f26137y;
                    synchronized (arrayList) {
                        arrayList.clear();
                    }
                    return;
                }
                return;
            case 11:
                ZD zd = (ZD) this.f34209u;
                if (zd == null || (aVar = zd.f29635A) == null) {
                    return;
                }
                this.f34209u = null;
                if (aVar.isDone()) {
                    zd.n(aVar);
                    return;
                }
                try {
                    ScheduledFuture scheduledFuture = zd.f29636B;
                    zd.f29636B = null;
                    String str = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (abs > 10) {
                                StringBuilder sb = new StringBuilder(String.valueOf(abs).length() + 55);
                                sb.append("Timed out (timeout delayed by ");
                                sb.append(abs);
                                sb.append(" ms after scheduled time)");
                                str = sb.toString();
                            }
                        } catch (Throwable th) {
                            zd.e(new YD(str));
                            throw th;
                        }
                    }
                    String obj2 = aVar.toString();
                    StringBuilder sb2 = new StringBuilder(str.length() + 2 + obj2.length());
                    sb2.append(str);
                    sb2.append(": ");
                    sb2.append(obj2);
                    zd.e(new YD(sb2.toString()));
                    return;
                } finally {
                    aVar.cancel(true);
                }
            case 12:
                PN pn = (PN) this.f34209u;
                pn.getClass();
                String str2 = AbstractC3182eu.f30782a;
                int generateAudioSessionId = AbstractC2659Kg.b(pn.f27591y).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                C2749Pl c2749Pl = pn.f27567T;
                C3235ft c3235ft = (C3235ft) c2749Pl.f27644c;
                Looper myLooper = Looper.myLooper();
                if (myLooper == c3235ft.f31231a.getLooper()) {
                    obj = c2749Pl.f27646e;
                } else {
                    AbstractC2792Sd.H(myLooper == ((C3235ft) c2749Pl.f27643b).f31231a.getLooper());
                    obj = c2749Pl.f27647f;
                }
                if (((Integer) obj).intValue() != generateAudioSessionId) {
                    Integer valueOf = Integer.valueOf(generateAudioSessionId);
                    c2749Pl.f27647f = valueOf;
                    RunnableC3996u0 runnableC3996u0 = new RunnableC3996u0(20, c2749Pl, valueOf);
                    C3235ft c3235ft2 = (C3235ft) c2749Pl.f27644c;
                    if (c3235ft2.f31231a.getLooper().getThread().isAlive()) {
                        c3235ft2.e(runnableC3996u0);
                    }
                    pn.h2(1, 10, valueOf);
                    pn.h2(2, 10, valueOf);
                    return;
                }
                return;
            case 13:
                BO bo = ((VN) this.f34209u).f28952O;
                bo.s(bo.t(), 1034, new C4290zO(c9 == true ? 1 : 0));
                return;
            case 14:
                C3751pO c3751pO = (C3751pO) this.f34209u;
                try {
                    synchronized (c3751pO) {
                    }
                    try {
                        c3751pO.f33854a.b(c3751pO.f33856c, c3751pO.f33857d);
                        return;
                    } finally {
                        c3751pO.b(true);
                    }
                } catch (DN e9) {
                    AbstractC2991bG.J("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e9);
                    throw new RuntimeException(e9);
                }
            case 15:
                BO bo2 = (BO) this.f34209u;
                bo2.s(bo2.t(), 1028, new C4290zO(23));
                bo2.f24671f.e();
                return;
            case 16:
                ((C2521Ce) this.f34209u).l();
                return;
            case 17:
                C3859rP c3859rP = (C3859rP) this.f34209u;
                if (c3859rP.f34378V >= 300000) {
                    ((C3967tP) c3859rP.f34391l.f32643u).f35074q1 = true;
                    c3859rP.f34378V = 0L;
                    return;
                }
                return;
            default:
                IP ip = (IP) this.f34209u;
                Object obj3 = ip.f26244a;
                synchronized (obj3) {
                    try {
                        if (ip.f26255m) {
                            return;
                        }
                        long j9 = ip.f26254l - 1;
                        ip.f26254l = j9;
                        if (j9 > 0) {
                            return;
                        }
                        if (j9 >= 0) {
                            ip.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (obj3) {
                            ip.f26256n = illegalStateException;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    public /* synthetic */ RunnableC3830qw(int i, Object obj) {
        this.f34208n = i;
        this.f34209u = obj;
    }

    public /* synthetic */ RunnableC3830qw(VN vn, int i) {
        this.f34208n = 13;
        this.f34209u = vn;
    }

    public RunnableC3830qw(C3883rw c3883rw) {
        this.f34208n = 0;
        Objects.requireNonNull(c3883rw);
        this.f34209u = c3883rw.f34542e;
    }

    public RunnableC3830qw(C4099vw c4099vw) {
        this.f34208n = 1;
        Objects.requireNonNull(c4099vw);
        this.f34209u = c4099vw;
    }
}
