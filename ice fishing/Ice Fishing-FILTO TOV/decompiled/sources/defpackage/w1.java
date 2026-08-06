package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import android.view.View;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class w1 extends h50 implements hv {
    public final /* synthetic */ Object AvO7iQsrTN;
    public final /* synthetic */ int EljAMC1QTz;
    public final /* synthetic */ Object encWxUiV2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(int i, Object obj, Object obj2) {
        super(1);
        this.EljAMC1QTz = i;
        this.encWxUiV2 = obj;
        this.AvO7iQsrTN = obj2;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        switch (this.EljAMC1QTz) {
            case 0:
                v1 v1Var = (v1) this.encWxUiV2;
                x1 x1Var = (x1) this.AvO7iQsrTN;
                synchronized (v1Var.mOu10nynGul) {
                    v1Var.rQPn8YBR.remove(x1Var);
                }
                return kc1.GWasM1elztuh;
            case 1:
                ((Choreographer) ((y1) this.encWxUiV2).EljAMC1QTz).removeFrameCallback((x1) this.AvO7iQsrTN);
                return kc1.GWasM1elztuh;
            case 2:
                tp0 tp0Var = (tp0) obj;
                up0 up0Var = (up0) this.encWxUiV2;
                float AvO7iQsrTN = ((qg) this.AvO7iQsrTN).X1lG3V04pd.AvO7iQsrTN();
                tp0Var.getClass();
                tp0.GWasM1elztuh(tp0Var, up0Var);
                up0Var.EDwNPVYuViP0(u20.X1lG3V04pd(0L, up0Var.mOu10nynGul), AvO7iQsrTN, null);
                return kc1.GWasM1elztuh;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                tp0.E7jCp8Ls((tp0) obj, (up0) this.encWxUiV2, ((u6) this.AvO7iQsrTN).mE4lRynR);
                return kc1.GWasM1elztuh;
            case 4:
                tp0.E7jCp8Ls((tp0) obj, (up0) this.encWxUiV2, ((n21) this.AvO7iQsrTN).EXrPz3p7hFb);
                return kc1.GWasM1elztuh;
            default:
                se seVar = (se) obj;
                lv lvVar = (lv) this.AvO7iQsrTN;
                fi1 fi1Var = (fi1) this.encWxUiV2;
                if (!fi1Var.AvO7iQsrTN) {
                    t90 t90Var = seVar.X1lG3V04pd;
                    View view = seVar.GWasM1elztuh;
                    w90 AvO7iQsrTN2 = t90Var.AvO7iQsrTN();
                    fi1Var.mOu10nynGul = lvVar;
                    if (fi1Var.encWxUiV2 == null) {
                        if (o30.rQPn8YBR(Looper.myLooper(), view.getHandler().getLooper())) {
                            fi1Var.encWxUiV2 = AvO7iQsrTN2;
                            AvO7iQsrTN2.GWasM1elztuh(fi1Var);
                        } else {
                            view.post(new t(2, fi1Var, AvO7iQsrTN2));
                        }
                    } else if (AvO7iQsrTN2.encWxUiV2.compareTo(m90.AvO7iQsrTN) >= 0) {
                        fi1Var.EljAMC1QTz.pog2g9KITJA(new jd(-1723985096, true, new jf(fi1Var, seVar, lvVar)));
                    }
                }
                return kc1.GWasM1elztuh;
        }
    }
}
