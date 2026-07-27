package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class VD extends AbstractC3233gD implements Runnable {

    /* renamed from: A, reason: collision with root package name */
    public final Runnable f28099A;

    public VD(Runnable runnable) {
        runnable.getClass();
        this.f28099A = runnable;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3287hD
    public final String g() {
        String obj = this.f28099A.toString();
        return D.y.s(new StringBuilder(obj.length() + 7), "task=[", obj, "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f28099A.run();
        } catch (Throwable th) {
            e(th);
            throw th;
        }
    }
}
