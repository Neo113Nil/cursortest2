package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Xc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2851Xc extends E2.a {

    /* renamed from: w, reason: collision with root package name */
    public final Object f28533w = new Object();

    /* renamed from: x, reason: collision with root package name */
    public boolean f28534x = false;

    /* renamed from: y, reason: collision with root package name */
    public int f28535y = 0;

    public final C2835Wc s() {
        C2835Wc c2835Wc = new C2835Wc(this);
        u2.z.k("createNewReference: Trying to acquire lock");
        synchronized (this.f28533w) {
            u2.z.k("createNewReference: Lock acquired");
            p(new Qx(this, c2835Wc), new Ux(this, c2835Wc));
            P2.w.k(this.f28535y >= 0);
            this.f28535y++;
        }
        u2.z.k("createNewReference: Lock released");
        return c2835Wc;
    }

    public final void t() {
        u2.z.k("releaseOneReference: Trying to acquire lock");
        synchronized (this.f28533w) {
            u2.z.k("releaseOneReference: Lock acquired");
            P2.w.k(this.f28535y > 0);
            u2.z.k("Releasing 1 reference for JS Engine");
            this.f28535y--;
            v();
        }
        u2.z.k("releaseOneReference: Lock released");
    }

    public final void u() {
        u2.z.k("markAsDestroyable: Trying to acquire lock");
        synchronized (this.f28533w) {
            u2.z.k("markAsDestroyable: Lock acquired");
            P2.w.k(this.f28535y >= 0);
            u2.z.k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f28534x = true;
            v();
        }
        u2.z.k("markAsDestroyable: Lock released");
    }

    public final void v() {
        u2.z.k("maybeDestroy: Trying to acquire lock");
        synchronized (this.f28533w) {
            try {
                u2.z.k("maybeDestroy: Lock acquired");
                P2.w.k(this.f28535y >= 0);
                if (this.f28534x && this.f28535y == 0) {
                    u2.z.k("No reference is left (including root). Cleaning up engine.");
                    p(new C2866Yb(5), new C2866Yb(20));
                } else {
                    u2.z.k("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        u2.z.k("maybeDestroy: Lock released");
    }
}
