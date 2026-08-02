package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class lzw extends gr2 {
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzw(tmd tmdVar, int i) {
        super(mz1.a, tmdVar);
        this.q = i;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ a8o c(Status status) {
        int i = this.q;
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ void f(a8o a8oVar) {
        g(a8oVar);
    }

    @Override // defpackage.gr2
    public final void l(fo0 fo0Var) {
        switch (this.q) {
            case 0:
                hzw hzwVar = (hzw) fo0Var;
                qzw qzwVar = (qzw) hzwVar.s();
                jzw jzwVar = new jzw(this, 0);
                GoogleSignInOptions googleSignInOptions = hzwVar.E;
                Parcel X = qzwVar.X();
                int i = ezw.a;
                X.writeStrongBinder(jzwVar);
                ezw.c(X, googleSignInOptions);
                qzwVar.p0(X, 102);
                break;
            default:
                hzw hzwVar2 = (hzw) fo0Var;
                qzw qzwVar2 = (qzw) hzwVar2.s();
                jzw jzwVar2 = new jzw(this, 1);
                GoogleSignInOptions googleSignInOptions2 = hzwVar2.E;
                Parcel X2 = qzwVar2.X();
                int i2 = ezw.a;
                X2.writeStrongBinder(jzwVar2);
                ezw.c(X2, googleSignInOptions2);
                qzwVar2.p0(X2, 103);
                break;
        }
    }
}
