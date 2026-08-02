package com.google.android.gms.internal.measurement;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzpz implements Runnable {
    public static final /* synthetic */ zzpz zza = new zzpz(0);
    public static final /* synthetic */ zzpz zza$1 = new zzpz(1);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzpz(int i) {
        this.$r8$classId = i;
    }

    private final /* synthetic */ void run$com$google$android$gms$internal$measurement$zzpz() {
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.$r8$classId) {
            case 0:
                return;
            default:
                throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
        }
    }
}
