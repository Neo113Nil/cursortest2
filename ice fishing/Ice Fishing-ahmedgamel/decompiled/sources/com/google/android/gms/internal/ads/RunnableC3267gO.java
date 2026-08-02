package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.gO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3267gO implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f31329n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f31330u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f31331v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f31332w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f31333x;

    public /* synthetic */ RunnableC3267gO(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f31329n = i;
        this.f31330u = obj;
        this.f31331v = obj2;
        this.f31332w = obj3;
        this.f31333x = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U8 u82;
        boolean z6;
        long j6;
        switch (this.f31329n) {
            case 0:
                Pair pair = (Pair) this.f31331v;
                ((BO) ((C3375iO) this.f31330u).f31814b.f1141C).p(((Integer) pair.first).intValue(), (C3860rQ) pair.second, (C3429jQ) this.f31332w, (C3699oQ) this.f31333x);
                return;
            case 1:
                Pair pair2 = (Pair) this.f31331v;
                ((BO) ((C3375iO) this.f31330u).f31814b.f1141C).q(((Integer) pair2.first).intValue(), (C3860rQ) pair2.second, (C3429jQ) this.f31332w, (C3699oQ) this.f31333x);
                return;
            default:
                Z8 z82 = (Z8) this.f31333x;
                W8 w82 = (W8) this.f31331v;
                C3504ku c3504ku = (C3504ku) this.f31330u;
                try {
                    Y8 y82 = (Y8) w82.u();
                    boolean A9 = w82.A();
                    X8 x82 = (X8) this.f31332w;
                    if (A9) {
                        Parcel F02 = y82.F0();
                        AbstractC3411j8.c(F02, x82);
                        Parcel K02 = y82.K0(F02, 2);
                        u82 = (U8) AbstractC3411j8.b(K02, U8.CREATOR);
                        K02.recycle();
                    } else {
                        Parcel F03 = y82.F0();
                        AbstractC3411j8.c(F03, x82);
                        Parcel K03 = y82.K0(F03, 1);
                        u82 = (U8) AbstractC3411j8.b(K03, U8.CREATOR);
                        K03.recycle();
                    }
                    if (!u82.a()) {
                        z82.c(new RuntimeException("No entry contents."));
                        ((com.bumptech.glide.manager.o) c3504ku.f32447w).g();
                        return;
                    }
                    C2930a9 c2930a9 = new C2930a9(c3504ku, u82.b());
                    int read = c2930a9.read();
                    if (read == -1) {
                        throw new IOException("Unable to read from cache.");
                    }
                    c2930a9.unread(read);
                    synchronized (u82) {
                        z6 = u82.f28702u;
                    }
                    boolean d9 = u82.d();
                    synchronized (u82) {
                        j6 = u82.f28704w;
                    }
                    z82.b(new C2984b9(c2930a9, z6, d9, j6, u82.c()));
                    return;
                } catch (RemoteException e9) {
                    e = e9;
                    int i = w2.z.f41712b;
                    x2.i.d("Unable to obtain a cache service instance.", e);
                    z82.c(e);
                    ((com.bumptech.glide.manager.o) c3504ku.f32447w).g();
                    return;
                } catch (IOException e10) {
                    e = e10;
                    int i4 = w2.z.f41712b;
                    x2.i.d("Unable to obtain a cache service instance.", e);
                    z82.c(e);
                    ((com.bumptech.glide.manager.o) c3504ku.f32447w).g();
                    return;
                }
        }
    }
}
