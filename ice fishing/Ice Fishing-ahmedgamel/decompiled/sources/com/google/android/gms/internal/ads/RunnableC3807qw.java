package com.google.android.gms.internal.ads;

import a3.AbstractC0432a;
import android.app.AppOpsManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Looper;
import android.util.Log;
import android.webkit.WebView;
import java.net.HttpURLConnection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.qw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3807qw implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33441n;

    /* renamed from: u, reason: collision with root package name */
    public Object f33442u;

    public /* synthetic */ RunnableC3807qw() {
        this.f33441n = 11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        N3.a aVar;
        Object obj;
        int i = 10;
        boolean z3 = true;
        char c9 = 1;
        boolean z6 = true;
        switch (this.f33441n) {
            case 0:
                ((WebView) this.f33442u).destroy();
                return;
            case 1:
                S0.c cVar = ((C4076vw) this.f33442u).f34768e;
                cVar.getClass();
                AsyncTaskC4184xw asyncTaskC4184xw = new AsyncTaskC4184xw(cVar);
                C4274ze c4274ze = (C4274ze) cVar.f2776v;
                asyncTaskC4184xw.f34904a = c4274ze;
                ArrayDeque arrayDeque = (ArrayDeque) c4274ze.f35361v;
                arrayDeque.add(asyncTaskC4184xw);
                if (((AbstractAsyncTaskC4130ww) c4274ze.f35362w) == null) {
                    AbstractAsyncTaskC4130ww abstractAsyncTaskC4130ww = (AbstractAsyncTaskC4130ww) arrayDeque.poll();
                    c4274ze.f35362w = abstractAsyncTaskC4130ww;
                    if (abstractAsyncTaskC4130ww != null) {
                        abstractAsyncTaskC4130ww.executeOnExecutor((ThreadPoolExecutor) c4274ze.f35360u, new Object[0]);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                BinderC3270gx binderC3270gx = new BinderC3270gx();
                Log.d("GASS", "Clearcut logging disabled");
                ((j3.h) this.f33442u).b(new C3108dx(binderC3270gx));
                return;
            case 3:
                ((HttpURLConnection) this.f33442u).disconnect();
                return;
            case 4:
                C4025uz c4025uz = (C4025uz) this.f33442u;
                Cz cz = (Cz) c4025uz.f34616a.f();
                long j6 = c4025uz.f34620e;
                if (j6 <= 0) {
                    cz.a();
                    return;
                } else {
                    cz.getClass();
                    cz.f24284e.a(new RunnableC3807qw(5, cz), j6);
                    return;
                }
            case 5:
                ((Cz) this.f33442u).a();
                return;
            case 6:
                C3606nA c3606nA = (C3606nA) this.f33442u;
                c3606nA.getClass();
                N3.a b9 = ((C3360ig) c3606nA.f32702d).b(new Ts(i, c3606nA));
                c3606nA.f32701c.e(53, b9);
                c3606nA.f32705g = b9;
                return;
            case 7:
                C3660oA c3660oA = (C3660oA) this.f33442u;
                c3660oA.getClass();
                Q0.h hVar = new Q0.h(c3660oA);
                try {
                    Object systemService = c3660oA.f32863a.getSystemService("connectivity");
                    if (systemService == null) {
                        throw null;
                    }
                    ((ConnectivityManager) systemService).registerDefaultNetworkCallback(hVar);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 8:
                C3875sA c3875sA = (C3875sA) this.f33442u;
                c3875sA.getClass();
                D7 d72 = new D7(c3875sA);
                try {
                    Object systemService2 = c3875sA.f33902a.getSystemService("appops");
                    if (systemService2 == null) {
                        throw null;
                    }
                    ((AppOpsManager) systemService2).startWatchingActive(C3875sA.f33901g, c3875sA.f33903b, d72);
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 9:
                C2598Hq c2598Hq = ((GA) this.f33442u).f24940n;
                ((C3933tE) c2598Hq.f25392w).a("unlinkToDeath", new Object[0]);
                InterfaceC4199yA interfaceC4199yA = (InterfaceC4199yA) c2598Hq.f25388C;
                interfaceC4199yA.getClass();
                ((AbstractC0432a) interfaceC4199yA).f4329u.unlinkToDeath((HA) c2598Hq.f25386A, 0);
                c2598Hq.f25388C = null;
                c2598Hq.f25389n = false;
                return;
            case 10:
                C2598Hq c2598Hq2 = (C2598Hq) this.f33442u;
                if (((InterfaceC4199yA) c2598Hq2.f25388C) != null) {
                    ((C3933tE) c2598Hq2.f25392w).a("Unbind from service.", new Object[0]);
                    Context context = (Context) c2598Hq2.f25390u;
                    GA ga = (GA) c2598Hq2.f25387B;
                    ga.getClass();
                    context.unbindService(ga);
                    c2598Hq2.f25389n = false;
                    c2598Hq2.f25388C = null;
                    c2598Hq2.f25387B = null;
                    ArrayList arrayList = (ArrayList) c2598Hq2.f25394y;
                    synchronized (arrayList) {
                        arrayList.clear();
                    }
                    return;
                }
                return;
            case 11:
                ZD zd = (ZD) this.f33442u;
                if (zd == null || (aVar = zd.f28855A) == null) {
                    return;
                }
                this.f33442u = null;
                if (aVar.isDone()) {
                    zd.n(aVar);
                    return;
                }
                try {
                    ScheduledFuture scheduledFuture = zd.f28856B;
                    zd.f28856B = null;
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
                PN pn = (PN) this.f33442u;
                pn.getClass();
                String str2 = AbstractC3159eu.f29993a;
                int generateAudioSessionId = AbstractC2639Kg.b(pn.f26809y).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                C2712Ol c2712Ol = pn.f26789T;
                C3212ft c3212ft = (C3212ft) c2712Ol.f26652c;
                Looper myLooper = Looper.myLooper();
                if (myLooper == c3212ft.f30468a.getLooper()) {
                    obj = c2712Ol.f26654e;
                } else {
                    AbstractC2772Sd.H(myLooper == ((C3212ft) c2712Ol.f26651b).f30468a.getLooper());
                    obj = c2712Ol.f26655f;
                }
                if (((Integer) obj).intValue() != generateAudioSessionId) {
                    Integer valueOf = Integer.valueOf(generateAudioSessionId);
                    c2712Ol.f26655f = valueOf;
                    RunnableC3973u0 runnableC3973u0 = new RunnableC3973u0(20, c2712Ol, valueOf);
                    C3212ft c3212ft2 = (C3212ft) c2712Ol.f26652c;
                    if (c3212ft2.f30468a.getLooper().getThread().isAlive()) {
                        c3212ft2.e(runnableC3973u0);
                    }
                    pn.h2(1, 10, valueOf);
                    pn.h2(2, 10, valueOf);
                    return;
                }
                return;
            case 13:
                BO bo = ((VN) this.f33442u).f28160O;
                bo.s(bo.t(), 1034, new C4267zO(c9 == true ? 1 : 0));
                return;
            case 14:
                C3728pO c3728pO = (C3728pO) this.f33442u;
                try {
                    synchronized (c3728pO) {
                    }
                    try {
                        c3728pO.f33064a.b(c3728pO.f33066c, c3728pO.f33067d);
                        return;
                    } finally {
                        c3728pO.b(true);
                    }
                } catch (DN e9) {
                    AbstractC2968bG.J("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e9);
                    throw new RuntimeException(e9);
                }
            case 15:
                BO bo2 = (BO) this.f33442u;
                bo2.s(bo2.t(), 1028, new C4267zO(23));
                bo2.f23900f.e();
                return;
            case 16:
                ((C2501Ce) this.f33442u).l();
                return;
            case 17:
                C3836rP c3836rP = (C3836rP) this.f33442u;
                if (c3836rP.f33610V >= 300000) {
                    ((C3944tP) c3836rP.f33623l.f31863u).f34287v1 = true;
                    c3836rP.f33610V = 0L;
                    return;
                }
                return;
            default:
                IP ip = (IP) this.f33442u;
                Object obj3 = ip.f25501a;
                synchronized (obj3) {
                    try {
                        if (ip.f25512m) {
                            return;
                        }
                        long j9 = ip.f25511l - 1;
                        ip.f25511l = j9;
                        if (j9 > 0) {
                            return;
                        }
                        if (j9 >= 0) {
                            ip.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (obj3) {
                            ip.f25513n = illegalStateException;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    public /* synthetic */ RunnableC3807qw(int i, Object obj) {
        this.f33441n = i;
        this.f33442u = obj;
    }

    public /* synthetic */ RunnableC3807qw(VN vn, int i) {
        this.f33441n = 13;
        this.f33442u = vn;
    }

    public RunnableC3807qw(C3860rw c3860rw) {
        this.f33441n = 0;
        Objects.requireNonNull(c3860rw);
        this.f33442u = c3860rw.f33774e;
    }

    public RunnableC3807qw(C4076vw c4076vw) {
        this.f33441n = 1;
        Objects.requireNonNull(c4076vw);
        this.f33442u = c4076vw;
    }
}
