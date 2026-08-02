package defpackage;

import com.google.android.gms.measurement.internal.n;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzr;

/* loaded from: classes11.dex */
public final class vda1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzjd b;
    public final /* synthetic */ zzr c;

    public /* synthetic */ vda1(zzjd zzjdVar, zzr zzrVar, int i) {
        this.a = i;
        this.c = zzrVar;
        this.b = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzr zzrVar = this.c;
        zzjd zzjdVar = this.b;
        switch (i) {
            case 0:
                zzjdVar.zzL().w();
                n zzL = zzjdVar.zzL();
                zzL.M1().Gg();
                zzL.f0();
                cvw.i(zzrVar.zza);
                zzL.g0(zzrVar);
                zzL.h0(zzrVar);
                break;
            default:
                zzjdVar.zzF(zzrVar);
                break;
        }
    }
}
