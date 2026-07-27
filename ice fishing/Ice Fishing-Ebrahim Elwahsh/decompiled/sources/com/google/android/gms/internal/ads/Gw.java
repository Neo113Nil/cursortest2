package com.google.android.gms.internal.ads;

import O2.InterfaceC0365b;
import O2.InterfaceC0366c;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes2.dex */
public final class Gw implements InterfaceC0365b, InterfaceC0366c {

    /* renamed from: A, reason: collision with root package name */
    public final long f25251A;

    /* renamed from: n, reason: collision with root package name */
    public final Rw f25252n;

    /* renamed from: u, reason: collision with root package name */
    public final String f25253u;

    /* renamed from: v, reason: collision with root package name */
    public final String f25254v;

    /* renamed from: w, reason: collision with root package name */
    public final X7 f25255w;

    /* renamed from: x, reason: collision with root package name */
    public final LinkedBlockingQueue f25256x;

    /* renamed from: y, reason: collision with root package name */
    public final HandlerThread f25257y;

    /* renamed from: z, reason: collision with root package name */
    public final Dw f25258z;

    public Gw(Context context, X7 x72, String str, String str2, Dw dw) {
        this.f25253u = str;
        this.f25255w = x72;
        this.f25254v = str2;
        this.f25258z = dw;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f25257y = handlerThread;
        handlerThread.start();
        this.f25251A = System.currentTimeMillis();
        Rw rw = new Rw(context, handlerThread.getLooper(), this, this, 19621000);
        this.f25252n = rw;
        this.f25256x = new LinkedBlockingQueue();
        rw.o();
    }

    public final void a() {
        Rw rw = this.f25252n;
        if (rw != null) {
            if (rw.j() || rw.d()) {
                rw.h();
            }
        }
    }

    public final void b(int i, long j9, Exception exc) {
        Dw dw = this.f25258z;
        if (dw != null) {
            dw.c(i, System.currentTimeMillis() - j9, exc);
        }
    }

    @Override // O2.InterfaceC0365b
    public final void j() {
        Uw uw;
        long j9 = this.f25251A;
        HandlerThread handlerThread = this.f25257y;
        try {
            uw = (Uw) this.f25252n.u();
        } catch (DeadObjectException | IllegalStateException unused) {
            uw = null;
        }
        if (uw != null) {
            try {
                Xw xw = new Xw(1, 1, this.f25255w.f28615n, this.f25253u, this.f25254v);
                Parcel A02 = uw.A0();
                AbstractC3241g8.c(A02, xw);
                Parcel D02 = uw.D0(A02, 3);
                Yw yw = (Yw) AbstractC3241g8.b(D02, Yw.CREATOR);
                D02.recycle();
                b(5011, j9, null);
                this.f25256x.put(yw);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // O2.InterfaceC0366c
    public final void onConnectionFailed(L2.b bVar) {
        try {
            b(4012, this.f25251A, null);
            this.f25256x.put(new Yw());
        } catch (InterruptedException unused) {
        }
    }

    @Override // O2.InterfaceC0365b
    public final void onConnectionSuspended(int i) {
        try {
            b(4011, this.f25251A, null);
            this.f25256x.put(new Yw());
        } catch (InterruptedException unused) {
        }
    }
}
