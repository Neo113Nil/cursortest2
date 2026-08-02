package com.google.android.gms.internal.ads;

import R2.InterfaceC0376b;
import R2.InterfaceC0377c;
import android.content.Context;
import android.os.Binder;

/* renamed from: com.google.android.gms.internal.ads.sp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3930sp implements InterfaceC0376b, InterfaceC0377c {

    /* renamed from: n, reason: collision with root package name */
    public final C3490kg f34932n = new C3490kg();

    /* renamed from: u, reason: collision with root package name */
    public final Object f34933u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public boolean f34934v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f34935w = false;

    /* renamed from: x, reason: collision with root package name */
    public C2759Qe f34936x;

    /* renamed from: y, reason: collision with root package name */
    public W8 f34937y;

    public static void b(Context context, C3490kg c3490kg, RD rd) {
        if (((Boolean) AbstractC2619Ia.f26272j.r()).booleanValue() || ((Boolean) AbstractC2619Ia.f26271h.r()).booleanValue()) {
            c3490kg.a(new LD(0, c3490kg, new C3538la(context, 2)), rd);
        }
    }

    public final void a() {
        synchronized (this.f34933u) {
            try {
                this.f34935w = true;
                if (!this.f34937y.h()) {
                    if (this.f34937y.d()) {
                    }
                    Binder.flushPendingCommands();
                }
                this.f34937y.g();
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onConnectionFailed(O2.b bVar) {
        int i = w2.z.f41712b;
        x2.i.a("Disconnected from remote ad request service.");
        this.f34932n.c(new C4254yp(1));
    }

    @Override // R2.InterfaceC0376b
    public void onConnectionSuspended(int i) {
        int i4 = w2.z.f41712b;
        x2.i.a("Cannot connect to remote service, fallback to local instance.");
    }
}
