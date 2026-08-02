package com.yandex.passport.internal.ui.sloth.authsdk;

import com.yandex.passport.R;
import com.yandex.passport.internal.report.reporters.n1;
import com.yandex.passport.internal.report.reporters.o1;
import com.yandex.passport.internal.ui.sloth.webcard.p0;
import com.yandex.passport.sloth.b1;
import com.yandex.passport.sloth.data.o0;
import defpackage.o30;
import defpackage.p30;
import defpackage.rjc;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ AuthSdkSlothActivity b;
    public final /* synthetic */ o1 c;

    public /* synthetic */ i(AuthSdkSlothActivity authSdkSlothActivity, o1 o1Var, int i) {
        this.a = i;
        this.b = authSdkSlothActivity;
        this.c = o1Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        o1 o1Var = this.c;
        AuthSdkSlothActivity authSdkSlothActivity = this.b;
        switch (i) {
            case 0:
                com.yandex.passport.sloth.h0 h0Var = (com.yandex.passport.sloth.h0) obj;
                if (Intrinsics.d(h0Var, com.yandex.passport.sloth.x.a)) {
                    l lVar = authSdkSlothActivity.b;
                    if (lVar == null) {
                        Intrinsics.j("component");
                        throw null;
                    }
                    o0 o0Var = lVar.getParams().a;
                    o0Var.getClass();
                    com.yandex.passport.internal.ui.a.r(authSdkSlothActivity, com.yandex.plus.core.network.api.utils.a.H(new a(((com.yandex.passport.sloth.data.y) o0Var).f)));
                } else if (h0Var instanceof com.yandex.passport.sloth.c0) {
                    l lVar2 = authSdkSlothActivity.b;
                    if (lVar2 == null) {
                        Intrinsics.j("component");
                        throw null;
                    }
                    o0 o0Var2 = lVar2.getParams().a;
                    o0Var2.getClass();
                    com.yandex.passport.internal.ui.a.r(authSdkSlothActivity, com.yandex.plus.core.network.api.utils.a.H(new e(((com.yandex.passport.sloth.data.y) o0Var2).f)));
                } else {
                    o1Var.u(h0Var.toString(), n1.AUTH_SDK);
                }
                return Unit.a;
            default:
                b1 b1Var = (b1) obj;
                if (Intrinsics.d(b1Var, com.yandex.passport.sloth.e.a)) {
                    com.yandex.passport.internal.ui.a.r(authSdkSlothActivity, com.yandex.plus.core.network.api.utils.a.H(b.a));
                } else if (b1Var instanceof com.yandex.passport.sloth.d) {
                    com.yandex.passport.sloth.d dVar = (com.yandex.passport.sloth.d) b1Var;
                    com.yandex.passport.internal.ui.a.r(authSdkSlothActivity, com.yandex.plus.core.network.api.utils.a.H(new f(dVar.c, dVar.a, dVar.b)));
                } else if (Intrinsics.d(b1Var, com.yandex.passport.sloth.c.a)) {
                    int i2 = AuthSdkSlothActivity.e;
                    o30 o30Var = new o30(authSdkSlothActivity);
                    o30Var.b(R.string.passport_fatal_error_dialog_text);
                    o30Var.a(R.string.passport_error_unknown);
                    o30Var.a.m = false;
                    o30Var.setPositiveButton(R.string.passport_fatal_error_dialog_button, new com.yandex.passport.internal.ui.sloth.o(2, authSdkSlothActivity));
                    p30 create = o30Var.create();
                    create.getClass();
                    create.show();
                } else if (b1Var instanceof com.yandex.passport.sloth.m) {
                    int i3 = AuthSdkSlothActivity.e;
                    com.yandex.passport.api.exception.n nVar = com.yandex.passport.api.exception.o.Companion;
                    List list = ((com.yandex.passport.sloth.m) b1Var).a;
                    nVar.getClass();
                    com.yandex.passport.internal.ui.a.r(authSdkSlothActivity, com.yandex.plus.core.locale.b.w(new p0(com.yandex.passport.api.exception.n.a(list))));
                } else {
                    o1Var.u(com.yandex.passport.sloth.g.a(b1Var), n1.AUTH_SDK);
                }
                return Unit.a;
        }
    }
}
