package defpackage;

import android.content.Context;
import com.yandex.passport.sloth.ui.dependencies.m;

/* loaded from: classes4.dex */
public final class tf4 extends brs {
    public final /* synthetic */ int A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tf4(mqs mqsVar, gj gjVar, zus zusVar, m mVar, Context context, cus cusVar, nnk nnkVar, muo muoVar, ovs ovsVar, e6v e6vVar, String str, kxi kxiVar, jtc jtcVar, int i) {
        super(mqsVar, gjVar, zusVar, mVar, context, cusVar, nnkVar, muoVar, ovsVar, e6vVar, str, kxiVar, jtcVar);
        this.A = i;
    }

    @Override // defpackage.brs
    public pjc d(mqs mqsVar) {
        switch (this.A) {
            case 0:
                mqsVar.getClass();
                return new fs(15, Boolean.FALSE);
            case 1:
                mqsVar.getClass();
                return new fs(15, Boolean.FALSE);
            default:
                return super.d(mqsVar);
        }
    }

    @Override // defpackage.brs
    public pjc e(mqs mqsVar) {
        switch (this.A) {
            case 1:
                mqsVar.getClass();
                return new fs(15, Boolean.FALSE);
            default:
                return super.e(mqsVar);
        }
    }

    @Override // defpackage.brs
    public pjc f(mqs mqsVar, zus zusVar) {
        switch (this.A) {
            case 1:
                mqsVar.getClass();
                zusVar.getClass();
                return new eno(new af(new iik(13, this, zusVar), null, 0));
            default:
                return super.f(mqsVar, zusVar);
        }
    }

    @Override // defpackage.brs
    public xe o(mqs mqsVar, zus zusVar) {
        switch (this.A) {
            case 1:
                mqsVar.getClass();
                zusVar.getClass();
                return new ax7(new cte(13, this, mqsVar, zusVar));
            default:
                return super.o(mqsVar, zusVar);
        }
    }

    @Override // defpackage.brs
    public void q(mqs mqsVar) {
        switch (this.A) {
            case 2:
                mqsVar.getClass();
                super.q(mqsVar);
                l18 l18Var = l18.b;
                bdt I = hag.I(f1p.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                ((f1p) qdcVar.C(I)).g = t0p.c;
                bdt I2 = hag.I(f1p.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                ((f1p) qdcVar2.C(I2)).a();
                break;
            default:
                super.q(mqsVar);
                break;
        }
    }
}
