package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import h.C4543G;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Sc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2791Sc implements InterfaceC3272gc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28280n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final Object f28281u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f28282v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f28283w;

    public C2791Sc(C2495Am c2495Am, C4089vm c4089vm, C4036un c4036un, InterfaceC3158eN interfaceC3158eN) {
        this.f28281u = (InterfaceC2603Hb) c2495Am.f24516g.getOrDefault(c4089vm.g(), null);
        this.f28282v = c4036un;
        this.f28283w = interfaceC3158eN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3272gc
    public final void e(Object obj, Map map) {
        switch (this.f28280n) {
            case 0:
                w2.z.k("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
                g7.m mVar = (g7.m) this.f28283w;
                synchronized (mVar.f37691d) {
                    try {
                        w2.z.k("loadJavascriptEngine > /requestReload handler: Lock acquired");
                        x2.i.e("JS Engine is requesting an update");
                        if (mVar.f37690c == 0) {
                            x2.i.e("Starting reload.");
                            mVar.f37690c = 2;
                            mVar.e();
                        }
                        ((C2740Pc) this.f28281u).h("/requestReload", (C2791Sc) ((C4543G) this.f28282v).f37843n);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                w2.z.k("loadJavascriptEngine > /requestReload handler: Lock released");
                return;
            default:
                String str = (String) map.get("asset");
                try {
                    ((InterfaceC2603Hb) this.f28281u).g3((InterfaceC2535Db) ((InterfaceC3158eN) this.f28283w).f(), str);
                    return;
                } catch (RemoteException e9) {
                    String p9 = D.x.p(new StringBuilder(String.valueOf(str).length() + 40), "Failed to call onCustomClick for asset ", str, com.anythink.core.common.d.j.f13164z);
                    int i = w2.z.f41712b;
                    x2.i.g(p9, e9);
                    return;
                }
        }
    }

    public C2791Sc(g7.m mVar, C2740Pc c2740Pc, C4543G c4543g) {
        this.f28281u = c2740Pc;
        this.f28282v = c4543g;
        Objects.requireNonNull(mVar);
        this.f28283w = mVar;
    }
}
