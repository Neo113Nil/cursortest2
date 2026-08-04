package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.1.1 */
/* JADX INFO: loaded from: classes.dex */
final class zzez extends zzdy.zzi implements Runnable {
    private final Runnable zzc;

    @Override // com.google.android.gms.internal.play_billing.zzdy
    protected final String zzg() {
        return "task=[" + this.zzc.toString() + "]";
    }

    public zzez(Runnable runnable) {
        runnable.getClass();
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzc.run();
        } catch (Throwable th) {
            zzo(th);
            throw th;
        }
    }
}
