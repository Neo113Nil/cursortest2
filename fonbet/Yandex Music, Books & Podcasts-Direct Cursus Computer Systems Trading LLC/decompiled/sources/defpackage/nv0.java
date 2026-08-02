package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class nv0 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ pv0 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ rkd d;

    public /* synthetic */ nv0(pv0 pv0Var, Context context, rkd rkdVar) {
        this.b = pv0Var;
        this.c = context;
        this.d = rkdVar;
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
                    this.b.b(this.c, this.d, oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                num.getClass();
                this.b.b(this.c, this.d, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ nv0(pv0 pv0Var, Context context, rkd rkdVar, int i) {
        this.b = pv0Var;
        this.c = context;
        this.d = rkdVar;
    }
}
