package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import java.util.HashMap;
import java.util.Objects;
import l.C4659e;

/* renamed from: com.google.android.gms.internal.ads.Tg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2812Tg implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28546n = 2;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28547u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f28548v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f28549w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f28550x;

    public /* synthetic */ RunnableC2812Tg(C2677Lh c2677Lh, View view, InterfaceC2488Af interfaceC2488Af, int i) {
        this.f28548v = c2677Lh;
        this.f28549w = view;
        this.f28550x = interfaceC2488Af;
        this.f28547u = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28546n) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("event", "precacheComplete");
                hashMap.put("src", (String) this.f28548v);
                hashMap.put("cachedSrc", (String) this.f28549w);
                hashMap.put("totalBytes", Integer.toString(this.f28547u));
                ((AbstractC2862Wg) this.f28550x).n(hashMap);
                return;
            case 1:
                ((C2677Lh) this.f28548v).n((View) this.f28549w, (InterfaceC2488Af) this.f28550x, this.f28547u - 1);
                return;
            default:
                DA da = (DA) this.f28549w;
                int i = this.f28547u;
                C4659e c4659e = (C4659e) this.f28550x;
                FA fa = (FA) this.f28548v;
                String str = fa.f25509b;
                try {
                    C2618Hq c2618Hq = fa.f25508a;
                    if (c2618Hq == null) {
                        throw null;
                    }
                    InterfaceC4222yA interfaceC4222yA = (InterfaceC4222yA) c2618Hq.f26131C;
                    if (interfaceC4222yA == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("callerPackage", str);
                    bundle.putInt("displayMode", i);
                    String str2 = da.f25104a;
                    if (!FA.b(str2)) {
                        str2.getClass();
                        bundle.putString("sessionToken", str2.trim());
                    }
                    String str3 = da.f25105b;
                    if (!FA.b(str3)) {
                        str3.getClass();
                        bundle.putString(com.anythink.expressad.videocommon.e.b.f23194u, str3.trim());
                    }
                    EA ea = new EA(fa, c4659e);
                    C4114wA c4114wA = (C4114wA) interfaceC4222yA;
                    Parcel F02 = c4114wA.F0();
                    AbstractC3411j8.c(F02, bundle);
                    AbstractC3411j8.e(F02, ea);
                    c4114wA.h1(F02, 3);
                    return;
                } catch (RemoteException e9) {
                    FA.f25506c.d(e9, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i), str);
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC2812Tg(FA fa, DA da, int i, C4659e c4659e) {
        this.f28548v = fa;
        this.f28549w = da;
        this.f28547u = i;
        this.f28550x = c4659e;
    }

    public RunnableC2812Tg(AbstractC2862Wg abstractC2862Wg, String str, String str2, int i) {
        this.f28548v = str;
        this.f28549w = str2;
        this.f28547u = i;
        Objects.requireNonNull(abstractC2862Wg);
        this.f28550x = abstractC2862Wg;
    }
}
