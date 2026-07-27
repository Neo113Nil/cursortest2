package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Uc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2803Uc implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27935n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g7.m f27936u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C2851Xc f27937v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C2720Pc f27938w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ArrayList f27939x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f27940y;

    public RunnableC2803Uc(g7.m mVar, C2851Xc c2851Xc, C2720Pc c2720Pc, ArrayList arrayList, long j6, int i) {
        this.f27935n = i;
        switch (i) {
            case 1:
                this.f27936u = mVar;
                this.f27937v = c2851Xc;
                this.f27938w = c2720Pc;
                this.f27939x = arrayList;
                this.f27940y = j6;
                break;
            default:
                this.f27937v = c2851Xc;
                this.f27938w = c2720Pc;
                this.f27939x = arrayList;
                this.f27940y = j6;
                Objects.requireNonNull(mVar);
                this.f27936u = mVar;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String sb;
        switch (this.f27935n) {
            case 0:
                u2.z.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
                g7.m mVar = this.f27936u;
                synchronized (mVar.f37666d) {
                    try {
                        u2.z.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                        C2851Xc c2851Xc = this.f27937v;
                        if (((AtomicInteger) c2851Xc.f732v).get() != -1 && ((AtomicInteger) c2851Xc.f732v).get() != 1) {
                            C3301ha c3301ha = AbstractC3569ma.C8;
                            q2.r rVar = q2.r.f40204e;
                            if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                                c2851Xc.r("SdkJavascriptFactory.loadJavascriptEngine.Runnable", new TimeoutException("Unable to fully load JS engine."));
                            } else {
                                c2851Xc.q();
                            }
                            AbstractC3413jg.f31273f.execute(new RunnableC2787Tc(this.f27938w, 0));
                            String valueOf = String.valueOf(rVar.f40207c.a(AbstractC3569ma.f32231e));
                            int i = ((AtomicInteger) c2851Xc.f732v).get();
                            int i6 = mVar.f37665c;
                            ArrayList arrayList = this.f27939x;
                            if (arrayList.isEmpty()) {
                                sb = ". Still waiting for the engine to be loaded";
                            } else {
                                String valueOf2 = String.valueOf(arrayList.get(0));
                                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 88);
                                sb2.append(". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ");
                                sb2.append(valueOf2);
                                sb = sb2.toString();
                            }
                            C4835j.f39730C.f39742k.getClass();
                            long currentTimeMillis = System.currentTimeMillis() - this.f27940y;
                            StringBuilder sb3 = new StringBuilder(valueOf.length() + 107 + String.valueOf(i).length() + 36 + String.valueOf(i6).length() + sb.length() + 39 + String.valueOf(currentTimeMillis).length() + 26);
                            sb3.append("Could not finish the full JS engine loading in ");
                            sb3.append(valueOf);
                            sb3.append(" ms. JS engine session reference status(fullLoadTimeout) is ");
                            sb3.append(i);
                            sb3.append(". Update status(fullLoadTimeout) is ");
                            sb3.append(i6);
                            sb3.append(sb);
                            sb3.append(" ms. Total latency(fullLoadTimeout) is ");
                            sb3.append(currentTimeMillis);
                            sb3.append(" ms at timeout. Rejecting.");
                            u2.z.k(sb3.toString());
                            u2.z.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                            return;
                        }
                        u2.z.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
                        return;
                    } finally {
                    }
                }
            default:
                g7.m mVar2 = this.f27936u;
                C2851Xc c2851Xc2 = this.f27937v;
                C2720Pc c2720Pc = this.f27938w;
                ArrayList arrayList2 = this.f27939x;
                long j6 = this.f27940y;
                mVar2.getClass();
                u2.z.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
                synchronized (mVar2.f37666d) {
                    try {
                        u2.z.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                        if (((AtomicInteger) c2851Xc2.f732v).get() != -1 && ((AtomicInteger) c2851Xc2.f732v).get() != 1) {
                            C3301ha c3301ha2 = AbstractC3569ma.C8;
                            q2.r rVar2 = q2.r.f40204e;
                            if (((Boolean) rVar2.f40207c.a(c3301ha2)).booleanValue()) {
                                c2851Xc2.r("SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener", new TimeoutException("Unable to receive /jsLoaded GMSG."));
                            } else {
                                c2851Xc2.q();
                            }
                            AbstractC3413jg.f31273f.execute(new RunnableC2787Tc(c2720Pc, 1));
                            String valueOf3 = String.valueOf(rVar2.f40207c.a(AbstractC3569ma.f32222d));
                            int i9 = ((AtomicInteger) c2851Xc2.f732v).get();
                            int i10 = mVar2.f37665c;
                            String valueOf4 = String.valueOf(arrayList2.get(0));
                            C4835j.f39730C.f39742k.getClass();
                            long currentTimeMillis2 = System.currentTimeMillis() - j6;
                            StringBuilder sb4 = new StringBuilder(valueOf3.length() + 94 + String.valueOf(i9).length() + 39 + String.valueOf(i10).length() + 57 + valueOf4.length() + 42 + String.valueOf(currentTimeMillis2).length() + 15);
                            sb4.append("Could not receive /jsLoaded in ");
                            sb4.append(valueOf3);
                            sb4.append(" ms. JS engine session reference status(onEngLoadedTimeout) is ");
                            sb4.append(i9);
                            sb4.append(". Update status(onEngLoadedTimeout) is ");
                            sb4.append(i10);
                            sb4.append(". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is ");
                            sb4.append(valueOf4);
                            sb4.append(" ms. Total latency(onEngLoadedTimeout) is ");
                            sb4.append(currentTimeMillis2);
                            sb4.append(" ms. Rejecting.");
                            u2.z.k(sb4.toString());
                            u2.z.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                            return;
                        }
                        u2.z.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
                        return;
                    } finally {
                    }
                }
        }
    }
}
