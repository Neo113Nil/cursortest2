package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class nta implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lta b;
    public final /* synthetic */ eua c;

    public /* synthetic */ nta(lta ltaVar, eua euaVar, int i) {
        this.a = i;
        this.b = ltaVar;
        this.c = euaVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        String str2;
        int i = this.a;
        eua euaVar = this.c;
        lta ltaVar = this.b;
        switch (i) {
            case 0:
                tta ttaVar = ltaVar.a;
                bua buaVar = euaVar.g;
                if (buaVar != null && (str2 = buaVar.b) != null) {
                    w1g.y(ltaVar.b.a.b, str2, true);
                    ttaVar.e.d(-1, -1, str2);
                }
                kta ktaVar = (kta) ttaVar.i.getValue();
                String str3 = euaVar.a;
                if (buaVar != null && (str = buaVar.a) != null) {
                    ktaVar.getClass();
                    str3.getClass();
                    jyr jyrVar = k3j.e;
                    if (ixf.x()) {
                        ((oi5) ktaVar.b.getValue()).g(ktaVar.a, str3, str);
                    } else {
                        ((pi5) ktaVar.c.getValue()).d(str3, str);
                    }
                }
                break;
            default:
                ltaVar.getClass();
                cua cuaVar = euaVar.h;
                if (cuaVar != null) {
                    x2i.a0(ltaVar.b.a.a, pd.t(new qzm[0]), new teb(cuaVar.a));
                }
                break;
        }
        return Unit.a;
    }
}
