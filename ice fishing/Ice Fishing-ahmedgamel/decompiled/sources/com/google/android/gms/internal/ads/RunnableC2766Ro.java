package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.gms.internal.ads.Ro, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2766Ro implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27329n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27330u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f27331v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f27332w;

    public /* synthetic */ RunnableC2766Ro(int i, int i6, Object obj, Object obj2) {
        this.f27329n = i6;
        this.f27331v = obj;
        this.f27330u = i;
        this.f27332w = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27329n) {
            case 0:
                Iterator it = ((CopyOnWriteArraySet) this.f27331v).iterator();
                while (it.hasNext()) {
                    C2562Fo c2562Fo = (C2562Fo) it.next();
                    if (!c2562Fo.f24848d) {
                        int i = this.f27330u;
                        if (i != -1) {
                            c2562Fo.f24846b.t(i);
                        }
                        c2562Fo.f24847c = true;
                        ((InterfaceC3529lo) this.f27332w).mo1a(c2562Fo.f24845a);
                    }
                }
                break;
            default:
                ((AbstractC4040vD) this.f27331v).t(this.f27330u, (N3.a) this.f27332w);
                break;
        }
    }
}
