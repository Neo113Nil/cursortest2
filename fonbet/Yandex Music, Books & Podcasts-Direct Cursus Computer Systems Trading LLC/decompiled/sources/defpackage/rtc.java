package defpackage;

import android.content.res.Configuration;
import androidx.core.app.a1;
import androidx.core.app.t;
import androidx.fragment.app.y;

/* loaded from: classes.dex */
public final /* synthetic */ class rtc implements xa6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rtc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xa6
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                y yVar = (y) this.b;
                Configuration configuration = (Configuration) obj;
                if (yVar.O()) {
                    yVar.i(false, configuration);
                    break;
                }
                break;
            case 1:
                y yVar2 = (y) this.b;
                Integer num = (Integer) obj;
                if (yVar2.O() && num.intValue() == 80) {
                    yVar2.m(false);
                    break;
                }
                break;
            case 2:
                y yVar3 = (y) this.b;
                t tVar = (t) obj;
                if (yVar3.O()) {
                    yVar3.n(tVar.a, false);
                    break;
                }
                break;
            case 3:
                y yVar4 = (y) this.b;
                a1 a1Var = (a1) obj;
                if (yVar4.O()) {
                    yVar4.s(a1Var.a, false);
                    break;
                }
                break;
            default:
                ((oc4) ((ltm) this.b)).c((uqv) obj);
                break;
        }
    }
}
