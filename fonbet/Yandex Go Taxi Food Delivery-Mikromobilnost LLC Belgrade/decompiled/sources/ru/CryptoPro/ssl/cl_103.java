package ru.CryptoPro.ssl;

/* loaded from: classes4.dex */
class cl_103 extends Thread {
    public final /* synthetic */ ServerLicense a;

    public cl_103(ServerLicense serverLicense) {
        this.a = serverLicense;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            this.a.setNewLicense();
        } catch (Exception e) {
            SSLLogger.warning(e.toString());
        }
    }
}
