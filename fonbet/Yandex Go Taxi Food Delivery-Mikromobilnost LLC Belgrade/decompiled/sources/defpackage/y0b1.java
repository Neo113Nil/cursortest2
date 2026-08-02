package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* loaded from: classes.dex */
public final class y0b1 implements Runnable {
    public final /* synthetic */ zzr a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zzbe c;
    public final /* synthetic */ Bundle w;
    public final /* synthetic */ j5b1 x;

    public y0b1(j5b1 j5b1Var, zzr zzrVar, boolean z, zzbe zzbeVar, Bundle bundle) {
        this.a = zzrVar;
        this.b = z;
        this.c = zzbeVar;
        this.w = bundle;
        Objects.requireNonNull(j5b1Var);
        this.x = j5b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j5b1 j5b1Var = this.x;
        zzgb zzgbVar = j5b1Var.x;
        g gVar = (g) j5b1Var.b;
        if (zzgbVar == null) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.z.a("Failed to send default event parameters to service");
            return;
        }
        boolean Qg = gVar.w.Qg(null, nw91.b1);
        zzr zzrVar = this.a;
        if (Qg) {
            j5b1Var.Yg(zzgbVar, this.b ? null : this.c, zzrVar);
            return;
        }
        try {
            zzgbVar.zzu(this.w, zzrVar);
            j5b1Var.Tg();
        } catch (RemoteException e) {
            y1a1 y1a1Var2 = gVar.y;
            g.g(y1a1Var2);
            y1a1Var2.z.b(e, "Failed to send default event parameters to service");
        }
    }
}
