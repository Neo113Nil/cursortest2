package com.google.android.gms.internal.ads;

import P2.InterfaceC0372b;
import P2.InterfaceC0373c;
import android.content.Context;
import android.os.Binder;

/* renamed from: com.google.android.gms.internal.ads.sp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3907sp implements InterfaceC0372b, InterfaceC0373c {

    /* renamed from: n, reason: collision with root package name */
    public final C3467kg f34146n = new C3467kg();

    /* renamed from: u, reason: collision with root package name */
    public final Object f34147u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public boolean f34148v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f34149w = false;

    /* renamed from: x, reason: collision with root package name */
    public C2739Qe f34150x;

    /* renamed from: y, reason: collision with root package name */
    public W8 f34151y;

    public static void b(Context context, C3467kg c3467kg, RD rd) {
        if (((Boolean) AbstractC2599Ia.f25523j.r()).booleanValue() || ((Boolean) AbstractC2599Ia.f25522h.r()).booleanValue()) {
            c3467kg.a(new LD(0, c3467kg, new C3515la(context, 2)), rd);
        }
    }

    public final void a() {
        synchronized (this.f34147u) {
            try {
                this.f34149w = true;
                if (!this.f34151y.i()) {
                    if (this.f34151y.e()) {
                    }
                    Binder.flushPendingCommands();
                }
                this.f34151y.h();
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onConnectionFailed(M2.b bVar) {
        int i = u2.z.f41322b;
        v2.i.a("Disconnected from remote ad request service.");
        this.f34146n.c(new C4231yp(1));
    }

    @Override // P2.InterfaceC0372b
    public void onConnectionSuspended(int i) {
        int i6 = u2.z.f41322b;
        v2.i.a("Cannot connect to remote service, fallback to local instance.");
    }
}
