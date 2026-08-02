package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.gms.internal.ads.So, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2803So implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28343n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28344u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f28345v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f28346w;

    public /* synthetic */ RunnableC2803So(int i, int i4, Object obj, Object obj2) {
        this.f28343n = i4;
        this.f28345v = obj;
        this.f28344u = i;
        this.f28346w = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28343n) {
            case 0:
                Iterator it = ((CopyOnWriteArraySet) this.f28345v).iterator();
                while (it.hasNext()) {
                    C2599Go c2599Go = (C2599Go) it.next();
                    if (!c2599Go.f25894d) {
                        int i = this.f28344u;
                        if (i != -1) {
                            c2599Go.f25892b.t(i);
                        }
                        c2599Go.f25893c = true;
                        ((InterfaceC3606mo) this.f28346w).mo5a(c2599Go.f25891a);
                    }
                }
                break;
            default:
                ((AbstractC4063vD) this.f28345v).t(this.f28344u, (P3.a) this.f28346w);
                break;
        }
    }
}
