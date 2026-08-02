package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* loaded from: classes.dex */
public final class jww extends www {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jww(kww kwwVar, vww vwwVar, h66 h66Var) {
        super(vwwVar);
        this.d = kwwVar;
        this.c = h66Var;
    }

    @Override // defpackage.www
    public final void a() {
        g8e snxVar;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((kww) obj).d.e((h66) obj2);
                break;
            default:
                nww nwwVar = (nww) obj2;
                myw mywVar = (myw) obj;
                if (nwwVar.i(0)) {
                    h66 h66Var = mywVar.b;
                    if (!h66Var.e()) {
                        if (nwwVar.l && !h66Var.d()) {
                            nwwVar.a();
                            nwwVar.g();
                            break;
                        } else {
                            nwwVar.e(h66Var);
                            break;
                        }
                    } else {
                        xyw xywVar = mywVar.c;
                        y1g.G(xywVar);
                        h66 h66Var2 = xywVar.c;
                        if (!h66Var2.e()) {
                            Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(h66Var2)), new Exception());
                            nwwVar.e(h66Var2);
                            break;
                        } else {
                            nwwVar.n = true;
                            IBinder iBinder = xywVar.b;
                            if (iBinder == null) {
                                snxVar = null;
                            } else {
                                int i2 = qc.h;
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                                snxVar = queryLocalInterface instanceof g8e ? (g8e) queryLocalInterface : new snx(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 3);
                            }
                            y1g.G(snxVar);
                            nwwVar.o = snxVar;
                            nwwVar.p = xywVar.d;
                            nwwVar.q = xywVar.e;
                            nwwVar.g();
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jww(nww nwwVar, nww nwwVar2, myw mywVar) {
        super(nwwVar);
        this.c = nwwVar2;
        this.d = mywVar;
    }
}
