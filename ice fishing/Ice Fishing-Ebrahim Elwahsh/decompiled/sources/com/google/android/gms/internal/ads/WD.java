package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class WD extends AbstractC3300hD implements Runnable {

    /* renamed from: A, reason: collision with root package name */
    public final Runnable f28374A;

    public WD(Runnable runnable) {
        runnable.getClass();
        this.f28374A = runnable;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3354iD
    public final String g() {
        String obj = this.f28374A.toString();
        return D.y.o(new StringBuilder(obj.length() + 7), "task=[", obj, "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f28374A.run();
        } catch (Throwable th) {
            e(th);
            throw th;
        }
    }
}
