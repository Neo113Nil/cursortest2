package com.google.android.gms.internal.ads;

import R2.InterfaceC0376b;
import R2.InterfaceC0377c;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes2.dex */
public final class Fw implements InterfaceC0376b, InterfaceC0377c {

    /* renamed from: A, reason: collision with root package name */
    public final long f25675A;

    /* renamed from: n, reason: collision with root package name */
    public final Qw f25676n;

    /* renamed from: u, reason: collision with root package name */
    public final String f25677u;

    /* renamed from: v, reason: collision with root package name */
    public final String f25678v;

    /* renamed from: w, reason: collision with root package name */
    public final EnumC2983b8 f25679w;

    /* renamed from: x, reason: collision with root package name */
    public final LinkedBlockingQueue f25680x;

    /* renamed from: y, reason: collision with root package name */
    public final HandlerThread f25681y;

    /* renamed from: z, reason: collision with root package name */
    public final Cw f25682z;

    public Fw(Context context, EnumC2983b8 enumC2983b8, String str, String str2, Cw cw) {
        this.f25677u = str;
        this.f25679w = enumC2983b8;
        this.f25678v = str2;
        this.f25682z = cw;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f25681y = handlerThread;
        handlerThread.start();
        this.f25675A = System.currentTimeMillis();
        Qw qw = new Qw(context, handlerThread.getLooper(), this, this, 19621000);
        this.f25676n = qw;
        this.f25680x = new LinkedBlockingQueue();
        qw.o();
    }

    public final void a() {
        Qw qw = this.f25676n;
        if (qw != null) {
            if (qw.h() || qw.d()) {
                qw.g();
            }
        }
    }

    public final void b(int i, long j6, Exception exc) {
        Cw cw = this.f25682z;
        if (cw != null) {
            cw.c(i, System.currentTimeMillis() - j6, exc);
        }
    }

    @Override // R2.InterfaceC0377c
    public final void onConnectionFailed(O2.b bVar) {
        try {
            b(4012, this.f25675A, null);
            this.f25680x.put(new Ww());
        } catch (InterruptedException unused) {
        }
    }

    @Override // R2.InterfaceC0376b
    public final void onConnectionSuspended(int i) {
        try {
            b(4011, this.f25675A, null);
            this.f25680x.put(new Ww());
        } catch (InterruptedException unused) {
        }
    }

    @Override // R2.InterfaceC0376b
    public final void z() {
        Tw tw;
        long j6 = this.f25675A;
        HandlerThread handlerThread = this.f25681y;
        try {
            tw = (Tw) this.f25676n.u();
        } catch (DeadObjectException | IllegalStateException unused) {
            tw = null;
        }
        if (tw != null) {
            try {
                Vw vw = new Vw(1, 1, this.f25679w.f30015n, this.f25677u, this.f25678v);
                Parcel F02 = tw.F0();
                AbstractC3411j8.c(F02, vw);
                Parcel K02 = tw.K0(F02, 3);
                Ww ww = (Ww) AbstractC3411j8.b(K02, Ww.CREATOR);
                K02.recycle();
                b(5011, j6, null);
                this.f25680x.put(ww);
            } finally {
                try {
                } finally {
                }
            }
        }
    }
}
