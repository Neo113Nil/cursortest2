package defpackage;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;

/* loaded from: classes11.dex */
public final class wx81 extends gy81 {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx81(xx81 xx81Var, fy81 fy81Var, ConnectionResult connectionResult) {
        super(fy81Var);
        this.d = xx81Var;
        this.c = connectionResult;
    }

    @Override // defpackage.gy81
    public final void a() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((xx81) obj).w.d((ConnectionResult) obj2);
                break;
            default:
                yx81 yx81Var = (yx81) obj2;
                zak zakVar = (zak) obj;
                if (yx81Var.g(0)) {
                    ConnectionResult zaa = zakVar.zaa();
                    if (!zaa.isSuccess()) {
                        if (yx81Var.E && !zaa.hasResolution()) {
                            yx81Var.a();
                            yx81Var.f();
                            break;
                        } else {
                            yx81Var.d(zaa);
                            break;
                        }
                    } else {
                        zav zab = zakVar.zab();
                        cvw.l(zab);
                        ConnectionResult zaa2 = zab.zaa();
                        if (!zaa2.isSuccess()) {
                            String valueOf = String.valueOf(zaa2);
                            Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                            yx81Var.d(zaa2);
                            break;
                        } else {
                            yx81Var.G = true;
                            IAccountAccessor zab2 = zab.zab();
                            cvw.l(zab2);
                            yx81Var.H = zab2;
                            yx81Var.I = zab.zac();
                            yx81Var.J = zab.zad();
                            yx81Var.f();
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx81(yx81 yx81Var, yx81 yx81Var2, zak zakVar) {
        super(yx81Var);
        this.c = yx81Var2;
        this.d = zakVar;
    }
}
