package defpackage;

import androidx.appcompat.view.ContextThemeWrapper;
import androidx.lifecycle.Lifecycle;
import ru.yandex.taxi.plus.purchase.PlusPurchaseView;
import ru.yandex.taxi.plus.purchase.d;
import ru.yandex.taxi.plus.repository.c;
import ru.yandex.taxi.plus.sdk.domain.a;

/* loaded from: classes6.dex */
public final class ujd0 {
    public final qid0 a;

    public ujd0(qid0 qid0Var) {
        this.a = qid0Var;
    }

    public final PlusPurchaseView a(ContextThemeWrapper contextThemeWrapper, Lifecycle lifecycle, String str, String str2, rid0 rid0Var, d59 d59Var) {
        qid0 qid0Var = this.a;
        oy80 oy80Var = new oy80(22, new bkd0(qid0Var.g, str), qid0Var.h);
        c cVar = qid0Var.b;
        a aVar = qid0Var.i;
        b1v0 b1v0Var = qid0Var.d;
        com.yandex.go.payments.plus.domain.c cVar2 = qid0Var.c;
        return new PlusPurchaseView(contextThemeWrapper, lifecycle, new d(d59Var, cVar, new ru.yandex.taxi.plus.purchase.domain.a(cVar, aVar, b1v0Var, cVar2, qid0Var.e, oy80Var), cVar2, qid0Var.a, oy80Var, rid0Var, str2), qid0Var.f);
    }
}
