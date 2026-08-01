package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Tg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2791Tg implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27759n = 2;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27760u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f27761v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f27762w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f27763x;

    public /* synthetic */ RunnableC2791Tg(C2657Lh c2657Lh, View view, InterfaceC2468Af interfaceC2468Af, int i) {
        this.f27761v = c2657Lh;
        this.f27762w = view;
        this.f27763x = interfaceC2468Af;
        this.f27760u = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27759n) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("event", "precacheComplete");
                hashMap.put("src", (String) this.f27761v);
                hashMap.put("cachedSrc", (String) this.f27762w);
                hashMap.put("totalBytes", Integer.toString(this.f27760u));
                ((AbstractC2839Wg) this.f27763x).n(hashMap);
                return;
            case 1:
                ((C2657Lh) this.f27761v).n((View) this.f27762w, (InterfaceC2468Af) this.f27763x, this.f27760u - 1);
                return;
            default:
                DA da = (DA) this.f27762w;
                int i = this.f27760u;
                t2.n nVar = (t2.n) this.f27763x;
                FA fa = (FA) this.f27761v;
                String str = fa.f24753b;
                try {
                    C2598Hq c2598Hq = fa.f24752a;
                    if (c2598Hq == null) {
                        throw null;
                    }
                    InterfaceC4199yA interfaceC4199yA = (InterfaceC4199yA) c2598Hq.f25388C;
                    if (interfaceC4199yA == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("callerPackage", str);
                    bundle.putInt("displayMode", i);
                    String str2 = da.f24359a;
                    if (!FA.b(str2)) {
                        str2.getClass();
                        bundle.putString("sessionToken", str2.trim());
                    }
                    String str3 = da.f24360b;
                    if (!FA.b(str3)) {
                        str3.getClass();
                        bundle.putString(com.anythink.expressad.videocommon.e.b.f22407u, str3.trim());
                    }
                    EA ea = new EA(fa, nVar);
                    C4091wA c4091wA = (C4091wA) interfaceC4199yA;
                    Parcel H02 = c4091wA.H0();
                    AbstractC3388j8.c(H02, bundle);
                    AbstractC3388j8.e(H02, ea);
                    c4091wA.h1(H02, 3);
                    return;
                } catch (RemoteException e9) {
                    FA.f24750c.d(e9, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i), str);
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC2791Tg(FA fa, DA da, int i, t2.n nVar) {
        this.f27761v = fa;
        this.f27762w = da;
        this.f27760u = i;
        this.f27763x = nVar;
    }

    public RunnableC2791Tg(AbstractC2839Wg abstractC2839Wg, String str, String str2, int i) {
        this.f27761v = str;
        this.f27762w = str2;
        this.f27760u = i;
        Objects.requireNonNull(abstractC2839Wg);
        this.f27763x = abstractC2839Wg;
    }
}
