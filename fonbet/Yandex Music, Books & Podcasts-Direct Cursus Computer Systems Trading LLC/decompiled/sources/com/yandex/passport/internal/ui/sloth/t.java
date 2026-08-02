package com.yandex.passport.internal.ui.sloth;

import com.yandex.passport.R;
import com.yandex.passport.internal.report.reporters.n1;
import com.yandex.passport.internal.report.reporters.o1;
import com.yandex.passport.sloth.b1;
import com.yandex.passport.sloth.m0;
import defpackage.aur;
import defpackage.nm6;
import defpackage.o30;
import defpackage.p30;
import defpackage.qgg;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ StandaloneSlothComposeActivity k;
    public final /* synthetic */ o1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(StandaloneSlothComposeActivity standaloneSlothComposeActivity, o1 o1Var, Continuation continuation) {
        super(2, continuation);
        this.k = standaloneSlothComposeActivity;
        this.l = o1Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        t tVar = new t(this.k, this.l, continuation);
        tVar.j = obj;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((b1) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        b1 b1Var = (b1) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        boolean z = b1Var instanceof com.yandex.passport.sloth.e;
        StandaloneSlothComposeActivity standaloneSlothComposeActivity = this.k;
        if (z) {
            standaloneSlothComposeActivity.finish();
        } else if (b1Var instanceof m0) {
            int i = StandaloneSlothComposeActivity.c;
            com.yandex.passport.internal.ui.a.r(standaloneSlothComposeActivity, com.yandex.plus.core.network.api.utils.a.F(com.yandex.plus.core.network.api.utils.a.I((m0) b1Var)));
        } else if (Intrinsics.d(b1Var, com.yandex.passport.sloth.c.a)) {
            o30 o30Var = new o30(standaloneSlothComposeActivity);
            o30Var.b(R.string.passport_fatal_error_dialog_text);
            o30Var.a(R.string.passport_error_unknown);
            o30Var.a.m = false;
            o30Var.setPositiveButton(R.string.passport_fatal_error_dialog_button, new o(1, standaloneSlothComposeActivity));
            p30 create = o30Var.create();
            create.getClass();
            create.show();
        } else if (b1Var instanceof com.yandex.passport.sloth.m) {
            int i2 = StandaloneSlothComposeActivity.c;
            com.yandex.passport.api.exception.n nVar = com.yandex.passport.api.exception.o.Companion;
            List list = ((com.yandex.passport.sloth.m) b1Var).a;
            nVar.getClass();
            com.yandex.passport.internal.ui.a.r(standaloneSlothComposeActivity, com.yandex.plus.core.network.api.utils.a.F(new com.yandex.passport.api.r(com.yandex.passport.api.exception.n.a(list))));
        } else {
            this.l.u(com.yandex.passport.sloth.g.a(b1Var), n1.STANDALONE);
        }
        return Unit.a;
    }
}
