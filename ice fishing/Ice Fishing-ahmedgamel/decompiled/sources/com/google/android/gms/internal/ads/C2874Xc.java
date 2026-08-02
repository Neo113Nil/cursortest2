package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Xc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2874Xc extends B1.b {

    /* renamed from: w, reason: collision with root package name */
    public final Object f29305w = new Object();

    /* renamed from: x, reason: collision with root package name */
    public boolean f29306x = false;

    /* renamed from: y, reason: collision with root package name */
    public int f29307y = 0;

    public final C2858Wc s() {
        C2858Wc c2858Wc = new C2858Wc(this);
        w2.z.k("createNewReference: Trying to acquire lock");
        synchronized (this.f29305w) {
            w2.z.k("createNewReference: Lock acquired");
            p(new Qx(this, c2858Wc), new Ux(this, c2858Wc));
            R2.w.k(this.f29307y >= 0);
            this.f29307y++;
        }
        w2.z.k("createNewReference: Lock released");
        return c2858Wc;
    }

    public final void t() {
        w2.z.k("releaseOneReference: Trying to acquire lock");
        synchronized (this.f29305w) {
            w2.z.k("releaseOneReference: Lock acquired");
            R2.w.k(this.f29307y > 0);
            w2.z.k("Releasing 1 reference for JS Engine");
            this.f29307y--;
            v();
        }
        w2.z.k("releaseOneReference: Lock released");
    }

    public final void u() {
        w2.z.k("markAsDestroyable: Trying to acquire lock");
        synchronized (this.f29305w) {
            w2.z.k("markAsDestroyable: Lock acquired");
            R2.w.k(this.f29307y >= 0);
            w2.z.k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f29306x = true;
            v();
        }
        w2.z.k("markAsDestroyable: Lock released");
    }

    public final void v() {
        w2.z.k("maybeDestroy: Trying to acquire lock");
        synchronized (this.f29305w) {
            try {
                w2.z.k("maybeDestroy: Lock acquired");
                R2.w.k(this.f29307y >= 0);
                if (this.f29306x && this.f29307y == 0) {
                    w2.z.k("No reference is left (including root). Cleaning up engine.");
                    p(new C2889Yb(5), new C2889Yb(20));
                } else {
                    w2.z.k("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        w2.z.k("maybeDestroy: Lock released");
    }
}
