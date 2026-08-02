package defpackage;

import com.google.android.gms.measurement.internal.n;
import com.google.android.gms.measurement.internal.zzjd;

/* loaded from: classes.dex */
public final class wba1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long w;
    public final /* synthetic */ zzjd x;

    public wba1(zzjd zzjdVar, String str, String str2, String str3, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.w = j;
        this.x = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.b;
        zzjd zzjdVar = this.x;
        String str2 = this.a;
        if (str2 != null) {
            qwa1 qwa1Var = new qwa1(this.c, str2, this.w);
            n zzL = zzjdVar.zzL();
            zzL.M1().Gg();
            zzL.b0 = str;
            zzL.a0 = qwa1Var;
            return;
        }
        n zzL2 = zzjdVar.zzL();
        zzL2.M1().Gg();
        String str3 = zzL2.b0;
        if (str3 == null || str3.equals(str)) {
            zzL2.b0 = str;
            zzL2.a0 = null;
        }
    }
}
