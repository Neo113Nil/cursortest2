package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.gO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3244gO implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f30563n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f30564u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f30565v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f30566w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f30567x;

    public /* synthetic */ RunnableC3244gO(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f30563n = i;
        this.f30564u = obj;
        this.f30565v = obj2;
        this.f30566w = obj3;
        this.f30567x = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U8 u82;
        boolean z3;
        long j6;
        switch (this.f30563n) {
            case 0:
                Pair pair = (Pair) this.f30565v;
                ((BO) ((C3352iO) this.f30564u).f31041b.f799C).p(((Integer) pair.first).intValue(), (C3676oQ) pair.second, (C3246gQ) this.f30566w, (C3514lQ) this.f30567x);
                return;
            case 1:
                Pair pair2 = (Pair) this.f30565v;
                ((BO) ((C3352iO) this.f30564u).f31041b.f799C).q(((Integer) pair2.first).intValue(), (C3676oQ) pair2.second, (C3246gQ) this.f30566w, (C3514lQ) this.f30567x);
                return;
            default:
                Z8 z82 = (Z8) this.f30567x;
                W8 w82 = (W8) this.f30565v;
                C3481ku c3481ku = (C3481ku) this.f30564u;
                try {
                    Y8 y82 = (Y8) w82.u();
                    boolean A9 = w82.A();
                    X8 x82 = (X8) this.f30566w;
                    if (A9) {
                        Parcel H02 = y82.H0();
                        AbstractC3388j8.c(H02, x82);
                        Parcel M02 = y82.M0(H02, 2);
                        u82 = (U8) AbstractC3388j8.b(M02, U8.CREATOR);
                        M02.recycle();
                    } else {
                        Parcel H03 = y82.H0();
                        AbstractC3388j8.c(H03, x82);
                        Parcel M03 = y82.M0(H03, 1);
                        u82 = (U8) AbstractC3388j8.b(M03, U8.CREATOR);
                        M03.recycle();
                    }
                    if (!u82.a()) {
                        z82.c(new RuntimeException("No entry contents."));
                        ((com.bumptech.glide.manager.p) c3481ku.f31665w).g();
                        return;
                    }
                    C2907a9 c2907a9 = new C2907a9(c3481ku, u82.b());
                    int read = c2907a9.read();
                    if (read == -1) {
                        throw new IOException("Unable to read from cache.");
                    }
                    c2907a9.unread(read);
                    synchronized (u82) {
                        z3 = u82.f27905u;
                    }
                    boolean d2 = u82.d();
                    synchronized (u82) {
                        j6 = u82.f27907w;
                    }
                    z82.b(new C2961b9(c2907a9, z3, d2, j6, u82.c()));
                    return;
                } catch (RemoteException e9) {
                    e = e9;
                    int i = u2.z.f41322b;
                    v2.i.d("Unable to obtain a cache service instance.", e);
                    z82.c(e);
                    ((com.bumptech.glide.manager.p) c3481ku.f31665w).g();
                    return;
                } catch (IOException e10) {
                    e = e10;
                    int i6 = u2.z.f41322b;
                    v2.i.d("Unable to obtain a cache service instance.", e);
                    z82.c(e);
                    ((com.bumptech.glide.manager.p) c3481ku.f31665w).g();
                    return;
                }
        }
    }
}
