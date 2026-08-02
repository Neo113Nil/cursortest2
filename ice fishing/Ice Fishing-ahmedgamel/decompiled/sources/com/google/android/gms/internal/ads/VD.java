package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class VD extends AbstractC3256gD implements Runnable {

    /* renamed from: A, reason: collision with root package name */
    public final Runnable f28896A;

    public VD(Runnable runnable) {
        runnable.getClass();
        this.f28896A = runnable;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3310hD
    public final String g() {
        String obj = this.f28896A.toString();
        return D.x.p(new StringBuilder(obj.length() + 7), "task=[", obj, "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f28896A.run();
        } catch (Throwable th) {
            e(th);
            throw th;
        }
    }
}
