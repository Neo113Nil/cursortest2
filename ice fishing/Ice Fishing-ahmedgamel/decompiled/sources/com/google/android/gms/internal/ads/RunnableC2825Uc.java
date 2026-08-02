package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Uc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2825Uc implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28733n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g7.m f28734u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C2874Xc f28735v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C2740Pc f28736w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ArrayList f28737x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f28738y;

    public RunnableC2825Uc(g7.m mVar, C2874Xc c2874Xc, C2740Pc c2740Pc, ArrayList arrayList, long j6, int i) {
        this.f28733n = i;
        switch (i) {
            case 1:
                this.f28734u = mVar;
                this.f28735v = c2874Xc;
                this.f28736w = c2740Pc;
                this.f28737x = arrayList;
                this.f28738y = j6;
                break;
            default:
                this.f28735v = c2874Xc;
                this.f28736w = c2740Pc;
                this.f28737x = arrayList;
                this.f28738y = j6;
                Objects.requireNonNull(mVar);
                this.f28734u = mVar;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String sb;
        switch (this.f28733n) {
            case 0:
                w2.z.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
                g7.m mVar = this.f28734u;
                synchronized (mVar.f37691d) {
                    try {
                        w2.z.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                        C2874Xc c2874Xc = this.f28735v;
                        if (((AtomicInteger) c2874Xc.f257v).get() != -1 && ((AtomicInteger) c2874Xc.f257v).get() != 1) {
                            C3324ha c3324ha = AbstractC3592ma.C8;
                            s2.r rVar = s2.r.f40506e;
                            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                                c2874Xc.r("SdkJavascriptFactory.loadJavascriptEngine.Runnable", new TimeoutException("Unable to fully load JS engine."));
                            } else {
                                c2874Xc.q();
                            }
                            AbstractC3436jg.f32060f.execute(new RunnableC2808Tc(this.f28736w, 0));
                            String valueOf = String.valueOf(rVar.f40509c.a(AbstractC3592ma.f33011e));
                            int i = ((AtomicInteger) c2874Xc.f257v).get();
                            int i4 = mVar.f37690c;
                            ArrayList arrayList = this.f28737x;
                            if (arrayList.isEmpty()) {
                                sb = ". Still waiting for the engine to be loaded";
                            } else {
                                String valueOf2 = String.valueOf(arrayList.get(0));
                                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 88);
                                sb2.append(". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ");
                                sb2.append(valueOf2);
                                sb = sb2.toString();
                            }
                            C4906k.f40186C.f40198k.getClass();
                            long currentTimeMillis = System.currentTimeMillis() - this.f28738y;
                            StringBuilder sb3 = new StringBuilder(valueOf.length() + 107 + String.valueOf(i).length() + 36 + String.valueOf(i4).length() + sb.length() + 39 + String.valueOf(currentTimeMillis).length() + 26);
                            sb3.append("Could not finish the full JS engine loading in ");
                            sb3.append(valueOf);
                            sb3.append(" ms. JS engine session reference status(fullLoadTimeout) is ");
                            sb3.append(i);
                            sb3.append(". Update status(fullLoadTimeout) is ");
                            sb3.append(i4);
                            sb3.append(sb);
                            sb3.append(" ms. Total latency(fullLoadTimeout) is ");
                            sb3.append(currentTimeMillis);
                            sb3.append(" ms at timeout. Rejecting.");
                            w2.z.k(sb3.toString());
                            w2.z.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                            return;
                        }
                        w2.z.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
                        return;
                    } finally {
                    }
                }
            default:
                g7.m mVar2 = this.f28734u;
                C2874Xc c2874Xc2 = this.f28735v;
                C2740Pc c2740Pc = this.f28736w;
                ArrayList arrayList2 = this.f28737x;
                long j6 = this.f28738y;
                mVar2.getClass();
                w2.z.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
                synchronized (mVar2.f37691d) {
                    try {
                        w2.z.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                        if (((AtomicInteger) c2874Xc2.f257v).get() != -1 && ((AtomicInteger) c2874Xc2.f257v).get() != 1) {
                            C3324ha c3324ha2 = AbstractC3592ma.C8;
                            s2.r rVar2 = s2.r.f40506e;
                            if (((Boolean) rVar2.f40509c.a(c3324ha2)).booleanValue()) {
                                c2874Xc2.r("SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener", new TimeoutException("Unable to receive /jsLoaded GMSG."));
                            } else {
                                c2874Xc2.q();
                            }
                            AbstractC3436jg.f32060f.execute(new RunnableC2808Tc(c2740Pc, 1));
                            String valueOf3 = String.valueOf(rVar2.f40509c.a(AbstractC3592ma.f33001d));
                            int i6 = ((AtomicInteger) c2874Xc2.f257v).get();
                            int i9 = mVar2.f37690c;
                            String valueOf4 = String.valueOf(arrayList2.get(0));
                            C4906k.f40186C.f40198k.getClass();
                            long currentTimeMillis2 = System.currentTimeMillis() - j6;
                            StringBuilder sb4 = new StringBuilder(valueOf3.length() + 94 + String.valueOf(i6).length() + 39 + String.valueOf(i9).length() + 57 + valueOf4.length() + 42 + String.valueOf(currentTimeMillis2).length() + 15);
                            sb4.append("Could not receive /jsLoaded in ");
                            sb4.append(valueOf3);
                            sb4.append(" ms. JS engine session reference status(onEngLoadedTimeout) is ");
                            sb4.append(i6);
                            sb4.append(". Update status(onEngLoadedTimeout) is ");
                            sb4.append(i9);
                            sb4.append(". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is ");
                            sb4.append(valueOf4);
                            sb4.append(" ms. Total latency(onEngLoadedTimeout) is ");
                            sb4.append(currentTimeMillis2);
                            sb4.append(" ms. Rejecting.");
                            w2.z.k(sb4.toString());
                            w2.z.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                            return;
                        }
                        w2.z.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
                        return;
                    } finally {
                    }
                }
        }
    }
}
