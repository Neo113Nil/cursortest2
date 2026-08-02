package defpackage;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.state.h;
import kotlin.Result;

/* loaded from: classes14.dex */
public final class vd00 extends ad5 {
    public final v1y0 A;
    public final a3y0 B;
    public final h x;
    public final pj0 y;
    public final p4j z;

    public vd00(h hVar, pj0 pj0Var, p4j p4jVar, v1y0 v1y0Var) {
        super(ud00.class);
        this.x = hVar;
        this.y = pj0Var;
        this.z = p4jVar;
        this.A = v1y0Var;
        this.B = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "MakeAnotherOrderButtonPresenter");
    }

    public final void Kg() {
        Object failure;
        try {
            failure = this.x.b();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (!(failure instanceof Result.Failure)) {
            Lg((wd00) failure);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            a3y0.m(this.B, "makeAnotherOrder", a, null, 4);
        }
    }

    public final void Lg(wd00 wd00Var) {
        boolean z = wd00Var.a;
        String str = wd00Var.d;
        if (z) {
            this.z.b("AddTaxi");
        }
        ((ud00) Dg()).setMakeAnotherOrderVisible(wd00Var.a);
        boolean z2 = wd00Var.b;
        boolean z3 = wd00Var.c;
        if (!z2) {
            if (z3) {
                ((ud00) Dg()).showMultiorderTooltipWithoutDismissDelay(str);
            }
        } else if (z3) {
            ((ud00) Dg()).showMultiorderTooltip(str);
        } else {
            this.y.a();
            this.A.a();
        }
    }
}
