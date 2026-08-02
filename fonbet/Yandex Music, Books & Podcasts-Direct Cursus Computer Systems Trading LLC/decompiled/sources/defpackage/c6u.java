package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class c6u implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ m4u b;
    public final /* synthetic */ sdr c;

    public /* synthetic */ c6u(m4u m4uVar, sdr sdrVar) {
        this.b = m4uVar;
        this.c = sdrVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                int intValue = num.intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    q5g.a(this.b, this.c, oq5Var, 384);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                num.getClass();
                q5g.a(this.b, this.c, hq5Var, rvf.R(385));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ c6u(m4u m4uVar, sdr sdrVar, int i) {
        this.b = m4uVar;
        this.c = sdrVar;
    }
}
