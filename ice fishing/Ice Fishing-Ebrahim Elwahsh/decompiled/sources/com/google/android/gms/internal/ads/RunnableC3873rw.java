package com.google.android.gms.internal.ads;

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

/* renamed from: com.google.android.gms.internal.ads.rw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3873rw implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34141n;

    /* renamed from: u, reason: collision with root package name */
    public Object f34142u;

    public /* synthetic */ RunnableC3873rw() {
        this.f34141n = 11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        J3.a aVar;
        Object obj;
        int i = 10;
        boolean z8 = true;
        char c4 = 1;
        boolean z9 = true;
        switch (this.f34141n) {
            case 0:
                ((WebView) this.f34142u).destroy();
                return;
            case 1:
                C2593Hm c2593Hm = ((C4197xw) this.f34142u).f35281e;
                c2593Hm.getClass();
                AsyncTaskC4305zw asyncTaskC4305zw = new AsyncTaskC4305zw(c2593Hm);
                C4017ue c4017ue = (C4017ue) c2593Hm.f25416u;
                asyncTaskC4305zw.f35425a = c4017ue;
                ArrayDeque arrayDeque = (ArrayDeque) c4017ue.f34631v;
                arrayDeque.add(asyncTaskC4305zw);
                if (((AbstractAsyncTaskC4251yw) c4017ue.f34632w) == null) {
                    AbstractAsyncTaskC4251yw abstractAsyncTaskC4251yw = (AbstractAsyncTaskC4251yw) arrayDeque.poll();
                    c4017ue.f34632w = abstractAsyncTaskC4251yw;
                    if (abstractAsyncTaskC4251yw != null) {
                        abstractAsyncTaskC4251yw.executeOnExecutor((ThreadPoolExecutor) c4017ue.f34630u, new Object[0]);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                BinderC3283gx binderC3283gx = new BinderC3283gx();
                Log.d("GASS", "Clearcut logging disabled");
                ((h3.h) this.f34142u).b(new C3119dx(binderC3283gx));
                return;
            case 3:
                ((HttpURLConnection) this.f34142u).disconnect();
                return;
            case 4:
                C4146wz c4146wz = (C4146wz) this.f34142u;
                Ez ez = (Ez) c4146wz.f35102a.d();
                long j9 = c4146wz.f35106e;
                if (j9 <= 0) {
                    ez.a();
                    return;
                } else {
                    ez.getClass();
                    ez.f24875e.a(new RunnableC3873rw(5, ez), j9);
                    return;
                }
            case 5:
                ((Ez) this.f34142u).a();
                return;
            case 6:
                C3727pA c3727pA = (C3727pA) this.f34142u;
                c3727pA.getClass();
                J3.a b9 = ((C3157eg) c3727pA.f33338d).b(new Vs(i, c3727pA));
                c3727pA.f33337c.e(53, b9);
                c3727pA.f33341g = b9;
                return;
            case 7:
                C3781qA c3781qA = (C3781qA) this.f34142u;
                c3781qA.getClass();
                Q0.h hVar = new Q0.h(c3781qA);
                try {
                    Object systemService = c3781qA.f33662a.getSystemService("connectivity");
                    if (systemService == null) {
                        throw null;
                    }
                    ((ConnectivityManager) systemService).registerDefaultNetworkCallback(hVar);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 8:
                C4050vA c4050vA = (C4050vA) this.f34142u;
                c4050vA.getClass();
                C7 c72 = new C7(c4050vA);
                try {
                    Object systemService2 = c4050vA.f34734a.getSystemService("appops");
                    if (systemService2 == null) {
                        throw null;
                    }
                    ((AppOpsManager) systemService2).startWatchingActive(C4050vA.f34733g, c4050vA.f34735b, c72);
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 9:
                C2631Jq c2631Jq = ((JA) this.f34142u).f25737n;
                ((HE) c2631Jq.f25825w).a("unlinkToDeath", new Object[0]);
                BA ba = (BA) c2631Jq.f25821C;
                ba.getClass();
                ((Z2.a) ba).f4243u.unlinkToDeath((KA) c2631Jq.f25819A, 0);
                c2631Jq.f25821C = null;
                c2631Jq.f25822n = false;
                return;
            case 10:
                C2631Jq c2631Jq2 = (C2631Jq) this.f34142u;
                if (((BA) c2631Jq2.f25821C) != null) {
                    ((HE) c2631Jq2.f25825w).a("Unbind from service.", new Object[0]);
                    Context context = (Context) c2631Jq2.f25823u;
                    JA ja = (JA) c2631Jq2.f25820B;
                    ja.getClass();
                    context.unbindService(ja);
                    c2631Jq2.f25822n = false;
                    c2631Jq2.f25821C = null;
                    c2631Jq2.f25820B = null;
                    ArrayList arrayList = (ArrayList) c2631Jq2.f25827y;
                    synchronized (arrayList) {
                        arrayList.clear();
                    }
                    return;
                }
                return;
            case 11:
                C2974bE c2974bE = (C2974bE) this.f34142u;
                if (c2974bE == null || (aVar = c2974bE.f29435A) == null) {
                    return;
                }
                this.f34142u = null;
                if (aVar.isDone()) {
                    c2974bE.n(aVar);
                    return;
                }
                try {
                    ScheduledFuture scheduledFuture = c2974bE.f29436B;
                    c2974bE.f29436B = null;
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
                            c2974bE.e(new C2919aE(str));
                            throw th;
                        }
                    }
                    String obj2 = aVar.toString();
                    StringBuilder sb2 = new StringBuilder(str.length() + 2 + obj2.length());
                    sb2.append(str);
                    sb2.append(": ");
                    sb2.append(obj2);
                    c2974bE.e(new C2919aE(sb2.toString()));
                    return;
                } finally {
                    aVar.cancel(true);
                }
            case 12:
                C3093dO c3093dO = (C3093dO) this.f34142u;
                c3093dO.getClass();
                String str2 = AbstractC3548lu.f32613a;
                int generateAudioSessionId = AbstractC2655Lg.b(c3093dO.f30049y).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                C2728Pl c2728Pl = c3093dO.f30030U;
                C3709ot c3709ot = (C3709ot) c2728Pl.f27031c;
                Looper myLooper = Looper.myLooper();
                if (myLooper == c3709ot.f33230a.getLooper()) {
                    obj = c2728Pl.f27033e;
                } else {
                    PA.T(myLooper == ((C3709ot) c2728Pl.f27030b).f33230a.getLooper());
                    obj = c2728Pl.f27034f;
                }
                if (((Integer) obj).intValue() != generateAudioSessionId) {
                    Integer valueOf = Integer.valueOf(generateAudioSessionId);
                    c2728Pl.f27034f = valueOf;
                    MD md = new MD(22, c2728Pl, valueOf);
                    C3709ot c3709ot2 = (C3709ot) c2728Pl.f27031c;
                    if (c3709ot2.f33230a.getLooper().getThread().isAlive()) {
                        c3709ot2.e(md);
                    }
                    c3093dO.M1(1, 10, valueOf);
                    c3093dO.M1(2, 10, valueOf);
                    return;
                }
                return;
            case 13:
                OO oo = ((C3365iO) this.f34142u).f31353O;
                oo.s(oo.v(), 1034, new MO(c4 == true ? 1 : 0));
                return;
            case 14:
                CO co = (CO) this.f34142u;
                try {
                    synchronized (co) {
                    }
                    try {
                        co.f24167a.c(co.f24169c, co.f24170d);
                        return;
                    } finally {
                        co.b(true);
                    }
                } catch (RN e6) {
                    AbstractC3217fl.X("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e6);
                    throw new RuntimeException(e6);
                }
            case 15:
                OO oo2 = (OO) this.f34142u;
                oo2.s(oo2.v(), 1028, new MO(23));
                oo2.f26696f.e();
                return;
            case 16:
                ((C4287ze) this.f34142u).l();
                return;
            case 17:
                EP ep = (EP) this.f34142u;
                if (ep.f24739V >= 300000) {
                    ((GP) ep.f24752l.f26393u).f25164w1 = true;
                    ep.f24739V = 0L;
                    return;
                }
                return;
            default:
                VP vp = (VP) this.f34142u;
                Object obj3 = vp.f28247a;
                synchronized (obj3) {
                    try {
                        if (vp.f28258m) {
                            return;
                        }
                        long j10 = vp.f28257l - 1;
                        vp.f28257l = j10;
                        if (j10 > 0) {
                            return;
                        }
                        if (j10 >= 0) {
                            vp.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (obj3) {
                            vp.f28259n = illegalStateException;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    public /* synthetic */ RunnableC3873rw(int i, Object obj) {
        this.f34141n = i;
        this.f34142u = obj;
    }

    public /* synthetic */ RunnableC3873rw(C3365iO c3365iO, int i) {
        this.f34141n = 13;
        this.f34142u = c3365iO;
    }

    public RunnableC3873rw(C3927sw c3927sw) {
        this.f34141n = 0;
        Objects.requireNonNull(c3927sw);
        this.f34142u = c3927sw.f34327e;
    }

    public RunnableC3873rw(C4197xw c4197xw) {
        this.f34141n = 1;
        Objects.requireNonNull(c4197xw);
        this.f34142u = c4197xw;
    }
}
