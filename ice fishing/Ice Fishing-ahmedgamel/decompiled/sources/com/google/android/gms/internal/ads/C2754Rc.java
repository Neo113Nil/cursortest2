package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Rc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2754Rc implements InterfaceC3249gc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f27288n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2851Xc f27289u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C2720Pc f27290v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g7.m f27291w;

    public C2754Rc(g7.m mVar, long j6, C2851Xc c2851Xc, C2720Pc c2720Pc) {
        this.f27288n = j6;
        this.f27289u = c2851Xc;
        this.f27290v = c2720Pc;
        Objects.requireNonNull(mVar);
        this.f27291w = mVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3249gc
    public final void e(Object obj, Map map) {
        C4835j.f39733C.f39745k.getClass();
        long currentTimeMillis = System.currentTimeMillis() - this.f27288n;
        StringBuilder sb = new StringBuilder(String.valueOf(currentTimeMillis).length() + 42);
        sb.append("onGmsg /jsLoaded. JsLoaded latency is ");
        sb.append(currentTimeMillis);
        sb.append(" ms.");
        u2.z.k(sb.toString());
        u2.z.k("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        g7.m mVar = this.f27291w;
        synchronized (mVar.f37666d) {
            u2.z.k("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            C2851Xc c2851Xc = this.f27289u;
            if (((AtomicInteger) c2851Xc.f732v).get() != -1 && ((AtomicInteger) c2851Xc.f732v).get() != 1) {
                mVar.f37665c = 0;
                C2720Pc c2720Pc = this.f27290v;
                c2720Pc.i("/log", AbstractC3195fc.f30254c);
                c2720Pc.i("/result", AbstractC3195fc.f30260j);
                ((C3467kg) c2851Xc.f731u).b(c2720Pc);
                mVar.f37670h = c2851Xc;
                u2.z.k("Successfully loaded JS Engine.");
                u2.z.k("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            u2.z.k("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
