package ru.yandex.taxi.surge.dialog.price_complain;

import defpackage.b57;
import defpackage.cms;
import defpackage.fpq0;
import defpackage.gow0;
import defpackage.gpq0;
import defpackage.how0;
import defpackage.iow0;
import defpackage.jl40;
import defpackage.jms;
import defpackage.jow0;
import defpackage.kow0;
import defpackage.l7s0;
import defpackage.low0;
import defpackage.qu;
import defpackage.rqw0;
import defpackage.tje;
import defpackage.w511;
import defpackage.wuw0;
import defpackage.xcv0;
import defpackage.yuw0;
import defpackage.zy6;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements b57, jms {
    public final /* synthetic */ wuw0 a;

    public a(wuw0 wuw0Var) {
        this.a = wuw0Var;
    }

    @Override // defpackage.b57
    public final void a(zy6 zy6Var) {
        low0 low0Var = (low0) zy6Var;
        boolean z = low0Var instanceof gow0;
        wuw0 wuw0Var = this.a;
        if (z) {
            l7s0 l7s0Var = wuw0Var.z;
            ((rqw0) ((yuw0) l7s0Var.a).K).handle(((gow0) low0Var).b);
            return;
        }
        wuw0Var.getClass();
        if (low0Var instanceof jow0) {
            tje.N(wuw0Var.Jg(), null, null, new SurgePriceComplainPresenter$sendPriceFeedback$1(wuw0Var, new fpq0(((jow0) low0Var).b), null), 3);
            return;
        }
        if (jl40.l(low0Var, how0.b)) {
            yuw0 yuw0Var = (yuw0) wuw0Var.z.a;
            ((xcv0) yuw0Var.L).l("back_button");
            yuw0Var.r(new qu(9));
        } else if (jl40.l(low0Var, kow0.b)) {
            tje.N(wuw0Var.Jg(), null, null, new SurgePriceComplainPresenter$sendPriceFeedback$1(wuw0Var, gpq0.b, null), 3);
        } else {
            if (low0Var instanceof iow0) {
                return;
            }
            w511.b();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof b57) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, wuw0.class, "actionButtonClick", "actionButtonClick(Lru/yandex/taxi/surge/models/domain/SurgeButtonAction;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
