package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;
import java.util.Objects;
import l.C4648e;

/* renamed from: com.google.android.gms.internal.ads.Sc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2771Sc implements InterfaceC3249gc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27488n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final Object f27489u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f27490v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f27491w;

    public C2771Sc(C4282zm c4282zm, C4012um c4012um, C3959tn c3959tn, InterfaceC3135eN interfaceC3135eN) {
        this.f27489u = (InterfaceC2583Hb) c4282zm.f35450g.getOrDefault(c4012um.g(), null);
        this.f27490v = c3959tn;
        this.f27491w = interfaceC3135eN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3249gc
    public final void e(Object obj, Map map) {
        switch (this.f27488n) {
            case 0:
                u2.z.k("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
                g7.m mVar = (g7.m) this.f27491w;
                synchronized (mVar.f37666d) {
                    try {
                        u2.z.k("loadJavascriptEngine > /requestReload handler: Lock acquired");
                        v2.i.e("JS Engine is requesting an update");
                        if (mVar.f37665c == 0) {
                            v2.i.e("Starting reload.");
                            mVar.f37665c = 2;
                            mVar.e();
                        }
                        ((C2720Pc) this.f27489u).h("/requestReload", (C2771Sc) ((C4648e) this.f27490v).f38761u);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                u2.z.k("loadJavascriptEngine > /requestReload handler: Lock released");
                return;
            default:
                String str = (String) map.get("asset");
                try {
                    ((InterfaceC2583Hb) this.f27489u).m3((InterfaceC2515Db) ((InterfaceC3135eN) this.f27491w).f(), str);
                    return;
                } catch (RemoteException e9) {
                    String s9 = D.y.s(new StringBuilder(String.valueOf(str).length() + 40), "Failed to call onCustomClick for asset ", str, com.anythink.core.common.d.j.f12378z);
                    int i = u2.z.f41319b;
                    v2.i.g(s9, e9);
                    return;
                }
        }
    }

    public C2771Sc(g7.m mVar, C2720Pc c2720Pc, C4648e c4648e) {
        this.f27489u = c2720Pc;
        this.f27490v = c4648e;
        Objects.requireNonNull(mVar);
        this.f27491w = mVar;
    }
}
