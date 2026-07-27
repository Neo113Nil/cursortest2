package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.tO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3956tO implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34409n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f34410u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f34411v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f34412w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f34413x;

    public /* synthetic */ RunnableC3956tO(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f34409n = i;
        this.f34410u = obj;
        this.f34411v = obj2;
        this.f34412w = obj3;
        this.f34413x = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        R8 r82;
        boolean z8;
        long j9;
        switch (this.f34409n) {
            case 0:
                Pair pair = (Pair) this.f34411v;
                ((OO) ((C4064vO) this.f34410u).f34759b.f446C).l(((Integer) pair.first).intValue(), (BQ) pair.second, (C3958tQ) this.f34412w, (C4228yQ) this.f34413x);
                return;
            case 1:
                Pair pair2 = (Pair) this.f34411v;
                ((OO) ((C4064vO) this.f34410u).f34759b.f446C).m(((Integer) pair2.first).intValue(), (BQ) pair2.second, (C3958tQ) this.f34412w, (C4228yQ) this.f34413x);
                return;
            default:
                W8 w82 = (W8) this.f34413x;
                T8 t82 = (T8) this.f34411v;
                C3602mu c3602mu = (C3602mu) this.f34410u;
                try {
                    V8 v82 = (V8) t82.u();
                    boolean A8 = t82.A();
                    U8 u82 = (U8) this.f34412w;
                    if (A8) {
                        Parcel A02 = v82.A0();
                        AbstractC3241g8.c(A02, u82);
                        Parcel D02 = v82.D0(A02, 2);
                        r82 = (R8) AbstractC3241g8.b(D02, R8.CREATOR);
                        D02.recycle();
                    } else {
                        Parcel A03 = v82.A0();
                        AbstractC3241g8.c(A03, u82);
                        Parcel D03 = v82.D0(A03, 1);
                        r82 = (R8) AbstractC3241g8.b(D03, R8.CREATOR);
                        D03.recycle();
                    }
                    if (!r82.a()) {
                        w82.b(new RuntimeException("No entry contents."));
                        ((com.bumptech.glide.manager.o) c3602mu.f32776w).g();
                        return;
                    }
                    X8 x82 = new X8(c3602mu, r82.b());
                    int read = x82.read();
                    if (read == -1) {
                        throw new IOException("Unable to read from cache.");
                    }
                    x82.unread(read);
                    synchronized (r82) {
                        z8 = r82.f27314u;
                    }
                    boolean d2 = r82.d();
                    synchronized (r82) {
                        j9 = r82.f27316w;
                    }
                    w82.a(new Y8(x82, z8, d2, j9, r82.c()));
                    return;
                } catch (RemoteException e6) {
                    e = e6;
                    int i = t2.C.f40822b;
                    u2.i.d("Unable to obtain a cache service instance.", e);
                    w82.b(e);
                    ((com.bumptech.glide.manager.o) c3602mu.f32776w).g();
                    return;
                } catch (IOException e9) {
                    e = e9;
                    int i4 = t2.C.f40822b;
                    u2.i.d("Unable to obtain a cache service instance.", e);
                    w82.b(e);
                    ((com.bumptech.glide.manager.o) c3602mu.f32776w).g();
                    return;
                }
        }
    }
}
