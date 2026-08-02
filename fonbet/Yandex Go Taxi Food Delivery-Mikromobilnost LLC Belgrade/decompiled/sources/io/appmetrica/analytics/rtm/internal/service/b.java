package io.appmetrica.analytics.rtm.internal.service;

/* loaded from: classes9.dex */
public final class b implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ UploadScheduler b;

    public b(UploadScheduler uploadScheduler, String str) {
        this.b = uploadScheduler;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            UploadScheduler.a(this.b, UploadScheduler.a(this.b, this.a), this.a);
        } catch (Throwable unused) {
        }
    }
}
