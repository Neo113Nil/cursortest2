package com.google.android.gms.internal.ads;

import P2.InterfaceC0372b;
import P2.InterfaceC0373c;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes2.dex */
public final class Fw implements InterfaceC0372b, InterfaceC0373c {

    /* renamed from: A, reason: collision with root package name */
    public final long f24885A;

    /* renamed from: n, reason: collision with root package name */
    public final Qw f24886n;

    /* renamed from: u, reason: collision with root package name */
    public final String f24887u;

    /* renamed from: v, reason: collision with root package name */
    public final String f24888v;

    /* renamed from: w, reason: collision with root package name */
    public final EnumC2960b8 f24889w;

    /* renamed from: x, reason: collision with root package name */
    public final LinkedBlockingQueue f24890x;

    /* renamed from: y, reason: collision with root package name */
    public final HandlerThread f24891y;

    /* renamed from: z, reason: collision with root package name */
    public final Cw f24892z;

    public Fw(Context context, EnumC2960b8 enumC2960b8, String str, String str2, Cw cw) {
        this.f24887u = str;
        this.f24889w = enumC2960b8;
        this.f24888v = str2;
        this.f24892z = cw;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f24891y = handlerThread;
        handlerThread.start();
        this.f24885A = System.currentTimeMillis();
        Qw qw = new Qw(context, handlerThread.getLooper(), this, this, 19621000);
        this.f24886n = qw;
        this.f24890x = new LinkedBlockingQueue();
        qw.o();
    }

    public final void a() {
        Qw qw = this.f24886n;
        if (qw != null) {
            if (qw.i() || qw.e()) {
                qw.h();
            }
        }
    }

    public final void b(int i, long j6, Exception exc) {
        Cw cw = this.f24892z;
        if (cw != null) {
            cw.c(i, System.currentTimeMillis() - j6, exc);
        }
    }

    @Override // P2.InterfaceC0373c
    public final void onConnectionFailed(M2.b bVar) {
        try {
            b(4012, this.f24885A, null);
            this.f24890x.put(new Ww());
        } catch (InterruptedException unused) {
        }
    }

    @Override // P2.InterfaceC0372b
    public final void onConnectionSuspended(int i) {
        try {
            b(4011, this.f24885A, null);
            this.f24890x.put(new Ww());
        } catch (InterruptedException unused) {
        }
    }

    @Override // P2.InterfaceC0372b
    public final void r() {
        Tw tw;
        long j6 = this.f24885A;
        HandlerThread handlerThread = this.f24891y;
        try {
            tw = (Tw) this.f24886n.u();
        } catch (DeadObjectException | IllegalStateException unused) {
            tw = null;
        }
        if (tw != null) {
            try {
                Vw vw = new Vw(1, 1, this.f24889w.f29227n, this.f24887u, this.f24888v);
                Parcel H02 = tw.H0();
                AbstractC3388j8.c(H02, vw);
                Parcel M02 = tw.M0(H02, 3);
                Ww ww = (Ww) AbstractC3388j8.b(M02, Ww.CREATOR);
                M02.recycle();
                b(5011, j6, null);
                this.f24890x.put(ww);
            } finally {
                try {
                } finally {
                }
            }
        }
    }
}
