package defpackage;

import android.os.Parcelable;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzr;
import com.yandex.messaging.ChatRequest;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class rz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Parcelable c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ boolean x;

    public rz(j5b1 j5b1Var, zzr zzrVar, boolean z, zzah zzahVar) {
        this.a = 2;
        this.b = zzrVar;
        this.x = z;
        this.c = zzahVar;
        Objects.requireNonNull(j5b1Var);
        this.w = j5b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Parcelable parcelable = this.c;
        boolean z = this.x;
        Object obj = this.b;
        Object obj2 = this.w;
        switch (i) {
            case 0:
                b00.a((b00) obj).a(new dhc0((ChatRequest) parcelable, (abz0) obj2, z));
                break;
            case 1:
                b00.a((b00) obj).a(new n3r0((ChatRequest) parcelable, (abz0) obj2, z));
                break;
            default:
                j5b1 j5b1Var = (j5b1) obj2;
                zzgb zzgbVar = j5b1Var.x;
                if (zzgbVar != null) {
                    j5b1Var.Yg(zzgbVar, z ? null : (zzah) parcelable, (zzr) obj);
                    j5b1Var.Tg();
                    break;
                } else {
                    y1a1 y1a1Var = ((g) j5b1Var.b).y;
                    g.g(y1a1Var);
                    y1a1Var.z.a("Discarding data. Failed to send conditional user property to service");
                    break;
                }
        }
    }

    public /* synthetic */ rz(b00 b00Var, ChatRequest chatRequest, abz0 abz0Var, boolean z, int i) {
        this.a = i;
        this.b = b00Var;
        this.c = chatRequest;
        this.w = abz0Var;
        this.x = z;
    }
}
