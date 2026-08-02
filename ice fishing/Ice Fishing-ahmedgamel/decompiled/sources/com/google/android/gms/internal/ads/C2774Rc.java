package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Rc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2774Rc implements InterfaceC3272gc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f27972n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2874Xc f27973u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C2740Pc f27974v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g7.m f27975w;

    public C2774Rc(g7.m mVar, long j6, C2874Xc c2874Xc, C2740Pc c2740Pc) {
        this.f27972n = j6;
        this.f27973u = c2874Xc;
        this.f27974v = c2740Pc;
        Objects.requireNonNull(mVar);
        this.f27975w = mVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3272gc
    public final void e(Object obj, Map map) {
        C4906k.f40186C.f40198k.getClass();
        long currentTimeMillis = System.currentTimeMillis() - this.f27972n;
        StringBuilder sb = new StringBuilder(String.valueOf(currentTimeMillis).length() + 42);
        sb.append("onGmsg /jsLoaded. JsLoaded latency is ");
        sb.append(currentTimeMillis);
        sb.append(" ms.");
        w2.z.k(sb.toString());
        w2.z.k("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        g7.m mVar = this.f27975w;
        synchronized (mVar.f37691d) {
            w2.z.k("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            C2874Xc c2874Xc = this.f27973u;
            if (((AtomicInteger) c2874Xc.f257v).get() != -1 && ((AtomicInteger) c2874Xc.f257v).get() != 1) {
                mVar.f37690c = 0;
                C2740Pc c2740Pc = this.f27974v;
                c2740Pc.i("/log", AbstractC3218fc.f31042c);
                c2740Pc.i("/result", AbstractC3218fc.f31048j);
                ((C3490kg) c2874Xc.f256u).b(c2740Pc);
                mVar.f37695h = c2874Xc;
                w2.z.k("Successfully loaded JS Engine.");
                w2.z.k("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            w2.z.k("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
