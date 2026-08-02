package com.yandex.passport.internal.ui.sloth;

import com.yandex.passport.R;
import com.yandex.passport.internal.report.reporters.n1;
import com.yandex.passport.internal.report.reporters.o1;
import com.yandex.passport.sloth.b1;
import com.yandex.passport.sloth.m0;
import defpackage.o30;
import defpackage.p30;
import defpackage.rjc;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ StandaloneSlothActivity b;
    public final /* synthetic */ o1 c;

    public /* synthetic */ m(StandaloneSlothActivity standaloneSlothActivity, o1 o1Var, int i) {
        this.a = i;
        this.b = standaloneSlothActivity;
        this.c = o1Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        o1 o1Var = this.c;
        StandaloneSlothActivity standaloneSlothActivity = this.b;
        switch (i) {
            case 0:
                com.yandex.passport.sloth.h0 h0Var = (com.yandex.passport.sloth.h0) obj;
                if (Intrinsics.d(h0Var, com.yandex.passport.sloth.x.a)) {
                    standaloneSlothActivity.setResult(666);
                    standaloneSlothActivity.finish();
                } else {
                    o1Var.u(h0Var.toString(), n1.STANDALONE);
                }
                break;
            default:
                b1 b1Var = (b1) obj;
                if (Intrinsics.d(b1Var, com.yandex.passport.sloth.e.a)) {
                    standaloneSlothActivity.finish();
                } else if (b1Var instanceof m0) {
                    int i2 = StandaloneSlothActivity.e;
                    com.yandex.passport.internal.ui.a.r(standaloneSlothActivity, com.yandex.plus.core.network.api.utils.a.F(com.yandex.plus.core.network.api.utils.a.I((m0) b1Var)));
                } else if (Intrinsics.d(b1Var, com.yandex.passport.sloth.c.a)) {
                    o30 o30Var = new o30(standaloneSlothActivity);
                    o30Var.b(R.string.passport_fatal_error_dialog_text);
                    o30Var.a(R.string.passport_error_unknown);
                    o30Var.a.m = false;
                    o30Var.setPositiveButton(R.string.passport_fatal_error_dialog_button, new o(0, standaloneSlothActivity));
                    p30 create = o30Var.create();
                    create.getClass();
                    create.show();
                } else if (b1Var instanceof com.yandex.passport.sloth.m) {
                    int i3 = StandaloneSlothActivity.e;
                    com.yandex.passport.api.exception.n nVar = com.yandex.passport.api.exception.o.Companion;
                    List list = ((com.yandex.passport.sloth.m) b1Var).a;
                    nVar.getClass();
                    com.yandex.passport.internal.ui.a.r(standaloneSlothActivity, com.yandex.plus.core.network.api.utils.a.F(new com.yandex.passport.api.r(com.yandex.passport.api.exception.n.a(list))));
                } else {
                    o1Var.u(com.yandex.passport.sloth.g.a(b1Var), n1.STANDALONE);
                }
                break;
        }
        return Unit.a;
    }
}
